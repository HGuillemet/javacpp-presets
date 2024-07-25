package org.bytedeco.pytorch.chrono;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.*;

@Name("std::chrono::minutes") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Minutes extends Pointer {
    public Minutes() {  super((Pointer)null); allocate(); };
    private native void allocate();
    public Minutes(long r) {  super((Pointer)null); allocate(r); };
    private native void allocate(long r);
    public Minutes(Hours d) { allocate(d); }
    private native void allocate(@Const @ByRef Hours d);

    public native @Name("operator=") @ByRef Minutes put(@Const @ByRef Minutes other);
    public native @Name("operator-") @ByVal Minutes negate();
    public native @Name("operator++") @ByRef Minutes increment();
    public native @Name("operator--") @ByRef Minutes decrement();
    public native @Name("operator+=") @ByRef Minutes addPut(@Const @ByRef Minutes d);
    public native @Name("operator-=") @ByRef Minutes subtractPut(@Const @ByRef Minutes d);
    public native @Name("operator*=") @ByRef Minutes multiplyPut(@Const @ByRef int rhs);
    public native @Name("operator%=") @ByRef Minutes modPut(@Const @ByRef int rhs);
    public native @Name("operator%=") @ByRef Minutes modPut(@Const @ByRef Minutes rhs);

    public native int count();
    static public native @ByVal @Name("zero") Minutes zero_();
    static public native @ByVal Minutes min();
    static public native @ByVal Minutes max();
}
