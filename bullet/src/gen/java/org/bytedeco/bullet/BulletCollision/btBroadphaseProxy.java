// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btBroadphaseProxy is the main class that can be used with the Bullet broadphases.
 * It stores collision shape type information, collision filter information and a client object, typically a btCollisionObject or btRigidBody. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btBroadphaseProxy extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btBroadphaseProxy(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btBroadphaseProxy(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btBroadphaseProxy position(long position) {
        return (btBroadphaseProxy)super.position(position);
    }
    @Override public btBroadphaseProxy getPointer(long i) {
        return new btBroadphaseProxy((Pointer)this).offsetAddress(i);
    }


	/**optional filtering to cull potential collisions */
	/** enum btBroadphaseProxy::CollisionFilterGroups */
	public static final int
		DefaultFilter = 1,
		StaticFilter = 2,
		KinematicFilter = 4,
		DebrisFilter = 8,
		SensorTrigger = 16,
		CharacterFilter = 32,
		AllFilter = -1;  //all bits sets: DefaultFilter | StaticFilter | KinematicFilter | DebrisFilter | SensorTrigger

	//Usually the client btCollisionObject or Rigidbody class
	public native Pointer m_clientObject(); public native btBroadphaseProxy m_clientObject(Pointer setter);
	public native int m_collisionFilterGroup(); public native btBroadphaseProxy m_collisionFilterGroup(int setter);
	public native int m_collisionFilterMask(); public native btBroadphaseProxy m_collisionFilterMask(int setter);

	public native int m_uniqueId(); public native btBroadphaseProxy m_uniqueId(int setter);  //m_uniqueId is introduced for paircache. could get rid of this, by calculating the address offset etc.

	public native @ByRef btVector3 m_aabbMin(); public native btBroadphaseProxy m_aabbMin(btVector3 setter);
	public native @ByRef btVector3 m_aabbMax(); public native btBroadphaseProxy m_aabbMax(btVector3 setter);

	public native int getUid();

	//used for memory pools
	public btBroadphaseProxy() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btBroadphaseProxy(@Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax, Pointer userPtr, int collisionFilterGroup, int collisionFilterMask) { super((Pointer)null); allocate(aabbMin, aabbMax, userPtr, collisionFilterGroup, collisionFilterMask); }
	private native void allocate(@Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax, Pointer userPtr, int collisionFilterGroup, int collisionFilterMask);

	public static native @Cast("bool") boolean isPolyhedral(int proxyType);

	public static native @Cast("bool") boolean isConvex(int proxyType);

	public static native @Cast("bool") boolean isNonMoving(int proxyType);

	public static native @Cast("bool") boolean isConcave(int proxyType);
	public static native @Cast("bool") boolean isCompound(int proxyType);

	public static native @Cast("bool") boolean isSoftBody(int proxyType);

	public static native @Cast("bool") boolean isInfinite(int proxyType);

	public static native @Cast("bool") boolean isConvex2d(int proxyType);
}
