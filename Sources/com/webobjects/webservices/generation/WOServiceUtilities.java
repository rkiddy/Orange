
package com.webobjects.webservices.generation;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOSession;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import com.webobjects.webservices.support.xml.WOEnterpriseObjectSerializationStrategy;

public class WOServiceUtilities {
    public static interface RuleSystemConstants {

        public static final String AllServiceNamesKey = "serviceNames";
        public static final String ServiceNameKey = "serviceName";
        public static final String AllOperationNamesKey = "allOperationNames";
        public static final String OperationNamesKey = "operationNames";
        public static final String OperationNameKey = "operationName";
        public static final String OperationClassNameKey = "operationClassName";
        public static final String InputPartValuesKey = "inputPartValues";
        public static final String IsServiceEnabledKey = "isServiceEnabled";
        public static final String IsDefaultServiceKey = "isDefaultService";
        public static final String IsOperationEnabledKey = "isOperationEnabled";
        public static final String IsOperationFrozenKey = "isOperationFrozen";
        public static final String IsTransactionEnabledKey = "isTransactionEnabled";
        public static final String ReturnsSOAPStructKey = "returnsSOAPStruct";
        public static final String AssistantComparisonKeyKey = "assistantComparisonKey";
        public static final String AssistantTaskNameKey = "assistantTaskName";
        public static final String OperatorNameKey = "operatorName";
        public static final String IsDefaultOperatorKey = "isDefaultOperator";
        public static final String EntityNameKey = "entityName";
        public static final String ModelGroupKey = "modelGroup";
        public static final String PublicEntityNamesKey = "publicEntityNames";
        public static final String OutputPartNamesKey = "outputPartNames";
        public static final String PropertyKeyKey = "propertyKey";
        public static final String ClassForPropertyKeyKey = "classForPropertyKey";
        public static final String ClassNameForPropertyKeyKey = "classNameForPropertyKey";
        public static final String TranslatedAttributeNameKey = "translatedAttributeName";
        public static final String InputPartNamesKey = "argumentKeys";
        public static final String UnspecifiedArgumentKeyKey = "unspecifiedArgumentKey";
        public static final String GidArgumentKeyKey = "gidArgumentKey";
        public static final String ComparisonKeyKey = "comparisonKey";
        public static final String FetchLimitKey = "fetchLimit";
        public static final String FetchSpecificationNameKey = "fetchSpecificationName";
        public static final String UsesNamedFetchSpecificationKey = "usesNamedFetchSpecification";
        public static final String WSDLComponentNameKey = "WSDLComponentName";
        public static final String WODefaultWebServiceKey = "WODefaultWebService";
        public static final String WOContextKey = "com.webobjects.webservices.generation.wocontext_key";
        public static final String _WOCommitOperationImmediatelyKey = "_WOCommitOperationImmediately";
        public static final String _WSDLKey = "WSDL";
    }


    public WOServiceUtilities() { return null; }

    public static EOEditingContext editingContextForContext(WOContext context) { return null; }

    public static EOQualifier buildQualifier(EOEntity entity, NSArray attributeNames, NSArray values, NSArray comparisonKeys, NSArray attributeClassNames, String unspecifiedArgumentKey) { return null; }

    public static void addDestinationObjectToEOWithKey(WOEnterpriseObjectSerializationStrategy strategy, Object object, EOEnterpriseObject eo, String propertyName) { return null; }

    public static boolean shouldCommitChangesImmediately(WOContext context) { return null; }

    public static NSArray aggregateValuesResult(NSArray result, NSArray translatedKeys, NSArray outputPartNames) { return null; }

    public static Object valueForAggregateKey(String key, NSArray array) { return null; }

    public static EOGlobalID globalIDFromValues(EOEntity entity, NSArray attributeKeys, NSArray inputPartValues) { return null; }

    static boolean _isSubEntityOf(EOEntity entity, EOEntity parent) { return true; }
}
