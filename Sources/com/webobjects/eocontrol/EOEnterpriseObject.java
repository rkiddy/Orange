package com.webobjects.eocontrol;
/**
 * The EOEnterpriseObject interface identifies basic enterprise object behavior, defining methods for supporting operations common to all enterprise objects. Among these are methods for initializing instances, announcing changes, setting and retrieving property values, and performing validation of state. Some of these methods are for enterprise objects to implement or override, and some are meant to be used as defined by the Framework. Many methods are used internally by the Framework and are rarely invoked by application code.
 * Many of the functional areas are defined in smaller, more specialized interfaces and incorporated in the over-arching EOEnterpriseObject interface: EOKeyValueCoding defines the Enterprise Objects Framework's main data transport mechanism, in which the properties of an object are accessed indirectly by name (or "key"), rather than directly through invocation of an accessor method or as instance variables. EOKeyValueCodingAdditions defines extensions to the basic EOKeyValueCoding interface, giving access to groups of properties and to properties across relationships. EORelationshipManipulation builds on the basic EOKeyValueCoding interface to allow the modification of to-many relationship properties. EOValidation defines the way that enterprise objects validate their values. EOFaulting and EODeferredFaulting define mechanisms for postponing an object's initialization until its actually needed.
 * You rarely need to implement the EOEnterpriseObject interface from scratch. The Framework provides default implementations of the methods in EOCustomObject and EOGenericRecord. Use EOGenericRecord to represent enterprise objects that don't require custom behavior, and create subclasses of EOCustomObject to represent enterprise objects that do.
 * See EOEnterpriseObjectConcepts for more information.
 */
public interface EOEnterpriseObject extends java.io.Serializable, com.webobjects.eocontrol.EOKeyValueCodingAdditions, com.webobjects.eocontrol.EORelationshipManipulation, com.webobjects.eocontrol.EOValidation, com.webobjects.eocontrol.EODeferredFaulting{
    /**
     * Returns all of the receiver's property keys. EOCustomObject's implementation returns the union of the keys returned by attributeKeys, toOneRelationshipKeys and toManyRelationshipKeys.
     */
    abstract com.webobjects.foundation.NSArray allPropertyKeys();

    /**
     * Returns the names of the receiver's attributes (not relationship properties). EOCustomObject's implementation simply invokes attributeKeys in the object's EOClassDescription and returns the results. You might wish to override this method to add keys for attributes not defined by the EOClassDescription. The EOAccess layer's subclass of EOClassDescription, EOEntityClassDescription, returns the names of attributes designated as class properties.
     */
    abstract com.webobjects.foundation.NSArray attributeKeys();

    /**
     * Invoked on a server-side enterprise object after it has been updated with changes from a client application. This method is invoked when changes to an object graph are pushed or saved from the client to the server.
     */
    abstract void awakeFromClientUpdate(com.webobjects.eocontrol.EOEditingContext ec);

    /**
     * Overridden by subclasses to perform additional initialization on the receiver upon its being fetched from the external repository into an EOEditingContext. EOCustomObject's implementation merely sends an awakeObjectFromFetch to the receiver's EOClassDescription. Subclasses should invoke super's implementation before performing their own initialization.
     */
    abstract void awakeFromFetch(com.webobjects.eocontrol.EOEditingContext ec);

    /**
     * Overridden by subclasses to perform additional initialization on the receiver upon its being inserted into an EOEditingContext. This is commonly used to assign default values or record the time of insertion. EOCustomObject's implementation sends an awakeObjectFromInsertion to the receiver's EOClassDescription. Subclasses should invoke super's implementation before performing their own initialization.
     */
    abstract void awakeFromInsertion(com.webobjects.eocontrol.EOEditingContext ec);

    /**
     * Returns a dictionary whose keys correspond to the receiver's properties with uncommitted changes relative to snapshot, and whose values are the uncommitted values. In both snapshot and the returned dictionary, where a key represents a to-many relationship, the corresponding value is an NSArray containing two other NSArrays: the first is an array of objects to be added to the relationship property, and the second is an array of objects to be removed.
     */
    abstract com.webobjects.foundation.NSDictionary changesFromSnapshot(com.webobjects.foundation.NSDictionary snapshot);

