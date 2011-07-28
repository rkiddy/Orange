
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.NSKeyValueCoding;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.wsdl.fromJava.Types;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;


public class WOStringKeyMapSerializer
    implements Serializer, WOSoapConstants {


    public WOStringKeyMapSerializer() { return null; }

    public void serialize(QName name, Attributes attributes, Object value, SerializationContext context) throws IOException {}

    public String getMechanismType() { return null; }

    public Element writeSchema(Class javaType, Types types) throws Exception { return null; }

    static  {}

    private static final long serialVersionUID = 0x697846f9L;
    private static final QName WOSTRINGKEYMAPITEM_QNAME;

}
