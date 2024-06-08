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


// things that look like function applications, but
// perform non-standard evaluation are represented
// with SpecialFormValues, e.g.
//   isinstance(x, int)
//   fork(fn)
//   annotate(int, 3)
// The implementation of each value is handled by a case inside emitApplyExpr
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SpecialFormValue extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpecialFormValue(Pointer p) { super(p); }

  public SpecialFormValue(@ByVal Symbol form) { super((Pointer)null); allocate(form); }
  private native void allocate(@ByVal Symbol form);
  public native @StdString BytePointer kind();
  public native @ByVal Symbol form();
  public static native @SharedPtr SpecialFormValue create(@ByVal Symbol form);
}
