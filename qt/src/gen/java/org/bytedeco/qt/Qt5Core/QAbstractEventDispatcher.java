// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.qt.global.Qt5Core.*;

// Parsed from QtCore/qabstracteventdispatcher.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QAbstractEventDispatcher extends QObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QAbstractEventDispatcher(Pointer p) { super(p); }

    @NoOffset public static class TimerInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TimerInfo(Pointer p) { super(p); }
    
        public native int timerId(); public native TimerInfo timerId(int setter);
        public native int interval(); public native TimerInfo interval(int setter);
        public native @Cast("Qt::TimerType") int timerType(); public native TimerInfo timerType(int setter);

        public TimerInfo(int id, int i, @Cast("Qt::TimerType") int t) { super((Pointer)null); allocate(id, i, t); }
        private native void allocate(int id, int i, @Cast("Qt::TimerType") int t);
    }

    public static native QAbstractEventDispatcher instance();
    public native @Cast("bool") boolean hasPendingEvents(); // ### Qt6: remove, mark final or make protected

// #if QT_DEPRECATED_SINCE(5,0)
// #endif
    // ### Qt6: change interval range to qint64 (or use QDeadlineTimer)
    public native int registerTimer(int interval, @Cast("Qt::TimerType") int timerType, QObject object);
    public native void registerTimer(int timerId, int interval, @Cast("Qt::TimerType") int timerType, QObject object);
    public native @Cast("bool") boolean unregisterTimer(int timerId);
    public native @Cast("bool") boolean unregisterTimers(QObject object);

    public native int remainingTime(int timerId);

// #if defined(Q_OS_WIN) || defined(Q_CLANG_QDOC)
// #endif

    public native void wakeUp();
    public native void interrupt();
    public native void flush(); // ### Qt6: remove, mark final or make protected

    public native void startingUp();
    public native void closingDown();
    public native @Cast("bool") boolean filterNativeEvent(@Const @ByRef QByteArray eventType, Pointer message, CLongPointer result);
}
