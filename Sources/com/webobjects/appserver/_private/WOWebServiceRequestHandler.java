
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.NSArray;
import javax.xml.namespace.QName;
import org.apache.axis.*;


public class WOWebServiceRequestHandler extends WOActionRequestHandler {

    protected String defaultActionClassName() { return null; }

    public static WORequestHandler handler() { return null; }

    public WOWebServiceRequestHandler() { return null; }

    public WOWebServiceRequestHandler(String className, String actionName, boolean shouldAddToStats) { return null; }

    public WOResponse nullResponse() { return null; }

    public void registerWillHandleActionRequest() {}

    public void registerDidHandleActionRequestWithActionNamed(String anActionName) {}

    public NSArray getRequestHandlerPathForRequest(WORequest aRequest) { return null; }

    protected boolean isSessionIDInRequest(WORequest aRequest) { return true; }

    public WOResponse generateRequestRefusal(WORequest aRequest) { return null; }

    public WOResponse generateErrorResponse(Exception exception, WOContext aContext) { return null; }

    public WOResponse handleRequest(WORequest aRequest) { return null; }
}
