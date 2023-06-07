// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Base class for gimpact shapes */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGImpactShapeInterface extends btConcaveShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGImpactShapeInterface(Pointer p) { super(p); }


	/** performs refit operation
	/**
	Updates the entire Box set of this shape.
	\pre postUpdate() must be called for attemps to calculating the box set, else this function
		will does nothing.
	\post if m_needs_update == true, then it calls calcLocalAABB();
	*/
	public native void updateBound();

	/** If the Bounding box is not updated, then this class attemps to calculate it.
	/**
    \post Calls updateBound() for update the box set.
    */
	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	/** Tells to this object that is needed to refit the box set */
	public native void postUpdate();

	/** Obtains the local box, which is the global calculated box of the total of subshapes */

	public native int getShapeType();

	/**
	\post You must call updateBound() for update the box set.
	*/
	public native void setLocalScaling(@Const @ByRef btVector3 scaling);

	public native @Const @ByRef btVector3 getLocalScaling();

	public native void setMargin(@Cast("btScalar") double margin);

	/** Subshape member functions
	 * \{
	 <p>
	 *  Base method for determinig which kind of GIMPACT shape we get */
	public native @Cast("eGIMPACT_SHAPE_TYPE") int getGImpactShapeType();

	/** gets boxset */
	public native @Cast("const btGImpactBoxSet*") btGImpactQuantizedBvh getBoxSet();

	/** Determines if this class has a hierarchy structure for sorting its primitives */
	public native @Cast("bool") boolean hasBoxSet();

	/** Obtains the primitive manager */
	public native @Const btPrimitiveManagerBase getPrimitiveManager();

	/** Gets the number of children */
	public native int getNumChildShapes();

	/** if true, then its children must get transforms. */
	public native @Cast("bool") boolean childrenHasTransform();

	/** Determines if this shape has triangles */
	public native @Cast("bool") boolean needsRetrieveTriangles();

	/** Determines if this shape has tetrahedrons */
	public native @Cast("bool") boolean needsRetrieveTetrahedrons();

	public native void getBulletTriangle(int prim_index, @ByRef btTriangleShapeEx triangle);

	public native void getBulletTetrahedron(int prim_index, @ByRef btTetrahedronShapeEx tetrahedron);

	/** call when reading child shapes */
	public native void lockChildShapes();

	public native void unlockChildShapes();

	/** if this trimesh */
	public native void getPrimitiveTriangle(int index, @ByRef btPrimitiveTriangle triangle);

	/** Retrieves the bound from a child
	/**
    */
	public native void getChildAabb(int child_index, @Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	/** Gets the children */
	public native btCollisionShape getChildShape(int index);

	/** Gets the child */

	/** Gets the children transform */
	public native @ByVal btTransform getChildTransform(int index);

	/** Sets the children transform
	/**
	\post You must call updateBound() for update the box set.
	*/
	public native void setChildTransform(int index, @Const @ByRef btTransform transform);

	/**\}
	 <p>
	 *  virtual method for ray collision */
	public native void rayTest(@Const @ByRef btVector3 rayFrom, @Const @ByRef btVector3 rayTo, @ByRef btCollisionWorld.RayResultCallback resultCallback);

	/** Function for retrieve triangles.
	/**
	It gives the triangles in local space
	*/
	public native void processAllTriangles(btTriangleCallback callback, @Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax);

	/** Function for retrieve triangles.
	/**
	It gives the triangles in local space
	*/
	public native void processAllTrianglesRay(btTriangleCallback arg0, @Const @ByRef btVector3 arg1, @Const @ByRef btVector3 arg2);

	/**\} */
}
