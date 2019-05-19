// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;



/* Structure giving information about numeric and monetary notation.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class lconv extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public lconv() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public lconv(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lconv(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public lconv position(long position) {
        return (lconv)super.position(position);
    }

  /* Numeric (non-monetary) information.  */

  public native @Cast("char*") BytePointer decimal_point(); public native lconv decimal_point(BytePointer setter);		/* Decimal point character.  */
  public native @Cast("char*") BytePointer thousands_sep(); public native lconv thousands_sep(BytePointer setter);		/* Thousands separator.  */
  /* Each element is the number of digits in each group;
     elements with higher indices are farther left.
     An element with value CHAR_MAX means that no further grouping is done.
     An element with value 0 means that the previous element is used
     for all groups farther left.  */
  public native @Cast("char*") BytePointer grouping(); public native lconv grouping(BytePointer setter);

  /* Monetary information.  */

  /* First three chars are a currency symbol from ISO 4217.
     Fourth char is the separator.  Fifth char is '\0'.  */
  public native @Cast("char*") BytePointer int_curr_symbol(); public native lconv int_curr_symbol(BytePointer setter);
  public native @Cast("char*") BytePointer currency_symbol(); public native lconv currency_symbol(BytePointer setter);	/* Local currency symbol.  */
  public native @Cast("char*") BytePointer mon_decimal_point(); public native lconv mon_decimal_point(BytePointer setter);	/* Decimal point character.  */
  public native @Cast("char*") BytePointer mon_thousands_sep(); public native lconv mon_thousands_sep(BytePointer setter);	/* Thousands separator.  */
  public native @Cast("char*") BytePointer mon_grouping(); public native lconv mon_grouping(BytePointer setter);		/* Like `grouping' element (above).  */
  public native @Cast("char*") BytePointer positive_sign(); public native lconv positive_sign(BytePointer setter);		/* Sign for positive values.  */
  public native @Cast("char*") BytePointer negative_sign(); public native lconv negative_sign(BytePointer setter);		/* Sign for negative values.  */
  public native @Cast("char") byte int_frac_digits(); public native lconv int_frac_digits(byte setter);		/* Int'l fractional digits.  */
  public native @Cast("char") byte frac_digits(); public native lconv frac_digits(byte setter);		/* Local fractional digits.  */
  /* 1 if currency_symbol precedes a positive value, 0 if succeeds.  */
  public native @Cast("char") byte p_cs_precedes(); public native lconv p_cs_precedes(byte setter);
  /* 1 iff a space separates currency_symbol from a positive value.  */
  public native @Cast("char") byte p_sep_by_space(); public native lconv p_sep_by_space(byte setter);
  /* 1 if currency_symbol precedes a negative value, 0 if succeeds.  */
  public native @Cast("char") byte n_cs_precedes(); public native lconv n_cs_precedes(byte setter);
  /* 1 iff a space separates currency_symbol from a negative value.  */
  public native @Cast("char") byte n_sep_by_space(); public native lconv n_sep_by_space(byte setter);
  /* Positive and negative sign positions:
     0 Parentheses surround the quantity and currency_symbol.
     1 The sign string precedes the quantity and currency_symbol.
     2 The sign string follows the quantity and currency_symbol.
     3 The sign string immediately precedes the currency_symbol.
     4 The sign string immediately follows the currency_symbol.  */
  public native @Cast("char") byte p_sign_posn(); public native lconv p_sign_posn(byte setter);
  public native @Cast("char") byte n_sign_posn(); public native lconv n_sign_posn(byte setter);
// #ifdef __USE_ISOC99
  /* 1 if int_curr_symbol precedes a positive value, 0 if succeeds.  */
  public native @Cast("char") byte int_p_cs_precedes(); public native lconv int_p_cs_precedes(byte setter);
  /* 1 iff a space separates int_curr_symbol from a positive value.  */
  public native @Cast("char") byte int_p_sep_by_space(); public native lconv int_p_sep_by_space(byte setter);
  /* 1 if int_curr_symbol precedes a negative value, 0 if succeeds.  */
  public native @Cast("char") byte int_n_cs_precedes(); public native lconv int_n_cs_precedes(byte setter);
  /* 1 iff a space separates int_curr_symbol from a negative value.  */
  public native @Cast("char") byte int_n_sep_by_space(); public native lconv int_n_sep_by_space(byte setter);
  /* Positive and negative sign positions:
     0 Parentheses surround the quantity and int_curr_symbol.
     1 The sign string precedes the quantity and int_curr_symbol.
     2 The sign string follows the quantity and int_curr_symbol.
     3 The sign string immediately precedes the int_curr_symbol.
     4 The sign string immediately follows the int_curr_symbol.  */
  public native @Cast("char") byte int_p_sign_posn(); public native lconv int_p_sign_posn(byte setter);
  public native @Cast("char") byte int_n_sign_posn(); public native lconv int_n_sign_posn(byte setter);
// #else
// #endif
}
