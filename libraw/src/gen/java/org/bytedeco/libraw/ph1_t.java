// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;


  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class ph1_t extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public ph1_t() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public ph1_t(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public ph1_t(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public ph1_t position(long position) {
          return (ph1_t)super.position(position);
      }
      @Override public ph1_t getPointer(long i) {
          return new ph1_t((Pointer)this).offsetAddress(i);
      }
  
    public native int format(); public native ph1_t format(int setter);
    public native int key_off(); public native ph1_t key_off(int setter);
    public native int tag_21a(); public native ph1_t tag_21a(int setter);
    public native int t_black(); public native ph1_t t_black(int setter);
    public native int split_col(); public native ph1_t split_col(int setter);
    public native int black_col(); public native ph1_t black_col(int setter);
    public native int split_row(); public native ph1_t split_row(int setter);
    public native int black_row(); public native ph1_t black_row(int setter);
    public native float tag_210(); public native ph1_t tag_210(float setter);
  }
