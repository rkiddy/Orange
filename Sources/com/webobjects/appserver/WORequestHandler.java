package com.webobjects.appserver;
/**
 * WORequestHandler is an abstract class that defines request handlers. A request handler is an object that can handle requests received by the WebObjects adaptor. All WebObjects applications have multiple request handlers that can handle certain types of requests. Three private request handlers are defined in the WebObjects framework: WOComponentRequestHandler, which handles requests for actions implemented in a component. WODirectActionRequestHandler, which handles requests for actions implemented in a WODirectAction class. WOResourceRequestHandler, which handles requests for resources. These three request handlers handle most types of requests that an application can typically receive. If you want to create your own type of request, then you should write your own WORequestHandler. Unless you write your own request handler, your code typically won't have to directly interact with WORequestHandler objects at all.
 */
public abstract class WORequestHandler{
    /**
     * This constant contains a String that names the notification that is posted by each request handler after a request has been handled.
     */
    public static java.lang.String DidHandleRequestNotification;

    /**
     * Default constructor for WORequestHandler that only calls super().
     */
    protected WORequestHandler(){
         //TODO codavaj!!
    }

    /**
     * Request handlers must implement this method and perform all request-specific handling. By default, a request is an HTTP request. You must supply your own server-side adaptor to accept anything other than HTTP.
     */
    public abstract com.webobjects.appserver.WOResponse handleRequest(com.webobjects.appserver.WORequest aRequest);

    /**
     * Returns a string representation of the receiver.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
