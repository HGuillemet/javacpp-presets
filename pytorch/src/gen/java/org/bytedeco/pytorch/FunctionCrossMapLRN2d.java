// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** To use custom autograd operations, implement a Function subclass with
 *  static forward and backward functions:
 * 
 *  {@code forward} can take as many arguments as you want and should return either a
 *  variable list or a Variable. Use of any direct Variable arguments will be
 *  registered in the graph but no vectors/sets or any other data structures
 *  will be traversed. You can use c10::optional<Tensor> as one of the arguments
 *  and it will be registered as a variable in the graph if the argument has a
 *  value. It should take a pointer to {@code torch::autograd::AutogradContext} as the
 *  first argument. Variables can be saved in the {@code ctx} using
 *  {@code ctx->save_for_backward}
 *  (see {@code torch::autograd::AutogradContext::save_for_backward}) and other data
 *  can be saved in the {@code ctx->saved_data} map
 *  (see {@code torch::autograd::AutogradContext::saved_data})
 *  in the form of {@code <std::string, at::IValue>} pairs.
 * 
 *  {@code backward} should take a pointer to {@code torch::autograd::AutogradContext}
 *  and a variable list containing as many Variables as there were outputs from
 *  {@code forward} as arguments. It should return as many Variables as there were
 *  inputs with each of them containing the gradient w.r.t. its corresponding
 *  input. Variables saved in {@code forward} can be accessed with
 *  {@code ctx->get_saved_variables} (see
 *  {@code torch::autograd::AutogradContext::get_saved_variables}) and other saved
 *  data can be accessed from {@code ctx->saved_data}.
 * 
 *  For example:
 *  <pre>{@code
 *  class MyFunction : public Function<MyFunction> {
 *    public:
 *    static variable_list forward(AutogradContext *ctx, int n, Variable var) {
 *       // Save data for backward in context
 *       ctx->saved_data["n"] = n;
 *       var.mul_(2);
 *       // Mark var as modified by inplace operation
 *       ctx->mark_dirty({var});
 *       return {var};
 *    }
 * 
 *    static variable_list backward(AutogradContext *ctx, variable_list
 *    grad_output) {
 *       // Use data saved in forward
 *       auto n = ctx->saved_data["n"].toInt();
 *       return {grad_output[0]*n};
 *    }
 *  };
 *  }</pre>
 * 
 *  To use {@code MyFunction}:
 *  <pre>{@code
 *  Variable x;
 *  auto y = MyFunction::apply(6, x);
 *  // Example backward call
 *  y[0].sum().backward();
 *  }</pre> */
@Name("torch::autograd::Function<torch::nn::CrossMapLRN2d>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FunctionCrossMapLRN2d extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FunctionCrossMapLRN2d() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FunctionCrossMapLRN2d(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionCrossMapLRN2d(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FunctionCrossMapLRN2d position(long position) {
        return (FunctionCrossMapLRN2d)super.position(position);
    }
    @Override public FunctionCrossMapLRN2d getPointer(long i) {
        return new FunctionCrossMapLRN2d((Pointer)this).offsetAddress(i);
    }

  // We need to use a different template parameter than T here because T will
  // inherit from Function, and when Function<T> is instantiated, T::forward
  // is not declared yet.
  // The enable_if check is to ensure that the user doesn't explicitly provide
  // the parameter X.
}
