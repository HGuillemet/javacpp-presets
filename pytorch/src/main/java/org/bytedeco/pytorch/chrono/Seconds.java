package org.bytedeco.pytorch.chrono;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.*;

@Name("std::chrono::seconds") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Seconds extends Pointer {
    public Seconds() { allocate(); };
    private native void allocate();
    public Seconds(long r) { allocate(r); };
    private native void allocate(long r);
    public Seconds(Minutes d) {  super((Pointer)null); allocate(d); };
    private native void allocate(@Const @ByRef Minutes d);
    public Seconds(Hours d) {  super((Pointer)null); allocate(d); };
    private native void allocate(@Const @ByRef Hours d);

    public native @Name("operator=") @ByRef Seconds put(@Const @ByRef Seconds other);
    public native @Name("operator-") @ByVal Seconds negate();
    public native @Name("operator++") @ByRef Seconds increment();
    public native @Name("operator--") @ByRef Seconds decrement();
    public native @Name("operator+=") @ByRef Seconds addPut(@Const @ByRef Seconds d);
    public native @Name("operator-=") @ByRef Seconds subtractPut(@Const @ByRef Seconds d);
    public native @Name("operator*=") @ByRef Seconds multiplyPut(@Const @ByRef long rhs);
    public native @Name("operator%=") @ByRef Seconds modPut(@Const @ByRef long rhs);
    public native @Name("operator%=") @ByRef Seconds modPut(@Const @ByRef Seconds rhs);

    public native long count();
    static public native @ByVal @Name("zero") Seconds zero_();
    static public native @ByVal Seconds min();
    static public native @ByVal Seconds max();
}
