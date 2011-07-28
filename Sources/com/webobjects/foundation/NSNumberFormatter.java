
package com.webobjects.foundation;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.*;
import java.util.Locale;


public class NSNumberFormatter extends Format {
    static class ConstructionBuffer
        implements Cloneable {


        ConstructionBuffer() { return null; }

        public Object clone() { return null; }

        public String toString() { return null; }

        public char mask[];
        public int maskLen;
        public char integerPart[];
        public int integerPartLen;
        public char fractionPart[];
        public int fractionPartLen;

    }



    public NSNumberFormatter() { return null; }

    public NSNumberFormatter(String pattern) { return null; }

    private void initializeDefaults() {}

    public String decimalSeparator() { return null; }

    private char _decimalSeparator() { return null; }

    public void setDecimalSeparator(String newSeparator) {}

    private void setDecimalSeparator(char c) {}

    public String thousandSeparator() { return null; }

    private char _thousandSeparator() { return null; }

    public void setThousandSeparator(String newSeparator) {}

    private void setThousandSeparator(char c) {}

    public int roundingBehavior() { return 0; }

    public void setRoundingBehavior(int newBehavior) {}

    public String stringForZero() { return null; }

    public void setStringForZero(String newString) {}

    private void _setStringForZero(String newString) {}

    public String stringForNull() { return null; }

    public void setStringForNull(String newString) {}

    public String stringForNotANumber() { return null; }

    public void setStringForNotANumber(String newString) {}

    /**
     * @deprecated Method attributedStringForZero is deprecated
     */

    public String attributedStringForZero() { return null; }

    /**
     * @deprecated Method setAttributedStringForZero is deprecated
     */

    public void setAttributedStringForZero(String newString) {}

    /**
     * @deprecated Method attributedStringForNil is deprecated
     */

    public String attributedStringForNil() { return null; }

    /**
     * @deprecated Method setAttributedStringForNil is deprecated
     */

    public void setAttributedStringForNil(String newString) {}

    /**
     * @deprecated Method attributedStringForNotANumber is deprecated
     */

    public String attributedStringForNotANumber() { return null; }

    /**
     * @deprecated Method setAttributedStringForNotANumber is deprecated
     */

    public void setAttributedStringForNotANumber(String newString) {}

    public boolean hasThousandSeparators() { return true; }

    public void setHasThousandSeparators(boolean newThousandsUsage) {}

    public boolean allowsFloats() { return true; }

    public void setAllowsFloats(boolean allowsRealNumbers) {}

    public BigDecimal minimum() { return null; }

    public void setMinimum(BigDecimal newMinimum) {}

    public BigDecimal maximum() { return null; }

    public void setMaximum(BigDecimal newMaximum) {}

    public String negativePattern() { return null; }

    public void setNegativePattern(String pattern) {}

    public String positivePattern() { return null; }

    public void setPositivePattern(String pattern) {}

    public String pattern() { return null; }

    public void setPattern(String pattern) {}

    /**
     * @deprecated Method negativeFormat is deprecated
     */

    public String negativeFormat() { return null; }

    /**
     * @deprecated Method setNegativeFormat is deprecated
     */

    public void setNegativeFormat(String pattern) {}

    /**
     * @deprecated Method positiveFormat is deprecated
     */

    public String positiveFormat() { return null; }

    /**
     * @deprecated Method setPositiveFormat is deprecated
     */

    public void setPositiveFormat(String pattern) {}

    /**
     * @deprecated Method format is deprecated
     */

    public String format() { return null; }

    /**
     * @deprecated Method setFormat is deprecated
     */

    public void setFormat(String pattern) {}

    /**
     * @deprecated Method localizesFormat is deprecated
     */

    public boolean localizesFormat() { return true; }

    /**
     * @deprecated Method setLocalizesFormat is deprecated
     */

    public void setLocalizesFormat(boolean doLocalization) {}

    public String stringForObjectValue(Object inNumber) throws IllegalArgumentException { return null; }

    public Object objectValueForString(String inString) throws ParseException { return null; }

    private String _legalNegativeChars() { return null; }

    private void appendUniquePatternChars(StringBuffer buffer, String pattern) {}

    private void _updateCharSets() {}

    private void validatePattern(String pattern) {}

    private String _numberStringForValueObject(BigDecimal num, ConstructionBuffer buffer, boolean isNegative) { return null; }

    private int _surroundValueInString(char result[], int length, ConstructionBuffer buffer) { return 0; }

    private void _addThousandSeparators(StringBuffer theString, ConstructionBuffer buffer) {}

