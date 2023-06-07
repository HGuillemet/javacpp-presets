// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Structure for containing Boxes
/**
This class offers an structure for managing a box tree of primitives.
Requires a Primitive prototype (like btPrimitiveManagerBase )
*/
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGImpactQuantizedBvh extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGImpactQuantizedBvh(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btGImpactQuantizedBvh(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btGImpactQuantizedBvh position(long position) {
        return (btGImpactQuantizedBvh)super.position(position);
    }
    @Override public btGImpactQuantizedBvh getPointer(long i) {
        return new btGImpactQuantizedBvh((Pointer)this).offsetAddress(i);
    }

	/** this constructor doesn't build the tree. you must call	buildSet */
	public btGImpactQuantizedBvh() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** this constructor doesn't build the tree. you must call	buildSet */
	public btGImpactQuantizedBvh(btPrimitiveManagerBase primitive_manager) { super((Pointer)null); allocate(primitive_manager); }
	private native void allocate(btPrimitiveManagerBase primitive_manager);

	public native void setPrimitiveManager(btPrimitiveManagerBase primitive_manager);

	public native btPrimitiveManagerBase getPrimitiveManager();

	/** node manager prototype functions
	 * \{
	 <p>
	 *  this attemps to refit the box set. */
	public native void update();

	/** this rebuild the entire set */
	public native void buildSet();

	/** returns the indices of the primitives in the m_primitive_manager */

	/** returns the indices of the primitives in the m_primitive_manager */

	/** returns the indices of the primitives in the m_primitive_manager */
	public native @Cast("bool") boolean rayQuery(
			@Const @ByRef btVector3 ray_dir, @Const @ByRef btVector3 ray_origin,
			@ByRef btIntArray collided_results);

	/** tells if this set has hierarcht */
	public native @Cast("bool") boolean hasHierarchy();

	/** tells if this set is a trimesh */
	public native @Cast("bool") boolean isTrimesh();

	/** node count */
	public native int getNodeCount();

	/** tells if the node is a leaf */
	public native @Cast("bool") boolean isLeafNode(int nodeindex);

	public native int getNodeData(int nodeindex);

	public native int getLeftNode(int nodeindex);

	public native int getRightNode(int nodeindex);

	public native int getEscapeNodeIndex(int nodeindex);

	public native void getNodeTriangle(int nodeindex, @ByRef btPrimitiveTriangle triangle);

	public native @Const BT_QUANTIZED_BVH_NODE get_node_pointer(int index/*=0*/);
	public native @Const BT_QUANTIZED_BVH_NODE get_node_pointer();

// #ifdef TRI_COLLISION_PROFILING
// #endif  //TRI_COLLISION_PROFILING

	public static native void find_collision(@Const btGImpactQuantizedBvh boxset1, @Const @ByRef btTransform trans1,
								   @Const btGImpactQuantizedBvh boxset2, @Const @ByRef btTransform trans2,
								   @ByRef btPairSet collision_pairs);
}
