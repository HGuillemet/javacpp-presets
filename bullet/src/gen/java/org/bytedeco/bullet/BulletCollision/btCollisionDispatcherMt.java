// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btCollisionDispatcherMt extends btCollisionDispatcher {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCollisionDispatcherMt(Pointer p) { super(p); }

	public btCollisionDispatcherMt(btCollisionConfiguration config, int grainSize/*=40*/) { super((Pointer)null); allocate(config, grainSize); }
	private native void allocate(btCollisionConfiguration config, int grainSize/*=40*/);
	public btCollisionDispatcherMt(btCollisionConfiguration config) { super((Pointer)null); allocate(config); }
	private native void allocate(btCollisionConfiguration config);

	public native btPersistentManifold getNewManifold(@Const btCollisionObject body0, @Const btCollisionObject body1);
	public native void releaseManifold(btPersistentManifold manifold);

	public native void dispatchAllCollisionPairs(btOverlappingPairCache pairCache, @Const @ByRef btDispatcherInfo info, btDispatcher dispatcher);
}
