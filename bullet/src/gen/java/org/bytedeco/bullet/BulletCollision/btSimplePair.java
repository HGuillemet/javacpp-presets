// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btSimplePair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btSimplePair(Pointer p) { super(p); }

	public btSimplePair(int indexA, int indexB) { super((Pointer)null); allocate(indexA, indexB); }
	private native void allocate(int indexA, int indexB);

	public native int m_indexA(); public native btSimplePair m_indexA(int setter);
	public native int m_indexB(); public native btSimplePair m_indexB(int setter);
		public native Pointer m_userPointer(); public native btSimplePair m_userPointer(Pointer setter);
		public native int m_userValue(); public native btSimplePair m_userValue(int setter);
}
