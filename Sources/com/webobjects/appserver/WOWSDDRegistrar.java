package com.webobjects.appserver;
/**
 * Registers WSDD types and services with WebObjects application.
 * Since: 5.4.1
 */
public class WOWSDDRegistrar{
    protected WOWSDDRegistrar(){
         //TODO codavaj!!
    }

    /**
     * Create a String of all the allowed methods separated by ,
     */
    protected java.lang.String createAllowedMethodsString(java.lang.String[] allowedMethods){
        return null; //TODO codavaj!!
    }

    protected java.lang.String createServiceString(java.lang.String webServiceName, java.lang.Class webServiceClass, java.lang.String[] allowedMethods, boolean isRPC, boolean isD2WS){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the list of declared method accessible on the the target web service class.
     */
    protected java.util.List getDeclaredMethodsForClass(java.lang.Class webServiceClass){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the single instance of the Registrar
     */
    public static com.webobjects.appserver.WOWSDDRegistrar getInstance(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the list of method on the the target web service class.
     */
    protected java.util.List getMethodsForNames(java.lang.Class webServiceClass, java.lang.String[] allowedMethods){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a collection of class that are parameters or return values of the list of methods
     */
    protected java.util.Collection getMethodsTypes(java.util.Collection methods){
        return null; //TODO codavaj!!
    }

    /**
     * Used by Direct To WebServices to register operations
     */
    public void registerD2WebServiceWithOperations(java.lang.String webServiceName, java.lang.String[] operations){
        return; //TODO codavaj!!
    }

    /**
     * Register aSerializerFactory for serializing objects of class aClass and aDeserializerFactory for deserializing DOM elements with QName aQName. Objects serialized by aSerializerFactory will have a QName of aQName. If a aSerializerFactory is null, only aDeserializerFactory will be registered, and vice versa.
     */
    public void registerFactoriesForClassWithQName(javax.xml.rpc.encoding.SerializerFactory aSerializerFactory, javax.xml.rpc.encoding.DeserializerFactory aDeserializerFactory, java.lang.Class aClass, javax.xml.namespace.QName aQName){
        return; //TODO codavaj!!
    }

    /**
     * Register the WSDDTypeMapping for WSDD generation. This method implements the WOWSSupport.Delegate and you never have to call this method.
     */
    public void registerTypeMapping(javax.xml.rpc.encoding.SerializerFactory aSerializerFactory, javax.xml.rpc.encoding.DeserializerFactory aDeserializerFactory, java.lang.Class aClass, javax.xml.namespace.QName aQName){
        return; //TODO codavaj!!
    }

    /**
     * Expose all methods declared on webServiceClass as operations on a web service whose name is the non-qualified class name of webServiceClass.
     */
    public void registerWebService(java.lang.Class webServiceClass, boolean isRPC){
        return; //TODO codavaj!!
    }

    /**
     * Expose all methods declared on webServiceClass as operations on a web service whose name is webServiceName.
     */
    public void registerWebService(java.lang.String webServiceName, java.lang.Class webServiceClass, boolean isRPC){
        return; //TODO codavaj!!
    }

    /**
     * Expose methods listed in allowedMethods declared on webServiceClass as operations on a web service whose name is webServiceName.
     */
    public void registerWebService(java.lang.String webServiceName, java.lang.Class webServiceClass, java.lang.String[] allowedMethods, boolean isRPC){
        return; //TODO codavaj!!
    }

    /**
     * Register an XSLT transformation for serviceName and operationName. All parameters must be non-null. The contents of the URL will be read at registration.
     */
    public void registerXSLTForServiceAndOperation(java.net.URL aURL, java.lang.String serviceName, java.lang.String operationName){
        return; //TODO codavaj!!
    }

    protected java.lang.String serviceStringCloseTag(){
        return null; //TODO codavaj!!
    }

    protected java.lang.String serviceStringD2WRPCProvider(){
        return null; //TODO codavaj!!
    }

    protected java.lang.String serviceStringDeclaration(){
        return null; //TODO codavaj!!
    }

    protected java.lang.String serviceStringMsgProvider(){
        return null; //TODO codavaj!!
    }

    protected java.lang.String serviceStringOpenTag(java.lang.String name, boolean isRPC){
        return null; //TODO codavaj!!
    }

    protected java.lang.String serviceStringParameterAllowedMethods(java.lang.String[] allowedMethods){
        return null; //TODO codavaj!!
    }

    protected java.lang.String serviceStringParameterClassName(java.lang.String name){
        return null; //TODO codavaj!!
    }

    protected java.lang.String serviceStringParameterNamespace(){
        return null; //TODO codavaj!!
    }

    protected java.lang.String serviceStringParameterScope(){
        return null; //TODO codavaj!!
    }

    protected java.lang.String serviceStringRPCProvider(){
        return null; //TODO codavaj!!
    }

    protected java.lang.String serviceStringTypeMappings(org.apache.axis.deployment.wsdd.WSDDTypeMapping typeMapping){
        return null; //TODO codavaj!!
    }

    /**
     * Set the class delegate. This enable easy subclassing of the registrar.
     */
    public static void setDelegate(com.webobjects.appserver.WOWSDDRegistrar.Delegate aDelegate){
        return; //TODO codavaj!!
    }

    /**
     * Register aDelegate as the security delegate for Axis.
     */
    public void setSecurityDelegate(java.lang.Object aDelegate){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Deregister the web service registered for webServiceClass. This method assumes that webServiceClass will be exposed under it's classname.
     */
    public void unregisterWebService(java.lang.Class webServiceClass){
        return; //TODO codavaj!!
    }

    /**
     * Deregister the web service registered with the name webServiceName.
     */
    public void unregisterWebService(java.lang.String webServiceName){
        return; //TODO codavaj!!
    }

    public static interface Delegate{
        /**
         * Returns a new instance of the WOWSDDRegistrar. Note: this is invoked only once as the registrar is a singleton.
         */
        abstract com.webobjects.appserver.WOWSDDRegistrar newWSDDRegistrar();

    }
}
