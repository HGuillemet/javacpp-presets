// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Context to save information during {@code forward} that can be accessed in
 *  {@code backward} in custom autograd operations (see {@code torch::autograd::Function}
 *  for details). */
@Namespace("torch::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AutogradContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutogradContext(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AutogradContext(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AutogradContext position(long position) {
        return (AutogradContext)super.position(position);
    }
    @Override public AutogradContext getPointer(long i) {
        return new AutogradContext((Pointer)this).offsetAddress(i);
    }

  public AutogradContext() { super((Pointer)null); allocate(); }
  private native void allocate();
  
  

  /** Can be used to save non-variable data for {@code backward}. */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)

  /** Saves the list of variables for a future call to {@code backward}. This
   *  should be called at most once from inside of {@code forward}. */
  public native void save_for_backward(@ByVal TensorVector to_save);
  /** Marks variables in the list as modified in an in-place operation. This
   *  should be called at most once from inside of {@code forward} and all arguments
   *  should be inputs. */
  public native void mark_dirty(@Const @ByRef TensorVector inputs);
  /** Marks outputs in the list as not requiring gradients. This should be
   *  called at most once from inside of {@code forward} and all arguments should be
   *  outputs. */
  public native void mark_non_differentiable(@Const @ByRef TensorVector outputs);
  // Sets whether undefined output grad tensors should be expanded to tensors
  // full of zeros before calling backward function. Default value is true.
  public native void set_materialize_grads(@Cast("bool") boolean value);

  /** Get the list of variables that were saved in {@code forward} using
   *  {@code save_for_backward()}. Before returning them to the user, a check is made
   *  to ensure that they were not modified by any in-place operations. */
  public native @ByVal TensorVector get_saved_variables();
  public native @Const @ByRef TensorImplSet get_and_bump_dirty();
  public native @Const @ByRef TensorImplSet get_non_differentiable();

  /** Expose the Node's {@code task_should_compute_output} method to the cpp
   *  custom autograd Function as {@code needs_input_grad}. */
  public native @Cast("bool") boolean needs_input_grad(@Cast("size_t") long output_edge_index);
}
