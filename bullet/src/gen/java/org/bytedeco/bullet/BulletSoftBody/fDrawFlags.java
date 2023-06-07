// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;

//
// Helpers
//

/* fDrawFlags															*/
@Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class fDrawFlags extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public fDrawFlags() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public fDrawFlags(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fDrawFlags(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public fDrawFlags position(long position) {
        return (fDrawFlags)super.position(position);
    }
    @Override public fDrawFlags getPointer(long i) {
        return new fDrawFlags((Pointer)this).offsetAddress(i);
    }

	/** enum fDrawFlags::_ */
	public static final int
		Nodes = 0x0001,
		Links = 0x0002,
		Faces = 0x0004,
		Tetras = 0x0008,
		Normals = 0x0010,
		Contacts = 0x0020,
		Anchors = 0x0040,
		Notes = 0x0080,
		Clusters = 0x0100,
		NodeTree = 0x0200,
		FaceTree = 0x0400,
		ClusterTree = 0x0800,
		Joints = 0x1000,
		/* presets	*/
		Std = Links + Faces + Tetras + Anchors + Notes + Joints,
		StdTetra = Std - Faces + Tetras;
}
