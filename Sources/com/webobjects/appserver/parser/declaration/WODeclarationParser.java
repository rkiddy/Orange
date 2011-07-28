
package com.webobjects.appserver.parser.declaration;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOAssociationFactory;
import com.webobjects.appserver._private.WODeclaration;
import com.webobjects.appserver.parser.woml.WOMLPosition;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Vector;


public class WODeclarationParser
    implements WODeclarationParserConstants {


    public static NSDictionary declarationsWithString(String referenceName, String defs, WOAssociationFactory associationFactory) throws WODeclarationFormatException { return null; }

    public static WOAssociation associationWithString(String referenceName, String associationDef, WOAssociationFactory associationFactory) throws WODeclarationFormatException { return null; }

    public static Number makeInt(String s) { return null; }

    public static Number makeFloat(String s) { return null; }

    public static int countNumericEscapeSequence(char source[], int position, int maxNumericDigits) { return null; }

    public static String replaceEscapeSequencesWithRealChars(String escapedText) throws IllegalArgumentException { return null; }

    public WODeclarationParser(String referenceName, Reader reader, WOAssociationFactory associationFactory) { return null; }

    public WOAssociationFactory associationFactory() { return null; }

    public String getReferenceName() { return null; }

    public WOMLPosition getPosition(Token token) { return null; }

    public WOMLPosition getCurrentPosition() { return null; }

    public final NSDictionary declarations() throws ParseException { return null; }

    public final NSDictionary associations() throws ParseException { return null; }

    public final String associationKey() throws ParseException { return null; }

    public final WOAssociation associationRoot() throws ParseException { return null; }

    public final WOAssociation association() throws ParseException { return null; }

    public final String quotedString() throws ParseException { return null; }

    public final Number number() throws ParseException { return null; }

    private static void jj_la1_0() { return null; }

    private static void jj_la1_1() { return null; }

    public WODeclarationParser(InputStream stream) { return null; }

    public WODeclarationParser(InputStream stream, String encoding) { return null; }

    public void ReInit(InputStream stream) {}

    public void ReInit(InputStream stream, String encoding) {}

    public WODeclarationParser(Reader stream) { return null; }

    public void ReInit(Reader stream) {}

    public WODeclarationParser(WODeclarationParserTokenManager tm) { return null; }

    public void ReInit(WODeclarationParserTokenManager tm) {}

    private final Token jj_consume_token(int kind) throws ParseException { return null; }

    public final Token getNextToken() { return null; }

    public final Token getToken(int index) { return null; }

    private final int jj_ntk() { return null; }

    public ParseException generateParseException() { return null; }

    public final void enable_tracing() { return null; }

    public final void disable_tracing() { return null; }

    static  {}

    private WOAssociationFactory associationFactory;
    private String referenceName;
    public WODeclarationParserTokenManager token_source;
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
