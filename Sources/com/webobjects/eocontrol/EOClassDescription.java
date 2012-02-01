package com.webobjects.eocontrol;
/**
 * EOClassDescription provides a mechanism for extending classes with additional meta-data useful for interacting with Enterprise Objects. It also allows this meta-information to be registered at runtime by an external source (e.g. an EOEntity). In effect, the EOClassDescription allows EOF to add useful behavior to your by EOs using information specified for the EO in the EOModel file.
 * For example, the Java runtime allows the list of methods and instance variables for a class to be queried ("introspected") at runtime (this is what makes possible the EOKeyValueCoding interface). However, it does not provide information on whether the property of an object is an attribute or relationship, nor whether that relationship points to one or to many objects -- this information is not available in the source code, but it is available in the EOModel (in EOAccess). Note, though, that although the EOModel is the most common source of an EOClassDescription for a class, it is not the only one. Objects that don't have a model can implement methods like relationshipKeys and attributeKeys directly as instance methods, and the rest of the Framework can treat them identically to EOs that have this information provided by an external model.
 * For more information on EOClassDescription, refer to:
 * See Also:EOClassDescription.ClassDescriptionNeededForClassNotification, EOClassDescription.ClassDescriptionNeededForEntityNameNotification, EOEntity, EOClassDescription.ClassDelegate.shouldPropagateDeleteForObject(com.webobjects.eocontrol.EOEnterpriseObject, com.webobjects.eocontrol.EOEditingContext, java.lang.String), Serialized Form
 */
public abstract class EOClassDescription implements java.io.Serializable{
    /**
     * Used to extend the behavior of Enterprise Objects in classDescription. The first time an Enterprise Object receives a classDescription message (for example, when changes to the object are being saved to the database), it posts ClassDescriptionNeededForClassNotification to notify observers that a class description is needed. An individual observer then locates the appropriate class description and registers it in the application. By default, EOModel objects are registered as observers for this notification and register EOClassDescriptions on demand.
     * See Also:EOEnterpriseObject.classDescription(), Constant Field Values
     */
    public static final java.lang.String ClassDescriptionNeededForClassNotification="EOClassDescriptionNeededNotification";

    /**
     * When classDescriptionForEntityName is invoked for a previously unregistered entity name, this notification is broadcast with the requested entity name as the object of the notification. By default, EOModel objects are registered as observers for this notification and register EOClassDescriptions on demand. Subscribers can call registerClassDescription() to register the class description.
     * See Also:EOClassDescription.classDescriptionForEntityName(String entityName), Constant Field Values
     */
    public static final java.lang.String ClassDescriptionNeededForEntityNameNotification="EOClassDescriptionNeededForEntityNameNotification";

    /**
     * Delete destination objects when the source object is deleted.
     * See Also:Constant Field Values
     */
    public static final int DeleteRuleCascade=1;

    /**
     * Refuse delete operation if the source object has any destination objects.
     * See Also:Constant Field Values
     */
    public static final int DeleteRuleDeny=2;

    /**
     * When the source object is deleted, its relationship to destination objects is ignored.
     * This rule is useful in performance tuning. You should however, use this with caution since it can result in dangling references in the object graph.
     * See Also:Constant Field Values
     */
    public static final int DeleteRuleNoAction=3;

    /**
     * When the source object is deleted, any destination object's references back to it are set to null. For example, suppose a department has a relationship to multiple employees. When the department is deleted, any references an employee has to the department are set to null.
     * See Also:Constant Field Values
     */
    public static final int DeleteRuleNullify=0;

