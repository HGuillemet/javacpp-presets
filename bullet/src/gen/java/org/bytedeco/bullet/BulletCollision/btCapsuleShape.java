// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;
  // for the types

/**The btCapsuleShape represents a capsule around the Y axis, there is also the btCapsuleShapeX aligned around the X axis and btCapsuleShapeZ around the Z axis.
 * The total height is height+2*radius, so the height is just the height between the center of each 'sphere' of the capsule caps.
 * The btCapsuleShape is a convex hull of two spheres. The btMultiSphereShape is a more general collision shape that takes the convex hull of multiple sphere, so it can also represent a capsule when just using two spheres. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btCapsuleShape extends btConvexInternalShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btCapsuleShape(Pointer p) { super(p); }


	public btCapsuleShape(@Cast("btScalar") double radius, @Cast("btScalar") double height) { super((Pointer)null); allocate(radius, height); }
	private native void allocate(@Cast("btScalar") double radius, @Cast("btScalar") double height);

	/**CollisionShape Interface */
	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	/** btConvexShape Interface */
	public native @ByVal btVector3 localGetSupportingVertexWithoutMargin(@Const @ByRef btVector3 vec);

	public native void batchedUnitVectorGetSupportingVertexWithoutMargin(@Const btVector3 vectors, btVector3 supportVerticesOut, int numVectors);

	public native void setMargin(@Cast("btScalar") double collisionMargin);

	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native @Cast("const char*") BytePointer getName();

	public native int getUpAxis();

	public native @Cast("btScalar") double getRadius();

	public native @Cast("btScalar") double getHalfHeight();

	public native void setLocalScaling(@Const @ByRef btVector3 scaling);

	public native @ByVal btVector3 getAnisotropicRollingFrictionDirection();

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);

	public native void deSerializeFloat(btCapsuleShapeData dataBuffer);
}
