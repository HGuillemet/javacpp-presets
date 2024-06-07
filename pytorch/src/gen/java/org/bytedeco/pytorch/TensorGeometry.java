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


@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorGeometry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorGeometry(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorGeometry(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorGeometry position(long position) {
        return (TensorGeometry)super.position(position);
    }
    @Override public TensorGeometry getPointer(long i) {
        return new TensorGeometry((Pointer)this).offsetAddress(i);
    }

  public TensorGeometry() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorGeometry(@ByVal SymIntArrayRef sizes) { super((Pointer)null); allocate(sizes); }
  private native void allocate(@ByVal SymIntArrayRef sizes);

  public TensorGeometry(@Const @ByRef TensorBase t) { super((Pointer)null); allocate(t); }
  private native void allocate(@Const @ByRef TensorBase t);

  // true if the tensor is contiguous
  public native @Cast("bool") boolean is_contiguous();

  public native @Cast("int64_t") long dim();

  public native @Cast("int64_t") long size(@Cast("int64_t") long dim);
  public native @ByVal LongArrayRef sizes();
  public native @Cast("int64_t") long stride(@Cast("int64_t") long dim);
  public native @ByVal LongArrayRef strides();
  public native @Cast("int64_t") long storage_offset();
  public native @Cast("int64_t") long numel();

  public native @ByVal SymInt sym_size(@Cast("int64_t") long dim);
  public native @ByVal SymIntArrayRef sym_sizes();
  public native @ByVal SymInt sym_stride(@Cast("int64_t") long dim);
  public native @ByVal SymIntArrayRef sym_strides();
  public native @ByVal SymInt sym_storage_offset();
  public native @ByVal SymInt sym_numel();

  public native @ByVal TensorGeometry transpose(@Cast("int64_t") long dim0, @Cast("int64_t") long dim1);

  public native @ByRef SymIntVector mutable_sizes();
  public native @ByRef SymIntVector mutable_strides();
  public native @ByRef SymInt mutable_storage_offset();
  public native void recompute();
}
