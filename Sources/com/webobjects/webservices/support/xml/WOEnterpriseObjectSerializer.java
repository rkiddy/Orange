
package com.webobjects.webservices.support.xml;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSArray;
import java.io.IOException;
import java.util.Iterator;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.wsdl.fromJava.Types;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;


public class WOEnterpriseObjectSerializer
    implements Serializer, WOSoapConstants {


    public WOEnterpriseObjectSerializer() { return null; }

    public void serialize(QName name, Attributes attributes, Object value, SerializationContext context) throws IOException {}

    public String getMechanismType() { return null; }

    public Element writeSchema(Class javaType, Types types) throws Exception { return null; }

    private static final long serialVersionUID = 0x3fb5eb08L;
    private static final String GLOBALID_MEMBER = "globalID";
    private static final String ENTITYNAME_MEMBER = "entityName";
    private static final String PROPERTIES_MEMBER = "properties";

}
