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


@Name("c10::ivalue::Await") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Await extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Await(Pointer p) { super(p); }

  
  
  
  

  public native @ByVal @Name("wait") IValue _wait();

  public native @ByVal IValue value();

  public native void setFn(@ByVal IValueSupplier fn);

  public native @Cast("bool") boolean completed();

  public native void markCompleted(@ByVal IValue value);

  

  public native @ByVal Type.TypePtr elementType();

  public native @ByVal Type.TypePtr type();

  public native void setArgs(@ByVal IValueVector args);

  public native @ByRef IValueVector args();
}
