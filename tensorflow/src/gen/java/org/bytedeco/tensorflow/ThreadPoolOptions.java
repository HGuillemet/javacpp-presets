// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow::thread") @Opaque @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ThreadPoolOptions extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ThreadPoolOptions() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ThreadPoolOptions(Pointer p) { super(p); }
}
