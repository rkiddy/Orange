package com.webobjects.webservices.generation;
/**
 * See Also:Serialized Form
 */
public class WOOperation extends com.webobjects.appserver.WOComponent{
    /**
     * Constructor for WOOperation.
     * Parameters:context - WOContext this operation was created in
     */
    public WOOperation(com.webobjects.appserver.WOContext context){
         //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray aggregateValuesResult(com.webobjects.foundation.NSArray resultArray){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the class name for each input part key path. For key paths that terminate at an EOAttribute, this is the class defined by the EOAttribute. For key paths that terminate at an EORelationship, the class name will be the NSArray class name for toMany relationships, and EOGlobalID for toOne relationships. The result array is ordered to match the key paths in inputPartKeyPaths.
     */
    public com.webobjects.foundation.NSArray attributeClassNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the representative class for each output key path. For key paths that terminate at an EOAttribute, this is the class defined by the EOAttribute. For key paths that terminate at an EORelationship, the class will be the NSArray class for toMany relationships, and EOGlobalID for toOne relationships. The result array is ordered to match the key paths in outputPartKeyPaths.
     */
    public com.webobjects.foundation.NSArray classesForKeyPaths(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the String keys used for building key value qualifiers for attributes. These keys are defined in the rule system and are ordered to match the inputPartKeyPaths defined in the rule system.
     */
    public com.webobjects.foundation.NSArray comparisonKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns this operation's D2WContext
     */
    public com.webobjects.directtoweb.D2WContext d2wContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns this operation's EOEditingContext
     */
    public com.webobjects.eocontrol.EOEditingContext editingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the String key used at the end of a key path to represent that the EO at that key path should be serialized as its EOGenericRecord. The result is the D2WContext value for key WOServiceUtilities.RuleSystemConstants.GidArgumentKeyKey
     */
    public java.lang.String gidArgumentKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOProperty keys/key paths associated with the public names of the operation's input message parts. These keys are used for key-value coding operations on EO's desrialized during incovation. The result array is ordered so that the index of each argument key path matches that of its associated argument name.
     */
    public com.webobjects.foundation.NSArray inputPartKeyPaths(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the names of the operation's SOAP input message parts. These names are translated to the EOProperty key paths of inputPartKeyPaths() during the operation's incovation as EO arguments are deserialized. The result array is ordered so that the index of each input part name matches that of its associated input part key path. This ordering is also used to define the parameterOrdering of the operation's WSDL.
     */
    public com.webobjects.foundation.NSArray inputPartNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the objects this operation was invoked with. These are the objects that were deserialized from the SOAP message from the web service's client. These objects have the same ordering as the arguments sent by the client. A compliant client will send arguments in the same order as was defined in the operation's WSDL, so the ordering will match that of the inputPartNames.
     */
    public com.webobjects.foundation.NSArray inputPartValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Invokes the operation and returns the invocation's result. Override this method to perform custom work and return a custom result set.
     * The default implementation returns null.
     */
    public java.lang.Object invoke(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOProperty keys/key paths associated with the public names of the operation's output message parts. These keys are used for key-value coding operations when serializing EO's during incovation. The result array is ordered so that the index of each output key path matches that of its associated result name.
     */
    public com.webobjects.foundation.NSArray outputPartKeyPaths(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the names of the operation's SOAP output message parts. These names are translated to the EOProperty key paths of outputPartKeyPaths() during the operation's incovation as EO result are serialized. The result array is ordered so that the index of each output part name matches that of its associated result key path.
     */
    public com.webobjects.foundation.NSArray outputPartNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Translates the public name of an argument or result key to the EOProperty key path defined in the rule system
     */
    public java.lang.String propertyNameForPartName(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if this operation must work with an entity. Subclasses should override this method to return false ONLY if the operation will never return, or accept as input, an EOEnterpriseObject.
     */
    public static boolean requiresEntity(){
        return false; //TODO codavaj!!
    }

    /**
     * Saves changes to the operation's EOEditingContext if the operation should save its changes immediately as specified by WOServiceUtilities.commitOperationImmediately
     */
    public void saveChangesInEditingContext(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the serialization strategy to use when serializing and deserializing objects for this operation. The default implementation returns null;
     */
    public com.webobjects.webservices.support.xml.WOEnterpriseObjectSerializationStrategy serializationStrategy(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets this operations D2WContext
     */
    public void setD2wContext(com.webobjects.directtoweb.D2WContext context){
        return; //TODO codavaj!!
    }

    /**
     * Returns the String key to represent that the client did not specify a value for an input part. The result is the D2WContext value for key WOServiceUtilities.RuleSystemConstants.UnspecifiedArgumentKeyKey
     */
    public java.lang.String unspecifiedArgumentKey(){
        return null; //TODO codavaj!!
    }

}
