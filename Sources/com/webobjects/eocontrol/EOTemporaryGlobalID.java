package com.webobjects.eocontrol;
/**
 * An EOTemporaryGlobalID object identifies a newly created enterprise object before it's saved to an external store. When the object is saved, the temporary ID is converted to a permanent one, as described in the EOGlobalID class specification.
 * See Also:EOGlobalID, Serialized Form
 */
public class EOTemporaryGlobalID extends com.webobjects.eocontrol.EOGlobalID implements com.webobjects.foundation.NSCoding{
    /**
     * The following int constant specifies the length (in bytes) of a global ID.
     * See Also:Constant Field Values
     */
    public static final int UniqueBinaryKeyLength=24;

    /**
     * Creates and returns an EOTemporaryGlobalID as a unique instance. The returned object contains a byte string that's guaranteed to be unique network wide. As a result, EOTemporaryGlobalIDs can be safely passed between processes and machines while still preserving global uniqueness. The returned byte string has the format:
     * Sequence [2], ProcessID [2] , Time [4], IP Addr [4]
     */
    public EOTemporaryGlobalID(){
         //TODO codavaj!!
    }

    /**
     * Creates and returns an EOTemporaryGlobalID as a unique instance. It uses ,as input, an array of bytes in order to create this unique global ID.
     * Parameters:globallyUniqueBytes - an array of bytes describing a unique id
     */
    protected EOTemporaryGlobalID(byte[] globallyUniqueBytes){
         //TODO codavaj!!
    }

    /**
     * Assigns to uniqueBytes an array of bytes that represent a byte string that's guaranteed to be unique network wide. The size of the uniqueBytes array should be at least the value of UniqueBinaryKeyLength constant. The returned byte string has the format:
     * Sequence [2], ProcessID [2] , Time [4], IP Addr [4]
     */
    public static void assignGloballyUniqueBytes(byte[] uniqueBytes){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Allows the receiver, before being encoded, to substitute a class other than its own in a coder. For example, private subclasses can substitute the name of a public superclass when being encoded.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Encodes the receiver using coder. Object type information along with an object's data is stored.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Compares the receiver to object. If the contents of object are equal to the contents of the receiver, this method returns true. If not, it returns false. Two data objects are equal if they hold the same number of bytes, if both have the same hash code and if the bytes at the same position in the objects are the same.
     */
    public boolean equals(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Provides an appropriate hash code useful for storing the receiver in a hash-based data structure.
     */
    public int hashCode(){
        return 0; //TODO codavaj!!
    }

    /**
     * Used to find out if the the globalID is temporary or not. This method implementation returns true.
     */
    public boolean isTemporary(){
        return false; //TODO codavaj!!
    }

    /**
     * String represntation of an EOTemporaryGlobalID.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
