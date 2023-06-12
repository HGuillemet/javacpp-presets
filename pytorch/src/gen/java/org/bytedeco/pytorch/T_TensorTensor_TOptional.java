// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

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

@NoOffset @Name("torch::optional<std::tuple<torch::Tensor,torch::Tensor> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class T_TensorTensor_TOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public T_TensorTensor_TOptional(Pointer p) { super(p); }
    public T_TensorTensor_TOptional(T_TensorTensor_T value) { this(); put(value); }
    public T_TensorTensor_TOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef T_TensorTensor_TOptional put(@ByRef T_TensorTensor_TOptional x);

    public native boolean has_value();
    public native @Name("value") @ByRef T_TensorTensor_T get();
    @ValueSetter public native T_TensorTensor_TOptional put(@ByRef T_TensorTensor_T value);
}

