// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class DSetAccPropList
    \brief Class DSetAccPropList inherits from LinkAccPropList and provides
    wrappers for the HDF5 dataset access property functions.
*/
//  Inheritance: LinkAccPropList -> PropList -> IdComponent
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class DSetAccPropList extends LinkAccPropList {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DSetAccPropList(Pointer p) { super(p); }

    /**\brief Default dataset creation property list. */
    @MemberGetter public static native @Const @ByRef DSetAccPropList DEFAULT();

    // Creates a dataset creation property list.
    public DSetAccPropList() { super((Pointer)null); allocate(); }
    private native void allocate();

    // Sets the raw data chunk cache parameters.
    public native void setChunkCache(@Cast("size_t") long rdcc_nslots, @Cast("size_t") long rdcc_nbytes, double rdcc_w0);

    // Retrieves the raw data chunk cache parameters.
    public native void getChunkCache(@Cast("size_t*") @ByRef SizeTPointer rdcc_nslots, @Cast("size_t*") @ByRef SizeTPointer rdcc_nbytes, @ByRef DoublePointer rdcc_w0);
    public native void getChunkCache(@Cast("size_t*") @ByRef SizeTPointer rdcc_nslots, @Cast("size_t*") @ByRef SizeTPointer rdcc_nbytes, @ByRef DoubleBuffer rdcc_w0);
    public native void getChunkCache(@Cast("size_t*") @ByRef SizeTPointer rdcc_nslots, @Cast("size_t*") @ByRef SizeTPointer rdcc_nbytes, @ByRef double[] rdcc_w0);

    /**\brief Returns this class name. */
    public native @StdString @Override BytePointer fromClass();

    // Copy constructor - same as the original DSetAccPropList.
    public DSetAccPropList(@Const @ByRef DSetAccPropList orig) { super((Pointer)null); allocate(orig); }
    private native void allocate(@Const @ByRef DSetAccPropList orig);

    // Creates a copy of an existing dataset creation property list
    // using the property list id.
    public DSetAccPropList(@Cast("const hid_t") long plist_id) { super((Pointer)null); allocate(plist_id); }
    private native void allocate(@Cast("const hid_t") long plist_id);

    // Noop destructor.

// #ifndef DOXYGEN_SHOULD_SKIP_THIS

    // Deletes the global constant, should only be used by the library
    public static native void deleteConstants();

}
