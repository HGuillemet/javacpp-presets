// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/** \cond API PFN */
/*
 *  Defines API function pointers
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class PNVENCOPENENCODESESSION extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PNVENCOPENENCODESESSION(Pointer p) { super(p); }
    protected PNVENCOPENENCODESESSION() { allocate(); }
    private native void allocate();
    public native @Cast("NVENCSTATUS") int call(Pointer device, @Cast("uint32_t") int deviceType, @Cast("void**") PointerPointer encoder);
}
