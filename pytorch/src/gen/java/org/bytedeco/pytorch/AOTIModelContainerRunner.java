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


@Namespace("torch::inductor") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AOTIModelContainerRunner extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AOTIModelContainerRunner(Pointer p) { super(p); }

  
  
  
  
  

  public native @ByVal TensorVector run(
        @ByRef TensorVector inputs);

  public native @ByVal ExtraFilesMap getConstantNamesToOriginalFQNs();
  public native @ByVal StringIntMap getConstantNamesToDtypes();
  public native void update_inactive_constant_buffer(@Cast("const torch::inductor::TensorConstantMap*") @ByRef SizeTStringMap const_map);
  public native void update_constant_buffer(
        @Cast("const torch::inductor::TensorConstantMap*") @ByRef SizeTStringMap const_map,
        @Cast("bool") boolean use_inactive,
        @Cast("bool") boolean validate_full_updates);
  public native void run_const_fold(
        @Cast("bool") boolean use_inactive);
  public native void swap_constant_buffer();

  public native @ByVal StringVector get_call_spec();
}
