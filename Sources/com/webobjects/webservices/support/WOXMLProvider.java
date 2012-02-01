package com.webobjects.webservices.support;
/**
 * For internal use only.
 */
public class WOXMLProvider implements org.apache.axis.EngineConfiguration{
    protected org.apache.axis.deployment.wsdd.WSDDDeployment deployment;

    protected org.w3c.dom.Document myDocument;

    protected java.io.InputStream myInputStream;

    protected boolean readOnly;

    public WOXMLProvider(org.w3c.dom.Document doc){
         //TODO codavaj!!
    }

    public WOXMLProvider(java.io.InputStream stream){
         //TODO codavaj!!
    }

    public void configureEngine(org.apache.axis.AxisEngine engine) throws org.apache.axis.ConfigurationException{
        return; //TODO codavaj!!
    }

    protected void doConfigureEngine(org.apache.axis.AxisEngine engine) throws org.apache.axis.ConfigurationException{
        return; //TODO codavaj!!
    }

    public java.util.Iterator getDeployedServices() throws org.apache.axis.ConfigurationException{
        return null; //TODO codavaj!!
    }

    public org.apache.axis.deployment.wsdd.WSDDDeployment getDeployment(){
        return null; //TODO codavaj!!
    }

    public org.w3c.dom.Document getDocument(){
        return null; //TODO codavaj!!
    }

    public java.util.Hashtable getGlobalOptions() throws org.apache.axis.ConfigurationException{
        return null; //TODO codavaj!!
    }

    public org.apache.axis.Handler getGlobalRequest() throws org.apache.axis.ConfigurationException{
        return null; //TODO codavaj!!
    }

    public org.apache.axis.Handler getGlobalResponse() throws org.apache.axis.ConfigurationException{
        return null; //TODO codavaj!!
    }

    public org.apache.axis.Handler getHandler(javax.xml.namespace.QName qname) throws org.apache.axis.ConfigurationException{
        return null; //TODO codavaj!!
    }

    public java.util.List getRoles(){
        return null; //TODO codavaj!!
    }

    public org.apache.axis.handlers.soap.SOAPService getService(javax.xml.namespace.QName qname) throws org.apache.axis.ConfigurationException{
        return null; //TODO codavaj!!
    }

    public org.apache.axis.handlers.soap.SOAPService getServiceByNamespaceURI(java.lang.String namespace) throws org.apache.axis.ConfigurationException{
        return null; //TODO codavaj!!
    }

    public org.apache.axis.Handler getTransport(javax.xml.namespace.QName qname) throws org.apache.axis.ConfigurationException{
        return null; //TODO codavaj!!
    }

    public org.apache.axis.encoding.TypeMappingRegistry getTypeMappingRegistry() throws org.apache.axis.ConfigurationException{
        return null; //TODO codavaj!!
    }

    public void setDeployment(org.apache.axis.deployment.wsdd.WSDDDeployment depl){
        return; //TODO codavaj!!
    }

    public void setDocument(org.w3c.dom.Document doc){
        return; //TODO codavaj!!
    }

    public void writeEngineConfig(org.apache.axis.AxisEngine engine) throws org.apache.axis.ConfigurationException{
        return; //TODO codavaj!!
    }

}
