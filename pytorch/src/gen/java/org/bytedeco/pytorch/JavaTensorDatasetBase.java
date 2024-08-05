// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::data::datasets::Dataset<javacpp::Dataset<torch::Tensor,torch::data::example::NoTarget>,torch::data::Example<torch::Tensor,torch::data::example::NoTarget> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JavaTensorDatasetBase extends JavaTensorBatchDataset {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JavaTensorDatasetBase(Pointer p) { super(p); }


  /** Returns the example at the given index. */
  public native @ByVal @Cast("torch::data::datasets::Dataset<javacpp::Dataset<torch::Tensor,torch::data::example::NoTarget>,torch::data::Example<torch::Tensor,torch::data::example::NoTarget> >::ExampleType*") TensorExample get(@Cast("size_t") long index);

  /** Returns a batch of data.
   *  The default implementation calls {@code get()} for every requested index
   *  in the batch. */
  public native @ByVal TensorExampleVector get_batch(@ByVal SizeTArrayRef indices);
  public native @ByVal TensorExampleVector get_batch(@ByVal @Cast({"size_t*", "c10::ArrayRef<size_t>", "std::vector<size_t>&"}) @StdVector("size_t") long... indices);
}
