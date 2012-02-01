package com.webobjects.eoaccess;
/**
 * EOEntityClassDescription is a subclass of the control layer's EOClassDescription. The EOClassDescription class provides a mechanism for extending classes by giving them access to metadata not available in the runtime system. EOEntityClassDescription extends the behavior of Enterprise Objects by deriving information about them (such as NULL constraints and referential integrity rules) from an associated EOModel.
 * In the typical scenario in which an Enterprise Object has a corresponding model file, the first time a particular operation is performed on a class (such as validating a value), an EOClassDescriptionNeeded... notification is broadcast. This may be either an EOClassDescriptionNeededForClassNotification or an EOClassDescriptionNeededForEntityNameNotification. When an EOModel object receives this notification it registers the metadata (class description) for the EOEntity on which the Enterprise Object is based. This class description is used from that point on.
 * See Also:EOClassDescription, Serialized Form
 */
public class EOEntityClassDescription extends com.webobjects.eocontrol.EOClassDescription{
    /**
     * Creates and returns a new EOEntityClassDescription for entity.
     * Parameters:entity - An EOEntity object.See Also:EOEntityClassDescription.entity()
     */
    public EOEntityClassDescription(com.webobjects.eoaccess.EOEntity entity){
         //TODO codavaj!!
    }

    /**
     * Returns an array of the names of all the attributes of the receiver's entity.
     */
    public com.webobjects.foundation.NSArray allAttributeKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of the names of all the properties for the entity associated with the receiver. These properties include both relationships and attributes.
     */
    public com.webobjects.foundation.NSArray allPropertyKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of the names of all the to-many relationships of the receiver's entity. Returns an empty array if there are no to-many relationships.
     */
    public com.webobjects.foundation.NSArray allToManyRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of the names of all the to-one relationships of the receiver's entity. Returns an empty array if there are no to-one relationships.
     */
    public com.webobjects.foundation.NSArray allToOneRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of attribute keys for the entity associated with the receiver. Attributes contain immutable data (such as Numbers or Strings), as opposed to relationships, which are references to other Enterprise Objects.
     */
    public com.webobjects.foundation.NSArray attributeKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Propagates inserts for the newly-inserted Enterprise Object object in the editing context ec. If object has one or more relationships that propagate the primary key and if no object yet exists at the destination of those relationships, a new object is created at the destination. Use this method to put default values in the new Enterprise Object.
     */
    public void awakeObjectFromInsertion(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    /**
     * Returns the EOClassDescription for objects at the destination of the to-one relationship identified by detailKey. Throws a runtime exception if an error is encountered while resolving the relationship or its destination entity; the error text indicates the nature of the exception.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForDestinationKey(java.lang.String detailKey){
        return null; //TODO codavaj!!
    }

    public java.lang.Class classForAttributeKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the names of the attributes that are bound to the client-side class that corresponds to the receiver's entity.
     */
    public com.webobjects.foundation.NSArray clientAttributeKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the names of the to-many relationships that are bound to the client-side class that corresponds to the receiver's entity.
     */
    public com.webobjects.foundation.NSArray clientToManyRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the names of the to-one relationships that are bound to the client-side class that corresponds to the receiver's entity.
     */
    public com.webobjects.foundation.NSArray clientToOneRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns an Enterprise Object in the editing context ec by using the EOGlobalID gid to query the receiver's EOEntity for the appropriate class of object to instantiate. If the receiver's entity does not have an Enterprise Object class name set, creates and returns an EOGenericRecord object.
     * Throws an exception if the receiver's entity does have an Enterprise Object class name set and the class for the Enterprise Object identified by gid does not have a publicly accessible constructor.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject createInstanceWithEditingContext(com.webobjects.eocontrol.EOEditingContext ec, com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the formatter to use when parsing values for assignment to key. The formatter is based on the Java value class specified for key in the associated model file. Returns null if the value class is not matched.
     */
    public java.text.Format defaultFormatterForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a delete rule indicating how to treat the destination of the given relationship when the receiver's entity is deleted. The delete rule is one of: DeleteRuleCascade DeleteRuleDeny DeleteRuleNullify DeleteRuleNoAction In the common case, the delete rule for an Enterprise Object is defined in its EOModel.
     */
    public int deleteRuleForRelationshipKey(java.lang.String relationshipKey){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the entity associated with the receiver.
     */
    public com.webobjects.eoaccess.EOEntity entity(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the entity associated with the receiver.
     */
    public java.lang.String entityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the fetch specification with the specified name from the receiver's entity.
     */
    public com.webobjects.eocontrol.EOFetchSpecification fetchSpecificationNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the relationship pointing back to the receiver's entity from the destination of the relationship specified by relationshipKey. Returns null if relationshipKey can not be resolved to a valid relationship in the entity's model, or if a valid inverse relationship can not be found.
     * For example, suppose an Employee object has a relationship called department to a Department object, and Department has a relationship called employees back to Employee. Invoking inverseForRelationshipKey on an instance of Employee with the argument department will return the string employees.
     */
    public java.lang.String inverseForRelationshipKey(java.lang.String relationshipKey){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Overridden by subclasses to return whether the receiver can be modified. Returns true if the receiver can not be modified, false if it can. If an entity is read-only, then Enterprise Objects fetched for that entity are also read-only (that is, can not be inserted, deleted, or updated). The default implementation returns false.
     */
    public boolean isEntityReadOnly(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the the objects at the destination of the relationship specified by relationshipKey should be deleted if they are removed from the relationship rather than transferred to the corresponding relationship of another object. Returns false otherwise.
     * For example, an Invoice object owns its line items. If a LineItem object is removed from an Invoice, it should be deleted since it can not exist outside of an Invoice. In the common case, this behavior for an Enterprise Object is defined in its EOModel.
     */
    public boolean ownsDestinationObjectsForRelationshipKey(java.lang.String relationshipKey){
        return false; //TODO codavaj!!
    }

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns null.
     */
    public com.webobjects.eocontrol.EOClassDescription superClassDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of keys for the to-many relationship properties of the receiver's entity. To-many relationship properties contain arrays of Enterprise Objects.
     */
    public com.webobjects.foundation.NSArray toManyRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the keys for the to-one relationship properties of the receiver's entity. To-one relationships are references other Enterprise Objects.
     */
    public com.webobjects.foundation.NSArray toOneRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Determines whether it is permissible to delete object. If the delete operation can proceed, this method returns normally. If the delete operation should not proceed, an NSValidation.ValidationException is thrown. Validation for deletion will fail if the delete rule for any relationship owned by object is DeleteRuleDeny and there are related destination objects.
     */
    public void validateObjectForDelete(com.webobjects.eocontrol.EOEnterpriseObject object) throws com.webobjects.foundation.NSValidation.ValidationException{
        return; //TODO codavaj!!
    }

    /**
     * Returns null.
     */
    public java.lang.Exception validateObjectForSave(java.lang.Object object){
        return null; //TODO codavaj!!
    }

    /**
     * Validates the object valueP using the property named key. If key can be resolved to an attribute of the receiver's entity, that attribute will attempt to validate valueP. Otherwise, if key can be resolved to a relationship of the receiver's entity, that relationship will attempt to validate valueP. In either case, the validating property will return valueP unchanged if validation was successful and no conversion was required or will return the coerced value if valueP required some type of conversion and validation was successful.
     * If key is not the name of a property of the receiver's entity, valueP is returned unchanged. Throws an exception if any error occurs during validation.
     */
    public java.lang.Object validateValueForKey(java.lang.Object valueP, java.lang.String key) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

}
