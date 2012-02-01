package com.webobjects.webservices.support.xml;
/**
 * WODataSerializer serializes NSData instances.
 * See Also:Serialized Form
 */
public class WODataSerializer extends org.apache.axis.encoding.ser.Base64Serializer implements org.apache.axis.encoding.Serializer, com.webobjects.webservices.support.xml.WOSoapConstants{
    public WODataSerializer(){
         //TODO codavaj!!
    }

    /**
     * Serialize an NSData.
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
    public org.w3c.dom.Element writeSchema(java.lang.Class aJavaType, org.apache.axis.wsdl.fromJava.Types types) throws java.lang.Exception{
        return null; //TODO codavaj!!
    }

}
