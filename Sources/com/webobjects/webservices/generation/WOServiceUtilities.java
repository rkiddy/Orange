package com.webobjects.webservices.generation;
public class WOServiceUtilities{
    public WOServiceUtilities(){
         //TODO codavaj!!
    }

    /**
     * Performs addObjectToBothSidesOfRelationshipWithKey using eo as the origin and object as the destination.
     */
    public static void addDestinationObjectToEOWithKey(com.webobjects.webservices.support.xml.WOEnterpriseObjectSerializationStrategy strategy, java.lang.Object object, com.webobjects.eocontrol.EOEnterpriseObject eo, java.lang.String propertyName){
        return; //TODO codavaj!!
    }

    /**
     * Returns the result with all values associated with an aggregate key from translatedKeys placed into a WOStringKeyMap. Values are placed into the WOStringKeyMap with the corresponding key from outputPartNames.
     * If there are no aggregate keys defined in the translatedKeys, then the result array is returned unchanged. Otherwise the array of resultant WOStringKeyMap objects is added to the result array. The value of arrays of values are computed by the valueForAggregateKey method.
     */
    public static com.webobjects.foundation.NSArray aggregateValuesResult(com.webobjects.foundation.NSArray result, com.webobjects.foundation.NSArray translatedKeys, com.webobjects.foundation.NSArray outputPartNames){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an EOQualifier built to fetch objects where for each attribute name in attributeNames a qualifier, based on the corresponding value from values and comparison key from comparisonKeys, is added to an EOAndQualifier.
     */
    public static com.webobjects.eocontrol.EOQualifier buildQualifier(com.webobjects.eoaccess.EOEntity entity, com.webobjects.foundation.NSArray attributeNames, com.webobjects.foundation.NSArray values, com.webobjects.foundation.NSArray comparisonKeys, com.webobjects.foundation.NSArray attributeClassNames, java.lang.String unspecifiedArgumentKey){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an EOEditingContext based on information in context. If context contains has a WOSession, that session's editing context is returned. Otherwise a new editing context is returned.
     */
    public static com.webobjects.eocontrol.EOEditingContext editingContextForContext(com.webobjects.appserver.WOContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Returns EOGlobalID of an object with primary key values created from inputPartValues. The primary key attribute names of entity are compared with keys of attributeKeys if they match, the values in inputPartValues corresponding to the primary key attribute names of attributeKeys are used to generate an EOKeyGlobalID.
     * Note that attributeKeys may contain more attribute names than the primary key attributes for entity, but should not contain less.
     */
    public static com.webobjects.eocontrol.EOGlobalID globalIDFromValues(com.webobjects.eoaccess.EOEntity entity, com.webobjects.foundation.NSArray attributeKeys, com.webobjects.foundation.NSArray inputPartValues){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the operation should commit changes in its editing context immediately after completing its work, false if the operation should leave the changes in its editing context unsaved to the parent object store.
     * If the operation is being invoked as part of a transaction (invoked between a WOBeginTransactionOperation and a WOCommitTransactionOperation or WORollbackTransactionOperation), then the operation should not save changes in its editing context so this method returns false. If the operation associated with context is not invoked as part of a transaction, then this method returns false.
     */
    public static boolean shouldCommitChangesImmediately(com.webobjects.appserver.WOContext context){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the aggregate value for key key of NSArray array.
     */
    public static java.lang.Object valueForAggregateKey(java.lang.String key, com.webobjects.foundation.NSArray array){
        return null; //TODO codavaj!!
    }

    /**
     * Constants for keys used by the rule system to access values in a D2WContext
     */
    public static interface RuleSystemConstants{
        /**
         * String key for accessing the names of all operations in the D2WContext including both automatically and manually added operations
         * See Also:Constant Field Values
         */
        static final java.lang.String AllOperationNamesKey="allOperationNames";

        /**
         * String key for accessing the names of all Direct to Web Services
         * See Also:Constant Field Values
         */
        static final java.lang.String AllServiceNamesKey="serviceNames";

        /**
         * This key is intentionally not documented. Developers should never have to use this key
         * See Also:Constant Field Values
         */
        static final java.lang.String AssistantComparisonKeyKey="assistantComparisonKey";

        /**
         * This key is intentionally not documented. Developers should never have to use this key
         * See Also:Constant Field Values
         */
        static final java.lang.String AssistantTaskNameKey="assistantTaskName";

        /**
         * String key for accessing the Class for the property currently being inspected
         * See Also:Constant Field Values
         */
        static final java.lang.String ClassForPropertyKeyKey="classForPropertyKey";

        /**
         * String key for accessing the name of the Class for the property currently being inspected
         * See Also:Constant Field Values
         */
        static final java.lang.String ClassNameForPropertyKeyKey="classNameForPropertyKey";

        /**
         * String key for accessing the EOKeyComparisonQualifier key used to build an EOQualifier for the current property key
         * See Also:Constant Field Values
         */
        static final java.lang.String ComparisonKeyKey="comparisonKey";

        /**
         * String key for accessing the entity name for the current operation
         * See Also:Constant Field Values
         */
        static final java.lang.String EntityNameKey="entityName";

        /**
         * String key for accessing the fetchLimit to use when fetch in the WOSearchOperation
         * See Also:Constant Field Values
         */
        static final java.lang.String FetchLimitKey="fetchLimit";

        /**
         * String key for accessing the name of the fetch specification used in a WOFetchSpecSearchOperation
         * See Also:Constant Field Values
         */
        static final java.lang.String FetchSpecificationNameKey="fetchSpecificationName";

        /**
         * String key for accessing the String used to signify that the EO at propertyKey currently being inspected should be serialized as an EOGlobalID
         * See Also:Constant Field Values
         */
        static final java.lang.String GidArgumentKeyKey="gidArgumentKey";

        /**
         * String key for accessing the XML element names of input message parts for the current operation
         * See Also:Constant Field Values
         */
        static final java.lang.String InputPartNamesKey="argumentKeys";

        /**
         * String key for accessing the values the operation was invoked with
         * See Also:Constant Field Values
         */
        static final java.lang.String InputPartValuesKey="inputPartValues";

        /**
         * This key is intentionally not documented. Developers should never have to use this key
         * See Also:Constant Field Values
         */
        static final java.lang.String IsDefaultOperatorKey="isDefaultOperator";

        /**
         * String key for accessing whether the current service is the default Direct to Web Service
         * See Also:Constant Field Values
         */
        static final java.lang.String IsDefaultServiceKey="isDefaultService";

        /**
         * String key for accessing whether the current operation is enabled
         * See Also:Constant Field Values
         */
        static final java.lang.String IsOperationEnabledKey="isOperationEnabled";

        /**
         * String key for accessing whether the current operation is frozen
         * See Also:Constant Field Values
         */
        static final java.lang.String IsOperationFrozenKey="isOperationFrozen";

        /**
         * String key for accessing whether the service is enabled
         * See Also:Constant Field Values
         */
        static final java.lang.String IsServiceEnabledKey="isServiceEnabled";

        /**
         * String key for accessing whether the current service allows transactions
         * See Also:Constant Field Values
         */
        static final java.lang.String IsTransactionEnabledKey="isTransactionEnabled";

        /**
         * String key for accessing the EOModelGroup for the current operation
         * See Also:Constant Field Values
         */
        static final java.lang.String ModelGroupKey="modelGroup";

        /**
         * String key for accessing the name of the class that implements the operation named operationName
         * See Also:Constant Field Values
         */
        static final java.lang.String OperationClassNameKey="operationClassName";

        /**
         * String key for accessing the name of the current operation
         * See Also:Constant Field Values
         */
        static final java.lang.String OperationNameKey="operationName";

        /**
         * String key for accessing the names of all manually added operations
         * See Also:Constant Field Values
         */
        static final java.lang.String OperationNamesKey="operationNames";

        /**
         * This key is intentionally not documented. Developers should never have to use this key
         * See Also:Constant Field Values
         */
        static final java.lang.String OperatorNameKey="operatorName";

        /**
         * String key for accessing the XML element names of properties the current operation will return
         * See Also:Constant Field Values
         */
        static final java.lang.String OutputPartNamesKey="outputPartNames";

        /**
         * String key for accessing the property currently being inspected
         * See Also:Constant Field Values
         */
        static final java.lang.String PropertyKeyKey="propertyKey";

        /**
         * String key for accessing the names of entities that will be published via Direct to Web Services
         * See Also:Constant Field Values
         */
        static final java.lang.String PublicEntityNamesKey="publicEntityNames";

        /**
         * String key for accessing whether the current operation should return EOEnterpriseObjects as serialized EO's, or as SOAP-Struct's
         * See Also:Constant Field Values
         */
        static final java.lang.String ReturnsSOAPStructKey="returnsSOAPStruct";

        /**
         * String key for accessing the name of the current service
         * See Also:Constant Field Values
         */
        static final java.lang.String ServiceNameKey="serviceName";

        /**
         * String key for accessing the EOProperty key path for the current argument or result key
         * See Also:Constant Field Values
         */
        static final java.lang.String TranslatedAttributeNameKey="translatedAttributeName";

        /**
         * String key for accessing the String used to signify that the argument value was left unspecified by the client
         * See Also:Constant Field Values
         */
        static final java.lang.String UnspecifiedArgumentKeyKey="unspecifiedArgumentKey";

        /**
         * String key for accessing whether the current operation uses a named fetch specification
         * See Also:Constant Field Values
         */
        static final java.lang.String UsesNamedFetchSpecificationKey="usesNamedFetchSpecification";

        /**
         * String key for accessing the current com.webobjects.appserver.WOContext
         * See Also:Constant Field Values
         */
        static final java.lang.String WOContextKey="com.webobjects.webservices.generation.wocontext_key";

        /**
         * String key for accessing the name of the default service name
         * See Also:Constant Field Values
         */
        static final java.lang.String WODefaultWebServiceKey="WODefaultWebService";

        /**
         * String key for accessing the name of the component to use to generate the WSDL for a service
         * See Also:Constant Field Values
         */
        static final java.lang.String WSDLComponentNameKey="WSDLComponentName";

    }
}
