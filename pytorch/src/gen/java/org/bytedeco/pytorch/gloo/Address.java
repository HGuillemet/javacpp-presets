// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.gloo;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.chrono.Chrono.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.gloo.*;


@Namespace("gloo::transport") @Properties(inherit = org.bytedeco.pytorch.presets.gloo.class)
public class Address extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Address(Pointer p) { super(p); }

  // Upper bound for an address' byte representation.

  public native @StdString BytePointer str();

  public native @ByVal @Cast("std::vector<char>*") ByteVector bytes();
}
