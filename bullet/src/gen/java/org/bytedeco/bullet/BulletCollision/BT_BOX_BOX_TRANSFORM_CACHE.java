// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**  Class for transforming a model1 to the space of model0 */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class BT_BOX_BOX_TRANSFORM_CACHE extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BT_BOX_BOX_TRANSFORM_CACHE(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BT_BOX_BOX_TRANSFORM_CACHE(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BT_BOX_BOX_TRANSFORM_CACHE position(long position) {
        return (BT_BOX_BOX_TRANSFORM_CACHE)super.position(position);
    }
    @Override public BT_BOX_BOX_TRANSFORM_CACHE getPointer(long i) {
        return new BT_BOX_BOX_TRANSFORM_CACHE((Pointer)this).offsetAddress(i);
    }

	/** Transforms translation of model1 to model 0 */
	public native @ByRef btVector3 m_T1to0(); public native BT_BOX_BOX_TRANSFORM_CACHE m_T1to0(btVector3 setter);
	/** Transforms Rotation of model1 to model 0, equal  to R0' * R1 */
	public native @ByRef btMatrix3x3 m_R1to0(); public native BT_BOX_BOX_TRANSFORM_CACHE m_R1to0(btMatrix3x3 setter);
	/** Absolute value of m_R1to0 */
	public native @ByRef btMatrix3x3 m_AR(); public native BT_BOX_BOX_TRANSFORM_CACHE m_AR(btMatrix3x3 setter);

	public native void calc_absolute_matrix();

	public BT_BOX_BOX_TRANSFORM_CACHE() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Calc the transformation relative  1 to 0. Inverts matrics by transposing */
	public native void calc_from_homogenic(@Const @ByRef btTransform trans0, @Const @ByRef btTransform trans1);

	/** Calcs the full invertion of the matrices. Useful for scaling matrices */
	public native void calc_from_full_invert(@Const @ByRef btTransform trans0, @Const @ByRef btTransform trans1);

	public native @ByVal btVector3 transform(@Const @ByRef btVector3 point);
}