    /**
     * Returns the EOClassDescription registered for the receiver's class. EOCustomObject's implementation invokes the static method EOClassDescription.classDescriptionForClass, for example. Refer to EOGenericRecord for more information about its implementation.
     */
    abstract com.webobjects.eocontrol.EOClassDescription classDescription();

    /**
     * Returns the EOClassDescription for the destination objects of the relationship identified by detailKey. EOCustomObject's implementation sends a classDescriptionForDestinationKey message to the receiver's EOClassDescription.
     */
    abstract com.webobjects.eocontrol.EOClassDescription classDescriptionForDestinationKey(java.lang.String detailKey);

    /**
     * Sets all of the receiver's to-one and to-many relationships to null. EOEditingContexts use this method to break cyclic references among objects when they're finalized. EOCustomObject's implementation should be sufficient for all purposes. If the enterprise object maintains references to other objects and these references are not to-one or to-many keys, then you should probably subclass this method ensure unused objects can be finalized.
     */
    abstract void clearProperties();

    /**
     * Returns a value indicating how to handle the destination of the receiver's relationship named by relationshipKey when the receiver is deleted. The delete rule is one of (all found in EOClassDescription):
     * DeleteRuleNullify DeleteRuleCascade DeleteRuleDeny DeleteRuleNoAction
     * For example, an Invoice object might return DeleteRuleNullify for the relationship named "lineItems", since when an invoice is deleted, its line items should be deleted as well.
     * EOCustomObject's implementation of this method simply sends a deleteRuleForRelationshipKey message to the receiver's EOClassDescription.
     */
    abstract int deleteRuleForRelationshipKey(java.lang.String relationshipKey);

    /**
     * Returns the EOEditingContext that holds the receiver. An editing context tracks changes made to enterprise objects and synchronizes with a backing object store (normally a database).
     */
    abstract com.webobjects.eocontrol.EOEditingContext editingContext();

    /**
     * Returns the name of the receiver's entity, or null if it does not have one. EOCustomObject's implementation simply sends an entityName message to the receiver's EOClassDescription, as does EOGenericRecord.
     */
    abstract java.lang.String entityName();

    /**
     * Returns a String that describes the receiver. EOCustomObject's implementation returns a full description of the receiver's property values by extracting them using the key value coding methods. An object referenced through relationships is listed with the results of an eoShallowDescription message (to avoid infinite recursion through cyclical relationships).
     */
    abstract java.lang.String eoDescription();

    /**
     * Similar to eoDescription, but doesn't descend into relationships. eoDescription invokes this method for relationship destinations to avoid infinite recursion through cyclical relationships. EOCustomObject's implementation simply returns a string containing the receiver's class and globalID information.
     */
    abstract java.lang.String eoShallowDescription();

    /**
     * Returns the name of the relationship pointing back to the receiver's class or entity from that named by relationshipKey, or null if there isn't one. With the access layer's EOEntity and EORelationship classes, for example, reciprocality is determined by the join attributes of the two EORelationships. EOCustomObject's implementation simply sends an inverseForRelationshipKey message to the receiver's EOClassDescription.
     * You might override this method for reciprocal relationships that aren't defined using the same join attributes. For example, if a Member object has a relationship to CreditCard based on the card number, but a CreditCard has a relationship to Member based on the Member's primary key, both classes need to override this method. This is how Member might implement it.
     * blockquote public String inverseForRelationshipKey(String relationshipKey){ if (relationshipKey.equals(creditCard)) return( member ); else return( super.inverseForRelationshipKey(relationshipKey) ); } /blockquote
     */
    abstract java.lang.String inverseForRelationshipKey(java.lang.String relationshipKey);

    /**
     * Invokes a method on the server-side equivalent of the enterprise object. This method has the side effect that the changes from the receiver's editing context (on the client) are saved to the editing context in the server's session. The return value of the method invocation must be cast into the expected class.
     */
    abstract java.lang.Object invokeRemoteMethod(java.lang.String methodName, java.lang.Class[] argumentTypes, java.lang.Object[] arguments);

    /**
     * Returns true if the receiver can not be modified, false if it can. If an entity is read-only, then Enterprise Objects fetched for that entity are also read-only (that is, can not be inserted, deleted, or updated).
     */
    abstract boolean isReadOnly();

