// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** This holds the mass data computed for a shape. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2MassData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2MassData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2MassData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2MassData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2MassData position(long position) {
        return (b2MassData)super.position(position);
    }

	/** The mass of the shape, usually in kilograms. */
	public native @Cast("float32") float mass(); public native b2MassData mass(float setter);

	/** The position of the shape's centroid relative to the shape's origin. */
	public native @ByRef b2Vec2 center(); public native b2MassData center(b2Vec2 setter);

	/** The rotational inertia of the shape about the local origin. */
	public native @Cast("float32") float I(); public native b2MassData I(float setter);
}
