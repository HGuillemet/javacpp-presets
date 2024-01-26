// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritondevelopertoolsserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritondevelopertoolsserver.*;


//==============================================================================
/** Structure to hold the full path to the model repository to be registered and
 *  the mapping from the original model name to the overriden one. This object
 *  is used for calling 'TritonServer::RegisterModelRepo' for registering
 *  model repository.
 *  */
@Namespace("triton::developer_tools::server") @NoOffset @Properties(inherit = org.bytedeco.tritonserver.presets.tritondevelopertoolsserver.class)
public class NewModelRepo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NewModelRepo(Pointer p) { super(p); }

  public NewModelRepo(@StdString BytePointer path) { super((Pointer)null); allocate(path); }
  private native void allocate(@StdString BytePointer path);
  public NewModelRepo(@StdString String path) { super((Pointer)null); allocate(path); }
  private native void allocate(@StdString String path);

  public NewModelRepo(
        @StdString BytePointer path, @StdString BytePointer original_name,
        @StdString BytePointer override_name) { super((Pointer)null); allocate(path, original_name, override_name); }
  private native void allocate(
        @StdString BytePointer path, @StdString BytePointer original_name,
        @StdString BytePointer override_name);
  public NewModelRepo(
        @StdString String path, @StdString String original_name,
        @StdString String override_name) { super((Pointer)null); allocate(path, original_name, override_name); }
  private native void allocate(
        @StdString String path, @StdString String original_name,
        @StdString String override_name);

  // The full path to the model repository.
  public native @StdString BytePointer path_(); public native NewModelRepo path_(BytePointer setter);
  // The original name of the model. This field is optional when there is no
  // name mapping needed.
  public native @StdString BytePointer original_name_(); public native NewModelRepo original_name_(BytePointer setter);
  // The original name of the model. This field is optional when there is no
  // name mapping needed.
  public native @StdString BytePointer override_name_(); public native NewModelRepo override_name_(BytePointer setter);
}
