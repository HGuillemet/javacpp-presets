// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
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

@Name("torch::data::datasets::BatchDataset<torch::data::datasets::TensorDataset,std::vector<torch::data::TensorExample> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorBatchDataset extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorBatchDataset(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const bool") boolean is_stateful();
  public static final boolean is_stateful = is_stateful();

  /** Returns a batch of data given an index. */
  public native @ByVal TensorExampleVector get_batch(@ByVal SizeTArrayRef request);
  public native @ByVal TensorExampleVector get_batch(@ByVal @Cast({"size_t*", "c10::ArrayRef<size_t>", "std::vector<size_t>&"}) @StdVector("size_t") long... request);

  /** Returns the size of the dataset, or an empty optional if it is unsized. */
  public native @ByVal SizeTOptional size();

  /** Creates a {@code MapDataset} that applies the given {@code transform} to this dataset. */

  /** Creates a {@code MapDataset} that applies the given {@code transform} to this dataset. */
  
}
