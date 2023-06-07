// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.hyperscan;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hyperscan.global.hyperscan.*;


/**
 * The type of the callback function that will be used by Hyperscan to free
 * memory regions previously allocated using the \ref hs_alloc_t function.
 *
 * @param ptr
 *      The region of memory to be freed.
 */
@Properties(inherit = org.bytedeco.hyperscan.presets.hyperscan.class)
public class hs_free_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    hs_free_t(Pointer p) { super(p); }
    protected hs_free_t() { allocate(); }
    private native void allocate();
    public native void call(Pointer ptr);
}
