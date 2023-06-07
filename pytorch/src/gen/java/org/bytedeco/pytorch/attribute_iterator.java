// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::jit::slot_iterator_impl<torch::jit::detail::AttributePolicy>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class attribute_iterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public attribute_iterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public attribute_iterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public attribute_iterator position(long position) {
        return (attribute_iterator)super.position(position);
    }
    @Override public attribute_iterator getPointer(long i) {
        return new attribute_iterator((Pointer)this).offsetAddress(i);
    }

  public attribute_iterator(
        @ByVal JitModule root,
        @Cast("bool") boolean recurse,
        @Cast("bool") boolean return_module) { super((Pointer)null); allocate(root, recurse, return_module); }
  private native void allocate(
        @ByVal JitModule root,
        @Cast("bool") boolean recurse,
        @Cast("bool") boolean return_module);
  // empty cursors_, represents end of iteration
  public attribute_iterator() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @ByVal @Name("operator *") IValue multiply();
  public native @ByVal @Name("operator ->") IValue access();
  public native @ByRef @Name("operator ++") attribute_iterator increment();
  public native @ByVal @Name("operator ++") attribute_iterator increment(int arg0);

  private static native @Namespace @Cast("bool") @Name("operator !=") boolean notEquals(
        @Const @ByRef attribute_iterator a,
        @Const @ByRef attribute_iterator b);
  public boolean notEquals(attribute_iterator b) { return notEquals(this, b); }
}
