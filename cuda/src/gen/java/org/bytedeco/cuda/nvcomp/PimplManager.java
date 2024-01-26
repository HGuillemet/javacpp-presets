// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;


@Namespace("nvcomp") @NoOffset @Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class PimplManager extends nvcompManagerBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PimplManager(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PimplManager(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PimplManager position(long position) {
        return (PimplManager)super.position(position);
    }
    @Override public PimplManager getPointer(long i) {
        return new PimplManager((Pointer)this).offsetAddress(i);
    }


  public PimplManager() { super((Pointer)null); allocate(); }
  private native void allocate();

  
  

  public native @ByVal CompressionConfig configure_compression(@Cast("const size_t") long decomp_buffer_size);

  public native void compress(
        @Cast("const uint8_t*") BytePointer decomp_buffer, 
        @Cast("uint8_t*") BytePointer comp_buffer,
        @Const @ByRef CompressionConfig comp_config);
  public native void compress(
        @Cast("const uint8_t*") ByteBuffer decomp_buffer, 
        @Cast("uint8_t*") ByteBuffer comp_buffer,
        @Const @ByRef CompressionConfig comp_config);
  public native void compress(
        @Cast("const uint8_t*") byte[] decomp_buffer, 
        @Cast("uint8_t*") byte[] comp_buffer,
        @Const @ByRef CompressionConfig comp_config);

  public native @ByVal DecompressionConfig configure_decompression(@Cast("const uint8_t*") BytePointer comp_buffer);
  public native @ByVal DecompressionConfig configure_decompression(@Cast("const uint8_t*") ByteBuffer comp_buffer);
  public native @ByVal DecompressionConfig configure_decompression(@Cast("const uint8_t*") byte[] comp_buffer);

  public native @ByVal DecompressionConfig configure_decompression(@Const @ByRef CompressionConfig comp_config);

  public native void decompress(
        @Cast("uint8_t*") BytePointer decomp_buffer, 
        @Cast("const uint8_t*") BytePointer comp_buffer,
        @Const @ByRef DecompressionConfig decomp_config);
  public native void decompress(
        @Cast("uint8_t*") ByteBuffer decomp_buffer, 
        @Cast("const uint8_t*") ByteBuffer comp_buffer,
        @Const @ByRef DecompressionConfig decomp_config);
  public native void decompress(
        @Cast("uint8_t*") byte[] decomp_buffer, 
        @Cast("const uint8_t*") byte[] comp_buffer,
        @Const @ByRef DecompressionConfig decomp_config);
 
  

  public native @Cast("size_t") long get_compressed_output_size(@Cast("uint8_t*") BytePointer comp_buffer);
  public native @Cast("size_t") long get_compressed_output_size(@Cast("uint8_t*") ByteBuffer comp_buffer);
  public native @Cast("size_t") long get_compressed_output_size(@Cast("uint8_t*") byte[] comp_buffer);
}
