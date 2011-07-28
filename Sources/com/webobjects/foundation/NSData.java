
package com.webobjects.foundation;

import java.io.*;
import java.net.URL;


public class NSData
    implements Cloneable, Serializable, NSCoding {


    public NSData() { return null; }

    public NSData(byte bytes[]) { return null; }

    public NSData(byte bytes[], NSRange range) { return null; }

    public NSData(byte bytes[], int offset, int count) { return null; }

    private void initFromBytes(byte bytes[], NSRange range, boolean noCopy) {}

    public NSData(byte bytes[], NSRange range, boolean noCopy) { return null; }

    public NSData(NSData otherData) { return null; }

    public NSData(InputStream inputStream, int chunkSize) throws IOException { return null; }

    protected void _createBytesFromInputStream(InputStream inputStream, int length, boolean closeInputStream) throws IOException {}

    /**
     * @deprecated Method NSData is deprecated
     */

    public NSData(File file) throws IOException { return null; }

    public NSData(URL url) throws IOException { return null; }

    /**
     * @deprecated Method NSData is deprecated
     */

    public NSData(String value) { return null; }

    public NSData(String value, String encoding) { return null; }

    protected byte[] bytesNoCopy() { return null; }

    protected NSRange rangeNoCopy() { return null; }

    protected byte[] immutableBytes() { return null; }

    protected NSRange immutableRange() { return null; }

    public byte[] bytesNoCopy(NSMutableRange range) { return null; }

    public NSData subdataWithRange(NSRange range) { return null; }

    /**
     * @deprecated Method dataWithContentsOfMappedFile is deprecated
     */

    public static NSData dataWithContentsOfMappedFile(File file) throws IOException { return null; }

    /**
     * @deprecated Method dataWithContentsOfFile is deprecated
     */

    public static NSData dataWithContentsOfFile(File file) throws IOException { return null; }

    /**
     * @deprecated Method dataWithContentsOfFile is deprecated
     */

    public static NSData dataWithContentsOfFile(String path) throws IOException { return null; }

    public int length() { return 0; }

    public int _offset() { return 0; }

    public byte[] _bytesNoCopy() { return null; }

    private byte[] _bytes(int offset, int length) { return null; }

    public byte[] bytes() { return null; }

    public byte[] bytes(int offset, int length) { return null; }

    public byte[] bytes(NSRange range) { return null; }

    /**
     * @deprecated Method writeToURL is deprecated
     */

    public boolean writeToURL(URL url, boolean atomically) { return true; }

    /**
     * @deprecated Method writeToFile is deprecated
     */

    public boolean writeToFile(String path) { return true; }

    public boolean isEqualToData(NSData otherData) { return true; }

    public boolean equals(Object object) { return true; }

    public ByteArrayInputStream stream() { return null; }

    public void writeToStream(OutputStream stream) throws IOException {}

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    public int hashCode() { return 0; }

    public Object clone() { return null; }

    public String toString() { return null; }

    public String _hexString() { return null; }

    protected boolean _mustRecomputeHash() { return true; }

    protected void _setMustRecomputeHash(boolean change) {}

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    private Object readResolve() throws ObjectStreamException { return null; }

    static  {}

    public static final Class _CLASS;
    public static final NSData EmptyData;
    static final long serialVersionUID = 0xae8854e3L;
    private static final String SerializationBytesFieldKey = "bytes";
    protected byte _bytes[];
    protected transient NSRange _range;
    protected transient int _hashCache;
    private transient boolean _recomputeHashCode;
    private static final char _nibbleToHex[];
    private static final ObjectStreamField serialPersistentFields[];

}
