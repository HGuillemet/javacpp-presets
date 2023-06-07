// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Result information returned by cuGraphExecUpdate
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUgraphExecUpdateResultInfo_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUgraphExecUpdateResultInfo_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUgraphExecUpdateResultInfo_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUgraphExecUpdateResultInfo_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUgraphExecUpdateResultInfo_v1 position(long position) {
        return (CUgraphExecUpdateResultInfo_v1)super.position(position);
    }
    @Override public CUgraphExecUpdateResultInfo_v1 getPointer(long i) {
        return new CUgraphExecUpdateResultInfo_v1((Pointer)this).offsetAddress(i);
    }

    /**
     * Gives more specific detail when a cuda graph update fails.
     */
    public native @Cast("CUgraphExecUpdateResult") int result(); public native CUgraphExecUpdateResultInfo_v1 result(int setter);

    /**
     * The "to node" of the error edge when the topologies do not match.
     * The error node when the error is associated with a specific node.
     * NULL when the error is generic.
     */
    public native CUgraphNode_st errorNode(); public native CUgraphExecUpdateResultInfo_v1 errorNode(CUgraphNode_st setter);

    /**
     * The from node of error edge when the topologies do not match. Otherwise NULL.
     */
    public native CUgraphNode_st errorFromNode(); public native CUgraphExecUpdateResultInfo_v1 errorFromNode(CUgraphNode_st setter);
}
