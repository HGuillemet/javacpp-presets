// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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
public class btGeneric6DofConstraintData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btGeneric6DofConstraintData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGeneric6DofConstraintData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGeneric6DofConstraintData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btGeneric6DofConstraintData position(long position) {
        return (btGeneric6DofConstraintData)super.position(position);
    }
    @Override public btGeneric6DofConstraintData getPointer(long i) {
        return new btGeneric6DofConstraintData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btTypedConstraintData m_typeConstraintData(); public native btGeneric6DofConstraintData m_typeConstraintData(btTypedConstraintData setter);
	public native @ByRef btTransformFloatData m_rbAFrame(); public native btGeneric6DofConstraintData m_rbAFrame(btTransformFloatData setter);  // constraint axii. Assumes z is hinge axis.
	public native @ByRef btTransformFloatData m_rbBFrame(); public native btGeneric6DofConstraintData m_rbBFrame(btTransformFloatData setter);

	public native @ByRef btVector3FloatData m_linearUpperLimit(); public native btGeneric6DofConstraintData m_linearUpperLimit(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_linearLowerLimit(); public native btGeneric6DofConstraintData m_linearLowerLimit(btVector3FloatData setter);

	public native @ByRef btVector3FloatData m_angularUpperLimit(); public native btGeneric6DofConstraintData m_angularUpperLimit(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_angularLowerLimit(); public native btGeneric6DofConstraintData m_angularLowerLimit(btVector3FloatData setter);

	public native int m_useLinearReferenceFrameA(); public native btGeneric6DofConstraintData m_useLinearReferenceFrameA(int setter);
	public native int m_useOffsetForConstraintFrame(); public native btGeneric6DofConstraintData m_useOffsetForConstraintFrame(int setter);
}
