// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** btContinuousConvexCollision implements angular and linear time of impact for convex objects.
 *  Based on Brian Mirtich's Conservative Advancement idea (PhD thesis).
 *  Algorithm operates in worldspace, in order to keep in between motion globally consistent.
 *  It uses GJK at the moment. Future improvement would use minkowski sum / supporting vertex, merging innerloops */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btContinuousConvexCollision extends btConvexCast {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btContinuousConvexCollision(Pointer p) { super(p); }

	public btContinuousConvexCollision(@Const btConvexShape shapeA, @Const btConvexShape shapeB, btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver penetrationDepthSolver) { super((Pointer)null); allocate(shapeA, shapeB, simplexSolver, penetrationDepthSolver); }
	private native void allocate(@Const btConvexShape shapeA, @Const btConvexShape shapeB, btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver penetrationDepthSolver);

	public btContinuousConvexCollision(@Const btConvexShape shapeA, @Const btStaticPlaneShape plane) { super((Pointer)null); allocate(shapeA, plane); }
	private native void allocate(@Const btConvexShape shapeA, @Const btStaticPlaneShape plane);

	public native @Cast("bool") boolean calcTimeOfImpact(
			@Const @ByRef btTransform fromA,
			@Const @ByRef btTransform toA,
			@Const @ByRef btTransform fromB,
			@Const @ByRef btTransform toB,
			@ByRef CastResult result);
}
