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
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::data::StatefulDataLoader<JavaCPP_javacpp_0003a_0003aStatefulDataset_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JavaStatefulDataLoader extends JavaStatefulDataLoaderBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JavaStatefulDataLoader(Pointer p) { super(p); }


  /** Constructs the {@code StatefulDataLoader} from a {@code dataset} and some {@code options}. */
  public JavaStatefulDataLoader(@ByVal @Cast("JavaCPP_javacpp_0003a_0003aStatefulDataset_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e*") JavaStatefulDataset dataset, @ByVal DataLoaderOptions options) { super((Pointer)null); allocate(dataset, options); }
  private native void allocate(@ByVal @Cast("JavaCPP_javacpp_0003a_0003aStatefulDataset_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e*") JavaStatefulDataset dataset, @ByVal DataLoaderOptions options);
}
