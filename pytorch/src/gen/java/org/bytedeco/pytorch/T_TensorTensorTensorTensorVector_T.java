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

@NoOffset @Name("std::tuple<torch::Tensor,torch::Tensor,torch::Tensor,std::vector<torch::Tensor> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class T_TensorTensorTensorTensorVector_T extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public T_TensorTensorTensorTensorVector_T(Pointer p) { super(p); }
    public T_TensorTensorTensorTensorVector_T(@ByRef Tensor value0, @ByRef Tensor value1, @ByRef Tensor value2, @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector value3) { allocate(value0, value1, value2, value3); }
    private native void allocate(@ByRef Tensor value0, @ByRef Tensor value1, @ByRef Tensor value2, @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector value3);
    public T_TensorTensorTensorTensorVector_T()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef T_TensorTensorTensorTensorVector_T put(@ByRef T_TensorTensorTensorTensorVector_T x);

    public @ByRef Tensor get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef Tensor get0(@ByRef T_TensorTensorTensorTensorVector_T container);
    public @ByRef Tensor get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef Tensor get1(@ByRef T_TensorTensorTensorTensorVector_T container);
    public @ByRef Tensor get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @ByRef Tensor get2(@ByRef T_TensorTensorTensorTensorVector_T container);
    public @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector get3() { return get3(this); }
    @Namespace @Name("std::get<3>") public static native @Cast({"", "std::vector<torch::Tensor>"}) @StdMove TensorVector get3(@ByRef T_TensorTensorTensorTensorVector_T container);
}

