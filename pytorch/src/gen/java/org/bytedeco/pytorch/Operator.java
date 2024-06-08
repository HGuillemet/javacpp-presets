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


/*
 * Note: JIT relies on Operator instances having static lifetime, because
 * it for example stores a non-owning FunctionSchema* pointer in the Node class,
 * which points to the function schema stored in the Operator instance.
 * Also, jit::Operator is meant to store more operator related information like
 * symbolic derivatives, which also requires them to have static lifetime
 * so that changes to symbolic derivatives are remembered.
 *
 * Currently, the JIT operator library contains a jit::Operator instance
 * with a wrapper for each c10 operator. The c10 operator library registers
 * those wrappers using listeners in register_c10_ops.cpp.
 * TODO Instead of doing it this way, we should only have pure-jit ops in
 * the jit library but have the JIT operator lookup look into the c10 library
 * too.
 */

// An Operator is a thin wrapper around either a pure JIT operator (e.g. prim
// ops) or a c10 operator, allowing some common operations and abstracting away
// the concrete operator nature.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Operator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Operator(Pointer p) { super(p); }


  // Helper constructor to register `op` to run
  // run for _every_ IR Node where n.kind() == name, regardless of arguments.
  // This is accomplished by marking the schema varargs and having no required
  // arguments.

  public native @ByVal Operation getOperation(@Const JitNode node/*=nullptr*/);
  public native @ByVal Operation getOperation();

  public native @ByVal Operation getOperationForDispatchKey(DispatchKey dk);
  public native @ByVal Operation getOperationForDispatchKey(@Cast("c10::DispatchKey") short dk);

  public native @Const @ByRef FunctionSchema schema();

  public native @ByVal TagArrayRef getTags();

  public native @Cast("bool") boolean isC10Op();

  public native AliasAnalysisKind aliasAnalysisKind();

  public native @Cast("bool") boolean hasOperation();
}
