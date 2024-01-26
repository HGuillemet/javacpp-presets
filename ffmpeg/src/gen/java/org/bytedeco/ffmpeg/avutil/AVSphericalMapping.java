// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * This structure describes how to handle spherical videos, outlining
 * information about projection, initial layout, and any other view modifier.
 *
 * \note The struct must be allocated with av_spherical_alloc() and
 *       its size is not a part of the public ABI.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVSphericalMapping extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVSphericalMapping() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVSphericalMapping(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVSphericalMapping(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVSphericalMapping position(long position) {
        return (AVSphericalMapping)super.position(position);
    }
    @Override public AVSphericalMapping getPointer(long i) {
        return new AVSphericalMapping((Pointer)this).offsetAddress(i);
    }

    /**
     * Projection type.
     */
    public native @Cast("AVSphericalProjection") int projection(); public native AVSphericalMapping projection(int setter);

    /**
     * \name Initial orientation
     * \{
     * There fields describe additional rotations applied to the sphere after
     * the video frame is mapped onto it. The sphere is rotated around the
     * viewer, who remains stationary. The order of transformation is always
     * yaw, followed by pitch, and finally by roll.
     *
     * The coordinate system matches the one defined in OpenGL, where the
     * forward vector (z) is coming out of screen, and it is equivalent to
     * a rotation matrix of R = r_y(yaw) * r_x(pitch) * r_z(roll).
     *
     * A positive yaw rotates the portion of the sphere in front of the viewer
     * toward their right. A positive pitch rotates the portion of the sphere
     * in front of the viewer upwards. A positive roll tilts the portion of
     * the sphere in front of the viewer to the viewer's right.
     *
     * These values are exported as 16.16 fixed point.
     *
     * See this equirectangular projection as example:
     *
     * <pre>{@code {.unparsed}
     *                   Yaw
     *     -180           0           180
     *   90 +-------------+-------------+  180
     *      |             |             |                  up
     * P    |             |             |                 y|    forward
     * i    |             ^             |                  |   /z
     * t  0 +-------------X-------------+    0 Roll        |  /
     * c    |             |             |                  | /
     * h    |             |             |                 0|/_____right
     *      |             |             |                        x
     *  -90 +-------------+-------------+ -180
     *
     * X - the default camera center
     * ^ - the default up vector
     * }</pre>
     */
    /** Rotation around the up vector [-180, 180]. */
    public native int yaw(); public native AVSphericalMapping yaw(int setter);
    /** Rotation around the right vector [-90, 90]. */
    public native int pitch(); public native AVSphericalMapping pitch(int setter);
    /** Rotation around the forward vector [-180, 180]. */
    public native int roll(); public native AVSphericalMapping roll(int setter);
    /**
     * \}
     */

    /**
     * \name Bounding rectangle
     * \anchor bounding
     * \{
     * These fields indicate the location of the current tile, and where
     * it should be mapped relative to the original surface. They are
     * exported as 0.32 fixed point, and can be converted to classic
     * pixel values with av_spherical_bounds().
     *
     * <pre>{@code {.unparsed}
     *      +----------------+----------+
     *      |                |bound_top |
     *      |            +--------+     |
     *      | bound_left |tile    |     |
     *      +<---------->|        |<--->+bound_right
     *      |            +--------+     |
     *      |                |          |
     *      |    bound_bottom|          |
     *      +----------------+----------+
     * }</pre>
     *
     * If needed, the original video surface dimensions can be derived
     * by adding the current stream or frame size to the related bounds,
     * like in the following example:
     *
     * <pre>{@code {c}
     *     original_width  = tile->width  + bound_left + bound_right;
     *     original_height = tile->height + bound_top  + bound_bottom;
     * }</pre>
     *
     * \note These values are valid only for the tiled equirectangular
     *       projection type (\ref AV_SPHERICAL_EQUIRECTANGULAR_TILE),
     *       and should be ignored in all other cases.
     */
    /** Distance from the left edge */
    public native @Cast("uint32_t") int bound_left(); public native AVSphericalMapping bound_left(int setter);
    /** Distance from the top edge */
    public native @Cast("uint32_t") int bound_top(); public native AVSphericalMapping bound_top(int setter);
    /** Distance from the right edge */
    public native @Cast("uint32_t") int bound_right(); public native AVSphericalMapping bound_right(int setter);
    /** Distance from the bottom edge */
    public native @Cast("uint32_t") int bound_bottom(); public native AVSphericalMapping bound_bottom(int setter);
    /**
     * \}
     */

    /**
     * Number of pixels to pad from the edge of each cube face.
     *
     * \note This value is valid for only for the cubemap projection type
     *       (\ref AV_SPHERICAL_CUBEMAP), and should be ignored in all other
     *       cases.
     */
    public native @Cast("uint32_t") int padding(); public native AVSphericalMapping padding(int setter);
}
