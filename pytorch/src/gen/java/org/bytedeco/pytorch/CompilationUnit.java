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


// A CompilationUnit is a list of named Functions
// with helper methods to iterate the list or invoke the function.
// Classes have a CompilationUnit holding the class methods,
// and Modules have a CompilationUnit holding the Functions that
// are used to implement their Methods

@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CompilationUnit extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompilationUnit(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CompilationUnit(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CompilationUnit position(long position) {
        return (CompilationUnit)super.position(position);
    }
    @Override public CompilationUnit getPointer(long i) {
        return new CompilationUnit((Pointer)this).offsetAddress(i);
    }

  public enum FunctionType { Method(0), Hook(1), PreHook(2);

      public final int value;
      private FunctionType(int v) { this.value = v; }
      private FunctionType(FunctionType e) { this.value = e.value; }
      public FunctionType intern() { for (FunctionType e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
  // constructor that takes a set of functions to compile using the native
  // resolver
  public CompilationUnit(@StdString BytePointer source) { super((Pointer)null); allocate(source); }
  @SharedPtr private native void allocate(@StdString BytePointer source);
  public CompilationUnit(@StdString String source) { super((Pointer)null); allocate(source); }
  @SharedPtr private native void allocate(@StdString String source);
  public CompilationUnit() { super((Pointer)null); allocate(); }
  @SharedPtr private native void allocate();

  public native @ByRef @Name("operator =") CompilationUnit put(@ByRef(true) CompilationUnit arg0);
  public CompilationUnit(@ByRef(true) CompilationUnit arg0) { super((Pointer)null); allocate(arg0); }
  @SharedPtr private native void allocate(@ByRef(true) CompilationUnit arg0);
  
  

  public native Function find_function(@Const @ByRef QualifiedName name);

  public native @ByRef Function get_function(@Const @ByRef QualifiedName name);

  public native void set_optimized(@Cast("bool") boolean o);

  public native @Cast("bool") boolean is_optimized();

  // for historic reasons, these are defined in ir_emitter.cpp
  // Returns the list of Functions just defined.
  public native @ByVal FunctionVector define(
        @Const @ByRef QualifiedNameOptional prefix,
        @Const @ByRef PropertyVector properties,
        @Const @ByRef ResolverVector propResolvers,
        @Const @ByRef DefVector definitions,
        @Const @ByRef ResolverVector defResolvers,
        @Const Self self,
        @Cast("bool") boolean shouldMangle/*=false*/,
        @ByVal(nullValue = "c10::optional<size_t>(c10::nullopt)") SizeTOptional operator_set_version);
  public native @ByVal FunctionVector define(
        @Const @ByRef QualifiedNameOptional prefix,
        @Const @ByRef PropertyVector properties,
        @Const @ByRef ResolverVector propResolvers,
        @Const @ByRef DefVector definitions,
        @Const @ByRef ResolverVector defResolvers,
        @Const Self self);

  public native void define_hooks(
        @Const @ByRef QualifiedNameOptional prefix,
        @Const @ByRef DefVector hookDefs,
        @Const @ByRef ResolverVector hookResolvers,
        @Const @ByRef DefVector preHookDefs,
        @Const @ByRef ResolverVector preHookResolvers,
        @Const Self self,
        @Cast("bool") boolean shouldMangle/*=false*/);
  public native void define_hooks(
        @Const @ByRef QualifiedNameOptional prefix,
        @Const @ByRef DefVector hookDefs,
        @Const @ByRef ResolverVector hookResolvers,
        @Const @ByRef DefVector preHookDefs,
        @Const @ByRef ResolverVector preHookResolvers,
        @Const Self self);

  // same as above but parse the definitions from source
  // Returns the list of Functions just defined.
  public native @ByVal FunctionVector define(
        @Const @ByRef QualifiedNameOptional prefix,
        @StdString BytePointer source,
        @Const @SharedPtr("torch::jit::Resolver") @ByRef Resolver resolver,
        @Const Self self);
  public native @ByVal FunctionVector define(
        @Const @ByRef QualifiedNameOptional prefix,
        @StdString String source,
        @Const @SharedPtr("torch::jit::Resolver") @ByRef Resolver resolver,
        @Const Self self);

  public native void define_interface(
        @Const @ByRef QualifiedName qualifiedName,
        @Const @ByRef ClassDef classDef,
        @SharedPtr("torch::jit::Resolver") @ByVal Resolver rcb,
        @Cast("bool") boolean is_module/*=false*/);
  public native void define_interface(
        @Const @ByRef QualifiedName qualifiedName,
        @Const @ByRef ClassDef classDef,
        @SharedPtr("torch::jit::Resolver") @ByVal Resolver rcb);

  public native Function create_function(
        @ByVal QualifiedName name,
        @SharedPtr("torch::jit::Graph") @ByVal Graph graph,
        @Cast("bool") boolean shouldMangle/*=false*/);
  public native Function create_function(
        @ByVal QualifiedName name,
        @SharedPtr("torch::jit::Graph") @ByVal Graph graph);

  
  ///
  ///
  ///
  public native @ByVal FunctionVector get_functions();

  /** Run a method from this compilation.
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

  public native void drop_all_functions();

  /**
   * Register a class as being owned by this compilation unit.
   */
  public native void register_type(@SharedPtr NamedType namedType);

  public native @SharedPtr("c10::ClassType") @ByVal ClassType get_class(@Const @ByRef QualifiedName name);

  public native @SharedPtr InterfaceType get_interface(@Const @ByRef QualifiedName name);

  public native @SharedPtr TupleType get_named_tuple(@Const @ByRef QualifiedName name);

  public native @SharedPtr NamedType get_type(@Const @ByRef QualifiedName name);

  // For testing: clear all Python-defined classes to ensure that unit tests
  // have isolation.
  

  // [Internal Only] Remove method.
  // Note Used for freezing.
  public native void unsafeRemoveMethod(@Const @ByRef QualifiedName method_name);

  // [name mangling] All code objects must have a unique qualified name in a
  // CompilationUnit. In Python, sometimes functions won't have unique qualified
  // name (for example, nested functions). So we mangle Python functions to
  // ensure that they are uniquely named.
  //
  // We also use mangling to distinguish different Module instances. Since each
  // Module is a singleton class instance, different instances of the same
  // Python Module will have different types but the same qualified name.
  public native @ByVal QualifiedName mangle(@Const @ByRef QualifiedName name);
}
