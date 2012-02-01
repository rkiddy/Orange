package com.webobjects.eoaccess;
/**
 * EOEntityIndex represent an index on an entity.
 */
public class EOEntityIndex implements com.webobjects.eoaccess.EOPropertyListEncoding, com.webobjects.eoaccess.EOSQLExpression.SQLValue{
    public EOEntityIndex(){
         //TODO codavaj!!
    }

    /**
     * Creates an EOEntityIndex object with the state specified in plist whose parent is owner. The possible keys for plist are: name attributes constrain indexType order userInfo
     * Parameters:plist - A dictionary whose keys are attribute names and whose values are the attribute values for the new EOAttribute object.owner - The parent object for the new EOAttribute.
     */
    public EOEntityIndex(com.webobjects.foundation.NSDictionary plist, com.webobjects.eoaccess.EOEntity owner){
         //TODO codavaj!!
    }

    /**
     * Adds attribute to the receiver.
     */
    public void addAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Return the list of attribute used by this index
     */
    public com.webobjects.foundation.NSArray attributes(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Finishes initializing the receiver from the property list dic, restoring references to other objects. Consequently, it should not be invoked until all other objects from dic that the receiver might reference have been created. The receiver must have been created with a constructor of the form: public ClassName(NSDictionary propertyList, Object owner)
     */
    public void awakeWithPropertyList(com.webobjects.foundation.NSDictionary dic){
        return; //TODO codavaj!!
    }

    /**
     * Returns the index constraint.
     */
    public com.webobjects.eoaccess.EOEntityIndex.Constraint constraint(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Encodes the receiver as a property list. Property lists are NSDictionary objects whose values are String, NSDictionary, NSArray, and NSData objects.
     */
    public void encodeIntoPropertyList(com.webobjects.foundation.NSMutableDictionary result){
        return; //TODO codavaj!!
    }

    public com.webobjects.eoaccess.EOEntity entity(){
        return null; //TODO codavaj!!
    }

    /**
     * Checks if the receiver has any attribute defined.
     */
    public boolean isEmpty(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the internal name of the index.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the index order.
     */
    public com.webobjects.eoaccess.EOEntityIndex.Order order(){
        return null; //TODO codavaj!!
    }

    /**
     * Removes attribute from the receiver.
     */
    public void removeAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Sets the list of attributes used by this index
     */
    public void setAttributes(com.webobjects.foundation.NSArray value){
        return; //TODO codavaj!!
    }

    /**
     * Set the value of the index constraint. Default is None.
     */
    public void setConstraint(com.webobjects.eoaccess.EOEntityIndex.Constraint value){
        return; //TODO codavaj!!
    }

    /**
     * Set the value of the index constraint. Invalid value are ignored. Default is None.
     */
    public void setConstraint(java.lang.String value){
        return; //TODO codavaj!!
    }

    public void setEntity(com.webobjects.eoaccess.EOEntity value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the attribute's name to name, which can not be a name that is already in use by an attribute or relationship belonging to the same entity as the receiver.
     */
    public void setName(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Set the value of the index order. Default is Ascending.
     */
    public void setOrder(com.webobjects.eoaccess.EOEntityIndex.Order value){
        return; //TODO codavaj!!
    }

    /**
     * Set the value of the index order. Invalid value are ignored. Default is Ascending.
     */
    public void setOrder(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Set the value of the index type. Default is Clustered.
     */
    public void setType(com.webobjects.eoaccess.EOEntityIndex.Type value){
        return; //TODO codavaj!!
    }

    /**
     * Set the value of the index type. Invalid value are ignored. Default is Clustered.
     */
    public void setType(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the dictionary of auxiliary data, which the application can use for whatever it needs. dictionary can only contain property list data types (that is, NSDictionary, String, NSArray, and NSData).
     */
    public void setUserInfo(com.webobjects.foundation.NSDictionary aDictionary){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the index type.
     */
    public com.webobjects.eoaccess.EOEntityIndex.Type type(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary of user data. An application can use this data for whatever it needs.
     */
    public com.webobjects.foundation.NSDictionary userInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns a String to be used to represent the receiver in an SQL statement.
     */
    public java.lang.String valueForSQLExpression(com.webobjects.eoaccess.EOSQLExpression context){
        return null; //TODO codavaj!!
    }

}
