// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class MassPreconditioner extends Preconditioner {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MassPreconditioner(Pointer p) { super(p); }

	public MassPreconditioner(@Const @ByRef btSoftBodyArray softBodies) { super((Pointer)null); allocate(softBodies); }
	private native void allocate(@Const @ByRef btSoftBodyArray softBodies);

	public native void reinitialize(@Cast("bool") boolean nodeUpdated);

	public native @Name("operator ()") void apply(@Const @ByRef btVector3Array x, @ByRef btVector3Array b);
}
