
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.*;
import java.io.IOException;
import java.util.*;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.ser.MapSerializer;
import org.xml.sax.Attributes;


public class WODictionarySerializer extends MapSerializer
    implements WOSoapConstants {


    public WODictionarySerializer() { return null; }

    public void serialize(QName name, Attributes attributes, Object value, SerializationContext context) throws IOException {}

    private static final long serialVersionUID = 0x413d0733L;

}
