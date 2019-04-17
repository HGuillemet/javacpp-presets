// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Represents the output of 'node' at 'index'.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NodeOut extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NodeOut() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NodeOut(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeOut(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NodeOut position(long position) {
        return (NodeOut)super.position(position);
    }

  public native Node node(); public native NodeOut node(Node setter);
  public native int index(); public native NodeOut index(int setter);

  // Returns the string name that represents the output of this node.
  public native @StdString BytePointer name();
  // Returns the data type of the output of this node.
  public native @Cast("tensorflow::DataType") int dtype();
}
