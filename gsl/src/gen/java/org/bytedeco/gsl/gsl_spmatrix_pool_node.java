// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* memory pool for binary tree node allocation */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_spmatrix_pool_node extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_spmatrix_pool_node() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_spmatrix_pool_node(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_spmatrix_pool_node(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_spmatrix_pool_node position(long position) {
        return (gsl_spmatrix_pool_node)super.position(position);
    }
    @Override public gsl_spmatrix_pool_node getPointer(long i) {
        return new gsl_spmatrix_pool_node((Pointer)this).offsetAddress(i);
    }

  public native gsl_spmatrix_pool_node next(); public native gsl_spmatrix_pool_node next(gsl_spmatrix_pool_node setter);
  public native Pointer block_ptr(); public native gsl_spmatrix_pool_node block_ptr(Pointer setter);          /* pointer to memory block, of size n*tree_node_size */
  public native @Cast("unsigned char*") BytePointer free_slot(); public native gsl_spmatrix_pool_node free_slot(BytePointer setter); /* pointer to next available slot */
}
