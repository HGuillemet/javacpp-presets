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


@Namespace("torch::profiler::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FileLineFunc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FileLineFunc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FileLineFunc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileLineFunc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FileLineFunc position(long position) {
        return (FileLineFunc)super.position(position);
    }
    @Override public FileLineFunc getPointer(long i) {
        return new FileLineFunc((Pointer)this).offsetAddress(i);
    }

  public native @StdString BytePointer filename(); public native FileLineFunc filename(BytePointer setter);
  public native @Cast("size_t") long line(); public native FileLineFunc line(long setter);
  public native @StdString BytePointer funcname(); public native FileLineFunc funcname(BytePointer setter);
}
