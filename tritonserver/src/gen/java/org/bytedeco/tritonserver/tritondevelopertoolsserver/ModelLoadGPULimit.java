// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritondevelopertoolsserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritondevelopertoolsserver.*;


//==============================================================================
/** Structure to hold GPU limit of model loading for setting 'ServerOptions'.
 *  The limit on GPU memory usage is specified as a fraction. If model loading
 *  on the device is requested and the current memory usage exceeds the limit,
 *  the load will be rejected. If not specified, the limit will not be set. */
@Namespace("triton::developer_tools::server") @NoOffset @Properties(inherit = org.bytedeco.tritonserver.presets.tritondevelopertoolsserver.class)
public class ModelLoadGPULimit extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModelLoadGPULimit(Pointer p) { super(p); }

  public ModelLoadGPULimit(int device_id, double fraction) { super((Pointer)null); allocate(device_id, fraction); }
  private native void allocate(int device_id, double fraction);

  // The GPU device ID.
  public native int device_id_(); public native ModelLoadGPULimit device_id_(int setter);
  // The limit on memory usage as a fraction.
  public native double fraction_(); public native ModelLoadGPULimit fraction_(double setter);
}
