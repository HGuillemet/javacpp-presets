// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;

@Name("b3AlignedObjectArray<b3Aabb>") @NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3AabbArray extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3AabbArray(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3AabbArray(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3AabbArray position(long position) {
        return (b3AabbArray)super.position(position);
    }
    @Override public b3AabbArray getPointer(long i) {
        return new b3AabbArray((Pointer)this).offsetAddress(i);
    }

	public native @ByRef @Name("operator =") b3AabbArray put(@Const @ByRef b3AabbArray other);
	public b3AabbArray() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**Generally it is best to avoid using the copy constructor of an b3AlignedObjectArray, and use a (const) reference to the array instead. */
	public b3AabbArray(@Const @ByRef b3AabbArray otherArray) { super((Pointer)null); allocate(otherArray); }
	private native void allocate(@Const @ByRef b3AabbArray otherArray);

	/** return the number of elements in the array */
	public native int size();

	public native @ByRef b3Aabb at(int n);

	public native @ByRef @Name("operator []") b3Aabb get(int n);

	/**clear the array, deallocated memory. Generally it is better to use array.resize(0), to reduce performance overhead of run-time memory (de)allocations. */
	public native void clear();

	public native void pop_back();

	/**resize changes the number of elements in the array. If the new size is larger, the new elements will be constructed using the optional second argument.
	 * when the new number of elements is smaller, the destructor will be called, but memory will not be freed, to reduce performance overhead of run-time memory (de)allocations. */
	public native void resizeNoInitialize(int newsize);

	public native void resize(int newsize, @Const @ByRef(nullValue = "b3Aabb()") b3Aabb fillData);
	public native void resize(int newsize);
	public native @ByRef b3Aabb expandNonInitializing();

	public native @ByRef b3Aabb expand(@Const @ByRef(nullValue = "b3Aabb()") b3Aabb fillValue);
	public native @ByRef b3Aabb expand();

	public native void push_back(@Const @ByRef b3Aabb _Val);

	/** return the pre-allocated (reserved) elements, this is at least as large as the total number of elements,see size() and reserve() */
	public native @Name("capacity") int _capacity();

	public native void reserve(int _Count);

	/**heap sort from http://www.csse.monash.edu.au/~lloyd/tildeAlgDS/Sort/Heap/ */ /*downHeap*/

	public native void swap(int index0, int index1);

	/**non-recursive binary search, assumes sorted array */
	

	

	

	

	//PCK: whole function
	public native void initializeFromBuffer(Pointer buffer, int size, int _capacity);

	public native void copyFromArray(@Const @ByRef b3AabbArray otherArray);

	public native void removeAtIndex(int index);
}
