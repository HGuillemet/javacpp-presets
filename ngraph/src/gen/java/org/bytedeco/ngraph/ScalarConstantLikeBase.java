// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


        @Namespace("ngraph::op") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class ScalarConstantLikeBase extends Constant {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public ScalarConstantLikeBase(Pointer p) { super(p); }
        
            public native @SharedPtr @ByVal Constant as_constant();
        }
