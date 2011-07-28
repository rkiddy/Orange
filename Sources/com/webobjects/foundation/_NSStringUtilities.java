
package com.webobjects.foundation;

import java.io.*;
import java.net.URL;


public final class _NSStringUtilities {
    private static class _PatternAnalyzer extends _StringAnalyzer {

        public _PatternAnalyzer(String string) { return null; }

        public char nextCharacter() { return null; }
    }

    private static class _StringAnalyzer {


        public _StringAnalyzer(String string) { return null; }

        public String string() { return null; }

        public boolean isAtEnd() { return true; }

        public void setLocation(int location) {}

        public int location() { return 0; }

        public char currentCharacter() { return null; }

        public void advance() {}

        public char nextCharacter() { return null; }

        public void refreshCurrentCharacter() {}

        protected String _string;
        protected int _stringLength;
        protected int _location;
        protected char _currentCharacter;

    }



    public _NSStringUtilities() { return null; }

    public static void setDefaultEncoding(String encoding) throws UnsupportedEncodingException { return null; }

    public static String defaultEncoding() { return null; }

    public static int integerFromPlist(NSDictionary plist, String key, int defaultValue) { return null; }

    public static String stringFromBuffer(StringBuffer buffer) { return null; }

    public static String stringFromBuffer(StringBuilder buffer) { return null; }

    public static final String stringForBytes(byte data[], int offset, int length, String encoding) { return null; }

    public static final byte[] bytesForString(String text, String encoding) { return null; }

    public static final String stringForBytes(byte data[], String encoding) { return null; }

    public static final String stringForBytes(byte data[]) { return null; }

    public static final byte[] bytesForString(String text) { return null; }

    public static final String asciiStringForBytes(byte data[]) { return null; }

    public static final byte[] bytesForAsciiString(String text) { return null; }

    public static final String isolatinStringForBytes(byte data[]) { return null; }

    public static final byte[] bytesForIsolatinString(String text) { return null; }

    public static final String dotifyPath(String path1, String path2) { return null; }

    public static final String concat(String s1, String s2) { return null; }

    public static final String concat(String s1, String s2, String s3) { return null; }

    public static final String concat(String s1, String s2, String s3, String s4) { return null; }

    public static final String concat(String s1, String s2, String s3, String s4, String s5) { return null; }

    public static final String concat(String s1, String s2, String s3, String s4, String s5, String s6) { return null; }

    public static final String concat(String s1, String s2, String s3, String s4, String s5, String s6, String s7) { return null; }

    public static final String concat(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) { return null; }

    public static final String concat(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, 
            String s9) { return null; }

    public static final String concat(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, 
            String s9, String s10) { return null; }

    public static String stringMarkingUpcaseTransitionsWithDelimiter(String self, String delimiter) { return null; }

    public static String stringRepeatedTimes(String string, int count) { return null; }

    public static String quotedStringWithQuote(String string, char quoteCharacter) { return null; }

    public static String capitalizedStringAsWord(String string) { return null; }

    public static String capitalizedString(String string) { return null; }

    public static String capitalizedStringWithPrefix(String string, String prefix) { return null; }

    public static String deleteAllInstancesOfString(String inString, String toBeDeleted) { return null; }

    public static String replaceAllInstancesOfString(String inString, String searchString, String replaceString) { return null; }

    public static boolean isNumber(String string) { return null; }

    public static String lastComponentInString(String text, char componentSeparator) { return null; }

    public static String lastComponentInString(String string, char componentSeparator, String defaultString) { return null; }

    public static String stringByDeletingLastComponent(String string, char componentSeparator) { return null; }

    public static boolean containsOnlyWhiteSpace(String string) { return null; }

    public static void appendToFile(File file, String content) { return null; }

    public static void writeToFile(File file, String content) { return null; }

    /**
     * @deprecated Method stringFromFile is deprecated
     */

    public static String stringFromFile(String path) { return null; }

    public static String stringFromFile(String path, String encoding) { return null; }

    /**
     * @deprecated Method stringFromFile is deprecated
     */

    public static String stringFromFile(File f) { return null; }

    public static String stringFromFile(File f, String encoding) { return null; }

    public static byte[] bytesFromInputStream(InputStream is) { return null; }

    public static String stringFromInputStream(InputStream is) { return null; }

    public static String stringFromInputStream(InputStream is, String encoding) { return null; }

    public static String stringFromReader(Reader r) { return null; }

    public static String stringFromPathURL(URL url) { return null; }

    public static String stringFromPathURL(URL url, String encoding) { return null; }

    public static String stringWithReplacements(String self, NSDictionary replacements) { return null; }

    public static String replaceNSStringSlot(String string, NSArray args) { return null; }

    private static boolean _isMagicCharacter(char character) { return null; }

    private static boolean _stringMatchesCharacter(String string, char character) { return null; }

    private static String _bracketedStringFromPatternAnalyzer(_PatternAnalyzer patternAnalyzer) { return null; }

    public static boolean stringMatchesPattern(String string, String pattern, boolean caseInsensitive) { return null; }

    static  {}

    public static final String UTF8_ENCODING = "UTF-8";
    public static final String UTF16_ENCODING = "UTF-16";
    public static final String ASCII_ENCODING = "US-ASCII";
    public static final String ISOLATIN1_ENCODING = "ISO-8859-1";
    private static final String WO_DEFAULT_ENCODING = "UTF-8";
    private static String _encoding;
    private static final int _MatchState = 0;
    private static final int _MatchStarState = 1;
    private static final int Finished = 2;

}
