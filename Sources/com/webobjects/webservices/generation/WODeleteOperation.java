package com.webobjects.webservices.generation;
/**
 * See Also:Serialized Form
 */
public class WODeleteOperation extends com.webobjects.webservices.generation.WOOperation{
    public WODeleteOperation(com.webobjects.appserver.WOContext context){
         //TODO codavaj!!
    }

    /**
     * Deletes the object value from EOEditingContext ec. Value must either be an Object[] of EOGlobalIDs, an NSArray of EOGlobalIDs, an NSDictionary representing an EO primary key, an EOGlobalID, or an EOEnterpriseObject.
     */
    protected void delete(java.lang.Object value, com.webobjects.eocontrol.EOEditingContext ec){
        return; //TODO codavaj!!
    }

    /**
     * Deletes one or more EOEnterpriseObject's identified by global ID in the argument values. All argument values are expected to be EOGlobalID's. For each global ID, a corresponding fault is created in the operation's editing context. The EO is then deleted using the delete method.
     * If WOServiceUtilities.commitOperationImmediately() is true, then the changes to the editing context are saved before this method returns.
     */
    public java.lang.Object invoke(){
        return null; //TODO codavaj!!
    }

}
