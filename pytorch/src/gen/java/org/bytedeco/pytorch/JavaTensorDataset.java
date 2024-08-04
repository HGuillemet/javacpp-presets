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

 @Name("javacpp::Dataset<torch::Tensor,torch::data::example::NoTarget>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JavaTensorDataset extends JavaTensorDatasetBase {
     static { Loader.load(); }
     /** Default native constructor. */
     public JavaTensorDataset() { super((Pointer)null); allocate(); }
     /** Native array allocator. Access with {@link Pointer#position(long)}. */
     public JavaTensorDataset(long size) { super((Pointer)null); allocateArray(size); }
     /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
     public JavaTensorDataset(Pointer p) { super(p); }
     private native void allocate();
     private native void allocateArray(long size);
     @Override public JavaTensorDataset position(long position) {
         return (JavaTensorDataset)super.position(position);
     }
     @Override public JavaTensorDataset getPointer(long i) {
         return new JavaTensorDataset((Pointer)this).offsetAddress(i);
     }
 
   @Virtual(true) public native @ByVal TensorExample get(@Cast("size_t") long index);
   @Virtual(true) public native @ByVal @Const({false, false, true}) SizeTOptional size();
   @Virtual public native @ByVal TensorExampleVector get_batch(@ByVal SizeTArrayRef indices);
}
