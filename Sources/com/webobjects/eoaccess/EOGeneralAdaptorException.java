package com.webobjects.eoaccess;
/**
 * A subclass of RuntimeException thrown by EOAccess. This is a generic exception. A more specific exception should be used if known.
 * See Also:Serialized Form
 */
public class EOGeneralAdaptorException extends java.lang.RuntimeException{
    /**
     * Constructs a EOGeneralAdaptorException with the specified detail message.
     * Parameters:message - A detailed message about the exception.
     */
    public EOGeneralAdaptorException(java.lang.String message){
         //TODO codavaj!!
    }

    /**
     * Constructs a EOGeneralAdaptorException with the specified name and a userInfo dictionary of additional information.
     * Parameters:name - The name of the exception.userInfo - Arbitrary additional information associated with the exception.
     */
    public EOGeneralAdaptorException(java.lang.String name, com.webobjects.foundation.NSDictionary userInfo){
         //TODO codavaj!!
    }

    /**
     * Constructs a new EOGeneralAdaptorException with the name of the selector (method) and class throwing the exception, and a detailed message about the exception.
     * Parameters:selectorName - The name of the method throwing the exception.className - The name of the class throwing the exception.message - A detailed message about the exception.
     */
    public EOGeneralAdaptorException(java.lang.String selectorName, java.lang.String className, java.lang.String message){
         //TODO codavaj!!
    }

    /**
     * Returns the dictionary of arbitrary user information associated with the receiver.
     */
    public com.webobjects.foundation.NSDictionary userInfo(){
        return null; //TODO codavaj!!
    }

}
