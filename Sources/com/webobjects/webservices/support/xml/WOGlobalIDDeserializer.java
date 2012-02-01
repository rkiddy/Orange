package com.webobjects.webservices.support.xml;
/**
 * WOGlobalIDDeserializer deserializes instances of EOGlobalID.
 * See Also:Serialized Form
 */
public class WOGlobalIDDeserializer extends org.apache.axis.encoding.DeserializerImpl implements org.apache.axis.encoding.Deserializer, com.webobjects.webservices.support.xml.WOSoapConstants{
    public byte[] data;

    public java.lang.String entityName;

    public java.lang.String guessedEntityName;

    public java.lang.Object[] primaryKeys;

    public java.lang.String subEntityName;

    public WOGlobalIDDeserializer(){
         //TODO codavaj!!
    }

    public void onEndElement(java.lang.String namespace, java.lang.String localName, org.apache.axis.encoding.DeserializationContext context) throws org.xml.sax.SAXException{
        return; //TODO codavaj!!
    }

    public org.apache.axis.message.SOAPHandler onStartChild(java.lang.String namespace, java.lang.String localName, java.lang.String prefix, org.xml.sax.Attributes attributes, org.apache.axis.encoding.DeserializationContext context) throws org.xml.sax.SAXException{
        return null; //TODO codavaj!!
    }

}
