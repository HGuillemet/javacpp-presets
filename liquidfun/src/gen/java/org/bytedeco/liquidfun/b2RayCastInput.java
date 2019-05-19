// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Ray-cast input data. The ray extends from p1 to p1 + maxFraction * (p2 - p1). */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2RayCastInput extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2RayCastInput() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2RayCastInput(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2RayCastInput(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2RayCastInput position(long position) {
        return (b2RayCastInput)super.position(position);
    }

	public native @ByRef b2Vec2 p1(); public native b2RayCastInput p1(b2Vec2 setter);
	public native @ByRef b2Vec2 p2(); public native b2RayCastInput p2(b2Vec2 setter);
	public native @Cast("float32") float maxFraction(); public native b2RayCastInput maxFraction(float setter);
}
