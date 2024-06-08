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

@Name("std::list<std::pair<at::RecordFunctionHandle,int> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RecordFunctionHandleIntList extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordFunctionHandleIntList(Pointer p) { super(p); }
    public RecordFunctionHandleIntList()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef RecordFunctionHandleIntList put(@ByRef RecordFunctionHandleIntList x);

    public boolean empty() { return size() == 0; }
    public native long size();

    public RecordFunctionHandleIntPair front() { try (Iterator it = begin()) { return it.get(); } }
    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef RecordFunctionHandleIntPair value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const RecordFunctionHandleIntPair get();
    }
}

