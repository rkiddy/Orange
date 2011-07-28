
package com.webobjects.webservices.support.xml;

import javax.xml.namespace.QName;
import org.apache.axis.Constants;
import org.xml.sax.helpers.AttributesImpl;


public interface WOSoapConstants {
    public static class WOXMLAttributes extends AttributesImpl {

        public WOXMLAttributes(String uri, String localName, String qName, String type, String value) { return null; }
    }





    public static final String WOSOAP_URI = "http://www.apple.com/webobjects/webservices/soap/";
    public static final String NS_PREFIX_WOSOAP_ENC = "wosoapenc";
    public static final String XSI_URI = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String XSD_URI = "http://www.w3.org/2001/XMLSchema";
    public static final String SOAP_URI = null;
    public static final String SOAP_ENC_PREFIX = "soapenc";
    public static final QName XSI_TYPE = null;
    public static final QName EOENTERPRISEOBJECT_QNAME = null;
    public static final QName EOGLOBALID_QNAME = null;
    public static final QName EOGLOBALID_QNAME_WEBSERVICESCORE_WORKAROUND = null;
    public static final QName NSKVCNULL_QNAME = null;
    public static final QName NSRANGE_QNAME = null;
    public static final QName NSDATA_QNAME = null;
    public static final QName NSTIMEZONE_QNAME = null;
    public static final QName NSTIMESTAMP_QNAME = null;
    public static final QName WOSTRINGKEYMAP_QNAME = null;
    public static final QName NSARRAY_QNAME = null;
    public static final QName NSDICTIONARY_QNAME = null;
    public static final QName NSSET_QNAME = null;
    public static final WOEnterpriseObjectSerializationStrategy _defaultStrategy = null;
    public static final WOXMLAttributes _XSINIL = null;
    public static final WOXMLAttributes _STRINGKEYMAP = null;

}
