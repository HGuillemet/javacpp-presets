// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btAlignedBox3d extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btAlignedBox3d(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btAlignedBox3d(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btAlignedBox3d position(long position) {
        return (btAlignedBox3d)super.position(position);
    }
    @Override public btAlignedBox3d getPointer(long i) {
        return new btAlignedBox3d((Pointer)this).offsetAddress(i);
    }

	public native @ByRef btVector3 m_min(); public native btAlignedBox3d m_min(btVector3 setter);
	public native @ByRef btVector3 m_max(); public native btAlignedBox3d m_max(btVector3 setter);

	public native @Const @ByRef btVector3 min();

	public native @Const @ByRef btVector3 max();

	public native @Cast("bool") boolean contains(@Const @ByRef btVector3 x);

	public btAlignedBox3d(@Const @ByRef btVector3 mn, @Const @ByRef btVector3 mx) { super((Pointer)null); allocate(mn, mx); }
	private native void allocate(@Const @ByRef btVector3 mn, @Const @ByRef btVector3 mx);

	public btAlignedBox3d() { super((Pointer)null); allocate(); }
	private native void allocate();
}
