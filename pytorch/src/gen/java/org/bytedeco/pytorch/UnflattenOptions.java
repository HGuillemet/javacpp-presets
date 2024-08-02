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


// ============================================================================

/** Options for the {@code Unflatten} module.
 * 
 *  Note: If input tensor is named, use dimname and namedshape arguments.
 * 
 *  Example:
 *  <pre>{@code
 *  Unflatten unnamed_model(UnflattenOptions(0, {2, 2}));
 *  Unflatten named_model(UnflattenOptions("B", {{"B1", 2}, {"B2", 2}}));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class UnflattenOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnflattenOptions(Pointer p) { super(p); }


  public UnflattenOptions(@Cast("int64_t") long dim, @ByVal @Cast("std::vector<int64_t>*") LongVector sizes) { super((Pointer)null); allocate(dim, sizes); }
  private native void allocate(@Cast("int64_t") long dim, @ByVal @Cast("std::vector<int64_t>*") LongVector sizes);
  public UnflattenOptions(@Cast("const char*") BytePointer dimname, @ByVal @Cast("torch::nn::UnflattenOptions::namedshape_t*") StringLongVector namedshape) { super((Pointer)null); allocate(dimname, namedshape); }
  private native void allocate(@Cast("const char*") BytePointer dimname, @ByVal @Cast("torch::nn::UnflattenOptions::namedshape_t*") StringLongVector namedshape);
  public UnflattenOptions(String dimname, @ByVal @Cast("torch::nn::UnflattenOptions::namedshape_t*") StringLongVector namedshape) { super((Pointer)null); allocate(dimname, namedshape); }
  private native void allocate(String dimname, @ByVal @Cast("torch::nn::UnflattenOptions::namedshape_t*") StringLongVector namedshape);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer dim();
  public native @StdString @ByRef @NoException(true) BytePointer dimname();
  public native @Cast("std::vector<int64_t>*") @ByRef @NoException(true) LongVector sizes();
  public native @Cast("torch::nn::UnflattenOptions::namedshape_t*") @ByRef @NoException(true) StringLongVector namedshape();
}
