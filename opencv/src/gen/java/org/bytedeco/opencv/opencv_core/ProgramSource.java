// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;



@Namespace("cv::ocl") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class ProgramSource extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProgramSource(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ProgramSource(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ProgramSource position(long position) {
        return (ProgramSource)super.position(position);
    }
    @Override public ProgramSource getPointer(long i) {
        return new ProgramSource((Pointer)this).offsetAddress(i);
    }
 // deprecated

    public ProgramSource() { super((Pointer)null); allocate(); }
    @NoException private native void allocate();
    public ProgramSource(@Str BytePointer module, @Str BytePointer name, @Str BytePointer codeStr, @Str BytePointer codeHash) { super((Pointer)null); allocate(module, name, codeStr, codeHash); }
    private native void allocate(@Str BytePointer module, @Str BytePointer name, @Str BytePointer codeStr, @Str BytePointer codeHash);
    public ProgramSource(@Str String module, @Str String name, @Str String codeStr, @Str String codeHash) { super((Pointer)null); allocate(module, name, codeStr, codeHash); }
    private native void allocate(@Str String module, @Str String name, @Str String codeStr, @Str String codeHash);
    public ProgramSource(@Str BytePointer prog) { super((Pointer)null); allocate(prog); }
    private native void allocate(@Str BytePointer prog);
    public ProgramSource(@Str String prog) { super((Pointer)null); allocate(prog); }
    private native void allocate(@Str String prog); // deprecated // deprecated
    public ProgramSource(@Const @ByRef ProgramSource prog) { super((Pointer)null); allocate(prog); }
    private native void allocate(@Const @ByRef ProgramSource prog);
    public native @ByRef @Name("operator =") ProgramSource put(@Const @ByRef ProgramSource prog);

    public native @Str BytePointer source(); // deprecated
    public native @Cast("cv::ocl::ProgramSource::hash_t") long hash(); // deprecated


    /** \brief Describe OpenCL program binary.
     * Do not call clCreateProgramWithBinary() and/or clBuildProgram().
     *
     * Caller should guarantee binary buffer lifetime greater than ProgramSource object (and any of its copies).
     *
     * This kind of binary is not portable between platforms in general - it is specific to OpenCL vendor / device / driver version.
     *
     * @param module name of program owner module
     * @param name unique name of program (module+name is used as key for OpenCL program caching)
     * @param binary buffer address. See buffer lifetime requirement in description.
     * @param size buffer size
     * @param buildOptions additional program-related build options passed to clBuildProgram()
     * @return created ProgramSource object
     */
    public static native @ByVal ProgramSource fromBinary(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") BytePointer binary, @Cast("const size_t") long size,
                @Str BytePointer buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromBinary(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") BytePointer binary, @Cast("const size_t") long size);
    public static native @ByVal ProgramSource fromBinary(@Str String module, @Str String name,
                @Cast("const unsigned char*") ByteBuffer binary, @Cast("const size_t") long size,
                @Str String buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromBinary(@Str String module, @Str String name,
                @Cast("const unsigned char*") ByteBuffer binary, @Cast("const size_t") long size);
    public static native @ByVal ProgramSource fromBinary(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") byte[] binary, @Cast("const size_t") long size,
                @Str BytePointer buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromBinary(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") byte[] binary, @Cast("const size_t") long size);
    public static native @ByVal ProgramSource fromBinary(@Str String module, @Str String name,
                @Cast("const unsigned char*") BytePointer binary, @Cast("const size_t") long size,
                @Str String buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromBinary(@Str String module, @Str String name,
                @Cast("const unsigned char*") BytePointer binary, @Cast("const size_t") long size);
    public static native @ByVal ProgramSource fromBinary(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") ByteBuffer binary, @Cast("const size_t") long size,
                @Str BytePointer buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromBinary(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") ByteBuffer binary, @Cast("const size_t") long size);
    public static native @ByVal ProgramSource fromBinary(@Str String module, @Str String name,
                @Cast("const unsigned char*") byte[] binary, @Cast("const size_t") long size,
                @Str String buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromBinary(@Str String module, @Str String name,
                @Cast("const unsigned char*") byte[] binary, @Cast("const size_t") long size);

    /** \brief Describe OpenCL program in SPIR format.
     * Do not call clCreateProgramWithBinary() and/or clBuildProgram().
     *
     * Supports SPIR 1.2 by default (pass '-spir-std=X.Y' in buildOptions to override this behavior)
     *
     * Caller should guarantee binary buffer lifetime greater than ProgramSource object (and any of its copies).
     *
     * Programs in this format are portable between OpenCL implementations with 'khr_spir' extension:
     * https://www.khronos.org/registry/OpenCL/sdk/2.0/docs/man/xhtml/cl_khr_spir.html
     * (but they are not portable between different platforms: 32-bit / 64-bit)
     *
     * Note: these programs can't support vendor specific extensions, like 'cl_intel_subgroups'.
     *
     * @param module name of program owner module
     * @param name unique name of program (module+name is used as key for OpenCL program caching)
     * @param binary buffer address. See buffer lifetime requirement in description.
     * @param size buffer size
     * @param buildOptions additional program-related build options passed to clBuildProgram()
     *        (these options are added automatically: '-x spir' and '-spir-std=1.2')
     * @return created ProgramSource object.
     */
    public static native @ByVal ProgramSource fromSPIR(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") BytePointer binary, @Cast("const size_t") long size,
                @Str BytePointer buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromSPIR(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") BytePointer binary, @Cast("const size_t") long size);
    public static native @ByVal ProgramSource fromSPIR(@Str String module, @Str String name,
                @Cast("const unsigned char*") ByteBuffer binary, @Cast("const size_t") long size,
                @Str String buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromSPIR(@Str String module, @Str String name,
                @Cast("const unsigned char*") ByteBuffer binary, @Cast("const size_t") long size);
    public static native @ByVal ProgramSource fromSPIR(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") byte[] binary, @Cast("const size_t") long size,
                @Str BytePointer buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromSPIR(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") byte[] binary, @Cast("const size_t") long size);
    public static native @ByVal ProgramSource fromSPIR(@Str String module, @Str String name,
                @Cast("const unsigned char*") BytePointer binary, @Cast("const size_t") long size,
                @Str String buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromSPIR(@Str String module, @Str String name,
                @Cast("const unsigned char*") BytePointer binary, @Cast("const size_t") long size);
    public static native @ByVal ProgramSource fromSPIR(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") ByteBuffer binary, @Cast("const size_t") long size,
                @Str BytePointer buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromSPIR(@Str BytePointer module, @Str BytePointer name,
                @Cast("const unsigned char*") ByteBuffer binary, @Cast("const size_t") long size);
    public static native @ByVal ProgramSource fromSPIR(@Str String module, @Str String name,
                @Cast("const unsigned char*") byte[] binary, @Cast("const size_t") long size,
                @Str String buildOptions/*=cv::String()*/);
    public static native @ByVal ProgramSource fromSPIR(@Str String module, @Str String name,
                @Cast("const unsigned char*") byte[] binary, @Cast("const size_t") long size);

    //OpenCL 2.1+ only
    //static Program fromSPIRV(const String& module, const String& name,
    //        const unsigned char* binary, const size_t size,
    //        const cv::String& buildOptions = cv::String());
    public native @Cast("cv::ocl::ProgramSource::Impl*") Pointer getImpl();
    public native @Cast("bool") boolean empty();
}
