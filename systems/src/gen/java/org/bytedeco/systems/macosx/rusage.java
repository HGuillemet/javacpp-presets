// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;
		/* Current process' children */

/*
 * A structure representing an accounting of resource utilization.  The
 * address of an instance of this structure is the second parameter to
 * getrusage().
 *
 * Note: All values other than ru_utime and ru_stime are implementaiton
 *       defined and subject to change in a future release.  Their use
 *       is discouraged for standards compliant programs.
 */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class rusage extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rusage() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rusage(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rusage(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rusage position(long position) {
        return (rusage)super.position(position);
    }

	public native @ByRef timeval ru_utime(); public native rusage ru_utime(timeval setter);	/* user time used (PL) */
	public native @ByRef timeval ru_stime(); public native rusage ru_stime(timeval setter);	/* system time used (PL) */
// #if __DARWIN_C_LEVEL < __DARWIN_C_FULL
// #else
	/*
	 * Informational aliases for source compatibility with programs
	 * that need more information than that provided by standards,
	 * and which do not mind being OS-dependent.
	 */
	public native long ru_maxrss(); public native rusage ru_maxrss(long setter);		/* max resident set size (PL) */
// #define	ru_first	ru_ixrss	/* internal: ruadd() range start */
	public native long ru_ixrss(); public native rusage ru_ixrss(long setter);		/* integral shared memory size (NU) */
	public native long ru_idrss(); public native rusage ru_idrss(long setter);		/* integral unshared data (NU)  */
	public native long ru_isrss(); public native rusage ru_isrss(long setter);		/* integral unshared stack (NU) */
	public native long ru_minflt(); public native rusage ru_minflt(long setter);		/* page reclaims (NU) */
	public native long ru_majflt(); public native rusage ru_majflt(long setter);		/* page faults (NU) */
	public native long ru_nswap(); public native rusage ru_nswap(long setter);		/* swaps (NU) */
	public native long ru_inblock(); public native rusage ru_inblock(long setter);		/* block input operations (atomic) */
	public native long ru_oublock(); public native rusage ru_oublock(long setter);		/* block output operations (atomic) */
	public native long ru_msgsnd(); public native rusage ru_msgsnd(long setter);		/* messages sent (atomic) */
	public native long ru_msgrcv(); public native rusage ru_msgrcv(long setter);		/* messages received (atomic) */
	public native long ru_nsignals(); public native rusage ru_nsignals(long setter);		/* signals received (atomic) */
	public native long ru_nvcsw(); public native rusage ru_nvcsw(long setter);		/* voluntary context switches (atomic) */
	public native long ru_nivcsw(); public native rusage ru_nivcsw(long setter);		/* involuntary " */
// #define	ru_last		ru_nivcsw	/* internal: ruadd() range end */
// #endif	/* __DARWIN_C_LEVEL >= __DARWIN_C_FULL */
}
