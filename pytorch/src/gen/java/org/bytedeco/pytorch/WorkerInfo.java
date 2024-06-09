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


// A globally unique ID to identify an RpcAgent
@Namespace("torch::distributed::rpc") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WorkerInfo extends CustomClassHolder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WorkerInfo(Pointer p) { super(p); }

  public WorkerInfo(@StdString BytePointer name, @Cast("int64_t") long id) { super((Pointer)null); allocate(name, id); }
  private native void allocate(@StdString BytePointer name, @Cast("int64_t") long id);
  public WorkerInfo(@StdString String name, @Cast("int64_t") long id) { super((Pointer)null); allocate(name, id); }
  private native void allocate(@StdString String name, @Cast("int64_t") long id);

  public WorkerInfo(@StdString BytePointer name, short id) { super((Pointer)null); allocate(name, id); }
  private native void allocate(@StdString BytePointer name, short id);
  public WorkerInfo(@StdString String name, short id) { super((Pointer)null); allocate(name, id); }
  private native void allocate(@StdString String name, short id);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef WorkerInfo rhs);

  @MemberGetter public static native @Cast("const size_t") long MAX_NAME_LEN();
  public static final long MAX_NAME_LEN = MAX_NAME_LEN();

  @MemberGetter public native @StdString BytePointer name_();
  @MemberGetter public native short id_();
}