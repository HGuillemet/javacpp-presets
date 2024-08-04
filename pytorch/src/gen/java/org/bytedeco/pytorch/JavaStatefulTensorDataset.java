// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("javacpp::StatefulDataset<torch::Tensor,torch::data::example::NoTarget>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JavaStatefulTensorDataset extends JavaStatefulTensorDatasetBase {
    static { Loader.load(); }
    /** Default native constructor. */
    public JavaStatefulTensorDataset() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JavaStatefulTensorDataset(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JavaStatefulTensorDataset(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JavaStatefulTensorDataset position(long position) {
        return (JavaStatefulTensorDataset)super.position(position);
    }
    @Override public JavaStatefulTensorDataset getPointer(long i) {
        return new JavaStatefulTensorDataset((Pointer)this).offsetAddress(i);
    }

  @Virtual(true) public native @ByVal @Const({false, false, true}) SizeTOptional size();
  @Virtual(true) public native @ByVal TensorExampleVectorOptional get_batch(@Cast("size_t") long size);
  @Virtual(true) public native void reset();
  @Virtual(true) public native @Const({false, false, true}) void save(@ByRef OutputArchive archive);
  @Virtual(true) public native void load(@ByRef InputArchive archive);
}
