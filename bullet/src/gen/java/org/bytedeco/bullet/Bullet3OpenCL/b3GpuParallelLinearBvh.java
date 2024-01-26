// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


/**\brief GPU Parallel Linearized Bounding Volume Heirarchy(LBVH) that is reconstructed every frame
 * \remarks
 * See presentation in docs/b3GpuParallelLinearBvh.pdf for algorithm details.
 * \par
 * Related papers: \n
 * "Fast BVH Construction on GPUs" [Lauterbach et al. 2009] \n
 * "Maximizing Parallelism in the Construction of BVHs, Octrees, and k-d trees" [Karras 2012] \n
 * \par
 * The basic algorithm for building the BVH as presented in [Lauterbach et al. 2009] consists of 4 stages:
 *  - [fully parallel] Assign morton codes for each AABB using its center (after quantizing the AABB centers into a virtual grid)
 *  - [fully parallel] Sort morton codes
 *  - [somewhat parallel] Build binary radix tree (assign parent/child pointers for internal nodes of the BVH)
 *  - [somewhat parallel] Set internal node AABBs
 * \par
 * [Karras 2012] improves on the algorithm by introducing fully parallel methods for the last 2 stages.
 * The BVH implementation here shares many concepts with [Karras 2012], but a different method is used for constructing the tree.
 * Instead of searching for the child nodes of each internal node, we search for the parent node of each node.
 * Additionally, a non-atomic traversal that starts from the leaf nodes and moves towards the root node is used to set the AABBs. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3GpuParallelLinearBvh extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuParallelLinearBvh(Pointer p) { super(p); }

	public b3GpuParallelLinearBvh(@Cast("cl_context") Pointer context, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue) { super((Pointer)null); allocate(context, device, queue); }
	private native void allocate(@Cast("cl_context") Pointer context, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue);

	/**Must be called before any other function */
	public native void build(@Const @ByRef b3SapAabbOCLArray worldSpaceAabbs, @Const @ByRef b3IntOCLArray smallAabbIndices,
				   @Const @ByRef b3IntOCLArray largeAabbIndices);

	/**calculateOverlappingPairs() uses the worldSpaceAabbs parameter of b3GpuParallelLinearBvh::build() as the query AABBs.
	 * @param out_overlappingPairs The size() of this array is used to determine the max number of pairs.
	 * If the number of overlapping pairs is < out_overlappingPairs.size(), out_overlappingPairs is resized. */
	public native void calculateOverlappingPairs(@ByRef b3Int4OCLArray out_overlappingPairs);

	/**@param out_numRigidRayPairs Array of length 1; contains the number of detected ray-rigid AABB intersections;
	 * this value may be greater than out_rayRigidPairs.size() if out_rayRigidPairs is not large enough.
	 * @param out_rayRigidPairs Contains an array of rays intersecting rigid AABBs; x == ray index, y == rigid body index.
	 * If the size of this array is insufficient to hold all ray-rigid AABB intersections, additional intersections are discarded. */
	public native void testRaysAgainstBvhAabbs(@Const @ByRef b3RayInfoOCLArray rays,
									 @ByRef b3IntOCLArray out_numRayRigidPairs, @ByRef b3Int2OCLArray out_rayRigidPairs);
}
