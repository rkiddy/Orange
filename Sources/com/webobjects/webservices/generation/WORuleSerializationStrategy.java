package com.webobjects.webservices.generation;
/**
 * The WORuleSerializationStrategy implements WOEnterpriseObjectSerializationStrategy methods by using information from a D2WContext. When an operation invocation gets to the JavaWebServicesGeneration framework, a WOOperation is created and is given a chance to supply its own WOEnterpriseObjectSerializationStrategy strategy. If the WOOperation returns null (the default) for its strategy, a WORuleSerializationStrategy is created with a D2WContext that contains rule based information about the operation being invoked and the types and names of the operation's input and output parts. The rule based strategy can override methods from WOEnterpriseObjectSerializationStrategy so that the behaviour is goverened by the rules in the D2WContext's model and the D2WContext's state.
 */
public class WORuleSerializationStrategy extends com.webobjects.webservices.support.xml.WOEnterpriseObjectSerializationStrategy implements com.webobjects.webservices.generation.WOServiceUtilities.RuleSystemConstants{
    /**
     * Default constructor.
     */
    public WORuleSerializationStrategy(){
         //TODO codavaj!!
    }

    /**
     * Creates a new WORuleSerializationStrategy that uses context to implement its strategy.
     */
    public WORuleSerializationStrategy(com.webobjects.directtoweb.D2WContext context){
         //TODO codavaj!!
    }

    /**
     * Returns the Class associated with the final component of the path, keyPath, of eo. The value for key PropertyKeyKey is set in the D2WContext and then the value of the D2WContext key ClassForPropertyKeyKey is returned.
     */
    public java.lang.Class classForKeyPath(com.webobjects.eocontrol.EOEnterpriseObject eo, java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the D2WContext this object uses to implement its serialization strategy.
     */
    public com.webobjects.directtoweb.D2WContext d2wContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the current Session's EOEditingContext if the request has a session. otherwise returns the result of super's implementation.
     */
    public com.webobjects.eocontrol.EOEditingContext editingContextForDeserialization(java.lang.String entityName, com.webobjects.eocontrol.EOGlobalID gid){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of output part names that will be added to the serialized content of EOEnterpriseObjects (specifically those EO's whose entity name match the D2WContext value for key WOServiceUtilities.RuleSystemConstants.EntityNameKey).
     * The output part names returned by this method do not include names that translate to aggregate key paths. Values for aggrregate key paths are returned as a seperate WOStringKeyMap.
     */
    public com.webobjects.foundation.NSArray keyPathsForSerialization(com.webobjects.eocontrol.EOEnterpriseObject eo){
        return null; //TODO codavaj!!
    }

    /**
     * Overrides proxyForKeyPath in WOEnterpriseObjectSerializationStrategy to replace the EO(s) at key path keyPath of EO eo with the globalID(s) of the EO(s) at keyPath. This ensures that only the EO eo is serialized as an EOEnterpriseObject and that all destination EOs are serialized as EOGlobalIDs.
     */
    public java.lang.Object proxyForKeyPath(com.webobjects.eocontrol.EOEnterpriseObject eo, java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * Overrides serializeAsCompleteEOEnterpriseObject in WOEnterpriseObjectSerializationStrategy. returns false if the D2WContext value for key ReturnsSOAPStructKey is true. Returns true otherwise.
     */
    public boolean serializeAsCompleteEOEnterpriseObject(){
        return false; //TODO codavaj!!
    }

    /**
     * Sets the D2WContext this object uses to implement its serialization strategy.
     */
    public void setD2wContext(com.webobjects.directtoweb.D2WContext context){
        return; //TODO codavaj!!
    }

    /**
     * This method is invoked during the deserialization process after parsing the SOAP-XML message. The WORuleSerializationStrategy implementation invokes super's implementation using the translated key path based on keyPath.
     */
    public void setPropertyForKeyPath(java.lang.Object eo, java.lang.String keyPath, java.lang.Object value){
        return; //TODO codavaj!!
    }

    /**
     * Returns the key path to supply to key-value coding methods when setting or getting the value at keyPath of eo. The XML element name of each of a serialized EO's property can be different from the key path used to access that property. In order to perform Key-Value-Coding operations for some public key path, represented by keyPath, a "translated" key path that represents path of an EOProperty must be available. The WORuleSerializationStrategy implementation sets the value of the key PropertyKeyKey in its D2WContext to keyPath and then gets the value for the D2WContext's key, TranslatedAttributeNameKey. If result is null, no translation is needed and the original keyPath is returned.
     */
    public java.lang.String translatedKeyPath(java.lang.Object eo, java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

}
