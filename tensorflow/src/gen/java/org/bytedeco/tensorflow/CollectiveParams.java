// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Unique to a single CollectiveOp node.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollectiveParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CollectiveParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CollectiveParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollectiveParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CollectiveParams position(long position) {
        return (CollectiveParams)super.position(position);
    }

  public native @ByRef CollGroupParams group(); public native CollectiveParams group(CollGroupParams setter);
  public native @ByRef CollInstanceParams instance(); public native CollectiveParams instance(CollInstanceParams setter);
  public native @ByRef CollTaskParams task(); public native CollectiveParams task(CollTaskParams setter);

  public native @StdString BytePointer name(); public native CollectiveParams name(BytePointer setter);        // node name used only for log or error messages
  public native int default_rank(); public native CollectiveParams default_rank(int setter);   // index of this op within device_names
  public native @Cast("bool") boolean is_source(); public native CollectiveParams is_source(boolean setter);  // broadcast only
  public native int source_rank(); public native CollectiveParams source_rank(int setter);    // broadcast only
  // Rank of this device in each subdivision permutation.
  public native @StdVector IntPointer subdiv_rank(); public native CollectiveParams subdiv_rank(IntPointer setter);
  public native @MoveUniquePtr OpKernel merge_op(); public native CollectiveParams merge_op(OpKernel setter);  // reduction only
  public native @MoveUniquePtr OpKernel final_op(); public native CollectiveParams final_op(OpKernel setter);  // reduction only
  public native @StdString BytePointer ToString();
}
