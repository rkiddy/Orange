package com.webobjects.webservices.generation;
/**
 * See Also:Serialized Form
 */
public class WOUpdateOperation extends com.webobjects.webservices.generation.WOOperation{
    public WOUpdateOperation(com.webobjects.appserver.WOContext context){
         //TODO codavaj!!
    }

    /**
     * Updates an EOEnterpriseObject identified by a global ID in the argument values or by combining the primary key attributes from the argument values.
     * First an existing EO is found. If one of the argument key paths equals the value returned by gidArgumentKey(), then the corresponding argument value is used as an EOGlobalID to find the EO of interest. If no global ID key is defined, then the property key paths that match the primary key attribute names for the operation's entity are identified. If these keys are the corresponding values are combined to create a primary key which is used to fetch the EO of interest.
     * Once the EO is found and brought into this operation's editing context, the remaining value changes are applied to the EO using key-value coding.
     * If WOServiceUtilities.commitOperationImmediately() is true, then the changes to the editing context are saved before this method returns.
     */
    public java.lang.Object invoke(){
        return null; //TODO codavaj!!
    }

}
