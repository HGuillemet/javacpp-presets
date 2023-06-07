// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/** \} */ // @defgroup nvmlGpmEnums


/***************************************************************************************************/
/** \defgroup nvmlGpmStructs GPM Structs
 *  \{
 */
/***************************************************************************************************/

/**
 * Handle to an allocated GPM sample allocated with nvmlGpmSampleAlloc(). Free this with nvmlGpmSampleFree().
 */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlGpmSample_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nvmlGpmSample_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlGpmSample_st(Pointer p) { super(p); }
}
