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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btSolverAnalyticsData extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSolverAnalyticsData(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btSolverAnalyticsData(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btSolverAnalyticsData position(long position) {
        return (btSolverAnalyticsData)super.position(position);
    }
    @Override public btSolverAnalyticsData getPointer(long i) {
        return new btSolverAnalyticsData((Pointer)this).offsetAddress(i);
    }

	public btSolverAnalyticsData() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native int m_islandId(); public native btSolverAnalyticsData m_islandId(int setter);
	public native int m_numBodies(); public native btSolverAnalyticsData m_numBodies(int setter);
	public native int m_numContactManifolds(); public native btSolverAnalyticsData m_numContactManifolds(int setter);
	public native int m_numSolverCalls(); public native btSolverAnalyticsData m_numSolverCalls(int setter);
	public native int m_numIterationsUsed(); public native btSolverAnalyticsData m_numIterationsUsed(int setter);
	public native double m_remainingLeastSquaresResidual(); public native btSolverAnalyticsData m_remainingLeastSquaresResidual(double setter);
}
