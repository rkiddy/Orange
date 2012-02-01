package com.webobjects.eoaccess;
/**
 * EODatabaseDataSource is a concrete subclass of EODataSource, defined in EOControl. EODatabaseDataSource fetches objects based on an EOModel, using an EODatabaseContext that services the data source's EOEditingContext. An EODatabaseDataSource can be set up to fetch all objects for its root entity or to fetch objects matching a particular EOFetchSpecification, and to further filter its fetching with an auxiliary qualifier.
 * EODatabaseDataSource implements all the functionality defined by EODataSource. In addition to fetching objects, it can insert and delete them (provided the entity isn't read-only). As with other data sources, EODatabaseDataSource can also provide a detail data source.
 * See Also:EODataSource, EODetailDataSource, Serialized Form
 */
public class EODatabaseDataSource extends com.webobjects.eocontrol.EODataSource implements java.io.Serializable, com.webobjects.eocontrol.EOKeyValueArchiving, com.webobjects.eocontrol.EOKeyValueArchiving.Awaking, com.webobjects.foundation.NSCoding{
    /**
     * Constructs a new EODatabaseDataSource to fetch all objects for the EOEntity specified by anEntityName into anEditingContext . Finds the EOObjectStoreCoordinator for anEditingContext and searches for a channel that services the model of the entity. If one exists, the EODatabaseDataSource uses it. Otherwise, a new one is created for this EODatabaseDataSource.
     * Parameters:anEditingContext - The EOEditingContext into which to fetch objects.anEntityName - The EOEntity for this data source.
     */
    public EODatabaseDataSource(com.webobjects.eocontrol.EOEditingContext anEditingContext, java.lang.String anEntityName){
         //TODO codavaj!!
    }

    /**
     * Constructs a new EODatabaseDataSource to fetch objects into anEditingContext for the EOEntity specified by anEntityName using the fetch specification fetchSpecificationName. Finds the EOObjectStoreCoordinator for anEditingContext and searches for a channel that services the model of the entity. If one exists, the EODatabaseDataSource uses it. Otherwise, a new one is created for this EODatabaseDataSource.
     * fetchSpecificationName is used to find the fetch specification in the entity. If fetchSpecificationName is null, a new fetch specification is instantiated that will fetch all objects of the entity.
     * Parameters:anEditingContext - The EOEditingContext into which to fetch objects.anEntityName - The EOEntity for this data source.fetchSpecificationName - The criteria to select and order a group of database records, or null.
     */
    public EODatabaseDataSource(com.webobjects.eocontrol.EOEditingContext anEditingContext, java.lang.String anEntityName, java.lang.String fetchSpecificationName){
         //TODO codavaj!!
    }

    /**
     * Returns the auxiliary EOQualifier used to further restrict the fetch criteria defined by the receiver's EOFetchSpecification.
     */
    public com.webobjects.eocontrol.EOQualifier auxiliaryQualifier(){
        return null; //TODO codavaj!!
    }

