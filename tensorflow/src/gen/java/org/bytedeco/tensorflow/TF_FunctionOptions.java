// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Function definition options. TODO(iga): Define and implement
@Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_FunctionOptions extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TF_FunctionOptions() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_FunctionOptions(Pointer p) { super(p); }
}
