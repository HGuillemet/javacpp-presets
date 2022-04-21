// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btConeShapeZ implements a Cone shape, around the Z axis */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConeShapeZ extends btConeShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConeShapeZ(Pointer p) { super(p); }

	public btConeShapeZ(@Cast("btScalar") float radius, @Cast("btScalar") float height) { super((Pointer)null); allocate(radius, height); }
	private native void allocate(@Cast("btScalar") float radius, @Cast("btScalar") float height);

	public native @ByVal btVector3 getAnisotropicRollingFrictionDirection();

	//debugging
	public native @Cast("const char*") BytePointer getName();
}