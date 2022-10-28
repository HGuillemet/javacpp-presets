// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


/**The btIDebugDraw interface class allows hooking up a debug renderer to visually debug simulations.
 * Typical use case: create a debug drawer object, and assign it to a btCollisionWorld or btDynamicsWorld using setDebugDrawer and call debugDrawWorld.
 * A class that implements the btIDebugDraw interface will need to provide non-empty implementations of the the drawLine and getDebugMode methods at a minimum.
 * For color arguments the X,Y,Z components refer to Red, Green and Blue each in the range [0..1] */
@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btIDebugDraw extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btIDebugDraw() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btIDebugDraw(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btIDebugDraw(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btIDebugDraw position(long position) {
        return (btIDebugDraw)super.position(position);
    }
    @Override public btIDebugDraw getPointer(long i) {
        return new btIDebugDraw((Pointer)this).offsetAddress(i);
    }

	@NoOffset public static class DefaultColors extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public DefaultColors(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public DefaultColors(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public DefaultColors position(long position) {
	        return (DefaultColors)super.position(position);
	    }
	    @Override public DefaultColors getPointer(long i) {
	        return new DefaultColors((Pointer)this).offsetAddress(i);
	    }
	
		public native @ByRef btVector3 m_activeObject(); public native DefaultColors m_activeObject(btVector3 setter);
		public native @ByRef btVector3 m_deactivatedObject(); public native DefaultColors m_deactivatedObject(btVector3 setter);
		public native @ByRef btVector3 m_wantsDeactivationObject(); public native DefaultColors m_wantsDeactivationObject(btVector3 setter);
		public native @ByRef btVector3 m_disabledDeactivationObject(); public native DefaultColors m_disabledDeactivationObject(btVector3 setter);
		public native @ByRef btVector3 m_disabledSimulationObject(); public native DefaultColors m_disabledSimulationObject(btVector3 setter);
		public native @ByRef btVector3 m_aabb(); public native DefaultColors m_aabb(btVector3 setter);
		public native @ByRef btVector3 m_contactPoint(); public native DefaultColors m_contactPoint(btVector3 setter);

		public DefaultColors() { super((Pointer)null); allocate(); }
		private native void allocate();
	}

	/** enum btIDebugDraw::DebugDrawModes */
	public static final int
		DBG_NoDebug = 0,
		DBG_DrawWireframe = 1,
		DBG_DrawAabb = 2,
		DBG_DrawFeaturesText = 4,
		DBG_DrawContactPoints = 8,
		DBG_NoDeactivation = 16,
		DBG_NoHelpText = 32,
		DBG_DrawText = 64,
		DBG_ProfileTimings = 128,
		DBG_EnableSatComparison = 256,
		DBG_DisableBulletLCP = 512,
		DBG_EnableCCD = 1024,
		DBG_DrawConstraints = (1 << 11),
		DBG_DrawConstraintLimits = (1 << 12),
		DBG_FastWireframe = (1 << 13),
		DBG_DrawNormals = (1 << 14),
		DBG_DrawFrames = (1 << 15),
		DBG_MAX_DEBUG_DRAW_MODE = (1 << 15) + 1;

	@Virtual public native @ByVal @Const({false, false, true}) DefaultColors getDefaultColors();
	/**the default implementation for setDefaultColors has no effect. A derived class can implement it and store the colors. */
	@Virtual public native void setDefaultColors(@Const @ByRef DefaultColors arg0);

	@Virtual(true) public native void drawLine(@Const @ByRef btVector3 from, @Const @ByRef btVector3 to, @Const @ByRef btVector3 color);

	@Virtual public native void drawLine(@Const @ByRef btVector3 from, @Const @ByRef btVector3 to, @Const @ByRef btVector3 fromColor, @Const @ByRef btVector3 toColor);

	@Virtual public native void drawSphere(@Cast("btScalar") double radius, @Const @ByRef btTransform transform, @Const @ByRef btVector3 color);

	@Virtual public native void drawSphere(@Const @ByRef btVector3 p, @Cast("btScalar") double radius, @Const @ByRef btVector3 color);

	@Virtual public native void drawTriangle(@Const @ByRef btVector3 v0, @Const @ByRef btVector3 v1, @Const @ByRef btVector3 v2, @Const @ByRef btVector3 arg3, @Const @ByRef btVector3 arg4, @Const @ByRef btVector3 arg5, @Const @ByRef btVector3 color, @Cast("btScalar") double alpha);
	@Virtual public native void drawTriangle(@Const @ByRef btVector3 v0, @Const @ByRef btVector3 v1, @Const @ByRef btVector3 v2, @Const @ByRef btVector3 color, @Cast("btScalar") double arg4);

	@Virtual(true) public native void drawContactPoint(@Const @ByRef btVector3 PointOnB, @Const @ByRef btVector3 normalOnB, @Cast("btScalar") double distance, int lifeTime, @Const @ByRef btVector3 color);

	@Virtual(true) public native void reportErrorWarning(@Cast("const char*") BytePointer warningString);

	@Virtual(true) public native void draw3dText(@Const @ByRef btVector3 location, @Cast("const char*") BytePointer textString);

	@Virtual(true) public native void setDebugMode(int debugMode);

	@Virtual(true) public native @Const({false, false, true}) int getDebugMode();

	@Virtual public native void drawAabb(@Const @ByRef btVector3 from, @Const @ByRef btVector3 to, @Const @ByRef btVector3 color);
	@Virtual public native void drawTransform(@Const @ByRef btTransform transform, @Cast("btScalar") double orthoLen);

	@Virtual public native void drawArc(@Const @ByRef btVector3 center, @Const @ByRef btVector3 normal, @Const @ByRef btVector3 axis, @Cast("btScalar") double radiusA, @Cast("btScalar") double radiusB, @Cast("btScalar") double minAngle, @Cast("btScalar") double maxAngle,
							 @Const @ByRef btVector3 color, @Cast("bool") boolean drawSect, @Cast("btScalar") double stepDegrees/*=btScalar(10.f)*/);
	@Virtual public native void drawSpherePatch(@Const @ByRef btVector3 center, @Const @ByRef btVector3 up, @Const @ByRef btVector3 axis, @Cast("btScalar") double radius,
									 @Cast("btScalar") double minTh, @Cast("btScalar") double maxTh, @Cast("btScalar") double minPs, @Cast("btScalar") double maxPs, @Const @ByRef btVector3 color, @Cast("btScalar") double stepDegrees/*=btScalar(10.f)*/, @Cast("bool") boolean drawCenter/*=true*/);

	@Virtual public native void drawBox(@Const @ByRef btVector3 bbMin, @Const @ByRef btVector3 bbMax, @Const @ByRef btVector3 color);
	@Virtual public native void drawBox(@Const @ByRef btVector3 bbMin, @Const @ByRef btVector3 bbMax, @Const @ByRef btTransform trans, @Const @ByRef btVector3 color);

	@Virtual public native void drawCapsule(@Cast("btScalar") double radius, @Cast("btScalar") double halfHeight, int upAxis, @Const @ByRef btTransform transform, @Const @ByRef btVector3 color);

	@Virtual public native void drawCylinder(@Cast("btScalar") double radius, @Cast("btScalar") double halfHeight, int upAxis, @Const @ByRef btTransform transform, @Const @ByRef btVector3 color);

	@Virtual public native void drawCone(@Cast("btScalar") double radius, @Cast("btScalar") double height, int upAxis, @Const @ByRef btTransform transform, @Const @ByRef btVector3 color);

	@Virtual public native void drawPlane(@Const @ByRef btVector3 planeNormal, @Cast("btScalar") double planeConst, @Const @ByRef btTransform transform, @Const @ByRef btVector3 color);

	@Virtual public native void clearLines();

	@Virtual public native void flushLines();
}
