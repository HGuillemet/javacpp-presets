// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::data::datasets::BatchDataset<javacpp::StreamDataset<torch::Tensor,torch::Tensor>,std::vector<torch::data::Example<torch::Tensor,torch::Tensor> >,size_t>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JavaStreamBatchDataset extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JavaStreamBatchDataset(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const bool") boolean is_stateful();
  public static final boolean is_stateful = is_stateful();

  /** Returns a batch of data given an index. */
  public native @ByVal ExampleVector get_batch(@Cast("size_t") long request);

  /** Returns the size of the dataset, or an empty optional if it is unsized. */
  public native @ByVal SizeTOptional size();

  /** Creates a {@code MapDataset} that applies the given {@code transform} to this dataset. */

  /** Creates a {@code MapDataset} that applies the given {@code transform} to this dataset. */
  
}
