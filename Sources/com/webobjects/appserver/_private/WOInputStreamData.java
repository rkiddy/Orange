
package com.webobjects.appserver._private;

import com.webobjects.foundation.*;
import java.io.*;

public class WOInputStreamData extends NSMutableData {


    public WOInputStreamData(NSData otherData) { return null; }

    public WOInputStreamData(InputStream inputStream, int length) { return null; }

    protected void _initInputStream(InputStream inputStream, int length, boolean closeInputStream) {}

    protected void _extractBytesFromInputStream() {}

    protected byte[] bytesNoCopy() { return null; }

    protected NSRange rangeNoCopy() { return null; }

    public boolean isEqualToData(NSData otherData) { return true; }

    public InputStream inputStream() { return null; }

    public int streamLength() { return 0; }

    public boolean hasStreamBeenAccessed() { return true; }

    public InputStream _stream() { return null; }

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public int hashCode() { return 0; }

    public String toString() { return null; }

    protected Object writeReplace() throws ObjectStreamException { return null; }

    protected NSRange immutableRange() { return null; }

    public void setLength(int length) {}

    public void setData(NSData otherData) {}

    public void resetBytesInRange(NSRange range) {}

    public void appendByte(byte singleByte) {}

    public void appendBytes(byte bytes[], NSRange range) {}

    public Object clone() { return null; }

    static final long serialVersionUID = 1L;
    protected InputStream _stream;
    protected int _streamLength;
    protected boolean _shouldClose;
    protected boolean _hasAccessedStream;

}
