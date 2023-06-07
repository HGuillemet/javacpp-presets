// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


/**
 * An instance of DispatchKeyExtractor knows how to get a dispatch key given
 * a list of arguments for an operator call.
 *
 * The instance is specific for a certain operator as:
 *  - In boxed dispatch, different operators have different ways to extract
 *    the dispatch key (e.g. different numbers of arguments), and we precompute
 *    the stack locations we should look at; and
 *  - In all dispatch, some backends should be excluded from dispatch because
 *    they have been registered as fallthrough.  The set of excluded backends
 *    varies from operator, as some operators may have overridden the
 *    fallthrough with custom behavior.
 *
 *   Note - this should maintain identical impl to the py dispatcher key extraction logic
 *   at pytorch/torch/dispatcher.py
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DispatchKeyExtractor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DispatchKeyExtractor(Pointer p) { super(p); }

  public static native @ByVal DispatchKeyExtractor make(@Const @ByRef FunctionSchema schema);

  public static native @ByVal DispatchKeyExtractor makeUninitialized();

  public native void registerSchema(@Const @ByRef FunctionSchema schema);
  public native void deregisterSchema();

  public native @ByVal DispatchKeySet getDispatchKeySetBoxed(@Const IValueVector stack);

  public native void setOperatorHasFallthroughForKey(DispatchKey k, @Cast("bool") boolean has_fallthrough);
  public native void setOperatorHasFallthroughForKey(@Cast("c10::DispatchKey") short k, @Cast("bool") boolean has_fallthrough);

  public native @StdString BytePointer dumpState();
  public native void checkInvariants(@Const @ByRef FunctionSchema schema);
}
