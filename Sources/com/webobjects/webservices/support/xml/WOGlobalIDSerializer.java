package com.webobjects.webservices.support.xml;
/**
 * WOGlobalIDSerializer serializes EOGlobalID instances.
 * See Also:Serialized Form
 */
public class WOGlobalIDSerializer implements org.apache.axis.encoding.Serializer, com.webobjects.webservices.support.xml.WOSoapConstants{
    public WOGlobalIDSerializer(){
         //TODO codavaj!!
    }

    public java.lang.String getMechanismType(){
        return null; //TODO codavaj!!
    }

    /**
     * Serialize an EOGlobalID. Will throw an IOException if value is not an instance of EOGlobalID.
     */
    public void serialize(javax.xml.namespace.QName name, org.xml.sax.Attributes attributes, java.lang.Object value, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException{
        return; //TODO codavaj!!
    }

    /**
     * Return XML schema for the specified type, suitable for insertion into the
     * types
     * element of a WSDL document, or underneath an
     * element
     * or
     * attribute
     * declaration.
     */
    public org.w3c.dom.Element writeSchema(java.lang.Class javaType, org.apache.axis.wsdl.fromJava.Types types) throws java.lang.Exception{
        return null; //TODO codavaj!!
    }

}
