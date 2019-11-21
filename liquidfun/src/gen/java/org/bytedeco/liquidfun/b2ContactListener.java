// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Implement this class to get contact information. You can use these results for
 *  things like sounds and game logic. You can also get contact results by
 *  traversing the contact lists after the time step. However, you might miss
 *  some contacts because continuous physics leads to sub-stepping.
 *  Additionally you may receive multiple callbacks for the same contact in a
 *  single time step.
 *  You should strive to make your callbacks efficient because there may be
 *  many callbacks per time step.
 *  \warning You cannot create/destroy Box2D entities inside these callbacks. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ContactListener extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2ContactListener() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ContactListener(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ContactListener(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2ContactListener position(long position) {
        return (b2ContactListener)super.position(position);
    }


	/** Called when two fixtures begin to touch. */
	@Virtual public native void BeginContact(b2Contact contact);

	/** Called when two fixtures cease to touch. */
	@Virtual public native void EndContact(b2Contact contact);

	/** Called when a fixture and particle start touching if the
	 *  b2_fixtureContactFilterParticle flag is set on the particle. */
	@Virtual public native void BeginContact(b2ParticleSystem particleSystem,
								  b2ParticleBodyContact particleBodyContact);

	/** Called when a fixture and particle stop touching if the
	 *  b2_fixtureContactFilterParticle flag is set on the particle. */
	@Virtual public native void EndContact(b2Fixture fixture,
								b2ParticleSystem particleSystem, @Cast("int32") int index);

	/** Called when two particles start touching if
	 *  b2_particleContactFilterParticle flag is set on either particle. */
	@Virtual public native void BeginContact(b2ParticleSystem particleSystem,
								  b2ParticleContact particleContact);

	/** Called when two particles start touching if
	 *  b2_particleContactFilterParticle flag is set on either particle. */
	@Virtual public native void EndContact(b2ParticleSystem particleSystem,
								@Cast("int32") int indexA, @Cast("int32") int indexB);

	/** This is called after a contact is updated. This allows you to inspect a
	 *  contact before it goes to the solver. If you are careful, you can modify the
	 *  contact manifold (e.g. disable contact).
	 *  A copy of the old manifold is provided so that you can detect changes.
	 *  Note: this is called only for awake bodies.
	 *  Note: this is called even when the number of contact points is zero.
	 *  Note: this is not called for sensors.
	 *  Note: if you set the number of contact points to zero, you will not
	 *  get an EndContact callback. However, you may get a BeginContact callback
	 *  the next step. */
	@Virtual public native void PreSolve(b2Contact contact, @Const b2Manifold oldManifold);

	/** This lets you inspect a contact after the solver is finished. This is useful
	 *  for inspecting impulses.
	 *  Note: the contact manifold does not include time of impact impulses, which can be
	 *  arbitrarily large if the sub-step is small. Hence the impulse is provided explicitly
	 *  in a separate data structure.
	 *  Note: this is only called for contacts that are touching, solid, and awake. */
	@Virtual public native void PostSolve(b2Contact contact, @Const b2ContactImpulse impulse);
}
