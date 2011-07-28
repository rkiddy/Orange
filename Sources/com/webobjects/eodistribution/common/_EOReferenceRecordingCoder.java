
package com.webobjects.eodistribution.common;

import com.webobjects.foundation.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class _EOReferenceRecordingCoder extends NSCoder {
    private static class _Decoder extends com.webobjects.foundation.NSCoding.Support {


        public _Decoder(Class receiver, Method method) { return null; }

        public Object decodeObject(NSCoder coder) { return null; }

        public void encodeWithCoder(Object obj, NSCoder nscoder) {}

        private Class _receiver;
        private Method _method;

    }

    public static interface Delegate {


        public abstract Object _replacementObjectForEncodedObject(Object obj);

        public abstract Object _replacementObjectForDecodedObject(Object obj);



        public static final Class _CLASS = null;

    }



    private void _debug(Object obj, String methodName, String message) {}

    private static String _identityString(Object object) { return null; }

    public _EOReferenceRecordingCoder() { return null; }

    public _EOReferenceRecordingCoder(boolean parity) { return null; }

    public void setDelegate(Object delegate) {}

    public Object _mthdelegate() { return null; }

    public void prepareForWriting(OutputStream stream) {}

    public void prepareForReading(InputStream stream) {}

    public void finishCoding() {}

    protected void _clearNonPersistentState() {}

    public OutputStream encodingStream() { return null; }

    public void forgetObject(Object object) {}

    public void encodeBoolean(boolean aBoolean) {}

    public void encodeByte(byte aByte) {}

    public void encodeChar(char aChar) {}

    public void encodeBytes(byte bytes[]) {}

    public void encodeShort(short aShort) {}

    public void encodeInt(int anInt) {}

    public void encodeLong(long aLong) {}

    public void encodeFloat(float aFloat) {}

    public void encodeDouble(double aDouble) {}

    private void _encodeUTF8(String string) {}

    public void encodeObject(Object object) {}

    public void encodeObjects(Object objects[]) {}

    private void _encodeClass(Class aClass, String distributedClassName) {}

    public void encodeClass(Class aClass) {}

    public boolean decodeBoolean() { return true; }

    public byte decodeByte() { return null; }

    public char decodeChar() { return null; }

    public byte[] decodeBytes() { return null; }

    public short decodeShort() { return 0; }

    public int decodeInt() { return 0; }

    public long decodeLong() { return 0L; }

    public float decodeFloat() { return null; }

    public double decodeDouble() { return null; }

    private String _decodeUTF8() { return null; }

    public Object decodeObject() { return null; }

    public Object[] decodeObjects() { return null; }

    public Class decodeClass() { return null; }

    protected Class _classForDecodedName(String name) { return null; }

    protected Class _classForNumber(short number) { return null; }

    protected void _registerClass(Class aClass) {}

    private static com.webobjects.foundation.NSCoding.Support _decoderForClass(Class aClass) { return null; }

    private static Method _decodeMethodForClass(Class aClass) { return null; }

    static  {}

    public static final Class _CLASS = null;
    private static String _replacementObjectForEncodedObject;
    private static String _replacementObjectForDecodedObject;
    private static final int _NullReference = 0;
    private static final int _PersistentReferenceFencepost = 0x80000001;
    private static final short _NewClass = -1;
    private static final short _NullClass = 0;
    private static final String _UTF8StringEncoding = "UTF8";
    private static final Object _decodingPlaceholder;
    private DataOutputStream _encodingBuffer;
    private DataInputStream _decodingSource;
    private _NSMutableIntegerDictionary _persistentObjectToReferenceMap;
    private _NSMutableIntegerKeyDictionary _persistentReferenceToObjectMap;
    private _NSMutableIntegerDictionary _referenceMap;
    private NSMutableArray _objectsByReference;
    private _NSMutableIntegerDictionary _classToNumberMap;
    private NSMutableArray _classesByNumber;
    private int _nextReference;
    private int _nextPersistentReference;
    private boolean _parity;
    private _NSDelegate _delegate;
    private boolean _debug;
    private static NSMutableDictionary _decodersByClass;
    static Object _args[];

}
