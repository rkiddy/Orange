
package com.webobjects.eogeneration.rules;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.*;
import java.io.PrintStream;

public abstract class _EORuleUtilities {


    public _EORuleUtilities() { return null; }

    private static void _sortArrayAlphabeticallyByObjectName(NSMutableArray entities) { return null; }

    private static synchronized NSArray _propertiesOfEntity(boolean clientClassProperties, EOEntity entity, boolean attributes, boolean toOneRelationships, boolean toManyRelationships, boolean onlyPrimaryKeyProperties, boolean onlyMandatoryProperties, boolean onlyTextBasedAttributes) { return null; }

    private static NSArray _attributesOfEntity(EOEntity entity) { return null; }

    private static NSArray _clientAttributesOfEntity(EOEntity entity) { return null; }

    private static NSArray _relationshipsOfEntity(EOEntity entity) { return null; }

    private static NSArray _clientRelationshipsOfEntity(EOEntity entity) { return null; }

    private static synchronized NSArray _relationshipsToEntity(EOEntity entity) { return null; }

    public static synchronized NSArray allEntities() { return null; }

    private static synchronized void _createDefaultEntityArrays() { return null; }

    public static synchronized NSArray defaultMainEntities() { return null; }

    public static synchronized NSArray defaultEnumerationEntities() { return null; }

    public static synchronized NSArray defaultOtherEntities() { return null; }

    private static void _mergeArrayIntoMutableArrayIfNotAlreadyContained(NSMutableArray array, NSArray mergeArray) { return null; }

    private static NSArray _filterStringAttributes(NSArray attributes, boolean useAllAttributesIfNoneAvailable) { return null; }

    private static NSArray _filterRelationshipsToMainOrEnumerationEntitiesIfAvailable(NSArray relationships, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    private static NSArray _defaultIdentifyPropertiesForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    private static NSArray _defaultQueryPropertiesForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    private static NSArray _defaultListPropertiesForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    private static NSArray _defaultFormPropertiesForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    private static synchronized NSArray _defaultPropertiesForEntity(EOEntity entity, int propertyType, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    public static NSArray allPropertiesOfEntity(EOEntity entity) { return null; }

    public static NSArray defaultIdentifyPropertiesForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    public static NSArray defaultQueryPropertiesForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    public static NSArray defaultListPropertiesForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    public static NSArray defaultFormPropertiesForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    private static synchronized NSArray _namesOfEntities(int entityType) { return null; }

    public static NSArray allEntityNames() { return null; }

    public static NSArray defaultMainEntityNames() { return null; }

    public static NSArray defaultEnumerationEntityNames() { return null; }

    public static NSArray defaultOtherEntityNames() { return null; }

    private static NSArray _keysOfProperties(NSArray properties) { return null; }

    private static synchronized NSArray _defaultPropertyKeysForEntity(EOEntity entity, int propertyType, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    public static NSArray allPropertyKeysOfEntity(EOEntity entity) { return null; }

    public static NSArray defaultIdentifyPropertyKeysForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    public static NSArray defaultQueryPropertyKeysForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    public static NSArray defaultListPropertyKeysForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    public static NSArray defaultFormPropertyKeysForEntity(EOEntity entity, NSArray mainEntities, NSArray enumerationEntities) { return null; }

    public static void _printEntityNames(NSArray entityNames, String identifier) { return null; }

    public static void _printPropertyKeys(EOEntity entity, NSArray propertyKeys, String identifier) { return null; }

    public static void _collectModelInformation() { return null; }

    public static void _printModelInformation() { return null; }

    static Class _mthclass$(String x0) { return null; }

    static  {}

    private static final int AnyPropertyType = -1;
    private static final int IdentifyPropertyType = 0;
    private static final int QueryPropertyType = 1;
    private static final int ListPropertyType = 2;
    private static final int FormPropertyType = 3;
    private static final int AnyEntityType = -1;
    private static final int MainEntityType = 0;
    private static final int EnumerationEntityType = 1;
    private static final int OtherEntityType = 2;
    private static NSMutableDictionary _propertiesOfEntityMapTable;
    private static NSMutableDictionary _relationshipsToEntityMapTable;
    private static NSMutableArray _allEntities;
    private static NSMutableArray _defaultMainEntities;
    private static NSMutableArray _defaultEnumerationEntities;
    private static NSMutableArray _defaultOtherEntities;
    private static NSMutableDictionary _modelObjectMapTable;
    private static NSMutableDictionary _namesMapTable;
    static final String _StringClassName;
    static final String _NumberClassName;
    static final String _BigDecimalClassName;
    static final String _NSDataClassName;
    static final String _NSTimestampClassName;
    static Class class$com$webobjects$foundation$NSData; /* synthetic field */
    static Class class$com$webobjects$foundation$NSTimestamp; /* synthetic field */

}
