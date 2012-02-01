package com.webobjects.jdbcadaptor;
/**
 * JDBCPlugIn is used to customize the JDBCAdaptor for a particular database and its JDBC driver. The JDBCPlugIn for a model can be specified in the model's connection dictionary. If it's left unspecified, the adaptor takes a guess.
 * See Also:JDBCPlugIn.plugInNameForURL(java.lang.String)
 */
public class JDBCPlugIn{
    protected static final java.lang.String DefaultPlugInClassName="com.webobjects.jdbcadaptor.JDBCPlugIn";

    protected static final java.lang.String DefaultPlugInSuffix="PlugIn";

    /**
     * Create a new JDBCPlugIn. Subclasses will typically just call super.
     */
    public JDBCPlugIn(com.webobjects.jdbcadaptor.JDBCAdaptor adaptor){
         //TODO codavaj!!
    }

    /**
     * Returns the JDBCAdaptor associated with this plugin.
     */
    public com.webobjects.jdbcadaptor.JDBCAdaptor adaptor(){
        return null; //TODO codavaj!!
    }

    /**
     * The adaptor invokes this method to allow the JDBCPlugIn to customize the newly created attribute. The default implementation does nothing.
     */
    public void assignTypeForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns true if the plugin has a private way of describing the stored procedure named spName when reverse engineering. The default implementation returns false indicating that the adaptor should use the normal JDBC API to reverse engineer the the stored procedure.
     */
    public boolean canDescribeStoredProcedure(java.lang.String spName){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a Properties object that should be used for setting up a connection environment. The default implementation asks the adaptor for the username and password.
     */
    public java.util.Properties connectionPropertiesForConnectionDictionary(com.webobjects.foundation.NSDictionary connectionDictionary){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the JDBC URL to use for connecting to the database. The default implementation gets the URL from the adaptor.
     */
    public java.lang.String connectionURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method is not used by the adaptor.
     */
    public com.webobjects.eoaccess.EOAttribute createAttributeForRow(com.webobjects.foundation.NSDictionary row){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new JDBCExpresionFactory using the plugin's response to adaptor(). Subclasses rarely need to override this.
     */
    public com.webobjects.eoaccess.EOSQLExpressionFactory createExpressionFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new EOSynchronizationFactory using the plugin's response to adaptor(). The default EOSynchronizationFactory supports only basic SQL table generation. Subclasses need to override this method to support schema synchronization.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory createSchemaSynchronizationFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Creates a new EOSynchronizationFactory using the plugin's response to adaptor(). The default EOSynchronizationFactory supports only basic SQL table generation. Subclasses need to override this method to support schema synchronization.
     */
    public com.webobjects.eoaccess.EOSynchronizationFactory createSynchronizationFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method is not used by the adaptor.
     */
    public com.webobjects.foundation.NSDictionary databaseInformation(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string identifying the database. Subclasses should override.
     */
    public java.lang.String databaseProductName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a fully qualified name of the JDBC driver class that this plugin prefers to use. The adaptor will attempt to load this class when making a connection. Subclasses should override.
     */
    public java.lang.String defaultDriverName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the Java Class to use as the expression class. The default is JDBCExpression. Subclasses will typically override to use their own subclass of JDBCExpression.
     */
    public java.lang.Class defaultExpressionClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the JDBCExpressionFactory, creating a new one if necessary.
     */
    public com.webobjects.eoaccess.EOSQLExpressionFactory expressionFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Fetch a BLOB. This supports a database-specific way of fetching a BLOB so plugin subclasses need to override the default, which simply returns null.
     */
    public java.lang.Object fetchBLOB(java.sql.ResultSet rs, int column, com.webobjects.eoaccess.EOAttribute attribute, boolean materialize) throws java.sql.SQLException{
        return null; //TODO codavaj!!
    }

    /**
     * Fetch a CLOB. This supports a database-specific way of fetching a CLOB so plugin subclasses need to override the default, which simply returns null.
     */
    public java.lang.Object fetchCLOB(java.sql.ResultSet rs, int column, com.webobjects.eoaccess.EOAttribute attribute, boolean materialize) throws java.sql.SQLException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if exception is considered a "dropped" connection; otherwise false. The adaptor will try to reconnect automatically from a dropped connection. The decision is based on the SQLState of the underlying SQLException that is wrapped by the JDBCAdaptorException. For any other type of Exception, this method returns false.
     */
    public boolean isDroppedConnectionException(com.webobjects.jdbcadaptor.JDBCAdaptorException exception){
        return false; //TODO codavaj!!
    }

    /**
     * Determines if the column is a "pseudo" column. A pseudo column is one that was not part of the CREATE TABLE statement, but was created automatically by the database. These columns usually should not be considered for reverse engineering.
     */
    public boolean isPseudoColumnName(java.lang.String columnName){
        return false; //TODO codavaj!!
    }

    /**
     * Returns database-specific information about the JDBC data source. Subclasses may want to return a modified copy of the dictionary returned by calling super.
     */
    public com.webobjects.foundation.NSDictionary jdbcInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a JDBC type that might be more useful than Types.OTHER. Some JDBC drivers return Types.OTHER for external types that actually match better to a well known type. This method provides the plugin a chance to substitute a better JDBC type when reverse engineering. The default implementation specifically recognizes BLOB and CLOB external types as mapping to Types.BLOB and Types.CLOB. If no better type is known, the method should return Types.OTHER.
     */
    public int jdbcTypeForUnknownExternalType(java.lang.String externalType, int precision, int scale){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the plugin's name. Subclasses of JDBCPlugIn need to override this method.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Generates a batch of new primary keys for entity. It should return an NSArray of NSDictionary where each dictionary corresponds to a unique primary key value. The count of the NSArray should match count. The JDBChannel channel is already open and ready to use. If the primary key contains multiple attributes or is not of kind number, then the default implementation returns null. The default implementation uses a table named according to primaryKeyTableName containing the table name and the last primary key inserted in this table. If the row for a table name is not present, then it is automatically created. If the primaryKeyTableName table does not exists then it is automatically created. Subclasses should override the default implementation if they want to provide a more efficient mechanism for generating primary keys.
     */
    public com.webobjects.foundation.NSArray newPrimaryKeys(int count, com.webobjects.eoaccess.EOEntity entity, com.webobjects.jdbcadaptor.JDBCChannel channel){
        return null; //TODO codavaj!!
    }

    /**
     * The statement for selecting the primary key for a given entity. Statement can be overridden in subclassers. By default return null. SELECT PK FROM EO_PK_TABLE WHERE NAME = 'MOVIE' FOR UPDATE
     */
    public java.lang.String newPrimaryKeySelectString(java.lang.String pkTableName, java.lang.String entityRootName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the class name of the JDBCPlugIn that should be used with the given JDBC URL url. The method considers the subprotocol of the url and looks for a match that was established by setPlugInNameForSubprotocol. If there is no match, it uses a default mapping of the form: "com.webobjects.jdbcadaptor.SubPlugIn", where Sub is replaced by the capitalized subprotocol string. For example, the URL "jdbc:oracle:thin:@myserver:1521:sid" maps to "com.webobjects.jdbcadaptor.OraclePlugIn". The default mapping can be overridden at start-up by the following Java Properties: jdbcadaptor.plugin.subprotocols - a colon-separated list of subprotocols that might have designated plugins jdbcadaptor.SUB.plugin - for a subprotocol SUB, the property defines the class name of the default plugin; SUB must be listed in jdbcadaptor.plugin.subprotocols The Properties file in the Resource directory of the JDBC Adaptor framework has some additional comments.
     */
    public static java.lang.String plugInNameForURL(java.lang.String url){
        return null; //TODO codavaj!!
    }

    /**
     * Allows the plugIn to influence the value seen by JDBCAdaptor.fetchedValueForValue. By default, it returns NSKeyValueCoding.NullValue if value is null; otherwise, value is returned unchanged.
     */
    public java.lang.Object plugInValueForValue(java.lang.Object value, com.webobjects.eoaccess.EOAttribute attribute){
        return null; //TODO codavaj!!
    }

    public java.lang.String primaryKeyLockString(java.lang.String pkTableName, java.lang.String entityRootName){
        return null; //TODO codavaj!!
    }

    /**
     * The statement for creating the primaryKeyTable can be overridden here. By default return null. CREATE TABLE (NAME CHAR(40), PK INTEGER)
     */
    public java.lang.String primaryKeyTableCreateString(java.lang.String pkTableName, com.webobjects.eoaccess.EOSQLExpression getRowExpr, com.webobjects.eoaccess.EOAttribute primAttribute){
        return null; //TODO codavaj!!
    }

    /**
     * Default returns "EO_PK_TABLE". Subclasses typically don't override this.
     */
    public java.lang.String primaryKeyTableName(){
        return null; //TODO codavaj!!
    }

    /**
     * Removes any special internal mapping associated with subprotocol that might have been used to guess a plugin an appropriate plugin.
     */
    public static void removePlugInNameForSubprotocol(java.lang.String subprotocol){
        return; //TODO codavaj!!
    }

    /**
     * Return the schema associated with entity. This is used as an argument to the JDBC method getColumns when reverse engineering. The default implementation gets the schema from the externalName of the entity.
     */
    public java.lang.String schemaNameForEntity(com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOSynchronizationFactory, creating a new one if necessary.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory schemaSynchronizationFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the internal mapping of subprotocol to pluginName for guessing which plugin to use. The subprotocol is the second term in a JDBC URL.
     */
    public static void setPlugInNameForSubprotocol(java.lang.String pluginName, java.lang.String subprotocol){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * The default implementation of this method returns null to indicate that the JDBC API should be used for reverse engineering stored procedures. Subclasses can implement a private scheme for reverse engineering stored procedures by returning a SQL statement to be used for fetching stored procedures names. The SQL statement should return a result set with one column named 'name'.
     */
    public java.lang.String sqlStatementForGettingProcedureNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns a SQL statement to be used for fetching a list of available tables during reverse engineering. The result set should have a single column, the table name. The default implementation returns null, which tells the adaptor to use the standard JDBC method getTables. Subclasses might override this method.
     */
    public java.lang.String sqlStatementForGettingTableNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method is not used by the adaptor.
     */
    public java.lang.String sqlStatementForTableNamed(java.lang.String tablename){
        return null; //TODO codavaj!!
    }

    /**
     * The standard reverse engineering implementation for stored procedures calls this method to get the catalog pattern used with the JDBC method getProcedures. The default implementation returns null.
     */
    public java.lang.String storedProcedureCatalogPattern(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * If canDescribeStoredProcedure returns true, this method is called to reverse engineer the stored procedure. The default implementation returns null. Most plugins do not need to override this.
     */
    public com.webobjects.eoaccess.EOStoredProcedure storedProcedureNamed(java.lang.String spName, com.webobjects.jdbcadaptor.JDBCChannel channel, com.webobjects.foundation.NSDictionary jdbcTypeDictionary){
        return null; //TODO codavaj!!
    }

    /**
     * The standard reverse engineering implementation for stored procedures calls this method to get the schema pattern used with the JDBC method getProcedures. The default implementation returns null.
     */
    public java.lang.String storedProcedureSchemaPattern(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the EOSynchronizationFactory, creating a new one if necessary.
     */
    public com.webobjects.eoaccess.EOSynchronizationFactory synchronizationFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Return an array of Strings to use for describing the table types in the JDBC getTables method call. This is used for reverse engineering. The default implementation returns {"TABLE", "VIEW", "ALIAS", "SYNONYM"}.
     */
    public java.lang.String[] tableTypes(){
        return null; //TODO codavaj!!
    }

    /**
     * Update LOBs (BLOBs and CLOBs). This supports a database-specific way of updating LOBs so plugin subclasses need to override the default, which does nothing. This method is called after a new row is inserted or after an existing row is updated. The plugin's JDBCExpression subclass will typically have to keep some extra bookkeeping information in order to implement this functionality.
     */
    public void updateLOBs(com.webobjects.jdbcadaptor.JDBCChannel channel, com.webobjects.jdbcadaptor.JDBCExpression expr, com.webobjects.foundation.NSDictionary row, com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    /**
     * Return the String to use for describing the column pattern in the JDBC getColumns method call. This is used for reverse engineering. The default implementation returns "%".
     */
    public java.lang.String wildcardPatternForAttributes(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the String to use for describing the schema pattern in the JDBC getTables method call. This is used for reverse engineering. The default implementation returns null.
     */
    public java.lang.String wildcardPatternForSchema(){
        return null; //TODO codavaj!!
    }

    /**
     * Return the String to use for describing the table pattern in the JDBC getTables method call. This is used for reverse engineering. The default implementation returns "%".
     */
    public java.lang.String wildcardPatternForTables(){
        return null; //TODO codavaj!!
    }

    protected static class LobEntry{
        public LobEntry(com.webobjects.eoaccess.EOAttribute attribute, java.lang.Object value){
             //TODO codavaj!!
        }

    }
}
