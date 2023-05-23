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


@Namespace("at::native") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FilterDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FilterDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FilterDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FilterDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FilterDescriptor position(long position) {
        return (FilterDescriptor)super.position(position);
    }
    @Override public FilterDescriptor getPointer(long i) {
        return new FilterDescriptor((Pointer)this).offsetAddress(i);
    }

  public native void set(@Const @ByRef Tensor t, @Cast("int64_t") long pad/*=0*/);
  public native void set(@Const @ByRef Tensor t);

  public native void set(@Const @ByRef Tensor t, @Const @ByVal MemoryFormat memory_format, @Cast("int64_t") long pad/*=0*/);
  public native void set(@Const @ByRef Tensor t, @Const @ByVal MemoryFormat memory_format);

  public native void print();
}
