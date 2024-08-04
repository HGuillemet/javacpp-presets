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
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


/** An {@code Example} from a dataset.
 * 
 *  A dataset consists of data and an associated target (label). */
@Name("torch::data::Example<torch::Tensor,torch::Tensor>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Example extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Example(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Example(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Example position(long position) {
        return (Example)super.position(position);
    }
    @Override public Example getPointer(long i) {
        return new Example((Pointer)this).offsetAddress(i);
    }


  public Example() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Example(@ByVal Tensor data, @ByVal Tensor target) { super((Pointer)null); allocate(data, target); }
  private native void allocate(@ByVal Tensor data, @ByVal Tensor target);

  public native @ByRef Tensor data(); public native Example data(Tensor setter);
  public native @ByRef Tensor target(); public native Example target(Tensor setter);
}
