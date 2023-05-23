// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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


// GraphExecutor creates specializations of Graphs for different
// dimensionalitities and types of inputs.

@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ArgumentInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ArgumentInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ArgumentInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArgumentInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ArgumentInfo position(long position) {
        return (ArgumentInfo)super.position(position);
    }
    @Override public ArgumentInfo getPointer(long i) {
        return new ArgumentInfo((Pointer)this).offsetAddress(i);
    }


  public native @Cast("bool") boolean defined();
  public native @ByVal Device device();
  // XXX: It is guaranteed that this will return false when called on non-tensor
  // arguments
  public native @Cast("bool") boolean requires_grad();
  public native int dim();
  public native ScalarType type();
  public native @ByVal Type.TypePtr toType();
  public native @ByVal @Name("operator c10::TypePtr") Type.TypePtr asTypePtr();
}
