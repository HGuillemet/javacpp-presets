// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**btConeShape implements a Cone shape, around the X axis */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btConeShapeX extends btConeShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btConeShapeX(Pointer p) { super(p); }

	public btConeShapeX(@Cast("btScalar") double radius, @Cast("btScalar") double height) { super((Pointer)null); allocate(radius, height); }
	private native void allocate(@Cast("btScalar") double radius, @Cast("btScalar") double height);

	public native @ByVal btVector3 getAnisotropicRollingFrictionDirection();

	//debugging
	public native @Cast("const char*") BytePointer getName();
}
