package com.webobjects.directtoweb;
/**
 * The DefaultAssignment class methods provide default values for the right-hand sides of rules. Many of these default values depend on the current entity or property in the Direct to Web context that is active when the rule fires.
 * This is a good class to extend if you want to add your own assignment methods. Any rule that uses the method must have its right-hand side value set to the name of the method. Use the _context variable to access the Direct to Web context that is active when the rule fires.
 * For more information about subclassing DefaultAssignment, see the "Customizing a Direct to Web Application" chapter of Developing WebObjects Applications with Direct to Web.
 * See Also:Serialized Form
 */
public class DefaultAssignment extends com.webobjects.directtoweb.Assignment{
    /**
     * Constructs a new DefaultAssignment based on an EOKeyValueUnarchiver. This is used to read the assignment information from a rule file.
     * Parameters:unarchiver - - the unarchiver.
     */
    public DefaultAssignment(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Constructs a new DefaultAssignment with the specified key path and value.
     * Parameters:keyPath - - the key path.value - - the value.
     */
    public DefaultAssignment(java.lang.String keyPath, java.lang.String value){
         //TODO codavaj!!
    }

    /**
     * Returns the attribute width.
     */
    public int attributeWidth(){
        return 0; //TODO codavaj!!
    }

    public com.webobjects.directtoweb.D2WContext d2wContext(){
        return null; //TODO codavaj!!
    }

    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing a user-presentable version of the current property key in the Direct to Web context in which the receiver's rule fires. This string is formed by capitalizing the key and inserting spaces between words with mixed case.
     */
    public java.lang.String defaultDisplayNameForProperty(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the first entity name in the NSArray returned by the smartDefaultEntityNames method.
     */
    public java.lang.String defaultEntityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a sorted NSArray containing the property keys for the current entity excluding primary and foreign keys.
     */
    public com.webobjects.foundation.NSArray defaultPropertyKeysFromEntity(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a sorted NSArray containing the property keys for the current entity excluding relationships, primary keys, and foreign keys.
     */
    public com.webobjects.foundation.NSArray defaultPropertyKeysFromEntityWithoutRelationships(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is invoked when a rule fires. It returns the right-hand side value (an Object) for a right-hand side key in the Direct to Web context. You can override this method to provide your own assignments.
     */
    public java.lang.Object fire(com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the current entity in the Direct to Web context in which the receiver's rule fires cannot be modified. You can specify whether an entity can be modified using the Web Assistant.
     * You can override this method to provide your own criteria for whether or not a entity can be modified.
     */
    public java.lang.Integer isEntityReadOnly(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the result of smartDefaultAttributeWidthAsInt as a String.
     */
    public final java.lang.String smartDefaultAttributeWidth(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the width of the current attribute in the Direct to Web context in which the receiver's rule fires. Returns 50 if the width of the current attribute is less than 50. Returns 20 if the current property is not an attribute.
     */
    public int smartDefaultAttributeWidthAsInt(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns a sorted NSArray of the names of the entities in the application. Entities having fewer than three relationships and no attributes are assumed to be join tables and are excluded.
     */
    public final com.webobjects.foundation.NSArray smartDefaultEntityNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the key for the default property of the current entity in the Direct to Web context in which the receiver's rule fires. This method guesses the most likely property with which the user will query for the entity and returns its key.
     */
    public java.lang.String smartDefaultKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a key for the default property of the current relationship's destination object. If the current property in the Direct to Web context in which the receiver's rule fires is not a relationship, returns null. This method guesses the most likely property with which the user will query for the relationship's destination entity and returns its key.
     */
    public java.lang.String smartDefaultKeyWhenRelationship(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing an estimate of the number of rows that a WOText element would need to display the current attribute.
     */
    public final java.lang.String smartDefaultRows(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Gets the value string.
     */
    public java.lang.String valueString(){
        return null; //TODO codavaj!!
    }

}
