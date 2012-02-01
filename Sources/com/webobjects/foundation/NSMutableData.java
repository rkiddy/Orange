package com.webobjects.foundation;
/**
 * The NSMutableData class declares the programmatic interface to an object that contains modifiable data in the form of bytes. The data grows automatically if necessary.
 * The following table describes the NSMutableData methods that provide the basis for all NSMutableData's other methods; that is, all other methods are implemented in terms of these nine. If you create a subclass of NSMutableData, you need only ensure that these base methods work properly. Having done so, you can be sure that all your subclass's inherited methods operate properly.
 * To modify the data, use the setData, appendByte, appendBytes, and appendData methods. If you want to set a range of bytes to zero, use the resetBytesInRange method. To change the length of the data, use the setLength and increaseLengthBy methods.
 * See Also:NSData, NSMutableData.appendByte(byte byte), NSMutableData.appendBytes(byte[] bytes[]), NSMutableData.appendBytes( byte[] bytes, NSRange range), NSData.bytesNoCopy(), NSMutableData.immutableBytes(), NSMutableData.immutableRange(), NSData.rangeNoCopy(), NSMutableData.resetBytesInRange(NSRange range), NSMutableData.setData(NSData data), NSMutableData.setLength(int length), NSMutableData.appendData(NSData otherData), NSMutableData.increaseLengthBy(int additionalLength), Serialized Form
 */
public class NSMutableData extends com.webobjects.foundation.NSData{
    /**
     * Creates an empty NSMutableData object.
     */
    public NSMutableData(){
         //TODO codavaj!!
    }

    /**
     * Creates an NSMutableData object with all the data in the byte array bytes.
     * Parameters:bytes - input byte array
     */
    public NSMutableData(byte[] bytes){
         //TODO codavaj!!
    }

    /**
     * Creates an NSMutableData object with the bytes from the byte array bytes that fall in the range specified by range.
     * Parameters:bytes - input byte arrayrange - specifies the range that the bytes fall in
     */
    public NSMutableData(byte[] bytes, com.webobjects.foundation.NSRange range){
         //TODO codavaj!!
    }

    /**
     * Creates an NSMutableData object with the bytes from the byte array bytes that fall in the range specified by range. The noCopy parameter specifies whether or not a copy of bytes is made.
     * Parameters:bytes - input byte arrayrange - specifies the range that the bytes fall innoCopy - specifies whether or not a copy of bytes is made
     */
    public NSMutableData(byte[] bytes, com.webobjects.foundation.NSRange range, boolean noCopy){
         //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Use NSMutableData(new FileInputStream(file),myChunkSize) instead.
     * Throws: IOExceptionSee Also:NSMutableData.NSMutableData(InputStream, int)
     */
    public NSMutableData(java.io.File file) throws java.io.IOException{
         //TODO codavaj!!
    }

    /**
     * Creates a data object with the data from the stream specified by inputStream.
     * The chunkSize parameter specifies the size, in bytes, of the block that the input stream returns when it reads. For maximum performance, you should set the chunk size to the approximate size of the data. This constructor does not close the stream.
     * Parameters:inputStream - data object is created with the data from thischunkSize - specifies the size of the block that the input stream returns when it reads Throws: java.lang.IOException IOException
     */
    public NSMutableData(java.io.InputStream inputStream, int chunkSize) throws java.io.IOException{
         //TODO codavaj!!
    }

    /**
     * Creates an NSMutableData object prepared to store at least capacity bytes.
     * If you know the upper bound on the size of his data, you can use this constructor to improve performance. As long as the data size does not exceed capacity bytes, the internal byte array will not be reallocated.
     * Parameters:capacity - the upper bound on the size of the data
     */
    public NSMutableData(int capacity){
         //TODO codavaj!!
    }

    /**
     * Creates an NSMutableData object containing the contents of another data object otherData.
     * Parameters:otherData - contents of another data object
     */
    public NSMutableData(com.webobjects.foundation.NSData otherData){
         //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Use NSMutableData(string.getBytes()) instead.
     * See Also:NSMutableData.NSMutableData(byte[])
     */
    public NSMutableData(java.lang.String value){
         //TODO codavaj!!
    }

    /**
     * This constructor creates a new NSMutableData object from a String
     * Parameters:value - The textual data to useencoding - The encoding type used to create the bytes.
     */
    public NSMutableData(java.lang.String value, java.lang.String encoding){
         //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Use the following code instead: URLConnection connection = url.openConnection(); connection.connect(); NSMutableData myData = new NSMutableData(connection.getInputStream(),myChunkSize);
     * Throws: IOExceptionSee Also:NSMutableData.NSMutableData(InputStream, int)
     */
    public NSMutableData(java.net.URL url) throws java.io.IOException{
         //TODO codavaj!!
    }

    /**
     * Appends the specified byte to the receiver.
     */
    public void appendByte(byte singleByte){
        return; //TODO codavaj!!
    }

    /**
     * Appends the specified byte array to the receiver.
     */
    public void appendBytes(byte[] bytes){
        return; //TODO codavaj!!
    }

    /**
     * Appends the contents of byte array bytes to the receiver. The two-argument method appends the bytes in bytes that fall within the range specified by range.
     */
    public void appendBytes(byte[] bytes, com.webobjects.foundation.NSRange range){
        return; //TODO codavaj!!
    }

    /**
     * Appends the contents of a data object otherData to the receiver.
     */
    public void appendData(com.webobjects.foundation.NSData otherData){
        return; //TODO codavaj!!
    }

    /**
     * Returns an identical copy of the receiver.
     */
    public java.lang.Object clone(){
        return null; //TODO codavaj!!
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

    /**
     * Increases the length of the receiver by additionalLength. The additional bytes are all set to zero.
     */
    public void increaseLengthBy(int additionalLength){
        return; //TODO codavaj!!
    }

    /**
     * Resets to zero the receiver's bytes that fall within the specified range.
     * The receiver is resized to accommodate the new bytes, if necessary.
     */
    public void resetBytesInRange(com.webobjects.foundation.NSRange range){
        return; //TODO codavaj!!
    }

    /**
     * Replaces the entire contents of the receiver with the contents of otherdata.
     */
    public void setData(com.webobjects.foundation.NSData otherData){
        return; //TODO codavaj!!
    }

    /**
     * Extends or truncates a mutable data object to the specified length. If the mutable data object is extended, the additional bytes are filled with zero.
     */
    public void setLength(int length){
        return; //TODO codavaj!!
    }

}
