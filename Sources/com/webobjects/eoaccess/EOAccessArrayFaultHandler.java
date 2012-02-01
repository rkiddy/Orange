package com.webobjects.eoaccess;
/**
 * EOAccessArrayFaultHandler is a subclass of EOAccessGenericFaultHandler that implements a fault handler for an array of Enterprise Objects. It also is used when handling faults for to-many relationships.
 * See Also:EOAccessGenericFaultHandler
 */
public class EOAccessArrayFaultHandler extends com.webobjects.eoaccess.EOAccessGenericFaultHandler{
    /**
     * Creates and returns a fault handler initialized with all of the information necessary to fetch the appropriate objects when the fault is fired. When the fault is fired, the database context asks the editing context for the required objects using the EOObjectStore interface.
     * Parameters:sourceGlobalID - The EOKeyGlobalID of the source entity in a to-many relationship.relationshipName - The name of the to-many relationship.dbcontext - The database context.ec - The editing context.
     */
    public EOAccessArrayFaultHandler(com.webobjects.eocontrol.EOKeyGlobalID sourceGlobalID, java.lang.String relationshipName, com.webobjects.eoaccess.EODatabaseContext dbcontext, com.webobjects.eocontrol.EOEditingContext ec){
         //TODO codavaj!!
    }

    /**
     * Asks the database context to fetch an array of objects, if they are not already in memory. This method is called when a fault is fired and uses the EOObjectStore interface to get the information from the editing context.
     */
    public void completeInitializationOfObject(java.lang.Object eo){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name of the to-many relationship.
     */
    public java.lang.String relationshipName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOKeyGlobalID representing the source entity in a to-many relationship.
     */
    public com.webobjects.eocontrol.EOKeyGlobalID sourceGlobalID(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of this fault handler.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
