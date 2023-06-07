// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btContactArray extends GIM_CONTACT_Array_ {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btContactArray(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btContactArray(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btContactArray position(long position) {
        return (btContactArray)super.position(position);
    }
    @Override public btContactArray getPointer(long i) {
        return new btContactArray((Pointer)this).offsetAddress(i);
    }

	public btContactArray() { super((Pointer)null); allocate(); }
	private native void allocate();

	public native void push_contact(
			@Const @ByRef btVector3 point, @Const @ByRef btVector3 normal,
			@Cast("btScalar") double depth, int feature1, int feature2);

	public native void push_triangle_contacts(
			@Const @ByRef GIM_TRIANGLE_CONTACT tricontact,
			int feature1, int feature2);

	public native void merge_contacts(@Const @ByRef btContactArray contacts, @Cast("bool") boolean normal_contact_average/*=true*/);
	public native void merge_contacts(@Const @ByRef btContactArray contacts);

	public native void merge_contacts_unique(@Const @ByRef btContactArray contacts);
}
