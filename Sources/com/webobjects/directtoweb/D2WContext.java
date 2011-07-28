
package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.Settings;
import com.webobjects.appserver.WOSession;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eocontrol.EOKeyValueCodingAdditions;
import com.webobjects.foundation.*;
import java.util.*;


public class D2WContext
    implements EOKeyValueCodingAdditions {


    public D2WContext() { return null; }

    public D2WContext(WOSession session) { return null; }

    public D2WContext(D2WContext parentContext) { return null; }

    D2WContext(Settings settings) { return null; }

    public Hashtable _localValues() { return null; }

    void incorporateSettings(Settings settings) { return null; }

    public D2WModel model() { return null; }

    public void _setModel(D2WModel newModel) {}

    public Object valueForKeyNoInference(String key) { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForInferrableKey(Object newValue, String key) {}

    public void computeDerivedValues() {}

    public void clearDerivedValues() {}

    public void nullOutDerivedValues() {}

    public void takeValueForKey(Object newValue, String key) {}

    public static String propertyTypeForUnknownKeyPath(String keyPath, EOEntity entity) { return null; }

    public Object inferValueForKey(String key) { return null; }

    public Object inferSystemValueForKey(String key) { return null; }

    public Vector inferAllPossibleValuesForKey(String key) { return null; }

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    public Object valueForKeyPathNoInference(String keyPath) { return null; }

    public String task() { return null; }

    public String startupTask() { return null; }

    public void setTask(String newValue) {}

    public EOEntity entity() { return null; }

    public void setEntity(EOEntity newValue) {}

    public String dynamicPage() { return null; }

    public void setDynamicPage(String newValue) {}

    public String startupEntityName() { return null; }

    public String propertyKey() { return null; }

    public boolean propertyKeyIsKeyPath() { return true; }

    public void setPropertyKey(String newValue) {}

    public String displayNameForProperty() { return null; }

    public String keyWhenRelationship() { return null; }

    public EORelationship relationship() { return null; }

    protected EORelationship relationship(String propertyKey) { return null; }

    protected EORelationship relationshipForProperty(String propertyKey) { return null; }

    public EORelationship distantRelationship(String propertyKey, EOEntity entity) { return null; }

    public static void _setResolveAttributesAndRelationshipsFromObjectsBeforeModel(boolean flag) { return null; }

    public EOAttribute attribute() { return null; }

    protected EOAttribute attribute(String propertyKey) { return null; }

    protected EOAttribute attributeForProperty(String propertyKey) { return null; }

    EOAttribute customAttribute(String propertyKey, EOEntity entity) { return null; }

    public EOAttribute distantAttribute(String propertyKey, EOEntity entity) { return null; }

    public int propertyType() { return 0; }

    public boolean componentClassPresentInRuntime(String componentClassName) { return true; }

    public Vector componentsAvailable() { return null; }

    public Vector pagesAvailable() { return null; }

    public String rawPageName() { return null; }

    public String rawSystemPageName() { return null; }

    public String pageName() { return null; }

    public String componentName() { return null; }

    public String toString() { return null; }

    public boolean frame() { return true; }

    public boolean isGenerating() { return true; }

    public void sessionDidTimeOut(NSNotification notification) {}

    synchronized void pageFinalized() {}

    public void takeValuesFromDictionary(NSDictionary dict) {}

    public void takeValuesFromDictionaryWithMapping(NSDictionary dictionary, NSDictionary mapping) {}

    public NSDictionary valuesForKeys(NSArray keys) { return null; }

    public NSDictionary valuesForKeysWithMapping(NSDictionary mapping) { return null; }

    public void takeStoredValueForKey(Object value, String key) {}

    public Object storedValueForKey(String key) { return null; }

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    static  {}

    protected Hashtable _localValues;
    protected D2WModel _model;
    protected boolean _derivedValuesComputed;
    public static final Object VALUE_TO_BE_DERIVED;
    public static final Object NULL_VALUE;
    private boolean _readyToFinalize;
    private static boolean _resolveAttributesAndRelationshipsFromObjectsBeforeModel;
    private static NSMutableDictionary _customAttributes;

}
