
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOCGIFormValues;
import com.webobjects.appserver._private.WOComponentRequestHandler;
import com.webobjects.appserver._private.WOEncodingDetector;
import com.webobjects.appserver._private.WOFileUploadSupport;
import com.webobjects.appserver._private.WOInputStreamData;
import com.webobjects.appserver._private.WOProperties;
import com.webobjects.appserver._private.WOShared;
import com.webobjects.appserver._private.WOURLFormatException;
import com.webobjects.foundation.*;
import java.io.InputStream;
import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Map;


public class WORequest extends WOMessage
    implements Cloneable {


    public WORequest(String aMethod, String aURL, String anHTTPVersion, Map someHeaders, NSData aContent, Map aUserInfoDictionary) { return null; }

    protected WORequest() { return null; }

    public boolean isSecure() { return true; }

    public InetAddress _originatingAddress() { return null; }

    public void _setOriginatingAddress(InetAddress anAddress) {}

    public int _originatingPort() { return 0; }

    public void _setOriginatingPort(int aPort) {}

    public InetAddress _acceptingAddress() { return null; }

    public void _setAcceptingAddress(InetAddress anAddress) {}

    public int _acceptingPort() { return 0; }

    public void _setAcceptingPort(int aPort) {}

    protected WOContext _context() { return null; }

    protected void _setContext(WOContext aContext) {}

    public WOContext context() { return null; }

    public void setContext(WOContext value) {}

    public WOAdaptor originatingAdaptor() { return null; }

    public void _setOriginatingAdaptor(WOAdaptor anAdaptor) {}

    public Object clone() { return null; }

    public String toString() { return null; }

    public InputStream contentInputStream() { return null; }

    private static NSArray _cleanAbbreviationArray(NSArray anAbbreviationArray) { return null; }

    public String method() { return null; }

    public String uri() { return null; }

    public String requestHandlerKey() { return null; }

    public NSArray requestHandlerPathArray() { return null; }

    public NSArray browserLanguages() { return null; }

    public String adaptorPrefix() { return null; }

    public String applicationName() { return null; }

    private int _applicationNumberFromURI() { return 0; }

    public int applicationNumber() { return 0; }

    public void _setApplicationNumber(int id, boolean override) {}

    public String requestHandlerPath() { return null; }

    public String queryString() { return null; }

    public void setDefaultFormValueEncoding(String anEncoding) {}

    public String defaultFormValueEncoding() { return null; }

    public void setFormValueEncodingDetectionEnabled(boolean aFlag) {}

    public boolean isFormValueEncodingDetectionEnabled() { return true; }

    public String formValueEncoding() { return null; }

    protected void setFormValueEncoding(String value) {}

    public NSArray formValueKeys() { return null; }

    public Enumeration _formValueKeyEnumerator() { return null; }

    public NSArray formValuesForKey(String aKey) { return null; }

    public Object formValueForKey(String aKey) { return null; }

    public String stringFormValueForKey(String aKey) { return null; }

    public Number numericFormValueForKey(String aKey, NSNumberFormatter numericFormatter) { return null; }

    /**
     * @deprecated Method dateFormValueForKey is deprecated
     */

    public NSTimestamp dateFormValueForKey(String aKey, NSTimestampFormatter dateFormatter) { return null; }

    public NSTimestamp dateFormValueForKey(String aKey, SimpleDateFormat dateFormatter) { return null; }

    private String _cookieDescription() { return null; }

    private NSDictionary _cookieDictionary() { return null; }

    public NSArray cookieValuesForKey(String aKey) { return null; }

    public String cookieValueForKey(String aKey) { return null; }

    public NSDictionary cookieValues() { return null; }

    public NSArray cookies() { return null; }

    protected void _setIsUsingWebServer(boolean aBool) {}

    public boolean isUsingWebServer() { return true; }

    public boolean isAjaxSubmit() { return true; }

    public static String ajaxFormSubmitKey() { return null; }

    public static void setAjaxFormSubmitKey(String value) { return null; }

    public WODynamicURL _uriDecomposed() { return null; }

    public static boolean _lookForIDsInCookiesFirst() { return null; }

    public boolean _hasFormValues() { return true; }

    protected boolean isRequestFromFormSubmission() { return true; }

    protected NSDictionary getFormValuesFromURLEncoding() { return null; }

    protected boolean isWhitespaceOrNull(char value) { return true; }

    protected String removeCRLF(String value) { return null; }

    protected String detectFormValuesEncoding(String content) { return null; }

    public NSDictionary formValues() { return null; }

    protected NSMutableDictionary _formValues() { return null; }

    public String applicationURLPrefix() { return null; }

    public String _serverName() { return null; }

    public String _remoteAddress() { return null; }

    public String _serverPort() { return null; }

    public void _completeURLPrefix(StringBuffer aCompleteURL, boolean isSecure, int somePort) {}

    /**
     * @deprecated Method isFromClientComponent is deprecated
     */

    public boolean isFromClientComponent() { return true; }

    public String sessionID() { return null; }

    private boolean _isSessionIDinFormValues() { return true; }

    private boolean _isSessionIDinCookies() { return true; }

    private String _getSessionIDFromValuesOrCookie() { return null; }

    protected String _getSessionIDFromValuesOrCookie(boolean lookInCookiesFirst) { return null; }

    public boolean isSessionIDInRequest() { return true; }

    protected String contentType() { return null; }

    public int _contentLengthHeader() { return 0; }

    public boolean isMultipartFormData() { return true; }

    protected boolean useLegacyMultipart() { return true; }

    protected NSDictionary getFormValuesFromMultipartFormData() { return null; }

    public WOMultipartIterator multipartIterator() { return null; }

    public WOMultipartIterator _multipartIterator() { return null; }

    private boolean _iteratorAllowed() { return true; }

    private boolean _formValuesAllowed() { return true; }

    private boolean _streamAllowed() { return true; }

    static  {}

    protected String _method;
    private WODynamicURL _uriDecomposed;
    protected String _uri;
    private String _defaultFormValueEncoding;
    private String _formValueEncoding;
    protected NSMutableDictionary _formValues;
    private NSDictionary _cookie;
    private String _applicationURLPrefix;
    private NSArray _requestHandlerPathArray;
    private NSArray _browserLanguages;
    private Boolean _isSecure;
    private boolean _isUsingWebServer;
    private boolean _formValueEncodingDetectionEnabled;
    private int _applicationNumber;
    private int NOT_SET;
    private String CookieHeader;
    private String CookieHeaderIIS;
    private InetAddress _originatingAddress;
    private int _originatingPort;
    private InetAddress _acceptingAddress;
    private int _acceptingPort;
    private WOAdaptor _originatingAdaptor;
    private WOContext _context;
    protected boolean _finishedParsingMultipartFormData;
    protected boolean _firstFormValueInvocation;
    protected Boolean _legacyMultipart;
    protected WOMultipartIterator _multipartIterator;
    /**
     * @deprecated Field SessionIDKey is deprecated
     */
    public static final String SessionIDKey = "wosid";
    /**
     * @deprecated Field InstanceKey is deprecated
     */
    public static final String InstanceKey = "woinst";
    /**
     * @deprecated Field ApplicationInstanceKey is deprecated
     */
    public static final String ApplicationInstanceKey = "jsessionid";
    public static final String DataKey = "wodata";
    public static final String ContextIDKey = "wocid";
    public static final String SenderIDKey = "woeid";
    public static final String PageNameKey = "wopage";
    public static final String _IsmapCoords = "WOIsmapCoords";
    public static final String SingleInstanceIDString = "-1";
    public static final int SingleInstanceID = -1;
    public static final String ServerPortHeader = "SERVER_PORT";
    public static final String ServerPortHeaderX = "x-webobjects-server-port";
    public static final String ServerPortSecureValue = "443";
    private static String __AJAX_FORM_SUBMIT_KEY;
    private boolean _iteratorUsed;
    private boolean _formValuesUsed;
    private boolean _streamUsed;

}
