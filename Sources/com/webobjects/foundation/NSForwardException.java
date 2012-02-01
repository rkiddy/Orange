package com.webobjects.foundation;
/**
 * NSForwardException objects (or forwarded exceptions) are wrappers for Throwable objects which are not RuntimeExceptions. Since NSForwardException is a subclass of RuntimeException, forwarded exceptions are usually omitted from the throws clause of a method even if the original exception would have had to be declared.
 * NSForwardException is used within WebObjects to keep the API congruent with the WebObjects 4.5 API (which uses the Java Bridge). Apple doesn't anticipate the need for you to create NSForwardException objects. You may need to catch them, however.
 * See Also:NSForwardException.originalException(), Serialized Form
 */
public class NSForwardException extends java.lang.RuntimeException{
    /**
     * Construct a new exception with the given message and cause. This is the same as
     * , except the args are in the order expected by standard exception classes.
     * Parameters:cause - the original exceptionmessage - description to be attached to the original exceptionSee Also:NSForwardException.NSForwardException(Throwable, String), RuntimeException.RuntimeException(String, Throwable)
     */
    public NSForwardException(java.lang.String message, java.lang.Throwable cause){
         //TODO codavaj!!
    }

    /**
     * Creates an NSForwardException from wrapped. If wrapped is already an NSForwardException, the constructor wraps the exception's originalException.
     * Parameters:wrapped - the original exceptionSee Also:NSForwardException.originalException()
     */
    public NSForwardException(java.lang.Throwable wrapped){
         //TODO codavaj!!
    }

    /**
     * Creates an NSForwardException from wrapped. If wrapped is already an NSForwardException, the constructor wraps the exception's original exception.
     * The two-argument constructor allows you to specify an extra message; in this case, the new NSForwardException's message is wrapped's message with extraMessage appended.
     * Parameters:wrapped - the original exceptionextraMessage - description to be attached to the original exceptionSee Also:NSForwardException.originalException()
     */
    public NSForwardException(java.lang.Throwable wrapped, java.lang.String extraMessage){
         //TODO codavaj!!
    }

    public java.lang.Throwable originalException(){
        return null; //TODO codavaj!!
    }

    public java.lang.String stackTrace(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of the receiver indicating the receiver's class, its wrapped exception's class, and the wrapped exception's error message string.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
