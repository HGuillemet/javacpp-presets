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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3GpuRigidBodyPipeline extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuRigidBodyPipeline(Pointer p) { super(p); }

	public b3GpuRigidBodyPipeline(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer q, b3GpuNarrowPhase narrowphase, b3GpuBroadphaseInterface broadphaseSap, b3DynamicBvhBroadphase broadphaseDbvt, @Const @ByRef b3Config config) { super((Pointer)null); allocate(ctx, device, q, narrowphase, broadphaseSap, broadphaseDbvt, config); }
	private native void allocate(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer q, b3GpuNarrowPhase narrowphase, b3GpuBroadphaseInterface broadphaseSap, b3DynamicBvhBroadphase broadphaseDbvt, @Const @ByRef b3Config config);

	public native void stepSimulation(float deltaTime);
	public native void integrate(float timeStep);
	public native void setupGpuAabbsFull();

	

	//int		registerConvexPolyhedron(const float* vertices, int strideInBytes, int numVertices, const float* scaling);
	//int		registerSphereShape(float radius);
	//int		registerPlaneShape(const b3Vector3& planeNormal, float planeConstant);

	//int		registerConcaveMesh(b3AlignedObjectArray<b3Vector3>* vertices, b3AlignedObjectArray<int>* indices, const float* scaling);
	//int		registerCompoundShape(b3AlignedObjectArray<b3GpuChildShape>* childShapes);

	public native int registerPhysicsInstance(float mass, @Const FloatPointer _position, @Const FloatPointer orientation, int collisionShapeIndex, int userData, @Cast("bool") boolean writeInstanceToGpu);
	public native int registerPhysicsInstance(float mass, @Const FloatBuffer _position, @Const FloatBuffer orientation, int collisionShapeIndex, int userData, @Cast("bool") boolean writeInstanceToGpu);
	public native int registerPhysicsInstance(float mass, @Const float[] _position, @Const float[] orientation, int collisionShapeIndex, int userData, @Cast("bool") boolean writeInstanceToGpu);
	//if you passed "writeInstanceToGpu" false in the registerPhysicsInstance method (for performance) you need to call writeAllInstancesToGpu after all instances are registered
	public native void writeAllInstancesToGpu();
	public native void copyConstraintsToHost();
	public native void setGravity(@Const FloatPointer grav);
	public native void setGravity(@Const FloatBuffer grav);
	public native void setGravity(@Const float[] grav);
	public native void reset();

	public native int createPoint2PointConstraint(int bodyA, int bodyB, @Const FloatPointer pivotInA, @Const FloatPointer pivotInB, float breakingThreshold);
	public native int createPoint2PointConstraint(int bodyA, int bodyB, @Const FloatBuffer pivotInA, @Const FloatBuffer pivotInB, float breakingThreshold);
	public native int createPoint2PointConstraint(int bodyA, int bodyB, @Const float[] pivotInA, @Const float[] pivotInB, float breakingThreshold);
	public native int createFixedConstraint(int bodyA, int bodyB, @Const FloatPointer pivotInA, @Const FloatPointer pivotInB, @Const FloatPointer relTargetAB, float breakingThreshold);
	public native int createFixedConstraint(int bodyA, int bodyB, @Const FloatBuffer pivotInA, @Const FloatBuffer pivotInB, @Const FloatBuffer relTargetAB, float breakingThreshold);
	public native int createFixedConstraint(int bodyA, int bodyB, @Const float[] pivotInA, @Const float[] pivotInB, @Const float[] relTargetAB, float breakingThreshold);
	public native void removeConstraintByUid(int uid);

	public native void addConstraint(b3TypedConstraint constraint);
	public native void removeConstraint(b3TypedConstraint constraint);

	public native void castRays(@Const @ByRef b3RayInfoArray rays, @ByRef b3RayHitArray hitResults);

	public native @Cast("cl_mem") Pointer getBodyBuffer();

	public native int getNumBodies();
}
