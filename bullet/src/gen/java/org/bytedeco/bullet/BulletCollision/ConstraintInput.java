// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


@Opaque @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class ConstraintInput extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ConstraintInput() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstraintInput(Pointer p) { super(p); }
}
