// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


// #ifdef CL_VERSION_1_2

@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_image_desc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_image_desc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_image_desc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_image_desc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_image_desc position(long position) {
        return (cl_image_desc)super.position(position);
    }
    @Override public cl_image_desc getPointer(long i) {
        return new cl_image_desc((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cl_mem_object_type") int image_type(); public native cl_image_desc image_type(int setter);
    public native @Cast("size_t") long image_width(); public native cl_image_desc image_width(long setter);
    public native @Cast("size_t") long image_height(); public native cl_image_desc image_height(long setter);
    public native @Cast("size_t") long image_depth(); public native cl_image_desc image_depth(long setter);
    public native @Cast("size_t") long image_array_size(); public native cl_image_desc image_array_size(long setter);
    public native @Cast("size_t") long image_row_pitch(); public native cl_image_desc image_row_pitch(long setter);
    public native @Cast("size_t") long image_slice_pitch(); public native cl_image_desc image_slice_pitch(long setter);
    public native @Cast("cl_uint") int num_mip_levels(); public native cl_image_desc num_mip_levels(int setter);
    public native @Cast("cl_uint") int num_samples(); public native cl_image_desc num_samples(int setter);
// #ifdef CL_VERSION_2_0
// #if defined(__GNUC__)                   /* Prevents warnings about anonymous union in -pedantic builds */
// #endif
// #if defined(_MSC_VER) && !defined(__STDC__)
//     #pragma warning( push )
// #pragma warning( disable : 4201 )   /* Prevents warning about nameless struct/union in /W4 builds */
// #endif
// #ifdef __clang__
// #pragma clang diagnostic push
// #pragma clang diagnostic ignored "-Wc11-extensions" /* Prevents warning about nameless union being C11 extension*/
// #endif
// #if defined(_MSC_VER) && defined(__STDC__)
    /* Anonymous unions are not supported in /Za builds */
// #else
// #endif
// #endif
      public native _cl_mem buffer(); public native cl_image_desc buffer(_cl_mem setter);
// #ifdef CL_VERSION_2_0
// #if defined(_MSC_VER) && defined(__STDC__)
    /* Anonymous unions are not supported in /Za builds */
// #else
      public native _cl_mem mem_object(); public native cl_image_desc mem_object(_cl_mem setter);
// #endif
// #if defined(_MSC_VER) && !defined(__STDC__)
// #pragma warning( pop )
// #endif
// #ifdef __clang__
// #pragma clang diagnostic pop
// #endif
// #endif
}
