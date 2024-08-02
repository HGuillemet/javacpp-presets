// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Dimname extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dimname(Pointer p) { super(p); }

  public static native @ByVal Dimname fromSymbol(@ByVal Symbol name);
  public static native @ByVal Dimname wildcard();
  public static native @Cast("bool") boolean isValidName(@StdString BytePointer name);
  public static native @Cast("bool") boolean isValidName(@StdString String name);

  public native NameType type();
  public native @ByVal Symbol symbol();

  public native @Cast("bool") boolean isBasic();
  public native @Cast("bool") boolean isWildcard();

  public native @Cast("bool") boolean matches(@ByVal Dimname other);
  public native @ByVal DimnameOptional unify(@ByVal Dimname other);
}
