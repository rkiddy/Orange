
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;
import java.net.*;
import java.util.Random;


public class EOTemporaryGlobalID extends EOGlobalID
    implements NSCoding {


    public static synchronized void _setHostIdentificationBytes(byte bytes[]) { return null; }

    public static synchronized byte[] _hostIdentificationBytes() { return null; }

    public static void _setProcessIdentificationBytesFromInt(int processIdentification) { return null; }

    public static synchronized void _setProcessIdentificationBytes(byte bytes[]) { return null; }

    public static synchronized byte[] _processIdentificationBytes() { return null; }

    private static int _hashCodeForGloballyUniqueBytes(byte bytes[]) { return null; }

    public static synchronized void assignGloballyUniqueBytes(byte uniqueBytes[]) { return null; }

    public EOTemporaryGlobalID() { return null; }

    protected EOTemporaryGlobalID(byte globallyUniqueBytes[]) { return null; }

    public byte[] _rawBytes() { return null; }

    public static EOTemporaryGlobalID _gidForRawBytes(byte globallyUniqueBytes[]) { return null; }

    public boolean isTemporary() { return true; }

    public boolean equals(Object object) { return true; }

    public int hashCode() { return 0; }

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0xe79e58d3L;
    private static final String SerializationBytesFieldKey = "gid";
    private static final byte _NoByteArray[];
    private static final int _MinimumHostIdentificationBytesLength = 4;
    private static final int _HostIdentificationBytesLength = 6;
    private static final int _ProcessIdentificationBytesLength = 4;
    private static final int _CounterBytesLength = 2;
    private static final int _TimestampBytesLength = 8;
    private static final int _RandomBytesLength = 4;
    private static final int _HostIdentificationStartIndex = 0;
    private static final int _ProcessIdentificationStartIndex = 6;
    private static final int _CounterStartIndex = 10;
    private static final int _TimestampStartIndex = 12;
    private static final int _RandomStartIndex = 20;
    public static final int UniqueBinaryKeyLength = 24;
    private static byte _hostIdentificationBytes[];
    private static byte _processIdentificationBytes[];
    private static final byte _counterBytes[];
    private static byte _timestampBytes[];
    private static final byte _randomBytes[];
    private static byte _combinedUniqueBytesWithoutCounterInserted[];
    private static long _timestamp;
    private byte _bytes[];
    private transient int _hashCode;
    private static final ObjectStreamField serialPersistentFields[];

}
