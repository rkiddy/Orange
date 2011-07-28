
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.*;
import java.io.IOException;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.ser.ArraySerializer;
import org.apache.axis.utils.Messages;
import org.xml.sax.Attributes;


public class WOSetSerializer extends ArraySerializer
    implements WOSoapConstants {


    public WOSetSerializer() { return null; }

    public void serialize(QName name, Attributes attributes, Object value, SerializationContext context) throws IOException {}

    private static final long serialVersionUID = 0xee8484acL;

}
