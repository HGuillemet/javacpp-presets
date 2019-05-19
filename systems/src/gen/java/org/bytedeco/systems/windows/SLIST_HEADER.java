// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


// #else

// #endif // _WIN64

// #if defined(_AMD64_)

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SLIST_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SLIST_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SLIST_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SLIST_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SLIST_HEADER position(long position) {
        return (SLIST_HEADER)super.position(position);
    }
  // original struct
        public native @Cast("ULONGLONG") long Alignment(); public native SLIST_HEADER Alignment(long setter);
        public native @Cast("ULONGLONG") long Region(); public native SLIST_HEADER Region(long setter);   // x64 16-byte header
        @Name("HeaderX64.Depth") public native @Cast("ULONGLONG") @NoOffset long HeaderX64_Depth(); public native SLIST_HEADER HeaderX64_Depth(long setter);
        @Name("HeaderX64.Sequence") public native @Cast("ULONGLONG") @NoOffset long HeaderX64_Sequence(); public native SLIST_HEADER HeaderX64_Sequence(long setter);
        @Name("HeaderX64.Reserved") public native @Cast("ULONGLONG") @NoOffset long HeaderX64_Reserved(); public native SLIST_HEADER HeaderX64_Reserved(long setter);
        @Name("HeaderX64.NextEntry") public native @Cast("ULONGLONG") @NoOffset long HeaderX64_NextEntry(); public native SLIST_HEADER HeaderX64_NextEntry(long setter); // last 4 bits are always 0's
}
