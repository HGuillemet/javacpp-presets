// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


// #ifdef PFX_USE_FREE_VECTORMATH
// #else
// Don't change following order of parameters
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConstraintRow extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btConstraintRow() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btConstraintRow(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConstraintRow(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btConstraintRow position(long position) {
        return (btConstraintRow)super.position(position);
    }
    @Override public btConstraintRow getPointer(long i) {
        return new btConstraintRow((Pointer)this).offsetAddress(i);
    }

	public native @Cast("btScalar") double m_normal(int i); public native btConstraintRow m_normal(int i, double setter);
	@MemberGetter public native @Cast("btScalar*") DoublePointer m_normal();
	public native @Cast("btScalar") double m_rhs(); public native btConstraintRow m_rhs(double setter);
	public native @Cast("btScalar") double m_jacDiagInv(); public native btConstraintRow m_jacDiagInv(double setter);
	public native @Cast("btScalar") double m_lowerLimit(); public native btConstraintRow m_lowerLimit(double setter);
	public native @Cast("btScalar") double m_upperLimit(); public native btConstraintRow m_upperLimit(double setter);
	public native @Cast("btScalar") double m_accumImpulse(); public native btConstraintRow m_accumImpulse(double setter);
}
