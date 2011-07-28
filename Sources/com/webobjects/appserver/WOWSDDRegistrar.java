
package com.webobjects.appserver;

import com.webobjects.appserver._private.WODWSServiceObject;
import com.webobjects.appserver._private.WOWebService;
import com.webobjects.foundation.NSLog;
import com.webobjects.webservices.support._private.WOWSSupport;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;
import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.DeserializerFactory;
import javax.xml.rpc.encoding.SerializerFactory;
import javax.xml.transform.stream.StreamSource;
import org.apache.axis.Constants;
import org.apache.axis.deployment.wsdd.*;
import org.apache.axis.utils.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class WOWSDDRegistrar
    implements com.webobjects.webservices.support._private.WOWSSupport.Delegate {
    public static interface Delegate {

        public abstract WOWSDDRegistrar newWSDDRegistrar();
    }



    protected WOWSDDRegistrar() { return null; }

    public static WOWSDDRegistrar getInstance() { return null; }

    public static void setDelegate(Delegate aDelegate) { return null; }

    public static Document _getEmptyDeployment() { return null; }

    public void _addRegisteredServiceName(String serviceName, WSDDService service) {}

    public void _removeRegisteredServiceName(String serviceName) {}

    public boolean _isServiceRegistered(String serviceName) { return true; }

    public void _addRegisteredTypeMapping(Class type, WSDDTypeMapping typeMapping) {}

    public void _removeRegisteredTypeMapping(Class type) {}

    public boolean _isTypeMappingRegistered(Class type) { return true; }

    public void registerWebService(Class webServiceClass, boolean isRPC) {}

    public void registerWebService(String webServiceName, Class webServiceClass, boolean isRPC) {}

    public void registerWebService(String webServiceName, Class webServiceClass, String allowedMethods[], boolean isRPC) {}

    public void registerD2WebServiceWithOperations(String webServiceName, String operations[]) {}

    public void unregisterWebService(Class webServiceClass) {}

    public void unregisterWebService(String webServiceName) {}

    protected List getDeclaredMethodsForClass(Class webServiceClass) { return null; }

    protected List getMethodsForNames(Class webServiceClass, String allowedMethods[]) { return null; }

    protected Collection getMethodsTypes(Collection methods) { return null; }

    protected String createServiceString(String webServiceName, Class webServiceClass, String allowedMethods[], boolean isRPC, boolean isD2WS) { return null; }

    protected String serviceStringDeclaration() { return null; }

    protected String serviceStringOpenTag(String name, boolean isRPC) { return null; }

    protected String serviceStringRPCProvider() { return null; }

    protected String serviceStringMsgProvider() { return null; }

    protected String serviceStringD2WRPCProvider() { return null; }

    protected String serviceStringParameterScope() { return null; }

    protected String serviceStringParameterClassName(String name) { return null; }

    protected String serviceStringParameterAllowedMethods(String allowedMethods[]) { return null; }

    protected String serviceStringParameterNamespace() { return null; }

    protected String serviceStringTypeMappings(WSDDTypeMapping typeMapping) { return null; }

    protected String serviceStringCloseTag() { return null; }

    protected String createAllowedMethodsString(String allowedMethods[]) { return null; }

    public void registerFactoriesForClassWithQName(SerializerFactory aSerializerFactory, DeserializerFactory aDeserializerFactory, Class aClass, QName aQName) {}

    public void registerTypeMapping(SerializerFactory aSerializerFactory, DeserializerFactory aDeserializerFactory, Class aClass, QName aQName) {}

    public void registerXSLTForServiceAndOperation(URL aURL, String serviceName, String operationName) {}

    public void setSecurityDelegate(Object aDelegate) {}

    public String toString() { return null; }

    static  {}

    private Map _registeredServiceNames;
    private Map _registeredTypeMappings;
    private static final String emptyDeploymentFileString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<deployment xmlns=\"http://xml.apache.org/axis/wsdd/\" xmlns:java=\"http://xml.apache.org/axis/wsdd/providers/java\">\n<globalConfiguration>\n<parameter name=\"sendMultiRefs\" value=\"true\"/>\n<parameter name=\"sendXsiTypes\" value=\"true\"/>\n<parameter name=\"sendXMLDeclaration\" value=\"true\"/>\n<requestFlow>\n<handler type=\"java:com.webobjects.webservice.support._private.WOSecurityHandler\"/>\n<handler type=\"java:com.webobjects.appserver._private.WOServerSessionHandler\"/>\n</requestFlow>\n<responseFlow>\n<handler type=\"java:com.webobjects.appserver._private.WOServerSessionHandler\"/>\n<handler type=\"java:com.webobjects.webservice.support._private.WOSecurityHandler\"/>\n</responseFlow>\n</globalConfiguration>\n<handler name=\"URLMapper\" type=\"java:org.apache.axis.handlers.http.URLMapper\"/>\n<handler name=\"HTTPActionHandler\" type=\"java:org.apache.axis.handlers.http.HTTPActionHandler\"/>\n<handler name=\"RPCDispatcher\" type=\"java:org.apache.axis.providers.java.RPCProvider\"/>\n<handler name=\"MsgDispatcher\" type=\"java:org.apache.axis.providers.java.MsgProvider\"/>\n<transport name=\"http\">\n<requestFlow>\n<handler type=\"HTTPActionHandler\"/>\n<handler type=\"URLMapper\"/>\n</requestFlow>\n</transport>\n</deployment>";
    private static Document document;
    private static WOWSDDRegistrar _instance;
    private static Delegate _delegate;

}
