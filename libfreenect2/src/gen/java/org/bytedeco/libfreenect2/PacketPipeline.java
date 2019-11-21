// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libfreenect2.global.freenect2.*;


/** \defgroup pipeline Packet Pipelines
 * Implement various methods to decode color and depth images with different performance and platform support
 *
 * You can construct a specific PacketPipeline object and provide it to Freenect2::openDevice().
 */
/**\{
<p>
/** Base class for other pipeline classes.
 * Methods in this class are reserved for internal use.
 */
@Namespace("libfreenect2") @NoOffset @Properties(inherit = org.bytedeco.libfreenect2.presets.freenect2.class)
public class PacketPipeline extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PacketPipeline(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PacketPipeline(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PacketPipeline position(long position) {
        return (PacketPipeline)super.position(position);
    }


  public PacketPipeline() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("libfreenect2::PacketPipeline::PacketParser*") DataCallback getRgbPacketParser();
  public native @Cast("libfreenect2::PacketPipeline::PacketParser*") DataCallback getIrPacketParser();

  public native RgbPacketProcessor getRgbPacketProcessor();
  public native DepthPacketProcessor getDepthPacketProcessor();
}
