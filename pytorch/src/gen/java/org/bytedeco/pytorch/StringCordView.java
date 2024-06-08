// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// A stringlike class backed by a vector of string_view
// the string represented are logically the concatenation of  the string_views
// This has advantage of not needing continues memory.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringCordView extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringCordView(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringCordView(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StringCordView position(long position) {
        return (StringCordView)super.position(position);
    }
    @Override public StringCordView getPointer(long i) {
        return new StringCordView((Pointer)this).offsetAddress(i);
    }

  public StringCordView() { super((Pointer)null); allocate(); }
  private native void allocate();
  public StringCordView(@Const @ByRef StringCordView arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef StringCordView arg0);
  public StringCordView(
        @ByVal StringViewVector inputs,
        @ByVal @Cast("std::vector<std::shared_ptr<std::string> >*") Pointer ownerships) { super((Pointer)null); allocate(inputs, ownerships); }
  private native void allocate(
        @ByVal StringViewVector inputs,
        @ByVal @Cast("std::vector<std::shared_ptr<std::string> >*") Pointer ownerships);

  public native @ByRef @Name("operator =") StringCordView put(@Const @ByRef StringCordView arg0);

  public native @Cast("size_t") long size();

  public native @Cast("size_t") long find(@StdString BytePointer tok, @Cast("size_t") long start);
  public native @Cast("size_t") long find(@StdString String tok, @Cast("size_t") long start);
  public native @Cast("size_t") long find_regex(@StdString BytePointer tok, @Cast("size_t") long start);
  public native @Cast("size_t") long find_regex(@StdString String tok, @Cast("size_t") long start);
  public native @ByVal StringCordView substr(@Cast("size_t") long start, @Cast("size_t") long size);

  public native @Cast("char") byte at(@Cast("size_t") long index);
  public native @Cast("char") @Name("operator []") byte get(@Cast("size_t") long index);

  public native @StdString BytePointer str();

  public native @Cast("bool") @Name("operator ==") boolean equals(@StdString BytePointer rhs);
  public native @Cast("bool") @Name("operator ==") boolean equals(@StdString String rhs);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef StringCordView rhs);

  public native @StringView BytePointer piece(@Cast("size_t") long index);

  @NoOffset public static class Iterator extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Iterator(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Iterator(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Iterator position(long position) {
          return (Iterator)super.position(position);
      }
      @Override public Iterator getPointer(long i) {
          return new Iterator((Pointer)this).offsetAddress(i);
      }
  
    public Iterator(
            @Const StringCordView str,
            @Cast("size_t") long start_line,
            @Cast("size_t") long start_pos,
            @Cast("size_t") long size) { super((Pointer)null); allocate(str, start_line, start_pos, size); }
    private native void allocate(
            @Const StringCordView str,
            @Cast("size_t") long start_line,
            @Cast("size_t") long start_pos,
            @Cast("size_t") long size);
    public Iterator(@Const StringCordView str) { super((Pointer)null); allocate(str); }
    private native void allocate(@Const StringCordView str);

    public Iterator() { super((Pointer)null); allocate(); }
    private native void allocate();

    public Iterator(@Const @ByRef Iterator arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@Const @ByRef Iterator arg0);
    public native @ByRef @Name("operator =") Iterator put(@Const @ByRef Iterator arg0);

    public native @ByVal @Name("operator ++") Iterator increment();

    public native @ByVal @Name("operator ++") Iterator increment(int arg0);

    public native @ByVal Iterator next_iter();

    public native @ByRef @Name("operator +=") Iterator addPut(@Cast("size_t") long num);

    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Iterator rhs);
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef Iterator rhs);
    public native @Cast("bool") boolean has_next();

    public native @Cast("char") @Name("operator *") byte multiply();

    // returns rest of the line of the current iterator
    public native @StringView BytePointer rest_line();

    public native @Cast("size_t") long pos();
  }

  public native @ByVal Iterator begin();
  public native @ByVal Iterator end();
  public native @ByVal Iterator iter_for_pos(@Cast("size_t") long pos);
}
