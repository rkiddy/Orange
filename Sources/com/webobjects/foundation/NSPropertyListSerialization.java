
package com.webobjects.foundation;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;


public class NSPropertyListSerialization {
    public static class _ApplePList extends _PListParser {


        public _ApplePList() { return null; }

        public _ApplePList(boolean indents) { return null; }

        private void _saveIndexes(int i, int j, int k) {}

        private String _savedIndexesAsString() { return null; }

        public static boolean propertyListsAreEqual(Object obj, Object obj1) { return null; }

        public static Object copyPropertyList(Object obj) { return null; }

        public String stringFromPropertyList(Object plist) { return null; }

        public Object parseStringIntoPlist(String string) { return null; }

        private void _appendObjectToStringBuffer(Object obj, StringBuffer stringbuffer, int i) {}

        private void _appendStringToStringBuffer(String s, StringBuffer stringbuffer, int i) {}

        private void _appendDataToStringBuffer(NSData nsdata, StringBuffer stringbuffer, int i) {}

        private void _appendArrayToStringBuffer(NSArray nsarray, StringBuffer stringbuffer, int i) {}

        private void _appendDictionaryToStringBuffer(NSDictionary nsdictionary, StringBuffer stringbuffer, int i) {}

        private final char _hexDigitForNibble(byte nibble) { return null; }

        private int _readObjectIntoObjectReference(char ac[], int index, Object aobj[]) { return 0; }

        private int _readUnquotedStringIntoStringBuffer(char ac[], int index, StringBuffer buffer) { return 0; }

        private int _readQuotedStringIntoStringBuffer(char ac[], int index, StringBuffer stringbuffer) { return 0; }

        private int _lengthOfData(char ac[], int index) { return 0; }

        private int _readDataContentsIntoData(char ac[], int index, NSMutableData nsmutabledata) { return 0; }

        private int _readArrayContentsIntoArray(char ac[], int index, NSMutableArray nsmutablearray) { return 0; }

        private int _readDictionaryContentsIntoDictionary(char ac[], int index, NSMutableDictionary nsmutabledictionary) { return 0; }

        private int _checkForWhitespaceOrComment(char ac[], int index) { return 0; }

        private int _skipWhitespaceAndComments(char ac[], int index) { return 0; }

        private int _processWhitespace(char ac[], int index) { return 0; }

        private int _processSingleLineComment(char ac[], int index) { return 0; }

        private int _processMultiLineComment(char ac[], int index) { return 0; }

        private final byte _nibbleForHexDigit(char c) { return null; }

        private final boolean _isHexDigit(char c) { return null; }

        private final boolean _isWhitespace(char c) { return null; }

        private char _nsToUnicode(int i) { return null; }

        static  {}

        private int _lineNumber;
        private int _startOfLineCharIndex;
        private int _savedIndex;
        private int _savedLineNumber;
        private int _savedStartOfLineCharIndex;
        private static final int _C_NON_COMMENT_OR_SPACE = 1;
        private static final int _C_WHITESPACE = 2;
        private static final int _C_SINGLE_LINE_COMMENT = 3;
        private static final int _C_MULTI_LINE_COMMENT = 4;
        private static final int NSToPrecompUnicodeTable[];

    }

    public static class _XML extends _PListParser {
        public static class DictionaryParser extends DefaultHandler {


            public DictionaryParser() { return null; }

            public Object plist() { return null; }

            public void characters(char ch[], int start, int length) throws SAXException {}

            public void endDocument() throws SAXException {}

            public void endElement(String uri, String localName, String qName) throws SAXException {}

            public void error(SAXParseException exception) throws SAXException {}

            public void fatalError(SAXParseException exception) throws SAXException {}

            public void ignorableWhitespace(char ac[], int i, int j) throws SAXException {}

            public void processingInstruction(String s, String s1) throws SAXException {}

            public InputSource resolveEntity(String publicId, String systemId) throws SAXException { return null; }

            public void startElement(String uri, String localName, String qName, Attributes attributes) {}

            public void startDocument() throws SAXException {}

            private void saveCharContent() throws SAXException {}

            public void warning(SAXParseException exception) throws SAXException {}

            protected String unescapeString(String toRestore) { return null; }

            static  {}

