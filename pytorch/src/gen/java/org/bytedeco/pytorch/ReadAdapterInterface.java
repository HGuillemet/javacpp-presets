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


// this is the interface for the (file/stream/memory) reader in
// PyTorchStreamReader. with this interface, we can extend the support
// besides standard istream
@Namespace("caffe2::serialize") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReadAdapterInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReadAdapterInterface(Pointer p) { super(p); }

  public native @Cast("size_t") long size();
  public native @Cast("size_t") long read(@Cast("uint64_t") long pos, Pointer buf, @Cast("size_t") long n, @Cast("const char*") BytePointer what/*=""*/);
  public native @Cast("size_t") long read(@Cast("uint64_t") long pos, Pointer buf, @Cast("size_t") long n);
  public native @Cast("size_t") long read(@Cast("uint64_t") long pos, Pointer buf, @Cast("size_t") long n, String what/*=""*/);
}
