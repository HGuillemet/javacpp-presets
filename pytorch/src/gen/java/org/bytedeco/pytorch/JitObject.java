// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
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


@Name("torch::jit::Object") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JitObject extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JitObject(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JitObject(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public JitObject position(long position) {
        return (JitObject)super.position(position);
    }
    @Override public JitObject getPointer(long i) {
        return new JitObject((Pointer)this).offsetAddress(i);
    }

  public JitObject() { super((Pointer)null); allocate(); }
  private native void allocate();
  public JitObject(@Const @ByRef JitObject arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef JitObject arg0);
  public native @ByRef @Name("operator =") JitObject put(@Const @ByRef JitObject arg0);
  public JitObject(@IntrusivePtr("c10::ivalue::Object") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Object>&"}) Obj _ivalue) { super((Pointer)null); allocate(_ivalue); }
  private native void allocate(@IntrusivePtr("c10::ivalue::Object") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Object>&"}) Obj _ivalue);
  public JitObject(@SharedPtr("torch::jit::CompilationUnit") @ByVal CompilationUnit cu, @Const @SharedPtr("c10::ClassType") @ByRef ClassType type) { super((Pointer)null); allocate(cu, type); }
  private native void allocate(@SharedPtr("torch::jit::CompilationUnit") @ByVal CompilationUnit cu, @Const @SharedPtr("c10::ClassType") @ByRef ClassType type);
  

  public native @IntrusivePtr("c10::ivalue::Object") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Object>&"}) Obj _ivalue();

  public native @SharedPtr("c10::ClassType") @ByVal ClassType type();

  public static class Property extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Property(Pointer p) { super(p); }
  
    public native @StdString @NoOffset BytePointer name(); public native Property name(BytePointer setter);
    public native @ByRef @NoOffset Method getter_func(); public native Property getter_func(Method setter);
    public native @ByRef @NoOffset MethodOptional setter_func(); public native Property setter_func(MethodOptional setter);
  }

  public native void setattr(@StdString BytePointer name, @ByVal IValue v);
  public native void setattr(@StdString String name, @ByVal IValue v);

  public native @ByVal IValue attr(@StdString BytePointer name);
  public native @ByVal IValue attr(@StdString String name);

  public native @ByVal IValue attr(@StdString BytePointer name, @ByVal IValue or_else);
  public native @ByVal IValue attr(@StdString String name, @ByVal IValue or_else);

  public native @Cast("bool") boolean hasattr(@StdString BytePointer name);
  public native @Cast("bool") boolean hasattr(@StdString String name);

  // each object owns its methods. The reference returned here
  // is guaranteed to stay valid until this module has been destroyed
  public native @ByVal Method get_method(@StdString BytePointer name);
  public native @ByVal Method get_method(@StdString String name);

  public native @StdVector Method get_methods();

  public native @Cast("bool") boolean has_property(@StdString BytePointer name);
  public native @Cast("bool") boolean has_property(@StdString String name);

  public native @Const @ByVal Property get_property(@StdString BytePointer name);
  public native @Const @ByVal Property get_property(@StdString String name);

  public native @StdVector Property get_properties();

  
  ///
  ///
  ///
  public native @ByVal MethodOptional find_method(@StdString BytePointer basename);
  public native @ByVal MethodOptional find_method(@StdString String basename);

  /** Run a method from this module.
   * 
   *  For example:
   *  <pre>{@code
   *    IValue output = module->run("relu_script", a, b);
   *  }</pre>
   * 
   *  To get a compile a module from a source string, see torch::jit::compile
   * 
   *  @param method_name The name of the method to run
   *  @param args Arguments to be passed to the method
   *  @return An IValue containing the return value (or values if it is a tuple)
   *  from the method */

  // so that C++ users can easily add methods
  public native void define(@StdString BytePointer src, @Const @SharedPtr("torch::jit::Resolver") @ByRef(nullValue = "std::shared_ptr<torch::jit::Resolver>(nullptr)") Resolver resolver);
  public native void define(@StdString BytePointer src);
  public native void define(@StdString String src, @Const @SharedPtr("torch::jit::Resolver") @ByRef(nullValue = "std::shared_ptr<torch::jit::Resolver>(nullptr)") Resolver resolver);
  public native void define(@StdString String src);

  public native @Cast("size_t") long num_slots();

  // shallow copy the object
  public native @ByVal JitObject copy();

  // Copies all the attributes of the object recursively without creating new
  // `ClassType`, including deepcopy of Tensors
  public native @ByVal JitObject deepcopy();
}
