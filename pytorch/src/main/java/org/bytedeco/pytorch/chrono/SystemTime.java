package org.bytedeco.pytorch.chrono;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.*;

@Name("std::chrono::time_point<std::chrono::system_clock>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SystemTime extends Pointer {
    public SystemTime() {  super((Pointer)null); allocate(); }
    private native void allocate();

    public SystemTime(SystemDuration d) { super((Pointer) null); allocate(d); }
    private native void allocate(@Const @ByRef SystemDuration d);

    public native @ByVal SystemDuration time_since_epoch();

    public native @Name("operator +=") @ByRef SystemTime addPut(@Const @ByRef SystemDuration d);
    public native @Name("operator -=") @ByRef SystemTime subtractPut(@Const @ByRef SystemDuration d);
    static public native @ByVal SystemTime min();
    static public native @ByVal SystemTime max();
}
