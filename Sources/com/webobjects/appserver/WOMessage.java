package com.webobjects.appserver;
/**
 * WOMessage is the parent class for both WORequest and WOResponse,and implements much of the behavior that is generic to both. WOMessage represents a message with an HTTP header and either HTML or XML content. HTML content is typically used when interacting with a Web browser, while XML content can be used in messages that originate from or are destined for another application -- either an application that "speaks" XML or another WebObjects application.
 * The methods of the WOMessage class can be divided primarily into two groups, those that deal with a message's content and those that read and set header information. Most of the remaining WOMessage methods control how the content is encoded and allow you to attach arbitrary "user info" to the WOMessage objects in order to pass information about a given message to other objects within the application.
 * Note: Headers are case-insensitive. WebObjects enforces the HTTP specification, but you should avoid mixing the case of header keys.
 * Because WOMessage objects usually correspond to HTTP requests and responses and fulfil the same function as these, the data they represent is mostly the same as that contained in an equivalent HTTP message. Thus an understanding of HTTP requests and responses is important for a good understanding of WOMessage and its subclasses. Version 1.1 of the HTTP protocol and its request format can be found in RFC 2616. Documentation for WOMessage and its subclasses assumes you have a good understanding of the information contained in this RFC and the Netscape cookie specification.
 * Cookie headers are parsed and returned as instances of WOCookie. If malformed cookies are received, and the property WOAcceptMalformedCookies is false, an exception will be thrown during parsing. If WOAcceptMalformedCookies is true, any cookies successfully parsed will be returned, and the remainder will be discarded. To change this behavior, override the method handleMalformedCookieString on WOApplication.
 * Note: Only Cookie headers are parsed; if you are receiving requests containing Set-cookie headers, you will have to implement your own parsing code. The WOMessage class also contains three methods that allow construction and interpretation of messages whose content is formatted as XML. appendContentDOMDocumentFragment allows you to build up an XML message piece by piece. setContentDOMDocument, on the other hand, allows you to specify the message's content all at once. To obtain the content of a message that is formatted as XML, use contentAsDOMDocument.
 * The arguments to these methods are XML documents or document fragments as defined by the Document Object Model (DOM). Installed as a part of WebObjects is the com. ibm.xml.dom package (IBM's alphaWorks), which contains various XML parsers for Java written by IBM. The included DOM parser is used to generate document and document fragment objects from XML data, or to manipulate and/or generate XML data from a document object). For more information on the Document Object Model, there is online documentation at http://www.w3.org/DOM/
 * See Also:WOMessage.contentEncoding(), WOMessage.setContentEncoding(String anEncoding), WOMessage.appendContentDOMDocumentFragment(org.w3c.dom.DocumentFragment aDocumentFragment), WOMessage.setContentDOMDocument(org.w3c.dom.Document aDocument), WOMessage.contentAsDOMDocument(), WORequest, WOResponse
 */
public class WOMessage implements com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, com.webobjects.foundation.NSKeyValueCodingAdditions{
    /**
     * Integer value corresponding to the HTTP 1.1 status code for "Forbidden".
     * See Also:Constant Field Values
     */
    public static final int HTTP_STATUS_FORBIDDEN=403;

    /**
     * Integer value corresponding to the HTTP 1.1 status code for "Found".
     * See Also:Constant Field Values
     */
    public static final int HTTP_STATUS_FOUND=302;

    /**
     * Integer value corresponding to the HTTP 1.1 status code for "Internal Server Error".
     * See Also:Constant Field Values
     */
    public static final int HTTP_STATUS_INTERNAL_ERROR=500;

    /**
     * Integer value corresponding to the HTTP 1.1 status code for "Moved permanently".
     * See Also:Constant Field Values
     */
    public static final int HTTP_STATUS_MOVED_PERMANENTLY=301;

    /**
     * Integer value corresponding to the HTTP 1.1 status code for "No content".
     * See Also:Constant Field Values
     */
    public static final int HTTP_STATUS_NO_CONTENT=204;

    /**
     * Integer value corresponding to the HTTP 1.1 status code for "Not found".
     * See Also:Constant Field Values
     */
    public static final int HTTP_STATUS_NOT_FOUND=404;

    /**
     * Integer value corresponding to the HTTP 1.1 status code for "OK".
     * See Also:Constant Field Values
     */
    public static final int HTTP_STATUS_OK=200;

    protected static final boolean[] map = new boolean[] { false };

