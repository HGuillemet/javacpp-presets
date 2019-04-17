// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("tensorflow::gtl::InlinedVector<tensorflow::DeviceType,4>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeviceTypeVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceTypeVector(Pointer p) { super(p); }
    public DeviceTypeVector()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef DeviceTypeVector put(@ByRef DeviceTypeVector x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef DeviceType get(@Cast("size_t") long i);
    public native DeviceTypeVector put(@Cast("size_t") long i, DeviceType value);
}

