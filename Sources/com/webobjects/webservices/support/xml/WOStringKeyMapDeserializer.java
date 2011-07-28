
package com.webobjects.webservices.support.xml;

import org.apache.axis.encoding.*;
import org.apache.axis.message.SOAPHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;


public class WOStringKeyMapDeserializer extends DeserializerImpl
    implements Deserializer, WOSoapConstants {


    public WOStringKeyMapDeserializer() { return null; }

    public SOAPHandler onStartChild(String namespace, String localName, String prefix, Attributes attributes, DeserializationContext context) throws SAXException { return null; }

    public void onEndElement(String namespace, String localName, DeserializationContext context) throws SAXException {}

    private static final long serialVersionUID = 0x3150df4bL;
    private WOStringKeyMap _smap;

}
