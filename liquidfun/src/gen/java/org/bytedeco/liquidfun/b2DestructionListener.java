// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Joints and fixtures are destroyed when their associated
 *  body is destroyed. Implement this listener so that you
 *  may nullify references to these joints and shapes. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2DestructionListener extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2DestructionListener() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2DestructionListener(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2DestructionListener(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2DestructionListener position(long position) {
        return (b2DestructionListener)super.position(position);
    }


	/** Called when any joint is about to be destroyed due
	 *  to the destruction of one of its attached bodies. */
	@Virtual(true) public native void SayGoodbye(b2Joint joint);

	/** Called when any fixture is about to be destroyed due
	 *  to the destruction of its parent body. */
	@Virtual(true) public native void SayGoodbye(b2Fixture fixture);

	/** Called when any particle group is about to be destroyed. */
	@Virtual public native void SayGoodbye(b2ParticleGroup group);

	/** Called when a particle is about to be destroyed.
	 *  The index can be used in conjunction with
	 *  b2ParticleSystem::GetUserDataBuffer() or
	 *  b2ParticleSystem::GetParticleHandleFromIndex() to determine which
	 *  particle has been destroyed. */
	@Virtual public native void SayGoodbye(b2ParticleSystem particleSystem, @Cast("int32") int index);
}
