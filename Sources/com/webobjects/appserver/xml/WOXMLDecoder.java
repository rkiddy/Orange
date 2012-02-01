package com.webobjects.appserver.xml;
/**
 * Use this class to decode an object from XML data. Decoding can take place either with or without a mapping model. The mapping model provides greater control over the decoding process and is typically used when you are encoding and decoding XML that is destined for, or originates from, an external source. When the WOXMLCoder and WOXMLDecoder are used as a simple archiving mechanism, the mapping model is usually not necessary. For more information on the mapping model, see the "The Format of the Mapping Model" in the package description.
 * See Also:WOXMLCoder, WOXMLCoding, WOXMLDecoder.decodeRootObject(NSData), WOXMLDecoder.decodeRootObject(String), NSKeyValueCoding
 */
public class WOXMLDecoder implements com.webobjects.foundation.NSKeyValueCoding{
    protected WOXMLDecoder(){
         //TODO codavaj!!
    }

    protected void addObjectToCache(com.webobjects.appserver.xml._private._DecodingNode childNode, java.lang.Object anObject){
        return; //TODO codavaj!!
    }

    protected com.webobjects.appserver.xml._private._DecodingContentHandler contentHandler(){
        return null; //TODO codavaj!!
    }

    /**
     * Decodes the XML data in the internal state of this decoder and returns a boolean value based on the key specified. Use this method within the single-argument constructor that follows the protocol described in the class description. It is used to set a boolean instance variable to the value of the key element within the XML being decoded. For example, to extract the marital status from the following XML:
     * element type=
     * Person
     * objectID=
     * 4
     * Name type=
     * java.lang.String
     * objectID=
     * 5
     * John Smith
     * /Name
     * MaritalStatus type=
     * boolean
     * True
     * /MaritalStatus
     * NumberOfChildren type=
     * int
     * 2
     * /NumberOfChildren
     * /element
     * You could use something similar to the following:
     * boolean married = decoder.decodeBooleanForKey(
     * MaritalStatus
     * );
     */
    public boolean decodeBooleanForKey(java.lang.String aKey){
        return false; //TODO codavaj!!
    }

    /**
     * Decodes the XML data in the internal state of this decoder and returns a double value based on the key specified. Use this method within the single-argument constructor that follows the protocol described in the class description. It is used to set a double instance variable to the value of the key element within the XML being decoded.
     */
    public double decodeDoubleForKey(java.lang.String aKey){
        return 0.0d; //TODO codavaj!!
    }

    /**
     * Decodes the XML data in the internal state of this decoder and returns a float value based on the key specified. Use this method within the single-argument constructor that follows the protocol described in the class description. It is used to set a float instance variable to the value of the key element within the XML being decoded.
     */
    public float decodeFloatForKey(java.lang.String aKey){
        return 0.0f; //TODO codavaj!!
    }

    /**
     * Decodes the XML data in the internal state of this decoder and returns an int value based on the key specified. Use this method within the single-argument constructor that follows the protocol described in the class description. It is used to set a int instance variable to the value of the key element within the XML being decoded. For example, to extract the number of children from the following XML:
     * element type=
     * Person
     * objectID=
     * 4
     * Name type=
     * java.lang.String
     * objectID=
     * 5
     * John Smith
     * /Name
     * MaritalStatus type=
     * boolean
     * True
     * /MaritalStatus
     * NumberOfChildren type=
     * int
     * 2
     * /NumberOfChildren
     * /element
     * You could use something similar to the following:
     * int children = decoder.decodeIntForKey(
     * NumberOfChildren
     * );
     */
    public int decodeIntForKey(java.lang.String aKey){
        return 0; //TODO codavaj!!
    }

