
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.NSKeyValueCoding;
import org.apache.axis.encoding.ser.MapDeserializer;
import org.xml.sax.SAXException;


public class WODictionaryDeserializer extends MapDeserializer
    implements WOSoapConstants {


    public WODictionaryDeserializer() { return null; }

    public void setChildValue(Object aValue, Object aHint) throws SAXException {}

    private static final long serialVersionUID = 0x8ae6d375L;

}
