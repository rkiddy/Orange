package com.webobjects.eoaccess.synchronization;
/**
 * This interface has been introduced to define API to synchronize a database schema with a corresponding EOModel. None of the API is new in WebObjects 5.x. Rather, it was moved to EOSchemaSynchronization from EOSQLExpression. The API is essentially the same as in WebObjects 4.5.x except that methods which were formerly static methods of EOSQLExpression in WebObjects 4.5.x are now are instance methods of EOSchemaSynchronization.
 * An implementation of the EOSchemaSynchronization interface is provided by EOSynchronizationFactory, a new class introduced in WebObjects 5.0.
 * EOSchemaSynchronization defines a number of constants for use as keys in change dictionaries or options dictionaries. A change dictionary contains information about tables to insert, tables to delete, tables to update, and information about how to update them.
 * The schema synchronization API is typically used only by the EOModeler application, not by user application code.
 * Since: 5.4 See Also:EOSQLExpression, EOSchemaGeneration, EOSchemaSynchronizationFactory
 */
public interface EOSchemaSynchronization{
    /**
     * Return a Column Description object that describe the database schema.
     */
    abstract com.webobjects.eoaccess.synchronization.EOSchemaColumnDescription columnDescriptionForTableAndModel(java.lang.String columnName, java.lang.String tableName, com.webobjects.eoaccess.EOModel model);

    /**
     * Return an Index Description object that describe the database schema.
     */
    abstract com.webobjects.eoaccess.synchronization.EOSchemaIndexDescription indexDescriptionForTableAndModel(java.lang.String indexName, java.lang.String tableName, com.webobjects.eoaccess.EOModel model);

    /**
     * Returns true if the name, precision, width, and scale of candidate are identical to the name, precision, width, and scale of columnType, false otherwise. If the columns are equivalent, the candidate column can be copied to columnType without casting.
     */
    abstract boolean isColumnTypeEquivalentToColumnType(com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes candidate, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes columnType, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Creates a new Changes object, to facilitate subclassing.
     */
    abstract com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges newChanges();

    /**
     * Creates a new Options object, to facilitate subclassing.
     */
    abstract com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions newOptions();

    /**
     * Compares schemaAttribute with modelAttribute and returns a change dictionary of state that is different between the the two. The possible keys in the change dictionary are: ExternalTypeKey AllowsNullKey PrecisionKey ScaleKey WidthKey
     * The values in the change dictionary are the corresponding values of schemaAttribute, that is, the values stored in the database.
     */
    abstract com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationColumnChanges objectStoreChangesFromAttributeToAttribute(com.webobjects.eoaccess.EOAttribute schemaAttribute, com.webobjects.eoaccess.EOAttribute modelAttribute);

    /**
     * Returns an SQL string to cast the values in the column identified by columnName from the current type to a new type specified by castType. This method is used when the adaptor doesn't support in-place column type coercion, and the table has to be recreated. To move data from the old table to the new table, sometimes a conversion statement is needed (for example, to convert strings in a VARCHAR column to numbers). options is a dictionary describing the aspects of the schema for which to create SQL statements.
     */
    abstract java.lang.String phraseCastingColumnNamed(java.lang.String columnName, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes type, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes castType, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to convert in place of the type of the column indentifed by columnName in the table identified by tableName from the current type to the type specified by newType. options is a dictionary describing the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToConvertColumnType(java.lang.String columnName, java.lang.String tableName, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes type, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes newType, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to copy the specified table into a new table, whose definition is provided by entityGroup, an array of EOEntity objects with the same external name. This method is used when the adaptor doesn't support the in-place table modifications required to synchronize the database to a model.
     * The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToCopyTableNamed(java.lang.String tableName, com.webobjects.foundation.NSArray entityGroup, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationTableChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to delete the column indentifed by columnName from the table identified by tableName. options is a dictionary describing the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToDeleteColumnNamed(java.lang.String columnName, java.lang.String tableName, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to drop foreign key constraints for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToDropForeignKeyConstraintsOnEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to drop primary key constraints for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToDropPrimaryKeyConstraintsOnEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to drop primary key support for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToDropPrimaryKeySupportForEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to implement foreign key constraints for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToImplementForeignKeyConstraintsOnEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to implement primary key constraints for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToImplementPrimaryKeyConstraintsOnEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to implement primary key support for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToImplementPrimaryKeySupportForEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to insert a column in the database schema for the specified attribute. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToInsertColumnForAttribute(com.webobjects.eoaccess.EOAttribute attribute, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to modify in place the column identified by columnName in the table identified by tableName to either allow or not allow NULL values as specified by allowsNull. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToModifyColumnNullRule(java.lang.String columnName, java.lang.String tableName, boolean allowsNull, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to rename in place of the the column indentifed by in the table identified by tableName to newName. options is a dictionary describing the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToRenameColumnNamed(java.lang.String columnName, java.lang.String tableName, java.lang.String newName, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to rename in place the the table indentifed by tableName to newName. options is a dictionary describing the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToRenameTableNamed(java.lang.String tableName, java.lang.String newName, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to update the database table that corresponds to model according to the changes and SQL generation instructions in the changes and options dictionaries. model is an array of entity groups, which are arrays of EOEntity objects that have the same external name. Inserts and deletes columns, and updates modified columns.
     */
    abstract com.webobjects.foundation.NSArray statementsToUpdateObjectStoreForEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns an array of EOSQLExpressions to synchronize the database with the EOModel model. Prepares the statements to insert and delete new and deleted tables before invoking statementsToUpdateObjectStoreForEntityGroups for each modified table. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    abstract com.webobjects.foundation.NSArray statementsToUpdateObjectStoreForModel(com.webobjects.eoaccess.EOModel model, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options);

    /**
     * Returns true if the adaptor can change the type of an existing column in place, false otherwise.
     */
    abstract boolean supportsDirectColumnCoercion();

    /**
     * Returns true if the adaptor can delete columns, false otherwise.
     */
    abstract boolean supportsDirectColumnDeletion();

    /**
     * Returns true if the adaptor can add columns to a table, false otherwise.
     */
    abstract boolean supportsDirectColumnInsertion();

    /**
     * Returns true if the adaptor can modify the null rule of an existing column in place, false otherwise.
     */
    abstract boolean supportsDirectColumnNullRuleModification();

    /**
     * Returns true if the adaptor can rename table columns, false otherwise.
     */
    abstract boolean supportsDirectColumnRenaming();

    /**
     * Returns true if the adaptor can update the database schema to reflect changes in an EOModel, false otherwise.
     */
    abstract boolean supportsSchemaSynchronization();

    /**
     * Returns true if the adaptor can describe the database schema, false otherwise.
     */
    abstract boolean supportsTableDescriptionIntrospection();

    /**
     * Return a Table Description object that describe the database schema.
     */
    abstract com.webobjects.eoaccess.synchronization.EOSchemaTableDescription tableDescriptionForModel(java.lang.String tableName, com.webobjects.eoaccess.EOModel model);

    /**
     * The ColumnTypes interface is only used when implementing schema synchronization API for a custom adaptor. Even in that case, the implementation in EOSynchronizationFactory should be sufficient.
     */
    public static interface ColumnTypes{
        /**
         * Returns the receiver's name.
         */
        abstract java.lang.String name();

        /**
         * Returns the receiver's precision.
         */
        abstract int precision();

        /**
         * Returns the receiver's scale.
         */
        abstract int scale();

        /**
         * Returns the receiver's width.
         */
        abstract int width();

    }
}
