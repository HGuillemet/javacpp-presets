// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


	/**
	 * Async command callback function prototype. Defines the syntax of the
	 * async command function that is passed into LaunchCommandAsync().
	 */
	@Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class AsyncCommandCallback extends FunctionPointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public    AsyncCommandCallback(Pointer p) { super(p); }
	    protected AsyncCommandCallback() { allocate(); }
	    private native void allocate();
	    public native void call( @ByVal Error retError, Pointer pUserData );
	}
