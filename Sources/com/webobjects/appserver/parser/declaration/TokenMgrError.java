
package com.webobjects.appserver.parser.declaration;


public class TokenMgrError extends Error {


    protected static final String addEscapes(String str) { return null; }

    protected static String LexicalError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar) { return null; }

    public String getMessage() { return null; }

    public TokenMgrError() { return null; }

    public TokenMgrError(String message, int reason) { return null; }

    public TokenMgrError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar, int reason) { return null; }

    static final int LEXICAL_ERROR = 0;
    static final int STATIC_LEXER_ERROR = 1;
    static final int INVALID_LEXICAL_STATE = 2;
    static final int LOOP_DETECTED = 3;
    int errorCode;

}
