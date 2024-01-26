// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RegistrationHandleRAII extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegistrationHandleRAII(Pointer p) { super(p); }

  public RegistrationHandleRAII(@ByVal Func onDestruction) { super((Pointer)null); allocate(onDestruction); }
  private native void allocate(@ByVal Func onDestruction);

  
  

  public RegistrationHandleRAII(@ByRef(true) RegistrationHandleRAII rhs) { super((Pointer)null); allocate(rhs); }
  @NoException(true) private native void allocate(@ByRef(true) RegistrationHandleRAII rhs);

  public native @ByRef @Name("operator =") @NoException(true) RegistrationHandleRAII put(@ByRef(true) RegistrationHandleRAII rhs);
}
