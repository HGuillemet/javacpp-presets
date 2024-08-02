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


@Name("torch::optim::OptimizerCloneableOptions<torch::optim::AdamWOptions>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptimizerCloneableAdamWOptions extends OptimizerOptions {
    static { Loader.load(); }
    /** Default native constructor. */
    public OptimizerCloneableAdamWOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptimizerCloneableAdamWOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerCloneableAdamWOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OptimizerCloneableAdamWOptions position(long position) {
        return (OptimizerCloneableAdamWOptions)super.position(position);
    }
    @Override public OptimizerCloneableAdamWOptions getPointer(long i) {
        return new OptimizerCloneableAdamWOptions((Pointer)this).offsetAddress(i);
    }

}
