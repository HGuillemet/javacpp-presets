// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A body definition holds all the data needed to construct a rigid body.
 *  You can safely re-use body definitions. Shapes are added to a body after construction. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2BodyDef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2BodyDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2BodyDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2BodyDef position(long position) {
        return (b2BodyDef)super.position(position);
    }

	/** This constructor sets the body definition default values. */
	public b2BodyDef() { super((Pointer)null); allocate(); }
	private native void allocate();

// #if LIQUIDFUN_EXTERNAL_LANGUAGE_API
	/** Set position with direct floats. */
	public native void SetPosition(@Cast("float32") float positionX, @Cast("float32") float positionY);
// #endif // LIQUIDFUN_EXTERNAL_LANGUAGE_API

	/** The body type: static, kinematic, or dynamic.
	 *  Note: if a dynamic body would have zero mass, the mass is set to one. */
	public native @Cast("b2BodyType") int type(); public native b2BodyDef type(int setter);

	/** The world position of the body. Avoid creating bodies at the origin
	 *  since this can lead to many overlapping shapes. */
	public native @ByRef @Name("position") b2Vec2 _position(); public native b2BodyDef _position(b2Vec2 setter);

	/** The world angle of the body in radians. */
	public native @Cast("float32") float angle(); public native b2BodyDef angle(float setter);

	/** The linear velocity of the body's origin in world co-ordinates. */
	public native @ByRef b2Vec2 linearVelocity(); public native b2BodyDef linearVelocity(b2Vec2 setter);

	/** The angular velocity of the body. */
	public native @Cast("float32") float angularVelocity(); public native b2BodyDef angularVelocity(float setter);

	/** Linear damping is use to reduce the linear velocity. The damping parameter
	 *  can be larger than 1.0f but the damping effect becomes sensitive to the
	 *  time step when the damping parameter is large. */
	public native @Cast("float32") float linearDamping(); public native b2BodyDef linearDamping(float setter);

	/** Angular damping is use to reduce the angular velocity. The damping parameter
	 *  can be larger than 1.0f but the damping effect becomes sensitive to the
	 *  time step when the damping parameter is large. */
	public native @Cast("float32") float angularDamping(); public native b2BodyDef angularDamping(float setter);

	/** Set this flag to false if this body should never fall asleep. Note that
	 *  this increases CPU usage. */
	public native @Cast("bool") boolean allowSleep(); public native b2BodyDef allowSleep(boolean setter);

	/** Is this body initially awake or sleeping? */
	public native @Cast("bool") boolean awake(); public native b2BodyDef awake(boolean setter);

	/** Should this body be prevented from rotating? Useful for characters. */
	public native @Cast("bool") boolean fixedRotation(); public native b2BodyDef fixedRotation(boolean setter);

	/** Is this a fast moving body that should be prevented from tunneling through
	 *  other moving bodies? Note that all bodies are prevented from tunneling through
	 *  kinematic and static bodies. This setting is only considered on dynamic bodies.
	 *  \warning You should use this flag sparingly since it increases processing time. */
	public native @Cast("bool") boolean bullet(); public native b2BodyDef bullet(boolean setter);

	/** Does this body start out active? */
	public native @Cast("bool") boolean active(); public native b2BodyDef active(boolean setter);

	/** Use this to store application specific body data. */
	public native Pointer userData(); public native b2BodyDef userData(Pointer setter);

	/** Scale the gravity applied to this body. */
	public native @Cast("float32") float gravityScale(); public native b2BodyDef gravityScale(float setter);
}
