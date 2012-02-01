package com.webobjects.jdbcadaptor;
public class OraclePlugIn extends com.webobjects.jdbcadaptor.JDBCPlugIn{
    public OraclePlugIn(com.webobjects.jdbcadaptor.JDBCAdaptor adaptor){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * The adaptor invokes this method to allow the JDBCPlugIn to customize the newly created attribute. The default implementation does nothing.
     */
    public void assignTypeForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns a Properties object that should be used for setting up a connection environment. The default implementation asks the adaptor for the username and password.
     */
    public java.util.Properties connectionPropertiesForConnectionDictionary(com.webobjects.foundation.NSDictionary connectionDictionary){
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
     * Fetch a BLOB. This supports a database-specific way of fetching a BLOB so plugin subclasses need to override the default, which simply returns null.
     */
    public java.lang.Object fetchBLOB(java.sql.ResultSet rs, int column, com.webobjects.eoaccess.EOAttribute attribute, boolean materialize) throws java.sql.SQLException{
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Fetch a CLOB. This supports a database-specific way of fetching a CLOB so plugin subclasses need to override the default, which simply returns null.
     */
    public java.lang.Object fetchCLOB(java.sql.ResultSet rs, int column, com.webobjects.eoaccess.EOAttribute attribute, boolean materialize) throws java.sql.SQLException{
        return null; //TODO codavaj!!
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
     * Returns a JDBC type that might be more useful than Types.OTHER. Some JDBC drivers return Types.OTHER for external types that actually match better to a well known type. This method provides the plugin a chance to substitute a better JDBC type when reverse engineering. The default implementation specifically recognizes BLOB and CLOB external types as mapping to Types.BLOB and Types.CLOB. If no better type is known, the method should return Types.OTHER.
     */
    public int jdbcTypeForUnknownExternalType(java.lang.String externalType, int precision, int scale){
        return 0; //TODO codavaj!!
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
    public com.webobjects.foundation.NSArray newPrimaryKeys(int count, com.webobjects.eoaccess.EOEntity entity, com.webobjects.jdbcadaptor.JDBCChannel channel){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Return the schema associated with entity. This is used as an argument to the JDBC method getColumns when reverse engineering. The default implementation gets the schema from the externalName of the entity.
     */
    public java.lang.String schemaNameForEntity(com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * The default implementation of this method returns null to indicate that the JDBC API should be used for reverse engineering stored procedures. Subclasses can implement a private scheme for reverse engineering stored procedures by returning a SQL statement to be used for fetching stored procedures names. The SQL statement should return a result set with one column named 'name'.
     */
    public java.lang.String sqlStatementForGettingProcedureNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns a SQL statement to be used for fetching a list of available tables during reverse engineering. The result set should have a single column, the table name. The default implementation returns null, which tells the adaptor to use the standard JDBC method getTables. Subclasses might override this method.
     */
    public java.lang.String sqlStatementForGettingTableNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * The standard reverse engineering implementation for stored procedures calls this method to get the catalog pattern used with the JDBC method getProcedures. The default implementation returns null.
     */
    public java.lang.String storedProcedureCatalogPattern(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * The standard reverse engineering implementation for stored procedures calls this method to get the schema pattern used with the JDBC method getProcedures. The default implementation returns null.
     */
    public java.lang.String storedProcedureSchemaPattern(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Update LOBs (BLOBs and CLOBs). This supports a database-specific way of updating LOBs so plugin subclasses need to override the default, which does nothing. This method is called after a new row is inserted or after an existing row is updated. The plugin's JDBCExpression subclass will typically have to keep some extra bookkeeping information in order to implement this functionality.
     */
    public void updateLOBs(com.webobjects.jdbcadaptor.JDBCChannel channel, com.webobjects.jdbcadaptor.JDBCExpression expression, com.webobjects.foundation.NSDictionary row, com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Return the String to use for describing the column pattern in the JDBC getColumns method call. This is used for reverse engineering. The default implementation returns "%".
     */
    public java.lang.String wildcardPatternForAttributes(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Return the String to use for describing the schema pattern in the JDBC getTables method call. This is used for reverse engineering. The default implementation returns null.
     */
    public java.lang.String wildcardPatternForSchema(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Return the String to use for describing the table pattern in the JDBC getTables method call. This is used for reverse engineering. The default implementation returns "%".
     */
    public java.lang.String wildcardPatternForTables(){
        return null; //TODO codavaj!!
    }

    public static class OracleSynchronizationFactory extends com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory{
        public OracleSynchronizationFactory(com.webobjects.eoaccess.EOAdaptor adaptor){
             //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Appends expression's statement to script along with any necessary delimiter. script is the StringBuffer in which the SQL script is built. Used in conjunction with schemaCreationStatementsForEntities and schemaCreationScriptForEntities to build up the SQL script to generate the specified schema for a set of EOEntities.
         * This method appends the SQL statement for expression to script followed by a semicolon and a newline. A subclass of EOSQLExpression only need to override this method if the delimiter for its database server is different.
         */
        public void appendExpressionToScript(com.webobjects.eoaccess.EOSQLExpression expression, java.lang.StringBuffer script){
            return; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns null. Can be overridden by subclasses to generate and return an array of EOSQLExpressions defining the SQL statements to create a database or user that can be accessed by the provided connectionDictionary and administrativeConnectionDictionary.
         */
        public com.webobjects.foundation.NSArray createDatabaseStatementsForConnectionDictionary(com.webobjects.foundation.NSDictionary connectionDictionary, com.webobjects.foundation.NSDictionary administrativeConnectionDictionary){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * The default implementation returns null. Can be overridden by subclasses to generate and return an array of EOSQLExpressions defining the SQL statements to drop a database or user that is accessed by the provided connectionDictionary and administrativeConnectionDictionary.
         */
        public com.webobjects.foundation.NSArray dropDatabaseStatementsForConnectionDictionary(com.webobjects.foundation.NSDictionary connectionDictionary, com.webobjects.foundation.NSDictionary administrativeConnectionDictionary){
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
         * Description copied from interface:
         * Returns an array of EOSQLExpression objects that define the SQL statements necessary to create foreign key constraints for relationship. Returns an empty array if unable to generate foreign key constraints for relationship
         */
        public com.webobjects.foundation.NSArray foreignKeyConstraintStatementsForRelationship(com.webobjects.eoaccess.EORelationship relationship){
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
         * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can update the database schema to reflect changes in an EOModel.
         */
        public boolean supportsSchemaSynchronization(){
            return false; //TODO codavaj!!
        }

    }
    public static class OracleExpression extends com.webobjects.jdbcadaptor.JDBCExpression{
        public OracleExpression(com.webobjects.eoaccess.EOEntity entity){
             //TODO codavaj!!
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
         * This method is invoked from prepareUpdateExpressionWithRow to return an SQL UPDATE statement. The statement is of the form: UPDATE tableList SET updateList WHERE whereClause row and qualifier are the arguments to prepareUpdateExpressionWithRow from which updateList and whereClause were derived. They are provided for subclasses that need to generate the clauses of the UPDATE statement in a particular way.
         */
        public java.lang.String assembleUpdateStatementWithRow(com.webobjects.foundation.NSDictionary row, com.webobjects.eocontrol.EOQualifier qualifier, java.lang.String tableList, java.lang.String updateList, java.lang.String whereClause){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * This method should be overridden by subclasses to return a string representation of value suitable for use in an SQL statement, depending on attribute's externalType. For example, a subclass might format a date using a special database-specific syntax or standard form or truncate numbers to attribute's precision and scale. EOSQLExpression's implementation merely returns the string representation of value.
         */
        public java.lang.String formatValueForAttribute(java.lang.Object value, com.webobjects.eoaccess.EOAttribute attribute){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Returns true if the receiver must use bind variables for attribute, false otherwise. EOSQLExpression's implementation returns false. An SQL expression subclass that uses bind variables should override this method to return true if the underlying RDBMS requires that bind variables be used for attributes with attribute's external type.
         */
        public boolean mustUseBindVariableForAttribute(com.webobjects.eoaccess.EOAttribute att){
            return false; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Sets the receiver's statement to an adaptor specific constraint for relationship. EOSQLExpression's implementation generates statements of the form: ALTER TABLE TABLE_NAME ADD CONSTRAINT CONSTRAINT_NAME FOREIGN KEY (SOURCE_KEY_LIST) REFERENCES DESTINATION_TABLE_NAME (DESTINATION_KEY_LIST) Where TABLE_NAME is the external name of the receiver's entity. CONSTRAINT_NAME is the external name of the receiver's entity, relationship's name, and the string "FK", concatenated with underbars between them (EMPLOYEE_MANAGER_FK, for example), SOURCE_KEY_LIST is a comma-separated list of the source columns in sourceColumns. DESTINATION_TABLE_NAME is the external name of relationship's destination entity. DESTINATION_KEY_LIST is a comma-separated list of the destination columns in destinationColumns
         */
        public void prepareConstraintStatementForRelationship(com.webobjects.eoaccess.EORelationship relationship, com.webobjects.foundation.NSArray sourceColumns, com.webobjects.foundation.NSArray destinationColumns){
            return; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Returns true if the receiver can provide a bind variable dictionary for attribute, false otherwise. Bind variables aren't used for values associated with this attribute when useBindVariables returns false. EOSQLExpression's implementation returns false. An SQL expression subclass should override this method to return true if the receiver should use bind variables for attributes with attribute's external type. It should also return true for any attribute for which the receiver must use bind variables.
         */
        public boolean shouldUseBindVariableForAttribute(com.webobjects.eoaccess.EOAttribute att){
            return false; //TODO codavaj!!
        }

        /**
         * Description copied from class:
         * Creates and returns a SQL string that is the result of interposing an operator between the SQL strings for qualifier's key and value. Determines the SQL operator by invoking sqlStringForSelector with qualifier's selector and value. Generates an SQL string for qualifier's key by invoking sqlStringForAttributeNamed to get an SQL string and formatSQLString with the corresponding attribute's "read" format. Similarly, generates an SQL string for qualifier's value by invoking sqlStringForValue to get an SQL string and formatValueForAttribute to format it. (First invokes sqlPatternFromShellPattern for the value if qualifier's selector is EOQualifier.QualifierOperatorLike.)
         */
        public java.lang.String sqlStringForKeyValueQualifier(com.webobjects.eocontrol.EOKeyValueQualifier qualifier){
            return null; //TODO codavaj!!
        }

    }
}
