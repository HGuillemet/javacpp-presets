// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Collision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;

import static org.bytedeco.bullet.global.Bullet3Collision.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Collision.class)
public class b3Contact4Data extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b3Contact4Data() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3Contact4Data(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Contact4Data(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b3Contact4Data position(long position) {
        return (b3Contact4Data)super.position(position);
    }
    @Override public b3Contact4Data getPointer(long i) {
        return new b3Contact4Data((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b3Vector3 m_worldPosB(int i); public native b3Contact4Data m_worldPosB(int i, b3Vector3 setter);
	@MemberGetter public native b3Vector3 m_worldPosB();
	//	b3Float4	m_localPosA[4];
	//	b3Float4	m_localPosB[4];
	public native @ByRef b3Vector3 m_worldNormalOnB(); public native b3Contact4Data m_worldNormalOnB(b3Vector3 setter);  //	w: m_nPoints
	public native @Cast("unsigned short") short m_restituitionCoeffCmp(); public native b3Contact4Data m_restituitionCoeffCmp(short setter);
	public native @Cast("unsigned short") short m_frictionCoeffCmp(); public native b3Contact4Data m_frictionCoeffCmp(short setter);
	public native int m_batchIdx(); public native b3Contact4Data m_batchIdx(int setter);
	public native int m_bodyAPtrAndSignBit(); public native b3Contact4Data m_bodyAPtrAndSignBit(int setter);  //x:m_bodyAPtr, y:m_bodyBPtr
	public native int m_bodyBPtrAndSignBit(); public native b3Contact4Data m_bodyBPtrAndSignBit(int setter);

	public native int m_childIndexA(); public native b3Contact4Data m_childIndexA(int setter);
	public native int m_childIndexB(); public native b3Contact4Data m_childIndexB(int setter);
	public native int m_unused1(); public native b3Contact4Data m_unused1(int setter);
	public native int m_unused2(); public native b3Contact4Data m_unused2(int setter);
}
