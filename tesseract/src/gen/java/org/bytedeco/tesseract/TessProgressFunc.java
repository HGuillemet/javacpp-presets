// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.leptonica.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class TessProgressFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TessProgressFunc(Pointer p) { super(p); }
    protected TessProgressFunc() { allocate(); }
    private native void allocate();
    public native @Cast("bool") boolean call(ETEXT_DESC ths, int left, int right, int top,
                                 int bottom);
}
