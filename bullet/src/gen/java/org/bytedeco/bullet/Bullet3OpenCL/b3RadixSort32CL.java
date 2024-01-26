// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3RadixSort32CL extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3RadixSort32CL(Pointer p) { super(p); }

	public static class b3ConstData extends Pointer {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public b3ConstData() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public b3ConstData(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public b3ConstData(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public b3ConstData position(long position) {
	        return (b3ConstData)super.position(position);
	    }
	    @Override public b3ConstData getPointer(long i) {
	        return new b3ConstData((Pointer)this).offsetAddress(i);
	    }
	
		public native int m_n(); public native b3ConstData m_n(int setter);
		public native int m_nWGs(); public native b3ConstData m_nWGs(int setter);
		public native int m_startBit(); public native b3ConstData m_startBit(int setter);
		public native int m_nBlocksPerWG(); public native b3ConstData m_nBlocksPerWG(int setter);
	}
	/** enum b3RadixSort32CL:: */
	public static final int
		DATA_ALIGNMENT = 256,
		WG_SIZE = 64,
		BLOCK_SIZE = 256,
		ELEMENTS_PER_WORK_ITEM = (BLOCK_SIZE / WG_SIZE),
		BITS_PER_PASS = 4,
		NUM_BUCKET = (1 << BITS_PER_PASS),
		//	if you change this, change nPerWI in kernel as well
		NUM_WGS = 20 * 6;  //	cypress
						   //			NUM_WGS = 24*6,	//	cayman
						   //			NUM_WGS = 32*4,	//	nv
	public b3RadixSort32CL(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue, int initialCapacity/*=0*/) { super((Pointer)null); allocate(ctx, device, queue, initialCapacity); }
	private native void allocate(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue, int initialCapacity/*=0*/);
	public b3RadixSort32CL(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue) { super((Pointer)null); allocate(ctx, device, queue); }
	private native void allocate(@Cast("cl_context") Pointer ctx, @Cast("cl_device_id") Pointer device, @Cast("cl_command_queue") Pointer queue);

	public native void execute(@ByRef b3UnsignedIntOCLArray keysIn, @ByRef b3UnsignedIntOCLArray keysOut, @ByRef b3UnsignedIntOCLArray valuesIn,
					 @ByRef b3UnsignedIntOCLArray valuesOut, int n, int sortBits/*=32*/);
	public native void execute(@ByRef b3UnsignedIntOCLArray keysIn, @ByRef b3UnsignedIntOCLArray keysOut, @ByRef b3UnsignedIntOCLArray valuesIn,
					 @ByRef b3UnsignedIntOCLArray valuesOut, int n);

	/**keys only */
	public native void execute(@ByRef b3UnsignedIntOCLArray keysInOut, int sortBits/*=32*/);
	public native void execute(@ByRef b3UnsignedIntOCLArray keysInOut);

	public native void execute(@ByRef b3SortDataOCLArray keyValuesInOut, int sortBits/*=32*/);
	public native void execute(@ByRef b3SortDataOCLArray keyValuesInOut);
	public native void executeHost(@ByRef b3SortDataOCLArray keyValuesInOut, int sortBits/*=32*/);
	public native void executeHost(@ByRef b3SortDataOCLArray keyValuesInOut);
	public native void executeHost(@ByRef b3SortDataArray keyValuesInOut, int sortBits/*=32*/);
	public native void executeHost(@ByRef b3SortDataArray keyValuesInOut);
}