    /**
     * This protected class variable contains a String identifying the default encoding to use when constructing responses, which is defined in WOMessage to be UTF8 (UTF-8). Pre-5.4, ISO-8859-1 was the default encoding setting.
     * Since: 5.4 See Also:Sun documentation on encodings
     */
    protected static java.lang.String TheDefaultResponseEncoding;

    /**
     * Construct and initialize a WOMessage with HTTP version 1.0 and string encoding ISO8859_1 (ISO Latin 1).
     */
    public WOMessage(){
         //TODO codavaj!!
    }

    /**
     * A convenience method that adds the specified WOCookie object to the WOMessage.
     */
    public void addCookie(com.webobjects.appserver.WOCookie aCookie){
        return; //TODO codavaj!!
    }

    /**
     * Appends the single ASCII character aCharacter to the message's content.
     * Should not be called if data has been added to the WOMessage's content using either setContent(NSData aData) or appendContent(NSData aData).
     */
    public void appendContentCharacter(char aCharacter){
        return; //TODO codavaj!!
    }

    /**
     * Appends the content of NSData someData to the message's content.
     */
    public void appendContentData(com.webobjects.foundation.NSData someData){
        return; //TODO codavaj!!
    }

    /**
     * Converts the supplied DOM document fragment to an XML string and appends it to the message's contents.
     * Should not be called if data has been added to the WOMessage's content using either setContent(NSData aData) or appendContent(NSData aData).
     */
    public void appendContentDOMDocumentFragment(org.w3c.dom.DocumentFragment aDocumentFragment){
        return; //TODO codavaj!!
    }

