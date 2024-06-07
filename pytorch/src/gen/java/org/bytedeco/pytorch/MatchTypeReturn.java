// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MatchTypeReturn extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatchTypeReturn(Pointer p) { super(p); }

  public MatchTypeReturn(@StdString BytePointer reason) { super((Pointer)null); allocate(reason); }
  private native void allocate(@StdString BytePointer reason);
  public MatchTypeReturn(@StdString String reason) { super((Pointer)null); allocate(reason); }
  private native void allocate(@StdString String reason);
  public static native @ByVal MatchTypeReturn Success();
  public native @Cast("bool") boolean success();
  public native @StdString BytePointer reason();
}
