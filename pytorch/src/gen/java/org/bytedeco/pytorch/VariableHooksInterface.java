// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
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
 // namespace torch::autograd

@Namespace("at::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class VariableHooksInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VariableHooksInterface(Pointer p) { super(p); }

  public native @ByVal TensorBase tensor_data(@Const @ByRef TensorBase arg0);
  public native @ByVal TensorBase variable_data(@Const @ByRef TensorBase arg0);
  public native @SharedPtr Node grad_fn(@Const @ByRef TensorBase arg0);
  
  public native void remove_hook(@Const @ByRef TensorBase arg0, @Cast("unsigned") int pos);
  public native @Cast("bool") boolean is_view(@Const @ByRef TensorBase arg0);
  public native @Const @ByRef TensorBase base(@Const @ByRef TensorBase arg0);
  public native @StdString BytePointer name(@Const @ByRef TensorBase arg0);
  public native @Cast("bool") boolean is_leaf(@Const @ByRef TensorBase arg0);
  public native @Cast("int64_t") long output_nr(@Const @ByRef TensorBase arg0);
  public native void set_data(@Const @ByRef TensorBase arg0, @Const @ByRef TensorBase arg1);
  public native @ByVal TensorBase data(@Const @ByRef TensorBase arg0);
  public native @Cast("int64_t") long _version(@Const @ByRef TensorBase arg0);
  public native void retain_grad(@Const @ByRef TensorBase arg0);
  public native @Cast("bool") boolean retains_grad(@Const @ByRef TensorBase arg0);
  public native void _backward(@Const @ByRef Tensor arg0, @ByVal TensorArrayRef arg1, @Const @ByRef TensorOptional arg2, @ByVal BoolOptional arg3, @Cast("bool") boolean arg4);
  public native void _backward(@Const @ByRef Tensor arg0, @ByVal TensorVector arg1, @Const @ByRef TensorOptional arg2, @ByVal BoolOptional arg3, @Cast("bool") boolean arg4);
  public native void requires_grad_(@Const @ByRef TensorBase arg0, @Cast("bool") boolean arg1);
  public native void basic_autograd_not_implemented_fallback(@Const @ByRef OperatorHandle op, @ByVal DispatchKeySet dispatch_keys, IValueVector stack);
}
