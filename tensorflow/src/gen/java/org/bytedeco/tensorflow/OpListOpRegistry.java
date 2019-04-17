// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// An adapter to allow an OpList to be used as an OpRegistryInterface.
//
// Note that shape inference functions are not passed in to OpListOpRegistry, so
// it will return an unusable shape inference function for every op it supports;
// therefore, it should only be used in contexts where this is okay.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OpListOpRegistry extends OpRegistryInterface {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpListOpRegistry(Pointer p) { super(p); }

  // Does not take ownership of op_list, *op_list must outlive *this.
  public OpListOpRegistry(@Const OpList op_list) { super((Pointer)null); allocate(op_list); }
  private native void allocate(@Const OpList op_list);
  public native @ByVal Status LookUp(@StdString BytePointer op_type_name,
                  @Cast("const tensorflow::OpRegistrationData**") PointerPointer op_reg_data);
  public native @ByVal Status LookUp(@StdString BytePointer op_type_name,
                  @Const @ByPtrPtr OpRegistrationData op_reg_data);
  public native @ByVal Status LookUp(@StdString String op_type_name,
                  @Const @ByPtrPtr OpRegistrationData op_reg_data);
}
