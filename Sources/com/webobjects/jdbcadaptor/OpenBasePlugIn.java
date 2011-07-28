
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.eoaccess.synchronization.*;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.*;
import java.io.PrintStream;
import java.sql.*;
import java.util.Enumeration;


public class OpenBasePlugIn extends JDBCPlugIn {
    public static class OpenBaseSynchronizationFactory extends EOSchemaSynchronizationFactory {
        public static class OpenBaseIndexDescription extends EOSchemaIndexDescription {

            public OpenBaseIndexDescription() { return null; }

            public void takeValuesFromResultSet(ResultSet fetchResult) {}
        }

        public static class OpenBaseColumnDescription extends EOSchemaColumnDescription {

            public OpenBaseColumnDescription() { return null; }

            public void takeValuesFromResultSet(ResultSet fetchResult) {}
        }

        public static class OpenBaseTableDescription extends EOSchemaTableDescription {

            public OpenBaseTableDescription() { return null; }

            public void setName(String value) {}

            public void takeValuesFromResultSet(ResultSet fetchResult) {}
        }


        public OpenBaseSynchronizationFactory(EOAdaptor adaptor) { return null; }

        public NSArray dropPrimaryKeySupportStatementsForEntityGroups(NSArray entityGroups) { return null; }

        public NSArray foreignKeyConstraintStatementsForRelationship(EORelationship relationship) { return null; }

        public NSArray primaryKeySupportStatementsForEntityGroups(NSArray entityGroups) { return null; }

        public String _alterPhraseCoercingColumnsWithNames(NSArray columnNames, EOSchemaSynchronizationTableChanges updates, NSArray entityGroup, EOSchemaGenerationOptions options) { return null; }

        public String _alterPhraseDeletingColumnsWithNames(NSArray columnNames, NSArray entityGroup, EOSchemaGenerationOptions options) { return null; }

        public String _alterPhraseInsertionClausePrefixAtIndex(int columnIndex) { return null; }

        public String _alterPhraseJoinString() { return null; }

        protected String formatTableName(String name) { return null; }

        protected String formatColumnName(String name) { return null; }

        protected boolean isSinglePrimaryKeyAttribute(EOAttribute attribute) { return true; }

        public NSArray primaryKeyConstraintStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public boolean isColumnTypeEquivalentToColumnType(com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes candidate, com.webobjects.eoaccess.synchronization.EOSchemaSynchronization.ColumnTypes columnType, EOSchemaGenerationOptions options) { return true; }

        public NSArray statementsToDropForeignKeyConstraintsOnEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

        public NSArray statementsToDropPrimaryKeyConstraintsOnEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

        public NSArray statementsToImplementPrimaryKeyConstraintsOnEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

        protected NSArray createIndexExpressionsForEntity(EOEntity entity, EOEntityIndex anIndex, EOEntity masterEntity) { return null; }

        protected String createIndexStatementForEntity(EOEntity entity, String indexName, String tableName, NSArray attributeList) { return null; }

        protected String createIndexStatementForEntity(EOEntity entity, String indexName, String tableName, String attributeName) { return null; }

        protected String dropIndexStatementForEntity(EOEntity entity, String indexName, String tableName) { return null; }

        public NSArray statementsToModifyColumnNullRule(String columnName, String tableName, boolean allowsNull, EOSchemaGenerationOptions options) { return null; }

        public NSArray statementsToRenameColumnNamed(String columnName, String tableName, String newName, EOSchemaGenerationOptions options) { return null; }

        public NSArray statementsToRenameTableNamed(String tableName, String newName, EOSchemaGenerationOptions options) { return null; }

        public NSArray statementsToDeleteColumnNamed(String columnName, String tableName, EOSchemaGenerationOptions options) { return null; }

        public boolean supportsDirectColumnCoercion() { return true; }

        public boolean supportsDirectColumnDeletion() { return true; }

        public boolean supportsDirectColumnInsertion() { return true; }

        public boolean supportsDirectColumnNullRuleModification() { return true; }

        public boolean supportsDirectColumnRenaming() { return true; }

        public boolean supportsSchemaSynchronization() { return true; }

        public boolean supportsTableDescriptionIntrospection() { return true; }

        public EOSchemaTableDescription tableDescriptionForModel(String tableName, EOModel eomodel) { return null; }

        public NSArray primaryKeySupportStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public NSArray dropPrimaryKeySupportStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public EOSchemaSynchronizationColumnChanges objectStoreChangesFromAttributeToAttribute(EOAttribute schemaAttribute, EOAttribute modelAttribute) { return null; }
    }

    public static class OpenBaseExpression extends JDBCExpression {


        public OpenBaseExpression(EOEntity entity) { return null; }

        public char sqlEscapeChar() { return null; }

        public String sqlStringForCaseInsensitiveLike(String valueString, String keyString) { return null; }

        public String assembleSelectStatementWithAttributes(NSArray attributes, boolean lock, EOQualifier qualifier, NSArray fetchOrder, String selectString, String columnList, String tableList, 
                String whereClause, String joinClause, String orderByClause, String lockClause) { return null; }

        public String assembleJoinClause(String leftName, String rightName, int semantic) { return null; }

        public void prepareSelectExpressionWithAttributes(NSArray attributes, boolean lock, EOFetchSpecification fetchSpec) {}

        public void prepareInsertExpressionWithRow(NSDictionary nsdictionary) {}

        public String assembleInsertStatementWithRow(NSDictionary nsdictionary, String s, String s1, String s2) { return null; }

        public void prepareUpdateExpressionWithRow(NSDictionary row, EOQualifier qualifier) {}

        public String assembleUpdateStatementWithRow(NSDictionary nsdictionary, EOQualifier eoqualifier, String s, String s1, String s2) { return null; }

        public void addUpdateListAttribute(EOAttribute attribute, Object value) {}

        public String sqlStringForForInsertOrUpdateValue(Object value, String keyPath) { return null; }

        public NSMutableDictionary bindVariableDictionaryForInsertOrUpdateAttribute(EOAttribute attribute, Object value) { return null; }

        public NSMutableDictionary bindVariableDictionaryForAttribute(EOAttribute attribute, Object value) { return null; }

        private int _fetchLimit;

    }



    public NSArray newPrimaryKeys(int count, EOEntity entity, JDBCChannel adaptorChannel) { return null; }

    public OpenBasePlugIn(JDBCAdaptor adaptor) { return null; }

    public String name() { return null; }

    public String connectionURL() { return null; }

    public String defaultDriverName() { return null; }

    public String databaseProductName() { return null; }

    public Class defaultExpressionClass() { return null; }

    public EOSchemaSynchronizationFactory createSchemaSynchronizationFactory() { return null; }

    public boolean isPseudoColumnName(String columnName) { return true; }

    public NSDictionary jdbcInfo() { return null; }

    private static final String DriverClassName = "com.openbase.jdbc.ObDriver";
    private static final String DriverProductName = "OpenBase";

}
