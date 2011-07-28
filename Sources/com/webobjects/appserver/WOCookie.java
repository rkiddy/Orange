
package com.webobjects.appserver;

import com.webobjects.foundation.*;
import java.io.*;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class WOCookie
    implements NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions, Serializable {


    /**
     * @deprecated Method cookieWithName is deprecated
     */

    public static WOCookie cookieWithName(String aName, String aValue, String aPath, String aDomain, NSTimestamp aDate, boolean isSecure) { return null; }

    /**
     * @deprecated Method cookieWithName is deprecated
     */

    public static WOCookie cookieWithName(String aName, String aValue, String aPath, String aDomain, int timeout, boolean isSecure) { return null; }

    /**
     * @deprecated Method cookieWithName is deprecated
     */

    public static WOCookie cookieWithName(String aName, String aValue) { return null; }

    public WOCookie(String aName, String aValue, String aPath, String aDomain, NSTimestamp aDate, boolean isSecure) { return null; }

    public WOCookie(String aName, String aValue, String aPath, String aDomain, int timeout, boolean isSecure) { return null; }

    public WOCookie(String aName, String aValue) { return null; }

    public String toString() { return null; }

    public String headerString() { return null; }

    String _headerString(boolean isRequest) { return null; }

    public String name() { return null; }

    public void setName(String aName) {}

    public String value() { return null; }

    public void setValue(String aValue) {}

    public String domain() { return null; }

    public void setDomain(String aDomain) {}

    public String path() { return null; }

    public void setPath(String aPath) {}

    public NSTimestamp expires() { return null; }

    public void setExpires(NSTimestamp aDate) {}

    public void setTimeOut(int timeout) {}

    public int timeOut() { return 0; }

    public boolean isSecure() { return true; }

    public void setIsSecure(boolean aBoolean) {}

    public static boolean canAccessFieldsDirectly() { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    public void writeObject(ObjectOutputStream out) throws IOException {}

    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    static  {}

    static final long serialVersionUID = 0x12855347L;
    String _name;
    String _value;
    String _domain;
    String _path;
    boolean _isSecure;
    NSTimestamp _expires;
    int _timeout;
    static final SimpleDateFormat TheDateFormat;

}
