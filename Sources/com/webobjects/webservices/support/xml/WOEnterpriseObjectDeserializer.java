
package com.webobjects.webservices.support.xml;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.foundation._NSStringUtilities;
import java.util.*;
import javax.xml.namespace.QName;
import org.apache.axis.Constants;
import org.apache.axis.encoding.*;
import org.apache.axis.message.SOAPHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;


public class WOEnterpriseObjectDeserializer extends DeserializerImpl
    implements Deserializer, WOSoapConstants {


    public WOEnterpriseObjectDeserializer() { return null; }

    public void onStartElement(String namespace, String localName, String prefix, Attributes attributes, DeserializationContext context) throws SAXException {}

    public SOAPHandler onStartChild(String namespace, String localName, String prefix, Attributes attributes, DeserializationContext context) throws SAXException { return null; }

    public void onEndElement(String namespace, String localName, DeserializationContext context) throws SAXException {}

    private void _attemptValueCreation() {}

    protected Object mergeProperties(Object subject, WOStringKeyMap properties, String keyPathPrefix, WOEnterpriseObjectSerializationStrategy strategy) { return null; }

    public void setEntityName(Object name) throws SAXException {}

    public void setGlobalID(Object gid) throws SAXException {}

    public void setProperties(Object map) throws SAXException {}

    private String setterForProperty(String name) throws SAXException { return null; }

    private static final long serialVersionUID = 0xca62adcL;
    private static final String GLOBALID_MEMBER = "globalID";
    private static final String ENTITYNAME_MEMBER = "entityName";
    private static final String PROPERTIES_MEMBER = "properties";
    private Hashtable typesByMemberName;
    private EOGlobalID _gid;
    private String _entity;
    private WOStringKeyMap _properties;
    private WOEnterpriseObjectSerializationStrategy _strategy;
    private EOEditingContext _ec;
    private DeserializationContext _currentContext;
    private String _myID;

}
