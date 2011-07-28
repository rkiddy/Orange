
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.NSKeyValueCoding;
import java.io.IOException;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.utils.Messages;
import org.apache.axis.wsdl.fromJava.Types;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;


public class WONullSerializer
    implements Serializer, WOSoapConstants {


    public WONullSerializer() { return null; }

    public void serialize(QName name, Attributes attributes, Object value, SerializationContext context) throws IOException {}

    public String getMechanismType() { return null; }

    public Element writeSchema(Class javaType, Types types) throws Exception { return null; }

    private static final long serialVersionUID = 0x7ccbce8fL;

}
