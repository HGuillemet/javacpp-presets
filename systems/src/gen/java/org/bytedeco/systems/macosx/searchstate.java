// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;

@Opaque @Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class searchstate extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public searchstate() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public searchstate(Pointer p) { super(p); }
}
