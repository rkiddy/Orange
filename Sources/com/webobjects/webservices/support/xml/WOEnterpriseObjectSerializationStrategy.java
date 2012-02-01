package com.webobjects.webservices.support.xml;
public class WOEnterpriseObjectSerializationStrategy implements com.webobjects.webservices.support.xml.WOSoapConstants{
    public static final java.lang.String AnyServiceNameIdentifier="*";

    /**
     * The string constant used within an org.apache.axis.MessageContext
     * See Also:Constant Field Values
     */
    public static final java.lang.String ContextPropertyName="com.webobjects.webservices.soap.eoserialization.strategy";

    public WOEnterpriseObjectSerializationStrategy(){
         //TODO codavaj!!
    }

    /**
     * The default implementation simply returns the Class associated with the final component of the keyPath's EOClassDescription's classForAttributeKey() result. A replacement for this can be substituted to change how the object at key path keyPath will be serialized. This is typically done to replace an object with a pretty printed or formatted value.
     */
    public java.lang.Class classForKeyPath(com.webobjects.eocontrol.EOEnterpriseObject eo, java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns EOEditingContext.substitutionEditingContext() If that is null it creates a new one and sets it as the substitution editing context.
     */
    public com.webobjects.eocontrol.EOEditingContext editingContextForDeserialization(java.lang.String entityName, com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns null which indicates that the SOAP-XML engine should fill in its own defaults for the element attributes. The return value must be assignment compatible with org.xml.sax.Attributes
     */
    public java.lang.Object elementAttributesForKeyPath(com.webobjects.eocontrol.EOEnterpriseObject eo, java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation just returns the keyPath argument. It provides an opportunity to map the internal KeyValueCoding path to a public name for the XML. This method is essentially the inverse of translatedKeyPath
     */
    public java.lang.String elementNameForKeyPath(com.webobjects.eocontrol.EOEnterpriseObject eo, java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked during deserialization to create the target object. The default implementation first attempts to reuse an object matching the gid already in the editing context parameter. If none exists, it attempts to fetch an object matching that gid. If the fetch fails, it creates and inserts a new EO of entityName. If nothing else is successful, it returns a WOStringKeyMap to hold the deserialized properties.
     */
    public java.lang.Object instantiateSubject(java.lang.String entityName, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext ec){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns all the attribute class properties sorted alphabetically and none of the EO's relationships.
     */
    public com.webobjects.foundation.NSArray keyPathsForSerialization(com.webobjects.eocontrol.EOEnterpriseObject eo){
        return null; //TODO codavaj!!
    }

    /**
     * A utility method to attempt several different ways to promote a EOGlobalID into an EOEnterpriseObject. The default implementation first attempts to reuse an object matching the gid already in the editing context parameter. If none exists, it attempts to fetch an object matching that gid. If the fetch fails, it creates and inserts a new EO of entityName. If nothing else is successful, it returns null.
     */
    public com.webobjects.eocontrol.EOEnterpriseObject promoteGlobalIDToObject(java.lang.String entityName, com.webobjects.eocontrol.EOGlobalID gid, com.webobjects.eocontrol.EOEditingContext ec, boolean shouldAttemptFetch){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation simply returns eo.valueForKeyPath(keyPath) but a replacement for this can be substituted as the XML element value. This is typically done to replace an object with a pretty printed or formatted value. The result must be assignment compatible with the Class returned by classForKeyPath
     */
    public java.lang.Object proxyForKeyPath(com.webobjects.eocontrol.EOEnterpriseObject eo, java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked during serialization. If true the xsi type will represent an EOEnterpriseObject, and the generate XML will be sufficient to deserialize the result as an EO. If false the xsi type will represent a raw SOAP struct, and the gid and entity will be omitted.
     */
    public boolean serializeAsCompleteEOEnterpriseObject(){
        return false; //TODO codavaj!!
    }

    /**
     * This method is invoked during the deserialization process after parsing the SOAP-XML message. The default implementation simply invokes takeValueForKeyPath()
     */
    public void setPropertyForKeyPath(java.lang.Object eo, java.lang.String keyPath, java.lang.Object value){
        return; //TODO codavaj!!
    }

    /**
     * A convenience method which gets the current org.apache.axis.MessageContext for the serialization/deserializtion operation in this thread, and sets the WOEnterpriseObjectSerializationStrategy.ContextPropertyName to rules
     */
    public static void setStrategyForService(com.webobjects.webservices.support.xml.WOEnterpriseObjectSerializationStrategy rules, java.lang.String serviceName, java.lang.String operationName){
        return; //TODO codavaj!!
    }

    public static com.webobjects.webservices.support.xml.WOEnterpriseObjectSerializationStrategy strategyForMessageContext(org.apache.axis.MessageContext msgContext){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the key path to supply to key-value coding methods when setting or getting the value at keyPath of eo. This method is essentially the inverse of elementNameForKeyPath. The XML element name of each of a serialized EO's property can be different from the key path used to access that property. In order to perform Key-Value-Coding operations for some public key path, represented by keyPath, a "translated" key path that represents path of an EOProperty must be available.
     */
    public java.lang.String translatedKeyPath(java.lang.Object eo, java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

}
