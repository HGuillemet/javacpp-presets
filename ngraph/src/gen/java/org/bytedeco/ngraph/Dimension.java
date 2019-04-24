// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

    /** \brief Class representing a dimension, which may be dynamic (undetermined until runtime),
     *         in a shape or shape-like object.
     * 
     *  Static dimensions may be implicitly converted from size_t. A dynamic dimension is
     *  constructed with Dimension() or Dimension::dynamic().
     * 
     *  XXX: THIS CLASS IS NOT IN USE YET AND THE ENTIRE DESIGN IS SUBJECT TO CHANGE. */
    @Namespace("ngraph") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Dimension extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Dimension(Pointer p) { super(p); }
    
        /** \brief Construct a static dimension.
         *  @param dimension Value of the dimension. Must not be equal to
         *                   Dimension::s_dynamic_val.
         *  @throws std::invalid_argument If {@code dimension} == Dimension::s_dynamic_val. */
        public Dimension(@Cast("size_t") long dimension) { super((Pointer)null); allocate(dimension); }
        private native void allocate(@Cast("size_t") long dimension);

        /** \brief Construct a dynamic dimension. */
        public Dimension() { super((Pointer)null); allocate(); }
        private native void allocate();
        /** \brief Check whether this dimension is static.
         *  @return {@code true} if the dimension is static, else {@code false}. */
        public native @Cast("bool") boolean is_static();
        /** \brief Check whether this dimension is dynamic.
         *  @return {@code false} if the dimension is static, else {@code true}. */
        public native @Cast("bool") boolean is_dynamic();
        /** \brief Convert this dimension to {@code size_t}. This dimension must be static.
         *  @throws std::invalid_argument If this dimension is dynamic. */
        public native @Cast("size_t") @Name("operator size_t") long asLong();
        /** \brief Convert this dimension to {@code ptrdiff_t}. This dimension must be static.
         *  @throws std::invalid_argument If this dimension is dynamic. */

        /** \brief Check whether this dimension represents the same scheme as the argument (both
         *         dynamic, or equal).
         *  @param dim The other dimension to compare this dimension to.
         *  @return {@code true} if this dimension and {@code dim} are both dynamic, or if they are both
         *          static and equal; otherwise, {@code false}. */
        
        ///
        public native @Cast("bool") boolean same_scheme(@Const @ByRef Dimension dim);

        /** \brief Try to merge two Dimension objects together.
         *  @param dst [out] Reference to write the merged Dimension into.
         *  @param d1 First dimension to merge.
         *  @param d2 Second dimension to merge.
         *  @return {@code true} if merging succeeds, else {@code false}.
         * 
         *  \li If {@code d1} is dynamic, writes {@code d2} to {@code dst} and returns {@code true}.
         *  \li If {@code d2} is dynamic, writes {@code d1} to {@code dst} and returns {@code true}.
         *  \li If {@code d1} and {@code d2} are static and equal, writes {@code d1} to {@code dst} and returns {@code true}.
         *  \li If {@code d1} and {@code d2} are both static and unequal, leaves {@code dst} unchanged and
         *      returns {@code false}. */
        
        ///
        public static native @Cast("bool") boolean merge(@ByRef Dimension dst, @Const @ByVal Dimension d1, @Const @ByVal Dimension d2);

        /** \brief Check whether this dimension is capable of being merged with the argument
         *         dimension.
         *  @param d The dimension to compare this dimension with.
         *  @return {@code true} if this dimension is compatible with {@code d}, else {@code false}.
         * 
         *  Two dimensions are considered compatible if it is possible to merge them. (See
         *  Dimension::merge.) */
        
        ///
        ///
        public native @Cast("bool") boolean compatible(@Const @ByRef Dimension d);

        /** \brief Check whether this dimension is a relaxation of the argument.
         *  @param d The dimension to compare this dimension with.
         *  @return {@code true} if this dimension relaxes {@code d}, else {@code false}.
         * 
         *  A dimension {@code d1} _relaxes_ (or _is a relaxation of_) {@code d2} if {@code d1} and {@code d2} are static
         *  and equal, or {@code d1} is dynamic.
         * 
         *  {@code d1.relaxes(d2)} is equivalent to {@code d2.refines(d1)}. */
        
        ///
        ///
        public native @Cast("bool") boolean relaxes(@Const @ByRef Dimension d);

        /** \brief Check whether this dimension is a refinement of the argument.
         *  @param d The dimension to compare this dimension with.
         *  @return {@code true} if this dimension relaxes {@code d}, else {@code false}.
         * 
         *  A dimension {@code d2} _refines_ (or _is a refinement of_) {@code d1} if {@code d1} and {@code d2} are static
         *  and equal, or {@code d2} is dynamic.
         * 
         *  {@code d1.refines(d2)} is equivalent to {@code d2.relaxes(d1)}. */
        public native @Cast("bool") boolean refines(@Const @ByRef Dimension d);

        /** \brief Create a dynamic dimension.
         *  @return A dynamic dimension. */
        public static native @ByVal Dimension dynamic();
        /** \brief Constant for the value used internally to represent a dynamic dimension. */
        @MemberGetter public static native @Cast("const size_t") long s_dynamic_val();
        public static final long s_dynamic_val = s_dynamic_val();

        /** \brief Addition operator for Dimension.
         *  @param dim Right operand for addition.
         *  @return Dimension::dynamic() if either of {@code *this} or {@code dim} is dynamic; else, a static
         *          dimension with value {@code size_t(*this)+size_t(dim)}. */
        public native @ByVal @Name("operator +") Dimension add(@Const @ByRef Dimension dim);

        /** \brief Subtraction operator for Dimension.
         *  @param dim Right operand for subtraction.
         *  @return Dimension::dynamic() if either of {@code *this} or {@code dim} is dynamic; else, a static
         *          dimension with value {@code size_t(*this)-size_t(dim)}. */
        public native @ByVal @Name("operator -") Dimension subtract(@Const @ByRef Dimension dim);

        /** \brief Multiplication operator for Dimension.
         *  @param dim Right operand for multiplicaiton.
         *  @return 0 if either of {@code *this} or {@code dim} is static and 0; else, Dimension::dynamic() if
         *          either of {@code *this} or {@code dim} is dynamic; else, a static dimension with value
         *          {@code size_t(*this)*size_t(dim)}. */
        public native @ByVal @Name("operator *") Dimension multiply(@Const @ByRef Dimension dim);

        /** \brief Add-into operator for Dimension.
         *  @param dim Right operand for addition.
         *  @return A reference to {@code *this}, after updating {@code *this} to the value {@code *this + dim}. */
        public native @ByRef @Name("operator +=") Dimension addPut(@Const @ByRef Dimension dim);
        /** \brief Multiply-into operator for Dimension.
         *  @param dim Right operand for multiplication.
         *  @return A reference to {@code *this}, after updating {@code *this} to the value {@code *this * dim}. */
        public native @ByRef @Name("operator *=") Dimension multiplyPut(@Const @ByRef Dimension dim);
    }
