
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.eoaccess.synchronization.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.*;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.*;


public class FrontbasePlugIn extends JDBCPlugIn {
    public static class FrontbaseExpression extends JDBCExpression {


        public FrontbaseExpression(EOEntity eoentity) { return null; }

        public Class _synchronizationFactoryClass() { return null; }

        EOQualifier qualifier() { return null; }

        public String sqlStringForSelector(NSSelector qualifierOperator, Object value) { return null; }

        public String externalNameQuoteCharacter() { return null; }

        public String sqlStringForAttribute(EOAttribute attribute) { return null; }

        public String assembleSelectStatementWithAttributes(NSArray attributes, boolean lock, EOQualifier qualifier, NSArray fetchOrder, String selectString, String columnList, String tableList, 
                String whereClause, String joinClause, String orderByClause, String lockClause) { return null; }

        public void addOrderByAttributeOrdering(EOSortOrdering eosortordering) {}

        public String assembleDeleteStatementWithQualifier(EOQualifier eoqualifier, String table, String qualifier) { return null; }

        public String assembleInsertStatementWithRow(NSDictionary nsdictionary, String table, String columns, String values) { return null; }

        public String assembleUpdateStatementWithRow(NSDictionary dictionary, EOQualifier qualifier, String table, String values, String sqlQualifier) { return null; }

        public String lockClause() { return null; }

        public boolean useBindVariables() { return true; }

        public boolean shouldUseBindVariableForAttribute(EOAttribute eoattribute) { return true; }

        public boolean mustUseBindVariableForAttribute(EOAttribute eoattribute) { return true; }

        public String sqlStringForCaseInsensitiveLike(String value, String column) { return null; }

        boolean hasLOBsToUpdate() { return null; }

        void resetlobList() { return null; }

        NSArray lobList() { return null; }

        public String sqlStringForKeyValueQualifier(EOKeyValueQualifier eokeyvaluequalifier) { return null; }

        public String formatValueForAttribute(Object obj, EOAttribute eoattribute) { return null; }

        String addEscapeChars(String value) { return null; }

        String formatBit(NSData data) { return null; }

        private String getTimeZone(TimeZone tz) { return null; }

        EOQualifier _qualifier;
        NSMutableArray _lobList;

    }

    public static class FrontbaseSynchronizationFactory extends EOSchemaSynchronizationFactory {
        public static class FrontbaseIndexDescription extends EOSchemaIndexDescription {

            public FrontbaseIndexDescription() { return null; }

            public void takeValuesFromDictionary(NSDictionary fetchResult) {}
        }

        public static class FrontbaseColumnDescription extends EOSchemaColumnDescription {

            public FrontbaseColumnDescription() { return null; }

            public void takeValuesFromDictionary(NSDictionary fetchResult) {}
        }

        public static class FrontbaseTableDescription extends EOSchemaTableDescription {

            public FrontbaseTableDescription() { return null; }

            public void takeValuesFromDictionary(NSDictionary fetchResult) {}
        }


        public FrontbaseSynchronizationFactory(EOAdaptor eoadaptor) { return null; }

        public boolean supportsSchemaSynchronization() { return true; }

        public static boolean boolValueForKeyDefault(NSDictionary nsdictionary, String s, boolean flag) { return null; }

        public NSArray schemaCreationStatementsForEntities(NSArray entities, EOSchemaGenerationOptions options) { return null; }

        public NSArray dropPrimaryKeySupportStatementsForEntityGroups(NSArray entityGroups) { return null; }

        public NSArray dropDatabaseStatementsForConnectionDictionary(NSDictionary connectionDictionary, NSDictionary administrativeConnectionDictionary) { return null; }

        public NSArray createDatabaseStatementsForConnectionDictionary(NSDictionary connectionDictionary, NSDictionary administrativeConnectionDictionary) { return null; }

        public NSArray dropTableStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public NSArray primaryKeySupportStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public NSArray foreignKeyConstraintStatementsForRelationship(EORelationship relationship) { return null; }

        public NSArray createTableStatementsForEntityGroups(NSArray entityGroups) { return null; }

        public NSArray createTableStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public StringBuffer addCreateClauseForAttribute(EOAttribute eoattribute) { return null; }

        public String columnTypeStringForAttribute(EOAttribute eoattribute) { return null; }

        boolean isPrimaryKeyAttributes(EOEntity entity, NSArray attributes) { return null; }

        public NSArray primaryKeyConstraintStatementsForEntityGroups(NSArray entityGroups) { return null; }

        public NSArray primaryKeyConstraintStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public boolean supportsTableDescriptionIntrospection() { return true; }

