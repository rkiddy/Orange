
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions;
import com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.*;
import java.sql.*;
import java.util.Iterator;
import java.util.Properties;
import oracle.sql.BLOB;


public class OraclePlugIn extends JDBCPlugIn {
    public static class OracleSynchronizationFactory extends EOSchemaSynchronizationFactory {


        public OracleSynchronizationFactory(EOAdaptor adaptor) { return null; }

        public NSArray dropTableStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public NSArray _statementsToDeleteTableNamedOptions(String tableName, EOSchemaGenerationOptions options) { return null; }

        public NSArray primaryKeySupportStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public NSArray dropPrimaryKeySupportStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public void appendExpressionToScript(EOSQLExpression expression, StringBuffer script) {}

        public NSArray createDatabaseStatementsForConnectionDictionary(NSDictionary connectionDictionary, NSDictionary administrativeConnectionDictionary) { return null; }

        public NSArray dropDatabaseStatementsForConnectionDictionary(NSDictionary connectionDictionary, NSDictionary administrativeConnectionDictionary) { return null; }

        public boolean supportsSchemaSynchronization() { return true; }

        public NSArray foreignKeyConstraintStatementsForRelationship(EORelationship relationship) { return null; }

        static  {}

        static String sequenceSetProc1;
        static String sequenceSetProc2;

    }

    public static class OracleExpression extends JDBCExpression {


        public OracleExpression(EOEntity entity) { return null; }

        boolean hasLOBsToUpdate() { return null; }

        NSArray blobList() { return null; }

        NSArray clobList() { return null; }

        EOQualifier qualifier() { return null; }

        private boolean isLOBAttribute(EOAttribute att) { return true; }

        private boolean isBLOBAttribute(EOAttribute att) { return true; }

        private boolean isCLOBAttribute(EOAttribute att) { return true; }

        public boolean shouldUseBindVariableForAttribute(EOAttribute att) { return true; }

        public boolean mustUseBindVariableForAttribute(EOAttribute att) { return true; }

        public String formatValueForAttribute(Object value, EOAttribute attribute) { return null; }

        public String sqlStringForKeyValueQualifier(EOKeyValueQualifier qualifier) { return null; }

        public String assembleUpdateStatementWithRow(NSDictionary row, EOQualifier qualifier, String tableList, String updateList, String whereClause) { return null; }

        public String assembleJoinClause(String leftName, String rightName, int semantic) { return null; }

        public void prepareConstraintStatementForRelationship(EORelationship relationship, NSArray sourceColumns, NSArray destinationColumns) {}

        NSMutableArray _blobList;
        NSMutableArray _clobList;
        EOQualifier _qualifier;

    }



    public OraclePlugIn(JDBCAdaptor adaptor) { return null; }

    public String name() { return null; }

    public Class defaultExpressionClass() { return null; }

    public EOSchemaSynchronizationFactory createSchemaSynchronizationFactory() { return null; }

    public String defaultDriverName() { return null; }

    public String databaseProductName() { return null; }

    public NSDictionary jdbcInfo() { return null; }

    public Properties connectionPropertiesForConnectionDictionary(NSDictionary connectionDictionary) { return null; }

    public int jdbcTypeForUnknownExternalType(String externalType, int precision, int scale) { return 0; }

    public void assignTypeForAttribute(EOAttribute attribute) {}

    public Object fetchBLOB(ResultSet rs, int column, EOAttribute attribute, boolean materialize) throws SQLException { return null; }

    public Object fetchCLOB(ResultSet rs, int column, EOAttribute attribute, boolean materialize) throws SQLException { return null; }

    EOQualifier primaryKeyQualifier(EOQualifier exprQualifier, EOEntity entity) { return null; }

    public void updateLOBs(JDBCChannel channel, JDBCExpression expression, NSDictionary row, EOEntity entity) {}

    public String wildcardPatternForAttributes() { return null; }

    public String wildcardPatternForTables() { return null; }

    public String wildcardPatternForSchema() { return null; }

    public String schemaNameForEntity(EOEntity entity) { return null; }

    public String sqlStatementForGettingProcedureNames() { return null; }

    public String storedProcedureCatalogPattern() { return null; }

    public String storedProcedureSchemaPattern() { return null; }

    public String sqlStatementForGettingTableNames() { return null; }

    public NSArray newPrimaryKeys(int count, EOEntity entity, JDBCChannel channel) { return null; }

    private NSDictionary _newPrimaryKey(EOEntity entity, JDBCChannel channel) { return null; }

    static  {}

    static final int OracleRefCursor = -10;
    static final String OracleRefCursorName = "REF CURSOR";
    static final String _oracleIncludeSynonyms;
    static final String _oracleWildcardPatternForAttributes;
    static final String _oracleWildcardPatternForTables;
    static final String _oracleWildcardPatternForSchema;
    static final String _oracleSqlStatementForGettingProcedureNames;
    static final String _oracleStoredProcedureCatalogPattern;
    static final String _oracleStoredProcedureSchemaPattern;
    static final String _oracleSqlStatementForGettingTableNames;

}
