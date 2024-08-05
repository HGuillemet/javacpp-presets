// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// A newtype wrapper around SafePyObject for type safety when a python object
// represents a specific type. Note that `T` is only used as a tag and isn't
// actually used for any true purpose.
@Name("c10::SafePyObjectT<c10::impl::TorchDispatchModeKey>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PyObject_TorchDispatchMode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyObject_TorchDispatchMode(Pointer p) { super(p); }

  public PyObject_TorchDispatchMode(@Cast("PyObject*") Pointer data, PyInterpreter pyinterpreter) { super((Pointer)null); allocate(data, pyinterpreter); }
  private native void allocate(@Cast("PyObject*") Pointer data, PyInterpreter pyinterpreter);
  
  
  
}
