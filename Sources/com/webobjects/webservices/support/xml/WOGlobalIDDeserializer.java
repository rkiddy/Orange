
package com.webobjects.webservices.support.xml;

import com.webobjects.eocontrol.EOKeyGlobalID;
import com.webobjects.eocontrol.EOTemporaryGlobalID;
import java.util.Hashtable;
import javax.xml.namespace.QName;
import org.apache.axis.Constants;
import org.apache.axis.encoding.*;
import org.apache.axis.message.SOAPHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;


public class WOGlobalIDDeserializer extends DeserializerImpl
    implements Deserializer, WOSoapConstants {


    public WOGlobalIDDeserializer() { return null; }

    public SOAPHandler onStartChild(String namespace, String localName, String prefix, Attributes attributes, DeserializationContext context) throws SAXException { return null; }

    public void onEndElement(String namespace, String localName, DeserializationContext context) throws SAXException {}

    private static final long serialVersionUID = 0x82b0b092L;
    private static final String NAME_MEMBER = "entityName";
    private static final String SUBENTITY_MEMBER = "subEntityName";
    private static final String GUESSEDENTITY_MEMBER = "guessedEntityName";
    private static final String PKS_MEMBER = "primaryKeys";
    private static final String DATA_MEMBER = "data";
    private Hashtable typesByMemberName;
    public String entityName;
    public String subEntityName;
    public String guessedEntityName;
    public Object primaryKeys[];
    public byte data[];

}
