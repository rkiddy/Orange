
package com.webobjects.eocontrol._private;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Vector;


public class _EOQualifierParser
    implements _EOQualifierParserConstants {
    public static class KeyString {


        public KeyString(Object someText) { return null; }

        public int length() { return 0; }

        public boolean equals(Object other) { return true; }

        public int hashCode() { return 0; }

        public String toString() { return null; }

        private String _keyText;

    }



    private static Number _makeIntoCorrectNumberClass(Object value, Class targetClass) { return null; }

    private static Boolean _makeIntoBooleanClass(Object value) { return null; }

    private static NSTimestamp _makeIntoTimestampClass(Object value) { return null; }

    public void setArguments(NSArray args) {}

    public void _checkAvailableArgumentIndex(int argIndex) throws ParseException {}

    Object parseArgumentPath(String text) throws ParseException { return null; }

    Object subParseArgument(char conversionSpecifier) throws ParseException { return null; }

    BigDecimal parseNumericText(String text) { return null; }

    Number narrowIntegerNumber(BigDecimal value) { return null; }

    Number narrowFloatingPointNumber(BigDecimal value) { return null; }

    int countNumericEscapeSequence(char source[], int position, int maxNumericDigits) { return null; }

    String replaceEscapeSequencesWithRealChars(String escapedText) throws ParseException { return null; }

    public final Object parseIdentifier() throws ParseException { return null; }

    public final Object parseKeyOrAnyArgument() throws ParseException { return null; }

    public final Object parseValue() throws ParseException { return null; }

    public final Object parseOperator() throws ParseException { return null; }

    public final Object parseValueList() throws ParseException { return null; }

    public final Object parseOperatorList() throws ParseException { return null; }

    public final int parseLogicalOp() throws ParseException { return null; }

    public final EOQualifier Expression() throws ParseException { return null; }

    public final EOQualifier ParenExpression() throws ParseException { return null; }

    public final EOQualifier NotExpression() throws ParseException { return null; }

    public final EOQualifier RelOpExpression() throws ParseException { return null; }

    public final EOQualifierVariable parseVariable() throws ParseException { return null; }

    public final String parseQuotedString() throws ParseException { return null; }

    public final Number parseMyNumber() throws ParseException { return null; }

    public final Number parseNegNumber() throws ParseException { return null; }

    public final com.webobjects.foundation.NSKeyValueCoding.Null parseNil() throws ParseException { return null; }

    public final Object CastedValueExpression() throws ParseException { return null; }

    public final Object parseArgument() throws ParseException { return null; }

    public final EOQualifier Qualifier() throws ParseException { return null; }

    public final EOQualifier parseLogicalExpression() throws ParseException { return null; }

    private static void jj_la1_0() { return null; }

    private static void jj_la1_1() { return null; }

    public _EOQualifierParser(InputStream stream) { return null; }

    public _EOQualifierParser(InputStream stream, String encoding) { return null; }

    public void ReInit(InputStream stream) {}

    public void ReInit(InputStream stream, String encoding) {}

    public _EOQualifierParser(Reader stream) { return null; }

    public void ReInit(Reader stream) {}

    public _EOQualifierParser(_EOQualifierParserTokenManager tm) { return null; }

    public void ReInit(_EOQualifierParserTokenManager tm) {}

    private final Token jj_consume_token(int kind) throws ParseException { return null; }

    public final Token getNextToken() { return null; }

    public final Token getToken(int index) { return null; }

    private final int jj_ntk() { return null; }

    public ParseException generateParseException() { return null; }

    public final void enable_tracing() { return null; }

    public final void disable_tracing() { return null; }

    static  {}

    public static final int NO_TOKEN = 0;
    public static final int AND_TOKEN = 1;
    public static final int OR_TOKEN = 2;
    protected NSArray arguments;
    protected int argIndex;
    protected int argCount;
    private static final BigDecimal MIN_INTEGER;
    private static final BigDecimal MAX_INTEGER;
    private static final BigDecimal MIN_LONG;
    private static final BigDecimal MAX_LONG;
    private static final BigDecimal MIN_DOUBLE;
    private static final BigDecimal MAX_DOUBLE;
    private static final BigDecimal MIN_FLOAT;
    private static final BigDecimal MAX_FLOAT;
    private static final String defaultStringTimestampFormat = "%Y-%m-%d %H:%M:%S %Z";
    private static final NSTimestampFormatter defaultStringTimestampFormatter;
    public _EOQualifierParserTokenManager token_source;
    JavaCharStream jj_input_stream;
    public Token token;
    public Token jj_nt;
    private int jj_ntk;
    private int jj_gen;
    private final int jj_la1[];
    private static int jj_la1_0[];
    private static int jj_la1_1[];
    private Vector jj_expentries;
    private int jj_expentry[];
    private int jj_kind;

}
