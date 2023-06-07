// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Forward declarations for ai.onnx version 17
@Namespace("onnx") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class LayerNormalization_Onnx_ver17 extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LayerNormalization_Onnx_ver17() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LayerNormalization_Onnx_ver17(Pointer p) { super(p); }
}
