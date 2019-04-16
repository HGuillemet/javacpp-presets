// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _excepthandler extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _excepthandler() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _excepthandler(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _excepthandler(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _excepthandler position(long position) {
        return (_excepthandler)super.position(position);
    }

    public native @Cast("_excepthandler_kind") int kind(); public native _excepthandler kind(int setter);
            @Name("v.ExceptHandler.type") public native _expr v_ExceptHandler_type(); public native _excepthandler v_ExceptHandler_type(_expr setter);
            @Name("v.ExceptHandler.name") public native @Cast("identifier") PyObject v_ExceptHandler_name(); public native _excepthandler v_ExceptHandler_name(PyObject setter);
            @Name("v.ExceptHandler.body") public native asdl_seq v_ExceptHandler_body(); public native _excepthandler v_ExceptHandler_body(asdl_seq setter);
    public native int lineno(); public native _excepthandler lineno(int setter);
    public native int col_offset(); public native _excepthandler col_offset(int setter);
}
