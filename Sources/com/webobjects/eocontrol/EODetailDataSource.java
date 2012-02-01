package com.webobjects.eocontrol;
/**
 * EODetailDataSource defines a data source for use in master-detail configurations, where operations in the detail data source are applied directly to properties of a master object. EODetailDataSource implements the standard fetchObjects, insertObject, and deleteObject methods to operate on a relationship property of its master object. It works for any concrete subclass of EODataSource, including another EODetailDataSource in a chain of master and detail data sources.
 * To set up an EODetailDataSource programmatically, you can typically create it by sending a dataSourceQualifiedByKey message to the master data source, then establish the master object with a qualifyWithRelationshipKey message. The latter method records the name of a relationship for a particular object to resolve in fetchObjects and to modify in insertObject and deleteObject. These three methods then manipulate the relationship property of the master object to perform the operations requested.
 * See Also:EODetailDataSource.fetchObjects(), EODetailDataSource.insertObject(Object anObject), EODetailDataSource.deleteObject(Object anObject), EODetailDataSource.qualifyWithRelationshipKey(String relationshipKey, Object masterObject), Serialized Form
 */
public class EODetailDataSource extends com.webobjects.eocontrol.EODataSource implements java.io.Serializable, com.webobjects.eocontrol.EOKeyValueArchiving{
    /**
     * Creates and returns a new EODetailDataSource object. The new data source's masterObject is associated with masterClassDescription, and key is assigned to the new data source's detailKey. The constructor invokes qualifyWithRelationshipKey specifying key as the relationship key and null as the object.
     * Parameters:masterClassDescription - class description for the master objectkey - keypath defining relationship on the master objectSee Also:EODetailDataSource.masterObject(), EODetailDataSource.detailKey(), EODetailDataSource.qualifyWithRelationshipKey( String relationshipKey , Object masterObject), EODetailDataSource.masterClassDescription()
     */
    public EODetailDataSource(com.webobjects.eocontrol.EOClassDescription masterClassDescription, java.lang.String key){
         //TODO codavaj!!
    }

    /**
     * Creates and returns a new EODetailDataSource object. The new data source provides destination objects for the relationship named by a key from a masterObject in masterDataSource.
     * Parameters:masterDataSource - provider of the master objectskey - the String giving the new relationshipSee Also:EODetailDataSource.masterDataSource()
     */
    public EODetailDataSource(com.webobjects.eocontrol.EODataSource masterDataSource, java.lang.String key){
         //TODO codavaj!!
    }

    /**
     * Returns the class description for the detail object if a detail key is defined, otherwise returns the master class description
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates an EODetailDataSource for key.
     */
    public com.webobjects.eocontrol.EODataSource dataSourceQualifiedByKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Provides conformance to EOKeyValueArchiving.
     */
    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Sends a removeObjectFromBothSidesOfRelationshipWithKey message to the master object using detailKey. Throws an IllegalStateException if there is no master object or no detail key set.
     */
    public void deleteObject(java.lang.Object eo){
        return; //TODO codavaj!!
    }

    /**
     * Gets the detail key of the receiver, which names the relationship for which the receiver provides objects to its master object.
     */
    public java.lang.String detailKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the editing context of the master data source, or null if there is not one
     */
    public com.webobjects.eocontrol.EOEditingContext editingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides conformance to EOKeyValueArchiving.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * Sends valueForKey (defined in the NSKeyValueCoding interface) to the master object with the receiver's detail key as the argument, constructs an array for the returned object or objects, and returns it. Returns an empty array if there's no master object, or returns an array containing the master object itself if no detail key is set.
     */
    public com.webobjects.foundation.NSArray fetchObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Sends an addObjectToBothSidesOfRelationshipWithKey message to the master object.
     */
    public void insertObject(java.lang.Object eo){
        return; //TODO codavaj!!
    }

    /**
     * Gets the EOClassDescription for the receiver's master object.
     */
    public com.webobjects.eocontrol.EOClassDescription masterClassDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the master data source for the receiver.
     */
    public com.webobjects.eocontrol.EODataSource masterDataSource(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the master object of the receiver.
     */
    public java.lang.Object masterObject(){
        return null; //TODO codavaj!!
    }

    /**
     * Configures the receiver to provide objects based on the relationship of sourceObject named by key. Relationship key can be different from the one provided to the constructor, which changes the relationship the receiver operates on. If sourceObject is null this method causes the receiver to return an empty array when sent a fetchObjects message.
     */
    public void qualifyWithRelationshipKey(java.lang.String key, java.lang.Object sourceObject){
        return; //TODO codavaj!!
    }

    /**
     * Sets the detail key of the receiver, which names the relationship for which the receiver provides objects to its master object.
     */
    public void setDetailKey(java.lang.String detailKeyPath){
        return; //TODO codavaj!!
    }

    /**
     * Assigns master as the EOClassDescription for the receiver's master object.
     */
    public void setMasterClassDescription(com.webobjects.eocontrol.EOClassDescription master){
        return; //TODO codavaj!!
    }

}
