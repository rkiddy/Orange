
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;


public class WODirectActionRequestHandler extends WOActionRequestHandler {


    protected String defaultActionClassName() { return null; }

    public static WORequestHandler handler() { return null; }

    public WODirectActionRequestHandler() { return null; }

    public WODirectActionRequestHandler(String className, String actionName, boolean shouldAddToStats) { return null; }

    public void setAllowsContentInputStream(boolean isAllowed) {}

    public boolean allowsContentInputStream() { return true; }

    private String _submitButtonsActionPathFromRequest(WORequest aRequest) { return null; }

    public WOResponse nullResponse() { return null; }

    public void registerWillHandleActionRequest() {}

    public void registerDidHandleActionRequestWithActionNamed(String anActionName) {}

    public NSArray getRequestHandlerPathForRequest(WORequest aRequest) { return null; }

    public WOResponse generateErrorResponse(Exception exception, WOContext aContext) { return null; }

    public WOResponse generateRequestRefusal(WORequest aRequest) { return null; }

    private final boolean displayExceptionPages;
    private WOResponse nullResponse;
    private boolean _allowsContentInputStream;

}
