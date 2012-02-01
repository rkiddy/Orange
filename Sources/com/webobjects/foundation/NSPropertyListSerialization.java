package com.webobjects.foundation;
/**
 * This class provides static methods that convert between property lists and their string representations, which can be either strings or NSData objects. A property list is a structure that represents organized data. It can be built from a combination of NSArray, NSDictionary, String, and NSData objects.
 * The string representation can be in XML or the ASCII plist format. To distinguish between the two formats, the parser that converts strings to property lists finds out whether the string starts with ?xml. A discussion of the ASCII plist format, A Primer on ASCII Property Lists, is available in the Mac OS X section of the Apple Developer Connection website. A discussion of XML property lists, Property List Services, is also available in the same area of the Apple Developer Connection website.
 * The NSPropertyListSerialization class cannot be instantiated.
 * See Also:NSPropertyListSerialization.booleanForString(java.lang.String), NSPropertyListSerialization.intForString(java.lang.String)
 */
public class NSPropertyListSerialization{
    /**
     * Convenience for methods to convert to xml plist. Returns true..
     * See Also:Constant Field Values
     */
    public static final boolean ForceXML=true;

    /**
     * Convenience for methods to convert to plist. Returns true..
     * See Also:Constant Field Values
     */
    public static final boolean Indents=true;

    /**
     * Convenience for methods to convert to plist. Returns false.
     * See Also:Constant Field Values
     */
    public static final boolean NoIndents=false;

    /**
     * Parses the property list representation string and returns the resulting property list as an NSArray.
     */
    public static com.webobjects.foundation.NSArray arrayForString(java.lang.String value){
        return null; //TODO codavaj!!
    }

    /**
     * Parses the property list representation string and returns the resulting property list as an NSArray.
     */
    public static com.webobjects.foundation.NSArray arrayForString(java.lang.String value, boolean forceXML){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a java.net.URL into a property list and returns the resulting property list as an NSArray.
     */
    public static com.webobjects.foundation.NSArray arrayWithPathURL(java.net.URL url){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a java.net.URL into a property list and returns the resulting property list as an NSArray.
     */
    public static com.webobjects.foundation.NSArray arrayWithPathURL(java.net.URL url, boolean forceXML){
        return null; //TODO codavaj!!
    }

    /**
     * Parses a given string for boolean value according to the table below.
     * String Result "YES" true "true" true any other value false
     * The tests for "YES" and "true" are case insensitive.
     */
    public static boolean booleanForString(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Converts the property list object into a string and returns it as an NSData object. This method uses the platform's default character encoding to convert the result string to byte.
     */
    public static com.webobjects.foundation.NSData dataFromPropertyList(java.lang.Object plist){
        return null; //TODO codavaj!!
    }

    /**
     * Converts the property list object into a string using a character encoding and returns it as an NSData object.
     */
    public static com.webobjects.foundation.NSData dataFromPropertyList(java.lang.Object plist, java.lang.String encoding){
        return null; //TODO codavaj!!
    }

    /**
     * Parses the property list representation string and returns the resulting property list as an NSDictionary.
     */
    public static com.webobjects.foundation.NSDictionary dictionaryForString(java.lang.String value){
        return null; //TODO codavaj!!
    }

    /**
     * Parses the property list representation string and returns the resulting property list as an NSDictionary.
     */
    public static com.webobjects.foundation.NSDictionary dictionaryForString(java.lang.String value, boolean forceXML){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a java.net.URL into a property list and returns the resulting property list as an NSDictionary.
     */
    public static com.webobjects.foundation.NSDictionary dictionaryWithPathURL(java.net.URL url){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a java.net.URL into a property list and returns the resulting property list as an NSDictionary.
     */
    public static com.webobjects.foundation.NSDictionary dictionaryWithPathURL(java.net.URL url, boolean forceXML){
        return null; //TODO codavaj!!
    }

    /**
     * Parses a given string and returns the corresponding integer value.
     */
    public static int intForString(java.lang.String value){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Converts an NSData into a property list and returns it.
     * This method uses the platform's default character encoding to convert the bytes in data byte array to characters in a string representation.
     */
    public static java.lang.Object propertyListFromData(com.webobjects.foundation.NSData data){
        return null; //TODO codavaj!!
    }

    /**
     * Converts an NSData into a property list using a character encoding and returns it.
     */
    public static java.lang.Object propertyListFromData(com.webobjects.foundation.NSData data, java.lang.String encoding){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a string into a property list and returns it.
     */
    public static java.lang.Object propertyListFromString(java.lang.String string){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a string into a property list and returns it.
     */
    public static java.lang.Object propertyListFromString(java.lang.String string, boolean forceXML){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a java.net.URL into a property list and returns it.
     */
    public static java.lang.Object propertyListWithPathURL(java.net.URL url){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a java.net.URL into a property list and returns it.
     */
    public static java.lang.Object propertyListWithPathURL(java.net.URL url, boolean forceXML){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a property list object into a string (old style plist) and returns it. All entries are indented.
     */
    public static java.lang.String stringFromPropertyList(java.lang.Object plist){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a property list object into a string (old style plist) and returns it.
     */
    public static java.lang.String stringFromPropertyList(java.lang.Object plist, boolean indents){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a property list object into an XML string and returns it. All entries are indented.
     */
    public static java.lang.String xmlStringFromPropertyList(java.lang.Object plist){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a property list object into an XML string and returns it.
     */
    public static java.lang.String xmlStringFromPropertyList(java.lang.Object plist, boolean indents){
        return null; //TODO codavaj!!
    }

}
