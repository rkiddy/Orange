
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.Format;


public abstract class EOClassDescription
    implements Serializable {
    static class _EOCDBinderMaps {


        public _EOCDBinderMaps() { return null; }

        Class _class;
        _NSThreadsafeMutableDictionary _getBindings;
        _NSThreadsafeMutableDictionary _setBindings;
        _NSThreadsafeMutableDictionary _storedGetBindings;
        _NSThreadsafeMutableDictionary _storedSetBindings;

    }

    private static class _EOClassToBinderMaps {


        public _EOClassToBinderMaps() { return null; }

        public _EOCDBinderMaps mapForClass(Class cls) { return null; }

        EOClassDescription _classDesc;
        _EOCDBinderMaps _lastMap;
        NSMutableDictionary _mapsByClass;

    }

    static class _EONopClassDescription extends EOClassDescription {


        _EONopClassDescription() { return null; }

        private static final long serialVersionUID = 0xed5b5f9fL;

    }

    public static interface ClassDelegate {


        public abstract boolean shouldPropagateDeleteForObject(EOEnterpriseObject eoenterpriseobject, EOEditingContext eoeditingcontext, String s);



        public static final Class _CLASS = null;

    }



    public EOClassDescription() { return null; }

    protected static NSNumberFormatter _integerFormatter() { return null; }

    protected static NSNumberFormatter _decimalFormatter() { return null; }

    protected static NSTimestampFormatter _timestampFormatter() { return null; }

    public static void registerClassDescription(EOClassDescription description, Class aClass) { return null; }

    protected void _awakeFromRegistration() {}

    public Class classForAttributeKey(String key) { return null; }

    public static void invalidateClassDescriptionCache() { return null; }

    public static EOClassDescription _existingClassDescriptionForClass(Class aClass) { return null; }

    public static EOClassDescription classDescriptionForClass(Class aClass) { return null; }

    static EOClassDescription _registeredClassDescriptionForEntityName(String entityName) { return null; }

    public static EOClassDescription classDescriptionForEntityName(String entityName) { return null; }

    public static void setClassDelegate(Object delegate) { return null; }

    public static Object classDelegate() { return null; }

    public void finalize() throws Throwable {}

    public EOEnterpriseObject createInstanceWithEditingContext(EOEditingContext editingContext, EOGlobalID globalID) { return null; }

    public void awakeObjectFromInsertion(EOEnterpriseObject object, EOEditingContext editingContext) {}

    public void awakeObjectFromFetch(EOEnterpriseObject eoenterpriseobject, EOEditingContext eoeditingcontext) {}

    private void verifyDeleteRule(EOEnterpriseObject obj, EOEditingContext ec, String relationship, int deleteRule) {}

    public void propagateDeleteForObject(EOEnterpriseObject obj, EOEditingContext ec) {}

    public String entityName() { return null; }

    public boolean isEntityReadOnly() { return true; }

    public EOClassDescription superClassDescription() { return null; }

    public NSArray attributeKeys() { return null; }

    public NSArray toOneRelationshipKeys() { return null; }

    public NSArray toManyRelationshipKeys() { return null; }

    public NSArray clientAttributeKeys() { return null; }

    public NSArray clientToOneRelationshipKeys() { return null; }

    public NSArray clientToManyRelationshipKeys() { return null; }

    public String inverseForRelationshipKey(String relationshipKey) { return null; }

    public int deleteRuleForRelationshipKey(String relationshipKey) { return 0; }

    public boolean ownsDestinationObjectsForRelationshipKey(String relationshipKey) { return true; }

    public Object validateValueForKey(Object value, String key) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    public void validateObjectForSave(EOEnterpriseObject eoenterpriseobject) throws com.webobjects.foundation.NSValidation.ValidationException {}

    public void validateObjectForDelete(EOEnterpriseObject eoenterpriseobject) throws com.webobjects.foundation.NSValidation.ValidationException {}

    public EOClassDescription classDescriptionForDestinationKey(String detailKey) { return null; }

    public EOClassDescription _concreteSubClassDescriptionForDeferredFault() { return null; }

    public Format defaultFormatterForKey(String key) { return null; }

    public Format defaultFormatterForKeyPath(String keyPath) { return null; }

    public String displayNameForKey(String key) { return null; }

    private static Format defaultFormatterForClass(Class valueClass) { return null; }

    public String userPresentableDescriptionForObject(EOEnterpriseObject eo) { return null; }

    public EOFetchSpecification fetchSpecificationNamed(String name) { return null; }

    public EOClassDescription classDescriptionForKeyPath(String key) { return null; }

    public Class _enforcedKVCNumberClassForKey(String key) { return null; }

    _EOCDBinderMaps _kvcMapForClass(Class cls) { return null; }

    void _releaseKVCMaps() { return null; }

    public NSMutableDictionary _newDictionaryForProperties() { return null; }

    public String toString() { return null; }

    public EOKeyGlobalID _globalIDWithEntityName(String entityName, Object values[]) { return null; }

    static  {}

    public static final Class _CLASS = null;
    public static final int DeleteRuleNullify = 0;
    public static final int DeleteRuleCascade = 1;
    public static final int DeleteRuleDeny = 2;
    public static final int DeleteRuleNoAction = 3;
    private static final String shouldPropagateDeleteForObject = "shouldPropagateDeleteForObject";
    public static final String ClassDescriptionNeededForClassNotification = "EOClassDescriptionNeededNotification";
    public static final String ClassDescriptionNeededForEntityNameNotification = "EOClassDescriptionNeededForEntityNameNotification";
    private static final _NSDelegate _classDelegate;
    private static NSMutableDictionary _classDescriptionByClass;
    private static NSMutableDictionary _classDescriptionByEntityName;
    private static final _EONopClassDescription _nopClassDescription;
    private static final NSNumberFormatter _integerFormatter;
    private static final NSNumberFormatter _decimalFormatter;
    private static final NSTimestampFormatter _timestampFormatter;
    private static NSMutableDictionary _classDescToClassBinderMap;
    private static _EOClassToBinderMaps _lastMap;

}
