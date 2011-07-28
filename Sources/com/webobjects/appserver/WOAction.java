
package com.webobjects.appserver;

import com.webobjects.foundation.*;
import java.lang.reflect.Method;


public abstract class WOAction {


    public WOAction(WORequest aRequest) { return null; }

    public Method _methodForAction(String actionName, String at) { return null; }

    public static boolean _isActionOnClass(String actionName, Class actionClass) { return null; }

    public static NSDictionary _preloadAllActionsOnClass(Class actionClass, String at) { return null; }

    public void initializeRequestSessionIDInContext(WOContext aContext) {}

    public abstract String getSessionIDForRequest(WORequest worequest);

    public WOComponent pageWithName(String aComponentName) { return null; }

    public abstract WOActionResults performActionNamed(String s);

    public WOSession session() { return null; }

    public WOContext context() { return null; }

    public WOSession existingSession() { return null; }

    public WORequest request() { return null; }

    /**
     * @deprecated Method logString is deprecated
     */

    public static void logString(String string) { return null; }

    /**
     * @deprecated Method debugString is deprecated
     */

    public static void debugString(String string) { return null; }

    public static boolean canAccessFieldsDirectly() { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    public Object validateValueForKey(Object value, String key) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    public Object validateTakeValueForKeyPath(Object value, String keyPath) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    public String toString() { return null; }

    public void setLanguages(NSArray someLanguages) {}

    public NSArray languages() { return null; }

    static  {}

    public static final String actionText = "Goober";
    protected final WOContext _context;
    protected static _NSThreadsafeMutableDictionary _actionClasses;

}
