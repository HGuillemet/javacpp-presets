// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


// clang-format off

/**do not change those serialization structures, it requires an updated sBulletDNAstr/sBulletDNAstr64 */
@Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btMeshPartData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public btMeshPartData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btMeshPartData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btMeshPartData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btMeshPartData position(long position) {
        return (btMeshPartData)super.position(position);
    }
    @Override public btMeshPartData getPointer(long i) {
        return new btMeshPartData((Pointer)this).offsetAddress(i);
    }

	public native btVector3FloatData m_vertices3f(); public native btMeshPartData m_vertices3f(btVector3FloatData setter);
	public native btVector3DoubleData m_vertices3d(); public native btMeshPartData m_vertices3d(btVector3DoubleData setter);

	public native btIntIndexData m_indices32(); public native btMeshPartData m_indices32(btIntIndexData setter);
	public native btShortIntIndexTripletData m_3indices16(); public native btMeshPartData m_3indices16(btShortIntIndexTripletData setter);
	public native btCharIndexTripletData m_3indices8(); public native btMeshPartData m_3indices8(btCharIndexTripletData setter);

	public native btShortIntIndexData m_indices16(); public native btMeshPartData m_indices16(btShortIntIndexData setter);//backwards compatibility

	public native int m_numTriangles(); public native btMeshPartData m_numTriangles(int setter);//length of m_indices = m_numTriangles
	public native int m_numVertices(); public native btMeshPartData m_numVertices(int setter);
}
