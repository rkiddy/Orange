
package com.webobjects.eoaccess;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;


/**
 * @deprecated Interface EOSchemaSynchronization is deprecated
 */

public interface EOSchemaSynchronization
    extends com.webobjects.eoaccess.synchronization.EOSchemaSynchronization {


    public abstract boolean isColumnTypeEquivalentToColumnType(com.webobjects.eoaccess.synchronization.ColumnTypes columntypes, com.webobjects.eoaccess.synchronization.ColumnTypes columntypes1, NSDictionary nsdictionary);

    public abstract String phraseCastingColumnNamed(String s, com.webobjects.eoaccess.synchronization.ColumnTypes columntypes, com.webobjects.eoaccess.synchronization.ColumnTypes columntypes1, NSDictionary nsdictionary);

    public abstract NSArray statementsToCopyTableNamed(String s, NSArray nsarray, NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public abstract NSArray statementsToInsertColumnForAttribute(EOAttribute eoattribute, NSDictionary nsdictionary);

    public abstract NSArray statementsToModifyColumnNullRule(String s, String s1, boolean flag, NSDictionary nsdictionary);

    public abstract NSArray statementsToConvertColumnType(String s, String s1, com.webobjects.eoaccess.synchronization.ColumnTypes columntypes, com.webobjects.eoaccess.synchronization.ColumnTypes columntypes1, NSDictionary nsdictionary);

    public abstract NSArray statementsToDeleteColumnNamed(String s, String s1, NSDictionary nsdictionary);

    public abstract NSArray statementsToRenameColumnNamed(String s, String s1, String s2, NSDictionary nsdictionary);

    public abstract NSArray statementsToDropForeignKeyConstraintsOnEntityGroups(NSArray nsarray, NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public abstract NSArray statementsToDropPrimaryKeyConstraintsOnEntityGroups(NSArray nsarray, NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public abstract NSArray statementsToDropPrimaryKeySupportForEntityGroups(NSArray nsarray, NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public abstract NSArray statementsToImplementForeignKeyConstraintsOnEntityGroups(NSArray nsarray, NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public abstract NSArray statementsToImplementPrimaryKeyConstraintsOnEntityGroups(NSArray nsarray, NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public abstract NSArray statementsToImplementPrimaryKeySupportForEntityGroups(NSArray nsarray, NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public abstract NSArray statementsToRenameTableNamed(String s, String s1, NSDictionary nsdictionary);

    public abstract NSArray statementsToUpdateObjectStoreForModel(EOModel eomodel, NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public abstract NSArray statementsToUpdateObjectStoreForEntityGroups(NSArray nsarray, NSDictionary nsdictionary, NSDictionary nsdictionary1);

    public static final String SchemaSynchronizationForeignKeyConstraintsKey = "SchemaSynchronizationForeignKeyConstraintsKey";
    public static final String SchemaSynchronizationPrimaryKeyConstraintsKey = "SchemaSynchronizationPrimaryKeyConstraintsKey";
    public static final String SchemaSynchronizationPrimaryKeySupportKey = "SchemaSynchronizationPrimaryKeySupportKey";
    public static final String AllowsNullKey = "allowsNull";
    public static final String ColumnNameKey = "columnName";
    public static final String ExternalNameKey = "externalName";
    public static final String ExternalTypeKey = "externalType";
    public static final String NameKey = "name";
    public static final String PrecisionKey = "precision";
    public static final String RelationshipsKey = "relationships";
    public static final String ScaleKey = "scale";
    public static final String WidthKey = "width";

}
