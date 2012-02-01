package com.webobjects.webservices.client;
/**
 * A WOWebService represents a single SOAP HTTP service as defined in a WSDL document. It can be used to introspect the operations implemented on the Web service, or to create a call which can be used to invoke a given operation. A WOWebService is capable of maintaing session state through multiple invocations of operations on the Web service.
 * See Also:Service, Call
 */
public class WOWebService{
    /**
     * Create and initialize a new instance of WOWebService.
     * Parameters:aQName - the QName of the serviceaURL - the URL at which the WSDL for this service can be found
     */
    public WOWebService(javax.xml.namespace.QName aQName, java.net.URL aURL){
         //TODO codavaj!!
    }

    /**
     * Returns the underlying Axis service used to make Web service invocations.
     */
    public org.apache.axis.client.Service axisService(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates an returns an Axis call object for the operation opName.
     */
    public org.apache.axis.client.Call createCallForOperation(java.lang.String opName) throws javax.xml.rpc.ServiceException{
        return null; //TODO codavaj!!
    }

    /**
     * Return the EngineConfiguration used by the underlying Axis service.
     */
    public org.apache.axis.EngineConfiguration engineConfiguration(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the operation name is document style, false otherwise.
     */
    public boolean isOperationDocumentStyle(java.lang.String operationName){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the operation name is RPC style, false otherwise.
     */
    public boolean isOperationRPCStyle(java.lang.String operationName){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the local part of the QName of the service.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the operation named name.
     */
    public com.webobjects.webservices.client.WOClientOperation operationNamed(java.lang.String operationName){
        return null; //TODO codavaj!!
    }

    /**
     * Return an NSDictionary containing name to WOClientOperation mappings for all operations published in this service.
     */
    public com.webobjects.foundation.NSDictionary operationsDictionary(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the QName of the service.
     */
    public javax.xml.namespace.QName qName(){
        return null; //TODO codavaj!!
    }

    /**
     * Register aSerializerFactory for serializing objects of class aClass and aDeserializerFactory for deserializing DOM elements with QName aQName. Objects serialized by aSerializerFactory will have a QName of aQName. If a aSerializerFactory is null, only aDeserializerFactory will be registered, and vice versa.
     */
    public void registerFactoriesForClassWithQName(org.apache.axis.encoding.SerializerFactory sFactory, org.apache.axis.encoding.DeserializerFactory dFactory, java.lang.Class aClass, javax.xml.namespace.QName aQName){
        return; //TODO codavaj!!
    }

    /**
     * Return an opaque SessionInfo object which can be used to transfer session information between instances of WOWebService. If there is no session information, will return an empty SessionInfo.
     */
    public com.webobjects.webservices.client.WOWebService.SessionInfo sessionInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * Set the EngineConfiguration to used by the underlying Axis service. If the service has already been created, the existing instance will be freed.
     * Note: If you reset the service's engine configuration, all existing session information for the service will be lost.
     */
    public void setEngineConfiguration(org.apache.axis.EngineConfiguration aConfig){
        return; //TODO codavaj!!
    }

    public void setSecurityDelegate(java.lang.Object aDelegate){
        return; //TODO codavaj!!
    }

    /**
     * Set the session information for the service to the values contained in aSessionInfo.
     * Note: If after setting session information, you reset the service's engine configuration, all session information will be lost.
     */
    public void setSessionInfo(com.webobjects.webservices.client.WOWebService.SessionInfo aSessionInfo){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the class to which DOM elements with name aQName will be deserialized. Will return null if there is no deserializer registered for aQName
     */
    public java.lang.Class typeForQName(javax.xml.namespace.QName aQname){
        return null; //TODO codavaj!!
    }

    /**
     * SessionInfo stores all data required to connect to an existing Web service sessions. This class is returned by WOWebService's sessionInfo nethod, and can be passed to the setSessionInfo method on another service, whether that service is in the same WOWebServiceClient instance or in a different one.
     * See Also:WOWebService.sessionInfo(), WOWebService.setSessionInfo(com.webobjects.webservices.client.WOWebService.SessionInfo), WOWebServiceClient.sessionInfoForServiceNamed(java.lang.String), WOWebServiceClient.setSessionInfoForServiceNamed(com.webobjects.webservices.client.WOWebService.SessionInfo, java.lang.String)
     */
    public static class SessionInfo{
        public boolean equals(java.lang.Object anObject){
            return false; //TODO codavaj!!
        }

        public java.lang.String toString(){
            return null; //TODO codavaj!!
        }

    }
}
