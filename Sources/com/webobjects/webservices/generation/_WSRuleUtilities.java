
package com.webobjects.webservices.generation;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.*;
import com.webobjects.eoaccess.*;
import com.webobjects.foundation.*;
import com.webobjects.webservices.support.xml.WOEnterpriseObjectSerializationStrategy;
import java.util.Hashtable;
import java.util.StringTokenizer;


public class _WSRuleUtilities
    implements WOServiceUtilities.RuleSystemConstants {


    public _WSRuleUtilities() { return null; }

    public void _applicationWillFinishLaunching(NSNotification notification) {}

    public void init() {}

    protected void _deregisterAllServicesAndOperations() {}

    protected void _registerServicesAndOperations() {}

    public void tearDown() {}

    public static String[] _operationNameStringsFromArray(NSArray objects) { return null; }

    public static _WSRuleUtilities instance() { return null; }

    public static Object invokeOperationOnService(String operationName, String serviceName, Object arguments[], WOContext wocontext) { return null; }

    public static WOResponse generateWSDLForService(String serviceName, WOContext aContext) { return null; }

    public static int intValueForContextKey(D2WContext context, String key) { return null; }

    public static boolean booleanValueForContextKey(D2WContext context, String key) { return null; }

    public static boolean booleanValueForObject(Object value) { return null; }

    public static EOModelGroup modelGroupInContext(D2WContext context) { return null; }

    public static EOEntity entityInContext(D2WContext context) { return null; }

    public static NSArray _allOperationNames(D2WContext context) { return null; }

    public static String taskNameForOperationName(String name) { return null; }

    public static boolean isPublicEntityNameInContext(String entityName, D2WContext context) { return null; }

    public static NSArray attributeKeyPaths(D2WContext context, NSArray keyPaths, String nameKey) { return null; }

    public static EOProperty propertyForKeyPath(EOEntity anEntity, String attributeName) { return null; }

    public static NSArray keyPathsForSerialization(D2WContext d2wContext) { return null; }

    public static Class classForKeyPath(D2WContext d2wContext, String keyPath) { return null; }

    public static Class classForTranslatedKeyPath(D2WContext d2wContext, String keyPath) { return null; }

    public static String translatedKeyPath(D2WContext d2wContext, Object keyPath) { return null; }

    public static String _argumentListDescription(D2WContext context, NSArray attributeClassNames) { return null; }

    public static String _argumentKeysDescription(D2WContext context) { return null; }

    public static String _replaceKeyPath(String key) { return null; }

    public static NSArray entityNames(EOModelGroup group) { return null; }

    static  {}

    private static final _WSRuleUtilities _instance;

}
