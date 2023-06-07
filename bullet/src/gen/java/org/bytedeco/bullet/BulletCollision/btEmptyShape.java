// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** The btEmptyShape is a collision shape without actual collision detection shape, so most users should ignore this class.
 *  It can be replaced by another shape during runtime, but the inertia tensor should be recomputed. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btEmptyShape extends btConcaveShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btEmptyShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btEmptyShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btEmptyShape position(long position) {
        return (btEmptyShape)super.position(position);
    }
    @Override public btEmptyShape getPointer(long i) {
        return new btEmptyShape((Pointer)this).offsetAddress(i);
    }


	public btEmptyShape() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**getAabb's default implementation is brute force, expected derived classes to implement a fast dedicated version */
	public native void getAabb(@Const @ByRef btTransform t, @ByRef btVector3 aabbMin, @ByRef btVector3 aabbMax);

	public native void setLocalScaling(@Const @ByRef btVector3 scaling);
	public native @Const @ByRef btVector3 getLocalScaling();

	public native void calculateLocalInertia(@Cast("btScalar") double mass, @ByRef btVector3 inertia);

	public native @Cast("const char*") BytePointer getName();

	public native void processAllTriangles(btTriangleCallback arg0, @Const @ByRef btVector3 arg1, @Const @ByRef btVector3 arg2);
}
