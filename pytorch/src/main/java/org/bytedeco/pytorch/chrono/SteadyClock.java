package org.bytedeco.pytorch.chrono;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.ByVal;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Properties;

@Name("std::chrono::steady_clock") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SteadyClock extends Pointer {
    static public native @ByVal SteadyTime now();
}
