package com.webobjects.appserver;
/**
 * Utilities for working with WebObjects WebServices
 * Since: 5.2
 */
public class WOWebServiceUtilities{
    /**
     * Defaults to 'com.webobjects.webservices.OperationAttributes'
     * See Also:Constant Field Values
     */
    public static final java.lang.String WebServiceOperationAttributesKey="com.webobjects.webservices.OperationAttributes";

    public WOWebServiceUtilities(){
         //TODO codavaj!!
    }

    /**
     * This returns the current WOContext object for the current thread. If you call this from a different thread, it won't work.
     */
    public static com.webobjects.appserver.WOContext currentWOContext(){
        return null; //TODO codavaj!!
    }

    /**
     * This returns the QName object for the given class and namespace. It will return null if anything goes wrong anywhere. This will walk the inheritance and interface heirarchies to find a fit.
     */
    public static javax.xml.namespace.QName qNameForType(java.lang.Class javaType, java.lang.String namespaceURI){
        return null; //TODO codavaj!!
    }

    /**
     * As qnameStringForType, but only returns the localpart. This doesn't cache, so the lookup will happen with each invocation
     */
    public static java.lang.String qNameLocalPartStringForType(java.lang.Class javaType, java.lang.String namespaceURI){
        return null; //TODO codavaj!!
    }

    /**
     * As qnameStringForType, but only returns the namespaceURI. This doesn't cache, so the lookup will happen with each invocation.
     */
    public static java.lang.String qNameNamespaceURIStringForType(java.lang.Class javaType, java.lang.String namespaceURI){
        return null; //TODO codavaj!!
    }

    /**
     * This will return a string representing the Qname, or null if anything went wrong anywhere Form is (namespaceURI:)?localpart - so "localpart" or "namespaceURI:localpart". Don't parse based on the ":", as namespaceURI often includes a ":" as well (e.g. "http://webobjects") Instead, use qnameLocalPartStringForType or qnameNamespaceURIStringForType
     */
    public static java.lang.String qNameStringForType(java.lang.Class javaType, java.lang.String namespaceURI){
        return null; //TODO codavaj!!
    }

    /**
     * Maps QName to Class. Returns null if anything goes wrong.
     */
    public static java.lang.Class typeForQName(javax.xml.namespace.QName qname, java.lang.String namespaceURI){
        return null; //TODO codavaj!!
    }

}
