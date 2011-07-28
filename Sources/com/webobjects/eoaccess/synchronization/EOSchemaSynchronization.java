
package com.webobjects.eoaccess.synchronization;

import com.webobjects.eoaccess.EOAttribute;
import com.webobjects.eoaccess.EOModel;
import com.webobjects.foundation.NSArray;


public interface EOSchemaSynchronization {
    public static interface ColumnTypes {

        public abstract String name();

        public abstract int precision();

        public abstract int scale();

        public abstract int width();
    }



    public abstract EOSchemaGenerationOptions newOptions();

    public abstract EOSchemaSynchronizationModelChanges newChanges();

    public abstract boolean isColumnTypeEquivalentToColumnType(ColumnTypes columntypes, ColumnTypes columntypes1, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract String phraseCastingColumnNamed(String s, ColumnTypes columntypes, ColumnTypes columntypes1, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToCopyTableNamed(String s, NSArray nsarray, EOSchemaSynchronizationTableChanges eoschemasynchronizationtablechanges, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToInsertColumnForAttribute(EOAttribute eoattribute, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToModifyColumnNullRule(String s, String s1, boolean flag, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToConvertColumnType(String s, String s1, ColumnTypes columntypes, ColumnTypes columntypes1, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToDeleteColumnNamed(String s, String s1, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToRenameColumnNamed(String s, String s1, String s2, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToDropForeignKeyConstraintsOnEntityGroups(NSArray nsarray, EOSchemaSynchronizationModelChanges eoschemasynchronizationmodelchanges, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToDropPrimaryKeyConstraintsOnEntityGroups(NSArray nsarray, EOSchemaSynchronizationModelChanges eoschemasynchronizationmodelchanges, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToDropPrimaryKeySupportForEntityGroups(NSArray nsarray, EOSchemaSynchronizationModelChanges eoschemasynchronizationmodelchanges, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToImplementForeignKeyConstraintsOnEntityGroups(NSArray nsarray, EOSchemaSynchronizationModelChanges eoschemasynchronizationmodelchanges, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToImplementPrimaryKeyConstraintsOnEntityGroups(NSArray nsarray, EOSchemaSynchronizationModelChanges eoschemasynchronizationmodelchanges, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToImplementPrimaryKeySupportForEntityGroups(NSArray nsarray, EOSchemaSynchronizationModelChanges eoschemasynchronizationmodelchanges, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToRenameTableNamed(String s, String s1, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToUpdateObjectStoreForModel(EOModel eomodel, EOSchemaSynchronizationModelChanges eoschemasynchronizationmodelchanges, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract NSArray statementsToUpdateObjectStoreForEntityGroups(NSArray nsarray, EOSchemaSynchronizationModelChanges eoschemasynchronizationmodelchanges, EOSchemaGenerationOptions eoschemagenerationoptions);

    public abstract EOSchemaTableDescription tableDescriptionForModel(String s, EOModel eomodel);

    public abstract EOSchemaColumnDescription columnDescriptionForTableAndModel(String s, String s1, EOModel eomodel);

    public abstract EOSchemaIndexDescription indexDescriptionForTableAndModel(String s, String s1, EOModel eomodel);

    public abstract boolean supportsDirectColumnNullRuleModification();

    public abstract boolean supportsDirectColumnCoercion();

    public abstract boolean supportsDirectColumnDeletion();

    public abstract boolean supportsDirectColumnInsertion();

    public abstract boolean supportsDirectColumnRenaming();

    public abstract boolean supportsSchemaSynchronization();

    public abstract boolean supportsTableDescriptionIntrospection();

    public abstract EOSchemaSynchronizationColumnChanges objectStoreChangesFromAttributeToAttribute(EOAttribute eoattribute, EOAttribute eoattribute1);

    public static final boolean _commentsEnabled = false;

}
