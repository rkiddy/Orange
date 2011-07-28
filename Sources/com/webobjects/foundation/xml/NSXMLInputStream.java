
package com.webobjects.foundation.xml;

import com.webobjects.foundation.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;


public final class NSXMLInputStream extends ObjectInputStream {


    private OutputStream initParser(InputStream in) throws IOException { return null; }

    public NSXMLInputStream(InputStream in) throws IOException, StreamCorruptedException { return null; }

    public void registerValidation(ObjectInputValidation obj, int prio) throws NotActiveException, InvalidObjectException {}

    public void defaultReadObject() throws IOException, ClassNotFoundException {}

    protected Object readObjectOverride() throws OptionalDataException, ClassNotFoundException, IOException { return null; }

    public java.io.ObjectInputStream.GetField readFields() throws IOException, ClassNotFoundException { return null; }

    public int read() throws IOException { return 0; }

    public int read(byte buf[], int off, int len) throws IOException { return 0; }

    public void readFully(byte buf[]) throws IOException {}

    public void readFully(byte buf[], int off, int len) throws IOException {}

    public boolean readBoolean() throws IOException { return true; }

    public byte readByte() throws IOException { return null; }

    public int readUnsignedByte() throws IOException { return 0; }

    public short readShort() throws IOException { return 0; }

    public char readChar() throws IOException { return null; }

    public int readUnsignedShort() throws IOException { return 0; }

    public int readInt() throws IOException { return 0; }

    public long readLong() throws IOException { return 0L; }

    public float readFloat() throws IOException { return null; }

    public double readDouble() throws IOException { return null; }

    public int skipBytes(int len) throws IOException { return 0; }

    /**
     * @deprecated Method readLine is deprecated
     */

    public String readLine() throws IOException { return null; }

    public String readUTF() throws IOException { return null; }

    public int available() throws IOException { return 0; }

    public void close() throws IOException {}

    static  {}

    private static final SAXParserFactory _FACTORY;
    private static final String _WOXML_SCHEMA_PATH;
    private static final String VALIDATION_FLAG = "NSXMLValidation";
    private XMLReader _reader;
    private _NSErrorHandler _errHandler;
    private ObjectInputStream _oi;

}
