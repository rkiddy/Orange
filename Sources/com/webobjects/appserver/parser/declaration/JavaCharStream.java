
package com.webobjects.appserver.parser.declaration;

import java.io.*;

public class JavaCharStream {


    static final int hexval(char c) throws IOException { return null; }

    protected void setTabSize(int i) {}

    protected int getTabSize(int i) { return 0; }

    protected void ExpandBuff(boolean wrapAround) {}

    protected void FillBuff() throws IOException {}

    protected char ReadByte() throws IOException { return null; }

    public char BeginToken() throws IOException { return null; }

    protected void AdjustBuffSize() {}

    protected void UpdateLineColumn(char c) {}

    public char readChar() throws IOException { return null; }

    /**
     * @deprecated Method getColumn is deprecated
     */

    public int getColumn() { return 0; }

    /**
     * @deprecated Method getLine is deprecated
     */

    public int getLine() { return 0; }

    public int getEndColumn() { return 0; }

    public int getEndLine() { return 0; }

    public int getBeginColumn() { return 0; }

    public int getBeginLine() { return 0; }

    public void backup(int amount) {}

    public JavaCharStream(Reader dstream, int startline, int startcolumn, int buffersize) { return null; }

    public JavaCharStream(Reader dstream, int startline, int startcolumn) { return null; }

    public JavaCharStream(Reader dstream) { return null; }

    public void ReInit(Reader dstream, int startline, int startcolumn, int buffersize) {}

    public void ReInit(Reader dstream, int startline, int startcolumn) {}

    public void ReInit(Reader dstream) {}

    public JavaCharStream(InputStream dstream, String encoding, int startline, int startcolumn, int buffersize) throws UnsupportedEncodingException { return null; }

    public JavaCharStream(InputStream dstream, int startline, int startcolumn, int buffersize) { return null; }

    public JavaCharStream(InputStream dstream, String encoding, int startline, int startcolumn) throws UnsupportedEncodingException { return null; }

    public JavaCharStream(InputStream dstream, int startline, int startcolumn) { return null; }

    public JavaCharStream(InputStream dstream, String encoding) throws UnsupportedEncodingException { return null; }

    public JavaCharStream(InputStream dstream) { return null; }

    public void ReInit(InputStream dstream, String encoding, int startline, int startcolumn, int buffersize) throws UnsupportedEncodingException {}

    public void ReInit(InputStream dstream, int startline, int startcolumn, int buffersize) {}

    public void ReInit(InputStream dstream, String encoding, int startline, int startcolumn) throws UnsupportedEncodingException {}

    public void ReInit(InputStream dstream, int startline, int startcolumn) {}

    public void ReInit(InputStream dstream, String encoding) throws UnsupportedEncodingException {}

    public void ReInit(InputStream dstream) {}

    public String GetImage() { return null; }

    public char[] GetSuffix(int len) { return null; }

    public void Done() {}

    public void adjustBeginLineColumn(int newLine, int newCol) {}

    public static final boolean staticFlag = false;
    public int bufpos;
    int bufsize;
    int available;
    int tokenBegin;
    protected int bufline[];
    protected int bufcolumn[];
    protected int column;
    protected int line;
    protected boolean prevCharIsCR;
    protected boolean prevCharIsLF;
    protected Reader inputStream;
    protected char nextCharBuf[];
    protected char buffer[];
    protected int maxNextCharInd;
    protected int nextCharInd;
    protected int inBuf;
    protected int tabSize;

}
