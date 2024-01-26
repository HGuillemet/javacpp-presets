// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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

@Name("std::unordered_set<c10::DeviceType>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DeviceTypeSet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceTypeSet(Pointer p) { super(p); }
    public DeviceTypeSet()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef DeviceTypeSet put(@ByRef DeviceTypeSet x);

    public boolean empty() { return size() == 0; }
    public native long size();

    public DeviceType front() { try (Iterator it = begin()) { return it.get(); } }
    public native void insert(@ByRef DeviceType value);
    public native void erase(@ByRef DeviceType value);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const DeviceType get();
    }
}

