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


/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btPoint2PointConstraintFloatData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btPoint2PointConstraintFloatData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btPoint2PointConstraintFloatData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btPoint2PointConstraintFloatData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btPoint2PointConstraintFloatData position(long position) {
        return (btPoint2PointConstraintFloatData)super.position(position);
    }
    @Override public btPoint2PointConstraintFloatData getPointer(long i) {
        return new btPoint2PointConstraintFloatData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btTypedConstraintData m_typeConstraintData(); public native btPoint2PointConstraintFloatData m_typeConstraintData(btTypedConstraintData setter);
	public native @ByRef btVector3FloatData m_pivotInA(); public native btPoint2PointConstraintFloatData m_pivotInA(btVector3FloatData setter);
	public native @ByRef btVector3FloatData m_pivotInB(); public native btPoint2PointConstraintFloatData m_pivotInB(btVector3FloatData setter);
}
