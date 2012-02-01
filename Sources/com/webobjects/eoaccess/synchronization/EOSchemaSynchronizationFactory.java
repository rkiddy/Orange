package com.webobjects.eoaccess.synchronization;
/**
 * This class has been introduced to implement the interfaces EOSchemaGeneration and EOSchemaSynchronization, which were introduced in WebObjects 5.0. The API is essentially the same as in WebObjects 4.5.x except that methods that were formerly static methods of EOSQLExpression are now are instance methods of EOSchemaGeneration or EOSchemaSynchronization.
 * Since: 5.4 See Also:EOSchemaGeneration, EOSchemaSynchronization
 */
public class EOSchemaSynchronizationFactory implements com.webobjects.eoaccess.synchronization.EOSchemaGeneration, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization{
    /**
     * Creates and returns a new EOSynchronization factory that uses the specified adaptor to communicate with an external database.
     * Parameters:adaptor - An EOAdaptor to associate with the new EOSynchronizationFactory.
     */
    public EOSchemaSynchronizationFactory(com.webobjects.eoaccess.EOAdaptor adaptor){
         //TODO codavaj!!
    }

    /**
     * Returns the receiver's EOAdaptor.
     */
    public com.webobjects.eoaccess.EOAdaptor adaptor(){
        return null; //TODO codavaj!!
    }

    /**
     * Appends expression's statement to script along with any necessary delimiter. script is the StringBuffer in which the SQL script is built. Used in conjunction with schemaCreationStatementsForEntities and schemaCreationScriptForEntities to build up the SQL script to generate the specified schema for a set of EOEntities.
     * This method appends the SQL statement for expression to script followed by a semicolon and a newline. A subclass of EOSQLExpression only need to override this method if the delimiter for its database server is different.
     */
    public void appendExpressionToScript(com.webobjects.eoaccess.EOSQLExpression expression, java.lang.StringBuffer script){
        return; //TODO codavaj!!
    }

