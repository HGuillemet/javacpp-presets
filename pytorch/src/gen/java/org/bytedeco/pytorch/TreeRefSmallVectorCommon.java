// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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

@Name("c10::SmallVectorTemplateCommon<c10::intrusive_ptr<torch::jit::Tree> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TreeRefSmallVectorCommon extends IntSizedSmallVectorBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TreeRefSmallVectorCommon(Pointer p) { super(p); }


  // forward iterator creation methods.
  public native @ByVal @Cast("c10::SmallVectorTemplateCommon<c10::intrusive_ptr<torch::jit::Tree> >::iterator*") TreeRef begin();
  public native @ByVal @Cast("c10::SmallVectorTemplateCommon<c10::intrusive_ptr<torch::jit::Tree> >::iterator*") TreeRef end();

  // reverse iterator creation methods.

  public native long size_in_bytes();
  public native long max_size();

  public native @Cast("size_t") long capacity_in_bytes();

  /** Return a pointer to the vector's buffer, even if empty(). */
  public native @ByVal @Cast("c10::SmallVectorTemplateCommon<c10::intrusive_ptr<torch::jit::Tree> >::pointer*") TreeRef data();
  /** Return a pointer to the vector's buffer, even if empty(). */

  // SmallVector::at is NOT from LLVM.
  public native @ByVal TreeRef at(long idx);
  public native @Name("operator []") @ByVal TreeRef get(long idx);

  public native @ByVal TreeRef front();

  public native @ByVal TreeRef back();
}
