// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btConeTwistConstraintDoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btConeTwistConstraintDoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btConeTwistConstraintDoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConeTwistConstraintDoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btConeTwistConstraintDoubleData position(long position) {
        return (btConeTwistConstraintDoubleData)super.position(position);
    }
    @Override public btConeTwistConstraintDoubleData getPointer(long i) {
        return new btConeTwistConstraintDoubleData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btTypedConstraintDoubleData m_typeConstraintData(); public native btConeTwistConstraintDoubleData m_typeConstraintData(btTypedConstraintDoubleData setter);
	public native @ByRef btTransformDoubleData m_rbAFrame(); public native btConeTwistConstraintDoubleData m_rbAFrame(btTransformDoubleData setter);
	public native @ByRef btTransformDoubleData m_rbBFrame(); public native btConeTwistConstraintDoubleData m_rbBFrame(btTransformDoubleData setter);

	//limits
	public native double m_swingSpan1(); public native btConeTwistConstraintDoubleData m_swingSpan1(double setter);
	public native double m_swingSpan2(); public native btConeTwistConstraintDoubleData m_swingSpan2(double setter);
	public native double m_twistSpan(); public native btConeTwistConstraintDoubleData m_twistSpan(double setter);
	public native double m_limitSoftness(); public native btConeTwistConstraintDoubleData m_limitSoftness(double setter);
	public native double m_biasFactor(); public native btConeTwistConstraintDoubleData m_biasFactor(double setter);
	public native double m_relaxationFactor(); public native btConeTwistConstraintDoubleData m_relaxationFactor(double setter);

	public native double m_damping(); public native btConeTwistConstraintDoubleData m_damping(double setter);
}
