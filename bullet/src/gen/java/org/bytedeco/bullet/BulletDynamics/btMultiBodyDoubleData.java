// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btMultiBodyDoubleData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btMultiBodyDoubleData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMultiBodyDoubleData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMultiBodyDoubleData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btMultiBodyDoubleData position(long position) {
        return (btMultiBodyDoubleData)super.position(position);
    }
    @Override public btMultiBodyDoubleData getPointer(long i) {
        return new btMultiBodyDoubleData((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3DoubleData m_baseWorldPosition(); public native btMultiBodyDoubleData m_baseWorldPosition(btVector3DoubleData setter);
	public native @ByRef btQuaternionDoubleData m_baseWorldOrientation(); public native btMultiBodyDoubleData m_baseWorldOrientation(btQuaternionDoubleData setter);
	public native @ByRef btVector3DoubleData m_baseLinearVelocity(); public native btMultiBodyDoubleData m_baseLinearVelocity(btVector3DoubleData setter);
	public native @ByRef btVector3DoubleData m_baseAngularVelocity(); public native btMultiBodyDoubleData m_baseAngularVelocity(btVector3DoubleData setter);
	public native @ByRef btVector3DoubleData m_baseInertia(); public native btMultiBodyDoubleData m_baseInertia(btVector3DoubleData setter);  // inertia of the base (in local frame; diagonal)
	public native double m_baseMass(); public native btMultiBodyDoubleData m_baseMass(double setter);
	public native int m_numLinks(); public native btMultiBodyDoubleData m_numLinks(int setter);
	public native @Cast("char") byte m_padding(int i); public native btMultiBodyDoubleData m_padding(int i, byte setter);
	@MemberGetter public native @Cast("char*") BytePointer m_padding();

	public native @Cast("char*") BytePointer m_baseName(); public native btMultiBodyDoubleData m_baseName(BytePointer setter);
	public native btMultiBodyLinkDoubleData m_links(); public native btMultiBodyDoubleData m_links(btMultiBodyLinkDoubleData setter);
	public native btCollisionObjectDoubleData m_baseCollider(); public native btMultiBodyDoubleData m_baseCollider(btCollisionObjectDoubleData setter);
}
