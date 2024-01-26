// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btPersistentManifold is a contact point cache, it stays persistent as long as objects are overlapping in the broadphase.
 * Those contact points are created by the collision narrow phase.
 * The cache can be empty, or hold 1,2,3 or 4 points. Some collision algorithms (GJK) might only add one point at a time.
 * updates/refreshes old contact points, and throw them away if necessary (distance becomes too large)
 * reduces the cache to 4 points, when more then 4 points are added, using following rules:
 * the contact point with deepest penetration is always kept, and it tries to maximuze the area covered by the points
 * note that some pairs of objects might have more then one contact manifold. */

//ATTRIBUTE_ALIGNED128( class) btPersistentManifold : public btTypedObject
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btPersistentManifold extends btTypedObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btPersistentManifold(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btPersistentManifold(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btPersistentManifold position(long position) {
        return (btPersistentManifold)super.position(position);
    }
    @Override public btPersistentManifold getPointer(long i) {
        return new btPersistentManifold((Pointer)this).offsetAddress(i);
    }


	public native int m_companionIdA(); public native btPersistentManifold m_companionIdA(int setter);
	public native int m_companionIdB(); public native btPersistentManifold m_companionIdB(int setter);

	public native int m_index1a(); public native btPersistentManifold m_index1a(int setter);

	public btPersistentManifold() { super((Pointer)null); allocate(); }
	private native void allocate();

	public btPersistentManifold(@Const btCollisionObject body0, @Const btCollisionObject body1, int arg2, @Cast("btScalar") double contactBreakingThreshold, @Cast("btScalar") double contactProcessingThreshold) { super((Pointer)null); allocate(body0, body1, arg2, contactBreakingThreshold, contactProcessingThreshold); }
	private native void allocate(@Const btCollisionObject body0, @Const btCollisionObject body1, int arg2, @Cast("btScalar") double contactBreakingThreshold, @Cast("btScalar") double contactProcessingThreshold);

	public native @Const btCollisionObject getBody0();
	public native @Const btCollisionObject getBody1();

	public native void setBodies(@Const btCollisionObject body0, @Const btCollisionObject body1);

	public native void clearUserCache(@ByRef btManifoldPoint pt);

// #ifdef DEBUG_PERSISTENCY
// #endif  //

	public native int getNumContacts();
	/** the setNumContacts API is usually not used, except when you gather/fill all contacts manually */
	public native void setNumContacts(int cachedPoints);

	public native @ByRef btManifoldPoint getContactPoint(int index);

	/**\todo: get this margin from the current physics / collision environment */
	public native @Cast("btScalar") double getContactBreakingThreshold();

	public native @Cast("btScalar") double getContactProcessingThreshold();

	public native void setContactBreakingThreshold(@Cast("btScalar") double contactBreakingThreshold);

	public native void setContactProcessingThreshold(@Cast("btScalar") double contactProcessingThreshold);

	public native int getCacheEntry(@Const @ByRef btManifoldPoint newPoint);

	public native int addManifoldPoint(@Const @ByRef btManifoldPoint newPoint, @Cast("bool") boolean isPredictive/*=false*/);
	public native int addManifoldPoint(@Const @ByRef btManifoldPoint newPoint);

	public native void removeContactPoint(int index);
	public native void replaceContactPoint(@Const @ByRef btManifoldPoint newPoint, int insertIndex);

	public native @Cast("bool") boolean validContactDistance(@Const @ByRef btManifoldPoint pt);
	/** calculated new worldspace coordinates and depth, and reject points that exceed the collision margin */
	public native void refreshContactPoints(@Const @ByRef btTransform trA, @Const @ByRef btTransform trB);

	public native void clearManifold();

	public native int calculateSerializeBufferSize();
	public native @Cast("const char*") BytePointer serialize(@Const btPersistentManifold manifold, Pointer dataBuffer, btSerializer serializer);
	public native void deSerialize(@Const btPersistentManifoldDoubleData manifoldDataPtr);
	public native void deSerialize(@Const btPersistentManifoldFloatData manifoldDataPtr);
}
