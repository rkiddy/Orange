
package com.webobjects.webservices.client;

import com.webobjects.foundation.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import javax.wsdl.*;
import javax.wsdl.extensions.soap.*;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Call;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.SerializerFactory;
import org.apache.axis.utils.XMLUtils;
import org.w3c.dom.Document;


public class WOWebServiceClient {


    public WOWebServiceClient(URL aURL) { return null; }

    private void initializeFromURL(URL aURL) {}

    public void registerFactoriesForClassWithQName(SerializerFactory sFactory, DeserializerFactory dFactory, Class aClass, QName aQname) {}

    public Class objectTypeForQName(Object aQNameObject) { return null; }

    public Class typeForQName(Object aQnameObject) { return null; }

    public EngineConfiguration engineConfigurationForServiceNamed(String serviceName) { return null; }

    public void setEngineConfigurationForServiceNamed(EngineConfiguration engineConfig, String serviceName) {}

    private static final void _appendPartNamesToVector(Object objects[], Vector vector) { return null; }

    private static final Vector constructParameterOrdering(Operation operation, Input input, Output output) { return null; }

    private static final void addOrderedParametersToWOOperation(List paramOrder, WOClientOperation wwso, Operation operation, Input input, Output output) { return null; }

    private static WOClientParameter _paramWithPart(Part part, ParameterMode mode) { return null; }

    private WOClientOperation processOperation(Operation operation, String endpoint) { return null; }

    private WOWebService processService(Service aService) { return null; }

    private void populateCaches() {}

    public void setSecurityDelegateForServiceNamed(Object aDelegate, String serviceName) {}

    public Object invoke(String serviceName, String operationName, Object parameters[]) { return null; }

    public WOWebService.SessionInfo sessionInfoForServiceNamed(String serviceName) { return null; }

    public void setSessionInfoForServiceNamed(WOWebService.SessionInfo info, String serviceName) {}

    public NSArray serviceNames() { return null; }

    public NSDictionary servicesDictionary() { return null; }

    public NSDictionary operationsDictionaryForService(String serviceName) { return null; }

    public String toString() { return null; }

    private Document wsdl;
    private URL url;
    private NSMutableDictionary _services;

}
