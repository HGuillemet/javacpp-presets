// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class libraw_processed_image_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public libraw_processed_image_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public libraw_processed_image_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public libraw_processed_image_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public libraw_processed_image_t position(long position) {
          return (libraw_processed_image_t)super.position(position);
      }
      @Override public libraw_processed_image_t getPointer(long i) {
          return new libraw_processed_image_t((Pointer)this).offsetAddress(i);
      }
  
    public native LibRaw_image_formats type(); public native libraw_processed_image_t type(LibRaw_image_formats setter);
    public native @Cast("ushort") short height(); public native libraw_processed_image_t height(short setter);
    public native @Cast("ushort") short width(); public native libraw_processed_image_t width(short setter);
    public native @Cast("ushort") short colors(); public native libraw_processed_image_t colors(short setter);
    public native @Cast("ushort") short bits(); public native libraw_processed_image_t bits(short setter);
    public native @Cast("unsigned int") int data_size(); public native libraw_processed_image_t data_size(int setter);
    public native @Cast("unsigned char") byte data(int i); public native libraw_processed_image_t data(int i, byte setter);
    @MemberGetter public native @Cast("unsigned char*") BytePointer data();
  }
