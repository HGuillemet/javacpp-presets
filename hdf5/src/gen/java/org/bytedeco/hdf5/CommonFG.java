// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class CommonFG
    \brief \a CommonFG is an abstract base class of H5Group.
*/
/* Note: This class is being deprecated gradually. */
@Namespace("H5") @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class CommonFG extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CommonFG(Pointer p) { super(p); }

    // Opens a generic named datatype in this location.
    public native @ByVal DataType openDataType(@Cast("const char*") BytePointer name);
    public native @ByVal DataType openDataType(String name);

    // Opens a named array datatype in this location.
    public native @ByVal ArrayType openArrayType(@Cast("const char*") BytePointer name);
    public native @ByVal ArrayType openArrayType(String name);

    // Opens a named compound datatype in this location.
    public native @ByVal CompType openCompType(@Cast("const char*") BytePointer name);
    public native @ByVal CompType openCompType(String name);

    // Opens a named enumeration datatype in this location.
    public native @ByVal EnumType openEnumType(@Cast("const char*") BytePointer name);
    public native @ByVal EnumType openEnumType(String name);

    // Opens a named integer datatype in this location.
    public native @ByVal IntType openIntType(@Cast("const char*") BytePointer name);
    public native @ByVal IntType openIntType(String name);

    // Opens a named floating-point datatype in this location.
    public native @ByVal FloatType openFloatType(@Cast("const char*") BytePointer name);
    public native @ByVal FloatType openFloatType(String name);

    // Opens a named string datatype in this location.
    public native @ByVal StrType openStrType(@Cast("const char*") BytePointer name);
    public native @ByVal StrType openStrType(String name);

    // Opens a named variable length datatype in this location.
    public native @ByVal VarLenType openVarLenType(@Cast("const char*") BytePointer name);
    public native @ByVal VarLenType openVarLenType(String name);

// #ifndef DOXYGEN_SHOULD_SKIP_THIS
    /** For subclasses, H5File and Group, to return the correct
     *  object id, i.e. file or group id. */
    public native @Cast("hid_t") long getLocId();

    /** For subclasses, H5File and Group, to throw appropriate exception. */
    public native void throwException(@StdString BytePointer func_name, @StdString BytePointer msg);
    public native void throwException(@StdString String func_name, @StdString String msg);

    // Default constructor.

    // Noop destructor.

}
