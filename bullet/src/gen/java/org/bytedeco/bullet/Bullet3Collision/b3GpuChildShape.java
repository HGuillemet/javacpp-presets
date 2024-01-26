// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;

@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3GpuChildShape extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3GpuChildShape() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3GpuChildShape(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuChildShape(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3GpuChildShape position(long position) {
        return (b3GpuChildShape)super.position(position);
    }
    @Override public b3GpuChildShape getPointer(long i) {
        return new b3GpuChildShape((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Vector3 m_childPosition(); public native b3GpuChildShape m_childPosition(b3Vector3 setter);
	public native @ByRef b3Quaternion m_childOrientation(); public native b3GpuChildShape m_childOrientation(b3Quaternion setter);
		public native int m_shapeIndex(); public native b3GpuChildShape m_shapeIndex(int setter);  //used for SHAPE_COMPOUND_OF_CONVEX_HULLS
		public native int m_capsuleAxis(); public native b3GpuChildShape m_capsuleAxis(int setter);
		public native float m_radius(); public native b3GpuChildShape m_radius(float setter);        //used for childshape of SHAPE_COMPOUND_OF_SPHERES or SHAPE_COMPOUND_OF_CAPSULES
		public native int m_numChildShapes(); public native b3GpuChildShape m_numChildShapes(int setter);  //used for compound shape
		public native float m_height(); public native b3GpuChildShape m_height(float setter);  //used for childshape of SHAPE_COMPOUND_OF_CAPSULES
		public native int m_collidableShapeIndex(); public native b3GpuChildShape m_collidableShapeIndex(int setter);
	public native int m_shapeType(); public native b3GpuChildShape m_shapeType(int setter);
}
