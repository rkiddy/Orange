package com.webobjects.webservices.client;
/**
 * A WOWebServiceClient provides a mechanism for introspecting and invoking Web service operations implemented using SOAP over HTTP. An instance of WOWebServiceClient maps roughly to the contents of a WSDL document: it will manage as many WOWebServices as the WSDL contains SOAP services.
 */
public class WOWebServiceClient{
    /**
     * Create and initialize an instance of WOWebServiceClient from aURL. aURL must be a valid URL pointing to a WSDL document describing a Web service.
     * Parameters:aURL - URL referring to a WSDL document
     */
    public WOWebServiceClient(java.net.URL aURL){
         //TODO codavaj!!
    }

    /**
     * Return the EngineConfiguration being used by the service named serviceName. Will return null if there is no service named serviceName, or throw an IllegalArgumentException if serviceName is null.
     */
    public org.apache.axis.EngineConfiguration engineConfigurationForServiceNamed(java.lang.String serviceName){
        return null; //TODO codavaj!!
    }

    /**
     * Invoke the operation operationName on the web service serviceName with parameters parameters. If operationName is a SOAP-RPC call, parameters should be a language array of the parameters expected by the remote method, in the order in which they are to be passed to the method. If operationName is a SOAP document style operation, parameters should contain the Element objects which will form the SOAP body. parameters may be null.
     * This method may return either an object, or a language array of objects.
     */
    public java.lang.Object invoke(java.lang.String serviceName, java.lang.String operationName, java.lang.Object[] parameters){
        return null; //TODO codavaj!!
    }

    /**
     * Return the object class to which DOM elements with name aQNameObject will be deserialized. Will return null if there is no deserializer registered for aQNameObject. This method always returns an Object class type, not a primitive class.
     */
    public java.lang.Class objectTypeForQName(java.lang.Object aQNameObject){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary containing a mapping of operation name to WOClientOperation instance for for all operations defined on the Web service named serviceName.
     */
    public com.webobjects.foundation.NSDictionary operationsDictionaryForService(java.lang.String serviceName){
        return null; //TODO codavaj!!
    }

    /**
     * Register aSerializerFactory for serializing objects of class aClass and aDeserializerFactory for deserializing DOM elements with QName aQName. Objects serialized by aSerializerFactory will have a QName of aQName. If a aSerializerFactory is null, only aDeserializerFactory will be registered, and vice versa.
     */
    public void registerFactoriesForClassWithQName(org.apache.axis.encoding.SerializerFactory sFactory, org.apache.axis.encoding.DeserializerFactory dFactory, java.lang.Class aClass, javax.xml.namespace.QName aQname){
        return; //TODO codavaj!!
    }

    /**
     * Returns the names of all WOWebServices controlled by this client.
     */
    public com.webobjects.foundation.NSArray serviceNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary containing a mapping of service name to WOWebServices.
     */
    public com.webobjects.foundation.NSDictionary servicesDictionary(){
        return null; //TODO codavaj!!
    }

    /**
     * Return an opaque SessionInfo object which can be used to transfer session information between instances of WOWebService. This can be used when invoking multiple Web services on a WebObjects application when a developer wishes to maintain a single session on the server. Will return null if there is no service named serviceName, or throw an IllegalArgumentException if serviceName is null.
     */
    public com.webobjects.webservices.client.WOWebService.SessionInfo sessionInfoForServiceNamed(java.lang.String serviceName){
        return null; //TODO codavaj!!
    }

    /**
     * Set the EngineConfiguration to used by the underlying Axis service object used by the service named serviceName. If the service has already been created, the existing instance will be freed. Will throw an IllegalArgumentException if either engineConfig or serviceName is null.
     */
    public void setEngineConfigurationForServiceNamed(org.apache.axis.EngineConfiguration engineConfig, java.lang.String serviceName){
        return; //TODO codavaj!!
    }

    /**
     * Register aDelegate as the security delegate for the service named serviceName. Will do nothing if there is no service named serviceName, or throw if serviceName is null.
     */
    public void setSecurityDelegateForServiceNamed(java.lang.Object aDelegate, java.lang.String serviceName){
        return; //TODO codavaj!!
    }

    /**
     * Sets the session information for the service named serviceName to the values in info. Will do nothing if there is no service named serviceName. Any existing session information in the service will be overwritten by the values in info.
     */
    public void setSessionInfoForServiceNamed(com.webobjects.webservices.client.WOWebService.SessionInfo info, java.lang.String serviceName){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the class to which DOM elements with name aQnameObject will be deserialized. Will return null if there is no deserializer registered for aQnameObject.
     */
    public java.lang.Class typeForQName(java.lang.Object aQnameObject){
        return null; //TODO codavaj!!
    }

}
