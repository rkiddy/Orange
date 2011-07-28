
package com.webobjects.webservices.support.xml;

import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSTimeZone;
import java.io.IOException;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.wsdl.fromJava.Types;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;


public class WOTimeZoneSerializer
    implements Serializer, WOSoapConstants {


    public WOTimeZoneSerializer() { return null; }

    public void serialize(QName name, Attributes attributes, Object value, SerializationContext context) throws IOException {}

    public String getMechanismType() { return null; }

    public Element writeSchema(Class javaType, Types types) throws Exception { return null; }

    private static final long serialVersionUID = 0x4bc9c96bL;
    private static final String NAME_MEMBER = "name";
    private static final String DATA_MEMBER = "data";

}
