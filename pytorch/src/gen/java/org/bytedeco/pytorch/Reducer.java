// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10d") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Reducer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Reducer(Pointer p) { super(p); }

  // The constructor takes a list of variables (i.e. parameters) for this
  // process's single model replica (as DDP assumes single-process
  // single-device). The bucket assignment for this reducer, `bucket_indices`,
  // is specified as a list of buckets, each of which is specified as a list of
  // indices into the bucket's `variables` list.
  public Reducer(
        @ByVal TensorVector params,
        @ByVal SizeTVectorVector bucket_indices,
        @ByVal @Cast("std::vector<size_t>*") SizeTVector per_bucket_size_limits,
        @IntrusivePtr("c10d::ProcessGroup") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroup>&"}) ProcessGroup process_group,
        @ByVal BoolVector expect_sparse_gradients,
        @Cast("int64_t") long bucket_bytes_cap,
        @Cast("bool") boolean find_unused_parameters,
        @Cast("bool") boolean gradient_as_bucket_view,
        @ByVal SizeTStringMap param_names,
        @Cast("int64_t") long first_bucket_bytes_cap) { super((Pointer)null); allocate(params, bucket_indices, per_bucket_size_limits, process_group, expect_sparse_gradients, bucket_bytes_cap, find_unused_parameters, gradient_as_bucket_view, param_names, first_bucket_bytes_cap); }
  private native void allocate(
        @ByVal TensorVector params,
        @ByVal SizeTVectorVector bucket_indices,
        @ByVal @Cast("std::vector<size_t>*") SizeTVector per_bucket_size_limits,
        @IntrusivePtr("c10d::ProcessGroup") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroup>&"}) ProcessGroup process_group,
        @ByVal BoolVector expect_sparse_gradients,
        @Cast("int64_t") long bucket_bytes_cap,
        @Cast("bool") boolean find_unused_parameters,
        @Cast("bool") boolean gradient_as_bucket_view,
        @ByVal SizeTStringMap param_names,
        @Cast("int64_t") long first_bucket_bytes_cap);

  // To (re-)initialize bucket assignment, pass a list of buckets, each of
  // which is specified by a list of indices in the bucket's `variables` list.
  // This function performs validation that the variables within a bucket
  // all live on the same device and have the same dimensionality.
  public native void initialize_buckets(@ByVal SizeTVectorVector bucket_indices);

  public native void autograd_hook(@Cast("size_t") long index);

  // This function is called when the forward function has produced an output,
  // and the user wishes to reduce gradients in the backwards pass.
  // If they don't, and wish to accumulate gradients before reducing them,
  // a call to this function can simply be omitted.
  public native void prepare_for_backward(@Const @ByRef TensorVector outputs);

  // Called at the beginning of forward() inside DistributedDataParallel,
  // right now it captures the starting time of forward in each iteration.
  public native void prepare_for_forward();

  // Returns the relative time in nanoseconds when gradients were ready,
  // with respect to the time `prepare_for_backward` was called. The
  // vector is for parameters for a single model replica.
  public native @ByVal @Cast("std::vector<int64_t>*") LongVector get_backward_stats();

  // Registers a hook to the reducer. The hook is `CommHookInterface`
  // type to allow both Python and CPP hooks. This function can only
  // be called once before calling backward.
  // Cannot combine with the call of `register_builtin_comm_hook`.
  public native void register_comm_hook(@UniquePtr CommHookInterface iface);

  // Registers a built-in C++ comm hook to the reducer. This function can only
  // be called once before calling backward.
  // Cannot combine with the call of `register_comm_hook`.
  public native void register_builtin_comm_hook(BuiltinCommHookType comm_hook_type);
  public native void register_builtin_comm_hook(@Cast("c10d::BuiltinCommHookType") int comm_hook_type);

  // Informs reducer that optimizer is running in backward, so gradients
  // don't need to be copied from buckets as the optimizer would've already
  // been applied.
  public native void set_optimizer_in_backward();

  // Runs allreduce or installed communication hook given GradBucket instance.
  public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future run_comm_hook(
        @ByRef GradBucket grad_bucket);

  // Runs default allreduce hook.
  public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future run_allreduce_hook(
        @ByRef GradBucket grad_bucket);

  // Returns gradient buckets in sequential order of buckets_. This is the order
  // in which buckets are reduced across processes. If return_zero_tensors=true,
  // will return zero tensors of the same shape instead of the true tensors.
  public native @StdVector GradBucket get_grad_buckets(
        @Cast("bool") boolean return_zero_tensors/*=true*/);
  public native @StdVector GradBucket get_grad_buckets();

  // Rebuild buckets based on rebuilt_params_ and rebuilt_param_indices_
  // according to when tensors received grads in the backward pass.
  // TODO this function makes broadcast communication call and
  // could be overlapped with next forward() call, thus
  // it could be async. Will make it async when rebuilding buckets for
  // find_unused_parameters = true case, as we could rebuild buckets more than
  // once for find_unused_parameters = true case, where subgraphs are trained
  // and parameter indices order may change more frequently.
  // For find_unused_parameters = false case, buckets are only rebuilt once,
  // the performance cost is negligible. Returns true if the buckets were
  // rebuilt.
  public native @Cast("bool") boolean rebuild_buckets();

  public native void setSparseMetadata(@ByRef StringTensorMap metadata);

  // Install futures that should be awaited at end of backwards. Currently these
  // are only used by user-defined custom buffer reduction hooks, but can be
  // generalized to any user-originating futures that need to be awaited.
  public native void install_futures(@ByVal FutureList futs);

  // Returns true if we should rebuild buckets, else false. We only rebuild
  // buckets once after the first iteration and never rebuild them if
  // find_unused_parameters_.
  public native @Cast("bool") boolean should_rebuild_buckets();

  // Pushes all parameters to be rebuilt.
  public native void push_rebuilt_params_for_all_indices();

  // Creates and sets ForwardPassWorkHandle given a Work and the
  // corresponding tensor being reduced.
  public native void set_forward_pass_work_handle(
        @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work forwardPassWorkHandle,
        @Cast("bool") boolean useStaticWorldSize);

  // Retrieve on-device tensors used to track locally unused parameters. It is
  // a tensor where index i = 1 if the Variable with that index has been used.
  public native @ByVal Tensor get_local_used_map_on_device();

  // An function for users to set sample_rate of collecting
  // runtime stats. The time stats will be recorded for the
  // first 10 iterations, after 10 iterations time stats will be
  // recorded once every "sample_rate" training iterations.
  public native void set_ddp_runtime_logging_sample_rate(int sample_rate);

  // Specify the training graph is static.
  public native void set_static_graph();

  // Delay all reduce to be after all gradients' calculation is complete.
  public native void delay_all_reduce();

  public native void set_mixed_precision_param_dtype(ScalarType dtype);

  // Weak reference to associated DDP logger. The reference is weak to avoid
  // refcycle between reducer and logger.
  public native void set_logger(@WeakPtr("c10d::Logger") @ByVal Logger logger);

  // When graph is not explicitly set by user as static and has unused
  // parameters, this will return whether the graph has been static until the
  // current iteration, which means unused params set has not changed.
  public native @Cast("bool") boolean ddp_graph_static();

  // Removes autograd hooks registered by the Reducer on the model parameters.
  public native void remove_autograd_hooks();

  // Checks whether or not the reducer has finalized the current backward
  // iteration.
  public native void check_finalized();

  // Updates the underlying process group used by DDP with the new process
  // group.
  public native void update_process_group(
        @IntrusivePtr("c10d::ProcessGroup") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroup>&"}) ProcessGroup new_process_group);

  // Resets reducer state.
  public native void reset_state();
}
