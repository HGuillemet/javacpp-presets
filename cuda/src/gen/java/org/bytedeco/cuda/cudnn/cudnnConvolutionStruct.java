// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;

import static org.bytedeco.cuda.global.cudnn.*;

// #endif

@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cudnn.class)
public class cudnnConvolutionStruct extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public cudnnConvolutionStruct() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudnnConvolutionStruct(Pointer p) { super(p); }
}
