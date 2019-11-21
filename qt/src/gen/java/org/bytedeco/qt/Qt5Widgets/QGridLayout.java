// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Widgets;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.qt.Qt5Core.*;
import static org.bytedeco.qt.global.Qt5Core.*;
import org.bytedeco.qt.Qt5Gui.*;
import static org.bytedeco.qt.global.Qt5Gui.*;

import static org.bytedeco.qt.global.Qt5Widgets.*;

// Parsed from QtWidgets/qgridlayout.h

@Properties(inherit = org.bytedeco.qt.presets.Qt5Widgets.class)
public class QGridLayout extends QLayout {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QGridLayout(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QGridLayout(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QGridLayout position(long position) {
        return (QGridLayout)super.position(position);
    }

    public QGridLayout(QWidget parent) { super((Pointer)null); allocate(parent); }
    private native void allocate(QWidget parent);
    public QGridLayout() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native @ByVal QSize sizeHint();
    public native @ByVal QSize minimumSize();
    public native @ByVal QSize maximumSize();

    public native void setHorizontalSpacing(int spacing);
    public native int horizontalSpacing();
    public native void setVerticalSpacing(int spacing);
    public native int verticalSpacing();
    public native void setSpacing(int spacing);
    public native int spacing();

    public native void setRowStretch(int row, int stretch);
    public native void setColumnStretch(int column, int stretch);
    public native int rowStretch(int row);
    public native int columnStretch(int column);

    public native void setRowMinimumHeight(int row, int minSize);
    public native void setColumnMinimumWidth(int column, int minSize);
    public native int rowMinimumHeight(int row);
    public native int columnMinimumWidth(int column);

    public native int columnCount();
    public native int rowCount();

    public native @Cast("bool") boolean hasHeightForWidth();
    public native int heightForWidth(int arg0);
    public native int minimumHeightForWidth(int arg0);
    public native void invalidate();

    public native void addWidget(QWidget w);
    public native void addWidget(QWidget arg0, int row, int column, @ByVal(nullValue = "Qt::Alignment()") @Cast("Qt::Alignment") int arg3);
    public native void addWidget(QWidget arg0, int row, int column);
    public native void addWidget(QWidget arg0, int row, int column, int rowSpan, int columnSpan, @ByVal(nullValue = "Qt::Alignment()") @Cast("Qt::Alignment") int arg5);
    public native void addWidget(QWidget arg0, int row, int column, int rowSpan, int columnSpan);
    public native void addLayout(QLayout arg0, int row, int column, @ByVal(nullValue = "Qt::Alignment()") @Cast("Qt::Alignment") int arg3);
    public native void addLayout(QLayout arg0, int row, int column);
    public native void addLayout(QLayout arg0, int row, int column, int rowSpan, int columnSpan, @ByVal(nullValue = "Qt::Alignment()") @Cast("Qt::Alignment") int arg5);
    public native void addLayout(QLayout arg0, int row, int column, int rowSpan, int columnSpan);

    public native void setOriginCorner(@Cast("Qt::Corner") int arg0);
    public native @Cast("Qt::Corner") int originCorner();

    public native QLayoutItem itemAt(int index);
    public native QLayoutItem itemAtPosition(int row, int column);
    public native QLayoutItem takeAt(int index);
    public native int count();

    public native void addItem(QLayoutItem item, int row, int column, int rowSpan/*=1*/, int columnSpan/*=1*/, @ByVal(nullValue = "Qt::Alignment()") @Cast("Qt::Alignment") int arg5);
    public native void addItem(QLayoutItem item, int row, int column);

    public native void setDefaultPositioning(int n, Orientation orient);
    public native void getItemPosition(int idx, IntPointer row, IntPointer column, IntPointer rowSpan, IntPointer columnSpan);
    public native void getItemPosition(int idx, IntBuffer row, IntBuffer column, IntBuffer rowSpan, IntBuffer columnSpan);
    public native void getItemPosition(int idx, int[] row, int[] column, int[] rowSpan, int[] columnSpan);

}