        public EOSchemaTableDescription tableDescriptionForModel(String tableName, EOModel eomodel) { return null; }

        public NSDictionary fetchTableDescriptionForModel(String tableName, EOModel eomodel) { return null; }

        public NSArray statementsToDropPrimaryKeyConstraintsOnEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

        public boolean supportsDirectColumnCoercion() { return true; }

        public boolean supportsDirectColumnDeletion() { return true; }

        public boolean supportsDirectColumnInsertion() { return true; }

        public boolean supportsDirectColumnRenaming() { return true; }

        public boolean supportsDirectColumnNullRuleModification() { return true; }

        public NSArray statementsToModifyColumnNullRule(String columnName, String tableName, boolean allowsNull, EOSchemaGenerationOptions options) { return null; }

        public NSArray statementsToRenameColumnNamed(String columnName, String tableName, String newName, EOSchemaGenerationOptions options) { return null; }

        public NSArray statementsToConvertColumnType(String columnName, String tableName, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes type, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes newType, EOSchemaGenerationOptions options) { return null; }

        protected String statementToCreateDataTypeClause(com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes columntypes) { return null; }
    }



    public FrontbasePlugIn(JDBCAdaptor jdbcadaptor) { return null; }

    public String name() { return null; }

    public static String getPlugInVersion() { return null; }

    public boolean canDescribeStoredProcedure(String s) { return true; }

    public EOSchemaSynchronizationFactory createSchemaSynchronizationFactory() { return null; }

    public String defaultDriverName() { return null; }

    public String databaseProductName() { return null; }

    public Class defaultExpressionClass() { return null; }

    public String wildcardPatternForSchema() { return null; }

    public String schemaNameForEntity(EOEntity eoentity) { return null; }

    public String storedProcedureSchemaPattern() { return null; }

    public Properties connectionPropertiesForConnectionDictionary(NSDictionary connectionDictionary) { return null; }

    public NSDictionary jdbcInfo() { return null; }

    EOQualifier primaryKeyQualifier(EOQualifier eoqualifier, EOEntity eoentity) { return null; }

    public void updateLOBs(JDBCChannel channel, JDBCExpression expression, NSDictionary dictionary, EOEntity entity) {}

    String getLobHandle(Connection con, Object attribute, Object value) throws SQLException { return null; }

    public Object fetchBLOB(ResultSet resultset, int i, EOAttribute attribute, boolean flag) throws SQLException { return null; }

    public Object fetchCLOB(ResultSet resultset, int i, EOAttribute attribute, boolean flag) throws SQLException { return null; }

    public NSArray newPrimaryKeys(int numberOfKeys, EOEntity eoentity, JDBCChannel jdbcchannel) { return null; }

    private boolean _newPrimaryKeys(int keyBatchSize, EOEntity eoentity, JDBCChannel jdbcchannel, NSMutableArray pkDicts) { return true; }

    protected static String quoteTableName(String s) { return null; }

    protected static int internalTypeForExternal(String externalType) { return null; }

    static  {}

    static final String _frontbaseIncludeSynonyms;
    static final String _frontbaseWildcardPatternForAttributes;
    static final String _frontbaseWildcardPatternForTables;
    static final String _frontbaseWildcardPatternForSchema;
    static final String _frontbaseSqlStatementForGettingProcedureNames;
    static final String _frontbaseStoredProcedureCatalogPattern;
    static final String _frontbaseStoredProcedureSchemaPattern;
    static final String _frontbaseSqlStatementForGettingTableNames;
    protected static final int FB_Boolean = 1;
    protected static final int FB_Integer = 2;
    protected static final int FB_SmallInteger = 3;
    protected static final int FB_Float = 4;
    protected static final int FB_Real = 5;
    protected static final int FB_Double = 6;
    protected static final int FB_Numeric = 7;
    protected static final int FB_Decimal = 8;
    protected static final int FB_Character = 9;
    protected static final int FB_VCharacter = 10;
    protected static final int FB_Bit = 11;
    protected static final int FB_VBit = 12;
    protected static final int FB_Date = 13;
    protected static final int FB_Time = 14;
    protected static final int FB_TimeTZ = 15;
    protected static final int FB_Timestamp = 16;
    protected static final int FB_TimestampTZ = 17;
    protected static final int FB_YearMonth = 18;
    protected static final int FB_DayTime = 19;
    protected static final int FB_CLOB = 20;
    protected static final int FB_BLOB = 21;
    protected static final int FB_TinyInteger = 22;
    protected static final int FB_LongInteger = 23;

}
