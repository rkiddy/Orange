
package com.webobjects.appserver.parser.declaration;


public interface WODeclarationParserConstants {




    public static final int EOF = 0;
    public static final int NAME = 7;
    public static final int LETTER = 8;
    public static final int DIGIT = 9;
    public static final int NAME_CHAR = 10;
    public static final int ASSOCIATIONS_START = 11;
    public static final int INTEGER_LITERAL = 18;
    public static final int FLOATING_POINT_LITERAL = 19;
    public static final int DEC_DIGITS = 20;
    public static final int DEC_FLT = 21;
    public static final int EXPONENT = 22;
    public static final int DEC_FLT_SUFF = 23;
    public static final int NULL = 24;
    public static final int TRUE = 25;
    public static final int FALSE = 26;
    public static final int IDENT = 27;
    public static final int KVC = 28;
    public static final int ASSOCIATION_KEY = 29;
    public static final int STRING_LITERAL = 30;
    public static final int ESCAPE_SEQUENCE = 31;
    public static final int EQUALS = 32;
    public static final int SEMI = 33;
    public static final int SCHEME_NAME_CONST = 34;
    public static final int SCHEME_NAME = 35;
    public static final int SCHEME_CDATA_NAME = 36;
    public static final int ASSOCIATIONS_END = 37;
    public static final int SCHEME_CDATA_CONTENT = 38;
    public static final int SCHEME_CONTENT_STRING_LITERAL = 40;
    public static final int SCHEME_CONTENT = 42;
    public static final int DEFAULT = 0;
    public static final int Associations = 1;
    public static final int SchemeContentCData = 2;
    public static final int SchemeContent = 3;
    public static final String tokenImage[] = new String[] {};

}
