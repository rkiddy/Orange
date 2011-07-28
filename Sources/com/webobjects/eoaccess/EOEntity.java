
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.*;


public class EOEntity
    implements EOPropertyListEncoding, EOSQLExpression.SQLValue {
    class _EntityInheritanceEnumeratorBF
        implements Enumeration {


        public _EntityInheritanceEnumeratorBF(EOEntity prime) { return null; }

        public boolean hasMoreElements() { return true; }

        public EOEntity nextElement() { return null; }

        public volatile Object nextElement() { return null; }

        private NSMutableArray entityList;
        final EOEntity this$0;

    }



    public String _concreteSubEntityNameForDeferredFault() { return null; }

    public Class _concreteClassForDeferredFault() { return null; }

    private EOKeyGlobalID _cachedGID(Object values[]) { return null; }

    private void _setCachedGID(EOKeyGlobalID gid, Object values[]) {}

    private Object _coercePKInput(Object input, Class target) { return null; }

    private Object[] _validatePKTypes(Object values[]) { return null; }

    public EOKeyGlobalID _globalIDWithValues(Object values[], String finalSubEntityName, String bestSubEntityName) { return null; }

    protected EOKeyGlobalID _globalIDWithoutTypeCoercion(Object values[]) { return null; }

    static int compareProperties(EOAttribute a, EOAttribute b) { return 0; }

    public EOEntity() { return null; }

    public String name() { return null; }

    public String toString() { return null; }

    public String _toString(int indent) { return null; }

    public EOModel model() { return null; }

    public String externalName() { return null; }

    public String externalQuery() { return null; }

    public EOQualifier restrictingQualifier() { return null; }

    public boolean isReadOnly() { return true; }

    public boolean cachesObjects() { return true; }

    public NSArray sharedObjectFetchSpecificationNames() { return null; }

    public String classNameWithoutPackage() { return null; }

    public String classPackageName() { return null; }

    public String className() { return null; }

    public EOQualifier qualifierForPrimaryKey(NSDictionary row) { return null; }

    public boolean isQualifierForPrimaryKey(EOQualifier qualifier) { return true; }

    public EOAttribute attributeNamed(String attributeName) { return null; }

    public NSArray attributes() { return null; }

    public NSArray indexes() { return null; }

    public EOEntityIndex indexNamed(String indexName) { return null; }

    public EORelationship relationshipNamed(String relationshipName) { return null; }

    public EOProperty propertyNamed(String propertyName) { return null; }

    public EORelationship anyRelationshipNamed(String relationshipName) { return null; }

    public EOAttribute anyAttributeNamed(String name) { return null; }

    public NSArray fetchSpecificationNames() { return null; }

    public EOFetchSpecification fetchSpecificationNamed(String fetchSpecName) { return null; }

    public NSArray relationships() { return null; }

    public NSArray classProperties() { return null; }

    public NSArray classPropertyNames() { return null; }

    public String clientClassName() { return null; }

    public NSArray clientClassProperties() { return null; }

    public NSArray clientClassPropertyNames() { return null; }

    NSArray clientClassPropertyAttributeNames() { return null; }

    NSArray clientClassPropertyToOneRelationshipNames() { return null; }

    NSArray clientClassPropertyToManyRelationshipNames() { return null; }

    public NSArray attributesToFetch() { return null; }

    public NSArray primaryKeyAttributes() { return null; }

    public NSArray primaryKeyAttributeNames() { return null; }

    public NSArray attributesUsedForLocking() { return null; }

    public NSDictionary primaryKeyForRow(NSDictionary row) { return null; }

    public boolean isValidAttributeUsedForLocking(EOAttribute anAttribute) { return true; }

    public boolean isValidPrimaryKeyAttribute(EOAttribute anAttribute) { return true; }

    public boolean isPrimaryKeyValidInObject(NSKeyValueCoding object) { return true; }

    public boolean isValidClassProperty(Object aProp) { return true; }

    public NSDictionary userInfo() { return null; }

    public NSDictionary _internalInfo() { return null; }

    public NSArray subEntities() { return null; }

    public EOEntity parentEntity() { return null; }

    public boolean isAbstractEntity() { return true; }

    public int maxNumberOfInstancesToBatchFetch() { return 0; }

    protected EOEntity _initWithPropertyListOwner(NSDictionary plist, Object owner) { return null; }

    public EOEntity(NSDictionary plist, Object owner) { return null; }

    public void encodeIntoPropertyList(NSMutableDictionary result) {}

    public void awakeWithPropertyList(NSDictionary nsdictionary) {}

    public EOGlobalID globalIDForRow(NSDictionary row) { return null; }

    public NSDictionary primaryKeyForGlobalID(EOGlobalID gid) { return null; }

    protected String _singleTableSubEntityKey() { return null; }

    protected Object _subEntityKeyValue() { return null; }

    protected void _generateSingleTableSubEntityDictionary(NSMutableDictionary subEntityDict) {}

    protected NSDictionary _singleTableSubEntityDictionary() { return null; }

    protected EOEntity _singleTableSubEntityForRow(NSDictionary row) { return null; }

    protected boolean _isSingleTableEntity() { return true; }

    protected EOQualifier _singleTableRestrictingQualifier() { return null; }

    public boolean setClassProperties(NSArray attributes) { return true; }

    public boolean setPrimaryKeyAttributes(NSArray attributes) { return true; }

    public boolean setAttributesUsedForLocking(NSArray attributes) { return true; }

    public void setName(String name) {}

    public void setExternalName(String string) {}

    public void setExternalQuery(String string) {}

    public void setRestrictingQualifier(EOQualifier qualifier) {}

    public void setReadOnly(boolean flag) {}

    public void setCachesObjects(boolean flag) {}

    public void setSharedObjectFetchSpecificationsByName(NSArray names) {}

    public void addSharedObjectFetchSpecificationByName(String name) {}

    public void removeSharedObjectFetchSpecificationByName(String name) {}

    public void addAttribute(EOAttribute attribute) {}

    public void removeAttribute(EOAttribute attribute) {}

    public void addRelationship(EORelationship relationship) {}

    public void removeRelationship(EORelationship relationship) {}

    public void addIndex(EOEntityIndex index) {}

    public void removeIndex(EOEntityIndex index) {}

    public void addFetchSpecification(EOFetchSpecification fetchSpec, String name) {}

    public void removeFetchSpecificationNamed(String name) {}

    public void setClassName(String name) {}

    public void setUserInfo(NSDictionary dictionary) {}

    public void _setInternalInfo(NSDictionary dictionary) {}

    protected void _invalidateSingleTableEntityCacheOnly(boolean cacheOnly) {}

    protected void _invalidateSingleTableEntity() {}

    protected void _invalidateSingleTableCache() {}

    protected boolean _checkSingleTableSubEntityKey(String key) { return true; }

    protected boolean _checkOptimizableSingleTableSubEntity() { return true; }

    public void addSubEntity(EOEntity child) {}

    public void removeSubEntity(EOEntity child) {}

    public void setIsAbstractEntity(boolean flag) {}

    public void setMaxNumberOfInstancesToBatchFetch(int size) {}

    public void beautifyName() {}

    public EOClassDescription classDescriptionForInstances() { return null; }

    void _setClassDescriptionForInstances(EOClassDescription cd) { return null; }

    public EOClassDescription _classDescriptionForInstances() { return null; }

    public boolean referencesProperty(Object property) { return true; }

    public NSArray externalModelsReferenced() { return null; }

    EOKeyGlobalID _globalIDForRowIsFinal(NSDictionary row, boolean isFinal) { return null; }

    Class classForObjectWithGlobalID(EOGlobalID gid) { return null; }

    protected static boolean _isIdentifierStartingChar(char ch) { return null; }

    private boolean _isIdStartingChar(char ch) { return true; }

    protected static boolean _isIdentifierChar(char ch) { return null; }

    private boolean _isIdChar(char ch) { return true; }

    protected String _newPropertyNameWithRoot(String root) { return null; }

    protected Object _parsePropertyName(String name) { return null; }

    protected _EOExpressionArray _parseRelationshipPath(String path) { return null; }

    protected Object _parseDescriptionIsFormatArguments(String description, boolean isFormat, Object arguments[]) { return null; }

    public String valueForSQLExpression(EOSQLExpression context) { return null; }

    public void _setIsEdited() {}

    protected Object _fetchInfo() { return null; }

    protected void _setFetchInfo(Object info) {}

    public void _setModel(EOModel model) {}

    protected com.webobjects.eocontrol._EOMutableKnownKeyDictionary.Initializer _propertyDictionaryInitializer() { return null; }

    protected com.webobjects.eocontrol._EOMutableKnownKeyDictionary.Initializer _primaryKeyDictionaryInitializer() { return null; }

    protected com.webobjects.eocontrol._EOMutableKnownKeyDictionary.Initializer _adaptorDictionaryInitializer() { return null; }

    protected NSArray _extraSingleTableAttributesToFetch(NSArray simpleAttributesToFetch) { return null; }

    protected NSArray _attributesToFetch() { return null; }

    protected NSArray _attributesToSave() { return null; }

    protected NSArray _classPropertyAttributes() { return null; }

    protected NSMutableDictionary _newDictionaryForProperties() { return null; }

    private NSMutableDictionary _newMutableDictionaryForPrimaryKey() { return null; }

    protected NSDictionary _flattenedAttNameToSnapshotKeyMapping() { return null; }

    String snapshotKeyForAttributeName(String name) { return null; }

    public EOAttribute _flattenAttributeRelationshipPathCurrentAttributes(EOAttribute att, String relPath, NSDictionary currentAtts) { return null; }

    public NSArray _propertyNames() { return null; }

    public NSMutableArray _hiddenRelationships() { return null; }

    public void _setParent(EOEntity parent) {}

    EOEntity rootParent() { return null; }

    private NSArray relationshipsPlist() { return null; }

    private NSArray indexesPlist() { return null; }

    Object initObjectEditingContextGlobalID(Object obj, EOEditingContext ec, EOGlobalID gid) { return null; }

    public boolean isSubEntityOf(EOEntity entity) { return true; }

    NSArray rootAttributesUsedForLocking() { return null; }

    protected static void _assertNoPropagateKeyCycleWithEntitiesRelationships(NSMutableArray visitedEntities, NSMutableArray relationships) { return null; }

    public void _clearAttributesCaches() {}

    protected boolean _hasNonUpdateableAttributes() { return true; }

    public int _numberOfRelationships() { return 0; }

    EORelationship parentRelationship() { return null; }

    public void _loadEntity() {}

    public NSDictionary _fetchSpecificationDictionary() { return null; }

    public NSArray _allFetchSpecifications() { return null; }

    private NSArray flattenedAttributes() { return null; }

    NSArray dbSnapshotKeys() { return null; }

    protected void _addAttributesToFetchForRelationshipPathAtts(String relPath, NSMutableDictionary atts) {}

    public EORelationship _relationshipForPath(String relPath) { return null; }

    EORelationship relationshipForPath(String relPath) { return null; }

    public EOAttribute _attributeForPath(String attPath) { return null; }

    EOAttribute attributeForPath(String attPath) { return null; }

    public EOProperty _propertyForPath(String attPath) { return null; }

    EOQualifier qualifierForDBSnapshot(NSDictionary dbSnapshot) { return null; }

    NSArray classPropertyToOneRelationshipNames() { return null; }

    NSArray classPropertyToManyRelationshipNames() { return null; }

    NSArray classPropertyAttributeNames() { return null; }

    void validateObjectForDelete(EOEnterpriseObject object) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    public EOStoredProcedure storedProcedureForOperation(String operation) { return null; }

    public void setStoredProcedure(EOStoredProcedure storedProcedure, String operation) {}

    public String primaryKeyRootName() { return null; }

    public boolean hasExternalName() { return true; }

    protected boolean _relationshipPathHasIdenticalKeys(String relPath) { return true; }

    public boolean _relationshipPathIsToMany(String relPath) { return true; }

    public EOAttribute _mapAttributeToDestinationAttributeInLastComponentOfRelationshipPath(EOAttribute attribute, String relPath) { return null; }

    public NSDictionary _keyMapForIdenticalKeyRelationshipPath(String relPath) { return null; }

    public NSDictionary _keyMapForRelationshipPath(String relPath) { return null; }

    public String _inverseRelationshipPathForPath(String relPath) { return null; }

    public String _nameForFetchSpecification(EOFetchSpecification fs) { return null; }

    public boolean hasRealAttributes() { return true; }

    public boolean hasSimplePrimaryKey() { return true; }

    public static String externalNameForInternalName(String internalName, String separatorString, boolean allCaps) { return null; }

    public static String nameForExternalName(String externalName, String separatorString, boolean initialCaps) { return null; }

    public EOQualifier schemaBasedQualifier(EOQualifier qualifier) { return null; }

    static  {}

    private static final String _ClientClassNameKey = "_javaClientClassName";
    private static final String _ClientClassPropertyNamesKey = "_clientClassPropertyNames";
    private static final int _DefaultAttributeNameLength = 128;
    private static final int _DefaultFlattenedNameLength = 16;
    private static final NSSelector _flushCacheSelector;
    private final WeakHashMap cachedKeyGlobalIDs;
    protected String _name;
    protected NSDictionary _userInfo;
    protected NSDictionary _internalInfo;
    protected EOModel _model;
    protected String _externalName;
    protected String _externalQuery;
    protected EOQualifier _restrictingQualifier;
    protected String _className;
    private volatile NSMutableArray _attributes;
    private volatile NSMutableArray _attributesPlist;
    private transient NSMutableDictionary _attributesByName;
    private volatile NSMutableArray _indexes;
    private volatile NSMutableArray _indexesPlist;
    private transient NSMutableDictionary _indexesByName;
    private volatile NSMutableArray _clientAttributeNames;
    private volatile NSMutableArray _relationships;
    private volatile NSMutableArray _relationshipsPlist;
    private transient NSMutableDictionary _relationshipsByName;
    private volatile NSMutableArray _clientToOneRelationshipNames;
    private volatile NSMutableArray _clientToManyRelationshipNames;
    private volatile NSMutableDictionary _fetchSpecificationDictionary;
    private volatile NSArray _fetchSpecificationNames;
    private volatile NSMutableDictionary _storedProcedures;
    private volatile NSMutableArray _classProperties;
    private volatile NSMutableArray _classPropertiesPlist;
    private transient NSMutableDictionary _classPropertiesByName;
    private volatile NSMutableArray _clientClassProperties;
    private volatile NSMutableArray _primaryKeyAttributes;
    private volatile NSMutableArray _primaryKeyAttributesPlist;
    private volatile NSMutableArray _attributesUsedForLocking;
    private volatile NSMutableArray _attributesUsedForLockingPlist;
    private volatile NSMutableArray _subEntities;
    private volatile NSMutableDictionary _singleTableSubEntityDictionary;
    protected String _singleTableSubEntityKey;
    protected EOQualifier _singleTableRestrictingQualifier;
    protected EOEntity _parent;
    protected NSArray _classPropertyNames;
    protected NSArray _clientClassPropertyNames;
    protected NSArray _primaryKeyAttributeNames;
    protected Object _fetchInfo;
    protected NSArray _classPropertyAttributeNames;
    protected NSArray _classPropertyToOneRelationshipNames;
    protected NSMutableArray _classPropertyToManyRelationshipNames;
    protected NSArray _attributesToFetch;
    protected NSMutableArray _dbSnapshotKeys;
    protected NSArray _attributesToSave;
    private volatile com.webobjects.eocontrol._EOMutableKnownKeyDictionary.Initializer _propertyDictionaryInitializer;
    private volatile com.webobjects.eocontrol._EOMutableKnownKeyDictionary.Initializer _primaryKeyDictionaryInitializer;
    private volatile com.webobjects.eocontrol._EOMutableKnownKeyDictionary.Initializer _adaptorDictionaryInitializer;
    private volatile NSMutableDictionary _flattenedAttNameToSnapshotKeyMapping;
    protected EOClassDescription _classDescription;
    private volatile NSMutableArray _hiddenRelationships;
    private volatile NSMutableArray _sharedObjectFetchSpecs;
    protected int _batchCount;
    protected Class _classForEntity;
    protected Class _classForInstances;
    protected String _subEntityNameForInstances;
    private volatile boolean _flags_indexIsLazy;
    private volatile boolean _flags_attributesIsLazy;
    private volatile boolean _flags_clientAttributeNamesIsLazy;
    private volatile boolean _flags_relationshipsIsLazy;
    private volatile boolean _flags_clientToOneRelationshipNamesIsLazy;
    private volatile boolean _flags_clientToManyRelationshipNamesIsLazy;
    private volatile boolean _flags_classPropertiesIsLazy;
    private volatile boolean _flags_clientClassPropertiesIsLazy;
    private volatile boolean _flags_primaryKeyAttributesIsLazy;
    private volatile boolean _flags_attributesUsedForLockingIsLazy;
    protected boolean _flags_isReadOnly;
    protected boolean _flags_isAbstractEntity;
    protected boolean _flags_updating;
    protected boolean _flags_cachesObjects;
    protected boolean _flags_isSingleTableEntity;
    protected boolean _flags_nonUpdateableAttributes;
    private volatile boolean _flags_nonUpdateableAttributesInitialized;
    public static final String FetchAllProcedureOperation = "EOFetchAllProcedure";
    public static final String FetchWithPrimaryKeyProcedureOperation = "EOFetchWithPrimaryKeyProcedure";
    public static final String InsertProcedureOperation = "EOInsertProcedure";
    public static final String DeleteProcedureOperation = "EODeleteProcedure";
    public static final String NextPrimaryKeyProcedureOperation = "EONextPrimaryKeyProcedure";
    private static final int _validIdentifierCharsSize = 128;
    private static boolean _validIdentifierChars[];
    private static final String _illegalSpecialChars = "!\"$%&'()*+,-./:;<=>?[\\]^`{|}~";

}
