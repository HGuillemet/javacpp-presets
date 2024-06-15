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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ZeroPad2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Applies ZeroPad over a 2-D input.
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ZeroPad2dImpl extends ZeroPad2dImplBase {
    static { Loader.load(); }

  
    public ZeroPad2dImpl(@ByVal @Cast("torch::ExpandingArray<2*2>*") LongPointer padding) { super((Pointer)null); allocate(padding); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArray<2*2>*") LongPointer padding);
    public ZeroPad2dImpl(@Const @ByRef ZeroPad2dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef ZeroPad2dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ZeroPad2dImpl(Pointer p) { super(p); }

}
