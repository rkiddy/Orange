
package com.webobjects.eoaccess;

import com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory;
import com.webobjects.foundation.*;
import java.util.Iterator;


public abstract class EOAdaptor {
    public static interface Delegate {

        public abstract Object adaptorFetchedValueForValue(EOAdaptor eoadaptor, Object obj, EOAttribute eoattribute);

        public abstract NSDictionary reconnectionDictionaryForAdaptor(EOAdaptor eoadaptor);
    }



    private static String frameworkNameForAdaptorName(String name) { return null; }

    private static String adaptorNameForFrameworkName(String name) { return null; }

    private static NSDictionary infoDictionaryForAdaptorNamed(String name) { return null; }

    private static String classNameForAdaptorNamed(String name) { return null; }

    private static Class classForAdaptorNamed(String name) { return null; }

    public static synchronized EOAdaptor adaptorWithName(String name) { return null; }

    public static EOAdaptor adaptorWithModel(EOModel model) { return null; }

    public static void setExpressionClassName(String sqlExpressionClassName, String adaptorClassName) { return null; }

    public static String expressionClassName(String adaptorClassName) { return null; }

    public abstract EOSQLExpressionFactory expressionFactory();

    /**
     * @deprecated Method synchronizationFactory is deprecated
     */

    public abstract EOSchemaGeneration synchronizationFactory();

    public abstract EOSchemaSynchronizationFactory schemaSynchronizationFactory();

    public static void setDefaultDelegate(Object delegate) { return null; }

    public static Object defaultDelegate() { return null; }

    public NSArray prototypeAttributes() { return null; }

    private NSArray _prototypeAttributesForClassName() { return null; }

    private NSArray _prototypeAttributesForClassAndPlugInName() { return null; }

    public EOAdaptor(String name) { return null; }

    public String name() { return null; }

    public String plugInName() { return null; }

    public boolean hasPlugIns() { return true; }

    public abstract EOAdaptorContext createAdaptorContext();

    public NSArray contexts() { return null; }

    public void handleDroppedConnection() {}

    public Class expressionClass() { return null; }

    public abstract Class defaultExpressionClass();

    public abstract boolean isValidQualifierType(String s, EOModel eomodel);

    public abstract void assertConnectionDictionaryIsValid();

    public boolean hasOpenChannels() { return true; }

    public NSDictionary connectionDictionary() { return null; }

    public void setConnectionDictionary(NSDictionary dictionary) {}

    public boolean canServiceModel(EOModel model) { return true; }

    public Object fetchedValueForValue(Object value, EOAttribute att) { return null; }

    public String fetchedValueForStringValue(String value, EOAttribute att) { return null; }

    public Number fetchedValueForNumberValue(Number value, EOAttribute att) { return null; }

    public NSTimestamp fetchedValueForDateValue(NSTimestamp value, EOAttribute att) { return null; }

    public NSData fetchedValueForDataValue(NSData value, EOAttribute att) { return null; }

    public boolean isDroppedConnectionException(Exception exception) { return true; }

    public Object _mthdelegate() { return null; }

    public void setDelegate(Object delegate) {}

    protected void _registerAdaptorContext(EOAdaptorContext context) {}

    protected void _unregisterAdaptorContext(EOAdaptorContext context) {}

    public String internalTypeForExternalType(String extType, EOModel model) { return null; }

    public NSArray externalTypesWithModel(EOModel model) { return null; }

    protected void _assignExternalNameForAttribute(EOAttribute attribute) {}

    public void assignExternalTypeForAttribute(EOAttribute eoattribute) {}

    public void assignExternalInfoForAttribute(EOAttribute attribute) {}

    public void assignExternalInfoForEntity(EOEntity entity) {}

    protected void _recursivelyConvertEntity(EOEntity entity) {}

    public void assignExternalInfoForEntireModel(EOModel model) {}

    protected void _createDropDatabase(boolean create, NSDictionary adminDict) {}

    public void dropDatabaseWithAdministrativeConnectionDictionary(NSDictionary administrativeConnectionDictionary) {}

    public void createDatabaseWithAdministrativeConnectionDictionary(NSDictionary administrativeConnectionDictionary) {}

    public NSDictionary administrativeConnectionDictionaryForAdaptor(EOAdaptor adaptor) { return null; }

    static  {}

    protected String _name;
    protected NSDictionary _connectionDictionary;
    protected NSMutableArray _contexts;
    protected String _expressionClassName;
    protected Class _expressionClass;
    protected _NSDelegate _delegate;
    protected boolean _delegateRespondsTo_processValue;
    protected boolean _delegateRespondsTo_reconDict;
    private static NSMutableDictionary _expressionClassNameDictionary;
    private static volatile Object _defaultAdaptorDelegate;
    private static NSMutableDictionary _prototypesByAdaptorClassName;
    private static NSMutableDictionary _prototypesByAdaptorClassAndPlugInName;
    private static final String AdaptorFrameworkPrefix = "Java";
    private static final String AdaptorFrameworkSuffix = "Adaptor";
    private static final String AdaptorClassNameKey = "EOAdaptorClassName";
    private static final NSSelector _defaultDelegateSelector;
    private static final NSSelector _resetPrototypeSelector;
    private static final NSSelector _updateFromPrototypeSelector;

}
