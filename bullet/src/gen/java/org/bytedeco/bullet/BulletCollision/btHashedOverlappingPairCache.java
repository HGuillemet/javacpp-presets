// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Hash-space based Pair Cache, thanks to Erin Catto, Box2D, http://www.box2d.org, and Pierre Terdiman, Codercorner, http://codercorner.com */

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btHashedOverlappingPairCache extends btOverlappingPairCache {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btHashedOverlappingPairCache(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btHashedOverlappingPairCache(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btHashedOverlappingPairCache position(long position) {
        return (btHashedOverlappingPairCache)super.position(position);
    }
    @Override public btHashedOverlappingPairCache getPointer(long i) {
        return new btHashedOverlappingPairCache((Pointer)this).offsetAddress(i);
    }


	public btHashedOverlappingPairCache() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native void removeOverlappingPairsContainingProxy(btBroadphaseProxy proxy, btDispatcher dispatcher);

	public native Pointer removeOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1, btDispatcher dispatcher);

	public native @Cast("bool") boolean needsBroadphaseCollision(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1);

	// Add a pair and return the new pair. If the pair already exists,
	// no new pair is created and the old one is returned.
	public native btBroadphasePair addOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1);

	public native void cleanProxyFromPairs(btBroadphaseProxy proxy, btDispatcher dispatcher);

	public native void processAllOverlappingPairs(btOverlapCallback arg0, btDispatcher dispatcher);

	public native void processAllOverlappingPairs(btOverlapCallback callback, btDispatcher dispatcher, @Const @ByRef btDispatcherInfo dispatchInfo);

	public native btBroadphasePair getOverlappingPairArrayPtr();

	public native @Cast("btBroadphasePairArray*") @ByRef BT_QUANTIZED_BVH_NODE_Array getOverlappingPairArray();

	public native void cleanOverlappingPair(@ByRef btBroadphasePair pair, btDispatcher dispatcher);

	public native btBroadphasePair findPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1);

	public native int GetCount();
	//	btBroadphasePair* GetPairs() { return m_pairs; }

	public native btOverlapFilterCallback getOverlapFilterCallback();

	public native void setOverlapFilterCallback(btOverlapFilterCallback callback);

	public native int getNumOverlappingPairs();
}
