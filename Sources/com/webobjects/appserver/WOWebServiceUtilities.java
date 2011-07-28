
package com.webobjects.appserver;

import java.util.ArrayList;
import javax.xml.namespace.QName;
import org.apache.axis.AxisEngine;
import org.apache.axis.MessageContext;
import org.apache.axis.encoding.TypeMapping;
import org.apache.axis.encoding.TypeMappingRegistry;


public class WOWebServiceUtilities {


    public WOWebServiceUtilities() { return null; }

    public static void _setEngine(AxisEngine anEngine) { return null; }

    public static WOContext currentWOContext() { return null; }

    public static QName qNameForType(Class javaType, String namespaceURI) { return null; }

    private static QName _qnameForType(Class javaType, TypeMapping tm) { return null; }

    public static String qNameStringForType(Class javaType, String namespaceURI) { return null; }

    public static String qNameLocalPartStringForType(Class javaType, String namespaceURI) { return null; }

    public static String qNameNamespaceURIStringForType(Class javaType, String namespaceURI) { return null; }

    public static Class typeForQName(QName qname, String namespaceURI) { return null; }

    public static String _localPartForQName(Object aQName) { return null; }

    public static String _namespaceURIForQName(Object aQName) { return null; }

    public static QName _qNameForParts(String aNamespaceURI, String aLocalPart) { return null; }

    public static final String WebServiceOperationAttributesKey = "com.webobjects.webservices.OperationAttributes";
    private static AxisEngine _engine;

}
