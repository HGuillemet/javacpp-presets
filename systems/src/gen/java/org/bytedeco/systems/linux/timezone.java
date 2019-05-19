// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;

// #endif


// #ifdef __USE_BSD
/* Structure crudely representing a timezone.
   This is obsolete and should never be used.  */
@Name("struct timezone") @Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class timezone extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public timezone() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public timezone(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public timezone(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public timezone position(long position) {
        return (timezone)super.position(position);
    }

    public native int tz_minuteswest(); public native timezone tz_minuteswest(int setter);		/* Minutes west of GMT.  */
    public native int tz_dsttime(); public native timezone tz_dsttime(int setter);		/* Nonzero if DST is ever in effect.  */
  }
