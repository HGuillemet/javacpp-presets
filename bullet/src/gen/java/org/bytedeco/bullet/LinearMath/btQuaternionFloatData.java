// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btQuaternionFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btQuaternionFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btQuaternionFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btQuaternionFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btQuaternionFloatData position(long position) {
        return (btQuaternionFloatData)super.position(position);
    }
    @Override public btQuaternionFloatData getPointer(long i) {
        return new btQuaternionFloatData((Pointer)this).offsetAddress(i);
    }

	public native float m_floats(int i); public native btQuaternionFloatData m_floats(int i, float setter);
	@MemberGetter public native FloatPointer m_floats();
}
