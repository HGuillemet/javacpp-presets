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


/**
 * ModuleInstanceInfo is a structure to include the module type and instance
 * name. It also provide public methods to get the pointer to module type and
 * instance name.
 *
 * This structure is mainly used as a private member in InlinedCallStack, such
 * that one can follow the callstack to find the relevant module hierarchy.
 */
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ModuleInstanceInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModuleInstanceInfo(Pointer p) { super(p); }

  public native @SharedPtr("c10::ClassType") @ByVal ClassType class_type();
  public native @StdString BytePointer instance_name();

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef ModuleInstanceInfo rhs);
}
