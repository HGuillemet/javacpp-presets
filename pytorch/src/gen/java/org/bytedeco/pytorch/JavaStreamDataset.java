// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/**
 * Abstract class for stateless stream datasets to be subclassed by Java user code.
 */
@Name("javacpp::StreamDataset<torch::Tensor,torch::Tensor>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JavaStreamDataset extends JavaStreamBatchDataset {
    static { Loader.load(); }
    /** Default native constructor. */
    public JavaStreamDataset() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JavaStreamDataset(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JavaStreamDataset(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JavaStreamDataset position(long position) {
        return (JavaStreamDataset)super.position(position);
    }
    @Override public JavaStreamDataset getPointer(long i) {
        return new JavaStreamDataset((Pointer)this).offsetAddress(i);
    }

    @Virtual(true) public native @ByVal @Const({false, false, true}) SizeTOptional size();
    @Virtual(true) public native @ByVal ExampleVector get_batch(@Cast("size_t") long size);
}
