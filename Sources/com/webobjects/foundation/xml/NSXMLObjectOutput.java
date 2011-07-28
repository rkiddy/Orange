
package com.webobjects.foundation.xml;

import java.io.IOException;

public interface NSXMLObjectOutput {

    public abstract void write(int i, String s);

    public abstract void write(byte abyte0[], String s) throws IOException;

    public abstract void write(byte abyte0[], int i, int j, String s) throws IOException;

    public abstract void writeBoolean(boolean flag, String s);

    public abstract void writeByte(int i, String s);

    public abstract void writeShort(int i, String s);

    public abstract void writeChar(int i, String s);

    public abstract void writeInt(int i, String s);

    public abstract void writeLong(long l, String s);

    public abstract void writeFloat(float f, String s);

    public abstract void writeDouble(double d, String s);

    public abstract void writeObject(Object obj, String s) throws IOException;

    public abstract void writeBytes(String s, String s1) throws IOException;

    public abstract void writeChars(String s, String s1) throws IOException;

    public abstract void writeUTF(String s, String s1);

    public abstract void writeComment(String s);

    public abstract void writeRootComment(String s, boolean flag);

    public abstract boolean setUseBase64ForBinaryData(boolean flag);

    public abstract boolean useBase64ForBinaryData();

    public abstract boolean enableReferenceForString();

    public abstract boolean disableReferenceForString();

    public abstract int disableReferenceForString(int i);

    public abstract boolean useReferenceForString();
}
