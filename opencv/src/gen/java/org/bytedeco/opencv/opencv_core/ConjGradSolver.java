// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief This class is used to perform the non-linear non-constrained minimization of a function
with known gradient,
<p>
defined on an *n*-dimensional Euclidean space, using the **Nonlinear Conjugate Gradient method**.
The implementation was done based on the beautifully clear explanatory article [An Introduction to
the Conjugate Gradient Method Without the Agonizing
Pain](http://www.cs.cmu.edu/~quake-papers/painless-conjugate-gradient.pdf) by Jonathan Richard
Shewchuk. The method can be seen as an adaptation of a standard Conjugate Gradient method (see, for
example <http://en.wikipedia.org/wiki/Conjugate_gradient_method>) for numerically solving the
systems of linear equations.
<p>
It should be noted, that this method, although deterministic, is rather a heuristic method and
therefore may converge to a local minima, not necessary a global one. What is even more disastrous,
most of its behaviour is ruled by gradient, therefore it essentially cannot distinguish between
local minima and maxima. Therefore, if it starts sufficiently near to the local maximum, it may
converge to it. Another obvious restriction is that it should be possible to compute the gradient of
a function at any point, thus it is preferable to have analytic expression for gradient and
computational burden should be born by the user.
<p>
The latter responsibility is accomplished via the getGradient method of a
MinProblemSolver::Function interface (which represents function being optimized). This method takes
point a point in *n*-dimensional space (first argument represents the array of coordinates of that
point) and compute its gradient (it should be stored in the second argument as an array).
<p>
\note class ConjGradSolver thus does not add any new methods to the basic MinProblemSolver interface.
<p>
\note term criteria should meet following condition:
<pre>{@code
    termcrit.type == (TermCriteria::MAX_ITER + TermCriteria::EPS) && termcrit.epsilon > 0 && termcrit.maxCount > 0
    // or
    termcrit.type == TermCriteria::MAX_ITER) && termcrit.maxCount > 0
}</pre>
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class ConjGradSolver extends MinProblemSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConjGradSolver(Pointer p) { super(p); }

    /** \brief This function returns the reference to the ready-to-use ConjGradSolver object.
    <p>
    All the parameters are optional, so this procedure can be called even without parameters at
    all. In this case, the default values will be used. As default value for terminal criteria are
    the only sensible ones, MinProblemSolver::setFunction() should be called upon the obtained
    object, if the function was not given to create(). Otherwise, the two ways (submit it to
    create() or miss it out and call the MinProblemSolver::setFunction()) are absolutely equivalent
    (and will drop the same errors in the same way, should invalid input be detected).
    @param f Pointer to the function that will be minimized, similarly to the one you submit via
    MinProblemSolver::setFunction.
    @param termcrit Terminal criteria to the algorithm, similarly to the one you submit via
    MinProblemSolver::setTermCriteria.
    */
    public static native @Ptr ConjGradSolver create(@Ptr Function f/*=cv::Ptr<cv::ConjGradSolver::Function>()*/,
                                          @ByVal(nullValue = "cv::TermCriteria(cv::TermCriteria::MAX_ITER+cv::TermCriteria::EPS,5000,0.000001)") TermCriteria termcrit);
    public static native @Ptr ConjGradSolver create();
}
