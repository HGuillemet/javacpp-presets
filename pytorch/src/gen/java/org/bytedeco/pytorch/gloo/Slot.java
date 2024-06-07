// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.gloo;

import org.bytedeco.pytorch.chrono.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.gloo.*;


@Namespace("gloo") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.gloo.class)
public class Slot extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Slot(Pointer p) { super(p); }

  public static native @ByVal Slot build(@Cast("uint8_t") byte prefix, @Cast("uint32_t") int tag);

  public native @Cast("uint64_t") @Name("operator uint64_t") long asLong();

  public native @ByVal @Name("operator +") Slot add(@Cast("uint8_t") byte i);
}
