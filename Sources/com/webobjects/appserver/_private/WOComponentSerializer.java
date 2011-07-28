
package com.webobjects.appserver._private;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOResponse;
import java.io.IOException;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.wsdl.fromJava.Types;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;

public class WOComponentSerializer
    implements Serializer {


    public WOComponentSerializer() { return null; }

    public String getXMLStringForComponent(WOComponent component) { return null; }

    public void serialize(QName name, Attributes attributes, Object value, SerializationContext context) throws IOException {}

    public String getMechanismType() { return null; }

    public boolean writeSchema(Types types) throws Exception { return true; }

    public Element writeSchema(Class javaType, Types types) throws Exception { return null; }

    private static final long serialVersionUID = 0x9045d61aL;

}
