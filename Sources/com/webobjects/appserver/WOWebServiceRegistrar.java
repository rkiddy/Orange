
package com.webobjects.appserver;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.DeserializerFactory;
import javax.xml.rpc.encoding.SerializerFactory;
import org.w3c.dom.Document;


public class WOWebServiceRegistrar {

    private WOWebServiceRegistrar() { return null; }

    public static Document _getEmptyDeployment() { return null; }

    public static void registerWebService(Class webServiceClass, boolean isRPC) { return null; }

    public static void registerWebService(String webServiceName, Class webServiceClass, boolean isRPC) { return null; }

    public static void registerWebService(String webServiceName, Class webServiceClass, String allowedMethods[], boolean isRPC) { return null; }

    public static void registerD2WebServiceWithOperations(String webServiceName, String operations[]) { return null; }

    public static void unregisterWebService(Class webServiceClass) { return null; }

    public static void unregisterWebService(String webServiceName) { return null; }

    public static void registerFactoriesForClassWithQName(SerializerFactory aSerializerFactory, DeserializerFactory aDeserializerFactory, Class aClass, QName aQName) { return null; }

    public static void registerXSLTForServiceAndOperation(URL aURL, String serviceName, String operationName) { return null; }

    public static void setSecurityDelegate(Object aDelegate) { return null; }
}
