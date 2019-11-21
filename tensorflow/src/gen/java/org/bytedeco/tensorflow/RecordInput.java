// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Emits randomized records.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * file_pattern: Glob pattern for the data files.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * file_random_seed: Random seeds used to produce randomized records.
 *  * file_shuffle_shift_ratio: Shifts the list of files after the list is randomly
 *  shuffled.
 *  * file_buffer_size: The randomization shuffling buffer.
 *  * file_parallelism: How many sstables are opened and concurrently iterated over.
 *  * batch_size: The batch size.
 *  * compression_type: The type of compression for the file. Currently ZLIB and
 *  GZIP are supported. Defaults to none.
 * 
 *  Returns:
 *  * {@code Output}: A tensor of shape [batch_size]. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RecordInput extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordInput(Pointer p) { super(p); }

  /** Optional attribute setters for RecordInput */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Random seeds used to produce randomized records.
     * 
     *  Defaults to 301 */
    
    ///
    public native @ByVal Attrs FileRandomSeed(@Cast("tensorflow::int64") long x);

    /** Shifts the list of files after the list is randomly
     *  shuffled.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs FileShuffleShiftRatio(float x);

    /** The randomization shuffling buffer.
     * 
     *  Defaults to 10000 */
    
    ///
    public native @ByVal Attrs FileBufferSize(@Cast("tensorflow::int64") long x);

    /** How many sstables are opened and concurrently iterated over.
     * 
     *  Defaults to 16 */
    
    ///
    public native @ByVal Attrs FileParallelism(@Cast("tensorflow::int64") long x);

    /** The batch size.
     * 
     *  Defaults to 32 */
    
    ///
    public native @ByVal Attrs BatchSize(@Cast("tensorflow::int64") long x);

    /** The type of compression for the file. Currently ZLIB and
     *  GZIP are supported. Defaults to none.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs CompressionType(@StringPiece BytePointer x);
    public native @ByVal Attrs CompressionType(@StringPiece String x);

    public native @Cast("tensorflow::int64") long file_random_seed_(); public native Attrs file_random_seed_(long setter);
    public native float file_shuffle_shift_ratio_(); public native Attrs file_shuffle_shift_ratio_(float setter);
    public native @Cast("tensorflow::int64") long file_buffer_size_(); public native Attrs file_buffer_size_(long setter);
    public native @Cast("tensorflow::int64") long file_parallelism_(); public native Attrs file_parallelism_(long setter);
    public native @Cast("tensorflow::int64") long batch_size_(); public native Attrs batch_size_(long setter);
    public native @StringPiece BytePointer compression_type_(); public native Attrs compression_type_(BytePointer setter);
  }
  public RecordInput(@Const @ByRef Scope scope, @StringPiece BytePointer file_pattern) { super((Pointer)null); allocate(scope, file_pattern); }
  private native void allocate(@Const @ByRef Scope scope, @StringPiece BytePointer file_pattern);
  public RecordInput(@Const @ByRef Scope scope, @StringPiece String file_pattern) { super((Pointer)null); allocate(scope, file_pattern); }
  private native void allocate(@Const @ByRef Scope scope, @StringPiece String file_pattern);
  public RecordInput(@Const @ByRef Scope scope, @StringPiece BytePointer file_pattern, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, file_pattern, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @StringPiece BytePointer file_pattern, @Const @ByRef Attrs attrs);
  public RecordInput(@Const @ByRef Scope scope, @StringPiece String file_pattern, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, file_pattern, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @StringPiece String file_pattern, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs FileRandomSeed(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs FileShuffleShiftRatio(float x);
  public static native @ByVal Attrs FileBufferSize(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs FileParallelism(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs BatchSize(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs CompressionType(@StringPiece BytePointer x);
  public static native @ByVal Attrs CompressionType(@StringPiece String x);

  public native @ByRef Operation operation(); public native RecordInput operation(Operation setter);
  public native @ByRef Output records(); public native RecordInput records(Output setter);
}
