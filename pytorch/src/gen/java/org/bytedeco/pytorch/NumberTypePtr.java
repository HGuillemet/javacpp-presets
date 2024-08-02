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
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("c10::SingletonTypePtr<c10::NumberType>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NumberTypePtr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NumberTypePtr(Pointer p) { super(p); }

  /* implicit */ public NumberTypePtr(NumberType p) { super((Pointer)null); allocate(p); }
private native void allocate(NumberType p);

  // We need this to satisfy Pybind11, but it shouldn't be hit.

  public native NumberType get();

  public native @Name("operator ->") NumberType access();

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();
}
