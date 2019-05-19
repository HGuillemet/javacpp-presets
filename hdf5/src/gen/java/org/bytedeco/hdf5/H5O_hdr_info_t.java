// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/* Information struct for object header metadata (for H5Oget_info/H5Oget_info_by_name/H5Oget_info_by_idx) */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5O_hdr_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5O_hdr_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5O_hdr_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5O_hdr_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5O_hdr_info_t position(long position) {
        return (H5O_hdr_info_t)super.position(position);
    }

    public native @Cast("unsigned") int version(); public native H5O_hdr_info_t version(int setter);        /* Version number of header format in file */
    public native @Cast("unsigned") int nmesgs(); public native H5O_hdr_info_t nmesgs(int setter);        /* Number of object header messages */
    public native @Cast("unsigned") int nchunks(); public native H5O_hdr_info_t nchunks(int setter);        /* Number of object header chunks */
    public native @Cast("unsigned") int flags(); public native H5O_hdr_info_t flags(int setter);             /* Object header status flags */
        @Name("space.total") public native @Cast("hsize_t") long space_total(); public native H5O_hdr_info_t space_total(long setter);        /* Total space for storing object header in file */
        @Name("space.meta") public native @Cast("hsize_t") long space_meta(); public native H5O_hdr_info_t space_meta(long setter);        /* Space within header for object header metadata information */
        @Name("space.mesg") public native @Cast("hsize_t") long space_mesg(); public native H5O_hdr_info_t space_mesg(long setter);        /* Space within header for actual message information */
        @Name("space.free") public native @Cast("hsize_t") long space_free(); public native H5O_hdr_info_t space_free(long setter);        /* Free space within object header */
        @Name("mesg.present") public native @Cast("uint64_t") long mesg_present(); public native H5O_hdr_info_t mesg_present(long setter);    /* Flags to indicate presence of message type in header */
        @Name("mesg.shared") public native @Cast("uint64_t") long mesg_shared(); public native H5O_hdr_info_t mesg_shared(long setter);    /* Flags to indicate message type is shared in header */
}
