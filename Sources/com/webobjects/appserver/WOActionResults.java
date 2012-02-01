package com.webobjects.appserver;
/**
 * The WOActionResults interface is the return type for direct actions. As a convenience, direct actions can return either WOComponent objects or WOResponse objects, both of which implement the WOActionResults interface. This interface defines only one method: generateResponse.
 * If you want to return any other class from a direct action, then that class must implement this interface.
 * See Also:WOActionResults.generateResponse()
 */
public interface WOActionResults{
    /**
     * Returns a response object. WOResponse's implementation of this method returns the receiver. WOComponent's implementation of this method calls appendToResponse on itself and all children components in its template and returns the result as a WOResponse object. If you want to return any other class from a direct action, then that class must implement this method.
     */
    abstract com.webobjects.appserver.WOResponse generateResponse();

}
