// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Generic Pool class */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGenericMemoryPool extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGenericMemoryPool(Pointer p) { super(p); }

	public native @Cast("unsigned char*") BytePointer m_pool(); public native btGenericMemoryPool m_pool(BytePointer setter);      //[m_element_size*m_max_element_count];
	public native @Cast("size_t*") SizeTPointer m_free_nodes(); public native btGenericMemoryPool m_free_nodes(SizeTPointer setter);       //[m_max_element_count];//! free nodes
	public native @Cast("size_t*") SizeTPointer m_allocated_sizes(); public native btGenericMemoryPool m_allocated_sizes(SizeTPointer setter);  //[m_max_element_count];//! Number of elements allocated per node
	public native @Cast("size_t") long m_allocated_count(); public native btGenericMemoryPool m_allocated_count(long setter);
	public native @Cast("size_t") long m_free_nodes_count(); public native btGenericMemoryPool m_free_nodes_count(long setter);
	public native void init_pool(@Cast("size_t") long element_size, @Cast("size_t") long element_count);

	public native void end_pool();

	public btGenericMemoryPool(@Cast("size_t") long element_size, @Cast("size_t") long element_count) { super((Pointer)null); allocate(element_size, element_count); }
	private native void allocate(@Cast("size_t") long element_size, @Cast("size_t") long element_count);

	public native @Cast("size_t") long get_pool_capacity();

	public native @Cast("size_t") long gem_element_size();

	public native @Cast("size_t") long get_max_element_count();

	public native @Cast("size_t") long get_allocated_count();

	public native @Cast("size_t") long get_free_positions_count();

	public native Pointer get_element_data(@Cast("size_t") long element_index);

	/** Allocates memory in pool
	/**
	@param size_bytes size in bytes of the buffer
	*/
	public native @Name("allocate") Pointer _allocate(@Cast("size_t") long size_bytes);

	public native @Cast("bool") boolean freeMemory(Pointer pointer);
}
