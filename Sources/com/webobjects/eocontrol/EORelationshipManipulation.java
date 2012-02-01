package com.webobjects.eocontrol;
/**
 * The EORelationshipManipulation interface builds on the basic EOKeyValueCoding interface to allow you to modify to-many relationship properties. EOCustomObject and EOGenericRecord provide default implementations of EORelationshipManipulation, which you rarely (if ever) need to override.
 * The primitive methods addObjectToPropertyWithKey and removeObjectFromPropertyWithKey add and remove single objects from to-many relationship arrays. The two other methods in the interface, addObjectToBothSidesOfRelationshipWithKey and removeObjectFromBothSidesOfRelationshipWithKey, are implemented in terms of the two primitives to handle reciprocal relationships. These methods find the inverse relationship to the one identified by the specified key (if there is such an inverse relationship) and use addObjectToPropertyWithKey and removeObjectFromPropertyWithKey to alter both relationships, whether they're to-one or to-many.
 * The primitive methods first check for a method you might implement, addToKey or removeFromKey, invoking that method if it's implemented, otherwise using the basic key-value coding methods to do the work. Consequently, you rarely need to provide your own implementations of EORelationshipManipulation. Rather, you can provide relationship accessors (addToKey or removeFromKey) whenever you need to implement custom business logic.
 */
public interface EORelationshipManipulation{
    abstract void addObjectToBothSidesOfRelationshipWithKey(com.webobjects.eocontrol.EORelationshipManipulation eo, java.lang.String key);

    /**
     * Adds the enterprise object eo to the receiver's relationship value(s), without setting any inverse relationship. The relationship is identified by key. Similar to the implementation of takeValueForKey, EOCustomObject's implementation of this method first attempts to invoke a method of the form "addToKey" (with "Key" being the relationship's name). If the receiver doesn't have such a method, this method gets the property array or value using valueForKey and operates directly on that. For a to-many relationship, this method adds eo to the array if it is not already in the array. For a to-one relationship, this method replaces the previous value with eo.
     */
    abstract void addObjectToPropertyWithKey(java.lang.Object eo, java.lang.String key);

    /**
     * Removes the enterprise object eo from the receiver's relationship, which is identified by key, and also removes the receiver from the enterprise object eo's inverse relationship if there is one. For a to-one relationship, anObject is removed using takeValueForKey with null as the value. For a to-many relationship, anObject is removed using removeObjectFromPropertyWithKey.
     */
    abstract void removeObjectFromBothSidesOfRelationshipWithKey(com.webobjects.eocontrol.EORelationshipManipulation eo, java.lang.String key);

    /**
     * Removes the enterprise object eo from the receiver's relationship value(s), without modifying any inverse relationship. The relationship is identified by key. Similar to the implementation of takeValueForKey, EOCustomObject's implementation of this method first attempts to invoke a method of the form "removeFromKey" (with "Key" being the relationship's name). If the receiver doesn't have such a method, this method gets the property array or value using valueForKey and operates directly on that. For a to-many relationship, this method removes eo from the array. For a to-one relationship, this method replaces eo with null.
     */
    abstract void removeObjectFromPropertyWithKey(java.lang.Object eo, java.lang.String key);

}
