// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/** Collision Algorithm for GImpact Shapes
/**
For register this algorithm in Bullet, proceed as following:
 <pre>{@code
btCollisionDispatcher * dispatcher = static_cast<btCollisionDispatcher *>(m_dynamicsWorld ->getDispatcher());
btGImpactCollisionAlgorithm::registerAlgorithm(dispatcher);
 }</pre>
*/
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btGImpactCollisionAlgorithm extends btActivatingCollisionAlgorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btGImpactCollisionAlgorithm(Pointer p) { super(p); }

	public btGImpactCollisionAlgorithm(@Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap) { super((Pointer)null); allocate(ci, body0Wrap, body1Wrap); }
	private native void allocate(@Const @ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap);

	public native void processCollision(@Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native @Cast("btScalar") double calculateTimeOfImpact(btCollisionObject body0, btCollisionObject body1, @Const @ByRef btDispatcherInfo dispatchInfo, btManifoldResult resultOut);

	public native void getAllContactManifolds(@Cast("btManifoldArray*") @ByRef btPersistentManifoldArray manifoldArray);

	public native btManifoldResult internalGetResultOut();

	public static class CreateFunc extends btCollisionAlgorithmCreateFunc {
	    static { Loader.load(); }
	    /** Default native constructor. */
	    public CreateFunc() { super((Pointer)null); allocate(); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public CreateFunc(long size) { super((Pointer)null); allocateArray(size); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public CreateFunc(Pointer p) { super(p); }
	    private native void allocate();
	    private native void allocateArray(long size);
	    @Override public CreateFunc position(long position) {
	        return (CreateFunc)super.position(position);
	    }
	    @Override public CreateFunc getPointer(long i) {
	        return new CreateFunc((Pointer)this).offsetAddress(i);
	    }
	
		public native btCollisionAlgorithm CreateCollisionAlgorithm(@ByRef btCollisionAlgorithmConstructionInfo ci, @Const btCollisionObjectWrapper body0Wrap, @Const btCollisionObjectWrapper body1Wrap);
	}

	/** Use this function for register the algorithm externally */
	public static native void registerAlgorithm(btCollisionDispatcher dispatcher);
// #ifdef TRI_COLLISION_PROFILING
// #endif  //TRI_COLLISION_PROFILING

	/** Collides two gimpact shapes
	/**
	\pre shape0 and shape1 couldn't be btGImpactMeshShape objects
	*/

	public native void gimpact_vs_gimpact(@Const btCollisionObjectWrapper body0Wrap,
								@Const btCollisionObjectWrapper body1Wrap,
								@Const btGImpactShapeInterface shape0,
								@Const btGImpactShapeInterface shape1);

	public native void gimpact_vs_shape(@Const btCollisionObjectWrapper body0Wrap,
							  @Const btCollisionObjectWrapper body1Wrap,
							  @Const btGImpactShapeInterface shape0,
							  @Const btCollisionShape shape1, @Cast("bool") boolean swapped);

	public native void gimpact_vs_compoundshape(@Const btCollisionObjectWrapper body0Wrap,
									  @Const btCollisionObjectWrapper body1Wrap,
									  @Const btGImpactShapeInterface shape0,
									  @Const btCompoundShape shape1, @Cast("bool") boolean swapped);

	public native void gimpact_vs_concave(
			@Const btCollisionObjectWrapper body0Wrap,
			@Const btCollisionObjectWrapper body1Wrap,
			@Const btGImpactShapeInterface shape0,
			@Const btConcaveShape shape1, @Cast("bool") boolean swapped);

	/** Accessor/Mutator pairs for Part and triangleID */
	public native void setFace0(int value);
	public native int getFace0();
	public native void setFace1(int value);
	public native int getFace1();
	public native void setPart0(int value);
	public native int getPart0();
	public native void setPart1(int value);
	public native int getPart1();
}
