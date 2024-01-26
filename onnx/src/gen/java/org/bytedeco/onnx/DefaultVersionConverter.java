// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx::version_conversion") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class DefaultVersionConverter extends BaseVersionConverter {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DefaultVersionConverter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DefaultVersionConverter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DefaultVersionConverter position(long position) {
        return (DefaultVersionConverter)super.position(position);
    }
    @Override public DefaultVersionConverter getPointer(long i) {
        return new DefaultVersionConverter((Pointer)this).offsetAddress(i);
    }

  public DefaultVersionConverter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByVal ModelProto convert_version(@Const @ByRef ModelProto mp_in, @Const @ByRef OpSetID initial_version, @Const @ByRef OpSetID target_version);
}
