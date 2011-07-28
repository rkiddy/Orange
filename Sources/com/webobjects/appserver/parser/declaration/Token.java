
package com.webobjects.appserver.parser.declaration;


public class Token {


    public Token() { return null; }

    public String toString() { return null; }

    public static final Token newToken(int ofKind) { return null; }

    public int kind;
    public int beginLine;
    public int beginColumn;
    public int endLine;
    public int endColumn;
    public String image;
    public Token next;
    public Token specialToken;

}
