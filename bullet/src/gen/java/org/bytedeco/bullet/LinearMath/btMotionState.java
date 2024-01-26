// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;


/**The btMotionState interface class allows the dynamics world to synchronize and interpolate the updated world transforms with graphics
 * For optimizations, potentially only moving objects get synchronized (using setWorldPosition/setWorldOrientation) */
@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btMotionState extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btMotionState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMotionState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMotionState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btMotionState position(long position) {
        return (btMotionState)super.position(position);
    }
    @Override public btMotionState getPointer(long i) {
        return new btMotionState((Pointer)this).offsetAddress(i);
    }


	@Virtual(true) public native @Const({false, false, true}) void getWorldTransform(@ByRef btTransform worldTrans);

	//Bullet only calls the update of worldtransform for active objects
	@Virtual(true) public native void setWorldTransform(@Const @ByRef btTransform worldTrans);
}