    public EOClassDescription(){
         //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return an array of attribute keys for objects described by the receiver.Attributes contain immutable data (such as Numbers and Strings), as opposed to relationships that are references to other enterprise objects.
     */
    public com.webobjects.foundation.NSArray attributeKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to perform standard post fetch initialization for object in editingContext. The default implementation simply returns.
     */
    public void awakeObjectFromFetch(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    /**
     * Assigns empty arrays to to many relationship properties of newly inserted enterprise objects. Subclasses can override this to propagate inserts for the newly inserted object in anEditingContext. More specifically, if object has a relationship, or relationships, that propagates the object's primary key and if no object yet exists at the destination of that relationship, subclasses should create the new object at the destination of the relationship. This method is used to put default values in the enterprise object.
     */
    public void awakeObjectFromInsertion(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    public static java.lang.Object classDelegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked by the default implementations of the EOEnterpriseObject interface method classDescription. It's generally not safe to use this method directly since individual EOGenericRecord instances can have different class descriptions. If a class description for aClass isn't found, this method posts a ClassDescriptionNeededForClassNotification on behalf of the receiver's class, allowing an observer to register a an EOClassDescription.
     */
    public static com.webobjects.eocontrol.EOClassDescription classDescriptionForClass(java.lang.Class aClass){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return the class description for objects at the destination of the to-one relationship identified by detailKey. For example, the statement:
     * blockquote
     * movie.classDescriptionForDestinationKey(studio)
     * /blockquote
     * might return the class description for the Studio class. The default implementation of this method returns null.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForDestinationKey(java.lang.String detailKey){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the EOClassDescription registered under entityName.
     */
    public static com.webobjects.eocontrol.EOClassDescription classDescriptionForEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOClassDescription classDescriptionForKeyPath(java.lang.String key){
        return null; //TODO codavaj!!
    }

    public java.lang.Class classForAttributeKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Enables you to find attributes names that are bound to the client-side class that corresponds to the receiver's entity.
     */
    public com.webobjects.foundation.NSArray clientAttributeKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Used to determine the to many relationships that are bound to the client side class that corresponds to the receiver's entity.
     */
    public com.webobjects.foundation.NSArray clientToManyRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Used to determine the to-one relationships that are bound to the client side class that corresponds to the receiver's entity.
     */
    public com.webobjects.foundation.NSArray clientToOneRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to create an object of the appropriate class in editingContext with globalID. In typical usage, both of the method's arguments are null. To create the object, the subclass should pass anEditingContext itself, and globalID to the appropriate constructor. Enterprise Objects Framework uses this method to create new instances of objects when fetching existing enterprise objects or inserting new ones in an interface layer EODisplayGroup. EOClassDescription's implementation of this method returns null.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject createInstanceWithEditingContext(com.webobjects.eocontrol.EOEditingContext editingContext, com.webobjects.eocontrol.EOGlobalID globalID){
        return null; //TODO codavaj!!
    }

    /**
     * The EOAccess layer's EOEntityClassDescription's implementation returns a Format based on the Java value class specified for key in the associated model file. Code that creates a user interface, like an assistant, can use this method to assign formatters to user interface elements. The default implementation of this method returns null.
     */
    public java.text.Format defaultFormatterForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Similar to defaultFormatterForKey, except this method traverses keyPath before returning the formatter for the key at the end of the path.
     */
    public java.text.Format defaultFormatterForKeyPath(java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return a delete rule indicating how to treat the destination of the given relationship when the receiving object is deleted. For example, an Invoice might return DeleteRuleCascade for the relationship "lineItems" (when an invoice is removed from an external store, its line items should be as well).The delete rule is one of: DeleteRuleCascade DeleteRuleDeny DeleteRuleNullify DeleteRuleNoAction EOClassDescription's implementation of this method returns the delete rule EODeleteRuleNullify. In the common case, the delete rule for an enterprise object is defined in its EOModel. (The EOModel class is defined in the EOAccess layer.)
     */
    public int deleteRuleForRelationshipKey(java.lang.String relationshipKey){
        return 0; //TODO codavaj!!
    }

    /**
     * Provides a means to display a key in the user interface. By convention, lowercase words are capitalized (for example, "revenue" becomes "Revenue"), and spaces are inserted into words with mixed case (for example, "first Name" becomes "First Name"). This method is useful if a user interface is created from only a class description, such as with an assistant or a Direct To Web application.
     */
    public java.lang.String displayNameForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to obtain a unique type name for objects of this class. For example, the EOAccess layer's EOEntityClassDescription returns its EOEntity's name. The default implementation returns null.
     */
    public java.lang.String entityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to obtain the fetch specification associated with name. For example, the EOAccess layer's EOEntityClassDescription returns the fetch specification in its EOEntity named name. The default implementation of this method returns null.
     */
    public com.webobjects.eocontrol.EOFetchSpecification fetchSpecificationNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    public void finalize() throws java.lang.Throwable{
        return; //TODO codavaj!!
    }

    /**
     * Flushes the EOClassDescription cache. Because the EOModel objects in an application supply and register EOClassDescriptions on demand, the cache continues to be repopulated as needed after it is invalidated. This method would be used when a provider of EOClassDescriptions (such as an EOModel) has newly become available, or is about to go away. You should rarely need to directly invoke this method unless an external source of information other than an EOModel is used.
     */
    public static void invalidateClassDescriptionCache(){
        return; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to obtain the name of the relationship back to the receiver from the destination of the relationship specified with relationshipKey. For example, suppose an Employee object has a relationship called department to a Department object, and Department has a relationship called employees back to Employee. The statement:
     * blockquote
     * employee.inverseForRelationshipKey(department);
     * /blockquote
     * returns the string "employees"(such that this employee would appear in employee.valueForKey("department").valueForKey("employees")).
     */
    public java.lang.String inverseForRelationshipKey(java.lang.String relationshipKey){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return whether the receiver can be modified. Returns true if the receiver can not be modified, false if it can. If an entity is read-only, then Enterprise Objects fetched for that entity are also read-only (that is, can not be inserted, deleted, or updated). The default implementation returns false.
     */
    public boolean isEntityReadOnly(){
        return false; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to determine whether the objects at the destination of the relationship specified by relationshipKey should be deleted if they are removed from the relationship. The alternative is that they would be transferred to the corresponding relationship of another object. For example, an Invoice object owns its line items. If a LineItem object is removed from an Invoice it should be deleted since it can't exist outside of an Invoice.
     */
    public boolean ownsDestinationObjectsForRelationshipKey(java.lang.String relationshipKey){
        return false; //TODO codavaj!!
    }

    /**
     * Propagates a delete operation for an object in an EditingContext, according to the delete rules specified in the EOModel. This method is invoked whenever a delete operation needs to be propagated. This is indicated by the delete rule specified in the corresponding EOEntity's relationship key.
     */
    public void propagateDeleteForObject(com.webobjects.eocontrol.EOEnterpriseObject obj, com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    /**
     * Registers an EOClassDescription object for a class in the EOClassDescription cache. You should rarely need to directly invoke this method unless an external source of information other than an EOModel is being used.
     */
    public static void registerClassDescription(com.webobjects.eocontrol.EOClassDescription description, java.lang.Class aClass){
        return; //TODO codavaj!!
    }

    /**
     * Sets the delegate for the entire EOClassDescription class. You can assign a delegate to the EOClassDescription class. EOClassDescription then sends the message to this delegate when delete propagation is about to take place for a particular object. The delegate can either allow or deny the operation for a specified relationship key.
     */
    public static void setClassDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return a super class's class description. The default implementation returns null.
     */
    public com.webobjects.eocontrol.EOClassDescription superClassDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to determine the to-many relationship properties of the receiver. To-many relationship properties contain arrays of Enterprise Objects.
     */
    public com.webobjects.foundation.NSArray toManyRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to determine the to-one relationship properties of the receiver. To-one relationship properties are other Enterprise Objects.
     */
    public com.webobjects.foundation.NSArray toOneRelationshipKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String representation of the receiver, including its class name, the name of the entity it describes, and attribute keys and all relationship keys of that entity.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a short (no longer than 60 characters) description of an EOEnterpriseObject based on its data. This method enumerates the EOEnterpriseObject's attributeKeys and returns each attribute's value, separated by commas. The default formatter is applied for numbers and dates.
     */
    public java.lang.String userPresentableDescriptionForObject(com.webobjects.eocontrol.EOEnterpriseObject eo){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to determine whether it's permissible to delete an object. Subclasses should complete normally if the delete operation should proceed, or throw an exception containing a user presentable (localized) error message if not.
     */
    public void validateObjectForDelete(com.webobjects.eocontrol.EOEnterpriseObject object) throws com.webobjects.foundation.NSValidation.ValidationException{
        return; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to determine whether the values being saved for an object are acceptable. Subclasses should complete normally if the values are acceptable and the save operation should proceed. Otherwise they should throw an exception containing a user presentable (localized) error message.
     */
    public void validateObjectForSave(com.webobjects.eocontrol.EOEnterpriseObject object) throws com.webobjects.foundation.NSValidation.ValidationException{
        return; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to validate a value. Subclasses should return null if the value is acceptable, or throw an exception containing a user presentable (localized) error message if not. Implementations can replace value by returning a new value.
     */
    public java.lang.Object validateValueForKey(java.lang.Object value, java.lang.String key) throws com.webobjects.foundation.NSValidation.ValidationException{
        return null; //TODO codavaj!!
    }

    /**
     * The ClassDelegate interface defines a method that the EOClassDescription class can invoke in its delegate. Delegates are not required to provide an implementation for the method, and the implements keyword does not have to be used to specify that the object implements the ClassDelegate interface. The method does need to be declared and implemented if it is needed. The EOClassDescription method setClassDelegate method is used to assign the object as the class delegate. EOClassDescription only attempts to invoke the method if it's actually implemented.
     * See Also:EOClassDescription.setClassDelegate(Object delegate)
     */
    public static interface ClassDelegate{
        /**
         * Invoked from propagateDeleteForObject. If the class delegate returns false, it prevents object in ec from propagating deletion to the objects at the destination of key. This method should be used with caution since however, returning false and not propagating deletion can lead to dangling references in the object graph.
         */
        abstract boolean shouldPropagateDeleteForObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.eocontrol.EOEditingContext ec, java.lang.String key);

    }
}
