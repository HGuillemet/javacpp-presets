// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// A message to be sent/received by an RpcAgent.
//
// A Message object contains 4 fields:
//    payload (std::vector<char>): a binary chunk of data.
//    tensors (std::vector<torch::Tensor>): all tensors. Tensor data are not
//        included in the payload, and it is up to the RpcAgent implementation
//        to determine how to serialize them. This design is helpful for
//        communicating super large tensors where serializing all the data at
//        once leads to excessively large memory footprint. An implementation
//        can then serialize and send tensors chunk-by-chunk, in the streaming
//        fashion.
//    type (MessageType): type of the message.
//    id (int64_t): message id, this is used to match request and response.
//               Other implementation can ignore it if they have their own
//               ways to do matching.
//
// Layers above ``RpcAgent`` only converts ScriptCall, ScriptResp, PythonCall,
// and PythonResp into a Message, and it is up to the RpcAgent
// implementation to determine how to serialize a message.
@Namespace("torch::distributed::rpc") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Message extends CustomClassHolder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Message(Pointer p) { super(p); }

  
  
  
  

  // Destructively retrieves the payload.
  
  

  public native @Cast("std::vector<char>*") @ByRef ByteVector payload();
  public native @ByRef TensorVector tensors();
  public native MessageType type();

  public native @Cast("bool") boolean isRequest();
  public native @Cast("bool") boolean isResponse();
  

  // id is an optional field to match request/response. If an RpcAgent
  // implementation is able to do the matching without using this id, it can be
  // dropped during message serialization.
  public native @Cast("int64_t") long id();
  public native void setId(@Cast("int64_t") long id);

  public native @ByVal WeakStorageVector getStorages();
}
