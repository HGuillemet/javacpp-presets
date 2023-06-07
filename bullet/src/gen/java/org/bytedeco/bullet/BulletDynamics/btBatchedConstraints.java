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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btBatchedConstraints extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btBatchedConstraints(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btBatchedConstraints(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btBatchedConstraints position(long position) {
        return (btBatchedConstraints)super.position(position);
    }
    @Override public btBatchedConstraints getPointer(long i) {
        return new btBatchedConstraints((Pointer)this).offsetAddress(i);
    }

	/** enum btBatchedConstraints::BatchingMethod */
	public static final int
		BATCHING_METHOD_SPATIAL_GRID_2D = 0,
		BATCHING_METHOD_SPATIAL_GRID_3D = 1,
		BATCHING_METHOD_COUNT = 2;
	@NoOffset public static class Range extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public Range(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public Range(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public Range position(long position) {
	        return (Range)super.position(position);
	    }
	    @Override public Range getPointer(long i) {
	        return new Range((Pointer)this).offsetAddress(i);
	    }
	
		public native int begin(); public native Range begin(int setter);
		public native int end(); public native Range end(int setter);

		public Range() { super((Pointer)null); allocate(); }
		private native void allocate();
		public Range(int _beg, int _end) { super((Pointer)null); allocate(_beg, _end); }
		private native void allocate(int _beg, int _end);
	}

	public native @ByRef btIntArray m_constraintIndices(); public native btBatchedConstraints m_constraintIndices(btIntArray setter);
	public native @ByRef RangeArray m_batches(); public native btBatchedConstraints m_batches(RangeArray setter);        // each batch is a range of indices in the m_constraintIndices array
	public native @ByRef RangeArray m_phases(); public native btBatchedConstraints m_phases(RangeArray setter);         // each phase is range of indices in the m_batches array
	public native @ByRef btCharArray m_phaseGrainSize(); public native btBatchedConstraints m_phaseGrainSize(btCharArray setter);  // max grain size for each phase
	public native @ByRef btIntArray m_phaseOrder(); public native btBatchedConstraints m_phaseOrder(btIntArray setter);       // phases can be done in any order, so we can randomize the order here
	public native btIDebugDraw m_debugDrawer(); public native btBatchedConstraints m_debugDrawer(btIDebugDraw setter);

	public static native @Cast("bool") boolean s_debugDrawBatches(); public static native void s_debugDrawBatches(boolean setter);

	public btBatchedConstraints() { super((Pointer)null); allocate(); }
	private native void allocate();
	public native void setup(btSolverConstraintArray constraints,
				   @Const @ByRef btSolverBodyArray bodies,
				   @Cast("btBatchedConstraints::BatchingMethod") int batchingMethod,
				   int minBatchSize,
				   int maxBatchSize,
				   btCharArray scratchMemory);
	public native @Cast("bool") boolean validate(btSolverConstraintArray constraints, @Const @ByRef btSolverBodyArray bodies);
}
