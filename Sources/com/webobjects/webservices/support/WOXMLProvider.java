
package com.webobjects.webservices.support;

import com.webobjects.foundation.NSLog;
import java.io.InputStream;
import java.util.*;
import javax.xml.namespace.QName;
import org.apache.axis.*;
import org.apache.axis.deployment.wsdd.*;
import org.apache.axis.encoding.TypeMappingRegistry;
import org.apache.axis.handlers.soap.SOAPService;
import org.apache.axis.utils.Messages;
import org.apache.axis.utils.XMLUtils;
import org.w3c.dom.Document;

public class WOXMLProvider
    implements EngineConfiguration {


    public WOXMLProvider(InputStream stream) { return null; }

    public WOXMLProvider(Document doc) { return null; }

    public Document getDocument() { return null; }

    public void setDocument(Document doc) {}

    public WSDDDeployment getDeployment() { return null; }

    public void setDeployment(WSDDDeployment depl) {}

    protected void doConfigureEngine(AxisEngine engine) throws ConfigurationException {}

    public void configureEngine(AxisEngine engine) throws ConfigurationException {}

    public void writeEngineConfig(AxisEngine axisengine) throws ConfigurationException {}

    public Handler getHandler(QName qname) throws ConfigurationException { return null; }

    public SOAPService getService(QName qname) throws ConfigurationException { return null; }

    public SOAPService getServiceByNamespaceURI(String namespace) throws ConfigurationException { return null; }

    public Handler getTransport(QName qname) throws ConfigurationException { return null; }

    public TypeMappingRegistry getTypeMappingRegistry() throws ConfigurationException { return null; }

    public Handler getGlobalRequest() throws ConfigurationException { return null; }

    public Handler getGlobalResponse() throws ConfigurationException { return null; }

    public Hashtable getGlobalOptions() throws ConfigurationException { return null; }

    public List getRoles() { return null; }

    public Iterator getDeployedServices() throws ConfigurationException { return null; }

    protected WSDDDeployment deployment;
    protected InputStream myInputStream;
    protected Document myDocument;
    protected boolean readOnly;

}
