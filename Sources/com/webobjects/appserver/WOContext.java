
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOCGIFormValues;
import com.webobjects.appserver._private.WOComponentDefinition;
import com.webobjects.appserver._private.WOElementID;
import com.webobjects.appserver._private.WOShared;
import com.webobjects.foundation.*;
import java.net.URL;
import java.util.*;


public class WOContext
    implements Cloneable, NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions {


    /**
     * @deprecated Method contextWithRequest is deprecated
     */

    public static WOContext contextWithRequest(WORequest aRequest) { return null; }

    /**
     * @deprecated Method WOContext is deprecated
     */

    private WOContext() { return null; }

    public WOContext(WORequest aRequest) { return null; }

    protected boolean secureRequest() { return true; }

    public boolean secureMode() { return true; }

    public void setSecureMode(boolean value) {}

    public Object clone() { return null; }

    public String toString() { return null; }

    public String contextID() { return null; }

    public String senderID() { return null; }

    public String _originalContextID() { return null; }

    public void _setOriginalContextID(String value) {}

    public void _setRequestContextID(String aContextID) {}

    public String _requestContextID() { return null; }

    public void _setRequestSessionID(String aSessionID) {}

    public String _requestSessionID() { return null; }

    public boolean hasSession() { return true; }

    public WOSession session() { return null; }

    public WORequest request() { return null; }

    public WOResponse response() { return null; }

    public WODynamicURL _url() { return null; }

    public void setInForm(boolean aFlag) {}

    public boolean isInForm() { return true; }

    /**
     * @deprecated Method _setFormSubmitted is deprecated
     */

    public void _setFormSubmitted(boolean aFlag) {}

    /**
     * @deprecated Method _wasFormSubmitted is deprecated
     */

    public boolean _wasFormSubmitted() { return true; }

    /**
     * @deprecated Method _setActionInvoked is deprecated
     */

    public void _setActionInvoked(boolean aFlag) {}

    /**
     * @deprecated Method _wasActionInvoked is deprecated
     */

    public boolean _wasActionInvoked() { return true; }

    /**
     * @deprecated Method _setIsMultipleSubmitForm is deprecated
     */

    public void _setIsMultipleSubmitForm(boolean aFlag) {}

    /**
     * @deprecated Method _isMultipleSubmitForm is deprecated
     */

    public boolean _isMultipleSubmitForm() { return true; }

    public void setFormSubmitted(boolean aFlag) {}

    public boolean wasFormSubmitted() { return true; }

    public void setActionInvoked(boolean aFlag) {}

    public boolean wasActionInvoked() { return true; }

    public void setIsMultipleSubmitForm(boolean aFlag) {}

    public boolean isMultipleSubmitForm() { return true; }

    protected void _takeAwakeComponent(WOComponent aComponent) {}

    private void _takeAwakeComponentsFromArray(NSArray anArray) {}

    /**
     * @deprecated Method _setUserInfo is deprecated
     */

    public void _setUserInfo(NSMutableDictionary aDictionary) {}

    /**
     * @deprecated Method _userInfo is deprecated
     */

    public NSMutableDictionary _userInfo() { return null; }

    public void setUserInfo(Map aDictionary) {}

    public NSDictionary userInfo() { return null; }

    public Object userInfoForKey(String key) { return null; }

    public void setUserInfoForKey(Object value, String key) {}

    public WOComponent page() { return null; }

    public WOComponent component() { return null; }

    public String _componentName() { return null; }

    public void _setComponentName(String aName) {}

    public WOComponentDefinition _tempComponentDefinition() { return null; }

    public void _setTempComponentDefinition(WOComponentDefinition aCD) {}

    public String elementID() { return null; }

    public String javaScriptElementID() { return null; }

    public static String javaScriptElementIDPrefix() { return null; }

    public static void setJavaScriptElementIDSeparator(String value) { return null; }

    public static String javaScriptElementIDSeparator() { return null; }

    public static void setJavaScriptElementIDPrefix(String value) { return null; }

    public boolean shouldNotStorePageInBacktrackCache() { return true; }

    public String pageFragementID() { return null; }

    public void setPageFragmentID(String value) {}

    public boolean _pageChanged() { return true; }

    public void _setPageChanged(boolean aBool) {}

    public void _setCurrentComponent(WOComponent aComponent) {}

    public WOSession _session() { return null; }

    public void _incrementContextID() {}

    public void _synchronizeForDistribution() {}

    public void _setSenderID(String aSenderID) {}

    public void _setSession(WOSession aSession) {}

    public void _setRequest(WORequest aRequest) {}

    public void _setResponse(WOResponse aResponse) {}

    public void _setPageComponent(WOComponent aComponent) {}

    public void _setPageElement(WOElement anElement) {}

    public WOElement _pageElement() { return null; }

    public WOComponent _pageComponent() { return null; }

    void _setLanguages(NSArray languages) { return null; }

    public NSArray _languages() { return null; }

    public void _putAwakeComponentsToSleep() {}

    /**
     * @deprecated Method _generateCompleteURLs is deprecated
     */

    public void _generateCompleteURLs() {}

    /**
     * @deprecated Method _generateRelativeURLs is deprecated
     */

    public void _generateRelativeURLs() {}

    public void generateCompleteURLs() {}

    public void generateRelativeURLs() {}

    public boolean doesGenerateCompleteURLs() { return true; }

    public String completeURLWithRequestHandlerKey(String applicationNumber, String requestHandlerKey, String requestHandlerPath, String queryString, boolean isSecure, int somePort) { return null; }

    public String completeApplicationURLPrefix(boolean secure, int port) { return null; }

    public String directActionURLForActionNamed(String anActionName, NSDictionary queryDictionary) { return null; }

    public String _directActionURL(String anActionName, NSDictionary aQueryDict, boolean isSecure, int somePort, boolean entityEscapeQueryDict) { return null; }

    /**
     * @deprecated Method _directActionURL is deprecated
     */

    public String _directActionURL(String anActionName, NSDictionary aQueryDict, boolean isSecure) { return null; }

    public String componentActionURL() { return null; }

    public String componentActionURL(String requestHandlerKey) { return null; }

    public String componentActionURL(String requestHandlerKey, boolean isSecure) { return null; }

    /**
     * @deprecated Method _componentActionURL is deprecated
     */

    public String _componentActionURL(boolean isSecure) { return null; }

    public String urlWithRequestHandlerKey(String requestHandlerKey, String aRequestHandlerPath, String aQueryString) { return null; }

    public String directActionURLForActionNamed(String aRequestHandlerPath, NSDictionary queryDictionary, boolean isSecure, int somePort, boolean entityEscapeQueryDict) { return null; }

    public NSDictionary computeQueryDictionary(String aRequestHandlerPath, NSDictionary queryDictionary, NSDictionary otherQueryDictionary, boolean defaultIncludeSessionID) { return null; }

    public String directActionURLForActionNamed(String requestHandlerPath, NSDictionary queryDictionary, boolean isSecure, boolean entityEscapeQueryDict) { return null; }

    public String _urlWithRequestHandlerKey(String requestHandlerKey, String requestHandlerPath, String queryString, boolean isSecure) { return null; }

    public String _urlWithRequestHandlerKey(String requestHandlerKey, String aRequestHandlerPath, String aQueryString, boolean isSecure, int somePort) { return null; }

    protected String relativeURLWithRequestHandlerKey(String requestHandlerKey, String requestHandlerPath, String queryString) { return null; }

    protected Object sessionIDInQueryDictionary(NSDictionary queryDictionary) { return null; }

    protected NSMutableDictionary _removeSessionIDFromDictionary(NSDictionary queryDictionary) { return null; }

    protected void _stripSessionIDFromURL() {}

    protected boolean _sessionIDInURL() { return true; }

    protected boolean directConnect() { return true; }

    public String completeURLWithRequestHandlerKey(String requestHandlerKey, String aRequestHandlerPath, String aQueryString, boolean isSecure, int somePort) { return null; }

    public String _urlForResourceNamed(String aResourceName, String aFrameworkName, boolean localize) { return null; }

    public void appendElementIDComponent(String aString) {}

    public void appendZeroElementIDComponent() {}

    public void incrementLastElementIDComponent() {}

    public void deleteLastElementIDComponent() {}

    public void deleteAllElementIDComponents() {}

    public boolean _refuseThisRequest() { return true; }

    public void _set_refuseThisRequest(boolean aBool) {}

    public static boolean canAccessFieldsDirectly() { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    static  {}

    private String _contextID;
    private String _requestContextID;
    private String _originalContextID;
    private String _requestSenderID;
    private String _requestSessionID;
    private String _componentName;
    private WOElementID _elementID;
    protected WOSession _session;
    private WORequest _request;
    private WOResponse _response;
    private WOElement _pageElement;
    private WOComponent _pageComponent;
    private WOComponent _currentComponent;
    private WODynamicURL _url;
    private boolean _generateCompleteURLs;
    private String _urlApplicationNumber;
    private boolean _distributionEnabled;
    private boolean _pageChanged;
    private boolean _pageReplaced;
    private boolean _inForm;
    private boolean _formSubmitted;
    private boolean _actionInvoked;
    private boolean _isMultipleSubmitForm;
    private NSMutableArray _awakePageComponents;
    private StringBuffer _requestHandlerPath;
    private WOComponentDefinition _tempComponentDefinition;
    private WOResourceManager _resourceManager;
    private NSArray _languagesAction;
    protected Map _userInfo;
    private volatile boolean _refuseThisRequest;
    private Boolean _secureMode;
    protected String _pageFragementID;
    public static final String WOURLEncoding = "WOURLEncoding";
    public static final String SessionIDBindingKey = "wosid";
    public static boolean EscapeQueryDictionary;
    private static String __javaScriptElementIDPrefix;
    private static String __javaScriptElementIDSeparator;

}
