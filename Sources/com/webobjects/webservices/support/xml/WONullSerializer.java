package com.webobjects.webservices.support.xml;
/**
 * WONullSerializer serializes instances of NSKeyValueCoding.Null.
 * See Also:Serialized Form
 */
public class WONullSerializer implements org.apache.axis.encoding.Serializer, com.webobjects.webservices.support.xml.WOSoapConstants{
    public WONullSerializer(){
         //TODO codavaj!!
    }

    public java.lang.String getMechanismType(){
        return null; //TODO codavaj!!
    }

    /**
     * Serialize an element that is an NSKeyValueCoding.Null.
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
