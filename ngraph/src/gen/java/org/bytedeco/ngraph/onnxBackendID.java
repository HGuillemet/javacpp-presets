// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

// #endif
// #endif /* !defined(ONNXIFI_NO_STDINT_H) */

/**
 * Opaque ONNXIFI backend ID.
 *
 * ONNXIFI backend is a combination of software layer and hardware device used
 * to run an ONNX graph. Backend ID uniquely identifies a backend for the life-
 * time of the process (i.e. no two hardware devices, software layers, or
 * combinations of both can have the same backend ID). Backend ID stays valid
 * even if the hardware device used by the backend disconnects from the system.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class onnxBackendID extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public onnxBackendID() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public onnxBackendID(Pointer p) { super(p); }
}
