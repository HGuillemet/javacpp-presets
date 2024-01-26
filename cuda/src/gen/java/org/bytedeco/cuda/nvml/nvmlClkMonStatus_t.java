// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Clock Monitor Status
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlClkMonStatus_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlClkMonStatus_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlClkMonStatus_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlClkMonStatus_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlClkMonStatus_t position(long position) {
        return (nvmlClkMonStatus_t)super.position(position);
    }
    @Override public nvmlClkMonStatus_t getPointer(long i) {
        return new nvmlClkMonStatus_t((Pointer)this).offsetAddress(i);
    }

    /**
     * Fault status Indicator
     */
    public native @Cast("unsigned int") int bGlobalStatus(); public native nvmlClkMonStatus_t bGlobalStatus(int setter);

    /**
     * Total faulted domain numbers
     */
    public native @Cast("unsigned int") int clkMonListSize(); public native nvmlClkMonStatus_t clkMonListSize(int setter);

    /**
     * The fault Information structure
     */
    public native @ByRef nvmlClkMonFaultInfo_t clkMonList(int i); public native nvmlClkMonStatus_t clkMonList(int i, nvmlClkMonFaultInfo_t setter);
    @MemberGetter public native nvmlClkMonFaultInfo_t clkMonList();
}
