package com.webobjects.appserver.xml;
/**
 * This class is used to encode objects as XML data. Encoding can take place either with or without a mapping model. The mapping model provides greater control over the encoding process and is typically used when you are encoding and decoding XML that is destined for, or originates from, an external source. When the WOXMLCoder and WOXMLDecoder are used as a simple archiving mechanism, the mapping model is usually not necessary. For more information on the mapping model, see the "The Format of the Mapping Model" in the package description. To encode an object, simply invoke the encodeRootObjectForKey method. To perform the reverse operation, generating an object from XML data, see the WOXMLDecoder class.
 * See Also:WOXMLDecoder, WOXMLCoder.encodeRootObjectForKey(java.lang.Object, java.lang.String)
 */
public class WOXMLCoder{
    protected java.lang.String xmlDeclaration;

    protected WOXMLCoder(){
         //TODO codavaj!!
    }

    /**
     * Returns a default coder capable of encoding objects into XML data without using a mapping model. This method corresponds directly with the decoder factory method in WOXMLDecoder. When encoding a custom object using the WOXMLCoder without a mapping model, your custom class needs to implement encodeWithWOXMLCoder declared in the WOXMLCoding interface (your implementation of this method is where you encode the custom class's instance variables). You don't need this if the object you are encoding is: an instance of String, Number, Boolean and NSTimestamp. Subclasses of these classes will be treated like their superclass, unless you explicitly implement WOXMLCoding interface. an instance of NSArray, NSDictionary and NSData. Please note that before WebObjects 5.1, when the mutable forms of these classes (NSMutableArray, NSMutableDictionary and NSMutableData) are encoded using WOXMLCoder, they get written out as their immutable counterparts. For example, NSMutableArray used to be written out as NSArray. Now, they get written out as themselves. As a result, when WOXMLDecoder is used to decode the objects, they are decoded as mutable forms. an instance of EOEnterpriseObject (or a subclass, providing that all instance variables are either attributes or relationships). Your custom class also don't need to implement WOXMLCoding if you are working with a mapping model.
     */
    public static com.webobjects.appserver.xml.WOXMLCoder coder(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a coder object initialized with the mapping model specified by mappingURL. For more information on the mapping model, see the "The Format of the Mapping Model" in the package description. This method corresponds directly with the decoderWithMapping factory method in WOXMLDecoder.
     */
    public static com.webobjects.appserver.xml.WOXMLCoder coderWithMapping(java.lang.String mappingURL){
        return null; //TODO codavaj!!
    }

    protected void cr(){
        return; //TODO codavaj!!
    }

    /**
     * Encodes a boolean value into XML data. It is called either implicitly from encodeRootObjectForKey or directly as part of encodeWithWOXMLCoder. Note that nothing is returned from this method but the internal state of WOXMLCoder gets appended with the generated XML data as a result of this method call. The XML data will eventually be returned as a result of encodeRootObjectForKey.
     * key is used as the XML element and the content is the string representation of b-either "True" or "False"-and the element has an attribute type="boolean". For example, the following call encodeBooleanForKey(true,
     * myTag
     * ); causes the following XML data to be appended to the WOXMLCoder's internal state:
     * myTag type=
     * boolean
     * True
     * /myTag
     * key is ignored when a mapping model is used as the model specifies what XML tag to use.
     */
    public void encodeBooleanForKey(boolean b, java.lang.String key){
        return; //TODO codavaj!!
    }

    protected java.lang.String encodedClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Encodes a double value into XML data. It is called either implicitly from encodeRootObjectForKey or directly as part of encodeWithWOXMLCoder. Note that nothing is returned from this method but the internal state of WOXMLCoder gets updated with the generated XML data as a result of this method call. The XML data will eventually be returned as a result of encodeRootObjectForKey.
     * key is used as the XML element and the content is the string representation of d and the element has an attribute type="double". For example, the following call encodeDoubleForKey(1.23,
     * myTag
     * ); causes the following XML data to be appended to the WOXMLCoder's internal state:
     * myTag type=
     * double
     * 1.23
     * /myTag
     * key is ignored when a mapping model is used as the model specifies what XML tag to use.
     */
    public void encodeDoubleForKey(double d, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Encodes a float value into XML data. It is called either implicitly from encodeRootObjectForKey or directly as part of encodeWithWOXMLCoder. Note that nothing is returned from this method but the internal state of WOXMLCoder gets updated with the generated XML data as a result of this method call. The XML data will eventually be returned as a result of encodeRootObjectForKey.
     * key is used as the XML element and the content is the string representation of f and the element has an attribute type="float". For example, the following call encodeFloatForKey(1.23,
     * myTag
     * ); causes the following XML data to be appended to the WOXMLCoder's internal state:
     * myTag type=
     * float
     * 1.23
     * /myTag
     * key is ignored when a mapping model is used as the model specifies what XML tag to use.
     */
    public void encodeFloatForKey(float f, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Encodes an integer value into XML data. It is called either implicitly from encodeRootObjectForKey or directly as part of encodeWithWOXMLCoder. Note that nothing is returned from this method but the internal state of WOXMLCoder gets updated with the generated XML data as a result of this method call. The XML data will eventually be returned as a result of encodeRootObjectForKey.
     * key is used as the XML element and the content is the string representation of i and the element has an attribute type="int". For example, the following call encodeIntForKey(123,
     * myTag
     * ); causes the following XML data to be appended to the WOXMLCoder's internal state:
     * myTag type=
     * int
     * 123
     * /myTag
     * key is ignored when a mapping model is used as the model specifies what XML tag to use.
     */
    public void encodeIntForKey(int i, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Encodes an object into XML data. It is called either implicitly from encodeRootObjectForKey or directly as part of encodeWithWOXMLCoder. Note that nothing is returned from this method but the internal state of WOXMLCoder gets appended with the generated XML data as a result of this method call. The XML data will eventually be returned as a result of encodeRootObjectForKey.
     * If a mapping model is not used, object has to be an instance of a limited set of classes described in coder or its class has to implement WOXMLCoding interface.
     * key is ignored when a mapping model is used or when object is an Enterprise Object. In the former case, the mapping model specifies what XML tag to use. In the latter, attribute information stored in the EOModel is used when assigning an XML tag.
     */
    public void encodeObjectForKey(java.lang.Object object, java.lang.String key){
        return; //TODO codavaj!!
    }

    protected void encodeObjectInTag(java.lang.String s, java.lang.String xmlTag, java.lang.String type){
        return; //TODO codavaj!!
    }

    protected void encodeReferenceInTag(int objectID, java.lang.String xmlTag, java.lang.String type){
        return; //TODO codavaj!!
    }

    /**
     * Encodes an object so that it becomes the root element for the generated XML data.
     * If a mapping model is not used, object has to be an instance of a limited set of classes described in coder or its class has to implement WOXMLCoding interface.
     * key is ignored when a mapping model is used or when object is an Enterprise Object. In the former case, the mapping model specifies what XML tag to use. In the latter, attribute information stored in the EOModel is used when assigning an XML tag.
     */
    public java.lang.String encodeRootObjectForKey(java.lang.Object object, java.lang.String key){
        return null; //TODO codavaj!!
    }

    protected void encodeStringInTag(java.lang.String s, java.lang.String xmlTag, java.lang.String type){
        return; //TODO codavaj!!
    }

    protected java.lang.String escapeString(java.lang.String toValidate){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the XML declaration to the default:
     * xml version="1
     * 0"
     * >
     */
    public void setXmlDeclaration(){
        return; //TODO codavaj!!
    }

    /**
     * Sets the XML declaration according to the parameters passed.
     */
    public void setXmlDeclaration(java.lang.String version, java.lang.String encoding, java.lang.String standalone){
        return; //TODO codavaj!!
    }

    protected boolean typeNeedsIndentation(java.lang.Object o){
        return false; //TODO codavaj!!
    }

    /**
     * Gets the previously specified XML declaration.
     */
    public java.lang.String xmlDeclaration(){
        return null; //TODO codavaj!!
    }

    protected java.lang.String xmlTagForClassNamed(java.lang.String className){
        return null; //TODO codavaj!!
    }

    protected java.lang.String xmlTagForPropertyKey(java.lang.String propertyKey, java.lang.String className){
        return null; //TODO codavaj!!
    }

}
