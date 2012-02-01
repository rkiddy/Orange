package com.webobjects.eodistribution.client;
/**
 * EODistributedClassDescription is the Java Client equivalent to EOClassDescription. It contains object-level information about this class of enterprise objects, mainly the list of attributes and relationships.
 * See Also:Serialized Form
 */
public class EODistributedClassDescription extends com.webobjects.eocontrol.EOClassDescription implements com.webobjects.foundation.NSCoding{
    /**
     * The constructor for EODistributedClassDescription, usually called internally.
     * Parameters:theClass - the Class of the enterprise objects for this entity
     */
    public EODistributedClassDescription(java.lang.Class theClass){
         //TODO codavaj!!
    }

    /**
     * A constructor for EODistributedClassDescription, usually called internally.
     * Parameters:name - this parameter is ignoredtheClass - the Class of the enterprise objects for this entity
     */
    public EODistributedClassDescription(java.lang.String name, java.lang.Class theClass){
         //TODO codavaj!!
    }

    /**
     * Returns an array of keys for attributes of the receiver's enterprise objects. Attributes contain data (Numbers, Strings, etc.) rather than pointers to other enterprise objects.
     */
    public com.webobjects.foundation.NSArray attributeKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOAttribute of the given name (key).
     */
    public com.webobjects.eodistribution.client.EOAttribute attributeNamed(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Called every time an object is fetched in an editing context.
     */
    public void awakeObjectFromFetch(com.webobjects.eocontrol.EOEnterpriseObject eo, com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    /**
     * Automatically creates related objects for relationships which propagate primary keys. Can be overridden for example to supply default values to new enterprise objects.
     */
    public void awakeObjectFromInsertion(com.webobjects.eocontrol.EOEnterpriseObject target, com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    /**
     * Returns the class description for objects at the destination of the given relationship. For example, project.classDescriptionForDestinationKey("leader") might return the class description for the Employee class.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForDestinationKey(java.lang.String detailKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the Class object of which the given attribute's values are instances.
     */
    public java.lang.Class classForAttributeKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the class that will be used by NSCoders to later re-create this object.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates an enterprise object of the appropriate class.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject createInstanceWithEditingContext(com.webobjects.eocontrol.EOEditingContext ec, com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * Decodes (re-creates) an EODistributedClassDescription from the stored definitions in the coder.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a default formatter for the attribute key, based on the value class of the attribute.
     */
    public java.text.Format defaultFormatterForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the delete rule as defined in EOClassDescription, for the specified relationship. The constants EOClassDescription (in com.webobjects.eocontrol) defines are DeleteRuleNullify, DeleteRuleCascade, DeleteRuleDeny and DeleteRuleNoAction.
     */
    public int deleteRuleForRelationshipKey(java.lang.String relationshipKey){
        return 0; //TODO codavaj!!
    }

    /**
     * Encodes (stores) the defining values of this EODistributedClassDescription object into the given coder.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name for this class description. Must be unique.
     */
    public java.lang.String entityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the relationship pointing back at the receiver from the destination of the given relationship. For example, employee.inverseForRelationshipKey(eo, "department") might return "employees" (such that this employee would appear in employee->department->employees). Might return null.
     */
    public java.lang.String inverseForRelationshipKey(java.lang.String relationshipKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether or not the objects in the destination of the given relationship should be deleted if they are removed from the relationship (and not added to the corresponding relationship of another object). For example, if a LineItem is removed from an Invoice, it should be deleted.
     */
    public boolean ownsDestinationObjectsForRelationshipKey(java.lang.String relationshipKey){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the EORelationship of the given name (key).
     */
    public com.webobjects.eodistribution.client.EORelationship relationshipNamed(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether coding references should be recorded. For this class, always true. This method is part of an internally used interface.
     */
    public boolean shouldRecordCodingReferences(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an array of keys for to-many relationship properties of the receiver's enterprise objects.
     */
    public com.webobjects.foundation.NSArray toManyRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of keys for to-one relationship properties of the receiver's enterprise objects.
     */
    public com.webobjects.foundation.NSArray toOneRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Validate the value passed and return a possibly coerced value. Throws a validation exception if it cannot coerce the value.
     */
    public java.lang.Object validateValueForKey(java.lang.Object value, java.lang.String key) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

}
