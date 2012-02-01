package com.webobjects.foundation;
/**
 * NSData and its subclass NSMutableData provide data objects, object-oriented wrappers for byte buffers. Data objects let byte arrays take on the behavior of Foundation objects. NSData creates static data objects, and NSMutableData creates dynamic data objects.
 * Data objects can wrap data of any size. The object contains no information about the data itself (such as its type); the responsibility for deciding how to use the data lies with the client. In particular, it will not handle byte-order swapping when distributed between big-endian and little-endian machines.
 * The following table describes the NSData methods that provide the basis for all NSData's other methods; that is, all other methods are implemented in terms of these four. If you create a subclass of NSData, you need to ensure that only these base methods work properly. Having done so, you can be sure that all the subclass's inherited methods operate properly.
 * NSData's Base API Method Description bytesNoCopy Returns the internal byte array that contains the receiver's data. Used by mutable subclasses of NSData. immutableBytes Returns an immutable byte array that contains the receiver's data. immutableRange Returns an immutable NSRange object that specifies the receiver's length. rangeNoCopy Returns the internal NSRange object that specifies the receiver's length. Used by mutable subclasses of NSData.
 * To extract a data object that contains a subset of the bytes in another data object, use subdataWithRange. To determine if two data objects are equal, use isEqualToData, which does a byte-for-byte comparison.
 * writeToStream lets you write the contents of a data object to a stream (a java.io.OutputStream object).
 * See Also:NSData.bytesNoCopy(), NSData.immutableBytes(), NSData.immutableRange(), NSData.rangeNoCopy(), NSData.isEqualToData(NSData otherData), NSData.subdataWithRange(NSRange range), NSData.writeToStream(java.io.OutputStream outputStream), Serialized Form
 */
public class NSData implements java.lang.Cloneable, java.io.Serializable, com.webobjects.foundation.NSCoding{
    /**
     * An empty data object, which can be shared to save memory.
     */
    public static final com.webobjects.foundation.NSData EmptyData=null;

    /**
     * Creates an empty data object.
     */
    public NSData(){
         //TODO codavaj!!
    }

    /**
     * Creates a data object with all the data in the byte array bytes.
     * Parameters:bytes - input byte array
     */
    public NSData(byte[] bytes){
         //TODO codavaj!!
    }

    /**
     * Creates a data object with the bytes from the byte array bytes that fall in the range specified by offset and count.
     * Parameters:bytes - input byte arrayoffset - offset of start of data within byte arraycount - length of data starting at offset
     */
    public NSData(byte[] bytes, int offset, int count){
         //TODO codavaj!!
    }

    /**
     * Creates a data object with the bytes from the byte array bytes that fall in the range specified by range.
     * Parameters:bytes - input byte arrayrange - subrange of data within array
     */
    public NSData(byte[] bytes, com.webobjects.foundation.NSRange range){
         //TODO codavaj!!
    }

    /**
     * Creates a data object with the bytes from the byte array bytes that fall in the range specified by range. The noCopy parameter specifies whether or not a copy of bytes is made.
     * Parameters:bytes - input byte arrayrange - range of data in byte arraynoCopy - specifies whether or not a copy of bytes is made
     */
    public NSData(byte[] bytes, com.webobjects.foundation.NSRange range, boolean noCopy){
         //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Throws: IOException IllegalArgumentExceptionSee Also:NSData.NSData(InputStream inputStream, int chunkSize)
     */
    public NSData(java.io.File file) throws java.io.IOException{
         //TODO codavaj!!
    }

    /**
     * Creates a data object with the data from the stream specified by inputStream. The chunkSize parameter specifies the size, in bytes, of the block that the input stream returns when it reads. For maximum performance, you should set the chunk size to the approximate size of the data. This constructor reads the stream until it detects an end of file or encounters an exception, but it does not close the stream.
     * Parameters:inputStream - data object with the data from the stream specified by inputStreamchunkSize - specifies the size, in bytes, of the block that the input stream returns Throws: IOException
     */
    public NSData(java.io.InputStream inputStream, int chunkSize) throws java.io.IOException{
         //TODO codavaj!!
    }

    /**
     * Creates a data object containing the contents of another data object, otherData.
     * Parameters:otherData - data object to be copied
     */
    public NSData(com.webobjects.foundation.NSData otherData){
         //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method is deprecated in the Java Foundation Framework.
     * Parameters:value - input value as StringSee Also:NSData.NSData(InputStream inputStream, int chunkSize)
     */
    public NSData(java.lang.String value){
         //TODO codavaj!!
    }

    /**
     * This constructor creates a new NSData object from a String
     * Parameters:value - The textual data to useencoding - The encoding type used to create the bytes.
     */
    public NSData(java.lang.String value, java.lang.String encoding){
         //TODO codavaj!!
    }

    /**
     * Creates a new NSData from the contents of url.
     * Parameters:url - input url Throws: IOException
     */
    public NSData(java.net.URL url) throws java.io.IOException{
         //TODO codavaj!!
    }

    byte[] bytes(){
        return null; //TODO codavaj!!
    }

    byte[] bytes(int offset, int length){
        return null; //TODO codavaj!!
    }

    byte[] bytes(com.webobjects.foundation.NSRange range){
        return null; //TODO codavaj!!
    }

    /**
     * Due to the internal implementation of NSData, the array returned by this primitive method may contain bytes that are not actually a part of the receiver's data. The receiver's actual data is composed of the returned array's bytes that lie in the range returned by rangeNoCopy. It is used by mutable subclasses of NSData.
     */
    protected byte[] bytesNoCopy(){
        return null; //TODO codavaj!!
    }

    /**
     * The receiver's actual data is composed of the returned array's bytes that lie within range.
     */
    public byte[] bytesNoCopy(com.webobjects.foundation.NSMutableRange range){
        return null; //TODO codavaj!!
    }

    java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSData dataWithContentsOfFile(java.io.File file){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSData dataWithContentsOfFile(java.lang.String path){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSData dataWithContentsOfMappedFile(java.io.File file){
        return null; //TODO codavaj!!
    }

    java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    boolean equals(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    int hashCode(){
        return 0; //TODO codavaj!!
    }

    /**
     * Privitive method that returns the receiver's data.
     */
    protected byte[] immutableBytes(){
        return null; //TODO codavaj!!
    }

    /**
     * Privitive method that returns the receiver's range.
     */
    protected com.webobjects.foundation.NSRange immutableRange(){
        return null; //TODO codavaj!!
    }

    boolean isEqualToData(com.webobjects.foundation.NSData otherData){
        return false; //TODO codavaj!!
    }

    int length(){
        return 0; //TODO codavaj!!
    }

    /**
     * Primitive method used by mutable subclasses of NSData.
     */
    protected com.webobjects.foundation.NSRange rangeNoCopy(){
        return null; //TODO codavaj!!
    }

    java.io.ByteArrayInputStream stream(){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSData subdataWithRange(com.webobjects.foundation.NSRange range){
        return null; //TODO codavaj!!
    }

    java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    boolean writeToFile(java.lang.String path){
        return false; //TODO codavaj!!
    }

    void writeToStream(java.io.OutputStream stream){
        return; //TODO codavaj!!
    }

    boolean writeToURL(java.net.URL url, boolean atomically){
        return false; //TODO codavaj!!
    }

}
