package com.webobjects.jndiadaptor;
/**
 * The JNDIAdaptorException class represents a runtime exception that wraps an instance of NamingException.
 * See Also:NamingException, Serialized Form
 */
public class JNDIAdaptorException extends com.webobjects.eoaccess.EOGeneralAdaptorException{
    /**
     * Creates a new instance of JNDIAdaptorException with the specified naming exception. The JNDIAdaptorException will use the message of the naming exception.
     * Parameters:namingException - - the instance of NamingExceptionSee Also:JNDIAdaptorException.JNDIAdaptorException(String, NamingException)
     */
    public JNDIAdaptorException(javax.naming.NamingException namingException){
         //TODO codavaj!!
    }

    /**
     * Creates a new instance of JNDIAdaptorException with the specified message. Use this constructor when there is no naming exception to store.
     * Parameters:message - - the detailed messageSee Also:JNDIAdaptorException.JNDIAdaptorException(String, NamingException), EOGeneralAdaptorException.EOGeneralAdaptorException(String)
     */
    public JNDIAdaptorException(java.lang.String message){
         //TODO codavaj!!
    }

    /**
     * Creates a new instance of JNDIAdaptorException with the specified message and naming exception.
     * Parameters:message - - the detailed messagenamingException - - the instance of NamingExceptionSee Also:JNDIAdaptorException.JNDIAdaptorException(String), NamingException
     */
    public JNDIAdaptorException(java.lang.String message, javax.naming.NamingException namingException){
         //TODO codavaj!!
    }

    /**
     * Gets the naming exception.
     */
    public javax.naming.NamingException namingException(){
        return null; //TODO codavaj!!
    }

}
