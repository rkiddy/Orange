package com.webobjects.eocontrol;
/**
 * EOKeyValueUnarchiver objects are used to re(create) an object graph which was archived into a "property list" with a EOKeyValueArchiver. A typical way to use EOKeyValueArchiver/EOKeyValueUnarchiver is:
 * Afterwards, to recreate the object graph:
 * See Also:EOKeyValueArchiver, EOKeyValueArchiving
 */
public class EOKeyValueUnarchiver{
    /**
     * Creates a new EOKeyValueUnarchiver to decode the property list dictionary.
     * Parameters:dictionary - the property list to be decoded
     */
    public EOKeyValueUnarchiver(com.webobjects.foundation.NSDictionary dictionary){
         //TODO codavaj!!
    }

    /**
     * Completes an unarchiving process by sending all unarchived objects which implement the EOKeyValueArchiving.Awaking interface a awakeFromKeyValueUnarchiver method. This methods needs to be invoked at the end of the unarchiving process, after invoking finishInitializationOfObjects.
     */
    public void awakeObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Unarchives a boolean that was archived under the key key.
     */
    public boolean decodeBoolForKey(java.lang.String key){
        return false; //TODO codavaj!!
    }

    /**
     * Unarchives an integer that was archived under the key key.
     */
    public int decodeIntForKey(java.lang.String key){
        return 0; //TODO codavaj!!
    }

    /**
     * Unarchives an object that was archived in place under the key key. The object to unarchive needs to be an instance of the NSArray or NSDictionary class, implement the EOKeyValueArchiving interface, or have a Support object registered with EOKeyValueArchiving.
     */
    public java.lang.Object decodeObjectForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Unarchives an object that was archived as a reference (placeholder). The object to be used instead of the placeholder is determined by asking the receiver's delegate with the unarchiverObjectForReference method.
     */
    public java.lang.Object decodeObjectReferenceForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's delegate.
     */
    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * The order that objects an unarchiver sends awakeFromKeyValueUnarchiver to the unarchived objects is not defined. However, if in its implementation of awakeFromKeyValueUnarchiver an object depends a related object already being awake, it can call ensureObjectAwake passing the related object.
     */
    public void ensureObjectAwake(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Completes an unarchiving process by sending all unarchived objects that implement the EOKeyValueArchiving.FinishInitialization interface a finishInitializationWithKeyValueUnarchiver method. This methods needs to be invoked at the end of the unarchiving process, but before invoking awakeObjects.
     */
    public void finishInitializationOfObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the parent object for the currently unarchived object. This method can be called by an object while unarchived to retrieve the parent object that is unarchiving it. For example, if an EOAttribute calls this while an EOModel is loaded from an archive, it will get its EOEntity.
     */
    public java.lang.Object parent(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the receiver's delegate.
     */
    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * The EOKeyValueUnarchiver.Delegate interface defines methods which can be used by a delegate object of an EOKeyValueUnarchiver to control the behavior of the unarchiver object.
     */
    public static interface Delegate{
        /**
         * A delegate of an EOKeyValueUnarchiver can implement this method to decode references if any of the objects it decodes call decodeObjectReferenceForKey. The delegate should return the object to be used instead of the placeholder object object.
         */
        abstract java.lang.Object unarchiverObjectForReference(com.webobjects.eocontrol.EOKeyValueUnarchiver archiver, java.lang.Object object);

    }
}
