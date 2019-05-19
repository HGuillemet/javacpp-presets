// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A rigid body. These are created via b2World::CreateBody. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Body extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Body(Pointer p) { super(p); }

	/** Creates a fixture and attach it to this body. Use this function if you need
	 *  to set some fixture parameters, like friction. Otherwise you can create the
	 *  fixture directly from a shape.
	 *  If the density is non-zero, this function automatically updates the mass of the body.
	 *  Contacts are not created until the next time step.
	 *  @param def the fixture definition.
	 *  \warning This function is locked during callbacks. */
	public native b2Fixture CreateFixture(@Const b2FixtureDef def);

	/** Creates a fixture from a shape and attach it to this body.
	 *  This is a convenience function. Use b2FixtureDef if you need to set parameters
	 *  like friction, restitution, user data, or filtering.
	 *  If the density is non-zero, this function automatically updates the mass of the body.
	 *  @param shape the shape to be cloned.
	 *  @param density the shape density (set to zero for static bodies).
	 *  \warning This function is locked during callbacks. */
	public native b2Fixture CreateFixture(@Const b2Shape shape, @Cast("float32") float density);

	/** Destroy a fixture. This removes the fixture from the broad-phase and
	 *  destroys all contacts associated with this fixture. This will
	 *  automatically adjust the mass of the body if the body is dynamic and the
	 *  fixture has positive density.
	 *  All fixtures attached to a body are implicitly destroyed when the body is destroyed.
	 *  @param fixture the fixture to be removed.
	 *  \warning This function is locked during callbacks. */
	public native void DestroyFixture(b2Fixture fixture);

	/** Set the position of the body's origin and rotation.
	 *  Manipulating a body's transform may cause non-physical behavior.
	 *  Note: contacts are updated on the next call to b2World::Step.
	 *  @param position the world position of the body's local origin.
	 *  @param angle the world rotation in radians. */
	public native void SetTransform(@Const @ByRef b2Vec2 position, @Cast("float32") float angle);

	/** Get the body transform for the body's origin.
	 *  @return the world transform of the body's origin. */
	public native @Const @ByRef b2Transform GetTransform();

	/** Get the world body origin position.
	 *  @return the world position of the body's origin. */
	public native @Const @ByRef b2Vec2 GetPosition();

	/** Get the angle in radians.
	 *  @return the current world rotation angle in radians. */
	public native @Cast("float32") float GetAngle();

	/** Get the world position of the center of mass. */
	public native @Const @ByRef b2Vec2 GetWorldCenter();

	/** Get the local position of the center of mass. */
	public native @Const @ByRef b2Vec2 GetLocalCenter();

	/** Set the linear velocity of the center of mass.
	 *  @param v the new linear velocity of the center of mass. */
	public native void SetLinearVelocity(@Const @ByRef b2Vec2 v);

	/** Get the linear velocity of the center of mass.
	 *  @return the linear velocity of the center of mass. */
	public native @Const @ByRef b2Vec2 GetLinearVelocity();

	/** Set the angular velocity.
	 *  @param omega the new angular velocity in radians/second. */
	public native void SetAngularVelocity(@Cast("float32") float omega);

	/** Get the angular velocity.
	 *  @return the angular velocity in radians/second. */
	public native @Cast("float32") float GetAngularVelocity();

	/** Apply a force at a world point. If the force is not
	 *  applied at the center of mass, it will generate a torque and
	 *  affect the angular velocity. This wakes up the body.
	 *  @param force the world force vector, usually in Newtons (N).
	 *  @param point the world position of the point of application.
	 *  @param wake also wake up the body */
	public native void ApplyForce(@Const @ByRef b2Vec2 force, @Const @ByRef b2Vec2 point, @Cast("bool") boolean wake);

	/** Apply a force to the center of mass. This wakes up the body.
	 *  @param force the world force vector, usually in Newtons (N).
	 *  @param wake also wake up the body */
	public native void ApplyForceToCenter(@Const @ByRef b2Vec2 force, @Cast("bool") boolean wake);

	/** Apply a torque. This affects the angular velocity
	 *  without affecting the linear velocity of the center of mass.
	 *  This wakes up the body.
	 *  @param torque about the z-axis (out of the screen), usually in N-m.
	 *  @param wake also wake up the body */
	public native void ApplyTorque(@Cast("float32") float torque, @Cast("bool") boolean wake);

	/** Apply an impulse at a point. This immediately modifies the velocity.
	 *  It also modifies the angular velocity if the point of application
	 *  is not at the center of mass. This wakes up the body.
	 *  @param impulse the world impulse vector, usually in N-seconds or kg-m/s.
	 *  @param point the world position of the point of application.
	 *  @param wake also wake up the body */
	public native void ApplyLinearImpulse(@Const @ByRef b2Vec2 impulse, @Const @ByRef b2Vec2 point, @Cast("bool") boolean wake);

	/** Apply an angular impulse.
	 *  @param impulse the angular impulse in units of kg*m*m/s
	 *  @param wake also wake up the body */
	public native void ApplyAngularImpulse(@Cast("float32") float impulse, @Cast("bool") boolean wake);

	/** Get the total mass of the body.
	 *  @return the mass, usually in kilograms (kg). */
	public native @Cast("float32") float GetMass();

	/** Get the rotational inertia of the body about the local origin.
	 *  @return the rotational inertia, usually in kg-m^2. */
	public native @Cast("float32") float GetInertia();

	/** Get the mass data of the body.
	 *  @return a struct containing the mass, inertia and center of the body. */
	public native void GetMassData(b2MassData data);

	/** Set the mass properties to override the mass properties of the fixtures.
	 *  Note that this changes the center of mass position.
	 *  Note that creating or destroying fixtures can also alter the mass.
	 *  This function has no effect if the body isn't dynamic.
	 *  @param massData the mass properties. */
	public native void SetMassData(@Const b2MassData data);

	/** This resets the mass properties to the sum of the mass properties of the fixtures.
	 *  This normally does not need to be called unless you called SetMassData to override
	 *  the mass and you later want to reset the mass. */
	public native void ResetMassData();

	/** Get the world coordinates of a point given the local coordinates.
	 *  @param localPoint a point on the body measured relative the the body's origin.
	 *  @return the same point expressed in world coordinates. */
	public native @ByVal b2Vec2 GetWorldPoint(@Const @ByRef b2Vec2 localPoint);

	/** Get the world coordinates of a vector given the local coordinates.
	 *  @param localVector a vector fixed in the body.
	 *  @return the same vector expressed in world coordinates. */
	public native @ByVal b2Vec2 GetWorldVector(@Const @ByRef b2Vec2 localVector);

	/** Gets a local point relative to the body's origin given a world point.
	 *  @param a point in world coordinates.
	 *  @return the corresponding local point relative to the body's origin. */
	public native @ByVal b2Vec2 GetLocalPoint(@Const @ByRef b2Vec2 worldPoint);

	/** Gets a local vector given a world vector.
	 *  @param a vector in world coordinates.
	 *  @return the corresponding local vector. */
	public native @ByVal b2Vec2 GetLocalVector(@Const @ByRef b2Vec2 worldVector);

	/** Get the world linear velocity of a world point attached to this body.
	 *  @param a point in world coordinates.
	 *  @return the world velocity of a point. */
	public native @ByVal b2Vec2 GetLinearVelocityFromWorldPoint(@Const @ByRef b2Vec2 worldPoint);

	/** Get the world velocity of a local point.
	 *  @param a point in local coordinates.
	 *  @return the world velocity of a point. */
	public native @ByVal b2Vec2 GetLinearVelocityFromLocalPoint(@Const @ByRef b2Vec2 localPoint);

	/** Get the linear damping of the body. */
	public native @Cast("float32") float GetLinearDamping();

	/** Set the linear damping of the body. */
	public native void SetLinearDamping(@Cast("float32") float linearDamping);

	/** Get the angular damping of the body. */
	public native @Cast("float32") float GetAngularDamping();

	/** Set the angular damping of the body. */
	public native void SetAngularDamping(@Cast("float32") float angularDamping);

	/** Get the gravity scale of the body. */
	public native @Cast("float32") float GetGravityScale();

	/** Set the gravity scale of the body. */
	public native void SetGravityScale(@Cast("float32") float scale);

	/** Set the type of this body. This may alter the mass and velocity. */
	public native void SetType(@Cast("b2BodyType") int type);

	/** Get the type of this body. */
	public native @Cast("b2BodyType") int GetType();

	/** Should this body be treated like a bullet for continuous collision detection? */
	public native void SetBullet(@Cast("bool") boolean flag);

	/** Is this body treated like a bullet for continuous collision detection? */
	public native @Cast("bool") boolean IsBullet();

	/** You can disable sleeping on this body. If you disable sleeping, the
	 *  body will be woken. */
	public native void SetSleepingAllowed(@Cast("bool") boolean flag);

	/** Is this body allowed to sleep */
	public native @Cast("bool") boolean IsSleepingAllowed();

	/** Set the sleep state of the body. A sleeping body has very
	 *  low CPU cost.
	 *  @param flag set to true to wake the body, false to put it to sleep. */
	public native void SetAwake(@Cast("bool") boolean flag);

	/** Get the sleeping state of this body.
	 *  @return true if the body is awake. */
	public native @Cast("bool") boolean IsAwake();

	/** Set the active state of the body. An inactive body is not
	 *  simulated and cannot be collided with or woken up.
	 *  If you pass a flag of true, all fixtures will be added to the
	 *  broad-phase.
	 *  If you pass a flag of false, all fixtures will be removed from
	 *  the broad-phase and all contacts will be destroyed.
	 *  Fixtures and joints are otherwise unaffected. You may continue
	 *  to create/destroy fixtures and joints on inactive bodies.
	 *  Fixtures on an inactive body are implicitly inactive and will
	 *  not participate in collisions, ray-casts, or queries.
	 *  Joints connected to an inactive body are implicitly inactive.
	 *  An inactive body is still owned by a b2World object and remains
	 *  in the body list. */
	public native void SetActive(@Cast("bool") boolean flag);

	/** Get the active state of the body. */
	public native @Cast("bool") boolean IsActive();

	/** Set this body to have fixed rotation. This causes the mass
	 *  to be reset. */
	public native void SetFixedRotation(@Cast("bool") boolean flag);

	/** Does this body have fixed rotation? */
	public native @Cast("bool") boolean IsFixedRotation();

	/** Get the list of all fixtures attached to this body. */
	public native b2Fixture GetFixtureList();

	/** Get the list of all joints attached to this body. */
	public native b2JointEdge GetJointList();

	/** Get the list of all contacts attached to this body.
	 *  \warning this list changes during the time step and you may
	 *  miss some collisions if you don't use b2ContactListener. */
	public native b2ContactEdge GetContactList();

	/** Get the next body in the world's body list. */
	public native b2Body GetNext();

	/** Get the user data pointer that was provided in the body definition. */
	public native Pointer GetUserData();

	/** Set the user data. Use this to store your application specific data. */
	public native void SetUserData(Pointer data);

	/** Get the parent world of this body. */
	public native b2World GetWorld();

	/** Dump this body to a log file */
	public native void Dump();
	/** Get x-coordinate of position. */
	public native @Cast("float32") float GetPositionX();

	/** Get y-coordinate of position. */
	public native @Cast("float32") float GetPositionY();

	/** Set b2Transform using direct floats. */
	public native void SetTransform(@Cast("float32") float positionX, @Cast("float32") float positionY, @Cast("float32") float angle);
}
