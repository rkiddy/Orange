package com.webobjects.webservices.generation;
/**
 * See Also:Serialized Form
 */
public class WOBeginTransactionOperation extends com.webobjects.webservices.generation.WOOperation{
    public WOBeginTransactionOperation(com.webobjects.appserver.WOContext context){
         //TODO codavaj!!
    }

    /**
     * Creates a session and configures it to handle transactions. Once this operation is invoked, calls to saveChangesInEditingContext will not result in changes to an operation's editing context being saved until an invocation of a WOCommitTransaction operation. A subsequent invocation of a WORollbackTransaction operation will reset the editing context.
     * Between the invocation of a begin transaction and either a commit or roll back transaction operation, all other operations invoked by the same client (carrying the proper SOAP headers) share a WOSession and EOEditingContext.
     */
    public java.lang.Object invoke(){
        return null; //TODO codavaj!!
    }

    public static boolean requiresEntity(){
        return false; //TODO codavaj!!
    }

}
