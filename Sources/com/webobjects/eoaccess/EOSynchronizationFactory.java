
package com.webobjects.eoaccess;

import com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions;
import com.webobjects.eoaccess.synchronization.EOSchemaSynchronization;
import com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationColumnChanges;
import com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory;
import com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges;
import com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationTableChanges;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import java.util.Iterator;
import java.util.Set;


/**
 * @deprecated Class EOSynchronizationFactory is deprecated
 */

public class EOSynchronizationFactory extends EOSchemaSynchronizationFactory
    implements EOSchemaGeneration, com.webobjects.eoaccess.EOSchemaSynchronization {


    public EOSynchronizationFactory(EOAdaptor adaptor) { return null; }

    public EOSynchronizationFactory(EOSchemaSynchronizationFactory schemaSynchronizationFactory) { return null; }

    private EOSchemaGenerationOptions optionsForDictionary(NSDictionary optionsDictionary) { return null; }

    private EOSchemaSynchronizationModelChanges modelChangesForChangeDictionary(NSDictionary changesDictionary) { return null; }

    private NSArray deletedTablesInChangesForDictionary(NSDictionary changesDictionary) { return null; }

    private NSArray insertedTablesInChangesForDictionary(NSDictionary changesDictionary) { return null; }

    private NSDictionary updatedTablesInChangesForDictionary(NSDictionary changesDictionary) { return null; }

    private EOSchemaSynchronizationModelChanges modelChangesForTableDictionary(NSDictionary changesDictionary) { return null; }

    private NSDictionary changesForTableNamed(NSDictionary changesDictionary, String name) { return null; }

    private EOSchemaSynchronizationTableChanges tableChangesForDictionary(NSDictionary changesDictionary, String tableName) { return null; }

    private NSArray deletedColumnsInChangesForDictionary(NSDictionary changesDictionary) { return null; }

    private NSArray insertedColumnsInChangesForDictionary(NSDictionary changesDictionary) { return null; }

    private NSDictionary updatedColumnsInChangesForDictionary(NSDictionary changesDictionary) { return null; }

    private NSDictionary relationshipsInChangesForDictionary(NSDictionary changesDictionary) { return null; }

    private String relationshipsNamesInRelationshipChangesForDictionary(NSDictionary relationships, String name) { return null; }

    private EOSchemaSynchronizationColumnChanges columnChangesForDictionary(NSDictionary changesDictionary, String tableName, String columnName) { return null; }

    public String schemaCreationScriptForEntities(NSArray allEntities, NSDictionary options) { return null; }

    public NSArray schemaCreationStatementsForEntities(NSArray allEntities, NSDictionary options) { return null; }

    public boolean isColumnTypeEquivalentToColumnType(com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes candidate, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes columnType, NSDictionary options) { return true; }

    public String phraseCastingColumnNamed(String columnName, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes type, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes castType, NSDictionary options) { return null; }

    public NSArray statementsToCopyTableNamed(String tableName, NSArray entityGroup, NSDictionary changes, NSDictionary options) { return null; }

    public NSArray statementsToInsertColumnForAttribute(EOAttribute attribute, NSDictionary options) { return null; }

    public NSArray statementsToModifyColumnNullRule(String columnName, String tableName, boolean allowsNull, NSDictionary options) { return null; }

    public NSArray statementsToConvertColumnType(String columnName, String tableName, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes type, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes newType, NSDictionary options) { return null; }

    public NSArray statementsToDeleteColumnNamed(String columnName, String tableName, NSDictionary options) { return null; }

    public NSArray statementsToRenameColumnNamed(String columnName, String tableName, String newName, NSDictionary options) { return null; }

    public NSArray statementsToDropForeignKeyConstraintsOnEntityGroups(NSArray entityGroups, NSDictionary changes, NSDictionary options) { return null; }

    public NSArray statementsToDropPrimaryKeyConstraintsOnEntityGroups(NSArray entityGroups, NSDictionary changes, NSDictionary options) { return null; }

    public NSArray statementsToDropPrimaryKeySupportForEntityGroups(NSArray entityGroups, NSDictionary changes, NSDictionary options) { return null; }

    public NSArray statementsToImplementForeignKeyConstraintsOnEntityGroups(NSArray entityGroups, NSDictionary changes, NSDictionary options) { return null; }

    public NSArray statementsToImplementPrimaryKeyConstraintsOnEntityGroups(NSArray entityGroups, NSDictionary changes, NSDictionary options) { return null; }

    public NSArray statementsToImplementPrimaryKeySupportForEntityGroups(NSArray entityGroups, NSDictionary changes, NSDictionary options) { return null; }

    public NSArray statementsToRenameTableNamed(String tableName, String newName, NSDictionary options) { return null; }

    public NSArray statementsToUpdateObjectStoreForModel(EOModel model, NSDictionary changes, NSDictionary options) { return null; }

    public NSArray statementsToUpdateObjectStoreForEntityGroups(NSArray entityGroups, NSDictionary changes, NSDictionary options) { return null; }

    EOSchemaSynchronizationFactory _schemaSynchronizationFactory;

}
