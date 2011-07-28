
package com.webobjects.webservices.support.xml;

import com.webobjects.eocontrol.*;
import java.io.IOException;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.wsdl.fromJava.Types;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;


public class WOGlobalIDSerializer
    implements Serializer, WOSoapConstants {


    public WOGlobalIDSerializer() { return null; }

    public void serialize(QName name, Attributes attributes, Object value, SerializationContext context) throws IOException {}

    public String getMechanismType() { return null; }

    public Element writeSchema(Class javaType, Types types) throws Exception { return null; }

    private static final long serialVersionUID = 0xc0884e22L;
    private static final String NAME_MEMBER = "entityName";
    private static final String SUBENTITY_MEMBER = "subEntityName";
    private static final String GUESSEDENTITY_MEMBER = "guessedEntityName";
    private static final String PKS_MEMBER = "primaryKeys";
    private static final String DATA_MEMBER = "data";

}
