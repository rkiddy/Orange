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
     * Creates an empty data object.
     */
    public NSData() { return null; }

    /**
     * Creates a data object with all the data in the byte array <code>bytes</code>.
     * @param bytes - input byte array
     */
    public NSData(byte bytes[]) { return null; }

    /**
     * Creates a data object with the bytes from the byte array <code>bytes</code> that fall in the range
     * specified by <code>range</code>.
     * @param bytes - input byte array
     * @param range - subrange of data within array
     */
    public NSData(byte bytes[], NSRange range) { return null; }

   /**
    * Creates a data object with the bytes from the byte array bytes that fall in the range specified by
    * offset and count.
    * @param bytes - input byte array
    * @param offset - offset of start of data within byte array
    * @param count - length of data starting at offset
    */
    public NSData(byte bytes[], int offset, int count) { return null; }

    /** 
     * Creates a data object with the bytes from the byte array bytes that fall in the range specified
     * by range. The noCopy parameter specifies whether or not a copy of bytes is made.
     * @param bytes - input byte array
     * @param range - range of data in byte array
     * @param noCopy - specifies whether or not a copy of bytes is made
     */
    public NSData(byte bytes[], NSRange range, boolean noCopy) { return null; }

    /**
     * Creates a data object containing the contents of another data object, otherData.
     * @param otherData - data object to be copied
     */
    public NSData(NSData otherData) { return null; }

    /**
     * Creates a data object with the data from the stream specified by inputStream. The chunkSize
     * parameter specifies the size, in bytes, of the block that the input stream returns when it
     * reads. For maximum performance, you should set the chunk size to the approximate size of the
     * data. This constructor reads the stream until it detects an end of file or encounters an
     * exception, but it does not close the stream.
     * @param inputStream - data object with the data from the stream specified by inputStream
     * @param chunkSize - specifies the size, in bytes, of the block that the input stream returns
     * @throws java.io.IOException
     */
    public NSData(InputStream inputStream, int chunkSize) throws IOException { return null; }

    /**
     * @throws java.io.IOException
     * @throws java.lang.IllegalArgumentException
     * @see NSData.NSData(InputStream inputStream, int chunkSize)
     * @deprecated
     */
    public NSData(File file) throws IOException { return null; }

    /**
     * Creates a new NSData from the contents of url.
     * @param url - input url
     * throws java.io.IOException
     */
    public NSData(URL url) throws IOException { return null; }

    /**
     * @param value - input value as String
     * @see NSData.NSData(InputStream inputStream, int chunkSize)
     * @deprecated
     */
    public NSData(String value) { return null; }

    /**
     * This constructor creates a new NSData object from a String.
     * @param value - the textual data to use
     * @param encoding - the encoding type used to create the bytes.
     */
    public NSData(String value, String encoding) { return null; }

    private void initFromBytes(byte bytes[], NSRange range, boolean noCopy) {}

    protected void _createBytesFromInputStream(InputStream inputStream, int length, boolean closeInputStream) throws IOException {}

    /**
     * Due to the internal implementation of NSData, the array returned by this primitive method may contain bytes that
     * are not actually a part of the receiver's data. The receiver's actual data is composed of the returned array's
     * bytes that lie in the range returned by rangeNoCopy. It is used by mutable subclasses of NSData.
     * @return returns the internal byte array that contains the receiver's data
     * @see NSData.rangeNoCopy
     */
    protected byte[] bytesNoCopy() { return null; }

    /**
     * Primitive method used by mutable subclasses of NSData.
     * @return the internal NSRange object that specifies the offset and length of the receiver's data relative to the internal
     *         byte array (as returned by bytesNoCopy)
     * @see NSData.bytesNoCopy
     * @see NSData.bytesNoCopy(NSMutableRange dataRange)
     */
    protected NSRange rangeNoCopy() { return null; }

    /**
     * Primitive method that returns the receiver's data.
     * @return an immutable byte array that contains the receiver's data
     */
    protected byte[] immutableBytes() { return null; }

    /**
     * Primitive method that returns the receiver's range.
     * @return an immutable NSRange object that specifies the receiver's length.
     */
    protected NSRange immutableRange() { return null; }

    /**
     * The receiver's actual data is composed of the returned array's bytes that lie within range.
     * <strong>WARNING</strong> NSData assumes the internal byte array is immutable. You should not change
     * contents of this array.
     * @param range - input mutable range specified by range
     * @return the internal byte array that contains the receiver's data and sets range's offset and length
     *         to those of the receiver's internal NSRange object
     */
    public byte[] bytesNoCopy(NSMutableRange range) { return null; }

    /**
     * Creates a data object containing a copy of the receiver's bytes that fall within the range specified by range.
     * @param range - input range
     * @return a data object containing a copy of the receiver's bytes that fall within the range specified by range
     * @throws RangeException - if range isn't within the receiver's range of bytes (XXX RangeException ???)
    public NSData subdataWithRange(NSRange range) { return null; }

    /**
     * Use the following code instead.
     * <code><pre>
     * myData = new NSData(new FileInputStream(file), chunkSize);
     * </pre></code>
     * @param file - input java.io.File object
     * @return an NSData object initialized with the contents of file
     * @throws java.io.IOException
     * @deprecated
     */
    public static NSData dataWithContentsOfMappedFile(File file) throws IOException { return null; }

    /**
     * Use the following code instead:
     * <code><pre>
     * myData = new NSData(new FileInputStream(file), chunkSize);
     * </pre></code>
     * @param file - input java.io.File object
     * @return an NSData object initialized with the contents of file
     * @throws java.io.IOException
     * @deprecated
     */
    public static NSData dataWithContentsOfFile(File file) throws IOException { return null; }

    /**
     * Use the following code instead:
     * <code><pre>
     * myData = new NSData(new FileInputStream(file), chunkSize);
     * </pre></code>
     * @param file - input java.io.File object
     * @return an NSData object initialized with the contents of file
     * @throws java.io.IOException
     * @deprecated
     */
    public static NSData dataWithContentsOfFile(String path) throws IOException { return null; }

    /**
     * Returns the number of bytes contained by the receiver.
     * @return the number of bytes contained by the receiver
     */
    public int length() { return 0; }

    public int _offset() { return 0; }

    public byte[] _bytesNoCopy() { return null; }

    private byte[] _bytes(int offset, int length) { return null; }

    /**
     * Returns a byte array containing all of the receiver's contents.
     * @return a byte array containing all of the receiver's contents
     */
    public byte[] bytes() { return null; }

    /**
     * Returns a byte array containing all of the receiver's contents.
     * @param offset - input range specified by <code>offset</code>
     * @param length - number of bytes following <code>offset</code> to return
     * @return a byte array containing the receiver's contents that fall within the range specified by <code>offset</code> and <code>length</code>
     */
    public byte[] bytes(int offset, int length) { return null; }

    /**
     * Returns a byte array containing all of the receiver's contents.
     * @param range - input range specified by range
     * @return a byte array containing the receiver's contents that fall within the range specified by range
     */
    public byte[] bytes(NSRange range) { return null; }

    /**
     * This method will be replaced by following code:
     * <code><pre>
     *   try {
     *       FileOutputStream fileOutputStream = new FileOutputStream(url.getFile());
     *       myData.writeToStream(fileOutputStream);
     *       fileOutputStream.close();
     *   }
     *   catch (java.io.IOException exception) {
     *       // Do something with the exception
     *   }
     * </pre></code>
     * @param url - input url
     * @param atomically - this parameter is ignored
     * @return returns true if write to URL succeeds
     * @see NSData.writeToStream(java.io.OutputStream outputStream)
     * @deprecated
     */
    public boolean writeToURL(URL url, boolean atomically) { return true; }

    /**
     * This method will be replaced by following code:
     * <code><pre>
     * try {
     *     FileOutputStream fileOutputStream = new FileOutputStream(path);
     *     myData.writeToStream(fileOutputStream);
     *     fileOutputStream.close();
     *  } catch (java.io.IOException exception) {
     *     // Do something with the exception
     *  }
     * </pre></code>
     * @param path - input path of the file
     * @return returns true if write to file succeeds
     * @deprecated
     */
    public boolean writeToFile(String path) { return true; }

    /**
     * Compares the receiving data object to <code>otherData</code>. Two data objects are equal if they hold
     * the same number of bytes, and if the bytes at the same position in the objects are the same.
     * @param otherData - input data object of type NSData
     * @return true if the contents of <code>otherData</code> are equal to the contents of the receiver, <code>false</code>
     */
    public boolean isEqualToData(NSData otherData) { return true; }

    /**
     * Returns a stream containing the receiver's data.
     * @return a <code>java.io.ByteArrayInputStream</code> containing the receiver's data
     */
    public ByteArrayInputStream stream() { return null; }

    /**
     * Writes the bytes in the receiver contents to the <code>stream</code>.
     * @param stream - the input bytes in the receiver
     * @throws java.io.IOException - if the write fails for any reason.
     */
    public void writeToStream(OutputStream stream) throws IOException {}

    public static final Class _CLASS;

    /**
     * An empty data object, which can be shared to save memory.
     */
    public static final NSData EmptyData;

    private static final String SerializationBytesFieldKey = "bytes";

    protected byte _bytes[];

    protected transient NSRange _range;

    protected transient int _hashCache;

    private transient boolean _recomputeHashCode;

    private static final char _nibbleToHex[];

    private static final ObjectStreamField serialPersistentFields[];

    //
    // inherited methods - do not add extra comments.
    //

    public boolean equals(Object object) { return true; }

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
}