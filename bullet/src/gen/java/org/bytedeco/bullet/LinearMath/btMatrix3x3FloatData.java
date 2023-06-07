// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


/**for serialization */
@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btMatrix3x3FloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btMatrix3x3FloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMatrix3x3FloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMatrix3x3FloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btMatrix3x3FloatData position(long position) {
        return (btMatrix3x3FloatData)super.position(position);
    }
    @Override public btMatrix3x3FloatData getPointer(long i) {
        return new btMatrix3x3FloatData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3FloatData m_el(int i); public native btMatrix3x3FloatData m_el(int i, btVector3FloatData setter);
	@MemberGetter public native btVector3FloatData m_el();
}
