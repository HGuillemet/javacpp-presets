// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.sentencepiece;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.sentencepiece.global.sentencepiece.*;

@Namespace("sentencepiece") @Opaque @Properties(inherit = org.bytedeco.sentencepiece.presets.sentencepiece.class)
public class NormalizerSpec extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NormalizerSpec() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NormalizerSpec(Pointer p) { super(p); }
}
