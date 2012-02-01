package com.webobjects.appserver.xml;
/**
 * This class serves to wrap a number of exceptions that can arise during the parsing process, reducing the number of exceptions your code has to catch. In particular, exceptions that are thrown by the SAX parser are encapsulated in WOXMLException objects and then re-thrown.
 * See Also:Serialized Form
 */
public class WOXMLException extends com.webobjects.foundation.NSForwardException{
    /**
     * Creates a WOXMLException that contains an exception message.
     * Parameters:extraMessage - an extra text string explaining the exception
     */
    public WOXMLException(java.lang.String extraMessage){
         //TODO codavaj!!
    }

    /**
     * Creates a WOXMLException that wraps an exception.
     * Parameters:wrapped - an exception that needs to be wrapped in this exception
     */
    public WOXMLException(java.lang.Throwable wrapped){
         //TODO codavaj!!
    }

    /**
     * Creates a WOXMLException that wraps an exception and an extra text string. The text string is prepended to the eventual exception message retrieved.
     * Parameters:wrapped - an exception that needs to be wrapped in this exceptionextraMessage - an extra text string explaining the exception further
     */
    public WOXMLException(java.lang.Throwable wrapped, java.lang.String extraMessage){
         //TODO codavaj!!
    }

    /**
     * Gets the error message string of this exception object.
     */
    public java.lang.String getMessage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a short description of this exception object. If this object was created with an extra error message string, then the result is the concatenation of 2 strings: the extra error message ": " (a colon and a space. only when the extra error message is present) the original exception's description
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
