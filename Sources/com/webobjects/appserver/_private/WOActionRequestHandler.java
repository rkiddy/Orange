
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import java.lang.reflect.InvocationTargetException;


public abstract class WOActionRequestHandler extends WORequestHandler {


    protected abstract String defaultActionClassName();

    protected String defaultDefaultActionName() { return null; }

    protected boolean defaultShouldAddToStatistics() { return true; }

    public static Class _actionClassForName(String aClassNameString) { return null; }

    public static WORequestHandler handler() { return null; }

    protected WOActionRequestHandler() { return null; }

    public WOActionRequestHandler(String className, String actionName, boolean shouldAddToStats) { return null; }

    public abstract WOResponse nullResponse();

    public abstract void registerWillHandleActionRequest();

    public abstract void registerDidHandleActionRequestWithActionNamed(String s);

    protected boolean isSessionIDInRequest(WORequest aRequest) { return true; }

    public WOResponse handleRequest(WORequest aRequest) { return null; }

    public String toString() { return null; }

    public WOAction getActionInstance(Class anActionClass, Class parameters[], Object arguments[]) { return null; }

    public WOResponse _handleRequest(WORequest aRequest) { return null; }

    public abstract NSArray getRequestHandlerPathForRequest(WORequest worequest);

    public Object[] getRequestActionClassAndNameForPath(NSArray aRequestHandlerPathIn) { return null; }

    public void _putComponentsToSleepInContext(WOContext aContext) {}

    private void _setRecordingHeadersForRequestInContext(WORequest aRequest, WOResponse aResponse, WOContext aContext) {}

    public abstract WOResponse generateRequestRefusal(WORequest worequest);

    public abstract WOResponse generateErrorResponse(Exception exception, WOContext wocontext);

    protected String actionClassName;
    protected String defaultActionName;
    protected boolean shouldAddToStatistics;
    protected Class actionClassClass;
    public static final String INSTANTIATION = "InstantiationError";
    public static final String INVOCATION = "InvocationError";
    public static final String CLASS_NOT_FOUND = "ClassNotFoundError";
    public static final String INVALID_PATH = "InvalidPathError";

}