    /**
     * Appends the HTML attribute value passed in as aString to the HTTP content. Special HTML characters -- "
     * ", "
     * ", "&",\t,\n,\r, and double quote are escaped so that the browser does not interpret them.
     * Should not be called if data has been added to the WOMessage's content using either setContent(NSData aData) or appendContent(NSData aData).
     */
    public void appendContentHTMLAttributeValue(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Appends aString to the receiver's content. Special HTML characters -- "
     * ", "
     * ", "&", and double quote -- are escaped so that the browser does not interpret them.
     * Should not be called if data has been added to the WOMessage's content using either setContent(NSData aData) or appendContent(NSData aData).
     */
    public void appendContentHTMLString(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Appends aString to the receiver's content. The special HTML characters "
     * ", "
     * ", "&", and double-quote are not escaped so a browser will interpret them as HTML.
     * Should not be called if data has been added to the WOMessage's content using either setContent(NSData aData) or appendContent(NSData aData).
     */
    public void appendContentString(java.lang.String aString){
        return; //TODO codavaj!!
    }

    /**
     * Appends header to the list of header field-values in the receiver for the field-name key.
     * If there are no existing HTTP headers with field-name key, a new list is created, if there are one or more existing headers for key, the new value is appended to the existing list. See RFC 2616 for more than you could possibly want to know about HTTP headers.
     */
    public void appendHeader(java.lang.String header, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Appends headers to the list of header field-values in the receiver for the field-name key.
     * If there are no existing HTTP headers with field-name key, a new list is created, if there are one or more existing headers for key, the new values are appended to the existing list.
     * See RFC 2616 for more than you could possibly want to know about HTTP headers.
     */
    public void appendHeaders(java.util.List headers, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * WOMessage's implementation of this static method returns true, indicating that key-value coding is allowed to access fields in this object if an appropriate method isn't present.
     */
    public static boolean canAccessFieldsDirectly(){
        return false; //TODO codavaj!!
    }

    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the HTML content of the receiver as an NSData object.If the content was set as a String, the NSData returned will contain the bytes of the String encoded using contentEncoding.
     */
    public com.webobjects.foundation.NSData content(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the content of the receiver as a DOM document object.
     */
    public org.w3c.dom.Document contentAsDOMDocument() throws com.webobjects.appserver.WODOMParserException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String representing the encoding used for the message content. The current set of encodings supported is detailed at http://java.sun.com/j2se/1.3/docs/guide/intl/encoding.doc.html
     * For responses, you will want the response encoding to be the same as that used by the submitting form on the client browser. In this case it is preferable to use WORequest's formValueEncoding.
     * The default string encoding is ISO8859_1 (ISO Latin 1).
     */
    public java.lang.String contentEncoding(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the HTML content of the receiver as a String. If the content was set as an NSData, the String returned will be encoded using contentEncoding.
     */
    public java.lang.String contentString(){
        return null; //TODO codavaj!!
    }

    /**
     * A convenience method that returns an array of WOCookie objects to be included in the message, usually a WOResponse.
     */
    public com.webobjects.foundation.NSArray cookies(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the default character encoding used to construct a new WOMessage.
     * The default is UTF-8. Pre-5.4, ISO-8859-1 was the default encoding setting.
     */
    public static java.lang.String defaultEncoding(){
        return null; //TODO codavaj!!
    }

    /**
     * Encoding to be used when reading Http headers. Default is UTF-8
     */
    public static java.lang.String defaultHeaderEncoding(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the default encoding to use when converting the parameter list that appears in a WebObjects generated URL from transcoded ASCII to Unicode and vice versa. The default is UTF-8.
     */
    public static java.lang.String defaultURLEncoding(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the supplied Object is a WOMessage, or a subclass, whose headers and content equal those of the receiver.
     */
    public boolean equals(java.lang.Object aMessage){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked from valueForKey when it finds no property binding for key. The default implementation throws an NSKeyValueCoding.UnknownKeyException, with the target object(TargetObjectUserInfoKey) and key(UnknownUserInfokey) in the user info. An NSKeyValueCoding.ErrorHandling class can override this method to handle the query in some other way. The method can return a value, in which case that value is returned by the corresponding valueForKey invocation.
     */
    public java.lang.Object handleQueryWithUnboundKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked from takeValueForKey when it finds no property binding for key. The default implementation throws an NSKeyValueCoding.UnknownKeyException, with the target object(TargetObjectUserInfoKey) and key(UnknownUserInfoKey) in the user info dictionary of the exception. An NSKeyValueCoding.ErrorHandling class can override this method to handle the error in some other way.
     */
    public void handleTakeValueForUnboundKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Check if a header has been defined in the headers set
     */
    public boolean hasHeaderForKey(java.lang.Object aKey){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the HTTP header field-value corresponding to the field-name aKey. If there are multiple headers with the same field-name, only the first one is returned. Returns null if there are no headers with field-name aKey
     */
    public java.lang.String headerForKey(java.lang.Object aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the HTTP header field-value corresponding to the field-name aKey. If there are multiple headers with the same field-name, only the first one is returned. Returns defaultValue if there are no headers with field-name aKey
     */
    public java.lang.String headerForKey(java.lang.Object aKey, java.lang.String defaultValue){
        return null; //TODO codavaj!!
    }

    /**
     * Return the field-names for all headers that have been set, or null if none exist. You could easily test to see if a header is included by doing something similar to this: NSArray hKeys = aMessage.headerKeys(); if (hKeys.containsObject(
     * expires
     * )) { // do something }
     */
    public com.webobjects.foundation.NSArray headerKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary containing the WOMessage's HTTP headers.
     */
    public com.webobjects.foundation.NSDictionary headers(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns all HTTP header field-values corresponding to the field-name aKey.
     */
    public com.webobjects.foundation.NSArray headersForKey(java.lang.Object aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the version of HTTP used for the message (for example, "HTTP/1.0").
     */
    public java.lang.String httpVersion(){
        return null; //TODO codavaj!!
    }

    /**
     * A convenience method that removes the specified WOCookie object from the WOMessage.
     */
    public void removeCookie(com.webobjects.appserver.WOCookie aCookie){
        return; //TODO codavaj!!
    }

    /**
     * Removes all HTTP headers with the field-name aKey from the receiver.
     */
    public void removeHeadersForKey(java.lang.Object aKey){
        return; //TODO codavaj!!
    }

    /**
     * This protected class method takes a String and an array of characters and returns true if any of the characters in the character array are found in the String.
     */
    protected static boolean requiresHTMLEscaping(java.lang.String aString, char[] charactersString){
        return false; //TODO codavaj!!
    }

    /**
     * Sets the message content to the contents of the supplied byte array.
     */
    public void setContent(byte[] values){
        return; //TODO codavaj!!
    }

    /**
     * Sets the message content to the contents of the supplied character array.
     */
    public void setContent(char[] someContent){
        return; //TODO codavaj!!
    }

    /**
     * Sets the message content to someContent.
     */
    public void setContent(com.webobjects.foundation.NSData someContent){
        return; //TODO codavaj!!
    }

    /**
     * Sets the message content to the contents of the supplied String object.
     */
    public void setContent(java.lang.String someContent){
        return; //TODO codavaj!!
    }

    /**
     * Sets the XML content of the response to the DOM document aDocument.
     */
    public void setContentDOMDocument(org.w3c.dom.Document aDocument){
        return; //TODO codavaj!!
    }

    /**
     * Sets the encoding used for the message content. The current set of encodings supported is detailed at http://java.sun.com/j2se/1.3/docs/guide/intl/encoding.doc.html
     * For responses, you will want the response encoding to be the same as that used by the submitting form on the client browser. In this case it is preferable to use WORequest's formValueEncoding.
     * The default string encoding is ISO8859_1 (ISO Latin 1).
     */
    public void setContentEncoding(java.lang.String anEncoding){
        return; //TODO codavaj!!
    }

    /**
     * Lets you specify the default character encoding to be used when constructing a new WOMessage.
     */
    public static void setDefaultEncoding(java.lang.String aStringEncoding){
        return; //TODO codavaj!!
    }

    /**
     * Set the Encoding to be used when reading Http headers.
     */
    public static void setDefaultHeaderEncoding(java.lang.String headerEncoding){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default encoding to use when converting the parameter list that appears in a WebObjects generated URL from transcoded ASCII to Unicode and vice versa. The default is UTF-8, which will work for all languages. Unless you have good reasons for changing it, it is better to leave it alone. There might be one good reason for doing so: Compliance with bookmarked WebObjects generated URLs before 5.2. If your users have bookmarked an URL that contains a parameter list with ASCII characters of values greater than 127, then you would want to use this method to set encoding to "ISO-8859-1".
     */
    public static void setDefaultURLEncoding(java.lang.String anEncoding){
        return; //TODO codavaj!!
    }

    /**
     * Sets an HTTP header in the receiver with field-name aKey and value aString. If there are one or more existing headers with the field-name aKey, they are replaced. This method is commonly used to set the type of content in a response, for example:
     * aResponse.setHeader(
     * text/html
     * ,
     * content-type
     * ); .
     * See RFC 2616 for more than you could possibly want to know about HTTP headers.
     */
    public void setHeader(java.lang.String aString, java.lang.String aKey){
        return; //TODO codavaj!!
    }

    /**
     * Sets an HTTP header in the receiver with field-name aKey and values someStrings. If there are one or more existing headers with the field-name aKey, they are replaced.
     * See RFC 2616 for more than you could possibly want to know about HTTP headers.
     */
    public void setHeaders(java.util.List someStrings, java.lang.String aKey){
        return; //TODO codavaj!!
    }

    /**
     * Sets the HTTP headers in the receiver to the contents of the supplied NSDictionary object. This dictionary should be constructed such that its keys are the HTTP header field-names, and its values are NSMutableArrays containing the HTTP header field-values.
     * See RFC 2616 for more than you could possibly want to know about HTTP headers.
     */
    public void setHeaders(java.util.Map headerDictionary){
        return; //TODO codavaj!!
    }

    /**
     * Sets the version of HTTP used for the message (for example, "HTTP/1.0").
     */
    public void setHTTPVersion(java.lang.String aVersion){
        return; //TODO codavaj!!
    }

    /**
     * For WOAjaxHandlerRequests, the default is false.
     */
    public void setStorePageInBacktrackCache(boolean value){
        return; //TODO codavaj!!
    }

    /**
     * Sets a dictionary in the WOMessage object that can contain, as a convenience, any kind of information related to the current response. Objects further down the appendToResponse method chain can retrieve this information by invoking userInfo.
     * This method unconditionally makes an immutable copy of aDictionary. This can be a problem if changes made elsewhere to the dictionary's contents need to be reflected in the userInfo dictionary.
     * If you need to pass in a mutable dictionary that can be changed by other objects down the chain, wrap the mutable dictionary in a read-only (immutable) dictionary and pass the immutable dictionary as the argument to this method. Be extremely careful doing this if your application is multi-threaded and the userInfo data may be accessed by multiple threads.
     */
    public void setUserInfo(java.util.Map aDictionary){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value for key in the user info dictionary
     */
    public void setUserInfoForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * For WOAjaxHandlerRequests, this defaults to false.
     */
    public boolean storePageInBacktrackCache(){
        return false; //TODO codavaj!!
    }

    /**
     * Takes a String and, if escaping is required, returns a new String with certain characters escaped out. If escaping is not required, no conversion is performed and the original string is returned. This method is used to escape strings which will appear as attribute values of a tag. The escaped characters are: "
     * ", "
     * ", "&",\t,\n,\r, and double quote.
     */
    public static java.lang.String stringByEscapingHTMLAttributeValue(java.lang.String aString){
        return null; //TODO codavaj!!
    }

    /**
     * Takes a String and, if escaping is required, returns a new String with certain characters escaped out. If escaping is not required, no conversion is performed and the original string is returned. This method is used to escape strings which will appear in the visible part of an HTML file (that is, not inside a tag). The escaped characters are: "
     * ", "
     * ", "&", and double quote.
     */
    public static java.lang.String stringByEscapingHTMLString(java.lang.String aString){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Sets the value for the property identified by key to value.
     * The default implementation provided by NSKeyValueCoding.DefaultImplementation works as follows:
     * Searches for a public accessor method of the form setKey, and invokes it if there is one. If a public accessor method is not found, searches for a private accessor method of the form _setKey, and invokes it if there is one. If an accessor method is not found and the static method canAccessFieldsDirectly returns true, searches for a field based on key and sets its value directly. For the key "lastName", this would be _lastName, _isLastName, lastName, or isLastName. If the type of the value argument is not compatible with the underlying field or method parameter, the default implementation will make an effort to convert between different Java numeric types (Integer, Double, BigDecimal, etc) as well as between Boolean and Number (true = 1, false = 0). If any other conversion would be necessary, an exception is thrown. If neither an accessor method nor a field is found, it is an error condition. It invokes handleTakeValueForUnboundKey if the object implements NSKeyValueCoding.ErrorHandling or throws NSKeyValueCoding.UnknownKeyException if the object does not.
     * Note: : The default implementations have significant performance optimizations. To benefit from them, implement NSKeyValueCoding on a custom class as shown above by using the methods in NSKeyValueCoding. DefaultImplementation, or if your class inherits from an WebObjects class that implements NSKeyValueCoding, do not override the inherited implementation. Using a custom implementation incurs significant performance penalties.
     */
    public void takeValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Sets the value for the property identified by keyPath to value. A key path has the form relationship.property (with one or more relationships); for example "movieRole.roleName" or "movieRole.talent.lastName". The default implementation of this method (provided by NSKeyValueCodingAdditions.DefaultImplementation) gets the destination object for each relationship using valueForKey, and sends the final object a takeValueForKey message with value and property.
     */
    public void takeValueForKeyPath(java.lang.Object value, java.lang.String keyPath){
        return; //TODO codavaj!!
    }

    /**
     * Returns a String representation of the receiver. This string representation is suitable for debugging. It details many of the WOMessage object's attributes and should not be confused with the contentString method.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked from takeValueForKey when it is given a null value for a scalar property (such as an int or a float). The default implementation throws an IllegalArgumentException. You might want to implement the method (or override the inherited implementation) to handle the request in some other way, such as by substituting new Integer(0) or a sentinel value and invoking takeValueForKey again.
     */
    public void unableToSetNullForKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Return the userInfo dictionary. An object further upstream in the appendToResponse method chain can set this dictionary in the WOMessage object as a way to pass information to other objects.
     */
    public com.webobjects.foundation.NSDictionary userInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the value of the key in the user info dictionary
     */
    public java.lang.Object userInfoForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Retrieves the value of the property named by key.
     * The default implementation provided by NSKeyValueCoding.DefaultImplementation works as follows:
     * Searches for a public accessor method based on key. For example, with a key of "lastName", the method looks for a method named getLastName, lastName, or isLastName. If a public accessor method is not found, searches for a private accessor method based on key (a method preceded by an underbar). For example, with a key of "lastName", the method looks for a method named _getLastName, _lastName, or _isLastName If an accessor method is not found and the static method canAccessFieldsDirectly returns true, the method searches for a field based on key and returns its value directly. For the key "lastName", this would be _lastName, _isLastName, lastName, or isLastName. If neither an accessor method nor a field is found, the method invokes handleQueryWithUnboundKey (defined in NSKeyValueCoding.ErrorHandling).
     * Note: The default implementations have significant performance optimizations. To benefit from them, implement NSKeyValueCoding on a custom class as shown above by using the methods in NSKeyValueCoding.DefaultImplementation, or if your class inherits from an WebObjects class that implements NSKeyValueCoding, do not override the inherited implementation. Using a custom implementation incurs significant performance penalties.
     */
    public java.lang.Object valueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Retrieves the value of a property of the object at the end of the key path (a key path is a string of the form "key1.key2"). A key path has the form relationship.property (with one or more relationships); for example "movieRole.roleName" or "movieRole.talent.lastName". The default implementation of this method (provided by NSKeyValueCodingAdditions.DefaultImplementation) gets the destination object for each relationship using valueForKey, and returns the result of a valueForKey message to the final object.
     */
    public java.lang.Object valueForKeyPath(java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

}
