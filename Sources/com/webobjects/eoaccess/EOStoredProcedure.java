package com.webobjects.eoaccess;
/**
 * EOStoredProcedure encapsulates the information stored in an EOModel about a stored procedure which is stored in a database server. The main information is the name within the model, the external name (as defined in the database), the number of arguments and their types.
 */
public class EOStoredProcedure implements com.webobjects.eoaccess.EOPropertyListEncoding{
    /**
     * Creates a new EOStoredProcedure from a property list.
     * Parameters:propertyList - NSDictionary a property list conataining the definitions for this stored procedureowner - this parameter should be of type EOModel; the EOStoredProcedure will store this parameter as its model, but will not yet add itself to the model's list of stored procedures
     */
    public EOStoredProcedure(com.webobjects.foundation.NSDictionary propertyList, java.lang.Object owner){
         //TODO codavaj!!
    }

    /**
     * The constructor for a EOStoredProcedure (which is a reference to the stored procedure in the database).
     * Parameters:name - the name of the stored procedure within the EOModel
     */
    public EOStoredProcedure(java.lang.String name){
         //TODO codavaj!!
    }

    /**
     * Returns the EOAttribute objects that describe the stored procedure's arguments.
     */
    public com.webobjects.foundation.NSArray arguments(){
        return null; //TODO codavaj!!
    }

    /**
     * The second phase in a two-phase creation process of a model.
     */
    public void awakeWithPropertyList(com.webobjects.foundation.NSDictionary propertyList){
        return; //TODO codavaj!!
    }

    /**
     * Renames the receiver's name and its arguments to conform to the Framework's naming conventions. For example, NAME is renamed name and FIRST_NAME is renamed firstName. This method is used in reverse-engineering a model.
     */
    public void beautifyName(){
        return; //TODO codavaj!!
    }

    /**
     * Encodes the definitions of this EOStoredProcedure into a property list.
     */
    public void encodeIntoPropertyList(com.webobjects.foundation.NSMutableDictionary result){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name of the stored procedure as it is defined in the database, or null if it doesn't have an external name.
     */
    public java.lang.String externalName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the model to which the receiver belongs.
     */
    public com.webobjects.eoaccess.EOModel model(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of the stored procedure as it is defined in the EOModel.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets arguments as the array of EOAttributes that describe the receiver's arguments.
     */
    public void setArguments(com.webobjects.foundation.NSArray arguments){
        return; //TODO codavaj!!
    }

    /**
     * Sets the external name of the stored procedure to externalName. The parameter externalName should be the name of the stored procedure as it is defined in the database.
     */
    public void setExternalName(java.lang.String externalName){
        return; //TODO codavaj!!
    }

    /**
     * Sets the name of this EOStoredProcedure.
     */
    public void setName(java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Sets the dictionary of auxiliary data, which your application can use for whatever it needs. dictionary can only contain property list data types (that is, String, NSDictionary, NSArray, and NSData).
     */
    public void setUserInfo(com.webobjects.foundation.NSDictionary aDictionary){
        return; //TODO codavaj!!
    }

    /**
     * This constructs and return a string representation of this EOStoredProcedure.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary of user data. Your application can use this to store any auxiliary information it needs.
     */
    public com.webobjects.foundation.NSDictionary userInfo(){
        return null; //TODO codavaj!!
    }

}