    /**
     * Finishes initialization of a data source unarchived from EOKeyValueArchiving. For conformance to EOKeyValueArchiving.Awaking.
     */
    public void awakeFromKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return; //TODO codavaj!!
    }

    /**
     * Finishes initialization of a data source from a nib file.
     */
    public void awakeFromNib(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the class description for the root entity of the receiver.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSCoding.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Creates a new object, inserts it in the receiver's collection of objects if appropriate, and returns the object. Returns null if the receiver can't create the object or can't insert it. You should invoke insertObject after this method to actually add the new object to the receiver.
     * As a convenience, EODataSource's implementation sends the receiver's EOClassDescription a createInstanceWithEditingContext message to create the object. If this succeeds and the receiver has an EOEditingContext, it sends the EOEditingContext an insertObject message to register the new object with the EOEditingContext (note that this does not insert the object into the EODataSource). Subclasses that don't use EOClassDescriptions or EOEditingContexts should override this method without invoking the superclass's implementation.
     */
    public java.lang.Object createObject(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EODatabaseContext that is used to access the external database. This is either the root EOObjectStore for the editing context, or, if the root is an EOCooperatingObjectStore, it is the database context under that cooperating object store that services the EOModel containing the root EOEntity for this data source.
     */
    public com.webobjects.eoaccess.EODatabaseContext databaseContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a detail data source that provides the destination objects of the relationship named by key. The returned detail data source can be qualified by using qualifyWithRelationshipKey to set a specific master object or to change the relationship key.
     */
    public com.webobjects.eocontrol.EODataSource dataSourceQualifiedByKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Decodes and returns an EODatabaseDataSource using coder. For NSCoding conformance.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to EOKeyValueArchiving.
     */
    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Deletes object from the data source. If the receiver registers undos for the deletion, the receiver may receive a redundant insertObject call.
     */
    public void deleteObject(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Returns the EOEditingContext into which objects from this data source are fetched.
     */
    public com.webobjects.eocontrol.EOEditingContext editingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSCoding.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to EOKeyValueArchiving.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * Returns the root entity of the receiver. The objects this data source supplies are fetched for this entity.
     */
    public com.webobjects.eoaccess.EOEntity entity(){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches and returns an array of objects using the fetch specification and editing context associated with this datasource. Returns an NSArray.EmptyArray if fetching is not enabled; returns null if the receiver's fetch specification is null.
     */
    public com.webobjects.foundation.NSArray fetchObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's EOFetchSpecification or null if no fetch specification is set. The fetch specification for a data source can be set with either setFetchSpecification or setFetchSpecificationByName.
     */
    public com.webobjects.eocontrol.EOFetchSpecification fetchSpecification(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a copy of the effective fetch specification, which is the union of the primary fetch specification and the auxiliary qualifier. Modifying the returned fetch specification will not affect a subsequent call to fetchObjects. To permanently modify fetching behavior, use setFetchSpecification and/or setAuxiliaryQualifier to change the receiver's fetch specification and auxiliary qualifier.
     */
    public com.webobjects.eocontrol.EOFetchSpecification fetchSpecificationForFetch(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the receiver's fetch specification or null if the data source is not using a named fetch specification.
     */
    public java.lang.String fetchSpecificationName(){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation does nothing.
     */
    public void insertObject(java.lang.Object object){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if fetching is enabled, false otherwise. Fetching is typically disabled in a master-peer configuration whenno object is selected in the master.
     */
    public boolean isFetchEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an array of strings which is a union of the binding keys from the fetch specification's qualifier and the data source's auxiliary qualifier, or NSArray.EmptyArray if there are no bindings.
     */
    public com.webobjects.foundation.NSArray qualifierBindingKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary of bindings to be used for variable replacement on the fetch specification's qualifier and the auxiliary qualifier before the fetch is executed.
     */
    public com.webobjects.foundation.NSDictionary qualifierBindings(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the primary qualifier for the fetch specification for the relationship named key owned by the enterprise object sourceObject. Throws an exception if:
     * unable to find the source entity for sourceObject the source entity for sourceObject has no relationship named key unable to construct a qualifier for the relationship named key
     */
    public void qualifyWithRelationshipKey(java.lang.String key, java.lang.Object sourceObject){
        return; //TODO codavaj!!
    }

    /**
     * Sets the auxiliary qualifier to newQualifier. The auxiliary qualifier usually adds restricting conditions to the primary qualifier and is useful for narrowing the scope of a data source without altering its primary qualifier. This is especially useful for setting a qualifier on a qualified peer data source, since a peer's primary qualifier specifies the matching criteria for the relationship for which it fetches.
     */
    public void setAuxiliaryQualifier(com.webobjects.eocontrol.EOQualifier newQualifier){
        return; //TODO codavaj!!
    }

    /**
     * Used internally. You never need to invoke this method.
     */
    public void setEditingContext(com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Controls whether objects can be fetched by the receiver. If yn is true, the method fetchObjects fetches objects from the external data source when invoked. If false, fetchObjects does not perform a fetch and returns an empty array.
     * Fetching is typically disabled when the data source is acting as a peer in a master-peer configuration and the master does not have an object selected. For example, EODatabaseDataSource's implementation of qualifyWithRelationshipKey invokes this method to enable or disable fetching based on whether a master object is provided.
     */
    public void setFetchEnabled(boolean yn){
        return; //TODO codavaj!!
    }

    /**
     * Sets the fetch specification used when supplying objects to fetchSpec. The primary EOQualifier is conjoined with the auxiliary EOQualifier when objects are fetched. This method also sets the fetchSpecificationName to null. To use a named fetch specification from an entity, invoke setFetchSpecificationByName.
     */
    public void setFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpec){
        return; //TODO codavaj!!
    }

    /**
     * Retrieves the fetch specification identified by fetchSpecificationName from the root EOEntity for the receiver and sets it as the receiver's fetch specification. Sets the receiver's fetch specification name to fetchSpecificationName. Throws an exception if unable to retrieve the named fetch specification from the root entity.
     */
    public void setFetchSpecificationByName(java.lang.String fetchSpecificationName){
        return; //TODO codavaj!!
    }

    /**
     * Called from Interface Builder to reset the parent entity. You should never invoke this method yourself.
     */
    public void setParentDataSourceRelationshipKey(com.webobjects.eocontrol.EODataSource parent, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Sets a dictionary of bindings to be used for variable replacement on the fetch specification's qualifier and the auxiliary qualifier before the fetch is executed.
     */
    public void setQualifierBindings(com.webobjects.foundation.NSDictionary bindings){
        return; //TODO codavaj!!
    }

}