    /**
     * Decodes the XML data in the internal state of this decoder and constructs an object based on the key specified. It is called either implicitly from decodeRootObject or directly from the single-argument constructor that follows the protocol described in the class description. When used in the single-argument constructor, it is used to set up an instance variable to a newly constructed object whose class and content depends upon the value of the key.
     */
    public java.lang.Object decodeObjectForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a default decoder capable of decoding objects into XML data without using a mapping model. This method corresponds directly with the coder factory method in WOXMLCoder. See class description for details on how this coder can be used.
     */
    public static com.webobjects.appserver.xml.WOXMLDecoder decoder(){
        return null; //TODO codavaj!!
    }

    /**
     * Decodes the XML specified by an InputSource is and constructs a corresponding object. You can learn more about org.xml.sax.InputSource from
     * . The input source can either contain a complete XML document or an XML segment. If decoding an XML segment (where there's no XML declaration), you can change the character encoding of the data) by using setEncoding.
     */
    public java.lang.Object decodeRootObject(org.xml.sax.InputSource is){
        return null; //TODO codavaj!!
    }

    /**
     * Decodes the XML specified by an NSData data and constructs a corresponding object. It can either contain a complete XML document or an XML segment. If decoding an XML segment (where there's no XML declaration), you can change the character encoding of the data) by using setEncoding.
     */
    public java.lang.Object decodeRootObject(com.webobjects.foundation.NSData data){
        return null; //TODO codavaj!!
    }

    /**
     * Decodes the XML specified by the URL xmlFile and constructs a corresponding object. The file can either contain a complete XML document or an XML segment. If decoding an XML segment (where there's no XML declaration), you can change the character encoding of the data) by using setEncoding.
     */
    public java.lang.Object decodeRootObject(java.lang.String xmlFile){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a coder object initialized with the mapping model specified by mappingModelFile. For more information on the mapping model, see the "The Format of the Mapping Model" in the package description. This method corresponds directly with the coderWithMapping factory method in WOXMLCoder. See class description for details on how this coder can be used.
     */
    public static com.webobjects.appserver.xml.WOXMLDecoder decoderWithMapping(java.lang.String mappingModelFile){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the character encoding set previously for the decoding process.
     */
    public java.lang.String encoding(){
        return null; //TODO codavaj!!
    }

    protected java.lang.String getChildNodeType(com.webobjects.appserver.xml._private._DecodingNode childNode){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    protected com.webobjects.appserver.xml._private._DecodingHandler handler(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Gets the current parser used for parsing XML data. The default parser can be changed by using setParserClassName.
     */
    public org.xml.sax.Parser parser(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Gets the class name of the current parser used for parsing the XML data. An example is "org.apache.xerces.parsers.SAXParser".
     */
    public java.lang.String parserClassName(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the character encoding. The encoding must be a string acceptable for an XML encoding declaration (see section 4.3.3 of the XML 1.0 recommendation). Use judiciously as the encoding overrides the encoding specified in the XML declaration of the data to be parsed.
     * This method has no effect when the application provides a character stream since by definition, the characters had already been extracted using a particular encoding.
     */
    public void setEncoding(java.lang.String encoding){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Sets the current parser's class name so that a new parser of that class can be used. Unless there is a problem with the default parser, you should not need to change it.
     * This method must be invoked before the parser is instantiated (by the parser method); once the parser has been instantiated, calling this method has no effect.
     */
    public void setParserrClassName(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets the current parser's class name so that a new parser of that class can be used. Unless there is a problem with the default parser, you should not need to change it.
     * This method must be invoked before the parser is instantiated (by the parser method); once the parser has been instantiated, calling this method has no effect.
     */
    public void setXMLReaderClassName(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.
     */
    public void takeValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSKeyValueCoding.
     */
    public java.lang.Object valueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the current parser used for parsing XML data. The default parser can be changed by using setParserClassName.
     */
    public org.xml.sax.XMLReader xmlReader(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the class name of the current parser used for parsing the XML data. An example is "org.apache.xerces.parsers.SAXParser".
     */
    public java.lang.String xmlReaderClassName(){
        return null; //TODO codavaj!!
    }

}