    /**
     * Returns true if the receiver has a to-many relationship identified by key, false otherwise. EOCustomObject's implementation of this method simply checks its toManyRelationshipKeys array for key.
     */
    abstract boolean isToManyKey(java.lang.String key);

    /**
     * This methods returns an opaque object which encapsulates state private to EOF. Developers should not use or interfere with that object.
     */
    abstract java.lang.Object opaqueState();

    /**
     * Returns true if the receiver has a relationship identified by relationshipKey that owns its destination, false otherwise. If an object owns the destination for a relationship, then when that destination object is removed from the relationship, it's automatically deleted. Ownership of a relationship thus contrasts with a delete rule, in that the former applies when the destination is removed and the latter applies when the source is deleted. EOCustomObject's implementation of this method simply sends an ownsDestinationObjectsForRelationshipKey message to the receiver's EOClassDescription.
     */
    abstract boolean ownsDestinationObjectsForRelationshipKey(java.lang.String relationshipKey);

    /**
     * Invoked on a server-side enterprise object before the values of it are distributed to a client application. You can override this method to compute client side only properties before the object is encoded.
     */
    abstract void prepareValuesForClient();

    /**
     * Deletes the destination objects of the receiver's relationships according to the delete rule for each relationship. EOCustomObject's implementation simply sends a propagateDeleteForObject message to the receiver's EOClassDescription.
     */
    abstract void propagateDeleteWithEditingContext(com.webobjects.eocontrol.EOEditingContext ec);

    /**
     * Similar to takeValuesFromDictionary, but the changes dictionary can contain arrays for to-many relationships. Where a key represents a to-many relationship, the dictionary's value is an NSArray containing two other NSArrays: the first is an array of objects to be added to the relationship property, and the second is an array of objects to be removed. EOCustomObject's implementation should be sufficient for all purposes; you shouldn't have to override this method. NSKeyValueCoding.NullValue is used in the changes dictionary as a placeholder for null.
     */
    abstract void reapplyChangesFromDictionary(com.webobjects.foundation.NSDictionary changes);

    /**
     * Returns a dictionary whose keys are those of the receiver's attributes, to-one relationships, and to-many relationships, and whose values are the values of those properties, with EONullValue substituted for null. For to-many relationships, the dictionary contains shallow copies of the arrays. EOCustomObject's implementation should be sufficient for all purposes; you shouldn't have to override this method.
     */
    abstract com.webobjects.foundation.NSDictionary snapshot();

    /**
     * Returns the names of the receiver's to-many relationships. EOCustomObject's implementation simply invokes toManyRelationshipKeys in the object's EOClassDescription and returns the results. You might wish to override this method to add keys for relationships not defined by the EOClassDescription, but it's rarely necessary: the access layer's subclass of EOClassDescription, EOEntityClassDescription, returns the names of to-many relationships designated as class properties.
     */
    abstract com.webobjects.foundation.NSArray toManyRelationshipKeys();

    /**
     * Returns the names of the receiver's to-one relationships. EOCustomObject's implementation simply invokes toOneRelationshipKeys in the object's EOClassDescription and returns the results. You might wish to override this method to add keys for relationships not defined by the EOClassDescription, but it's rarely necessary: The access layer's subclass of EOClassDescription, EOEntityClassDescription, returns the names of to-one relationships designated as class properties.
     */
    abstract com.webobjects.foundation.NSArray toOneRelationshipKeys();

    /**
     * Takes the values from snapshot, and sets the receiver's properties to them. EOCustomObject's implementation sets each one using takeStoredValueForKey. In the process, EONullValues are converted to null, and array values are set as shallow mutable copies.
     */
    abstract void updateFromSnapshot(com.webobjects.foundation.NSDictionary snapshot);

    /**
     * Returns a short (no longer than 60 characters) description of an enterprise object based on its data. EOCustomObject's implementation enumerates the object's attributeKeys and returns the values of all of its properties, separated by commas (applying the default formatter for numbers and dates).
     */
    abstract java.lang.String userPresentableDescription();

    /**
     * Notifies any observers that the receiver's state is about to change, by sending each an objectWillChange message. A subclass should not override this method, but should invoke it prior to altering the subclass's state, most typically in "set" methods such as the following:
     * blockquote
     * public void setRoleName(String value){ willChange(); roleName = value; }
     * /blockquote
     */
    abstract void willChange();

}
