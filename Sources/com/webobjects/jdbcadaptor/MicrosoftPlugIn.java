package com.webobjects.jdbcadaptor;
public class MicrosoftPlugIn extends com.webobjects.jdbcadaptor.JDBCPlugIn{
    public MicrosoftPlugIn(com.webobjects.jdbcadaptor.JDBCAdaptor adaptor){
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
     * Returns true if exception is considered a "dropped" connection; otherwise false. The adaptor will try to reconnect automatically from a dropped connection. The decision is based on the SQLState of the underlying SQLException that is wrapped by the JDBCAdaptorException. For any other type of Exception, this method returns false.
     */
    public boolean isDroppedConnectionException(com.webobjects.jdbcadaptor.JDBCAdaptorException exception){
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
     * The statement for selecting the primary key for a given entity. Statement can be overridden in subclassers. By default return null. SELECT PK FROM EO_PK_TABLE WHERE NAME = 'MOVIE' FOR UPDATE
     */
    public java.lang.String newPrimaryKeySelectString(java.lang.String pkTableName, java.lang.String entityRootName){
        return null; //TODO codavaj!!
    }

    public static class MicrosoftExpression extends com.webobjects.jdbcadaptor.JDBCExpression{
        public MicrosoftExpression(com.webobjects.eoaccess.EOEntity entity){
             //TODO codavaj!!
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
         * Overridden by subclasses to return the SQL string used in a SELECT statement to lock selected rows. A concrete subclass of EOSQLExpression must override this method to return the string used by its adaptor's RDBMS.
         */
        public java.lang.String lockClause(){
            return null; //TODO codavaj!!
        }

    }
    public static class MicrosoftSynchronizationFactory extends com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory{
        public MicrosoftSynchronizationFactory(com.webobjects.eoaccess.EOAdaptor adaptor){
             //TODO codavaj!!
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
         * Description copied from class:
         * Returns an array of EOSQLExpression objects that define the SQL necessary to create the primary key generation support for all the entities in each of the the entity groups in entityGroups. Returns an empty array if entityGroups is null or empty. If primary key generation is not supported, returns an array that contains the string
         * The 'Create Primary Key Support' option is unavailable.
         * This method invokes primaryKeySupportStatementsForEntityGroup for each entity group in entityGroups and returns an array of all the resulting EOSQLExpressions. Since the default implementation of primaryKeySupportStatementsForEntityGroup returns null, this method returns the not supported value (see above) by default, but a subclass need only override primaryKeySupportStatementsForEntityGroup in order to enable this method as well.
         */
        public com.webobjects.foundation.NSArray primaryKeySupportStatementsForEntityGroups(com.webobjects.foundation.NSArray entityGroups){
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
         * The default implementation returns false. Can be overridden by subclasses to return true if the adaptor can update the database schema to reflect changes in an EOModel.
         */
        public boolean supportsSchemaSynchronization(){
            return false; //TODO codavaj!!
        }

    }
}
