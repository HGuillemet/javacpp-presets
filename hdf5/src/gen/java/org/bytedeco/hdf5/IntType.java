// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class IntType
    \brief IntType is a derivative of a DataType and operates on HDF5
    integer datatype.
*/
//  Inheritance: AtomType -> DataType -> H5Object -> H5Location -> IdComponent
@Namespace("H5") @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class IntType extends AtomType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntType(Pointer p) { super(p); }

    // Creates an integer type using a predefined type
    public IntType(@Const @ByRef PredType pred_type) { super((Pointer)null); allocate(pred_type); }
    private native void allocate(@Const @ByRef PredType pred_type);

    // Gets the integer datatype of the specified dataset
    public IntType(@Const @ByRef DataSet dataset) { super((Pointer)null); allocate(dataset); }
    private native void allocate(@Const @ByRef DataSet dataset);

    // Constructors that open an HDF5 integer datatype, given a location.
    public IntType(@Const @ByRef H5Location loc, @Cast("const char*") BytePointer name) { super((Pointer)null); allocate(loc, name); }
    private native void allocate(@Const @ByRef H5Location loc, @Cast("const char*") BytePointer name);
    public IntType(@Const @ByRef H5Location loc, String name) { super((Pointer)null); allocate(loc, name); }
    private native void allocate(@Const @ByRef H5Location loc, String name);

    // Returns an IntType object via DataType* by decoding the
    // binary object description of this type.
    public native @Override DataType decode();

    // Retrieves the sign type for an integer type
    public native @Cast("H5T_sign_t") int getSign();

    // Sets the sign property for an integer type.
    public native void setSign(@Cast("H5T_sign_t") int sign);

    /**\brief Returns this class name. */
    public native @StdString @Override BytePointer fromClass();

    // Default constructor
    public IntType() { super((Pointer)null); allocate(); }
    private native void allocate();

    // Creates a integer datatype using an existing id
    public IntType(@Cast("const hid_t") long existing_id) { super((Pointer)null); allocate(existing_id); }
    private native void allocate(@Cast("const hid_t") long existing_id);

    // Copy constructor: same as the original IntType.
    public IntType(@Const @ByRef IntType original) { super((Pointer)null); allocate(original); }
    private native void allocate(@Const @ByRef IntType original);

    // Noop destructor.

}
