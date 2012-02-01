package com.webobjects.appserver;
/**
 * Registers WebServices with WebObjects application.
 * Since: 5.2
 */
public class WOWebServiceRegistrar{
    /**
     * Used by Direct To WebServices to register operations
     */
    public static void registerD2WebServiceWithOperations(java.lang.String webServiceName, java.lang.String[] operations){
        return; //TODO codavaj!!
    }

    /**
     * Register aSerializerFactory for serializing objects of class aClass and aDeserializerFactory for deserializing DOM elements with QName aQName. Objects serialized by aSerializerFactory will have a QName of aQName. If a aSerializerFactory is null, only aDeserializerFactory will be registered, and vice versa.
     */
    public static void registerFactoriesForClassWithQName(javax.xml.rpc.encoding.SerializerFactory aSerializerFactory, javax.xml.rpc.encoding.DeserializerFactory aDeserializerFactory, java.lang.Class aClass, javax.xml.namespace.QName aQName){
        return; //TODO codavaj!!
    }

    /**
     * Expose all methods declared on webServiceClass as operations on a web service whose name is the non-qualified class name of webServiceClass.
     */
    public static void registerWebService(java.lang.Class webServiceClass, boolean isRPC){
        return; //TODO codavaj!!
    }

    /**
     * Expose all methods declared on webServiceClass as operations on a web service whose name is webServiceName.
     */
    public static void registerWebService(java.lang.String webServiceName, java.lang.Class webServiceClass, boolean isRPC){
        return; //TODO codavaj!!
    }

    /**
     * Expose methods listed in allowedMethods declared on webServiceClass as operations on a web service whose name is webServiceName.
     */
    public static void registerWebService(java.lang.String webServiceName, java.lang.Class webServiceClass, java.lang.String[] allowedMethods, boolean isRPC){
        return; //TODO codavaj!!
    }

    /**
     * Register an XSLT transformation for serviceName and operationName. All parameters must be non-null. The contents of the URL will be read at registration.
     */
    public static void registerXSLTForServiceAndOperation(java.net.URL aURL, java.lang.String serviceName, java.lang.String operationName){
        return; //TODO codavaj!!
    }

    /**
     * Register aDelegate as the security delegate for Axis.
     */
    public static void setSecurityDelegate(java.lang.Object aDelegate){
        return; //TODO codavaj!!
    }

    /**
     * Deregister the web service registered for webServiceClass. This method assumes that webServiceClass will be exposed under it's classname.
     */
    public static void unregisterWebService(java.lang.Class webServiceClass){
        return; //TODO codavaj!!
    }

    /**
     * Deregister the web service registered with the name webServiceName.
     */
    public static void unregisterWebService(java.lang.String webServiceName){
        return; //TODO codavaj!!
    }

}
