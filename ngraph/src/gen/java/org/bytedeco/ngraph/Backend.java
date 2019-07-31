// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


/** \brief Interface to a generic backend.
 * 
 *  Backends are responsible for function execution and value allocation. */
@Name("ngraph::runtime::Backend") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Backend extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Backend(Pointer p) { super(p); }

    /** \brief Create a new Backend object
     *  @param type The name of a registered backend, such as "CPU" or "GPU".
     *    To select a subdevice use "GPU:N" where s{@code N} is the subdevice number.
     *  @param must_support_dynamic If {@code true}, the returned {@code Backend} object
     *     will support dynamic tensors. If the underlying backend has native
     *     support for dynamic tensors, then that backend object will be
     *     returned directly. Otherwise, it will be wrapped with
     *     DynamicWrapperBackend. This feature is EXPERIMENTAL.
     *  @return shared_ptr to a new Backend or nullptr if the named backend
     *    does not exist. */
    public static native @SharedPtr Backend create(@StdString BytePointer type,
                                               @Cast("bool") boolean must_support_dynamic/*=false*/);
    public static native @SharedPtr Backend create(@StdString BytePointer type);
    public static native @SharedPtr Backend create(@StdString String type,
                                               @Cast("bool") boolean must_support_dynamic/*=false*/);
    public static native @SharedPtr Backend create(@StdString String type);

    /** \brief Query the list of registered devices
     *  @return A vector of all registered devices. */
    public static native @ByVal StringVector get_registered_devices();

    /** \brief Create a tensor specific to this backend
     *  @param element_type The type of the tensor element
     *  @param shape The shape of the tensor
     *  @return shared_ptr to a new backend-specific tensor */
    public native @SharedPtr @ByVal Tensor create_tensor(@Const @ByRef Type element_type, @Const @ByRef Shape shape);

    /** \brief Create a tensor specific to this backend
     *  @param element_type The type of the tensor element
     *  @param shape The shape of the tensor
     *  @param memory_pointer A pointer to a buffer used for this tensor. The size of the buffer
     *      must be sufficient to contain the tensor. The lifetime of the buffer is the
     *      responsibility of the caller.
     *  @return shared_ptr to a new backend-specific tensor */
    public native @SharedPtr @ByVal Tensor create_tensor(
            @Const @ByRef Type element_type, @Const @ByRef Shape shape, Pointer memory_pointer);

    /** \brief Create a tensor of C type T specific to this backend
     *  @param shape The shape of the tensor
     *  @return shared_ptr to a new backend specific tensor */

    /** \brief Create a dynamic tensor specific to this backend, if the backend supports dynamic
     *         tensors.
     *  @param element_type The type of the tensor element
     *  @param shape The shape of the tensor
     *  @return shared_ptr to a new backend-specific tensor
     *  @throws std::invalid_argument if the backend does not support dynamic tensors */
    public native @SharedPtr @ByVal Tensor create_dynamic_tensor(@Const @ByRef Type element_type, @Const @ByRef PartialShape shape);

    /** @return {@code true} if this backend supports dynamic tensors, else {@code false}. */
    public native @Cast("bool") boolean supports_dynamic_tensors();
    /** \brief Compiles a Function.
     *  @param func The function to compile
     *  @return compiled function or nullptr on failure */
    public native @SharedPtr Executable compile(@SharedPtr @ByVal Function func,
                                                    @Cast("bool") boolean enable_performance_data/*=false*/);
    public native @SharedPtr Executable compile(@SharedPtr @ByVal Function func);

    /** \brief Compiles a Function.
     *  @param func The function to compile
     *  @param pass_config Configuration object for defining compilation options
     *  @return compiled function or nullptr on failure */
    public native @SharedPtr Executable compile(@SharedPtr @ByVal Function func,
                                                    @ByRef PassConfig pass_config,
                                                    @Cast("bool") boolean enable_performance_data/*=false*/);
    public native @SharedPtr Executable compile(@SharedPtr @ByVal Function func,
                                                    @ByRef PassConfig pass_config);

    /** \brief Loads a previously saved Executable object from a stream.
     *  @param input_stream the opened input stream containing the saved Executable
     *  @return A compiled function or throws an exception on error */
    public native @SharedPtr Executable load(@Cast("std::istream*") @ByRef Pointer input_stream);

    /** \brief Test if a backend is capable of supporting an op
     *  @param node is the op to test.
     *  @return true if the op is supported, false otherwise. */
    public native @Cast("bool") boolean is_supported(@Const @ByRef Node node);

    /** \brief A set of properties supported by a backend */
    /** enum class ngraph::runtime::Backend::Property */
    public static final int
        memory_attach = 0; /** New tensor can use attached memory */

    /** \brief Test if a backend particular property is supported
     *  @param prop is the feature to test.
     *  @return true if the property is supported, false otherwise. */
    public native @Cast("bool") boolean is_supported_property(@Cast("const ngraph::runtime::Backend::Property") int prop);

    public native void remove_compiled_function(@SharedPtr Executable exec);

    /** \brief Return a backend specific op (that is not a core ngraph op).
     *      The string op_name is the requested op, which a backend may or may not implement.
     *      If unsupported, nullptr is returned, else a backend op is returned.
     *      The variadic input is used to pass inputs that the op constructor might take
     *  @param op_name is the name of the backend specific op
     *  @return a shared pointer to the op if found, else nullptr */
    public native @SharedPtr @ByVal Node get_backend_op(@StdString BytePointer op_name);
    public native @SharedPtr @ByVal Node get_backend_op(@StdString String op_name);

    /** \brief Returns memory allocator used by backend for host allocations */
    public native Allocator get_host_memory_allocator();
    /** \brief Set the host memory allocator to be used by the backend
     *  @param allocator is pointer to host memory allocator object */
    public native void set_host_memory_allocator(@MoveUniquePtr Allocator allocator);
    /** \brief Returns memory allocator used by backend for device allocations */
    public native Allocator get_device_memory_allocator();

    /** \brief method for each supported backend to determine if the passed pointer is in device pinned memory or not
     *  @param ptr pointer to the memory to determine if its in device memory or not */
    public native @Cast("bool") boolean is_device_memory(Pointer ptr);

    /** \brief Allows sending backend specific configuration. The map contains key, value pairs
     *      specific to a particluar backend. The definition of these key, value pairs is
     *      defined by each backend.
     *  @param config The configuration map sent to the backend
     *  @param error An error string describing any error encountered
     *  @return true if the configuration is supported, false otherwise. On false the error
     *      parameter value is valid. */
    public native @Cast("bool") boolean set_config(@Const @ByRef StringStringMap config, @StdString @ByRef BytePointer error);
}
