// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Dynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;

import static org.bytedeco.bullet.global.Bullet3Dynamics.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3ContactSolverInfo extends b3ContactSolverInfoData {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3ContactSolverInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3ContactSolverInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3ContactSolverInfo position(long position) {
        return (b3ContactSolverInfo)super.position(position);
    }
    @Override public b3ContactSolverInfo getPointer(long i) {
        return new b3ContactSolverInfo((Pointer)this).offsetAddress(i);
    }

	public b3ContactSolverInfo() { super((Pointer)null); allocate(); }
	private native void allocate();
}
