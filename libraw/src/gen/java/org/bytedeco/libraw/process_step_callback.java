// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libraw;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libraw.global.LibRaw.*;

  @Properties(inherit = org.bytedeco.libraw.presets.LibRaw.class)
public class process_step_callback extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    process_step_callback(Pointer p) { super(p); }
      protected process_step_callback() { allocate(); }
      private native void allocate();
      public native void call(Pointer ctx);
  }
