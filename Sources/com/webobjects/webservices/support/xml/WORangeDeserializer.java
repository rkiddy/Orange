
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.NSMutableRange;
import java.util.Hashtable;
import javax.xml.namespace.QName;
import org.apache.axis.Constants;
import org.apache.axis.encoding.*;
import org.apache.axis.message.SOAPHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;


public class WORangeDeserializer extends DeserializerImpl
    implements Deserializer, WOSoapConstants {


    public WORangeDeserializer() { return null; }

    public SOAPHandler onStartChild(String namespace, String localName, String prefix, Attributes attributes, DeserializationContext context) throws SAXException { return null; }

    private String setterForProperty(String name) { return null; }

    private static final long serialVersionUID = 0x82af59aL;
    private static final String LOCATION_MEMBER = "location";
    private static final String LENGTH_MEMBER = "length";
    private Hashtable typesByMemberName;

}
