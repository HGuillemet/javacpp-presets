// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cufftw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import static org.bytedeco.cuda.global.cufft.*;

import static org.bytedeco.cuda.global.cufftw.*;

// #endif

@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.cuda.presets.cufftw.class)
public class fftw_plan extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public fftw_plan() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_plan(Pointer p) { super(p); }
}
