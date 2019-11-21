// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;


@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class PPCPlatformStrings extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPCPlatformStrings() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPCPlatformStrings(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPCPlatformStrings(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPCPlatformStrings position(long position) {
        return (PPCPlatformStrings)super.position(position);
    }

  public native @Cast("char") byte platform(int i); public native PPCPlatformStrings platform(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer platform();  // 0 terminated string
  public native @Cast("char") byte model(int i); public native PPCPlatformStrings model(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer model();     // 0 terminated string
  public native @Cast("char") byte machine(int i); public native PPCPlatformStrings machine(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer machine();   // 0 terminated string
  public native @Cast("char") byte cpu(int i); public native PPCPlatformStrings cpu(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer cpu();       // 0 terminated string
  public native @ByRef PlatformType type(); public native PPCPlatformStrings type(PlatformType setter);
}
