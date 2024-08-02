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


// internal build errors with std::variant :/
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WeakOrStrongCompilationUnit extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WeakOrStrongCompilationUnit(Pointer p) { super(p); }

  public WeakOrStrongCompilationUnit(
        @SharedPtr("torch::jit::CompilationUnit") @ByVal CompilationUnit shared_cu) { super((Pointer)null); allocate(shared_cu); }
  private native void allocate(
        @SharedPtr("torch::jit::CompilationUnit") @ByVal CompilationUnit shared_cu);

  public native @SharedPtr("torch::jit::CompilationUnit") @ByVal CompilationUnit getStrongRefOrThrow();

  public native @WeakPtr("torch::jit::CompilationUnit") @ByVal CompilationUnit getWeakRefOrThrow();

  public native @Cast("bool") boolean holdingStrongRef();

  public native @Cast("bool") boolean holdingEmptyStrongRef();

  public native @ByRef @Cast("std::optional<std::shared_ptr<torch::jit::CompilationUnit> >*") Pointer strong_ptr_(); public native WeakOrStrongCompilationUnit strong_ptr_(Pointer setter);
  public native @ByRef @Cast("std::optional<std::weak_ptr<torch::jit::CompilationUnit> >*") Pointer weak_ptr_(); public native WeakOrStrongCompilationUnit weak_ptr_(Pointer setter);
}
