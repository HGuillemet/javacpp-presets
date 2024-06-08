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


@Name("c10::impl::ListElementReference<int64_t,c10::detail::ListImpl::list_type::iterator>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LongElementReference extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LongElementReference(Pointer p) { super(p); }

  public native @Name("operator std::conditional_t<std::is_reference<c10::detail::ivalue_to_const_ref_overload_return<int64_t>::type>::value,const int64_t&,int64_t>") long getLong();

  

  

  // assigning another ref to this assigns the underlying value
  

  public native @Const @ByRef IValue get();

  private static native @Namespace void swap(@ByRef(true) LongElementReference lhs, @ByRef(true) LongElementReference rhs);
  public void swap(LongElementReference rhs) { swap(this, rhs); }

  
  
}
