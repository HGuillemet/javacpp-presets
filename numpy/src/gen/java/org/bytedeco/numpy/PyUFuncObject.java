// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyUFuncObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyUFuncObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyUFuncObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyUFuncObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyUFuncObject position(long position) {
        return (PyUFuncObject)super.position(position);
    }

        public native @ByRef PyObject ob_base(); public native PyUFuncObject ob_base(PyObject setter);
        /*
         * nin: Number of inputs
         * nout: Number of outputs
         * nargs: Always nin + nout (Why is it stored?)
         */
        public native int nin(); public native PyUFuncObject nin(int setter);
        public native int nout(); public native PyUFuncObject nout(int setter);
        public native int nargs(); public native PyUFuncObject nargs(int setter);

        /*
         * Identity for reduction, any of PyUFunc_One, PyUFunc_Zero
         * PyUFunc_MinusOne, PyUFunc_None, PyUFunc_ReorderableNone,
         * PyUFunc_IdentityValue.
         */
        public native int identity(); public native PyUFuncObject identity(int setter);

        /* Array of one-dimensional core loops */
        public native @ByPtrPtr PyUFuncGenericFunction functions(); public native PyUFuncObject functions(PyUFuncGenericFunction setter);
        /* Array of funcdata that gets passed into the functions */
        public native Pointer data(int i); public native PyUFuncObject data(int i, Pointer setter);
        public native @Cast("void**") PointerPointer data(); public native PyUFuncObject data(PointerPointer setter);
        /* The number of elements in 'functions' and 'data' */
        public native int ntypes(); public native PyUFuncObject ntypes(int setter);

        /* Used to be unused field 'check_return' */
        public native int reserved1(); public native PyUFuncObject reserved1(int setter);

        /* The name of the ufunc */
        public native @Cast("const char*") BytePointer name(); public native PyUFuncObject name(BytePointer setter);

        /* Array of type numbers, of size ('nargs' * 'ntypes') */
        public native @Cast("char*") BytePointer types(); public native PyUFuncObject types(BytePointer setter);

        /* Documentation string */
        public native @Cast("const char*") BytePointer doc(); public native PyUFuncObject doc(BytePointer setter);

        public native Pointer ptr(); public native PyUFuncObject ptr(Pointer setter);
        public native PyObject obj(); public native PyUFuncObject obj(PyObject setter);
        public native PyObject userloops(); public native PyUFuncObject userloops(PyObject setter);

        /* generalized ufunc parameters */

        /* 0 for scalar ufunc; 1 for generalized ufunc */
        public native int core_enabled(); public native PyUFuncObject core_enabled(int setter);
        /* number of distinct dimension names in signature */
        public native int core_num_dim_ix(); public native PyUFuncObject core_num_dim_ix(int setter);

        /*
         * dimension indices of input/output argument k are stored in
         * core_dim_ixs[core_offsets[k]..core_offsets[k]+core_num_dims[k]-1]
         */

        /* numbers of core dimensions of each argument */
        public native IntPointer core_num_dims(); public native PyUFuncObject core_num_dims(IntPointer setter);
        /*
         * dimension indices in a flatted form; indices
         * are in the range of [0,core_num_dim_ix)
         */
        public native IntPointer core_dim_ixs(); public native PyUFuncObject core_dim_ixs(IntPointer setter);
        /*
         * positions of 1st core dimensions of each
         * argument in core_dim_ixs, equivalent to cumsum(core_num_dims)
         */
        public native IntPointer core_offsets(); public native PyUFuncObject core_offsets(IntPointer setter);
        /* signature string for printing purpose */
        public native @Cast("char*") BytePointer core_signature(); public native PyUFuncObject core_signature(BytePointer setter);

        /*
         * A function which resolves the types and fills an array
         * with the dtypes for the inputs and outputs.
         */
        public native PyUFunc_TypeResolutionFunc type_resolver(); public native PyUFuncObject type_resolver(PyUFunc_TypeResolutionFunc setter);
        /*
         * A function which returns an inner loop written for
         * NumPy 1.6 and earlier ufuncs. This is for backwards
         * compatibility, and may be NULL if inner_loop_selector
         * is specified.
         */
        public native PyUFunc_LegacyInnerLoopSelectionFunc legacy_inner_loop_selector(); public native PyUFuncObject legacy_inner_loop_selector(PyUFunc_LegacyInnerLoopSelectionFunc setter);
        /*
         * This was blocked off to be the "new" inner loop selector in 1.7,
         * but this was never implemented. (This is also why the above
         * selector is called the "legacy" selector.)
         */
        public native Pointer reserved2(); public native PyUFuncObject reserved2(Pointer setter);
        /*
         * A function which returns a masked inner loop for the ufunc.
         */
        public native PyUFunc_MaskedInnerLoopSelectionFunc masked_inner_loop_selector(); public native PyUFuncObject masked_inner_loop_selector(PyUFunc_MaskedInnerLoopSelectionFunc setter);

        /*
         * List of flags for each operand when ufunc is called by nditer object.
         * These flags will be used in addition to the default flags for each
         * operand set by nditer object.
         */
        public native @Cast("npy_uint32*") IntPointer op_flags(); public native PyUFuncObject op_flags(IntPointer setter);

        /*
         * List of global flags used when ufunc is called by nditer object.
         * These flags will be used in addition to the default global flags
         * set by nditer object.
         */
        public native @Cast("npy_uint32") int iter_flags(); public native PyUFuncObject iter_flags(int setter);

        /* New in NPY_API_VERSION 0x0000000D and above */

        /*
         * for each core_num_dim_ix distinct dimension names,
         * the possible "frozen" size (-1 if not frozen).
         */
        public native @Cast("npy_intp*") SizeTPointer core_dim_sizes(); public native PyUFuncObject core_dim_sizes(SizeTPointer setter);

        /*
         * for each distinct core dimension, a set of UFUNC_CORE_DIM* flags
         */
        public native @Cast("npy_uint32*") IntPointer core_dim_flags(); public native PyUFuncObject core_dim_flags(IntPointer setter);

        /* Identity for reduction, when identity == PyUFunc_IdentityValue */
        public native PyObject identity_value(); public native PyUFuncObject identity_value(PyObject setter);

}
