// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.global;

import org.bytedeco.pytorch.gloo.*;

import org.bytedeco.pytorch.chrono.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

public class gloo extends org.bytedeco.pytorch.presets.gloo {
    static { Loader.load(); }

// Parsed from gloo/common/string.h

/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <sstream>
// #include <vector>

@Namespace("gloo") public static native void MakeStringInternal(@Cast("std::stringstream*") @ByRef Pointer arg0);

// Specializations for already-a-string types.
@Namespace("gloo") public static native @StdString BytePointer MakeString(@Cast("const char*") BytePointer cstr);
@Namespace("gloo") public static native @StdString String MakeString(String cstr);

 // namespace gloo


// Parsed from gloo/transport/address.h

/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <string>
// #include <vector>
// Targeting ../gloo/Address.java



 // namespace transport
 // namespace gloo


// Parsed from gloo/transport/buffer.h

/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <stddef.h>
// Targeting ../gloo/Buffer.java



 // namespace transport
 // namespace gloo


// Parsed from gloo/transport/unbound_buffer.h

/**
 * Copyright (c) 2018-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <chrono>
// #include <cstddef>
// #include <cstdint>
// #include <limits>
// #include <vector>
// Targeting ../gloo/UnboundBuffer.java



 // namespace transport
 // namespace gloo


// Parsed from gloo/transport/pair.h

/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <memory>

// #include "gloo/common/logging.h"
// #include "gloo/transport/address.h"
// #include "gloo/transport/buffer.h"
// #include "gloo/transport/unbound_buffer.h"
// Targeting ../gloo/Pair.java



 // namespace transport
 // namespace gloo


// Parsed from gloo/common/common.h

/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <memory>

// make_unique is a C++14 feature. If we don't have 14, we will emulate
// its behavior. This is copied from folly/Memory.h
// #if __cplusplus >= 201402L ||
//     (defined __cpp_lib_make_unique && __cpp_lib_make_unique >= 201304L) ||
//     (defined(_MSC_VER) && _MSC_VER >= 1900)
/* using override */
// #else

// Allows 'make_unique<T[]>(10)'. (N3690 s20.9.1.4 p3-4)

// Disallows 'make_unique<T[10]>()'. (N3690 s20.9.1.4 p5)


// #endif

 // namespace gloo


// Parsed from gloo/types.h

/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 */

// #pragma once

// #include <iostream>

// #ifdef __CUDA_ARCH__
// #endif

// #include "gloo/common/common.h"

// #ifdef _WIN32
// #endif

// Unlike old style collectives that are class instances that hold
// some state, the new style collectives do not need initialization
// before they can run. Instead of asking the context for a series of
// slots and storing them for later use and reuse, the new style
// collectives take a slot (or tag) argument that allows for
// concurrent execution of multiple collectives on the same context.
//
// This tag is what determines the slot numbers for the send and recv
// operations that the collectives end up executing. A single
// collective may have many send and recv operations running in
// parallel, so instead of using the specified tag verbatim, we use it
// as a prefix. Also, to avoid conflicts between collectives with the
// same tag, we have another tag prefix per collective type. Out of
// the 64 bits we can use for a slot, we use 8 of them to identify a
// collective, 32 to identify the collective tag, another 8 for use by
// the collective operation itself (allowing for 256 independent send
// and recv operations against the same point to point pair), and
// leave 16 bits unused.
//
// Below, you find constexprs for the prefix per collective type, as
// well as a way to compute slots when executing a collective. The
// slot class below captures both a prefix and a delta on that prefix
// to support addition with bounds checking. It is usable as an
// uint64_t, but one that cannot overflow beyond the bits allocated
// for use within a collective.
//

@Namespace("gloo") @MemberGetter public static native @Cast("const uint8_t") byte kGatherSlotPrefix();
@Namespace("gloo") @MemberGetter public static native @Cast("const uint8_t") byte kAllgatherSlotPrefix();
@Namespace("gloo") @MemberGetter public static native @Cast("const uint8_t") byte kReduceSlotPrefix();
@Namespace("gloo") @MemberGetter public static native @Cast("const uint8_t") byte kAllreduceSlotPrefix();
@Namespace("gloo") @MemberGetter public static native @Cast("const uint8_t") byte kScatterSlotPrefix();
@Namespace("gloo") @MemberGetter public static native @Cast("const uint8_t") byte kBroadcastSlotPrefix();
@Namespace("gloo") @MemberGetter public static native @Cast("const uint8_t") byte kBarrierSlotPrefix();
@Namespace("gloo") @MemberGetter public static native @Cast("const uint8_t") byte kAlltoallSlotPrefix();
@Namespace("gloo") public static native @ByVal float16 cpu_float2half_rn(float f);
@Namespace("gloo") public static native float cpu_half2float(@ByVal float16 h);
// Targeting ../gloo/float16.java



@Namespace("gloo") public static native @Cast("std::ostream*") @ByRef @Name("operator <<") Pointer shiftLeft(@Cast("std::ostream*") @ByRef Pointer stream, @Const @ByRef float16 val);

@Namespace("gloo") public static native @ByVal @Name("operator +") float16 add(@Const @ByRef float16 lhs, @Const @ByRef float16 rhs);

@Namespace("gloo") public static native @ByVal @Name("operator -") float16 subtract(@Const @ByRef float16 lhs, @Const @ByRef float16 rhs);

@Namespace("gloo") public static native @ByVal @Name("operator *") float16 multiply(@Const @ByRef float16 lhs, @Const @ByRef float16 rhs);

@Namespace("gloo") public static native @ByVal @Name("operator /") float16 divide(@Const @ByRef float16 lhs, @Const @ByRef float16 rhs);

@Namespace("gloo") public static native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef float16 lhs, @Const @ByRef float16 rhs);

