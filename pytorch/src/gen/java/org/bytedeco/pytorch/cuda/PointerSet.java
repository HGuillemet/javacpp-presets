// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.helper.*;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.cusparse.*;
import static org.bytedeco.cuda.global.cusparse.*;
import org.bytedeco.cuda.cusolver.*;
import static org.bytedeco.cuda.global.cusolver.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;

@Name("std::unordered_set<void*>") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class PointerSet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PointerSet(Pointer p) { super(p); }
    public PointerSet()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef PointerSet put(@ByRef PointerSet x);

    public boolean empty() { return size() == 0; }
    public native long size();

    public Pointer front() { try (Iterator it = begin()) { return it.get(); } }
    public native void insert(Pointer value);
    public native void erase(Pointer value);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Const Pointer get();
    }
}

