// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.qt.global.Qt5Core.*;


@NoOffset @Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QTimerEvent extends QEvent {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QTimerEvent(Pointer p) { super(p); }

    public QTimerEvent( int timerId ) { super((Pointer)null); allocate(timerId); }
    private native void allocate( int timerId );
    public native int timerId();
}
