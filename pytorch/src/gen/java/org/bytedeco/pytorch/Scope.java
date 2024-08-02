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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Scope extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Scope(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Scope(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Scope position(long position) {
        return (Scope)super.position(position);
    }
    @Override public Scope getPointer(long i) {
        return new Scope((Pointer)this).offsetAddress(i);
    }

  public Scope() { super((Pointer)null); allocate(); }
  private native void allocate();

  public Scope(@ByVal @Cast("torch::jit::ScopePtr*") Pointer parent, @ByVal Symbol name) { super((Pointer)null); allocate(parent, name); }
  private native void allocate(@ByVal @Cast("torch::jit::ScopePtr*") Pointer parent, @ByVal Symbol name);

  public native @ByVal @Cast("torch::jit::ScopePtr*") Pointer push(@ByVal Symbol name);

  public native @ByVal @Cast("torch::jit::ScopePtr*") Pointer parent();

  public native @Cast("bool") boolean isRoot();

  public native @Cast("bool") boolean isBlank();

  public native @ByVal @Cast("torch::jit::ScopePtr*") Pointer getRoot();

  public native @Cast("size_t") long getDepth();

  public native @ByVal Symbol name();

  public native @StdString BytePointer namesFromRoot(@StdString BytePointer separator/*="/"*/);
  public native @StdString BytePointer namesFromRoot();
  public native @StdString String namesFromRoot(@StdString String separator/*="/"*/);
}
