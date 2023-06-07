// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA host node parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaHostNodeParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaHostNodeParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaHostNodeParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaHostNodeParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaHostNodeParams position(long position) {
        return (cudaHostNodeParams)super.position(position);
    }
    @Override public cudaHostNodeParams getPointer(long i) {
        return new cudaHostNodeParams((Pointer)this).offsetAddress(i);
    }

    /** The function to call when the node executes */
    public native cudaHostFn_t fn(); public native cudaHostNodeParams fn(cudaHostFn_t setter);
    /** Argument to pass to the function */
    public native Pointer userData(); public native cudaHostNodeParams userData(Pointer setter);
}
