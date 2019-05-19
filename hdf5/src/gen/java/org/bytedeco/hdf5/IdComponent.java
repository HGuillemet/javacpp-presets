// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class IdComponent
    \brief Class IdComponent provides wrappers of the C functions that
     operate on an HDF5 identifier.
    <p>
    In most cases, the C library handles these operations and an application
    rarely needs them.
*/
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class IdComponent extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IdComponent(Pointer p) { super(p); }


        // Increment reference counter.
        public native void incRefCount(@Cast("const hid_t") long obj_id);
        public native void incRefCount();

        // Decrement reference counter.
        public native void decRefCount(@Cast("const hid_t") long obj_id);
        public native void decRefCount();

        // Get the reference counter to this identifier.
        public native int getCounter(@Cast("const hid_t") long obj_id);
        public native int getCounter();

        // Returns an HDF5 object type, given the object id.
        public static native @Cast("H5I_type_t") int getHDFObjType(@Cast("const hid_t") long obj_id);

        // Returns an HDF5 object type of this object.
        public native @Cast("H5I_type_t") int getHDFObjType();

        // Returns the number of members in a type.
        public static native @Cast("hsize_t") long getNumMembers(@Cast("H5I_type_t") int type);

        // Checks if the given ID is valid.
        public static native @Cast("bool") boolean isValid(@Cast("hid_t") long an_id);

        // Determines if an type exists.
        public static native @Cast("bool") boolean typeExists(@Cast("H5I_type_t") int type);

        // Assignment operator.
        public native @ByRef @Name("operator =") IdComponent put(@Const @ByRef IdComponent rhs);

        // Sets the identifier of this object to a new value.
        public native void setId(@Cast("const hid_t") long new_id);

// #ifndef DOXYGEN_SHOULD_SKIP_THIS

        // Gets the identifier of this object.
        public native @Cast("hid_t") long getId();

        // Pure virtual function for there are various H5*close for the
        // subclasses.
        public native @Name("close") void _close();

        // Makes and returns the string "<class-name>::<func_name>";
        // <class-name> is returned by fromClass().
        public native @StdString BytePointer inMemFunc(@Cast("const char*") BytePointer func_name);
        public native @StdString String inMemFunc(String func_name);

        /**\brief Returns this class name. */
        public native @StdString BytePointer fromClass();

// #endif // DOXYGEN_SHOULD_SKIP_THIS

        // Destructor

}
