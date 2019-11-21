// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;



// Describes an individual service method.  To obtain a MethodDescriptor given
// a service, first get its ServiceDescriptor, then call
// ServiceDescriptor::FindMethodByName().  Use DescriptorPool to construct your
// own descriptors.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class MethodDescriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MethodDescriptor(Pointer p) { super(p); }


  // Name of this method, not including containing scope.
  public native @StdString BytePointer name();
  // The fully-qualified name of the method, scope delimited by periods.
  public native @StdString BytePointer full_name();
  // Index within the service's Descriptor.
  public native int index();

  // The .proto file in which this method was defined.  Never NULL.
  public native @Const FileDescriptor file();
  // Gets the service to which this method belongs.  Never NULL.
  public native @Const ServiceDescriptor service();

  // Gets the type of protocol message which this method accepts as input.
  public native @Const Descriptor input_type();
  // Gets the type of protocol message which this message produces as output.
  public native @Const Descriptor output_type();

  // Gets whether the client streams multiple requests.
  public native @Cast("bool") boolean client_streaming();
  // Gets whether the server streams multiple responses.
  public native @Cast("bool") boolean server_streaming();

  // Get options for this method.  These are specified in the .proto file by
  // placing lines like "option foo = 1234;" in curly-braces after a method
  // declaration.  Allowed options are defined by MethodOptions in
  // descriptor.proto, and any available extensions of that message.
  public native @Const @ByRef MethodOptions options();

  // See Descriptor::CopyTo().
  public native void CopyTo(MethodDescriptorProto proto);

  // See Descriptor::DebugString().
  public native @StdString BytePointer DebugString();

  // See Descriptor::DebugStringWithOptions().
  public native @StdString BytePointer DebugStringWithOptions(@Const @ByRef DebugStringOptions options);


  // Source Location ---------------------------------------------------

  // Updates |*out_location| to the source location of the complete
  // extent of this method declaration.  Returns false and leaves
  // |*out_location| unchanged iff location information was not available.
  public native @Cast("bool") boolean GetSourceLocation(SourceLocation out_location);
}
