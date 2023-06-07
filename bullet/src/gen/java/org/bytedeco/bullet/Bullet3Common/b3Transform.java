// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;

// #endif

/**\brief The b3Transform class supports rigid transforms with only translation and rotation and no scaling/shear.
 *It can be used in combination with b3Vector3, b3Quaternion and b3Matrix3x3 linear algebra classes. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class b3Transform extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Transform(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3Transform(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3Transform position(long position) {
        return (b3Transform)super.position(position);
    }
    @Override public b3Transform getPointer(long i) {
        return new b3Transform((Pointer)this).offsetAddress(i);
    }

	/**\brief No initialization constructor */
	public b3Transform() { super((Pointer)null); allocate(); }
	private native void allocate();
	/**\brief Constructor from b3Quaternion (optional b3Vector3 )
   * @param q Rotation from quaternion 
   * @param c Translation from Vector (default 0,0,0) */
	public b3Transform(@Const @ByRef b3Quaternion q,
											 @Const @ByRef(nullValue = "b3Vector3(b3MakeVector3(b3Scalar(0), b3Scalar(0), b3Scalar(0)))") b3Vector3 c) { super((Pointer)null); allocate(q, c); }
	private native void allocate(@Const @ByRef b3Quaternion q,
											 @Const @ByRef(nullValue = "b3Vector3(b3MakeVector3(b3Scalar(0), b3Scalar(0), b3Scalar(0)))") b3Vector3 c);
	public b3Transform(@Const @ByRef b3Quaternion q) { super((Pointer)null); allocate(q); }
	private native void allocate(@Const @ByRef b3Quaternion q);

	/**\brief Constructor from b3Matrix3x3 (optional b3Vector3)
   * @param b Rotation from Matrix 
   * @param c Translation from Vector default (0,0,0)*/
	public b3Transform(@Const @ByRef b3Matrix3x3 b,
											 @Const @ByRef(nullValue = "b3Vector3(b3MakeVector3(b3Scalar(0), b3Scalar(0), b3Scalar(0)))") b3Vector3 c) { super((Pointer)null); allocate(b, c); }
	private native void allocate(@Const @ByRef b3Matrix3x3 b,
											 @Const @ByRef(nullValue = "b3Vector3(b3MakeVector3(b3Scalar(0), b3Scalar(0), b3Scalar(0)))") b3Vector3 c);
	public b3Transform(@Const @ByRef b3Matrix3x3 b) { super((Pointer)null); allocate(b); }
	private native void allocate(@Const @ByRef b3Matrix3x3 b);
	/**\brief Copy constructor */
	public b3Transform(@Const @ByRef b3Transform other) { super((Pointer)null); allocate(other); }
	private native void allocate(@Const @ByRef b3Transform other);
	/**\brief Assignment Operator */
	public native @ByRef @Name("operator =") b3Transform put(@Const @ByRef b3Transform other);

	/**\brief Set the current transform as the value of the product of two transforms
   * @param t1 Transform 1
   * @param t2 Transform 2
   * This = Transform1 * Transform2 */
	public native void mult(@Const @ByRef b3Transform t1, @Const @ByRef b3Transform t2);

	/*		void multInverseLeft(const b3Transform& t1, const b3Transform& t2) {
			b3Vector3 v = t2.m_origin - t1.m_origin;
			m_basis = b3MultTransposeLeft(t1.m_basis, t2.m_basis);
			m_origin = v * t1.m_basis;
		}
		*/

	/**\brief Return the transform of the vector */
	public native @ByVal @Name("operator ()") b3Vector3 apply(@Const @ByRef b3Vector3 x);

	/**\brief Return the transform of the vector */
	public native @ByVal @Name("operator *") b3Vector3 multiply(@Const @ByRef b3Vector3 x);

	/**\brief Return the transform of the b3Quaternion */
	public native @ByVal @Name("operator *") b3Quaternion multiply(@Const @ByRef b3Quaternion q);

	/**\brief Return the basis matrix for the rotation */
	public native @ByRef b3Matrix3x3 getBasis();
	/**\brief Return the basis matrix for the rotation */

	/**\brief Return the origin vector translation */
	public native @ByRef b3Vector3 getOrigin();
	/**\brief Return the origin vector translation */

	/**\brief Return a quaternion representing the rotation */
	public native @ByVal b3Quaternion getRotation();

	/**\brief Set from an array 
   * @param m A pointer to a 15 element array (12 rotation(row major padded on the right by 1), and 3 translation */
	public native void setFromOpenGLMatrix(@Cast("const b3Scalar*") FloatPointer m);
	public native void setFromOpenGLMatrix(@Cast("const b3Scalar*") FloatBuffer m);
	public native void setFromOpenGLMatrix(@Cast("const b3Scalar*") float[] m);

	/**\brief Fill an array representation
   * @param m A pointer to a 15 element array (12 rotation(row major padded on the right by 1), and 3 translation */
	public native void getOpenGLMatrix(@Cast("b3Scalar*") FloatPointer m);
	public native void getOpenGLMatrix(@Cast("b3Scalar*") FloatBuffer m);
	public native void getOpenGLMatrix(@Cast("b3Scalar*") float[] m);

	/**\brief Set the translational element
   * @param origin The vector to set the translation to */
	public native void setOrigin(@Const @ByRef b3Vector3 origin);

	public native @ByVal b3Vector3 invXform(@Const @ByRef b3Vector3 inVec);

	/**\brief Set the rotational element by b3Matrix3x3 */
	public native void setBasis(@Const @ByRef b3Matrix3x3 basis);

	/**\brief Set the rotational element by b3Quaternion */
	public native void setRotation(@Const @ByRef b3Quaternion q);

	/**\brief Set this transformation to the identity */
	public native void setIdentity();

	/**\brief Multiply this Transform by another(this = this * another) 
   * @param t The other transform */
	public native @ByRef @Name("operator *=") b3Transform multiplyPut(@Const @ByRef b3Transform t);

	/**\brief Return the inverse of this transform */
	public native @ByVal b3Transform inverse();

	/**\brief Return the inverse of this transform times the other transform
   * @param t The other transform 
   * return this.inverse() * the other */
	public native @ByVal b3Transform inverseTimes(@Const @ByRef b3Transform t);

	/**\brief Return the product of this transform and the other */
	public native @ByVal @Name("operator *") b3Transform multiply(@Const @ByRef b3Transform t);

	/**\brief Return an identity transform */
	public static native @Const @ByRef b3Transform getIdentity();

	public native void serialize(@ByRef b3TransformFloatData dataOut);

	public native void serializeFloat(@ByRef b3TransformFloatData dataOut);

	public native void deSerialize(@Const @ByRef b3TransformFloatData dataIn);

	public native void deSerializeDouble(@Const @ByRef b3TransformDoubleData dataIn);

	public native void deSerializeFloat(@Const @ByRef b3TransformFloatData dataIn);
}
