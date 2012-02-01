package com.webobjects.appserver;
/**
 * A request object represents an event that requires a reaction from a WebObjects application. In fact, a WebObjects application can be defined as something that receives request objects, handles them, and returns appropriate responses.
 * Usually, request objects are generated when users performs actions in their web browsers such as entering the URL of a WebObjects application or clicking on a hyperlink, button, or image map in a WebObjects application page. Such actions causes the browser to send an HTTP request to an HTTP server, which forwards that HTTP request to a WebObjects adaptor, which converts it to a request object and sends that to the application. Request objects can also be created from HTTP requests sent by client-side components, Java applets, or applications that use the Java classes supplied with WebObjects to interact with a WebObjects application -- and from HTTP requests submitted by custom written client-side programs that don't use the Java client-side component classes. Finally, but more rarely, request objects can be created by custom written adaptors that handle HTTP requests or non-HTTP events. All the adaptors shipped with WebObjects handle HTTP events only.
 * Since request objects are usually created by an adaptor, and since you will usually be able to use WebObjects adaptors without modifications, you will probably not have to create instances of WORequest or its subclasses in your code, though you can if you need to. More typically, your code will be obtaining information from request objects provided to it by the WebObjects Framework. The application supplies WORequest objects as arguments in the takeValuesFromRequest and invokeActionForRequest methods, which are implementable by WOApplication, WOSession, WOComponent, and WOElement objects. You can also obtain the current WORequest object at any time during request handling through WOContext's request method. Request objects can also be obtained at any time during request handling through methods on WOContext. See these classes for more details.
 * Note: WORequest inherits from WOMessage. Of particular interest are those WOMessage methods that allow you to access the request headers -- headerforkey, headerKeys, headers, and headersForKey -- and content and contentAsDOMDocument, which return the contents of the request.
 * As stated above, in most WebObjects applications WORequest objects are created for user; the application is more concerned with interpreting and responding to WORequest objects. However, it is possible to place two WebObjects applications in a peer-to-peer configuration and have them communicate using WORequest and WOResponse objects. In situations like these, the application will need to create the WORequest objects itself and send them to the peer application using WOHTTPConnection.
 * The methods declared directly on WORequest allow the user to extract information from a WORequest object. WORequest inherits a number of methods from WOMessage, however, that allow the user to programmatically specify the contents of a request. In particular, the appendContent and setContent methods in the WOMessage class are designed to do this.
 * See Also:WOContext.request(), WOMessage.headerForKey(Object aKey), WOMessage.headerKeys(), WOMessage.headers(), WOMessage.headersForKey(Object aKey), WOMessage.content(), WOMessage
 */
public class WORequest extends com.webobjects.appserver.WOMessage implements java.lang.Cloneable{
    /**
     * Deprecated.
     * String key used to obtain the application unique instance identifier from a request using methods like formValueForKey(String) and cookieValueForKey(String).
     * Since: 5.4 See Also:WOApplication.sessionIdKey(), Constant Field Values
     */
    public static final java.lang.String ApplicationInstanceKey="jsessionid";

    /**
     * String used by the WOComponentRequestHandler to store and retrieve the request's context ID from an NSDictionary.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ContextIDKey="wocid";

    /**
     * String key used to obtain a key from another request. You use this second key either to retrieve cached data from the WOResourceManager or to construct a query with which you can obtain a URL to the request data using WOContext's urlWithRequestHandlerKeymethod). Use Methods like formValueForKey(String) and cookieValueForKey(String) when querying the request with the DataKey.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DataKey="wodata";

    /**
     * Deprecated.
     * String key used to obtain the application instance number from a request using methods like formValueForKey(String) and cookieValueForKey(String).
     * Since: 5.4 See Also:WOApplication.instanceIdKey(), Constant Field Values
     */
    public static final java.lang.String InstanceKey="woinst";

    /**
     * String used by the WOComponentRequestHandler to store to and retrieve from an NSDictionary the request's page name.
     * See Also:Constant Field Values
     */
    public static final java.lang.String PageNameKey="wopage";

