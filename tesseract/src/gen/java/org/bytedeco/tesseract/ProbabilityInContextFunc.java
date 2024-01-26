// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.leptonica.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Namespace("tesseract::Dict") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class ProbabilityInContextFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ProbabilityInContextFunc(Pointer p) { super(p); }
    public native double call(Dict o, @Cast("const char*") BytePointer arg0, @Cast("const char*") BytePointer arg1,
                                                  int arg2, @Cast("const char*") BytePointer arg3, int arg4);
}