@Namespace("gloo") public static native @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef float16 lhs, @Const @ByRef float16 rhs);

@Namespace("gloo") public static native @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef float16 lhs, @Const @ByRef float16 rhs);

@Namespace("gloo") public static native @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef float16 lhs, @Const @ByRef float16 rhs);

 // namespace gloo


// Parsed from gloo/math.h

/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include "gloo/types.h"

















@Namespace("gloo") public static native @Cast("uint32_t") int log2ceil(@Cast("uint32_t") int value);

// #if GLOO_USE_AVX













// #endif

 // namespace gloo


// Parsed from gloo/algorithm.h

/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <memory>

// #include "gloo/context.h"
// #include "gloo/math.h"

public static final long kOnDeviceThreshold = 256 * 1024;
// Targeting ../gloo/Algorithm.java



// Type of reduction function.
//
// If the reduction type is one of the built-ins, algorithm
// implementations may use accelerated versions if available.
//
// For example, if a ReductionFunction with ReductionType equal
// SUM is passed to CUDA aware Allreduce, it knows it can
// use a NCCL implementation instead of the specified function.
//
/** enum gloo::ReductionType */
public static final int
  SUM = 1,
  PRODUCT = 2,
  MAX = 3,
  MIN = 4,

  // Use larger number so we have plenty of room to add built-ins
  CUSTOM = 1000;
// Targeting ../gloo/ReductionFunctionFloat.java


// Targeting ../gloo/ReductionFunctionInt.java








// Local operation.
// If an algorithm uses multiple local pointers, local operations
// can be used for local reduction, broadcast, gathering, etc.

 // namespace gloo


// Parsed from gloo/common/store.h

/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <chrono>
// #include <string>
// #include <vector>
// Targeting ../gloo/IStore.java



 // namespace gloo


// Parsed from gloo/rendezvous/store.h

/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <chrono>
// #include <string>
// #include <vector>

// #include "gloo/common/logging.h"
// #include "gloo/common/error.h"
// #include "gloo/common/store.h"

//can be used by upstream users to know whether this is available or not.
public static final int GLOO_STORE_HAS_STORE_V2 = 1;
// Targeting ../gloo/Store.java



 // namespace rendezvous
 // namespace gloo


// Parsed from gloo/transport/context.h

/**
 * Copyright (c) 2018-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <algorithm>
// #include <chrono>
// #include <cstdint>
// #include <functional>
// #include <memory>
// #include <mutex>
// #include <unordered_map>
// #include <vector>

// #include "gloo/common/store.h"
// #include "gloo/transport/pair.h"
// #include "gloo/transport/unbound_buffer.h"
// Targeting ../gloo/TransportContext.java



 // namespace transport
 // namespace gloo


// Parsed from gloo/transport/device.h

/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

// #pragma once

// #include <chrono>
// #include <memory>

// #include "gloo/transport/context.h"
// #include "gloo/transport/pair.h"

// Forward declarations
// Targeting ../gloo/Device.java



 // namespace transport
 // namespace gloo


}
