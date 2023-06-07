// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* tree data structure */
@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_bst_avl_table extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_bst_avl_table() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_bst_avl_table(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_bst_avl_table(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_bst_avl_table position(long position) {
        return (gsl_bst_avl_table)super.position(position);
    }
    @Override public gsl_bst_avl_table getPointer(long i) {
        return new gsl_bst_avl_table((Pointer)this).offsetAddress(i);
    }

  public native gsl_bst_avl_node avl_root(); public native gsl_bst_avl_table avl_root(gsl_bst_avl_node setter);          /* tree's root */
  public native gsl_bst_cmp_function avl_compare(); public native gsl_bst_avl_table avl_compare(gsl_bst_cmp_function setter);          /* comparison function */
  public native Pointer avl_param(); public native gsl_bst_avl_table avl_param(Pointer setter);                            /* extra argument to |avl_compare| */
  public native @Const gsl_bst_allocator avl_alloc(); public native gsl_bst_avl_table avl_alloc(gsl_bst_allocator setter);         /* memory allocator */
  public native @Cast("size_t") long avl_count(); public native gsl_bst_avl_table avl_count(long setter);                           /* number of items in tree */
  public native @Cast("unsigned long") long avl_generation(); public native gsl_bst_avl_table avl_generation(long setter);               /* generation number */
}
