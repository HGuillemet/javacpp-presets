// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class LinkAccPropList
    \brief Class LinkAccPropList inherits from PropList and provides
    wrappers for the HDF5 link access property list.
*/
// Inheritance: PropList -> IdComponent
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class LinkAccPropList extends PropList {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LinkAccPropList(Pointer p) { super(p); }

        /**\brief Default link access property list. */
        @MemberGetter public static native @Const @ByRef LinkAccPropList DEFAULT();

        // Creates a link access property list.
        public LinkAccPropList() { super((Pointer)null); allocate(); }
        private native void allocate();

        /**\brief Returns this class name. */
        public native @StdString BytePointer fromClass();

        // Copy constructor: same as the original LinkAccPropList.
        public LinkAccPropList(@Const @ByRef LinkAccPropList original) { super((Pointer)null); allocate(original); }
        private native void allocate(@Const @ByRef LinkAccPropList original);

        // Creates a copy of an existing link access property list
        // using the property list id.
        public LinkAccPropList(@Cast("const hid_t") long plist_id) { super((Pointer)null); allocate(plist_id); }
        private native void allocate(@Cast("const hid_t") long plist_id);

        // Sets the number of soft or user-defined links that can be
        // traversed before a failure occurs.
        public native void setNumLinks(@Cast("size_t") long nlinks);

        // Gets the number of soft or user-defined link traversals allowed
        public native @Cast("size_t") long getNumLinks();

        // Noop destructor

// #ifndef DOXYGEN_SHOULD_SKIP_THIS

        // Deletes the global constant, should only be used by the library
        public static native void deleteConstants();

}
