// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ParticleContact extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2ParticleContact() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ParticleContact(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ParticleContact(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2ParticleContact position(long position) {
        return (b2ParticleContact)super.position(position);
    }

	public native void SetIndices(@Cast("int32") int a, @Cast("int32") int b);
	public native void SetWeight(@Cast("float32") float w);
	public native void SetNormal(@Const @ByRef b2Vec2 n);
	public native void SetFlags(@Cast("uint32") long f);

	public native @Cast("int32") int GetIndexA();
	public native @Cast("int32") int GetIndexB();
	public native @Cast("float32") float GetWeight();
	public native @Const @ByRef b2Vec2 GetNormal();
	public native @Cast("uint32") long GetFlags();

	public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef b2ParticleContact rhs);
	public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef b2ParticleContact rhs);
	public native @Cast("bool") boolean ApproximatelyEqual(@Const @ByRef b2ParticleContact rhs);
}
