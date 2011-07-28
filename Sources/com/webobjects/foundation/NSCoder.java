
package com.webobjects.foundation;

import java.io.InputStream;
import java.io.OutputStream;


public abstract class NSCoder {


    public NSCoder() { return null; }

    public abstract void encodeBoolean(boolean flag);

    public abstract void encodeByte(byte byte0);

    public abstract void encodeBytes(byte abyte0[]);

    public abstract void encodeChar(char c);

    public abstract void encodeShort(short word0);

    public abstract void encodeInt(int i);

    public abstract void encodeLong(long l);

    public abstract void encodeFloat(float f);

    public abstract void encodeDouble(double d);

    public abstract void encodeObject(Object obj);

    public abstract void encodeClass(Class class1);

    public abstract void encodeObjects(Object aobj[]);

    public abstract boolean decodeBoolean();

    public abstract byte decodeByte();

    public abstract byte[] decodeBytes();

    public abstract char decodeChar();

    public abstract short decodeShort();

    public abstract int decodeInt();

    public abstract long decodeLong();

    public abstract float decodeFloat();

    public abstract double decodeDouble();

    public abstract Object decodeObject();

    public abstract Class decodeClass();

    public abstract Object[] decodeObjects();

    public void prepareForWriting(OutputStream outputstream) {}

    public void prepareForReading(InputStream inputstream) {}

    public void finishCoding() {}

    static  {}

    public static final Class _CLASS;

}
