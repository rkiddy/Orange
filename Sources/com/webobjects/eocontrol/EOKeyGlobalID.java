package com.webobjects.eocontrol;
/**
 * EOKeyGlobalID is a concrete subclass of EOGlobalID whose instances, an entity and the primary key values for the object being identified, represent persistent IDs based on EOModel information. When creating an EOKeyGlobalID, the key values must be supplied following alphabetical order for their attribute names. EOKeyGlobalID defines the globalIDWithEntityName method for creating instances, but it's much more convenient to create instances from fetched rows using EOEntity's globalIDForRow method. (EOEntity and EOModel are defined in EOAccess.) Note that a constructor can't be used to create EOKeyGlobalIDs
 * See Also:EOKeyGlobalID.globalIDWithEntityName(String entityName, Object[] values), EOEntity.globalIDForRow(NSDictionary row), Serialized Form
 */
public abstract class EOKeyGlobalID extends com.webobjects.eocontrol.EOGlobalID implements com.webobjects.foundation.NSCoding{
    /**
     * Returns an EOKeyGlobalID object
     * Parameters:entityName - specifies name of entityhashCode - specifies hashcode
     */
    protected EOKeyGlobalID(java.lang.String entityName, int hashCode){
         //TODO codavaj!!
    }

    /**
     * Allows the receiver to substitute a class other than its own (for example, a public superclass) for use during archiving (encoding) by an NSCoder. Default is the value of the getClass method.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * (Re)creates an object based on type information and data stored in coder.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * Archives the receiver's type information and data into coder. The receiver can then be recreated using decodeObject. Custom type information can be used by overriding classForCoder.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name of the entity governing the object identified by the receiver. This is used by EODatabaseContexts (EOAccess) to identify an EOEntity (EOAccess) in methods such as faultForGlobalID.
     */
    public java.lang.String entityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an EOKeyGlobalID based on entityName and values. EOKeyGlobalIDs are more conveniently created using EOEntity's globalIDForRow method (EOAccess).
     */
    public static com.webobjects.eocontrol.EOKeyGlobalID globalIDWithEntityName(java.lang.String entityName, java.lang.Object[] values){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an integer that can be used as a hash key in a hash table structure. If two objects are equal (as determined by the equals method), they must have the same hash value.
     */
    public int hashCode(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the number of keys that form the (potentially composite) primary key of the receiver.
     */
    public abstract int keyCount();

    /**
     * Returns the keys that form the (potentially composite) primary key of the receiver.
     */
    public abstract java.lang.Object[] keyValues();

    /**
     * Returns the keys that form the (potentially composite) primary key of the receiver as an NSArray.
     */
    public com.webobjects.foundation.NSArray keyValuesArray(){
        return null; //TODO codavaj!!
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException{
        return null; //TODO codavaj!!
    }

}
