// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5Z_set_local_func_t_snip] -->
<p>
/**
 * \brief The filter operation callback function, defining a filter's operation
 *        on data
 *
 * @param flags [in] Bit vector specifying certain general properties of the filter
 * @param cd_nelmts [in] Number of elements in \p cd_values
 * @param cd_values [in] Auxiliary data for the filter
 * @param nbytes [in] The number of valid bytes in \p buf to be filtered
 * @param buf_size [in,out] The size of \p buf
 * @param buf [in,out] The filter buffer
 *
 * @return Returns the number of valid bytes of data contained in \p buf. In the
 *         case of failure, the return value is 0 (zero) and all pointer
 *         arguments are left unchanged.
 *
 * \details A filter gets definition flags and invocation flags (defined
 *          above), the client data array and size defined when the filter was
 *          added to the pipeline, the size in bytes of the data on which to
 *          operate, and pointers to a buffer and its allocated size.
 *
 *          The filter should store the result in the supplied buffer if
 *          possible, otherwise it can allocate a new buffer, freeing the
 *          original. The allocated size of the new buffer should be returned
 *          through the \p buf_size pointer and the new buffer through the \p
 *          buf pointer.
 *
 *          The return value from the filter is the number of bytes in the
 *          output buffer. If an error occurs then the function should return
 *          zero and leave all pointer arguments unchanged.
 */
/** <!-- [H5Z_func_t_snip] --> */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5Z_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5Z_func_t(Pointer p) { super(p); }
    protected H5Z_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("size_t") long call(@Cast("unsigned int") int flags, @Cast("size_t") long cd_nelmts, @Cast("const unsigned int*") IntPointer cd_values,
                             @Cast("size_t") long nbytes, @Cast("size_t*") SizeTPointer buf_size, @Cast("void**") PointerPointer buf);
}
