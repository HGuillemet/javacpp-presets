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


/**
 * A value with optional extra name and location information. Used during
 * schema matching to provide extra error information and resolve kwargs.
 */
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NamedValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NamedValue(Pointer p) { super(p); }

  public NamedValue(@Const @ByRef SourceRange loc, @StdString BytePointer name, Value value) { super((Pointer)null); allocate(loc, name, value); }
  private native void allocate(@Const @ByRef SourceRange loc, @StdString BytePointer name, Value value);
  public NamedValue(@Const @ByRef SourceRange loc, @StdString String name, Value value) { super((Pointer)null); allocate(loc, name, value); }
  private native void allocate(@Const @ByRef SourceRange loc, @StdString String name, Value value);
  public NamedValue(@Const @ByRef SourceRange loc, Value value) { super((Pointer)null); allocate(loc, value); }
  private native void allocate(@Const @ByRef SourceRange loc, Value value);

  /* implicit */ public NamedValue(Value value) { super((Pointer)null); allocate(value); }
private native void allocate(Value value);
  public NamedValue(@StdString BytePointer name, Value value) { super((Pointer)null); allocate(name, value); }
  private native void allocate(@StdString BytePointer name, Value value);
  public NamedValue(@StdString String name, Value value) { super((Pointer)null); allocate(name, value); }
  private native void allocate(@StdString String name, Value value);

  /* implicit */ public NamedValue(@ByVal IValue value) { super((Pointer)null); allocate(value); }
private native void allocate(@ByVal IValue value);

  public NamedValue(@StdString BytePointer name, @ByVal IValue value) { super((Pointer)null); allocate(name, value); }
  private native void allocate(@StdString BytePointer name, @ByVal IValue value);
  public NamedValue(@StdString String name, @ByVal IValue value) { super((Pointer)null); allocate(name, value); }
  private native void allocate(@StdString String name, @ByVal IValue value);

  public native @ByVal SourceRange locOr(@Const @ByRef SourceRange backup_location);

  // note: this will insert a constant node into the graph at the current
  // insert point if this NamedValue is actually a constant
  public native Value value(@ByRef Graph g);

  public native @StdString BytePointer name();

  public native @Const @ByRef SourceRange loc();

  
}
