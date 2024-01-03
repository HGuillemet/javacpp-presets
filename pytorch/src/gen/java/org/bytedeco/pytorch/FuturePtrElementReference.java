// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

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


@Name("c10::impl::ListElementReference<c10::intrusive_ptr<c10::ivalue::Future>,c10::detail::ListImpl::list_type::iterator>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FuturePtrElementReference extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FuturePtrElementReference(Pointer p) { super(p); }

  public native @Name("operator std::conditional_t<std::is_reference<c10::detail::ivalue_to_const_ref_overload_return<c10::intrusive_ptr<c10::ivalue::Future> >::type>::value,const c10::intrusive_ptr<c10::ivalue::Future>&,c10::intrusive_ptr<c10::ivalue::Future> >") @ByVal FuturePtr getFuturePtr();

  

  

  // assigning another ref to this assigns the underlying value
  

  public native @Const @ByRef IValue get();

  private static native @Namespace @Name("swap") void swap(@ByRef(true) FuturePtrElementReference lhs, @ByRef(true) FuturePtrElementReference rhs);
  public void swap(FuturePtrElementReference rhs) { swap(this, rhs); }

  
  
}
