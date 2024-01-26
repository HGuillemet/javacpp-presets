// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;

@NoOffset @Name("tl::optional<dai::LogLevel>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class LogLevelOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LogLevelOptional(Pointer p) { super(p); }
    public LogLevelOptional(LogLevel value) { this(); put(value); }
    public LogLevelOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef LogLevelOptional put(@ByRef LogLevelOptional x);

    public native boolean has_value();
    public native void reset();
    public native @Name("value") @ByRef LogLevel get();
    @ValueSetter public native LogLevelOptional put(@ByRef LogLevel value);
}

