// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class MyInternalTriangleIndexCallback extends btInternalTriangleIndexCallback {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MyInternalTriangleIndexCallback(Pointer p) { super(p); }

	public native @Const btGImpactMeshShape m_gimpactShape(); public native MyInternalTriangleIndexCallback m_gimpactShape(btGImpactMeshShape setter);
	public native btCompoundShape m_colShape(); public native MyInternalTriangleIndexCallback m_colShape(btCompoundShape setter);
	public native @Cast("btScalar") double m_depth(); public native MyInternalTriangleIndexCallback m_depth(double setter);

	public MyInternalTriangleIndexCallback(btCompoundShape colShape, @Const btGImpactMeshShape meshShape, @Cast("btScalar") double depth) { super((Pointer)null); allocate(colShape, meshShape, depth); }
	private native void allocate(btCompoundShape colShape, @Const btGImpactMeshShape meshShape, @Cast("btScalar") double depth);

	public native void internalProcessTriangleIndex(btVector3 triangle, int partId, int triangleIndex);
}