    private String _addThousandSeparatorsToPattern(StringBuffer theString, ConstructionBuffer buffer) { return null; }

    private int _findFirstPartOfNumber(String value) { return 0; }

    private boolean _containsValidNumberParts(String value) { return true; }

    private String _deleteAllPartsOfNumbers(String value) { return null; }

    private String _stringWithSeparator(String value, char separator, int frequency) { return null; }

    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) { return null; }

    public Object parseObject(String source, ParsePosition status) { return null; }

    public Object parseObject(String source) throws ParseException { return null; }

    public static Locale[] availableLocales() { return null; }

    public static Locale defaultLocale() { return null; }

    public static void setDefaultLocale(Locale newLocale) { return null; }

    public Locale locale() { return null; }

    public void setLocale(Locale newLocale) {}

    public static boolean defaultLocalizesPattern() { return null; }

    public static void setDefaultLocalizesPattern(boolean newDefault) { return null; }

    public boolean localizesPattern() { return true; }

    public void setLocalizesPattern(boolean newDefault) {}

    public String currencySymbol() { return null; }

    public void setCurrencySymbol(String newSymbol) {}

    private void _setCurrencyMark(String newSymbol) {}

    private void _updateLocalizedPatterns() {}

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    public static final int RoundDown = 3;
    public static final int RoundUp = 2;
    public static final int RoundPlain = 4;
    public static final int RoundBankers = 6;
    public static final String DefaultPattern = "#,##0.##";
    public static final String _DecimalPattern = "#,##0.##";
    public static final String _IntegerPattern = "0;-0";
    public static final String _CurrencyPattern = "$#,##0.00;-$#,##0.00";
    static final long serialVersionUID = 0x6c6acc0cL;
    private static final String SerializationPatternFieldKey = "pattern";
    private static final String SerializationStringForZeroFieldKey = "stringForZero";
    private static final String SerializationStringForNullFieldKey = "stringForNull";
    private static final String SerializationStringForNANFieldKey = "stringForNAN";
    private static final String SerializationMaximumFieldKey = "maximum";
    private static final String SerializationMinimumFieldKey = "minimum";
    private static final String SerializationRoundingBehaviorFieldKey = "rounding";
    private static final String SerializationDecimalSeparatorFieldKey = "decimalSeparator";
    private static final String SerializationThousandsMarkFieldKey = "thousandsMark";
    private static final String SerializationHasThousandsMarkFieldKey = "hasThousandsMark";
    private static final String SerializationAllowsFloatingPointFieldKey = "allowsFloatingPoint";
    private static final String SerializationLocaleFieldKey = "locale";
    private static final String SerializationLocalizedPatternFieldKey = "localizesPattern";
    private static final String SerializationCurrencyMarkFieldKey = "currencyMark";
    public static final BigDecimal NSDecimalNotANumber;
    private static final char PATTERN_SEPARATOR = 59;
    private static final String PART_OF_NUMBER = ",._#0123456789";
    private static final String STRING_FOR_ZERO;
    private static final String STRING_FOR_NULL = "";
    private static final String STRING_FOR_NOTANUMBER = "NaN";
    private static final String STRING_FOR_CURRENCY = "$";
    private static final int NSDecimalNoScale = 0x80000000;
    private static final char DefaultDecimalSeparator = 46;
    private static final char DefaultThousandSeparator = 44;
    private static final String DefaultDecimalSeparatorString;
    private static final String DefaultThousandSeparatorString;
    private static volatile Locale globalDefaultLocale;
    private static volatile boolean globalDefaultLocalizesFormat;
    private volatile String _negativePattern;
    private volatile String _positivePattern;
    private volatile String _stringForZero;
    private volatile String _stringForNull;
    private volatile String _stringForNotANumber;
    private volatile BigDecimal _minimum;
    private volatile BigDecimal _maximum;
    private volatile int _roundingBehavior;
    private volatile char _decimalSeparator;
    private volatile char _thousandSeparator;
    private volatile boolean _hasThousandSeparator;
    private volatile boolean _allowsFloats;
    private volatile transient String _legalChars;
    private volatile transient String _semanticChars;
    private volatile transient String _negativeChars;
    private volatile Locale _currentLocale;
    private volatile boolean _localizesFormat;
    private volatile String _currencyString;
    private volatile ConstructionBuffer _negative;
    private volatile ConstructionBuffer _positive;
    private static final String _IgnoredCharsInPatterns = ",._#0123456789$- ";
    private static final Class _stringClass;
    private static final Class _bigDecimalClass;
    private static final Class _LocaleClass;
    private static final ObjectStreamField serialPersistentFields[];

}
