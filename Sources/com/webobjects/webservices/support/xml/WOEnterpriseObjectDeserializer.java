package com.webobjects.webservices.support.xml;
/**
 * WOEnterpriseObjectDeserializer deserializes instances of classes implementing EOEnterpriseObject. Users must register a separate WOEnterpriseObjectDeserializer for every class implementing WOEnterpriseObjectDeserializer which is not a subclass of EOGenericRecord or EOCustomRecord.
 * See Also:Serialized Form
 */
public class WOEnterpriseObjectDeserializer extends org.apache.axis.encoding.DeserializerImpl implements org.apache.axis.encoding.Deserializer, com.webobjects.webservices.support.xml.WOSoapConstants{
    public WOEnterpriseObjectDeserializer(){
         //TODO codavaj!!
    }

    protected java.lang.Object mergeProperties(java.lang.Object subject, com.webobjects.webservices.support.xml.WOStringKeyMap properties, java.lang.String keyPathPrefix, com.webobjects.webservices.support.xml.WOEnterpriseObjectSerializationStrategy strategy){
        return null; //TODO codavaj!!
    }

    public void onEndElement(java.lang.String namespace, java.lang.String localName, org.apache.axis.encoding.DeserializationContext context) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public org.apache.axis.message.SOAPHandler onStartChild(java.lang.String namespace, java.lang.String localName, java.lang.String prefix, org.xml.sax.Attributes attributes, org.apache.axis.encoding.DeserializationContext context) throws org.xml.sax.SAXException{
        return null; //TODO codavaj!!
    }

    public void onStartElement(java.lang.String namespace, java.lang.String localName, java.lang.String prefix, org.xml.sax.Attributes attributes, org.apache.axis.encoding.DeserializationContext context) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    /**
     * Set the name of the class to which an element will be deserialized.
     */
    public void setEntityName(java.lang.Object name) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    /**
     * Set the globalID of the object to be instantiated.
     */
    public void setGlobalID(java.lang.Object gid) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public void setProperties(java.lang.Object map) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

}
