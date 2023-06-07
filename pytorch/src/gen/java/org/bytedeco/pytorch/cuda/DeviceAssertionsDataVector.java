// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.Error;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;

@Name("std::vector<c10::cuda::DeviceAssertionsData>") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class DeviceAssertionsDataVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceAssertionsDataVector(Pointer p) { super(p); }
    public DeviceAssertionsDataVector(DeviceAssertionsData value) { this(1); put(0, value); }
    public DeviceAssertionsDataVector(DeviceAssertionsData ... array) { this(array.length); put(array); }
    public DeviceAssertionsDataVector()       { allocate();  }
    public DeviceAssertionsDataVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef DeviceAssertionsDataVector put(@ByRef DeviceAssertionsDataVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef DeviceAssertionsData get(@Cast("size_t") long i);
    public native DeviceAssertionsDataVector put(@Cast("size_t") long i, DeviceAssertionsData value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef DeviceAssertionsData value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const DeviceAssertionsData get();
    }

    public DeviceAssertionsData[] get() {
        DeviceAssertionsData[] array = new DeviceAssertionsData[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public DeviceAssertionsData pop_back() {
        long size = size();
        DeviceAssertionsData value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public DeviceAssertionsDataVector push_back(DeviceAssertionsData value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public DeviceAssertionsDataVector put(DeviceAssertionsData value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public DeviceAssertionsDataVector put(DeviceAssertionsData ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

