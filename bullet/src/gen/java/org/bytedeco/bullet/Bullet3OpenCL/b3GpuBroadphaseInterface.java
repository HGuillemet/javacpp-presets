// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3GpuBroadphaseInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3GpuBroadphaseInterface(Pointer p) { super(p); }


	public native void createProxy(@Const @ByRef b3Vector3 aabbMin, @Const @ByRef b3Vector3 aabbMax, int userPtr, int collisionFilterGroup, int collisionFilterMask);
	public native void createLargeProxy(@Const @ByRef b3Vector3 aabbMin, @Const @ByRef b3Vector3 aabbMax, int userPtr, int collisionFilterGroup, int collisionFilterMask);

	public native void calculateOverlappingPairs(int maxPairs);
	public native void calculateOverlappingPairsHost(int maxPairs);

	//call writeAabbsToGpu after done making all changes (createProxy etc)
	public native void writeAabbsToGpu();

	public native @Cast("cl_mem") Pointer getAabbBufferWS();
	public native int getNumOverlap();
	public native @Cast("cl_mem") Pointer getOverlappingPairBuffer();

	public native @ByRef b3SapAabbOCLArray getAllAabbsGPU();
	public native @ByRef b3SapAabbArray getAllAabbsCPU();

	public native @ByRef b3Int4OCLArray getOverlappingPairsGPU();
	public native @ByRef b3IntOCLArray getSmallAabbIndicesGPU();
	public native @ByRef b3IntOCLArray getLargeAabbIndicesGPU();
}
