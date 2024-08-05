// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


@Name("torch::OrderedDict<std::string,torch::nn::AnyModule>::Item") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringAnyModuleDictItem extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringAnyModuleDictItem(Pointer p) { super(p); }

  /** Constructs a new item. */
  public StringAnyModuleDictItem(@StdString BytePointer key, @ByVal AnyModule value) { super((Pointer)null); allocate(key, value); }
  private native void allocate(@StdString BytePointer key, @ByVal AnyModule value);
  public StringAnyModuleDictItem(@StdString String key, @ByVal AnyModule value) { super((Pointer)null); allocate(key, value); }
  private native void allocate(@StdString String key, @ByVal AnyModule value);

  /** Returns a reference to the value. */
  public native @ByRef @Name("operator *") AnyModule multiply();

  /** Returns a reference to the value. */

  /** Allows access to the value using the arrow operator. */
  public native @Name("operator ->") AnyModule access();

  /** Allows access to the value using the arrow operator. */

  /** Returns a reference to the key. */
  public native @StdString @NoException(true) BytePointer key();

  /** Returns a reference to the value. */
  public native @ByRef @NoException(true) AnyModule value();

  /** Returns a reference to the value. */

  /** Returns a {@code (key, value)} pair. */
  public native @Const @ByRef @NoException(true) StringAnyModulePair pair();
}
