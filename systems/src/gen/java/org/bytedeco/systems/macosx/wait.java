// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


/*
 * Deprecated:
 * Structure of the information in the status word returned by wait4.
 * If w_stopval==_WSTOPPED, then the second structure describes
 * the information returned, else the first.
 */
@Name("union wait") @Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class wait extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public wait() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public wait(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public wait(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public wait position(long position) {
        return (wait)super.position(position);
    }
    @Override public wait getPointer(long i) {
        return new wait((Pointer)this).offsetAddress(i);
    }

	public native int w_status(); public native wait w_status(int setter);               /* used in syscall */
	/*
	 * Terminated process status.
	 */
// #if __DARWIN_BYTE_ORDER == __DARWIN_LITTLE_ENDIAN
		@Name("w_T.w_Termsig") public native @Cast("unsigned int") @NoOffset int w_T_w_Termsig(); public native wait w_T_w_Termsig(int setter);
		@Name("w_T.w_Coredump") public native @Cast("unsigned int") @NoOffset int w_T_w_Coredump(); public native wait w_T_w_Coredump(int setter);
		@Name("w_T.w_Retcode") public native @Cast("unsigned int") @NoOffset int w_T_w_Retcode(); public native wait w_T_w_Retcode(int setter);
		@Name("w_T.w_Filler") public native @Cast("unsigned int") @NoOffset int w_T_w_Filler(); public native wait w_T_w_Filler(int setter);                /* upper bits filler */
// #endif
// #if __DARWIN_BYTE_ORDER == __DARWIN_BIG_ENDIAN                /* termination signal */
// #endif
	/*
	 * Stopped process status.  Returned
	 * only for traced children unless requested
	 * with the WUNTRACED option bit.
	 */
// #if __DARWIN_BYTE_ORDER == __DARWIN_LITTLE_ENDIAN
		@Name("w_S.w_Stopval") public native @Cast("unsigned int") @NoOffset int w_S_w_Stopval(); public native wait w_S_w_Stopval(int setter);
		@Name("w_S.w_Stopsig") public native @Cast("unsigned int") @NoOffset int w_S_w_Stopsig(); public native wait w_S_w_Stopsig(int setter);
		@Name("w_S.w_Filler") public native @Cast("unsigned int") @NoOffset int w_S_w_Filler(); public native wait w_S_w_Filler(int setter);                /* upper bits filler */
// #endif
// #if __DARWIN_BYTE_ORDER == __DARWIN_BIG_ENDIAN                /* == W_STOPPED if stopped */
// #endif
}
