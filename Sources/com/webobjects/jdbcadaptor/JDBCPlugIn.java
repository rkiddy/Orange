
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory;
import com.webobjects.foundation.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class JDBCPlugIn {
    protected static class LobEntry {


        public LobEntry(EOAttribute attribute, Object value) { return null; }

        String name() { return null; }

        EOAttribute attribute() { return null; }

        Object value() { return null; }

        EOAttribute _attribute;
        Object _value;

    }



    public JDBCPlugIn(JDBCAdaptor adaptor) { return null; }

    public JDBCAdaptor adaptor() { return null; }

    public String name() { return null; }

    public String connectionURL() { return null; }

    public Properties connectionPropertiesForConnectionDictionary(NSDictionary connectionDictionary) { return null; }

    private static String _urlSubprotocol(String url) { return null; }

    public static void setPlugInNameForSubprotocol(String pluginName, String subprotocol) { return null; }

    public static void removePlugInNameForSubprotocol(String subprotocol) { return null; }

    public static String plugInNameForURL(String url) { return null; }

    public String databaseProductName() { return null; }

    public String defaultDriverName() { return null; }

    /**
     * @deprecated Method databaseInformation is deprecated
     */

    public NSDictionary databaseInformation() { return null; }

    public Class defaultExpressionClass() { return null; }

    public EOSQLExpressionFactory createExpressionFactory() { return null; }

    public EOSQLExpressionFactory expressionFactory() { return null; }

    public EOSchemaSynchronizationFactory createSchemaSynchronizationFactory() { return null; }

    public EOSchemaSynchronizationFactory schemaSynchronizationFactory() { return null; }

    /**
     * @deprecated Method createSynchronizationFactory is deprecated
     */

    public EOSynchronizationFactory createSynchronizationFactory() { return null; }

    /**
     * @deprecated Method synchronizationFactory is deprecated
     */

    public EOSynchronizationFactory synchronizationFactory() { return null; }

    public String primaryKeyTableName() { return null; }

    public String wildcardPatternForAttributes() { return null; }

    public String wildcardPatternForTables() { return null; }

    public String wildcardPatternForSchema() { return null; }

    public String schemaNameForEntity(EOEntity entity) { return null; }

    String _tableNameForEntity(EOEntity entity) { return null; }

    public String[] tableTypes() { return null; }

    /**
     * @deprecated Method sqlStatementForGettingTableNames is deprecated
     */

    public String sqlStatementForGettingTableNames() { return null; }

    /**
     * @deprecated Method canDescribeStoredProcedure is deprecated
     */

    public boolean canDescribeStoredProcedure(String spName) { return true; }

    /**
     * @deprecated Method storedProcedureNamed is deprecated
     */

    public EOStoredProcedure storedProcedureNamed(String spName, JDBCChannel channel, NSDictionary jdbcTypeDictionary) { return null; }

    /**
     * @deprecated Method sqlStatementForGettingProcedureNames is deprecated
     */

    public String sqlStatementForGettingProcedureNames() { return null; }

    public String storedProcedureCatalogPattern() { return null; }

    public String storedProcedureSchemaPattern() { return null; }

    /**
     * @deprecated Method sqlStatementForTableNamed is deprecated
     */

    public String sqlStatementForTableNamed(String tablename) { return null; }

    /**
     * @deprecated Method createAttributeForRow is deprecated
     */

    public EOAttribute createAttributeForRow(NSDictionary row) { return null; }

    EOEntity _rootParent(EOEntity entity) { return null; }

    public String newPrimaryKeySelectString(String pkTableName, String entityRootName) { return null; }

    public String primaryKeyLockString(String pkTableName, String entityRootName) { return null; }

    public String primaryKeyTableCreateString(String pkTableName, EOSQLExpression getRowExpr, EOAttribute primAttribute) { return null; }

    public NSArray newPrimaryKeys(int count, EOEntity entity, JDBCChannel channel) { return null; }

    public boolean _couldIgnoreException(SQLException e) { return true; }

    public Object fetchBLOB(ResultSet rs, int column, EOAttribute attribute, boolean flag) throws SQLException { return null; }

    public Object fetchCLOB(ResultSet rs, int column, EOAttribute attribute, boolean flag) throws SQLException { return null; }

    public void updateLOBs(JDBCChannel jdbcchannel, JDBCExpression jdbcexpression, NSDictionary nsdictionary, EOEntity eoentity) {}

    public NSDictionary jdbcInfo() { return null; }

    public int jdbcTypeForUnknownExternalType(String externalType, int precision, int scale) { return 0; }

    public void assignTypeForAttribute(EOAttribute eoattribute) {}

    public boolean isPseudoColumnName(String columnName) { return true; }

    public boolean isDroppedConnectionException(JDBCAdaptorException exception) { return true; }

    public Object plugInValueForValue(Object value, EOAttribute attribute) { return null; }

    protected static EOAttribute _attributeForPath(EOEntity entity, String path) { return null; }

    protected static EORelationship _relationshipForPath(EOEntity entity, String path) { return null; }

    protected static void _takeValueForKeyPath(NSMutableDictionary dict, Object value, String mainKey, String subKey) { return null; }

    static  {}

    protected JDBCAdaptor _adaptor;
    protected Class _expressionClass;
    protected EOSQLExpressionFactory _expressionFactory;
    protected EOSchemaSynchronizationFactory _syncFactory;
    protected static NSMutableDictionary _subprotocolRegistry;
    protected String _pkTableName;
    static final String DefaultPlugInPackagePrefix = "com.webobjects.jdbcadaptor.";
    protected static final String DefaultPlugInSuffix = "PlugIn";
    protected static final String DefaultPlugInClassName = "com.webobjects.jdbcadaptor.JDBCPlugIn";
    static final String _defaultTableTypes[];

}
