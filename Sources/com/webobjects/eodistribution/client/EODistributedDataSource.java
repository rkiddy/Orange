package com.webobjects.eodistribution.client;
/**
 * EODistributedDataSource is a concrete subclass of EODataSource (defined in the control layer) that fetches using an EOEditingContext as its source of objects. The editing context, in turn, forwards the fetch requests to its parent object store (usually an instance of EODistributedObjectStore) where it is ultimately serviced by an EODatabaseContext on the server.
 * EODistributedDataSource implements all the functionality defined by EODataSource: In addition to fetching objects, it can insert and delete them (provided the entity isn't read-only). See the EODataSource class specification for more information on these topics.
 * EODistributedDataSource provides several methods in addition to those defined by EODataSource. The additional methods (fetchEnabled and setFetchEnabled, fetchSpecification and setFetchSpecification, and setAuxiliaryQualifier) are added to support enabling and disabling fetching and to support fetching with an EOFetchSpecification.
 */
public class EODistributedDataSource extends com.webobjects.eocontrol.EODataSource{
    /**
     * Creates a new EODistributedDataSource for the entity identified by entityName. If editingContext is provided, the new data source uses it as its source of objects and fetching is enabled. If it isn't provided, you must assign one with the setEditingContext method; until you do, fetching is disabled.
     * Parameters:editingContext - the editing context of the data sourceentityName - the name of the entity this data source handles
     */
    public EODistributedDataSource(com.webobjects.eocontrol.EOEditingContext editingContext, java.lang.String entityName){
         //TODO codavaj!!
    }

    /**
     * Creates a new EODistributedDataSource for the entity identified by entityName. If editingContext is provided, the new data source uses it as its source of objects and fetching is enabled. If it isn't provided, you must assign one with the setEditingContext method; until you do, fetching is disabled. This constructor also allows you to designate a fetch specification to be used by the initialized instance.
     * Parameters:editingContext - the editing context of the data sourceentityName - the name of the entity this data source handlesfetchSpecificationName - the name of a fetch specification for the specified entity
     */
    public EODistributedDataSource(com.webobjects.eocontrol.EOEditingContext editingContext, java.lang.String entityName, java.lang.String fetchSpecificationName){
         //TODO codavaj!!
    }

    /**
     * Creates a new EODistributedDataSource for the entity identified by entityName.
     * Parameters:entityName - the name of the entity this data source handles
     */
    public EODistributedDataSource(java.lang.String entityName){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Implemented by subclasses to return an EOClassDescription that provides information about the objects provided by the receiver.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Implemented by subclasses to provide the destination objects of a relationship. The detail EODataSource can be qualified using qualifyWithRelationshipKey to set a specific master object or to change the relationship key.
     */
    public com.webobjects.eocontrol.EODataSource dataSourceQualifiedByKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Implemented by subclasses to delete an object. EODataSource's implementation merely throws an exception. Subclasses shouldn't invoke the superclass's implementation.
     */
    public void deleteObject(java.lang.Object eo){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Implemented by subclasses to return the receiver's EOEditingContext.
     */
    public com.webobjects.eocontrol.EOEditingContext editingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether fetching is enabled.
     */
    public boolean fetchEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * If fetching is enabled, fetches and returns objects with the receiver's fetch specification; returns null otherwise.
     */
    public com.webobjects.foundation.NSArray fetchObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's fetch specification (which by default fetches all the objects for the receiver's entity unless it is further restricted with setFetchSpecification or setAuxiliaryQualifier).
     */
    public com.webobjects.eocontrol.EOFetchSpecification fetchSpecification(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Implemented by subclasses to insert objects.
     */
    public void insertObject(java.lang.Object eo){
        return; //TODO codavaj!!
    }

    /**
     * Displays destination objects for the relationship named key belonging to the source object sourceObject (owner of the relationship). key should be the same as the key specified in the dataSourceQualifiedByKey method. If sourceObject is null, no objects are provided. If the relationship named by key can't be found, an IllegalStateException is thrown. The source object must be an EOEnterpriseObject.
     */
    public void qualifyWithRelationshipKey(java.lang.String key, java.lang.Object sourceObject){
        return; //TODO codavaj!!
    }

    /**
     * Assigns qualifier as an auxiliary qualifier to the receiver's fetch specification. This qualifier is combined with the qualifier with the fetch specification with an AND operation.
     */
    public void setAuxiliaryQualifier(com.webobjects.eocontrol.EOQualifier qualifier){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's editing context. If editingContext is null, fetching is disabled.
     */
    public void setEditingContext(com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether or not fetching is enabled in the receiver.
     */
    public void setFetchEnabled(boolean fetchEnabled){
        return; //TODO codavaj!!
    }

    /**
     * Assigns fetchSpecification to the receiver as the fetch specification to use when fetching objects.
     */
    public void setFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification){
        return; //TODO codavaj!!
    }

    public void setFetchSpecificationName(java.lang.String name){
        return; //TODO codavaj!!
    }

}
