// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Dynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;

import static org.bytedeco.bullet.global.Bullet3Dynamics.*;


/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3Point2PointConstraintDoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3Point2PointConstraintDoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3Point2PointConstraintDoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Point2PointConstraintDoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3Point2PointConstraintDoubleData position(long position) {
        return (b3Point2PointConstraintDoubleData)super.position(position);
    }
    @Override public b3Point2PointConstraintDoubleData getPointer(long i) {
        return new b3Point2PointConstraintDoubleData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3TypedConstraintData m_typeConstraintData(); public native b3Point2PointConstraintDoubleData m_typeConstraintData(b3TypedConstraintData setter);
	public native @ByRef b3Vector3DoubleData m_pivotInA(); public native b3Point2PointConstraintDoubleData m_pivotInA(b3Vector3DoubleData setter);
	public native @ByRef b3Vector3DoubleData m_pivotInB(); public native b3Point2PointConstraintDoubleData m_pivotInB(b3Vector3DoubleData setter);
}
