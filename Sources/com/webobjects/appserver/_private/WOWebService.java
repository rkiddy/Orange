
package com.webobjects.appserver._private;

import com.webobjects.appserver.*;
import com.webobjects.foundation.*;
import com.webobjects.webservices.support.WOXMLProvider;
import com.webobjects.webservices.support._private.WOSecurityHandler;
import com.webobjects.webservices.support._private.WOWSSupport;
import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;
import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.DeserializerFactory;
import javax.xml.rpc.encoding.SerializerFactory;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.axis.*;
import org.apache.axis.deployment.wsdd.*;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ServiceDesc;
import org.apache.axis.handlers.soap.SOAPService;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPFault;
import org.apache.axis.server.AxisServer;
import org.apache.axis.transport.http.HTTPConstants;
import org.apache.axis.utils.XMLUtils;
import org.w3c.dom.Document;


public class WOWebService extends WOAction {
    private static class NullTransformer extends Transformer {

        public NullTransformer() { return null; }

        public void clearParameters() {}

        public ErrorListener getErrorListener() { return null; }

        public Properties getOutputProperties() { return null; }

        public String getOutputProperty(String name) { return null; }

        public Object getParameter(String name) { return null; }

        public URIResolver getURIResolver() { return null; }

        public void setErrorListener(ErrorListener errorlistener) {}

        public void setOutputProperties(Properties properties) {}

        public void setOutputProperty(String s, String s1) {}

        public void setParameter(String s, Object obj) {}

        public void setURIResolver(URIResolver uriresolver) {}

        public void transform(Source source1, Result result) {}
    }



    static Document getDeploymentDocument() { return null; }

    public static void initServer() { return null; }

    public static void initTypeMapping() { return null; }

    static void initD2WSWSDLStuff() {}

    public static void registerService(WSDDService service) { return null; }

    public static void registerTypeMapping(WSDDTypeMapping type) { return null; }

    public static void deregisterServiceWithName(String name) { return null; }

    public static void registerSerializerAndDeserializerFactoriesForClassWithQName(SerializerFactory serFact, DeserializerFactory deserFact, Class aClass, QName aQName) { return null; }

    public static void setSecurityDelegate(Object aDelegate) { return null; }

    public boolean isServiceD2WebService(String name) throws ConfigurationException { return true; }

    public WOWebService(WORequest aRequest) { return null; }

    protected String defaultActionClassName() { return null; }

    public String getSessionIDForRequest(WORequest aRequest) { return null; }

    public WOActionResults performActionNamed(String anActionName) { return null; }

    private static Transformer getRegisteredTransformerForServiceAndOperation(String serviceName, String operationName) { return null; }

    private static void registerTransformerForServiceAndOperation(String serviceName, String operationName, Transformer transformer) { return null; }

    public static void registerTransformerForSourceServiceAndOperation(Source source, String serviceName, String operationName) { return null; }

    private static Source getSourceForServiceAndOperation(String serviceName, String operationName) { return null; }

    private static Transformer getTransformerForSourceServiceAndOperation(Source source, String serviceName, String operationName) { return null; }

    private static Transformer getTransformerForServiceAndOperation(String serviceName, String operationName) { return null; }

    private static String performXSLTTransformOnResponseForServiceAndOperation(String soapString, String serviceName, String operationName) { return null; }

    static  {}

    private static String TransformerFactoryPropertyName;
    private static String DefaultTransformerClassName;
    static WOXMLProvider provider;
    static AxisServer engine;
    static boolean typeMappingRegistered;
    static _NSReadReentrantReaderWriterLock engineLock;
    static boolean showWSDL;
    static TransformerFactory transformerFactory;
    static NSMutableDictionary transformerDict;
    static Transformer nullTransformer;
    protected static Class D2WSClass;
    protected static Method D2WSWSDLMethod;

}
