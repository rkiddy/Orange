
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSLog;
import java.io.IOException;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.Base64Serializer;
import org.apache.axis.utils.Messages;
import org.apache.axis.wsdl.fromJava.Types;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;


public class WODataSerializer extends Base64Serializer
    implements Serializer, WOSoapConstants {


    public WODataSerializer() { return null; }

    public void serialize(QName name, Attributes attributes, Object value, SerializationContext context) throws IOException {}

    public Element writeSchema(Class aJavaType, Types types) throws Exception { return null; }

    private static final long serialVersionUID = 0x41599a6fL;

}