    /**
     * String used by the WOComponentRequestHandler to store to and retrieve from an NSDictionary the request's sender ID.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SenderIDKey="woeid";

    /**
     * Defaults to SERVER_PORT
     * Since: 5.4 See Also:Constant Field Values
     */
    public static final java.lang.String ServerPortHeader="SERVER_PORT";

    /**
     * Defaults to x-webobjects-server-port
     * Since: 5.4 See Also:Constant Field Values
     */
    public static final java.lang.String ServerPortHeaderX="x-webobjects-server-port";

    /**
     * Defaults to 443
     * Since: 5.4 See Also:Constant Field Values
     */
    public static final java.lang.String ServerPortSecureValue="443";

    /**
     * Deprecated.
     * String key used to obtain the session ID from a request using methods like formValueForKey(String) and cookieValueForKey(String).
     * Since: 5.4 See Also:WOApplication.sessionIdKey(), Constant Field Values
     */
    public static final java.lang.String SessionIDKey="wosid";

    /**
     * int, containing the application number used by applications deployed in single instance mode.
     * See Also:Constant Field Values
     */
    public static final int SingleInstanceID=-1;

    /**
     * String containing the application number used by applications deployed in single instance mode.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SingleInstanceIDString="-1";

    protected WORequest(){
         //TODO codavaj!!
    }

    /**
     * Returns a WORequest object initialized with the specified parameters. The first three arguments are required:
     * aMethod must be either "GET", "POST" or "HEAD". Additional methods can be allowed by using a custom subclass. aURL a URL. anHTTPVersion the HTTP version string. Typically "HTTP/1.0" or "HTTP/1.1".
     * If any of the above three arguments are omitted, the constructor throws an exception.
     * The remaining arguments are optional; if null is specified, the constructor will either substitute default values or initialize them to null. If not null, the someHeaders argument should be a dictionary whose String keys correspond to header field-names and whose values are arrays of one or more strings corresponding to the field-value(s) of each header. The aDictionary dictionary can contain any information that the WORequest object wants to pass along to other objects involved in handling the request.
     * Parameters:aMethod - a "GET", "POST" or "HEAD", may not be null. If null, or not one of the allowed methods, an IllegalArgumentException will be thrown.aURL - a URL, may not be null or an IllegalArgumentException will be thrown.anHTTPVersion - the version of HTTP used when sending the message, may not be null or an IllegalArgumentException will be thrown.someHeaders - a dictionary whose String keys correspond to header names and whose values are arrays of one or more strings corresponding to the values of each headeraContent - the HTML contentaUserInfoDictionary - java.util.Map that contains any information that the WORequest object wants to pass along to other objectsSee Also:WORequest.method(), WOMessage.httpVersion(), WOMessage.content(), WOMessage.userInfo(), WOMessage.headers()
     */
    public WORequest(java.lang.String aMethod, java.lang.String aURL, java.lang.String anHTTPVersion, java.util.Map someHeaders, com.webobjects.foundation.NSData aContent, java.util.Map aUserInfoDictionary){
         //TODO codavaj!!
    }

