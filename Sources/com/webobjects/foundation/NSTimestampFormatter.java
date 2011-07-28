
package com.webobjects.foundation;

import java.io.*;
import java.text.*;
import java.util.*;


/**
 * @deprecated Class NSTimestampFormatter is deprecated
 */

public class NSTimestampFormatter extends Format
    implements Serializable {
    class __NSSimpleDateFormat extends SimpleDateFormat {


        __NSSimpleDateFormat() { return null; }

        __NSSimpleDateFormat(String aPattern, Locale aLocale) { return null; }

        String[] _breakPattern() { return null; }

        private NSRange _zoneSubpatternRange(String pattern) { return null; }

        private String[] _breakString(String str, ParsePosition pos) { return null; }

        private boolean _isWhitespace(char aChar) { return true; }

        private boolean _isTZPatternPresent(String aPattern, int aPatternLength) { return true; }

        private NSTimeZone _parseTZName(String text, ParsePosition pos) { return null; }

        public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition pos) { return null; }

        private Date _parseTimeInUTC(String text, ParsePosition pos) { return null; }

        public Date _parseInUTC(String text, ParsePosition pos) { return null; }

        public Date parse(String text, ParsePosition pos) { return null; }

        static final long serialVersionUID = 0x8151800L;
        String _displayNamesForZones[][];
        private String _tzPattern;
        private boolean _tzAtEnd;
        final NSTimestampFormatter this$0;

    }



    private static DateFormatSymbols _getDefaultDateFormatSymbols() { return null; }

    public static String[][] _getDefaultZoneStrings() { return null; }

    private static String _localizedDatePattern() { return null; }

    private static String _localizedTimePattern() { return null; }

    private static synchronized String _localizedDateTimePattern() { return null; }

    private static synchronized String _patternForSpecifierString(String string) { return null; }

    public NSTimestampFormatter() { return null; }

    public NSTimestampFormatter(String aPattern) { return null; }

    public NSTimestampFormatter(String aPattern, DateFormatSymbols symbols) { return null; }

    public DateFormatSymbols defaultDateFormatSymbols() { return null; }

    private DateFormatSymbols _defaultDateFormatSymbols() { return null; }

    private String[][] _defaultZoneStrings() { return null; }

    private __NSSimpleDateFormat _parseDateFormat() { return null; }

    private __NSSimpleDateFormat _formatDateFormat() { return null; }

    private synchronized __NSSimpleDateFormat _getSimpleDateFormat() { return null; }

    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) { return null; }

    public Object parseObjectInUTC(String text, ParsePosition pos) { return null; }

    public Object parseObject(String text, ParsePosition pos) { return null; }

    public NSTimeZone defaultFormatTimeZone() { return null; }

    public synchronized NSTimeZone defaultParseTimeZone() { return null; }

    public synchronized void setDefaultFormatTimeZone(NSTimeZone zone) { return null; }

    public synchronized void setDefaultParseTimeZone(NSTimeZone zone) { return null; }

    public synchronized void setPattern(String pattern) { return null; }

    public String pattern() { return null; }

    public String toString() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    private static final int __NOT_FOUND = -1;
    private static final String _patterns[];
    private static final char _QuoteCharacter = 39;
    private static final char _SpecifierCharacter = 37;
    private static final char _specifiers[];
    private static final String DefaultPattern = "%Y-%m-%d %H:%M:%S %Z";
    private static final String __usPatternChars;
    private static final String _defaultZoneStrings[][];
    private static final DateFormatSymbols _defaultDateFormatSymbols;
    private static final NSTimestampFormatter _defaultTimestampFormatter;
    static final long serialVersionUID = 0x4e7b64b5L;
    private static final String SerializationPatternFieldKey = "pattern";
    private static final String SerializationFormatSymbolsFieldKey = "formatSymbols";
    private static final String SerializationFormatTimeZoneFieldKey = "formatTimeZone";
    private static final String SerializationParseTimeZoneFieldKey = "parseTimeZone";
    static boolean _JVM131Compatible;
    private static Locale _defaultLocaleForDatePattern;
    private static Locale _defaultLocaleForTimePattern;
    private static String _localizedDatePattern;
    private static String _localizedTimePattern;
    private static final NSNumberFormatter __minuteFormatter;
    static _NSThreadsafeMutableDictionary _knownTZNameMappings;
    private DateFormatSymbols _dateFormatSymbols;
    private NSTimeZone _formatTimeZone;
    private NSTimeZone _parseTimeZone;
    private String _pattern;
    private __NSSimpleDateFormat _formatDateFormat;
    private __NSSimpleDateFormat _parseDateFormat;
    private static final ObjectStreamField serialPersistentFields[];

}
