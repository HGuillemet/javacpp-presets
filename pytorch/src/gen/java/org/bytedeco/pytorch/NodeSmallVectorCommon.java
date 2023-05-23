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

@Name("c10::SmallVectorTemplateCommon<torch::autograd::Node*>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NodeSmallVectorCommon extends IntSizedSmallVectorBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeSmallVectorCommon(Pointer p) { super(p); }


  // forward iterator creation methods.
  public native @ByVal @Cast("c10::SmallVectorTemplateCommon<torch::autograd::Node*>::iterator*") Node begin();
  public native @ByVal @Cast("c10::SmallVectorTemplateCommon<torch::autograd::Node*>::iterator*") Node end();

  // reverse iterator creation methods.

  public native long size_in_bytes();
  public native long max_size();

  public native @Cast("size_t") long capacity_in_bytes();

  /** Return a pointer to the vector's buffer, even if empty(). */
  public native @ByVal @Cast("c10::SmallVectorTemplateCommon<torch::autograd::Node*>::pointer*") Node data();
  /** Return a pointer to the vector's buffer, even if empty(). */

  // SmallVector::at is NOT from LLVM.
  public native @ByPtr Node at(long idx);
  public native @Name("operator []") @ByPtr Node get(long idx);

  public native @ByPtr Node front();

  public native @ByPtr Node back();
}
