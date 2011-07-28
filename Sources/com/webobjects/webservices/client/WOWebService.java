
package com.webobjects.webservices.client;

import com.webobjects.foundation.*;
import com.webobjects.webservices.client._private.WOClientSessionHandler;
import com.webobjects.webservices.support.WOXMLProvider;
import com.webobjects.webservices.support._private.*;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import org.apache.axis.*;
import org.apache.axis.client.*;
import org.apache.axis.encoding.*;
import org.apache.axis.transport.http.HTTPSender;
import org.apache.axis.transport.local.LocalSender;
import org.apache.axis.utils.XMLUtils;
import org.w3c.dom.Document;


public class WOWebService {
    public static class SessionInfo {


        SessionInfo() { return null; }

        void takeValuesFromEngine(AxisEngine engine) { return null; }

        void setValuesInEngine(AxisEngine engine) { return null; }

        public boolean equals(Object anObject) { return true; }

        public String toString() { return null; }

        NSMutableDictionary _infoDict;

    }



    public WOWebService(QName aQName, URL aURL) { return null; }

    public QName qName() { return null; }

    public String name() { return null; }

    public NSDictionary operationsDictionary() { return null; }

    public WOClientOperation operationNamed(String operationName) { return null; }

    public boolean isOperationRPCStyle(String operationName) { return true; }

    public boolean isOperationDocumentStyle(String operationName) { return true; }

    void addOperation(WOClientOperation op) { return null; }

    public void registerFactoriesForClassWithQName(SerializerFactory sFactory, DeserializerFactory dFactory, Class aClass, QName aQName) {}

    public Class typeForQName(QName aQname) { return null; }

    public Service axisService() { return null; }

    public void _setCacheWSDL(boolean b) {}

    void _flushService() { return null; }

    public Call createCallForOperation(String opName) throws ServiceException { return null; }

    private void _setSecurityDelegateInEngine(Object aDelegate, AxisEngine engine) {}

    public void setSecurityDelegate(Object aDelegate) {}

    public EngineConfiguration engineConfiguration() { return null; }

    public void setEngineConfiguration(EngineConfiguration aConfig) {}

    private Document getEmptyClientConfig() { return null; }

    private Document getDeploymentDocument() { return null; }

    private void registerSerializers() {}

    public String toString() { return null; }

    public SessionInfo sessionInfo() { return null; }

    public void setSessionInfo(SessionInfo aSessionInfo) {}

    static  {}

    private static final String emptyDeploymentFileString;
    private QName qName;
    private URL url;
    private String name;
    private NSMutableDictionary operationsDict;
    private Service axisService;
    private EngineConfiguration config;
    private NSMutableArray additionalTypeMappings;
    private Object _flddelegate;

}
