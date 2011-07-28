
package com.webobjects.appserver;



public abstract class WORequestHandler {


    protected WORequestHandler() { return null; }

    public abstract WOResponse handleRequest(WORequest worequest);

    public String toString() { return null; }

    static  {}

    public static String DidHandleRequestNotification;

}
