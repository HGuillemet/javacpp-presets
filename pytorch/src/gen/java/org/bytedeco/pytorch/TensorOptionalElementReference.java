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


@Name("c10::impl::ListElementReference<std::optional<at::Tensor>,c10::detail::ListImpl::list_type::iterator>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorOptionalElementReference extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorOptionalElementReference(Pointer p) { super(p); }

  public native @Name("operator std::conditional_t<std::is_reference_v<c10::detail::ivalue_to_const_ref_overload_return<std::optional<at::Tensor> >::type>,const std::optional<at::Tensor>&,std::optional<at::Tensor> >") @ByVal TensorOptional getTensorOptional();

  

  

  // assigning another ref to this assigns the underlying value
  

  public native @Const @ByRef IValue get();

  private static native @Namespace @NoException(true) void swap(@ByRef(true) TensorOptionalElementReference lhs, @ByRef(true) TensorOptionalElementReference rhs);
  public void swap(TensorOptionalElementReference rhs) { swap(this, rhs); }

  
  
}
