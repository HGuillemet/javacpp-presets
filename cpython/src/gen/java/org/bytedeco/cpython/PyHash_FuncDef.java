// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


// #ifdef Py_DEBUG
// #endif


/* hash function definition */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyHash_FuncDef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyHash_FuncDef(Pointer p) { super(p); }

    public static class Hash_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Hash_Pointer_long(Pointer p) { super(p); }
        protected Hash_Pointer_long() { allocate(); }
        private native void allocate();
        public native @Cast("Py_hash_t") long call(@Const Pointer arg0, @Cast("Py_ssize_t") long arg1);
    }
    @MemberGetter public native @Const Hash_Pointer_long hash();
    public native @Cast("const char*") BytePointer name(); public native PyHash_FuncDef name(BytePointer setter);
    @MemberGetter public native int hash_bits();
    @MemberGetter public native int seed_bits();
}
