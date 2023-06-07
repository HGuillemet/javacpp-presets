// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;
         /* hastzinfo false */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyDateTime_Time extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyDateTime_Time() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyDateTime_Time(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyDateTime_Time(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyDateTime_Time position(long position) {
        return (PyDateTime_Time)super.position(position);
    }
    @Override public PyDateTime_Time getPointer(long i) {
        return new PyDateTime_Time((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyDateTime_Time ob_base(PyObject setter);
    public native @Cast("Py_hash_t") long hashcode(); public native PyDateTime_Time hashcode(long setter);
    public native @Cast("char") byte hastzinfo(); public native PyDateTime_Time hastzinfo(byte setter);             /* boolean flag */
    public native @Cast("unsigned char") byte data(int i); public native PyDateTime_Time data(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer data();
    public native @Cast("unsigned char") byte fold(); public native PyDateTime_Time fold(byte setter);
    public native PyObject tzinfo(); public native PyDateTime_Time tzinfo(PyObject setter);
}
