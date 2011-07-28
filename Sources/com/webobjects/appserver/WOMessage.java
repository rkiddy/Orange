
package com.webobjects.appserver;

import com.webobjects.appserver._private.WOHTTPHeadersDictionary;
import com.webobjects.appserver._private.WOURLEncoder;
import com.webobjects.foundation.*;
import java.io.UnsupportedEncodingException;
import java.util.*;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;


public class WOMessage
    implements NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions {


    public WOMessage() { return null; }

    public static String defaultEncoding() { return null; }

    public static void setDefaultEncoding(String aStringEncoding) { return null; }

    public static void setDefaultURLEncoding(String anEncoding) { return null; }

    public static String defaultURLEncoding() { return null; }

    public static String defaultHeaderEncoding() { return null; }

    public static void setDefaultHeaderEncoding(String headerEncoding) { return null; }

    public Object clone() { return null; }

    public void setHTTPVersion(String aVersion) {}

    public String httpVersion() { return null; }

    public void setUserInfo(Map aDictionary) {}

    public NSDictionary userInfo() { return null; }

    public Object userInfoForKey(String key) { return null; }

    public void setUserInfoForKey(Object value, String key) {}

    public void setHeaders(List someStrings, String aKey) {}

    public void setHeader(String aString, String aKey) {}

    public void appendHeader(String header, String key) {}

    public void removeHeadersForKey(Object aKey) {}

    public NSArray headerKeys() { return null; }

    public NSArray headersForKey(Object aKey) { return null; }

    public String headerForKey(Object aKey) { return null; }

    public String headerForKey(Object aKey, String defaultValue) { return null; }

    public boolean hasHeaderForKey(Object aKey) { return true; }

    public NSDictionary headers() { return null; }

    public void _finalizeCookies() {}

    public void setHeaders(Map headerDictionary) {}

    public void _setHeaders(WOHTTPHeadersDictionary headerDictionary) {}

    public void appendHeaders(List headers, String key) {}

    public void setContent(byte values[]) {}

    public void setContent(char someContent[]) {}

    public void setContent(NSData someContent) {}

    public void setContent(String someContent) {}

    public String contentString() { return null; }

    public NSData content() { return null; }

    public String contentEncoding() { return null; }

    public void setContentEncoding(String anEncoding) {}

    private void _initContent() {}

    public void appendContentData(NSData someData) {}

    public void _appendContentAsciiString(String aString) {}

    public void appendContentCharacter(char aCharacter) {}

    public void appendContentString(String aString) {}

    protected static boolean requiresHTMLEscaping(String aString, char charactersString[]) { return null; }

    public void appendContentHTMLString(String aString) {}

    public void appendContentHTMLAttributeValue(String aString) {}

    protected int _contentLength() { return 0; }

    public String toString() { return null; }

    protected NSMutableArray _initCookies() { return null; }

    public void addCookie(WOCookie aCookie) {}

    public void removeCookie(WOCookie aCookie) {}

    public NSArray cookies() { return null; }

    protected static String _stringByEscapingString(String aString, char charactersString[], String escapeSequences[]) { return null; }

    public static String stringByEscapingHTMLString(String aString) { return null; }

    public static String stringByEscapingHTMLAttributeValue(String aString) { return null; }

    public boolean equals(Object aMessage) { return true; }

    public Document contentAsDOMDocument() throws WODOMParserException { return null; }

    public void appendContentDOMDocumentFragment(DocumentFragment aDocumentFragment) {}

    public void setContentDOMDocument(Document aDocument) {}

    public static boolean canAccessFieldsDirectly() { return null; }

    public boolean storePageInBacktrackCache() { return true; }

    public void setStorePageInBacktrackCache(boolean value) {}

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    static  {}

    protected String _httpVersion;
    protected Map _httpHeaders;
    protected static String _headerEncoding;
    protected NSMutableArray _cookies;
    protected String _contentEncoding;
    protected Map _userInfo;
    protected Boolean _storePageInBacktrackCache;
    protected StringBuilder _content;
    protected NSMutableData _contentData;
    private static char TheHTMLAttributeReservedCharactersString[];
    private static String TheHTMLAttributeReservedEscapeSequences[];
    private static char TheHTMLStringReservedCharactersString[];
    private static String TheHTMLStringReservedEscapeSequences[];
    protected static String TheDefaultResponseEncoding;
    protected static String _TheSetCookieKey;
    protected static String _TheCookieKey;
    public static final int HTTP_STATUS_OK = 200;
    public static final int HTTP_STATUS_NO_CONTENT = 204;
    public static final int HTTP_STATUS_MOVED_PERMANENTLY = 301;
    public static final int HTTP_STATUS_FOUND = 302;
    public static final int HTTP_STATUS_FORBIDDEN = 403;
    public static final int HTTP_STATUS_NOT_FOUND = 404;
    public static final int HTTP_STATUS_INTERNAL_ERROR = 500;
    private int INIT_DATA_CAPACITY;
    protected static final boolean map[];

}
