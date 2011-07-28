
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSTimeZone;
import java.util.Hashtable;
import javax.xml.namespace.QName;
import org.apache.axis.Constants;
import org.apache.axis.encoding.*;
import org.apache.axis.message.SOAPHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;


public class WOTimeZoneDeserializer extends DeserializerImpl
    implements Deserializer, WOSoapConstants {


    public WOTimeZoneDeserializer() { return null; }

    public SOAPHandler onStartChild(String namespace, String localName, String prefix, Attributes attributes, DeserializationContext context) throws SAXException { return null; }

    public void onEndElement(String namespace, String localName, DeserializationContext context) throws SAXException {}

    public void setName(String nn) {}

    public void setData(byte nb[]) {}

    private String setterForProperty(String name) { return null; }

    private static final long serialVersionUID = 0x4419225bL;
    private static final String NAME_MEMBER = "name";
    private static final String DATA_MEMBER = "data";
    private Hashtable typesByMemberName;
    private String currentName;
    private byte currentData[];

}