    public com.webobjects.eoaccess.EOAttribute attributeInEntityWithColumnName(com.webobjects.eoaccess.EOEntity entity, java.lang.String columnName){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Return a Column Description object that describe the database schema.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaColumnDescription columnDescriptionForTableAndModel(java.lang.String columnName, java.lang.String tableName, com.webobjects.eoaccess.EOModel eomodel){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns null. Can be overridden by subclasses to generate and return an array of EOSQLExpressions defining the SQL statements to create a database or user that can be accessed by the provided connectionDictionary and administrativeConnectionDictionary.
     */
    public com.webobjects.foundation.NSArray createDatabaseStatementsForConnectionDictionary(com.webobjects.foundation.NSDictionary connectionDictionary, com.webobjects.foundation.NSDictionary administrativeConnectionDictionary){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.foundation.NSArray createIndexExpressionsForEntity(com.webobjects.eoaccess.EOEntity entity, com.webobjects.eoaccess.EOEntityIndex anIndex, com.webobjects.eoaccess.EOEntity masterEntity){
        return null; //TODO codavaj!!
    }

    protected java.lang.String createIndexStatementForEntity(com.webobjects.eoaccess.EOEntity entity, java.lang.String indexName, java.lang.String tableName, com.webobjects.foundation.NSArray attributeList){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray createIndexStatementsForEntityGroup(com.webobjects.foundation.NSArray entityGroup){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray createIndexStatementsForEntityGroups(com.webobjects.foundation.NSArray entityGroups){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSQLExpression objects that define the SQL necessary to create a table for entityGroup. Returns an empty array if entityGroup is null or empty.
     * EOSynchronizationFactory's implementation does the following:
     * Creates an EOSQLExpression object. Sets the expression's entity to the first entity in entityGroup. Adds a create clause for each attribute in entityGroup's entities. Sets the expression's statement to: CREATE TABLE TABLE_NAME (LIST_STRING) (where TABLE_NAME is the external name of the EOEntity objects in entityGroup and LIST_STRING is the expression's listString. Adds the expression to an array. Returns the array.
     * The following is an example of a CREATE TABLE statement produced by this method:
     * create table EMPLOYEE ( EMP_ID int not null, DEPT_ID int null, LAST_NAME varchar(40) not null, PHONE char(12) null, HIRE_DATE date null, SALARY number(7, 2) null )
     * If a database server's table creation semantics are different, a subclass should override this method or one or more of the following methods as appropriate: addCreateClauseForAttribute columnTypeStringForAttribute allowsNullClauseForConstraint
     */
    public com.webobjects.foundation.NSArray createTableStatementsForEntityGroup(com.webobjects.foundation.NSArray entityGroup){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSQLExpression objects that define the SQL necessary to create the tables for each of the entity groups in entityGroups. Returns an empty array if entityGroups is empty.
     * This method invokes createTableStatementsForEntityGroup for each entity group in entityGroups and returns an array of all the resulting EOSQLExpressions.
     */
    public com.webobjects.foundation.NSArray createTableStatementsForEntityGroups(com.webobjects.foundation.NSArray entityGroups){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns null. Can be overridden by subclasses to generate and return an array of EOSQLExpressions defining the SQL statements to drop a database or user that is accessed by the provided connectionDictionary and administrativeConnectionDictionary.
     */
    public com.webobjects.foundation.NSArray dropDatabaseStatementsForConnectionDictionary(com.webobjects.foundation.NSDictionary connectionDictionary, com.webobjects.foundation.NSDictionary administrativeConnectionDictionary){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.foundation.NSArray dropIndexExpressionsForEntity(com.webobjects.eoaccess.EOEntity entity, com.webobjects.eoaccess.EOEntityIndex anIndex, com.webobjects.eoaccess.EOEntity masterEntity){
        return null; //TODO codavaj!!
    }

    protected java.lang.String dropIndexStatementForEntity(com.webobjects.eoaccess.EOEntity entity, java.lang.String indexName, java.lang.String tableName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray dropIndexStatementsForEntityGroup(com.webobjects.foundation.NSArray entityGroup){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray dropIndexStatementsForEntityGroups(com.webobjects.foundation.NSArray entityGroups){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns null. Can be overridden by subclasses to return an array of EOSQLExpression objects that define the SQL necessary to drop the primary key generation support for entityGroup.
     */
    public com.webobjects.foundation.NSArray dropPrimaryKeySupportStatementsForEntityGroup(com.webobjects.foundation.NSArray entityGroup){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSQLExpression objects that define the SQL necessary to drop the primary key generation support for all the entities in each of the the entity groups in entityGroups. Returns an empty array if entityGroups is null or empty. If primary key generation is not supported, returns an array that contains the string
     * The 'Drop Primary Key Support' option is unavailable.
     * This method invokes dropPrimaryKeySupportStatementsForEntityGroup for each entity group in entityGroups and returns an array of all the resulting EOSQLExpressions. Since the default implementation of dropPrimaryKeySupportStatementsForEntityGroup returns null, this method returns the not supported value (see above) by default, but a subclass need only override dropPrimaryKeySupportStatementsForEntityGroup in order to enable this method as well.
     */
    public com.webobjects.foundation.NSArray dropPrimaryKeySupportStatementsForEntityGroups(com.webobjects.foundation.NSArray entityGroups){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSQLExpression objects that define the SQL necessary to drop the table identified by entityGroup. Returns an empty array if entityGroup is null. The drop statement generated by this method should be sufficient to remove the table created by createTableStatementsForEntityGroup's statements.
     * This method creates a statement of the form:
     * DROP TABLE TABLE_NAME
     * where TABLE_NAME is the external name of the first entity in entityGroup.
     * If the database server's drop semantics are different, a subclass should override this method.
     */
    public com.webobjects.foundation.NSArray dropTableStatementsForEntityGroup(com.webobjects.foundation.NSArray entityGroup){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSQLExpression objects that define the SQL necessary to drop the tables for all the entity groups in entityGroups. Returns an empty array if entityGroups is empty.
     * This method invokes dropTableStatementsForEntityGroup for each entity group in entityGroups and returns an array of all the resulting EOSQLExpressions.
     */
    public com.webobjects.foundation.NSArray dropTableStatementsForEntityGroups(com.webobjects.foundation.NSArray entityGroups){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpression objects that define the SQL statements necessary to create foreign key constraints for relationship. Returns an empty array if unable to generate foreign key constraints for relationship
     */
    public com.webobjects.foundation.NSArray foreignKeyConstraintStatementsForRelationship(com.webobjects.eoaccess.EORelationship relationship){
        return null; //TODO codavaj!!
    }

    /**
     * Formats the column name for insertion in a select statement. The default is to return the column name without quotes. Override this in the plugin for custom behavior.
     */
    protected java.lang.String formatColumnName(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Formats the table name for insertion in a select statement. The default is to return the table name without quotes. Override this in the plugin for custom behavior.
     */
    protected java.lang.String formatTableName(java.lang.String name){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.foundation.NSArray indexDefinitionForEntity(com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Return an Index Description object that describe the database schema.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaIndexDescription indexDescriptionForTableAndModel(java.lang.String indexName, java.lang.String tableName, com.webobjects.eoaccess.EOModel eomodel){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns false.
     */
    public boolean isCaseSensitive(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the name, precision, width, and scale of candidate are identical to the name, precision, width, and scale of columnType, false otherwise. If the columns are equivalent, the candidate column can be copied to columnType without casting.
     */
    public boolean isColumnTypeEquivalentToColumnType(com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes candidate, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes columnType, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return false; //TODO codavaj!!
    }

    /**
     * Steps through the change dictionary changes and returns an array of strings identifying all the columns and their tables where the allows NULL rule has been changed in the corresponding model to disallow NULL values, but the database still contains such values. Returns null if no logical errors are detected.
     */
    public com.webobjects.foundation.NSArray logicalErrorsInChangeDictionaryForModelOptions(com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.EOModel model, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new Changes object, to facilitate subclassing.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges newChanges(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new Options object, to facilitate subclassing.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions newOptions(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Compares schemaAttribute with modelAttribute and returns a change dictionary of state that is different between the the two. The possible keys in the change dictionary are: ExternalTypeKey AllowsNullKey PrecisionKey ScaleKey WidthKey
     * The values in the change dictionary are the corresponding values of schemaAttribute, that is, the values stored in the database.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationColumnChanges objectStoreChangesFromAttributeToAttribute(com.webobjects.eoaccess.EOAttribute schemaAttribute, com.webobjects.eoaccess.EOAttribute modelAttribute){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns columnName. Can be overridden by subclasses to return an SQL string to cast the values in the column identified by columnName from the current type to a new type specified by castType. options is a dictionary describing the aspects of the schema for which to create SQL statements.
     */
    public java.lang.String phraseCastingColumnNamed(java.lang.String columnName, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes type, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes castType, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSQLExpression objects that define the SQL necessary to create the primary key constraints for entityGroup. Returns an empty array if any of the primary key attributes in entityGroup don't have a column name or if entityGroup is null.
     * This method creates a statement of the form:
     * ALTER TABLE TABLE_NAME ADD PRIMARY KEY (PRIMARY_KEY_COLUMN_NAMES)
     * where TABLE_NAME is the external name for the first entity in entityGroup and PRIMARY_KEY_COLUMN_NAMES is a comma-separated list of the column names of the first entity's primary key attributes. If the subclass's database server's primary key constraint semantics are different, the subclass should override this method.
     */
    public com.webobjects.foundation.NSArray primaryKeyConstraintStatementsForEntityGroup(com.webobjects.foundation.NSArray entityGroup){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSQLExpression objects that define the SQL necessary to create the primary key constraints for the entities specified in entityGroups. Returns an empty array if entityGroups is null or empty.
     * This method invokes EOSQLExpression's implementation of primaryKeyConstraintStatementsForEntityGroup for each entity group in entityGroups and returns an array of all the resulting EOSQLExpressions.
     */
    public com.webobjects.foundation.NSArray primaryKeyConstraintStatementsForEntityGroups(com.webobjects.foundation.NSArray entityGroups){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of primary key entity groups for entities, or an empty array if entities is empty or null. Primary key entity groups are arrays of entities with simple primary keys; within each group, the entities have the same external name.
     */
    public com.webobjects.foundation.NSArray primaryKeyEntityGroupsForEntities(com.webobjects.foundation.NSArray entities){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns null. Can be overridden by subclasses to return an array of EOSQLExpression objects that define the SQL necessary to create the primary key generation support for entityGroup.
     */
    public com.webobjects.foundation.NSArray primaryKeySupportStatementsForEntityGroup(com.webobjects.foundation.NSArray entityGroup){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSQLExpression objects that define the SQL necessary to create the primary key generation support for all the entities in each of the the entity groups in entityGroups. Returns an empty array if entityGroups is null or empty. If primary key generation is not supported, returns an array that contains the string
     * The 'Create Primary Key Support' option is unavailable.
     * This method invokes primaryKeySupportStatementsForEntityGroup for each entity group in entityGroups and returns an array of all the resulting EOSQLExpressions. Since the default implementation of primaryKeySupportStatementsForEntityGroup returns null, this method returns the not supported value (see above) by default, but a subclass need only override primaryKeySupportStatementsForEntityGroup in order to enable this method as well.
     */
    public com.webobjects.foundation.NSArray primaryKeySupportStatementsForEntityGroups(com.webobjects.foundation.NSArray entityGroups){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a script of SQL statements suitable to create the schema based on options for the EOEntity objects in allEntities. Returns an empty string if either options or allEntities is empty or null. options is a dictionary whose keys possible aspects of a schema and whose respective values of
     * YES
     * or
     * NO
     * determine whether that schema option is enabled for a particular invocation. The possible option keys are: CreateTablesKey DropTablesKey CreatePrimaryKeySupportKey DropPrimaryKeySupportKey PrimaryKeyConstraintsKey ForeignKeyConstraintsKey CreateDatabaseKey DropDatabaseKey
     * This method invokes schemaCreationStatementsForEntities with entities and options and then uses appendExpressionToScript to build up the script string from the EOSQLExpressions returned by schemaCreationStatementsForEntities.
     */
    public java.lang.String schemaCreationScriptForEntities(com.webobjects.foundation.NSArray allEntities, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSQLExpressions suitable to create the schema based on options for the EOEntity objects in allEntities. Returns an empty array if either allEntities or options is null or empty.
     * options is a dictionary whose keys possible aspects of a schema and whose respective values of YES or NO determine whether that schema option is enabled for a particular invocation. The possible option keys are:
     * CreateTablesKey DropTablesKey CreatePrimaryKeySupportKey DropPrimaryKeySupportKey PrimaryKeyConstraintsKey ForeignKeyConstraintsKey CreateDatabaseKey DropDatabaseKey
     * Used in conjunction with appendExpressionToScript and schemaCreationScriptForEntities to build up the SQL script to generate the specified schema for allEntities.
     */
    public com.webobjects.foundation.NSArray schemaCreationStatementsForEntities(com.webobjects.foundation.NSArray allEntities, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoaccess.synchronization.EOSchemaGeneration.Delegate schemaGenerationDelegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's delegate.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory.Delegate schemaSynchronizationDelegate(){
        return null; //TODO codavaj!!
    }

    public void setSchemaGenerationDelegate(com.webobjects.eoaccess.synchronization.EOSchemaGeneration.Delegate delegate){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's delegate to delegate.
     */
    public void setSchemaSynchronizationDelegate(com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory.Delegate delegate){
        return; //TODO codavaj!!
    }

    /**
     * The default implementation returns null. Can be overridden by subclasses to return an array of EOSQLExpressions to convert in place of the type of the column indentifed by columnName in the table identified by tableName from the current type to the type specified by newType. options is a dictionary describing the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToConvertColumnType(java.lang.String columnName, java.lang.String tableName, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes type, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes newType, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpressions to copy the specified table into a new table, whose definition is provided by entityGroup, an array of EOEntity objects with the same external name. This method is used when the adaptor doesn't support the in-place table modifications required to synchronize the database to a model.
     * The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToCopyTableNamed(java.lang.String tempTableName, com.webobjects.foundation.NSArray entityGroup, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationTableChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns null. Can be overridden by subclasses to return an array of EOSQLExpressions to delete in place of the column indentifed by from the table identified by tableName. options is a dictionary describing the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToDeleteColumnNamed(java.lang.String columnName, java.lang.String tableName, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray statementsToDropForeignKeyConstraintsOnEntityGroup(com.webobjects.foundation.NSArray entityGroup, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationTableChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpressions to drop foreign key constraints for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToDropForeignKeyConstraintsOnEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpressions to drop primary key constraints for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToDropPrimaryKeyConstraintsOnEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpressions to drop primary key support for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToDropPrimaryKeySupportForEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpressions to implement foreign key constraints for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToImplementForeignKeyConstraintsOnEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpressions to implement primary key constraints for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToImplementPrimaryKeyConstraintsOnEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpressions to implement primary key support for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToImplementPrimaryKeySupportForEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpressions to insert a column in the database schema for the specified attribute. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToInsertColumnForAttribute(com.webobjects.eoaccess.EOAttribute attribute, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Returns null by default. Can be overridden by subclasses to return an array of EOSQLExpressions to modify in place of the column identified by columnName in the table identified by tableName to either allow or not allow NULL values as specified by allowsNull. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToModifyColumnNullRule(java.lang.String columnName, java.lang.String tableName, boolean allowsNull, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns null. Can be overridden by subclasses to return an array of EOSQLExpressions to rename the column indentifed by columnName in the table identified by tableName to newName. options is a dictionary describing the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToRenameColumnNamed(java.lang.String columnName, java.lang.String tableName, java.lang.String newName, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpressions to rename in place the the table indentifed by tableName to newName. options is a dictionary describing the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToRenameTableNamed(java.lang.String oldTableName, java.lang.String newTableName, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of EOSQLExpressions to update the database table that corresponds to entityGroups according to the changes and SQL generation instructions in the changes and options dictionaries. entityGroups is an array of entity groups, which are arrays of EOEntity objects that have the same external name. Inserts and deletes columns, and updates modified columns.
     */
    public com.webobjects.foundation.NSArray statementsToUpdateObjectStoreForEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of EOSQLExpressions to synchronize the database with the EOModel model. Prepares the statements to insert and delete new and deleted tables before invoking statementsToUpdateObjectStoreForEntityGroups for each modified table. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
     */
    public com.webobjects.foundation.NSArray statementsToUpdateObjectStoreForModel(com.webobjects.eoaccess.EOModel model, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can change the type of an existing column in place.
     */
    public boolean supportsDirectColumnCoercion(){
        return false; //TODO codavaj!!
    }

    /**
     * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can delete columns.
     */
    public boolean supportsDirectColumnDeletion(){
        return false; //TODO codavaj!!
    }

    /**
     * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can add columns to a table.
     */
    public boolean supportsDirectColumnInsertion(){
        return false; //TODO codavaj!!
    }

    /**
     * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can modify the null rule of an existing column in place.
     */
    public boolean supportsDirectColumnNullRuleModification(){
        return false; //TODO codavaj!!
    }

    /**
     * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can rename columns in a table.
     */
    public boolean supportsDirectColumnRenaming(){
        return false; //TODO codavaj!!
    }

    /**
     * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can update the database schema to reflect changes in an EOModel.
     */
    public boolean supportsSchemaSynchronization(){
        return false; //TODO codavaj!!
    }

    /**
     * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can describe the database schema.
     */
    public boolean supportsTableDescriptionIntrospection(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Return a Table Description object that describe the database schema.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaTableDescription tableDescriptionForModel(java.lang.String tableName, com.webobjects.eoaccess.EOModel eomodel){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of table entity groups for entities, or an empty array if entities is empty or null. Table entity groups are arrays of entities with attributes that have column names; within each group, the entities have the same external name.
     */
    public com.webobjects.foundation.NSArray tableEntityGroupsForEntities(com.webobjects.foundation.NSArray entities){
        return null; //TODO codavaj!!
    }

    /**
     * The Delegate interface for EOSynchronizationFactory is restricted to use by the EOModeler application and should not be implemented by others.
     */
    public static interface Delegate{
        /**
         * Restricted method. Do not implement.
         */
        abstract boolean allowsNullForColumnNamed(java.lang.String columnName, java.lang.String tableName);

        /**
         * Restricted method. Do not implement.
         */
        abstract boolean isSchemaTableNamed(java.lang.String tableName);

        /**
         * Restricted method. Do not implement.
         */
        abstract com.webobjects.eoaccess.EOAdaptor schemaSynchronizationAdaptor();

        /**
         * Restricted method. Do not implement.
         */
        abstract com.webobjects.eoaccess.EOAdaptorChannel schemaSynchronizationAdaptorChannelForModel(com.webobjects.eoaccess.EOModel model);

        /**
         * Restricted method. Do not implement.
         */
        abstract void schemaSynchronizationStatementsWillCopyTableNamed(com.webobjects.foundation.NSArray statements, java.lang.String tableName);

        /**
         * Restricted method. Do not implement.
         */
        abstract void schemaSynchronizationStatementsWillDeleteTableNamed(com.webobjects.foundation.NSArray statements, java.lang.String tableName);

    }
}
