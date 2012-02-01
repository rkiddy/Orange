package com.webobjects.eocontrol;
/**
 * EOKeyValueArchiver objects are used to archive a graph of objects into a "property list" with a key-value mechanism. To (re)create the object graph, EOKeyValueUnarchiver objects are used. A typical way to use EOKeyValueArchiver/EOKeyValueUnarchiver is:
 * Afterwards, to recreate the object graph:
 * See Also:EOKeyValueUnarchiver, EOKeyValueArchiving
 */
public class EOKeyValueArchiver{
    /**
     * Creates a new EOKeyValueArchiver.
     */
    public EOKeyValueArchiver(){
         //TODO codavaj!!
    }

    /**
     * Returns the receiver's delegate.
     */
    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the property list which represents the object archive.
     */
    public com.webobjects.foundation.NSDictionary dictionary(){
        return null; //TODO codavaj!!
    }

    /**
     * Archives the boolean value under the key key.
     */
    public void encodeBool(boolean value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Archives the integer value under the key key.
     */
    public void encodeInt(int value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Archives the object object in place under the key key. The object either needs to be an instance of the NSArray or NSDictionary class, implement the EOKeyValueArchiving interface, or have a Support object registered with EOKeyValueArchiving. For objects that implement EOKeyValueArchiving, this method calls object with encodeWithKeyValueArchiver.
     */
    public void encodeObject(java.lang.Object object, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Archives the object object with a special reference (placeholder) under the key key. The reference object is determined by asking the receiver's delegate with the referenceToEncodeForObject method.
     */
    public void encodeReferenceToObject(java.lang.Object object, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's delegate.
     */
    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * The EOKeyValueArchiver.Delegate interface defines methods which can be used by a delegate object of an EOKeyValueArchiver to control the behavior of the archiver object.
     */
    public static interface Delegate{
        /**
         * A delegate of an EOKeyValueArchiver can implement this method to encode references if any of the objects it encodes call encodeReferenceToObject. The delegate should return a placeholder object (perhaps a String) to encode in place of the referenced object.
         */
        abstract java.lang.Object referenceToEncodeForObject(com.webobjects.eocontrol.EOKeyValueArchiver archiver, java.lang.Object object);

    }
}
