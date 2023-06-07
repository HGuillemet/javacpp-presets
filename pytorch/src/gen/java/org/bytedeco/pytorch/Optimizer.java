// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Optimizer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Optimizer(Pointer p) { super(p); }

  // The copy constructor is deleted, because the user should use the
  // `state_dict` / `load_state_dict` API to copy an optimizer instead.
  

  /** Constructs the {@code Optimizer} from a vector of parameters. */

  /** Adds the given param_group to the optimizer's param_group list. */
  public native void add_param_group(@Const @ByRef OptimizerParamGroup param_group);
  /** A loss function closure, which is expected to return the loss value. */
  public native @ByVal Tensor step(@ByVal(nullValue = "torch::optim::Optimizer::LossClosure(nullptr)") LossClosure closure);
  public native @ByVal Tensor step();

  /** Adds the given vector of parameters to the optimizer's parameter list. */
  public native void add_parameters(@Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector parameters);

  /** Zeros out the gradients of all parameters. */
  public native void zero_grad(@Cast("bool") boolean set_to_none/*=true*/);
  public native void zero_grad();

  /** Provides a const reference to the parameters in the first param_group this
   *  optimizer holds. */

  /** Provides a reference to the parameters in the first param_group this
   *  optimizer holds. */
  public native @ByRef @NoException(true) TensorVector parameters();

  /** Returns the number of parameters referenced by the optimizer. */
  public native @Cast("size_t") @NoException(true) long size();

  public native @ByRef @NoException(true) OptimizerOptions defaults();

  /** Provides a reference to the param_groups this optimizer holds. */
  public native @ByRef @NoException(true) OptimizerParamGroupVector param_groups();

  /** Provides a const reference to the param_groups this optimizer holds. */

  /** Provides a reference to the state this optimizer holds */

  /** Provides a const reference to the state this optimizer holds */

  /** Serializes the optimizer state into the given {@code archive}. */
  public native void save(@ByRef OutputArchive archive);

  /** Deserializes the optimizer state from the given {@code archive}. */
  public native void load(@ByRef InputArchive archive);
}
