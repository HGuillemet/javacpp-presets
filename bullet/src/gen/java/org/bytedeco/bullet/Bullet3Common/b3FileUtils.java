// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class b3FileUtils extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3FileUtils(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3FileUtils(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3FileUtils position(long position) {
        return (b3FileUtils)super.position(position);
    }
    @Override public b3FileUtils getPointer(long i) {
        return new b3FileUtils((Pointer)this).offsetAddress(i);
    }

	public b3FileUtils() { super((Pointer)null); allocate(); }
	private native void allocate();

	public static native @Cast("bool") boolean findFile(@Cast("const char*") BytePointer orgFileName, @Cast("char*") BytePointer relativeFileName, int maxRelativeFileNameMaxLen);
	public static native @Cast("bool") boolean findFile(String orgFileName, @Cast("char*") ByteBuffer relativeFileName, int maxRelativeFileNameMaxLen);
	public static native @Cast("bool") boolean findFile(@Cast("const char*") BytePointer orgFileName, @Cast("char*") byte[] relativeFileName, int maxRelativeFileNameMaxLen);
	public static native @Cast("bool") boolean findFile(String orgFileName, @Cast("char*") BytePointer relativeFileName, int maxRelativeFileNameMaxLen);
	public static native @Cast("bool") boolean findFile(@Cast("const char*") BytePointer orgFileName, @Cast("char*") ByteBuffer relativeFileName, int maxRelativeFileNameMaxLen);
	public static native @Cast("bool") boolean findFile(String orgFileName, @Cast("char*") byte[] relativeFileName, int maxRelativeFileNameMaxLen);

	public static native @Cast("const char*") BytePointer strip2(@Cast("const char*") BytePointer name, @Cast("const char*") BytePointer pattern);
	public static native String strip2(String name, String pattern);

	public static native int extractPath(@Cast("const char*") BytePointer fileName, @Cast("char*") BytePointer path, int maxPathLength);
	public static native int extractPath(String fileName, @Cast("char*") ByteBuffer path, int maxPathLength);
	public static native int extractPath(@Cast("const char*") BytePointer fileName, @Cast("char*") byte[] path, int maxPathLength);
	public static native int extractPath(String fileName, @Cast("char*") BytePointer path, int maxPathLength);
	public static native int extractPath(@Cast("const char*") BytePointer fileName, @Cast("char*") ByteBuffer path, int maxPathLength);
	public static native int extractPath(String fileName, @Cast("char*") byte[] path, int maxPathLength);

	public static native @Cast("char") byte toLowerChar(@Cast("const char") byte t);

	public static native void toLower(@Cast("char*") BytePointer str);
	public static native void toLower(@Cast("char*") ByteBuffer str);
	public static native void toLower(@Cast("char*") byte[] str);

	/*static const char* strip2(const char* name, const char* pattern)
	{
		size_t const patlen = strlen(pattern);
		size_t patcnt = 0;
		const char * oriptr;
		const char * patloc;
		// find how many times the pattern occurs in the original string
		for (oriptr = name; patloc = strstr(oriptr, pattern); oriptr = patloc + patlen)
		{
			patcnt++;
		}
		return oriptr;
	}
	*/
}
