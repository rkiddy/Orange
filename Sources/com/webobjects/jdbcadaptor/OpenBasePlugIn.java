package com.webobjects.jdbcadaptor;
public class OpenBasePlugIn extends com.webobjects.jdbcadaptor.JDBCPlugIn{
    public OpenBasePlugIn(com.webobjects.jdbcadaptor.JDBCAdaptor adaptor){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the JDBC URL to use for connecting to the database. The default implementation gets the URL from the adaptor.
     */
    public java.lang.String connectionURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Creates a new EOSynchronizationFactory using the plugin's response to adaptor(). The default EOSynchronizationFactory supports only basic SQL table generation. Subclasses need to override this method to support schema synchronization.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory createSchemaSynchronizationFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns a string identifying the database. Subclasses should override.
     */
    public java.lang.String databaseProductName(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns a fully qualified name of the JDBC driver class that this plugin prefers to use. The adaptor will attempt to load this class when making a connection. Subclasses should override.
     */
    public java.lang.String defaultDriverName(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the Java Class to use as the expression class. The default is JDBCExpression. Subclasses will typically override to use their own subclass of JDBCExpression.
     */
    public java.lang.Class defaultExpressionClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Determines if the column is a "pseudo" column. A pseudo column is one that was not part of the CREATE TABLE statement, but was created automatically by the database. These columns usually should not be considered for reverse engineering.
     */
    public boolean isPseudoColumnName(java.lang.String columnName){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns database-specific information about the JDBC data source. Subclasses may want to return a modified copy of the dictionary returned by calling super.
     */
    public com.webobjects.foundation.NSDictionary jdbcInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the plugin's name. Subclasses of JDBCPlugIn need to override this method.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Generates a batch of new primary keys for entity. It should return an NSArray of NSDictionary where each dictionary corresponds to a unique primary key value. The count of the NSArray should match count. The JDBChannel channel is already open and ready to use. If the primary key contains multiple attributes or is not of kind number, then the default implementation returns null. The default implementation uses a table named according to primaryKeyTableName containing the table name and the last primary key inserted in this table. If the row for a table name is not present, then it is automatically created. If the primaryKeyTableName table does not exists then it is automatically created. Subclasses should override the default implementation if they want to provide a more efficient mechanism for generating primary keys.
     */
    public com.webobjects.foundation.NSArray newPrimaryKeys(int count, com.webobjects.eoaccess.EOEntity entity, com.webobjects.jdbcadaptor.JDBCChannel adaptorChannel){
        return null; //TODO codavaj!!
    }

    public static class OpenBaseExpression extends com.webobjects.jdbcadaptor.JDBCExpression{
        public OpenBaseExpression(com.webobjects.eoaccess.EOEntity entity){
             //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Adds an attribute-value assignment ("LAST_NAME = 'Thomas'", for example) to a comma-separated list for use in an UPDATE statement. Formats value with attribute's "write" format. Method listString can be used to access the list. This method invokes appendItemToListString to add the attribute-value assignment.
         */
        public void addUpdateListAttribute(com.webobjects.eoaccess.EOAttribute attribute, java.lang.Object value){
            return; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * This method is invoked from prepareInsertExpressionWithRow to return an SQL INSERT statement. The statement is of the form: INSERT INTO tableList (columnList) VALUES valueList or, if columnList is null: INSERT INTO tableList VALUES valueList
         */
        public java.lang.String assembleInsertStatementWithRow(com.webobjects.foundation.NSDictionary nsdictionary, java.lang.String s, java.lang.String s1, java.lang.String s2){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * This method is invoked from addJoinClause to return a JOIN clause. The clause is of the form: leftName
         * i
         * operator
         * /i
         * rightName where
         * is "=" for an inner join, "*=" for a left-outer join, and "=*" for a right-outer join.
         */
        public java.lang.String assembleJoinClause(java.lang.String leftName, java.lang.String rightName, int semantic){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * This method is invoked from prepareSelectExpressionWithAttributes to return an SQL SELECT statement. The statment is of the form: SELECT columnList FROM tableList lockClause WHERE whereClause AND joinClause ORDER BY orderByClause If lockClause is null, it is omitted from the statement. Similarly, if orderByClause is null, the "ORDER BY orderByClause" is omitted. If either whereClause or joinClause is null, the "AND" and null-valued argument are omitted. If both are null, the entire WHERE clause is omitted. attributes, lock, qualifer, fetchOrder arguments to prepareSelectExpressionWithAttributes from which the other assembleSelect... arguments were derived. They are provided for subclasses that need to generate the clauses of the SELECT statement in a particular way.
         */
        public java.lang.String assembleSelectStatementWithAttributes(com.webobjects.foundation.NSArray attributes, boolean lock, com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.foundation.NSArray fetchOrder, java.lang.String selectString, java.lang.String columnList, java.lang.String tableList, java.lang.String whereClause, java.lang.String joinClause, java.lang.String orderByClause, java.lang.String lockClause){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * This method is invoked from prepareUpdateExpressionWithRow to return an SQL UPDATE statement. The statement is of the form: UPDATE tableList SET updateList WHERE whereClause row and qualifier are the arguments to prepareUpdateExpressionWithRow from which updateList and whereClause were derived. They are provided for subclasses that need to generate the clauses of the UPDATE statement in a particular way.
         */
        public java.lang.String assembleUpdateStatementWithRow(com.webobjects.foundation.NSDictionary nsdictionary, com.webobjects.eocontrol.EOQualifier eoqualifier, java.lang.String s, java.lang.String s1, java.lang.String s2){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Implemented by subclasses to create and return the bind variable dictionary for attribute and value. The dictionary returned from this method must contain the following key-value pairs:
         * Key Corresponding Value BindVariableNameKey Name of the bind variable for attribute BindVariablePlaceHolderKey Placeholder string used in the SQL statement BindVariableAttributeKey attribute BindVariableValueKey value
         * An adaptor subclass may define additional entries as required by its RDBMS.
         * Invoked from sqlStringForValue when the message mustUseBindVariableForAttribute returns true or when the receiver's class uses bind variables and the message shouldUseBindVariableForAttribute returns true.
         * A subclass that uses bind variables should implement this method without invoking EOSQLExpression's implementation. The subclass implementation must return a dictionary with entries for the keys listed above and may add additional keys.
         */
        public com.webobjects.foundation.NSMutableDictionary bindVariableDictionaryForAttribute(com.webobjects.eoaccess.EOAttribute attribute, java.lang.Object value){
            return null; //TODO codavaj!!
        }

        public com.webobjects.foundation.NSMutableDictionary bindVariableDictionaryForInsertOrUpdateAttribute(com.webobjects.eoaccess.EOAttribute attribute, java.lang.Object value){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Generates an INSERT statement. It is done by performing the following steps: Invokes addInsertListAttribute for each entry in row to prepare the comma-separated list of attributes and the corresponding list of values. Invokes tableListWithRootEntity to get the table name. Invokes assembleInsertStatementWithRow.
         */
        public void prepareInsertExpressionWithRow(com.webobjects.foundation.NSDictionary nsdictionary){
            return; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Generates a SELECT statement. It is done by performing the following steps: Invokes addSelectListAttribute for each entry in attributes to prepare the comma-separated list of attributes. Use fetchSpec's qualifier to generate the receiver's whereClauseString}. Invokes addOrderByAttributeOrdering for each EOAttributeOrdering object in fetchSpec. First conjoins the qualifier in fetchSpec with the restricting qualifier, if any, of the receiver's entity. Invokes joinExpression to generate the receiver's joinClauseString. Invokes tableListWithRootEntity to get the comma-separated list of tables for the FROM clause. If flag lock is true, invokes lockClause to get the SQL string to lock selected rows. Invokes assembleSelectStatementWithAttributes.
         */
        public void prepareSelectExpressionWithAttributes(com.webobjects.foundation.NSArray attributes, boolean lock, com.webobjects.eocontrol.EOFetchSpecification fetchSpec){
            return; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Generates an UPDATE statement. It is done by performing the following steps: Invokes addUpdateListAttribute for each entry in row to prepare the comma-separated list of "attribute = value" assignments. Generates the receiver's whereClauseString using qualifer. Invokes tableListWithRootEntity to get the table name for the FROM clause. Invokes assembleUpdateStatementWithRow.
         */
        public void prepareUpdateExpressionWithRow(com.webobjects.foundation.NSDictionary row, com.webobjects.eocontrol.EOQualifier qualifier){
            return; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Returns the char used for the ESCAPE clause in an SQL LIKE expression. The default is backslash '\\'. A subclass should return (char)0 if the database doesn't support LIKE...ESCAPE...
         */
        public char sqlEscapeChar(){
            return ' '; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Overridden by subclasses to return a case insensitive comparison of valueString and keyString. For example, a subclass implementation might return the string "UPPER(keyString) LIKE UPPER(valueString)".
         */
        public java.lang.String sqlStringForCaseInsensitiveLike(java.lang.String valueString, java.lang.String keyString){
            return null; //TODO codavaj!!
        }

        public java.lang.String sqlStringForForInsertOrUpdateValue(java.lang.Object value, java.lang.String keyPath){
            return null; //TODO codavaj!!
        }

    }
    public static class OpenBaseSynchronizationFactory extends com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory{
        public OpenBaseSynchronizationFactory(com.webobjects.eoaccess.EOAdaptor adaptor){
             //TODO codavaj!!
        }

        protected com.webobjects.foundation.NSArray createIndexExpressionsForEntity(com.webobjects.eoaccess.EOEntity entity, com.webobjects.eoaccess.EOEntityIndex anIndex, com.webobjects.eoaccess.EOEntity masterEntity){
            return null; //TODO codavaj!!
        }

        protected java.lang.String createIndexStatementForEntity(com.webobjects.eoaccess.EOEntity entity, java.lang.String indexName, java.lang.String tableName, com.webobjects.foundation.NSArray attributeList){
            return null; //TODO codavaj!!
        }

        protected java.lang.String createIndexStatementForEntity(com.webobjects.eoaccess.EOEntity entity, java.lang.String indexName, java.lang.String tableName, java.lang.String attributeName){
            return null; //TODO codavaj!!
        }

        protected java.lang.String dropIndexStatementForEntity(com.webobjects.eoaccess.EOEntity entity, java.lang.String indexName, java.lang.String tableName){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns null. Can be overridden by subclasses to return an array of EOSQLExpression objects that define the SQL necessary to drop the primary key generation support for entityGroup.
         */
        public com.webobjects.foundation.NSArray dropPrimaryKeySupportStatementsForEntityGroup(com.webobjects.foundation.NSArray entityGroup){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Returns an array of EOSQLExpression objects that define the SQL necessary to drop the primary key generation support for all the entities in each of the the entity groups in entityGroups. Returns an empty array if entityGroups is null or empty. If primary key generation is not supported, returns an array that contains the string
         * The 'Drop Primary Key Support' option is unavailable.
         * This method invokes dropPrimaryKeySupportStatementsForEntityGroup for each entity group in entityGroups and returns an array of all the resulting EOSQLExpressions. Since the default implementation of dropPrimaryKeySupportStatementsForEntityGroup returns null, this method returns the not supported value (see above) by default, but a subclass need only override dropPrimaryKeySupportStatementsForEntityGroup in order to enable this method as well.
         */
        public com.webobjects.foundation.NSArray dropPrimaryKeySupportStatementsForEntityGroups(com.webobjects.foundation.NSArray entityGroups){
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
         * Description copied from class:
         * Formats the column name for insertion in a select statement. The default is to return the column name without quotes. Override this in the plugin for custom behavior.
         */
        protected java.lang.String formatColumnName(java.lang.String name){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Formats the table name for insertion in a select statement. The default is to return the table name without quotes. Override this in the plugin for custom behavior.
         */
        protected java.lang.String formatTableName(java.lang.String name){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Returns true if the name, precision, width, and scale of candidate are identical to the name, precision, width, and scale of columnType, false otherwise. If the columns are equivalent, the candidate column can be copied to columnType without casting.
         */
        public boolean isColumnTypeEquivalentToColumnType(com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes candidate, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes columnType, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
            return false; //TODO codavaj!!
        }

        protected boolean isSinglePrimaryKeyAttribute(com.webobjects.eoaccess.EOAttribute attribute){
            return false; //TODO codavaj!!
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
         * Description copied from class:
         * Returns an array of EOSQLExpression objects that define the SQL necessary to create the primary key constraints for entityGroup. Returns an empty array if any of the primary key attributes in entityGroup don't have a column name or if entityGroup is null.
         * This method creates a statement of the form:
         * ALTER TABLE TABLE_NAME ADD PRIMARY KEY (PRIMARY_KEY_COLUMN_NAMES)
         * where TABLE_NAME is the external name for the first entity in entityGroup and PRIMARY_KEY_COLUMN_NAMES is a comma-separated list of the column names of the first entity's primary key attributes. If the subclass's database server's primary key constraint semantics are different, the subclass should override this method.
         */
        public com.webobjects.foundation.NSArray primaryKeyConstraintStatementsForEntityGroup(com.webobjects.foundation.NSArray entityGroup){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns null. Can be overridden by subclasses to return an array of EOSQLExpression objects that define the SQL necessary to create the primary key generation support for entityGroup.
         */
        public com.webobjects.foundation.NSArray primaryKeySupportStatementsForEntityGroup(com.webobjects.foundation.NSArray entityGroup){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Returns an array of EOSQLExpression objects that define the SQL necessary to create the primary key generation support for all the entities in each of the the entity groups in entityGroups. Returns an empty array if entityGroups is null or empty. If primary key generation is not supported, returns an array that contains the string
         * The 'Create Primary Key Support' option is unavailable.
         * This method invokes primaryKeySupportStatementsForEntityGroup for each entity group in entityGroups and returns an array of all the resulting EOSQLExpressions. Since the default implementation of primaryKeySupportStatementsForEntityGroup returns null, this method returns the not supported value (see above) by default, but a subclass need only override primaryKeySupportStatementsForEntityGroup in order to enable this method as well.
         */
        public com.webobjects.foundation.NSArray primaryKeySupportStatementsForEntityGroups(com.webobjects.foundation.NSArray entityGroups){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns null. Can be overridden by subclasses to return an array of EOSQLExpressions to delete in place of the column indentifed by from the table identified by tableName. options is a dictionary describing the aspects of the schema for which to create SQL statements.
         */
        public com.webobjects.foundation.NSArray statementsToDeleteColumnNamed(java.lang.String columnName, java.lang.String tableName, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
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
         * Returns an array of EOSQLExpressions to implement primary key constraints for the table corresponding to entityGroups, which is an array containing arrays of EOEntity objects with the same external name. The changes dictionary identifies the changes to make to the database schema. The options dictionary describes the aspects of the schema for which to create SQL statements.
         */
        public com.webobjects.foundation.NSArray statementsToImplementPrimaryKeyConstraintsOnEntityGroups(com.webobjects.foundation.NSArray entityGroups, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationModelChanges changes, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Returns null by default. Can be overridden by subclasses to return an array of EOSQLExpressions to modify in place of the column identified by columnName in the table identified by tableName to either allow or not allow NULL values as specified by allowsNull. The options dictionary describes the aspects of the schema for which to create SQL statements.
         */
        public com.webobjects.foundation.NSArray statementsToModifyColumnNullRule(java.lang.String columnName, java.lang.String tableName, boolean allowsNull, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns null. Can be overridden by subclasses to return an array of EOSQLExpressions to rename the column indentifed by columnName in the table identified by tableName to newName. options is a dictionary describing the aspects of the schema for which to create SQL statements.
         */
        public com.webobjects.foundation.NSArray statementsToRenameColumnNamed(java.lang.String columnName, java.lang.String tableName, java.lang.String newName, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from interface:
         * Returns an array of EOSQLExpressions to rename in place the the table indentifed by tableName to newName. options is a dictionary describing the aspects of the schema for which to create SQL statements.
         */
        public com.webobjects.foundation.NSArray statementsToRenameTableNamed(java.lang.String tableName, java.lang.String newName, com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions options){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can change the type of an existing column in place.
         */
        public boolean supportsDirectColumnCoercion(){
            return false; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can delete columns.
         */
        public boolean supportsDirectColumnDeletion(){
            return false; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can add columns to a table.
         */
        public boolean supportsDirectColumnInsertion(){
            return false; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can modify the null rule of an existing column in place.
         */
        public boolean supportsDirectColumnNullRuleModification(){
            return false; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can rename columns in a table.
         */
        public boolean supportsDirectColumnRenaming(){
            return false; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can update the database schema to reflect changes in an EOModel.
         */
        public boolean supportsSchemaSynchronization(){
            return false; //TODO codavaj!!
        }

        /**
         * Description copied from class:
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

        public static class OpenBaseIndexDescription extends com.webobjects.eoaccess.synchronization.EOSchemaIndexDescription{
            public OpenBaseIndexDescription(){
                 //TODO codavaj!!
            }

            public void takeValuesFromResultSet(java.sql.ResultSet fetchResult){
                return; //TODO codavaj!!
            }

        }
        public static class OpenBaseTableDescription extends com.webobjects.eoaccess.synchronization.EOSchemaTableDescription{
            public OpenBaseTableDescription(){
                 //TODO codavaj!!
            }

            /**
             * Description copied from class:
             * Sets the name of this property
             */
            public void setName(java.lang.String value){
                return; //TODO codavaj!!
            }

            public void takeValuesFromResultSet(java.sql.ResultSet fetchResult){
                return; //TODO codavaj!!
            }

        }
        public static class OpenBaseColumnDescription extends com.webobjects.eoaccess.synchronization.EOSchemaColumnDescription{
            public OpenBaseColumnDescription(){
                 //TODO codavaj!!
            }

            public void takeValuesFromResultSet(java.sql.ResultSet fetchResult){
                return; //TODO codavaj!!
            }

        }
    }
}
