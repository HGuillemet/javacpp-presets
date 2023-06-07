// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class Find_custom_op_v1_Pointer_BytePointer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Find_custom_op_v1_Pointer_BytePointer_int(Pointer p) { super(p); }
    protected Find_custom_op_v1_Pointer_BytePointer_int() { allocate(); }
    private native void allocate();
    public native @Const TfLiteRegistration_V1 call(Pointer user_data,
                                                      @Cast("const char*") BytePointer op,
                                                      int version);
}
