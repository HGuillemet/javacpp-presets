// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// Import Format
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_IMPORT_BY_NAME extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_IMPORT_BY_NAME() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_IMPORT_BY_NAME(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_IMPORT_BY_NAME(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_IMPORT_BY_NAME position(long position) {
        return (IMAGE_IMPORT_BY_NAME)super.position(position);
    }

    public native @Cast("WORD") short Hint(); public native IMAGE_IMPORT_BY_NAME Hint(short setter);
    public native @Cast("CHAR") byte Name(int i); public native IMAGE_IMPORT_BY_NAME Name(int i, byte setter);
    @MemberGetter public native @Cast("CHAR*") BytePointer Name();
}
