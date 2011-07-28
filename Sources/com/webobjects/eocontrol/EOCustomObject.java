
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;


public abstract class EOCustomObject
    implements EOEnterpriseObject, EODeferredFaulting, EOKeyValueCoding._KeyBindingCreation, com.webobjects.foundation.NSKeyValueCoding._ReflectionKeyBindingCreation.Callback, EOKeyValueCoding._BestBindingCreation._ForwardingBindingCheck, _EOPrivateMemento {
    public static class _LazyFieldBinding extends _FieldBinding {

        public _LazyFieldBinding(Class targetClass, String key, Field field, com.webobjects.foundation.NSKeyValueCoding.ValueAccessor valueAccessor) { return null; }

        public Object valueInObject(Object object) { return null; }
    }

    public static class _BooleanFieldBinding extends com.webobjects.foundation.NSKeyValueCoding._BooleanFieldBinding {

        public _BooleanFieldBinding(Class targetClass, String key, Field field, com.webobjects.foundation.NSKeyValueCoding.ValueAccessor valueAccessor) { return null; }

        public Object valueInObject(Object object) { return null; }

        protected void _setValidatedValueInObject(Object value, Object object) throws IllegalAccessException {}
    }

    public static class _NumberFieldBinding extends com.webobjects.foundation.NSKeyValueCoding._NumberFieldBinding {

        public _NumberFieldBinding(Class targetClass, String key, Field field, Class valueClass, com.webobjects.foundation.NSKeyValueCoding.ValueAccessor valueAccessor) { return null; }

        public Object valueInObject(Object object) { return null; }

        protected void _setValidatedValueInObject(Object value, Object object) throws IllegalAccessException {}
    }

    public static class _FieldBinding extends com.webobjects.foundation.NSKeyValueCoding._FieldBinding {

        public _FieldBinding(Class targetClass, String key, Field field, com.webobjects.foundation.NSKeyValueCoding.ValueAccessor valueAccessor) { return null; }

        public Object valueInObject(Object object) { return null; }

        protected void _setValidatedValueInObject(Object value, Object object) throws IllegalAccessException {}
    }



    public final EOEditingContext __editingContext() { return null; }

    public final void __setEditingContext(EOEditingContext ec) { return null; }

    public final EOClassDescription __classDescription() { return null; }

    public void __setClassDescription(EOClassDescription cd) {}

    public final EOGlobalID __globalID() { return null; }

    public final void __setGlobalID(EOGlobalID gid) { return null; }

    public final NSDictionary __originalSnapshot() { return null; }

    public final void __setOriginalSnapshot(NSDictionary os) { return null; }

    public final NSDictionary __lastSnapshot() { return null; }

    public final void __setLastSnapshot(NSDictionary ls) { return null; }

    public final int __retainCount() { return null; }

    public final void __setRetainCount(int rc) { return null; }

    public final boolean __isInitialized() { return null; }

    public final void __setInitialized(boolean inited) { return null; }

    public final boolean __isShared() { return null; }

    public final void __setShared(boolean shared) { return null; }

    public final boolean __hasAuxillaryObservers() { return null; }

    public final void __setAuxillaryObservers(boolean hao) { return null; }

    public boolean __hasPendingChanges() { return true; }

    public void __clearPendingChanges() {}

    public boolean __hasPendingUpdate() { return true; }

    public void __setPendingUpdate(boolean changed) {}

    public final boolean __isPendingInsertion() { return null; }

    public final void __setPendingInsertion(boolean inserted) { return null; }

    public final boolean __isPendingDeletion() { return null; }

    public final void __setPendingDeletion(boolean deleted) { return null; }

    /**
     * @deprecated Method EOCustomObject is deprecated
     */

    public EOCustomObject(EOEditingContext editingContext, EOClassDescription classDescription, EOGlobalID gid) { return null; }

    public EOCustomObject() { return null; }

    public final Object opaqueState() { return null; }

    public final boolean equals(Object other) { return null; }

    public int hashCode() { return 0; }

    public String toString() { return null; }

    public EOEditingContext editingContext() { return null; }

    public void willChange() {}

    public EOClassDescription classDescription() { return null; }

    public String entityName() { return null; }

    public NSArray attributeKeys() { return null; }

    public NSArray toOneRelationshipKeys() { return null; }

    public NSArray toManyRelationshipKeys() { return null; }

    public String inverseForRelationshipKey(String relationshipKey) { return null; }

    public int deleteRuleForRelationshipKey(String relationshipKey) { return 0; }

    public boolean ownsDestinationObjectsForRelationshipKey(String relationshipKey) { return true; }

    public EOClassDescription classDescriptionForDestinationKey(String detailKey) { return null; }

    public void awakeFromInsertion(EOEditingContext ec) {}

    public void awakeFromFetch(EOEditingContext ec) {}

    public NSDictionary snapshot() { return null; }

    public void updateFromSnapshot(NSDictionary snapshot) {}

    public NSDictionary changesFromSnapshot(NSDictionary snapshot) { return null; }

    public void reapplyChangesFromDictionary(NSDictionary changes) {}

    public boolean isToManyKey(String key) { return true; }

    public NSArray allPropertyKeys() { return null; }

    public void clearProperties() {}

    public void propagateDeleteWithEditingContext(EOEditingContext ec) {}

    public String userPresentableDescription() { return null; }

    public String eoShallowDescription() { return null; }

    public String eoDescription() { return null; }

    public Object invokeRemoteMethod(String methodName, Class argumentTypes[], Object arguments[]) { return null; }

    public void prepareValuesForClient() {}

    public void awakeFromClientUpdate(EOEditingContext eoeditingcontext) {}

    private Method _valueManipulationMethod(Class cls, String methodName, Object value) { return null; }

    private Method _valueManipulationMethodWithPrefix(String prefix, String key, Object value) { return null; }

    protected void includeObjectIntoPropertyWithKey(Object eo, String key) {}

    public void addObjectToPropertyWithKey(Object eo, String key) {}

    protected void excludeObjectFromPropertyWithKey(Object eo, String key) {}

    public void removeObjectFromPropertyWithKey(Object eo, String key) {}

    public void addObjectToBothSidesOfRelationshipWithKey(EORelationshipManipulation object, String key) {}

    public void removeObjectFromBothSidesOfRelationshipWithKey(EORelationshipManipulation object, String key) {}

    public static boolean usesDeferredFaultCreation() { return null; }

    public void willRead() {}

    public boolean isFault() { return true; }

    public void clearFault() {}

    public void turnIntoFault(EOFaultHandler handler) {}

    public EOFaultHandler faultHandler() { return null; }

    public Object willReadRelationship(Object object) { return null; }

    public Object validateValueForKey(Object value, String key) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    public Object validateTakeValueForKeyPath(Object value, String keyPath) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    public void validateForSave() throws com.webobjects.foundation.NSValidation.ValidationException {}

    public void validateForDelete() throws com.webobjects.foundation.NSValidation.ValidationException {}

    public void validateForInsert() throws com.webobjects.foundation.NSValidation.ValidationException {}

    public void validateForUpdate() throws com.webobjects.foundation.NSValidation.ValidationException {}

    public void validateClientUpdate() throws com.webobjects.foundation.NSValidation.ValidationException {}

    public static boolean canAccessFieldsDirectly() { return null; }

    public Object valueForKey(String key) { return null; }

    public void takeValueForKey(Object value, String key) {}

    public Object handleQueryWithUnboundKey(String key) { return null; }

    public void handleTakeValueForUnboundKey(Object value, String key) {}

    public void unableToSetNullForKey(String key) {}

    public Object valueForKeyPath(String keyPath) { return null; }

    public void takeValueForKeyPath(Object value, String keyPath) {}

    public static boolean shouldUseStoredAccessors() { return null; }

    public Object storedValueForKey(String key) { return null; }

    public void takeStoredValueForKey(Object value, String key) {}

    public NSDictionary valuesForKeys(NSArray keys) { return null; }

    public NSDictionary valuesForKeysWithMapping(NSDictionary mapping) { return null; }

    public void takeValuesFromDictionary(NSDictionary dictionary) {}

    public void takeValuesFromDictionaryWithMapping(NSDictionary dictionary, NSDictionary mapping) {}

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _createKeyGetBindingForKey(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _createKeySetBindingForKey(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _keyGetBindingForKey(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _keySetBindingForKey(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _createStoredKeyGetBindingForKey(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _createStoredKeySetBindingForKey(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _storedKeyGetBindingForKey(String key) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _storedKeySetBindingForKey(String key) { return null; }

    boolean _usesDeferredFaultCreationForClass(Class objectClass) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _fieldKeyBinding(String key, String fieldName) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _methodKeyGetBinding(String key, String methodName) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _methodKeySetBinding(String key, String methodName) { return null; }

    public com.webobjects.foundation.NSKeyValueCoding._KeyBinding _otherStorageBinding(String key) { return null; }

    public boolean _forwardingBindingNeededForClass(Class objectClass, String methodName, Class methodArgumentTypes[]) { return true; }

    private void writeObject(ObjectOutputStream out) throws IOException {}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    protected Object readResolve() throws ObjectStreamException { return null; }

    public boolean isReadOnly() { return true; }

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0xcab196dcL;
    private transient EOFaultHandler __faultHandler;
    private transient Object __unarchivedResultingEnterpriseObject;
    private transient int __hashCodeCache;
    transient EOClassDescription __classDescription;
    transient EOEditingContext __editingContext;
    transient EOGlobalID __gid;
    transient NSDictionary __originalSnapshot;
    transient NSDictionary __lastSnapshot;
    transient int __retainCount;
    protected transient Boolean __readOnly;
    transient int __flags;
    private static final int kInitializedFlag = 0;
    private static final int kInitializedMask = 1;
    private static final int kSharedFlag = 1;
    private static final int kSharedMask = 2;
    private static final int kAuxObserverFlag = 2;
    private static final int kAuxObserverMask = 4;
    private static final int kPendingUpdatesFlag = 3;
    private static final int kPendingUpdatesMask = 8;
    private static final int kPendingInsertionFlag = 4;
    private static final int kPendingInsertionMask = 16;
    private static final int kPendingDeletionFlag = 5;
    private static final int kPendingDeletionMask = 32;
    private static final int kPendingChangesMask = 56;
    private static final long SerializationVersion = 5000L;
    private static final String SerializationVersionFieldKey = "version";
    private static final String SerializationEditingContextFieldKey = "editingContext";
    private static final String SerializationGlobalIDFieldKey = "globalID";
    private static final String SerializationPropertiesFieldKey = "properties";
    private static final ObjectStreamField serialPersistentFields[];

}