            static String PUBLIC_APPLE_COMPUTER_PLIST_1_0;
            static String PUBLIC_APPLE_PLIST_1_0;
            protected SimpleDateFormat _dateFormat;
            protected Stack _stack;
            protected Object _plist;
            protected StringBuffer _curChars;

        }



        public _XML() { return null; }

        public _XML(boolean indents) { return null; }

        public static SAXParserFactory parserFactory() { return null; }

        public SAXParser newSAXParser() { return null; }

        public Object parseStringIntoPlist(String string) { return null; }

        public String stringFromPropertyList(Object plist) { return null; }

        private void _appendObjectToStringBuffer(Object obj, StringBuffer stringbuffer, int i) {}

        private void _appendStringToStringBuffer(String s, StringBuffer stringbuffer, int i) {}

        private void _appendIntegerToStringBuffer(Number s, StringBuffer stringbuffer, int i) {}

        private void _appendFloatToStringBuffer(Number s, StringBuffer stringbuffer, int i) {}

        private void _appendBooleanToStringBuffer(Boolean s, StringBuffer stringbuffer, int i) {}

        private void _appendDateToStringBuffer(Date s, StringBuffer stringbuffer, int i) {}

        private void _appendDataToStringBuffer(NSData s, StringBuffer stringbuffer, int i) {}

        private void _appendArrayToStringBuffer(List vector, StringBuffer stringbuffer, int i) {}

        private void _appendDictionaryToStringBuffer(Map table, StringBuffer stringbuffer, int i) {}

        protected String escapeString(String toValidate) { return null; }

        protected static SAXParserFactory _parserFactory;
        protected SimpleDateFormat _dateFormat;

    }

    public static abstract class _PListParser {


        public _PListParser(boolean indents) { return null; }

        protected void _appendIndentationToStringBuffer(StringBuffer buffer, int i) {}

        protected void _appendNewLineToStringBuffer(StringBuffer buffer, int i) {}

        public abstract Object parseStringIntoPlist(String s);

        private boolean _indents;

    }



    private NSPropertyListSerialization() { return null; }

    public static String stringFromPropertyList(Object plist) { return null; }

    public static String stringFromPropertyList(Object plist, boolean indents) { return null; }

    public static String xmlStringFromPropertyList(Object plist) { return null; }

    public static String xmlStringFromPropertyList(Object plist, boolean indents) { return null; }

    static boolean startsWithXMLDeclaration(String string) { return true; }

    public static Object propertyListFromString(String string) { return null; }

    public static Object propertyListFromString(String string, boolean forceXML) { return null; }

    public static Object propertyListWithPathURL(URL url) { return null; }

    public static Object propertyListWithPathURL(URL url, boolean forceXML) { return null; }

    /**
     * @deprecated Method dataFromPropertyList is deprecated
     */

    public static NSData dataFromPropertyList(Object plist) { return null; }

    public static NSData dataFromPropertyList(Object plist, String encoding) { return null; }

    /**
     * @deprecated Method propertyListFromData is deprecated
     */

    public static Object propertyListFromData(NSData data) { return null; }

    public static Object propertyListFromData(NSData data, String encoding) { return null; }

    public static boolean booleanForString(String value) { return null; }

    public static int intForString(String value) { return null; }

    public static NSArray arrayWithPathURL(URL url) { return null; }

    public static NSArray arrayWithPathURL(URL url, boolean forceXML) { return null; }

    public static NSArray arrayForString(String value) { return null; }

    public static NSArray arrayForString(String value, boolean forceXML) { return null; }

    public static NSDictionary dictionaryWithPathURL(URL url) { return null; }

    public static NSDictionary dictionaryWithPathURL(URL url, boolean forceXML) { return null; }

    public static NSDictionary dictionaryForString(String value) { return null; }

    public static NSDictionary dictionaryForString(String value, boolean forceXML) { return null; }

    static  {}

    public static final Class _CLASS;
    private static final int EOT = -1;
    public static final boolean Indents = true;
    public static final boolean NoIndents = false;
    public static final boolean ForceXML = true;


    // Unreferenced inner class com/webobjects/foundation/NSPropertyListSerialization$1

/* anonymous class */
    static class _cls1 {


        static  {}

        static final int $SwitchMap$com$webobjects$foundation$NSPropertyListSerialization$_XML$DictionaryParser$XMLNode$Type[];

    }

}
