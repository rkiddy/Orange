package com.webobjects.webservices.support.xml;
/**
 * WOEnterpriseObjectSerializer serializes objects implementing the EOEnterpriseObject interface.
 * See Also:Serialized Form
 */
public class WOEnterpriseObjectSerializer implements org.apache.axis.encoding.Serializer, com.webobjects.webservices.support.xml.WOSoapConstants{
    public WOEnterpriseObjectSerializer(){
         //TODO codavaj!!
    }

    public java.lang.String getMechanismType(){
        return null; //TODO codavaj!!
    }

    /**
     * Serialize a value implementing EOEnterpriseObject into an element named name, with the indicated attributes. Will try to find an instance of WOEnterpriseObjectSerializationStrategy for the service and operation; if one has not been registered, a default strategy (an instance of WOEnterpriseObjectSerializationStrategy) will be used.
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
