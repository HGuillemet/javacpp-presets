package org.bytedeco.pytorch.chrono;

import org.bytedeco.javacpp.annotation.*;

@Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public abstract class Chrono {
    static public @Name("operator +") native @ByVal Hours add(@Const @ByRef Hours lhs, @Const @ByRef Hours rhs);
    static public @Name("operator +") native @ByVal Minutes add(@Const @ByRef Minutes lhs, @Const @ByRef Minutes rhs);
    static public @Name("operator +") native @ByVal Seconds add(@Const @ByRef Seconds lhs, @Const @ByRef Seconds rhs);
    static public @Name("operator +") native @ByVal Milliseconds add(@Const @ByRef Milliseconds lhs, @Const @ByRef Milliseconds rhs);
    static public @Name("operator +") native @ByVal Microseconds add(@Const @ByRef Microseconds lhs, @Const @ByRef Microseconds rhs);
    static public @Name("operator +") native @ByVal Nanoseconds add(@Const @ByRef Nanoseconds lhs, @Const @ByRef Nanoseconds rhs);
    static public @Name("operator +") native @ByVal SecondsFloat add(@Const @ByRef SecondsFloat lhs, @Const @ByRef SecondsFloat rhs);
    static public @Name("operator +") native @ByVal SecondsDouble add(@Const @ByRef SecondsDouble lhs, @Const @ByRef SecondsDouble rhs);

    static public @Name("operator -") native @ByVal Hours subtract(@Const @ByRef Hours lhs, @Const @ByRef Hours rhs);
    static public @Name("operator -") native @ByVal Minutes subtract(@Const @ByRef Minutes lhs, @Const @ByRef Minutes rhs);
    static public @Name("operator -") native @ByVal Seconds subtract(@Const @ByRef Seconds lhs, @Const @ByRef Seconds rhs);
    static public @Name("operator -") native @ByVal Milliseconds subtract(@Const @ByRef Milliseconds lhs, @Const @ByRef Milliseconds rhs);
    static public @Name("operator -") native @ByVal Microseconds subtract(@Const @ByRef Microseconds lhs, @Const @ByRef Microseconds rhs);
    static public @Name("operator -") native @ByVal Nanoseconds subtract(@Const @ByRef Nanoseconds lhs, @Const @ByRef Nanoseconds rhs);
    static public @Name("operator -") native @ByVal SecondsFloat subtract(@Const @ByRef SecondsFloat lhs, @Const @ByRef SecondsFloat rhs);
    static public @Name("operator -") native @ByVal SecondsDouble subtract(@Const @ByRef SecondsDouble lhs, @Const @ByRef SecondsDouble rhs);

    static public @Name("operator *") native @ByVal Hours multiply(@Const @ByRef Hours d, @Const @ByRef int s);
    static public @Name("operator *") native @ByVal Minutes multiply(@Const @ByRef Minutes d, @Const @ByRef int s);
    static public @Name("operator *") native @ByVal Seconds multiply(@Const @ByRef Seconds d, @Const @ByRef long s);
    static public @Name("operator *") native @ByVal Milliseconds multiply(@Const @ByRef Milliseconds d, @Const @ByRef long s);
    static public @Name("operator *") native @ByVal Microseconds multiply(@Const @ByRef Microseconds d, @Const @ByRef long s);
    static public @Name("operator *") native @ByVal Nanoseconds multiply(@Const @ByRef Nanoseconds d, @Const @ByRef long s);
    static public @Name("operator *") native @ByVal SecondsFloat multiply(@Const @ByRef SecondsFloat d, @Const @ByRef float s);
    static public @Name("operator *") native @ByVal SecondsDouble multiply(@Const @ByRef SecondsDouble d, @Const @ByRef double s);

    static public @Name("operator /") native @ByVal int divide(@Const @ByRef Hours lhs, @Const @ByRef Hours rhs);
    static public @Name("operator /") native @ByVal int divide(@Const @ByRef Minutes lhs, @Const @ByRef Minutes rhs);
    static public @Name("operator /") native @ByVal long divide(@Const @ByRef Seconds lhs, @Const @ByRef Seconds rhs);
    static public @Name("operator /") native @ByVal long divide(@Const @ByRef Milliseconds lhs, @Const @ByRef Milliseconds rhs);
    static public @Name("operator /") native @ByVal long divide(@Const @ByRef Microseconds lhs, @Const @ByRef Microseconds rhs);
    static public @Name("operator /") native @ByVal long divide(@Const @ByRef Nanoseconds lhs, @Const @ByRef Nanoseconds rhs);
    static public @Name("operator /") native @ByVal float divide(@Const @ByRef SecondsFloat lhs, @Const @ByRef SecondsFloat rhs);
    static public @Name("operator /") native @ByVal double divide(@Const @ByRef SecondsDouble lhs, @Const @ByRef SecondsDouble rhs);

    static public @Name("operator /") native @ByVal Hours divide(@Const @ByRef Hours lhs, @Const @ByRef int rhs);
    static public @Name("operator /") native @ByVal Minutes divide(@Const @ByRef Minutes lhs, @Const @ByRef int rhs);
    static public @Name("operator /") native @ByVal Seconds divide(@Const @ByRef Seconds lhs, @Const @ByRef long rhs);
    static public @Name("operator /") native @ByVal Milliseconds divide(@Const @ByRef Milliseconds lhs, @Const @ByRef long rhs);
    static public @Name("operator /") native @ByVal Microseconds divide(@Const @ByRef Microseconds lhs, @Const @ByRef long rhs);
    static public @Name("operator /") native @ByVal Nanoseconds divide(@Const @ByRef Nanoseconds lhs, @Const @ByRef long rhs);
    static public @Name("operator /") native @ByVal SecondsFloat divide(@Const @ByRef SecondsFloat lhs, @Const @ByRef float rhs);
    static public @Name("operator /") native @ByVal SecondsDouble divide(@Const @ByRef SecondsDouble lhs, @Const @ByRef double rhs);

    static public @Name("operator %") native @ByVal Hours mod(@Const @ByRef Hours lhs, @Const @ByRef Hours rhs);
    static public @Name("operator %") native @ByVal Minutes mod(@Const @ByRef Minutes lhs, @Const @ByRef Minutes rhs);
    static public @Name("operator %") native @ByVal Seconds mod(@Const @ByRef Seconds lhs, @Const @ByRef Seconds rhs);
    static public @Name("operator %") native @ByVal Milliseconds mod(@Const @ByRef Milliseconds lhs, @Const @ByRef Milliseconds rhs);
    static public @Name("operator %") native @ByVal Microseconds mod(@Const @ByRef Microseconds lhs, @Const @ByRef Microseconds rhs);
    static public @Name("operator %") native @ByVal Nanoseconds mod(@Const @ByRef Nanoseconds lhs, @Const @ByRef Nanoseconds rhs);

    static public @Name("operator %") native @ByVal Hours mod(@Const @ByRef Hours lhs, @Const @ByRef int rhs);
    static public @Name("operator %") native @ByVal Minutes mod(@Const @ByRef Minutes lhs, @Const @ByRef int rhs);
    static public @Name("operator %") native @ByVal Seconds mod(@Const @ByRef Seconds lhs, @Const @ByRef long rhs);
    static public @Name("operator %") native @ByVal Milliseconds mod(@Const @ByRef Milliseconds lhs, @Const @ByRef long rhs);
    static public @Name("operator %") native @ByVal Microseconds mod(@Const @ByRef Microseconds lhs, @Const @ByRef long rhs);
    static public @Name("operator %") native @ByVal Nanoseconds mod(@Const @ByRef Nanoseconds lhs, @Const @ByRef long rhs);
}
