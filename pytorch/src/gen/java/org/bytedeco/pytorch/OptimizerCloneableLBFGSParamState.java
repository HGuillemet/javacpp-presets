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


@Name("torch::optim::OptimizerCloneableParamState<torch::optim::LBFGSParamState>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptimizerCloneableLBFGSParamState extends OptimizerParamState {
    static { Loader.load(); }
    /** Default native constructor. */
    public OptimizerCloneableLBFGSParamState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptimizerCloneableLBFGSParamState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerCloneableLBFGSParamState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OptimizerCloneableLBFGSParamState position(long position) {
        return (OptimizerCloneableLBFGSParamState)super.position(position);
    }
    @Override public OptimizerCloneableLBFGSParamState getPointer(long i) {
        return new OptimizerCloneableLBFGSParamState((Pointer)this).offsetAddress(i);
    }

}
