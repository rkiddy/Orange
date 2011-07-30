package com.webobjects.foundation;

import java.io.*;
import java.net.URL;

/**
 * <p>NSData and its subclass NSMutableData provide data objects, object-oriented wrappers for byte buffers.
 * Data objects let byte arrays take on the behavior of Foundation objects. NSData creates static data
 * objects, and NSMutableData creates dynamic data objects.
 * </p><p>
 * Data objects can wrap data of any size. The object contains no information about the data
 * itself (such as its type); the responsibility for deciding how to use the data lies with the client.
 * In particular, it will not handle byte-order swapping when distributed between big-endian and
 * little-endian machines.
 * </p><p>
 * The following table describes the NSData methods that provide the basis for all NSData's other methods;
 * that is, all other methods are implemented in terms of these four. If you create a subclass of NSData,
 * you need to ensure that only these base methods work properly. Having done so, you can be sure that all
 * the subclass's inherited methods operate properly.
 *  <table border="1">
 *  <caption>NSData's Base API</caption>
 *  <tr><th>Method</th><th>Description</th></tr>
 *  <tr>
 *     <td><code>bytesNoCopy</code></td>
 *     <td>Returns the internal byte array that contains the receiver's data. Used by mutable subclasses of NSData.</td>
 *  </tr>
 *  <tr>
 *     <td><code>immutableBytes</code></td>
 *     <td>Returns an immutable byte array that contains the receiver's data.</td>
 *  </tr>
 *  <tr>
 *     <td><code>immutableRange</code></td>
 *     <td>Returns an immutable NSRange object that specifies the receiver's length.</td>
 *  </tr>
 *  <tr>
 *     <td><code>rangeNoCopy</code></td>
 *     <td>Returns the internal NSRange object that specifies the receiver's length. Used by mutable subclasses of NSData.</td>
 *  </tr>
 *  </table>
 * </p><p>
 * To extract a data object that contains a subset of the bytes in another data object, use subdataWithRange.
 * To determine if two data objects are equal, use isEqualToData, which does a byte-for-byte comparison.
 * <code>writeToStream lets you write the contents of a data object to a stream (a java.io.OutputStream object).
 * </p>
 * @see NSData.bytesNoCopy
 * @see NSData.immutableBytes
 * @see NSData.immutableRange
 * @see NSData.rangeNoCopy
 * @see NSData.isEqualToData(NSData otherData)
 * @see NSData.subdataWithRange(NSRange range)
 * @see NSData.writeToStream(java.io.OutputStream outputStream)
 */
public class NSData implements Cloneable, Serializable, NSCoding {

    /**
     * Create an empty data object.
     */
    public NSData() { return null; }

    /**
     * Create a data object with all the data in the byte array <code>bytes</code>.
     * @param bytes - input byte array
     */
    public NSData(byte bytes[]) { return null; }

    /**
     * Create a data object with the bytes from the byte array <code>bytes</code> that fall in the range
     * specified by <code>range</code>.
     * @param bytes - input byte array
     * @param range - subrange of data within array
     */
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
