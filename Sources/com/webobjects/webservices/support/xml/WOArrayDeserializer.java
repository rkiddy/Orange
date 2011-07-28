
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.NSKeyValueCoding;
import java.lang.reflect.Array;
import java.util.*;
import org.apache.axis.encoding.ser.ArrayDeserializer;
import org.xml.sax.SAXException;


public class WOArrayDeserializer extends ArrayDeserializer
    implements WOSoapConstants {


    public WOArrayDeserializer() { return null; }

    public void valueComplete() throws SAXException {}

    private static final long serialVersionUID = 0xab1d8b2bL;

}
