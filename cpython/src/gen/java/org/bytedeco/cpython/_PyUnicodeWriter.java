// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* --- _PyUnicodeWriter API ----------------------------------------------- */

 @Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyUnicodeWriter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyUnicodeWriter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyUnicodeWriter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyUnicodeWriter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyUnicodeWriter position(long position) {
        return (_PyUnicodeWriter)super.position(position);
    }
    @Override public _PyUnicodeWriter getPointer(long i) {
        return new _PyUnicodeWriter((Pointer)this).offsetAddress(i);
    }

    public native PyObject buffer(); public native _PyUnicodeWriter buffer(PyObject setter);
    public native Pointer data(); public native _PyUnicodeWriter data(Pointer setter);
    public native int kind(); public native _PyUnicodeWriter kind(int setter);
    public native @Cast("Py_UCS4") int maxchar(); public native _PyUnicodeWriter maxchar(int setter);
    public native @Cast("Py_ssize_t") long size(); public native _PyUnicodeWriter size(long setter);
    public native @Cast("Py_ssize_t") long pos(); public native _PyUnicodeWriter pos(long setter);

    /* minimum number of allocated characters (default: 0) */
    public native @Cast("Py_ssize_t") long min_length(); public native _PyUnicodeWriter min_length(long setter);

    /* minimum character (default: 127, ASCII) */
    public native @Cast("Py_UCS4") int min_char(); public native _PyUnicodeWriter min_char(int setter);

    /* If non-zero, overallocate the buffer (default: 0). */
    public native @Cast("unsigned char") byte overallocate(); public native _PyUnicodeWriter overallocate(byte setter);

    /* If readonly is 1, buffer is a shared string (cannot be modified)
       and size is set to 0. */
    public native @Cast("unsigned char") byte readonly(); public native _PyUnicodeWriter readonly(byte setter);
} 
