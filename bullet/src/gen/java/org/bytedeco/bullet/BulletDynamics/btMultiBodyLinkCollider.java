// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;

// #else
// #endif

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultiBodyLinkCollider extends btCollisionObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBodyLinkCollider(Pointer p) { super(p); }

	public native btMultiBody m_multiBody(); public native btMultiBodyLinkCollider m_multiBody(btMultiBody setter);
	public native int m_link(); public native btMultiBodyLinkCollider m_link(int setter);
	public btMultiBodyLinkCollider(btMultiBody multiBody, int link) { super((Pointer)null); allocate(multiBody, link); }
	private native void allocate(btMultiBody multiBody, int link);
	public static native btMultiBodyLinkCollider upcast(btCollisionObject colObj);

	public native @Cast("bool") boolean checkCollideWithOverride(@Const btCollisionObject co);

	public native @Cast("bool") boolean isStaticOrKinematic();

	public native @Cast("bool") boolean isKinematic();

	public native void setDynamicType(int dynamicType);

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);
}
