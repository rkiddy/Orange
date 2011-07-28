
package com.webobjects.foundation;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;


public class NSMutableData extends NSData {


    public NSMutableData() { return null; }

    public NSMutableData(int capacity) { return null; }

    public NSMutableData(byte bytes[]) { return null; }

    public NSMutableData(byte bytes[], NSRange range) { return null; }

    public NSMutableData(byte bytes[], NSRange range, boolean noCopy) { return null; }

    public NSMutableData(NSData otherData) { return null; }

    public NSMutableData(InputStream inputStream, int chunkSize) throws IOException { return null; }

    /**
     * @deprecated Method NSMutableData is deprecated
     */

    public NSMutableData(File file) throws IOException { return null; }

    /**
     * @deprecated Method NSMutableData is deprecated
     */

    public NSMutableData(URL url) throws IOException { return null; }

    /**
     * @deprecated Method NSMutableData is deprecated
     */

    public NSMutableData(String value) { return null; }

    public NSMutableData(String value, String encoding) { return null; }

    protected byte[] immutableBytes() { return null; }

    protected NSRange immutableRange() { return null; }

    public void setLength(int length) {}

    public void setData(NSData otherData) {}

    public void resetBytesInRange(NSRange range) {}

    public void appendByte(byte singleByte) {}

    public void appendBytes(byte bytes[], NSRange range) {}

    public void appendBytes(byte bytes[]) {}

    public void appendData(NSData otherData) {}

    public void increaseLengthBy(int additionalLength) {}

    public Object clone() { return null; }

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0x8091de23L;
    private static final int _DefaultInitialCapacity = 128;
    protected transient byte _immutableCopy[];

}
