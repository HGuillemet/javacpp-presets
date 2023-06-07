// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** The btConvexShape is an abstract shape interface, implemented by all convex shapes such as btBoxShape, btConvexHullShape etc.
 *  It describes general convex shapes using the localGetSupportingVertex interface, used by collision detectors such as btGjkPairDetector. */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConvexShape extends btCollisionShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvexShape(Pointer p) { super(p); }


	public native @ByVal btVector3 localGetSupportingVertex(@Const @ByRef btVector3 vec);

////////
// #ifndef __SPU__
	public native @ByVal btVector3 localGetSupportingVertexWithoutMargin(@Const @ByRef btVector3 vec);
// #endif  //#ifndef __SPU__

	public native @ByVal btVector3 localGetSupportVertexWithoutMarginNonVirtual(@Const @ByRef btVector3 vec);
	public native @ByVal btVector3 localGetSupportVertexNonVirtual(@Const @ByRef btVector3 vec);
	public native @Cast("btScalar") double getMarginNonVirtual();
	public native void getAabbNonVirtual(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void project(@Const @ByRef btTransform trans, @Const @ByRef btVector3 dir, @Cast("btScalar*") @ByRef DoublePointer minProj, @Cast("btScalar*") @ByRef DoublePointer maxProj, @ByRef btVector3 witnesPtMin, @ByRef btVector3 witnesPtMax);
	public native void project(@Const @ByRef btTransform trans, @Const @ByRef btVector3 dir, @Cast("btScalar*") @ByRef DoubleBuffer minProj, @Cast("btScalar*") @ByRef DoubleBuffer maxProj, @ByRef btVector3 witnesPtMin, @ByRef btVector3 witnesPtMax);
	public native void project(@Const @ByRef btTransform trans, @Const @ByRef btVector3 dir, @Cast("btScalar*") @ByRef double[] minProj, @Cast("btScalar*") @ByRef double[] maxProj, @ByRef btVector3 witnesPtMin, @ByRef btVector3 witnesPtMax);

	//notice that the vectors should be unit length
	public native void batchedUnitVectorGetSupportingVertexWithoutMargin(@Const btVector3 vectors, btVector3 supportVerticesOut, int numVectors);

	/**getAabb's default implementation is brute force, expected derived classes to implement a fast dedicated version */
	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void getAabbSlow(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void setLocalScaling(@Const @ByRef btVector3 scaling);
	public native @Const @ByRef btVector3 getLocalScaling();

	public native void setMargin(@Cast("btScalar") double margin);

	public native @Cast("btScalar") double getMargin();

	public native int getNumPreferredPenetrationDirections();

	public native void getPreferredPenetrationDirection(int index, @ByRef btVector3 penetrationVector);
}
