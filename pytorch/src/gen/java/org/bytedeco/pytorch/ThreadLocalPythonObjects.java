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


@Namespace("at::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ThreadLocalPythonObjects extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ThreadLocalPythonObjects() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ThreadLocalPythonObjects(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ThreadLocalPythonObjects(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ThreadLocalPythonObjects position(long position) {
        return (ThreadLocalPythonObjects)super.position(position);
    }
    @Override public ThreadLocalPythonObjects getPointer(long i) {
        return new ThreadLocalPythonObjects((Pointer)this).offsetAddress(i);
    }

  public static native void set(@StdString BytePointer key, @SharedPtr SafePyObject value);
  public static native void set(@StdString String key, @SharedPtr SafePyObject value);
  public static native @SharedPtr SafePyObject get(@StdString BytePointer key);
  public static native @SharedPtr SafePyObject get(@StdString String key);
  public static native @Cast("bool") boolean contains(@StdString BytePointer key);
  public static native @Cast("bool") boolean contains(@StdString String key);

  public static native @Const @ByRef ThreadLocalPythonObjects get_state();
  public static native void set_state(@ByVal ThreadLocalPythonObjects state);
}
