// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


// Like SafePyObject, but non-owning.  Good for references to global PyObjects
// that will be leaked on interpreter exit.  You get a copy constructor/assign
// this way.
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SafePyHandle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SafePyHandle(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SafePyHandle(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SafePyHandle position(long position) {
        return (SafePyHandle)super.position(position);
    }
    @Override public SafePyHandle getPointer(long i) {
        return new SafePyHandle((Pointer)this).offsetAddress(i);
    }

  public SafePyHandle() { super((Pointer)null); allocate(); }
  private native void allocate();
  public SafePyHandle(@Cast("PyObject*") Pointer data, PyInterpreter pyinterpreter) { super((Pointer)null); allocate(data, pyinterpreter); }
  private native void allocate(@Cast("PyObject*") Pointer data, PyInterpreter pyinterpreter);

  public native @ByRef PyInterpreter pyinterpreter();
  public native @Cast("PyObject*") Pointer ptr(@Const PyInterpreter arg0);
  public native void reset();
  public native @Cast("bool") @Name("operator bool") boolean asBoolean();
}
