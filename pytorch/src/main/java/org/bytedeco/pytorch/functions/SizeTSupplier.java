package org.bytedeco.pytorch.functions;

import org.bytedeco.javacpp.FunctionPointer;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Properties;

@Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SizeTSupplier extends FunctionPointer {
    static {
        Loader.load();
    }

    /**
     * Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}.
     */
    public SizeTSupplier(Pointer p) {
        super(p);
    }

    protected SizeTSupplier() {
        allocate();
    }

    private native void allocate();

    public native @Cast("size_t") long call();
}
