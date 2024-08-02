// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.helper.*;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.chrono.Chrono.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.cusparse.*;
import static org.bytedeco.cuda.global.cusparse.*;
import org.bytedeco.cuda.cusolver.*;
import static org.bytedeco.cuda.global.cusolver.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


@Namespace("c10::cuda::CUDACachingAllocator") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class AllocatorConfigInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AllocatorConfigInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AllocatorConfigInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllocatorConfigInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AllocatorConfigInfo position(long position) {
        return (AllocatorConfigInfo)super.position(position);
    }
    @Override public AllocatorConfigInfo getPointer(long i) {
        return new AllocatorConfigInfo((Pointer)this).offsetAddress(i);
    }

  public native double garbage_collection_threshold(); public native AllocatorConfigInfo garbage_collection_threshold(double setter);
  public native @Cast("size_t") long max_split_size(); public native AllocatorConfigInfo max_split_size(long setter);
  public native @Cast("size_t") long pinned_num_register_threads(); public native AllocatorConfigInfo pinned_num_register_threads(long setter);
  public native @Cast("bool") boolean expandable_segments(); public native AllocatorConfigInfo expandable_segments(boolean setter);
  public native @Cast("bool") boolean release_lock_on_malloc(); public native AllocatorConfigInfo release_lock_on_malloc(boolean setter);
  public native @Cast("bool") boolean pinned_use_host_register(); public native AllocatorConfigInfo pinned_use_host_register(boolean setter);
  public native @StdString BytePointer last_allocator_settings(); public native AllocatorConfigInfo last_allocator_settings(BytePointer setter);
  public native @ByRef @Cast("std::vector<size_t>*") SizeTVector roundup_power2_divisions(); public native AllocatorConfigInfo roundup_power2_divisions(SizeTVector setter);
}
