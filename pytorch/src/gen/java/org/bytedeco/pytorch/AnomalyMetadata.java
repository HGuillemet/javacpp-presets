// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::autograd") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AnomalyMetadata extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AnomalyMetadata() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AnomalyMetadata(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AnomalyMetadata(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AnomalyMetadata position(long position) {
        return (AnomalyMetadata)super.position(position);
    }
    @Override public AnomalyMetadata getPointer(long i) {
        return new AnomalyMetadata((Pointer)this).offsetAddress(i);
    }

  public native void store_stack();
  public native void print_stack(@StdString BytePointer current_node_name);
  public native void print_stack(@StdString String current_node_name);
  public native void assign_parent(@SharedPtr Node parent_node);
}