    /**
     * Returns a String containing the part of the request's URI that is specific to a particular adaptor. This is typically a URL ending in "/WebObjects","/WebObjects.exe", "/WebObjects.dll", or uppercase versions of these strings. WebObjects uses a request's adaptor prefix to set the adaptor prefix in the generated response's URL.
     * A WORequest must always have an adaptor prefix specified: if the application is contacted using direct connect and an adaptor prefix is not supplied, the value returned by WOApplication's cgiAdaptorURL method will be used.
     */
    public java.lang.String adaptorPrefix(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the key used in the form values to identify a AJAX form sumit. This is necessary asin some case the form is hidden.
     */
    public static java.lang.String ajaxFormSubmitKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the name of the application taken from the URI. This name does not include the ".woa" extension of an application directory. A WORequest must always have an application name specified: If the application is contacted using direct connect and an application name is not supplied, the value returned by WOApplication's name method will be used.
     */
    public java.lang.String applicationName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the part of the request's URI indicating the specific application instance this request is intended for. This attribute is -1 if the request can be handled by any instance of the application, which is always the case for the first request in a session, or for applications contacted using direct connect.
     */
    public int applicationNumber(){
        return 0; //TODO codavaj!!
    }

    /**
     * Return the prefix of the URL used to access the application instance up to and including the application number. This will contain the adaptorPrefix, the applicationName, and the applicationNumber.
     */
    public java.lang.String applicationURLPrefix(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the language preference list as sent by the client, generally a browser.
     */
    public com.webobjects.foundation.NSArray browserLanguages(){
        return null; //TODO codavaj!!
    }

    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the content of this request, represented as an InputStream, if the content has not been accessed in any other manner. Thus, if content or contentData have been invoked previously, this method will return null. In general, this means that this will only be useful for some DirectActions.
     * This method will also return null if : 1. This WORequest is of type multipart/form-data, AND 2. either formValues or the multipartIterator were called previously.
     * To be able to use this method in a Direct Action, you must access the Direct Action through the streamActionRequestHandlerKey() defined in WOApplication. This key defaults to "wis". In addition, the session (if any) can only be located in the URL or the cookies of the request, never in the form values. Because this API is expected to supercede all other methods of accessing the content of the request, do not expect the content to be parsed in any way.
     */
    public java.io.InputStream contentInputStream(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the value of the content type header.
     */
    protected java.lang.String contentType(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the context for the request. Note this create the context it it was not already initialized.
     */
    public com.webobjects.appserver.WOContext context(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing all cookies packaged as WOCookie objects.
     */
    public com.webobjects.foundation.NSArray cookies(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the first value in the request for the given cookie name as specified by aKey. Names are case sensitive.
     * For more information about cookies, please see the Netscape cookie specification at: http://www.netscape.com/newsref/std/cookie_spec.html
     */
    public java.lang.String cookieValueForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary containing the values for all cookies in the request.
     * For more information about cookies, please see the Netscape cookie specification at: http://www.netscape.com/newsref/std/cookie_spec.html
     */
    public com.webobjects.foundation.NSDictionary cookieValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns all values for the given cookie name specified by aKey. Names are case sensitive.
     * For more information about cookies, please see the Netscape cookie specification at: http://www.netscape.com/newsref/std/cookie_spec.html
     */
    public com.webobjects.foundation.NSArray cookieValuesForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Method to return an NSTimestamp for a form value from the request for a specific name (key). This convenience method looks for a particular key and coerces the value into the proper time format using the NSTimestampFormatter provided. It will return null if it can't cast the form value into a valid NSTimestamp or if the key can't be found.
     */
    public com.webobjects.foundation.NSTimestamp dateFormValueForKey(java.lang.String aKey, com.webobjects.foundation.NSTimestampFormatter dateFormatter){
        return null; //TODO codavaj!!
    }

    /**
     * Method to return an NSTimestamp for a form value from the request for a specific name (key). This convenience method looks for a particular key and coerces the value into the proper time format using the NSTimestampFormatter provided. It will return null if it can't cast the form value into a valid NSTimestamp or if the key can't be found.
     */
    public com.webobjects.foundation.NSTimestamp dateFormValueForKey(java.lang.String aKey, java.text.SimpleDateFormat dateFormatter){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the default string encoding the WORequest object uses for converting form values from ASCII to Unicode. It uses the default encoding only when it can detect no encoding from the ASCII form values or if encoding detection is disabled. The current set of encodings supported is detailed in http://java.sun.com/j2se/1.3/docs/guide/intl/encoding.doc.html If no default form-value encoding is set, WOMessage's defaultEncoding is used.
     */
    public java.lang.String defaultFormValueEncoding(){
        return null; //TODO codavaj!!
    }

    /**
     * Return detected encoding for form values
     */
    protected java.lang.String detectFormValuesEncoding(java.lang.String content){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the encoding last used to convert form values from ASCII to Unicode. This encoding is either the result of an earlier detection of form-value encoding or the default form value encoding.
     */
    public java.lang.String formValueEncoding(){
        return null; //TODO codavaj!!
    }

    /**
     * Return an Object representing the form value for aKey. If there are multiple form values identified by the same name, only one of the values is returned, and which of these values is not defined. You should use this method for names (keys) that you know occur only once in the name/value pairs of form data.
     */
    public java.lang.Object formValueForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the names (or keys) used to access the values in a form. The returned array is not sorted in any particular order, and is not necessarily sorted in the same order on successive invocations of this method.
     */
    public com.webobjects.foundation.NSArray formValueKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary containing all of the form data with names for keys and NSArrays containing the value(s) associated with those keys for values. This array is not sorted in any particular order, and is not necessarily sorted in the same order on successive invocations of this method.
     * If this request represents multipart form data, this method behaves differently. In particular, when invoked, it parses the content (using a WOMultipartIterator) until it reaches the first file upload, indicated by the presence of a "filename" sub-header in the content-disposition form headers. It will place that form part into the form values. If that file has been read into memory or the content read in some other way, it continues iterating. Otherwise, it stops there. Subsequent calls to formValues will continue the parsing, when possible.
     * When contentInputStream is invoked before this method, and this WORequest represents multipart form data, an IllegalStateException is thrown.
     * The original behavior of this method, which is to read the entire request content into memory and parse it for form values, can be restored by setting the System property "WOUseLegacyMultipartParser" to true. In this case, the WOMultipartIterator will not be accessible, and all the form values will be parsed completely the first time this method is called.
     */
    public com.webobjects.foundation.NSDictionary formValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the String form values associated with the given key. The returned array is not sorted in any particular order, and is not necessarily sorted in the same order on successive invocations of this method. You should use this method when you know that a name (key) used for accessing form data can be matched with more than one value.
     */
    public com.webobjects.foundation.NSArray formValuesForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the form values from the multipart iterator.
     */
    protected com.webobjects.foundation.NSDictionary getFormValuesFromMultipartFormData(){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.foundation.NSDictionary getFormValuesFromURLEncoding(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the request is using an AJAX request, false otherwise.
     */
    public boolean isAjaxSubmit(){
        return false; //TODO codavaj!!
    }

    /**
     * Return whether or not automatic detection of form value encoding is enabled. When detection is enabled, a WORequest object scans the ASCII form values and applies heuristics to decide which is the best encoding to use. If no specific encoding is discernible, or if detection is disabled, the WORequest uses the default form value encoding for the conversion.
     */
    public boolean isFormValueEncodingDetectionEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Deprecated.
     */
    public boolean isFromClientComponent(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if this WORequest represents multipart form data. Essentially, it checks the value of the content-type header for the type "multipart/form-data".
     */
    public boolean isMultipartFormData(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks is the request is the result of a Form submission.
     */
    protected boolean isRequestFromFormSubmission(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the secure state of the request
     */
    public boolean isSecure(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the session ID can be obtained from the request Note that the session ID may either be included among the form values or encapsulated within a cookie. WORequest's session() method is used to retrieve the value of the session ID from the request.
     */
    public boolean isSessionIDInRequest(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the request is using a webserver, false otherwise.
     */
    public boolean isUsingWebServer(){
        return false; //TODO codavaj!!
    }

    /**
     * Detect if a char is a whitespace or null character
     */
    protected boolean isWhitespaceOrNull(char value){
        return false; //TODO codavaj!!
    }

    /**
     * A WORequest's method defines where it will look for form values. The only currently supported methods are "GET", "POST" and "HEAD", which have the same meaning as the HTTP request method tokens of the same name.
     */
    public java.lang.String method(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the WOMultipartIterator for this request. If this request does not represent multipart form-data, this method returns null; otherwise if contentInputStream has been called previously, this method returns null.
     */
    public com.webobjects.appserver.WOMultipartIterator multipartIterator(){
        return null; //TODO codavaj!!
    }

    /**
     * Method to return a Number for a form value from the request for a specific name (key). This convenince method looks for a particular key and coerces the value into the proper numeric format using the NSNumberFormatter provided. It will return null if it can't cast the form value into a Number or if the key can't be found.
     */
    public java.lang.Number numericFormValueForKey(java.lang.String aKey, com.webobjects.foundation.NSNumberFormatter numericFormatter){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the adaptor that originated this request or null if this request was not created by an Adaptor.
     */
    public com.webobjects.appserver.WOAdaptor originatingAdaptor(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns, as a String, the query string of the URI. This contains everything appearing in the URI after a '?'. Returns null if there is no query string.
     */
    public java.lang.String queryString(){
        return null; //TODO codavaj!!
    }

    /**
     * Process given string with CRLF chars removed
     */
    protected java.lang.String removeCRLF(java.lang.String value){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String identifying the request handler that will process the request. This String cannot be null. The requestHandlerKey occurs in the URI after the applicationName and applicationNumber, if one exists.
     */
    public java.lang.String requestHandlerKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the part of the URL which identifies, for a given request handler, which information is requested. Different request handlers use this part of the URL in different ways. The request handler path is everything in the URI between the requestHandlerKey and the queryString.
     */
    public java.lang.String requestHandlerPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the request handler path decomposed into elements. The request handler path is everything in the URI between the requestHandlerKey and the queryString. This String is broken into tokens using '/' as a delimiter.
     */
    public com.webobjects.foundation.NSArray requestHandlerPathArray(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the session ID if there is one. This method first looks for the session ID in the URL, then checks the form values, and finally checks to see if the session ID is stored in a cookie.
     */
    public java.lang.String sessionID(){
        return null; //TODO codavaj!!
    }

    /**
     * Set the key in the form values used to identify a AJAX form sumit. This is necessary asin some case the form is hidden.
     */
    public static void setAjaxFormSubmitKey(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the context for the request.
     */
    public void setContext(com.webobjects.appserver.WOContext value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default string encoding for the receiver to use when converting its form values from ASCII to Unicode. The default string encoding is used if the WORequest cannot detect an encoding from the ASCII form values or if encoding detection is disabled. The current set of encodings supported is detailed in http://java.sun.com/j2se/1.3/docs/guide/intl/encoding.doc.html If no default form value encoding is explicitly set, the WORequest uses WOMessage's defaultEncoding.
     */
    public void setDefaultFormValueEncoding(java.lang.String anEncoding){
        return; //TODO codavaj!!
    }

    /**
     * Sets the form value encoding
     */
    protected void setFormValueEncoding(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Enables or disables automatic detection of the best encoding for the receiver to use when it converts form values from ASCII to Unicode. When detection is enabled, a WORequest object scans the ASCII form values and applies heuristics to decide which is the best encoding to use. If no specific encoding is discernible, or if detection is disabled, the WORequest uses the default form value encoding for the conversion.
     */
    public void setFormValueEncodingDetectionEnabled(boolean aFlag){
        return; //TODO codavaj!!
    }

    /**
     * Method to return a String form value from the request for a specific name (key). This method looks for a particular key and only returns a string value if the form value has a length greater than zero. Otherwise it returns null.
     */
    public java.lang.String stringFormValueForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string version of the receiver for use when debugging. The returned String includes the URI, information on how the form values are encoded, and the form values themselves.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the Uniform Resource Identifier (URI) the WORequest was initialized with. For a session's first request, the URI indicates the resource that the request is seeking -- such as a WebObjects application. For subsequent requests in the session, the URI indicates which page of the application should handle the request. If the request was caused -- as is usually the case -- by a web browser submitting a URL to an HTTP server, the URI is that part of the URL that follows the port number.
     * Because the format of WebObjects URLs and the corresponding request URI might change between different versions of WebObjects, you should not attempt to parse the URI returned by this method. Instead, use WORequest's accessor methods to access particular URI/URL components.
     */
    public java.lang.String uri(){
        return null; //TODO codavaj!!
    }

    protected boolean useLegacyMultipart(){
        return false; //TODO codavaj!!
    }

}
