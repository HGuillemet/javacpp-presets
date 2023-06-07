// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btConvexHullShape implements an implicit convex hull of an array of vertices.
 * Bullet provides a general and fast collision detector for convex shapes based on GJK and EPA using localGetSupportingVertex. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConvexHullShape extends btPolyhedralConvexAabbCachingShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConvexHullShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btConvexHullShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btConvexHullShape position(long position) {
        return (btConvexHullShape)super.position(position);
    }
    @Override public btConvexHullShape getPointer(long i) {
        return new btConvexHullShape((Pointer)this).offsetAddress(i);
    }


	/**this constructor optionally takes in a pointer to points. Each point is assumed to be 3 consecutive btScalar (x,y,z), the striding defines the number of bytes between each point, in memory.
	 * It is easier to not pass any points in the constructor, and just add one point at a time, using addPoint.
	 * btConvexHullShape make an internal copy of the points. */
	public btConvexHullShape(@Cast("const btScalar*") DoublePointer points/*=0*/, int numPoints/*=0*/, int stride/*=sizeof(btVector3)*/) { super((Pointer)null); allocate(points, numPoints, stride); }
	private native void allocate(@Cast("const btScalar*") DoublePointer points/*=0*/, int numPoints/*=0*/, int stride/*=sizeof(btVector3)*/);
	public btConvexHullShape() { super((Pointer)null); allocate(); }
	private native void allocate();
	public btConvexHullShape(@Cast("const btScalar*") DoubleBuffer points/*=0*/, int numPoints/*=0*/, int stride/*=sizeof(btVector3)*/) { super((Pointer)null); allocate(points, numPoints, stride); }
	private native void allocate(@Cast("const btScalar*") DoubleBuffer points/*=0*/, int numPoints/*=0*/, int stride/*=sizeof(btVector3)*/);
	public btConvexHullShape(@Cast("const btScalar*") double[] points/*=0*/, int numPoints/*=0*/, int stride/*=sizeof(btVector3)*/) { super((Pointer)null); allocate(points, numPoints, stride); }
	private native void allocate(@Cast("const btScalar*") double[] points/*=0*/, int numPoints/*=0*/, int stride/*=sizeof(btVector3)*/);

	public native void addPoint(@Const @ByRef btVector3 point, @Cast("bool") boolean recalculateLocalAabb/*=true*/);
	public native void addPoint(@Const @ByRef btVector3 point);

	public native btVector3 getUnscaledPoints();

	/**getPoints is obsolete, please use getUnscaledPoints */
	public native @Const btVector3 getPoints();

	public native void optimizeConvexHull();

	public native @ByVal btVector3 getScaledPoint(int i);

	public native int getNumPoints();

	public native @ByVal btVector3 localGetSupportingVertex(@Const @ByRef btVector3 vec);
	public native @ByVal btVector3 localGetSupportingVertexWithoutMargin(@Const @ByRef btVector3 vec);
	public native void batchedUnitVectorGetSupportingVertexWithoutMargin(@Const btVector3 vectors, btVector3 supportVerticesOut, int numVectors);

	public native void project(@Const @ByRef btTransform trans, @Const @ByRef btVector3 dir, @Cast("btScalar*") @ByRef DoublePointer minProj, @Cast("btScalar*") @ByRef DoublePointer maxProj, @ByRef btVector3 witnesPtMin, @ByRef btVector3 witnesPtMax);
	public native void project(@Const @ByRef btTransform trans, @Const @ByRef btVector3 dir, @Cast("btScalar*") @ByRef DoubleBuffer minProj, @Cast("btScalar*") @ByRef DoubleBuffer maxProj, @ByRef btVector3 witnesPtMin, @ByRef btVector3 witnesPtMax);
	public native void project(@Const @ByRef btTransform trans, @Const @ByRef btVector3 dir, @Cast("btScalar*") @ByRef double[] minProj, @Cast("btScalar*") @ByRef double[] maxProj, @ByRef btVector3 witnesPtMin, @ByRef btVector3 witnesPtMax);

	//debugging
	public native @Cast("const char*") BytePointer getName();

	public native int getNumVertices();
	public native int getNumEdges();
	public native void getEdge(int i, @ByRef btVector3 pa, @ByRef btVector3 pb);
	public native void getVertex(int i, @ByRef btVector3 vtx);
	public native int getNumPlanes();
	public native void getPlane(@ByRef btVector3 planeNormal, @ByRef btVector3 planeSupport, int i);
	public native @Cast("bool") boolean isInside(@Const @ByRef btVector3 pt, @Cast("btScalar") double tolerance);

	/**in case we receive negative scaling */
	public native void setLocalScaling(@Const @ByRef btVector3 scaling);

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}
