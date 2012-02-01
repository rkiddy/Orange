package com.webobjects.eocontrol;
/**
 * The EOCustomObject class provides a default implementation of the EOEnterpriseObject interface. If a custom Enterprise Object class needs to be created, you can subclass EOCustomObject and inherit the framework's default implementations. Some of the methods are for subclasses to implement or override, but most are meant to be used as defined by EOCustomObject.
 * See Also:EOEnterpriseObject, Serialized Form
 */
public abstract class EOCustomObject implements com.webobjects.eocontrol.EOEnterpriseObject, com.webobjects.eocontrol.EODeferredFaulting{
    /**
     * Default constructor.
     */
    public EOCustomObject(){
         //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public EOCustomObject(com.webobjects.eocontrol.EOEditingContext editingContext, com.webobjects.eocontrol.EOClassDescription classDescription, com.webobjects.eocontrol.EOGlobalID gid){
         //TODO codavaj!!
    }

    /**
     * Sets or adds object as the destination for the receiver's relationship identified by key, and also sets or adds the receiver for object's reciprocal relationship if there is one. For a to-one relationship, object is set using takeValueForKey. For a to-many relationship, object is added using addObjectToPropertyWithKey. This method also properly handles removing this and object from their previous relationship as needed. For example, if an Employee object belongs to the Research department, invoking this method with the Maintenance department removes the Employee from the Research department as well as setting the Employee's department to Maintenance.
     */
    public void addObjectToBothSidesOfRelationshipWithKey(com.webobjects.eocontrol.EORelationshipManipulation object, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Adds to the relationship named key the object eo without setting inverse relationships. Attempts to invoke a method of the form addToKey. If the receiver doesn't have such a method, this method gets the property array using valueForKey and operates directly on that (adds the object to the array).
     */
    public void addObjectToPropertyWithKey(java.lang.Object eo, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Returns the union of the keys returned by attributeKeys, toOneRelationshipKeys, and toManyRelationshipKeys.
     */
    public com.webobjects.foundation.NSArray allPropertyKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the names of the receiver's attributes (not relationship properties). Invokes attributeKeys in the object's EOClassDescription and returns the results. You might wish to override this method to add keys for attributes not defined by the EOClassDescription. The access layer's subclass of EOClassDescription, EOEntityClassDescription, returns the names of attributes designated as class properties.
     */
    public com.webobjects.foundation.NSArray attributeKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked on a server-side enterprise object after it has been updated with changes from a client application. This method is invoked when changes to an object graph are pushed or saved from the client to the server.
     */
    public void awakeFromClientUpdate(com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to perform additional initialization on the receiver upon its being fetched from the external repository into ec. EOCustomObject's implementation merely sends an awakeObjectFromFetch to the receiver's EOClassDescription. Subclasses should invoke super's implementation before performing their own initialization.
     */
    public void awakeFromFetch(com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to perform additional initialization on the receiver upon its being inserted into ec. This is commonly used to assign default values or record the time of insertion. EOCustomObject's implementation merely sends an awakeObjectFromInsertion to the receiver's EOClassDescription. Subclasses should invoke super's implementation before performing their own initialization.
     */
    public void awakeFromInsertion(com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    /**
     * Returns true. Subclasses implement this method to return false if the key-value coding methods should never access the corresponding instance variable directly on finding no accessor method for a property.
     */
    public static boolean canAccessFieldsDirectly(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a dictionary whose keys correspond to the receiver's properties with uncommitted changes relative to snapshot, and whose values are the uncommitted values. In both snapshot and the returned dictionary, where a key represents a to-many relationship the corresponding value is a NSArray containing two other NSArrays: the first is an array of objects to be added to the relationship property, and the second is an array of objects to be removed.
     */
    public com.webobjects.foundation.NSDictionary changesFromSnapshot(com.webobjects.foundation.NSDictionary snapshot){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOClassDescription registered for the receiver's class by invoking the EOClassDescription static method classDescriptionForClass.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOClassDescription for the destination objects of the relationship identified by detailKey. EOCustomObject's implementation sends a classDescriptionForDestinationKey message to the receiver's EOClassDescription.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForDestinationKey(java.lang.String detailKey){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the faultHandler to null. This method is rarely used directly. Rather, it's invoked by an EOFaultHandler during the process of firing the fault.
     */
    public void clearFault(){
        return; //TODO codavaj!!
    }

    /**
     * Sets all of the receiver's to-one and to-many relationships to null. EOEditingContext's use this method to break cyclic references among objects when they're finalized. EOCustomObject's implementation should be sufficient for all purposes. If the enterprise object maintains references to other objects and these references are not to-one or to-many keys, then you should probably subclass this method ensure unused objects can be finalized.
     */
    public void clearProperties(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a rule indicating how to handle the destination of the receiver's relationship named by relationshipKey when the receiver is deleted. The delete rule is one of:
     * DeleteRuleNullify DeleteRuleCascade DeleteRuleDeny DeleteRuleNoAction For example, an Invoice object might return DeleteRuleNullify for the relationship named "lineItems", since when an invoice is deleted, its line items should be deleted as well.
     * EOCustomObject's implementation of this method simply sends a deleteRuleForRelationshipKey message to the receiver's EOClassDescription.
     */
    public int deleteRuleForRelationshipKey(java.lang.String relationshipKey){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the editing context that contains the receiver or null if none is set.
     */
    public com.webobjects.eocontrol.EOEditingContext editingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the receiver's entity, or null if it doesn't have one by sending an entityName message to the receiver's EOClassDescription.
     */
    public java.lang.String entityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a full description of the receiver's property values by extracting them using the key-value coding methods. An object referenced through relationships is listed with the results of an eoShallowDescription message (to avoid infinite recursion through cyclical relationships).
     */
    public java.lang.String eoDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Similar to eoDescription, but doesn't descend into relationships. eoDescription invokes this method for relationship destinations to avoid infinite recursion through cyclical relationships. EOCustomObject's implementation simply returns a String containing the receiver's class and entity names.
     */
    public java.lang.String eoShallowDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * EOF requires all EOs define equality as (this == other) To compare EOs in different EOEditingContexts, consider instead comparing their EOGlobalIDs with equals()
     */
    public final boolean equals(java.lang.Object other){
        return false; //TODO codavaj!!
    }

    /**
     * Removes the object eo from the to-many relationship named key without affecting inverse relationships, by directly modifying the property storing the to-many relationship. This method can be used from inside of methods of the form removeFromKey. The method throws an IllegalArgumentException when attempting to remove an object not contained in the relationship array.
     */
    protected void excludeObjectFromPropertyWithKey(java.lang.Object eo, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's fault handler.
     */
    public com.webobjects.eocontrol.EOFaultHandler faultHandler(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked from valueForKey when it finds no property binding for key. The default implementation throws an NSKeyValueCoding.UnknownKeyException, with the target object(TargetObjectUserInfoKey) and key(UnknownUserInfokey) in the user info. An NSKeyValueCoding.ErrorHandling class can override this method to handle the query in some other way. The method can return a value, in which case that value is returned by the corresponding valueForKey invocation.
     */
    public java.lang.Object handleQueryWithUnboundKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked from takeValueForKey when it finds no property binding for key. The default implementation throws an NSKeyValueCoding.UnknownKeyException, with the target object(TargetObjectUserInfoKey) and key(UnknownUserInfoKey) in the user info.
     */
    public void handleTakeValueForUnboundKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * This method must adhere to the contract specified in java.lang.Object.hashCode
     */
    public int hashCode(){
        return 0; //TODO codavaj!!
    }

    /**
     * Adds to the relationship named key the object eo without affecting inverse relationships, by directly modifying the property storing the to-many relationship. This method can be used from inside of methods of the form addToKey.
     */
    protected void includeObjectIntoPropertyWithKey(java.lang.Object eo, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name of the relationship pointing back to the receiver's class or entity from that named by relationshipKey, or null if there isn't one. With the access layer's EOEntity and EORelationship, for example, reciprocality is determined by the join attributes of the two EORelationships. EOCustomObject's implementation simply sends an inverseForRelationshipKey message to the receiver's EOClassDescription.
     */
    public java.lang.String inverseForRelationshipKey(java.lang.String relationshipKey){
        return null; //TODO codavaj!!
    }

    /**
     * Invokes a method on the server-side equivalent of the enterprise object. This method has the side effect that the changes from the receiver's editing context (on the client) are saved to the editing context in the server's session. Note also that none of the arguments nor the result of this invocation should be CustomObjects. If you want to pass reference to EOs, pass globalIDs. The return value of the method invocation must be cast into the expected class.
     */
    public java.lang.Object invokeRemoteMethod(java.lang.String methodName, java.lang.Class[] argumentTypes, java.lang.Object[] arguments){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the object's values haven't yet been fetched from the database.
     */
    public boolean isFault(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns true if the receiver can not be modified, false if it can. If an entity is read-only, then Enterprise Objects fetched for that entity are also read-only (that is, can not be inserted, deleted, or updated).
     */
    public boolean isReadOnly(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver has a to-many relationship identified by key, false otherwise. EOCustomObject's implementation of this method simply checks its toManyRelationshipKeys array for key.
     */
    public boolean isToManyKey(java.lang.String key){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * This methods returns an opaque object which encapsulates state private to EOF. Developers should not use or interfere with that object.
     */
    public final java.lang.Object opaqueState(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver has a relationship identified by key that owns its destination, and false otherwise. If an object owns the destination for a relationship, then when that destination object is removed from the relationship, it's automatically deleted. Ownership of a relationship thus contrasts with a delete rule, in that the first applies when the destination is removed and the second applies when the source is deleted. EOCustomObject's implementation of this method simply sends an ownsDestinationObjectsForRelationshipKey message to the receiver's EOClassDescription.
     */
    public boolean ownsDestinationObjectsForRelationshipKey(java.lang.String relationshipKey){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked on a server-side enterprise object before the values of it are distributed to a client application. You can override this method to compute client side only properties before the object is encoded.
     */
    public void prepareValuesForClient(){
        return; //TODO codavaj!!
    }

    /**
     * Deletes the destination objects of the receiver's relationships according to the delete rule for each relationship. EOCustomObject's implementation simply sends a propagateDeleteForObject message to the receiver's EOClassDescription.
     */
    public void propagateDeleteWithEditingContext(com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException{
        return null; //TODO codavaj!!
    }

    /**
     * Similar to takeValuesFromDictionary, but the changes dictionary can contain arrays for to-many relationships. A key represents a to-many relationship, the dictionary's value is an NSArray containing two other NSArrays: the first is an array of objects to be added to the relationship property, and the second is an array of objects to be removed. EOCustomObject's implementation should be sufficient for all purposes; you shouldn't have to override this method.
     */
    public void reapplyChangesFromDictionary(com.webobjects.foundation.NSDictionary changes){
        return; //TODO codavaj!!
    }

    /**
     * Removes object from the receiver's relationship identified by key, and also removes the receiver from objects's reciprocal relationship if there is one. For a to-one relationship, object is removed using takeValueForKey with null as the value. For a to-many relationship, object is removed using removeObjectFromPropertyWithKey.
     */
    public void removeObjectFromBothSidesOfRelationshipWithKey(com.webobjects.eocontrol.EORelationshipManipulation object, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Removes the object eo from the to-many relationship named key without affecting inverse relationships. Attempts to invoke a method of the form removeFromKey. If the receiver doesn't have such a method, this method gets the property array using valueForKey and removes the object if present. The method throws an IllegalArgumentException when attempting to remove an object not contained in the relationship array.
     */
    public void removeObjectFromPropertyWithKey(java.lang.Object eo, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Returns true. Subclasses implement this method to return false if the stored value methods (storedValueForKey and takeStoredValueForKey) should not use private accessor methods in preference to public accessors. Returning false causes the stored value methods to use the same accessor method instance variable search order as the corresponding basic key-value coding methods (valueForKey and takeValueForKey). This method doesn't have to be implemented if the default stored value search order is correct for the objects.
     */
    public static boolean shouldUseStoredAccessors(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a dictionary whose keys are those of the receiver's attributes, to-one relationships, and to-many relationships, and whose values are the values of those properties, with EONullValue substituted for null. For to-many relationships, the dictionary contains shallow copies of the arrays. EOCustomObject's implementation should be sufficient for all purposes; you shouldn't have to override this method.
     */
    public com.webobjects.foundation.NSDictionary snapshot(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value for the property identified by key. This method is used when the value is retrieved for storage in an object store (generally, this is ultimately in a database) or for inclusion in a snapshot. The default implementation provided by EOCustomObject is similar to the implementation of valueForKey, but it resolves key with a different method instance variable search order: Searches for a private accessor method based on key (a method preceded by an underbar). For example, with a key of "lastName", storedValueForKey looks for a method named _getLastName or _lastName. If a private accessor isn't found, searches for an instance variable based on key and returns its value directly. For example, with a key of "lastName", storedValueForKey looks for an instance variable named _lastName or lastName. If neither a private accessor or an instance variable is found, storedValueForKey searches for a public accessor method based on key. For the key "lastName", this would be getLastName or lastName. If key is unknown, storedValueForKey calls handleTakeValueForUnboundKey.
     */
    public java.lang.Object storedValueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the property identified by key to value. This method is used to initialize the receiver with values from an object store (generally, this is ultimately from a database) or to restore a value from a snapshot. The default implementation provided by EOCustomObject is similar to the implementation of takeValueForKey, but it resolves key with a different method instance variable search order: Searches for a private accessor method based on key (a method preceded by an underbar). For example, with a key of "lastName", takeStoredValueForKey looks for a method named _setLastName. If a private accessor isn't found, searches for an instance variable based on key and sets its value directly. For example, with a key of "lastName", takeStoredValueForKey looks for an instance variable named _lastName or lastName. If neither a private accessor or an instance variable is found, takeStoredValueForKey searches for a public accessor method based on key. For the key "lastName", this would be setLastName. If key is unknown, takeStoredValueForKey calls handleTakeValueForUnboundKey.
     * This different search order allows an object to bypass processing that is performed before setting a value through public API. However, if it is always wanted to use the search order in takeValueForKey, you can implement the static method shouldUseStoredAccessors to return false. And as with valueForKey, you can prevent direct access of an instance variable with the static method canAccessFieldsDirectly.
     */
    public void takeStoredValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's value for the property identified by key to value.
     * The default implementation provided by NSKeyValueCoding.DefaultImplementation works as follows:
     * Searches for a public accessor method of the form setKey, and invokes it if there is one. If a public accessor method isn't found, searches for a private accessor method of the form _setKey, and invokes it if there is one. If an accessor method isn't found and the static method canAccessFieldsDirectly returns true, searches for an instance variable based on key and sets its value directly. For the key "lastName", this would be _lastName or lastName. If neither an accessor method nor an instance variable is found, it's an error condition. It invokes handleTakeValueForUnboundKey if the object implements NSKeyValueCoding.ErrorHandling or throws NSKeyValueCoding.UnknownKeyException if the object doesn't. Note: The default implementation of NSKeyValueCoding provided by the Foundation package should always be used. The default implementations have significant performance optimizations. To benefit from them, implement NSKeyValueCoding on a custom class as shown above by using the methods in NSKeyValueCoding.DefaultImplementation; or if the class inherits from an WebObjects class that implements NSKeyValueCoding, the inherited implementation is not to be overridden. Using a custom implementation incurs significant performance penalties.
     */
    public void takeValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's property identified by keyPath to value. A key path as the form relationship.property (with one or more relationships).
     */
    public void takeValueForKeyPath(java.lang.Object value, java.lang.String keyPath){
        return; //TODO codavaj!!
    }

    /**
     * Sets properties of the receiver with values from dictionary, using its keys to identify the properties. EOCustomObject's implementation invokes takeValueForKey for each key-value pair, substituting null for EONullValues in aDictionary.
     */
    public void takeValuesFromDictionary(com.webobjects.foundation.NSDictionary dictionary){
        return; //TODO codavaj!!
    }

    /**
     * Sets properties of the receiver with values from dictionary, using its keys and mapping to identify the properties. mapping associates the keys of dictionary, which are arbitrary external names for the properties to be set, with the internal or EOModel names for those properties. If a key in dictionary does not have a corresponding entry in mapping, the external key (i.e., the key from dictionary) is used.
     * Invokes takeValueForKey for each key-value pair of dictionary, substituting null for NSKeyValueCoding.NullValue values in the dictionary.
     */
    public void takeValuesFromDictionaryWithMapping(com.webobjects.foundation.NSDictionary dictionary, com.webobjects.foundation.NSDictionary mapping){
        return; //TODO codavaj!!
    }

    /**
     * Returns the names of the receiver's to-many relationships. Invokes toManyRelationshipKeys() in the object's EOClassDescription and returns the results. You might wish to override this method to add keys for relationships not defined by the EOClassDescription, but it's rarely necessary: The access layer's subclass of EOClassDescription, EOEntityClassDescription, returns the names of to-many relationships designated as class properties.
     */
    public com.webobjects.foundation.NSArray toManyRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the names of the receiver's to-one relationships. Invokes toOneRelationshipKeys in the object's EOClassDescription and returns the results. You might wish to override this method to add keys for relationships not defined by the EOClassDescription, but it's rarely necessary: The access layer's subclass of EOClassDescription, EOEntityClassDescription, returns the names of to-one relationships designated as class properties.
     */
    public com.webobjects.foundation.NSArray toOneRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * String representation of the object. This method simply calls eoDescription.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Converts the receiver into a fault, assigning handler as the object that stores its original state and later converts the fault back into a normal object (typically by fetching data from an external repository). The receiver becomes the owner of handler; it shouldn't be assigned to another object.
     */
    public void turnIntoFault(com.webobjects.eocontrol.EOFaultHandler handler){
        return; //TODO codavaj!!
    }

    /**
     * Invoked from takeValueForKey when it's given a null value for a scalar property (such as an int or a float). The default implementation throws an IllegalArgumentException. You might want to implement the method (or override the inherited implementation) to handle the request in some other way, such as by substituting zero or a sentinel value and invoking takeValueForKey again.
     */
    public void unableToSetNullForKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Takes the values from snapshot, and sets the receiver's properties to them. EOCustomObject's implementation sets each one using takeStoredValueForKey. In the process, EONullValues are converted to null, and array values are set as shallow mutable copies.
     */
    public void updateFromSnapshot(com.webobjects.foundation.NSDictionary snapshot){
        return; //TODO codavaj!!
    }

    /**
     * Returns a short (no longer than 60 characters) description of an enterprise object based on its data by calling EOClassDescription's userPresentableDescriptionForObject method
     */
    public java.lang.String userPresentableDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to EODeferredFaulting. EOCustomObject returns false by default.
     */
    public static boolean usesDeferredFaultCreation(){
        return false; //TODO codavaj!!
    }

    /**
     * Validate whether object is in an consistent state after being updated from a client. EOCustomObject's implementation does nothing, and should be overridden if necessary.
     */
    public void validateClientUpdate() throws com.webobjects.foundation.NSValidation.ValidationException{
        return; //TODO codavaj!!
    }

    /**
     * Confirms that the receiver can be deleted in its current state, throwing an NSValidation.ValidationException if it can't. For example, an object can't be deleted if it has a relationship with a delete rule of EOClassDescription.DeleteRuleDeny and that relationship has a destination object.
     * EOCustomObject's implementation sends the receiver's EOClassDescription a message (which performs basic checking based on the presence or absence of values). Subclasses should invoke super's implementation before performing their own validation, and should combine any Exception thrown by super's implementation with their own.
     */
    public void validateForDelete() throws com.webobjects.foundation.NSValidation.ValidationException{
        return; //TODO codavaj!!
    }

    /**
     * Confirms that the receiver can be inserted in its current state, throwing an NSValidation.ValidationException if it can't. EOCustomObject's implementation simply invokes validateForSave.
     * The method validateForSave is the generic validation method for when an object is written to the external store. If an object performs validation that isn't specific to insertion, it should go in validateForSave.
     */
    public void validateForInsert() throws com.webobjects.foundation.NSValidation.ValidationException{
        return; //TODO codavaj!!
    }

    /**
     * Confirms that the receiver can be saved in its current state, throwing an NSValidation.ValidationException if it can't. EOCustomObject's implementation sends the receiver's EOClassDescription a validateObjectForSave message, then iterates through all of the receiver's properties. If this results in more than one exception, the Exception returned contains the additional ones in its userInfo dictionary under NSValidation.ValidationException.AdditionalExceptionsKey. Subclasses should invoke super's implementation before performing their own validation, and should combine any Exception thrown by super's implementation with their own.
     */
    public void validateForSave() throws com.webobjects.foundation.NSValidation.ValidationException{
        return; //TODO codavaj!!
    }

    /**
     * Confirms that the receiver can be saved in its current state, throwing a NSValidation.ValidationException if it can't. EOCustomObject's implementation simply invokes validateForSave.
     * The method validateForSave is the generic validation method for when an object is written to the external store. If an object performs validation that isn't specific to updating, it should go in validateForSave.
     */
    public void validateForUpdate() throws com.webobjects.foundation.NSValidation.ValidationException{
        return; //TODO codavaj!!
    }

    /**
     * Confirms that value is valid for the receiver's property named by keyPath, and assigns the value to the property (if value is different from the current value), or throws an NSValidation.ValidationException if value isn't valid.
     * A key path has the form relationship.property (with one or more relationships); for example "movieRole.roleName" or "movieRole.talent.lastName".
     */
    public java.lang.Object validateTakeValueForKeyPath(java.lang.Object value, java.lang.String keyPath) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

    /**
     * Validates a property indirectly by name. This method is responsible for two things: coercing the value into an appropriate type for the object, and validating it according to the object's rules. The default implementation provided by EOCustomObject consults the object's EOClassDescription to coerce the value and to check for basic errors, such as a null value when that isn't allowed. If no basic errors exist, this default implementation then validates the value according to the object itself.
     * It searches for a method of the form validateKey and invokes it if it exists. These are the methods that your custom classes can implement to validate individual properties, such as validateAge to check that the value the user entered is within acceptable limits. The validateAge method should raise an EOValidation.Exception if it finds an unacceptable value.
     */
    public java.lang.Object validateValueForKey(java.lang.Object value, java.lang.String key) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's value for the property identified by key.
     * The default implementation provided by NSKeyValueCoding.DefaultImplementation works as follows:
     * Searches for a public accessor method based on key. For example, with a key of "lastName", the method looks for a method named getLastName or lastName. If a public accessor method isn't found, searches for a private accessor method based on key (a method preceded by an underbar). For example, with a key of "lastName", the method looks for a method named _getLastName or _lastName If an accessor method isn't found and the static method canAccessFieldsDirectly returns true, the method searches for an instance variable based on key and returns its value directly. For the key "lastName", this would be _lastName or lastName. If neither an accessor method nor an instance variable is found, the method invokes handleQueryWithUnboundKey (defined in NSKeyValueCoding.ErrorHandling). Note: The default implementation of NSKeyValueCoding provided by the Foundation package should always be used. The default implementations have significant performance optimizations. To benefit from them, implement NSKeyValueCoding on a custom class as shown above by using the methods in NSKeyValueCoding.DefaultImplementation; or if the class inherits from an WebObjects class that implements NSKeyValueCoding, the inherited implementation is not to be overridden. Using a custom implementation incurs significant performance penalties.
     */
    public java.lang.Object valueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value for the derived property identified by keyPath. A key path has the form relationship.property (with one or more relationships). For example "movieRole.roleName" or "movieRole.talent.lastName". The default implementation of this method (provided by NSKeyValueCodingAdditions.DefaultImplementation) gets the destination object for each relationship using valueForKey, and returns the result of a valueForKey message to the final object.
     */
    public java.lang.Object valueForKeyPath(java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary containing the property values identified by each element in keys. EOCustomObject's implementation invokes valueForKey for each key in keys, substituting EONullValues into the NSDictionary for returned nulls.
     */
    public com.webobjects.foundation.NSDictionary valuesForKeys(com.webobjects.foundation.NSArray keys){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary containing the property values identified by each of the key-value pairs in mapping. The keys of the mapping dictionary represent arbitrary external names for properties of an Enterprise Object and the values are the internal or EOModel names for these properties. Invokes valueForKey for each value in mapping, substituting NSKeyValueCoding.NullValue in the returned dictionary for returned nulls.
     */
    public com.webobjects.foundation.NSDictionary valuesForKeysWithMapping(com.webobjects.foundation.NSDictionary mapping){
        return null; //TODO codavaj!!
    }

    /**
     * Notifies any observers that the receiver's state is about to change, by sending each an objectWillChange message. A subclass should not override this method, but should invoke it prior to altering the subclass's state, most typically in "set" methods such as the following:
     * blockquote
     * public void setRoleName(String value) { willChange(); roleName = value; }
     * /blockquote
     */
    public void willChange(){
        return; //TODO codavaj!!
    }

    /**
     * Fills the receiver with values fetched from the database. Before the application attempts to message an object, you must ensure that it has been filled with its data. To do this, enterprise objects invoke the method willRead prior to any attempt to access the object's state, most typically in "get" methods such as the following:
     * blockquote
     * public String roleName() { willRead(); return roleName; }
     * /blockquote
     * This methods locks the parent EOObjectStore of the EOEditingContext this EO is contained within for the duration of this method.
     */
    public void willRead(){
        return; //TODO codavaj!!
    }

    /**
     * Enterprise object instances that use deferred faulting invoke this method before accessing a relationship to ensure that the relationship isn't a deferred fault. EOCustomObject and EOGenericRecord's implementations check if object is a deferred fault, and create and return a regular fault if it is. This methods locks the parent EOObjectStore of the EOEditingContext this EO is contained within for the duration of this method.
     */
    public java.lang.Object willReadRelationship(java.lang.Object object){
        return null; //TODO codavaj!!
    }

}
