// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/**
 * An instance of this class handles the registration for one or more operators.
 * Make sure you keep the RegisterOperators instance around since it will
 * deregister the operator it's responsible for in its destructor.
 *
 * Example:
 *
 * > namespace {
 * >   class my_kernel_cpu final : public c10::OperatorKernel {
 * >   public:
 * >     Tensor operator()(Tensor a, Tensor b) {...}
 * >   };
 * > }
 * >
 * > static auto registry = c10::RegisterOperators()
 * >     .op(c10::RegisterOperators::options()
 * >         .schema("my_op")
 * >         .kernel<my_kernel_cpu>(DispatchKey::CPU));
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RegisterOperators extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegisterOperators(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RegisterOperators(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RegisterOperators position(long position) {
        return (RegisterOperators)super.position(position);
    }
    @Override public RegisterOperators getPointer(long i) {
        return new RegisterOperators((Pointer)this).offsetAddress(i);
    }

  public RegisterOperators() { super((Pointer)null); allocate(); }
  private native void allocate();

  
  
  public RegisterOperators(@ByRef(true) RegisterOperators arg0) { super((Pointer)null); allocate(arg0); }
  @NoException(true) private native void allocate(@ByRef(true) RegisterOperators arg0);
  public native @ByRef @Name("operator =") @NoException(true) RegisterOperators put(@ByRef(true) RegisterOperators arg0);

  /**
   * Call this to get an instance of registration options, which
   * can be passed to a call to RegisterOperators::op() to specify
   * these options for the operator registration.
   * See class doc comment for examples.
   */

  /**
   * Call this to register an operator. See class doc comment for examples.
   */
  

  // Regular mutator version of the && version above

  /**
   * This is a shorthand for RegisterOperators::op(Options) where you can
   * specify the operator schema outside of the options parameter.
   * See class doc comment for examples.
   */
  

  // internal only for registering caffe2 ops
  

  /**
   * This API registers an operator based on a kernel function pointer.
   *
   * Given a kernel
   *
   * > namespace { Tensor my_kernel_cpu(Tensor a, Tensor b) {...} }
   *
   * This API looks like:
   *
   * > static auto registry = c10::RegisterOperators()
   * >     .op("my_op", &my_kernel_cpu);
   *
   * If your kernel is small and the overhead of calling it matters,
   * then this API might be the wrong choice since the following API
   * has a slightly lower overhead for calling into the kernel:
   *
   * > static auto registry = c10::RegisterOperators()
   * >     .op("my_op", c10::RegisterOperators::options()
   * >         .kernel<decltype(my_kernel_cpu), &my_kernel_cpu>());
   *
   * Or, alternatively, write your kernel as a functor:
   *
   * > namespace {
   * >   class my_kernel_cpu final : public c10::OperatorKernel {
   * >   public:
   * >     Tensor operator()(Tensor a, Tensor b) {...}
   * >   };
   * > }
   * >
   * > static auto registry = c10::RegisterOperators()
   * >     .op("my_op", c10::RegisterOperators::options()
   * >         .kernel<my_kernel_cpu>());
   */
   

   /**
    * This API registers an operator based on a kernel lambda.
    *
    * This API looks like:
    *
    * > static auto registry = c10::RegisterOperators()
    * >     .op("my_op", [] (Tensor a, Tensor b) {...});
    *
    * This is equivalent to:
    *
    * > static auto registry = c10::RegisterOperators()
    * >     .op("my_op", c10::RegisterOperators::options()
    * >         .catchAllKernel([] (Tensor a, Tensor b) {...}));
    *
    */
    

    
}
