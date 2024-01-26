// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


/**For each triangle in the concave mesh that overlaps with the AABB of a soft body (m_softBody), processTriangle is called. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btSoftBodyTriangleCallback extends btTriangleCallback {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSoftBodyTriangleCallback(Pointer p) { super(p); }

	public native int m_triangleCount(); public native btSoftBodyTriangleCallback m_triangleCount(int setter);

	//	btPersistentManifold*	m_manifoldPtr;

	public btSoftBodyTriangleCallback(btDispatcher dispatcher, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Cast("bool") boolean isSwapped) { super((Pointer)null); allocate(dispatcher, body0Wrap, body1Wrap, isSwapped); }
	private native void allocate(btDispatcher dispatcher, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Cast("bool") boolean isSwapped);

	public native void setTimeStepAndCounters(@Cast("btScalar") double collisionMarginTriangle, @Const btCollisionObjectWrapper triObjWrap, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native void processTriangle(btVector3 triangle, int partId, int triangleIndex);

	public native void clearCache();

	public native @Const @ByRef btVector3 getAabbMin();
	public native @Const @ByRef btVector3 getAabbMax();
}
