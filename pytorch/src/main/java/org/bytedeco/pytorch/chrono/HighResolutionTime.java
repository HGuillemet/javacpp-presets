package org.bytedeco.pytorch.chrono;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.*;

@Name("std::chrono::time_point<std::chrono::high_resolution_clock>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class HighResolutionTime extends Pointer {
    public HighResolutionTime() {  super((Pointer)null); allocate(); }
    private native void allocate();

    public HighResolutionTime(SystemDuration d) { super((Pointer) null); allocate(d); }
    private native void allocate(@Const @ByRef SystemDuration d);

    public native @ByVal HighResolutionTime time_since_epoch();

    public native @Name("operator +=") @ByRef HighResolutionTime addPut(@Const @ByRef HighResolutionDuration d);
    public native @Name("operator -=") @ByRef HighResolutionTime subtractPut(@Const @ByRef HighResolutionDuration d);
    static public native @ByVal HighResolutionTime min();
    static public native @ByVal HighResolutionTime max();
}
