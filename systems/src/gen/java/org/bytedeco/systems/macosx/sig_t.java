// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;
	/* [CX]	from message arrival on empty queue */

// #if !defined(_POSIX_C_SOURCE) || defined(_DARWIN_C_SOURCE)
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class sig_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    sig_t(Pointer p) { super(p); }
    protected sig_t() { allocate(); }
    private native void allocate();
    public native void call(int arg0);
}
