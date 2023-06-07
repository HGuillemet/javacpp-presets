// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief Singular Value Decomposition
<p>
Class for computing Singular Value Decomposition of a floating-point
matrix. The Singular Value Decomposition is used to solve least-square
problems, under-determined linear systems, invert matrices, compute
condition numbers, and so on.
<p>
If you want to compute a condition number of a matrix or an absolute value of
its determinant, you do not need {@code u} and {@code vt}. You can pass
flags=SVD::NO_UV|... . Another flag SVD::FULL_UV indicates that full-size u
and vt must be computed, which is not necessary most of the time.
<p>
@see invert, solve, eigen, determinant
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class SVD extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SVD(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SVD(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SVD position(long position) {
        return (SVD)super.position(position);
    }
    @Override public SVD getPointer(long i) {
        return new SVD((Pointer)this).offsetAddress(i);
    }

    /** enum cv::SVD::Flags */
    public static final int
        /** allow the algorithm to modify the decomposed matrix; it can save space and speed up
            processing. currently ignored. */
        MODIFY_A = 1,
        /** indicates that only a vector of singular values {@code w} is to be processed, while u and vt
            will be set to empty matrices */
        NO_UV    = 2,
        /** when the matrix is not square, by default the algorithm produces u and vt matrices of
            sufficiently large size for the further A reconstruction; if, however, FULL_UV flag is
            specified, u and vt will be full-size square orthogonal matrices.*/
        FULL_UV  = 4;

    /** \brief the default constructor
    <p>
    initializes an empty SVD structure
      */
    public SVD() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    initializes an empty SVD structure and then calls SVD::operator()
    @param src decomposed matrix. The depth has to be CV_32F or CV_64F.
    @param flags operation flags (SVD::Flags)
      */
    public SVD( @ByVal Mat src, int flags/*=0*/ ) { super((Pointer)null); allocate(src, flags); }
    private native void allocate( @ByVal Mat src, int flags/*=0*/ );
    public SVD( @ByVal Mat src ) { super((Pointer)null); allocate(src); }
    private native void allocate( @ByVal Mat src );
    public SVD( @ByVal UMat src, int flags/*=0*/ ) { super((Pointer)null); allocate(src, flags); }
    private native void allocate( @ByVal UMat src, int flags/*=0*/ );
    public SVD( @ByVal UMat src ) { super((Pointer)null); allocate(src); }
    private native void allocate( @ByVal UMat src );
    public SVD( @ByVal GpuMat src, int flags/*=0*/ ) { super((Pointer)null); allocate(src, flags); }
    private native void allocate( @ByVal GpuMat src, int flags/*=0*/ );
    public SVD( @ByVal GpuMat src ) { super((Pointer)null); allocate(src); }
    private native void allocate( @ByVal GpuMat src );

    /** \brief the operator that performs SVD. The previously allocated u, w and vt are released.
    <p>
    The operator performs the singular value decomposition of the supplied
    matrix. The u,{@code vt} , and the vector of singular values w are stored in
    the structure. The same SVD structure can be reused many times with
    different matrices. Each time, if needed, the previous u,{@code vt} , and w
    are reclaimed and the new matrices are created, which is all handled by
    Mat::create.
    @param src decomposed matrix. The depth has to be CV_32F or CV_64F.
    @param flags operation flags (SVD::Flags)
      */
    public native @ByRef @Name("operator ()") SVD apply( @ByVal Mat src, int flags/*=0*/ );
    public native @ByRef @Name("operator ()") SVD apply( @ByVal Mat src );
    public native @ByRef @Name("operator ()") SVD apply( @ByVal UMat src, int flags/*=0*/ );
    public native @ByRef @Name("operator ()") SVD apply( @ByVal UMat src );
    public native @ByRef @Name("operator ()") SVD apply( @ByVal GpuMat src, int flags/*=0*/ );
    public native @ByRef @Name("operator ()") SVD apply( @ByVal GpuMat src );

    /** \brief decomposes matrix and stores the results to user-provided matrices
    <p>
    The methods/functions perform SVD of matrix. Unlike SVD::SVD constructor
    and SVD::operator(), they store the results to the user-provided
    matrices:
    <p>
    <pre>{@code {.cpp}
    Mat A, w, u, vt;
    SVD::compute(A, w, u, vt);
    }</pre>
    <p>
    @param src decomposed matrix. The depth has to be CV_32F or CV_64F.
    @param w calculated singular values
    @param u calculated left singular vectors
    @param vt transposed matrix of right singular vectors
    @param flags operation flags - see SVD::Flags.
      */
    public static native void compute( @ByVal Mat src, @ByVal Mat w,
                             @ByVal Mat u, @ByVal Mat vt, int flags/*=0*/ );
    public static native void compute( @ByVal Mat src, @ByVal Mat w,
                             @ByVal Mat u, @ByVal Mat vt );
    public static native void compute( @ByVal UMat src, @ByVal UMat w,
                             @ByVal UMat u, @ByVal UMat vt, int flags/*=0*/ );
    public static native void compute( @ByVal UMat src, @ByVal UMat w,
                             @ByVal UMat u, @ByVal UMat vt );
    public static native void compute( @ByVal GpuMat src, @ByVal GpuMat w,
                             @ByVal GpuMat u, @ByVal GpuMat vt, int flags/*=0*/ );
    public static native void compute( @ByVal GpuMat src, @ByVal GpuMat w,
                             @ByVal GpuMat u, @ByVal GpuMat vt );

    /** \overload
    computes singular values of a matrix
    @param src decomposed matrix. The depth has to be CV_32F or CV_64F.
    @param w calculated singular values
    @param flags operation flags - see SVD::Flags.
      */
    public static native void compute( @ByVal Mat src, @ByVal Mat w, int flags/*=0*/ );
    public static native void compute( @ByVal Mat src, @ByVal Mat w );
    public static native void compute( @ByVal UMat src, @ByVal UMat w, int flags/*=0*/ );
    public static native void compute( @ByVal UMat src, @ByVal UMat w );
    public static native void compute( @ByVal GpuMat src, @ByVal GpuMat w, int flags/*=0*/ );
    public static native void compute( @ByVal GpuMat src, @ByVal GpuMat w );

    /** \brief performs back substitution
      */
    public static native void backSubst( @ByVal Mat w, @ByVal Mat u,
                               @ByVal Mat vt, @ByVal Mat rhs,
                               @ByVal Mat dst );
    public static native void backSubst( @ByVal UMat w, @ByVal UMat u,
                               @ByVal UMat vt, @ByVal UMat rhs,
                               @ByVal UMat dst );
    public static native void backSubst( @ByVal GpuMat w, @ByVal GpuMat u,
                               @ByVal GpuMat vt, @ByVal GpuMat rhs,
                               @ByVal GpuMat dst );

    /** \brief solves an under-determined singular linear system
    <p>
    The method finds a unit-length solution x of a singular linear system
    A\*x = 0. Depending on the rank of A, there can be no solutions, a
    single solution or an infinite number of solutions. In general, the
    algorithm solves the following problem:
    <pre>{@code \[dst =  \arg \min _{x:  \| x \| =1}  \| src  \cdot x  \|\]}</pre>
    @param src left-hand-side matrix.
    @param dst found solution.
      */
    public static native void solveZ( @ByVal Mat src, @ByVal Mat dst );
    public static native void solveZ( @ByVal UMat src, @ByVal UMat dst );
    public static native void solveZ( @ByVal GpuMat src, @ByVal GpuMat dst );

    /** \brief performs a singular value back substitution.
    <p>
    The method calculates a back substitution for the specified right-hand
    side:
    <p>
    <pre>{@code \[\texttt{x} =  \texttt{vt} ^T  \cdot diag( \texttt{w} )^{-1}  \cdot \texttt{u} ^T  \cdot \texttt{rhs} \sim \texttt{A} ^{-1}  \cdot \texttt{rhs}\]}</pre>
    <p>
    Using this technique you can either get a very accurate solution of the
    convenient linear system, or the best (in the least-squares terms)
    pseudo-solution of an overdetermined linear system.
    <p>
    @param rhs right-hand side of a linear system (u\*w\*v')\*dst = rhs to
    be solved, where A has been previously decomposed.
    <p>
    @param dst found solution of the system.
    <p>
    \note Explicit SVD with the further back substitution only makes sense
    if you need to solve many linear systems with the same left-hand side
    (for example, src ). If all you need is to solve a single system
    (possibly with multiple rhs immediately available), simply call solve
    add pass #DECOMP_SVD there. It does absolutely the same thing.
      */
    public native void backSubst( @ByVal Mat rhs, @ByVal Mat dst );
    public native void backSubst( @ByVal UMat rhs, @ByVal UMat dst );
    public native void backSubst( @ByVal GpuMat rhs, @ByVal GpuMat dst );

    /** \todo document */

    /** \todo document */

    /** \todo document */

    public native @ByRef Mat u(); public native SVD u(Mat setter);
    public native @ByRef Mat w(); public native SVD w(Mat setter);
    public native @ByRef Mat vt(); public native SVD vt(Mat setter);
}
