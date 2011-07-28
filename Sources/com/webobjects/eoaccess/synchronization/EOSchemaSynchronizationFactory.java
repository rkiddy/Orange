
package com.webobjects.eoaccess.synchronization;

import com.webobjects.eoaccess.*;
import com.webobjects.foundation.*;
import java.util.Iterator;
import java.util.Set;


public class EOSchemaSynchronizationFactory
    implements EOSchemaGeneration, EOSchemaSynchronization {
    public static interface Delegate {

        public abstract boolean allowsNullForColumnNamed(String s, String s1);

        public abstract boolean isSchemaTableNamed(String s);

        public abstract EOAdaptor schemaSynchronizationAdaptor();

        public abstract EOAdaptorChannel schemaSynchronizationAdaptorChannelForModel(EOModel eomodel);

        public abstract void schemaSynchronizationStatementsWillCopyTableNamed(NSArray nsarray, String s);

        public abstract void schemaSynchronizationStatementsWillDeleteTableNamed(NSArray nsarray, String s);
    }

    class _EOExternalType
        implements EOSchemaSynchronization.ColumnTypes {


        public String toString() { return null; }

        public _EOExternalType(String name, int precision, int scale, int width) { return null; }

        public String name() { return null; }

        public int precision() { return 0; }

        public int scale() { return 0; }

        public int width() { return 0; }

        protected String _name;
        protected int _precision;
        protected int _scale;
        protected int _width;
        final EOSchemaSynchronizationFactory this$0;

    }

    static class _EOSQLComment extends EOSQLExpression {


        public _EOSQLComment(String comment) { return null; }

        public String toString() { return null; }

        public String statement() { return null; }

        public NSMutableDictionary bindVariableDictionaryForAttribute(EOAttribute attribute, Object value) { return null; }

        protected String _comment;

    }



    public EOSchemaSynchronizationFactory(EOAdaptor adaptor) { return null; }

    private EOSchemaSynchronizationFactory() { return null; }

    public void setSchemaGenerationDelegate(EOSchemaGeneration.Delegate delegate) {}

    public EOSchemaGeneration.Delegate schemaGenerationDelegate() { return null; }

    public EOAdaptor adaptor() { return null; }

    public EOSchemaGenerationOptions newOptions() { return null; }

    public EOSchemaSynchronizationModelChanges newChanges() { return null; }

    protected String formatTableName(String name) { return null; }

    protected String formatColumnName(String name) { return null; }

    public NSArray foreignKeyConstraintStatementsForRelationship(EORelationship relationship) { return null; }

    public NSArray createTableStatementsForEntityGroup(NSArray entityGroup) { return null; }

    public NSArray dropTableStatementsForEntityGroup(NSArray entityGroup) { return null; }

    public NSArray primaryKeyConstraintStatementsForEntityGroup(NSArray entityGroup) { return null; }

    public NSArray primaryKeySupportStatementsForEntityGroup(NSArray entityGroup) { return null; }

    public NSArray dropPrimaryKeySupportStatementsForEntityGroup(NSArray entityGroup) { return null; }

    public NSArray createTableStatementsForEntityGroups(NSArray entityGroups) { return null; }

    public NSArray dropTableStatementsForEntityGroups(NSArray entityGroups) { return null; }

    public NSArray primaryKeyConstraintStatementsForEntityGroups(NSArray entityGroups) { return null; }

    public NSArray primaryKeySupportStatementsForEntityGroups(NSArray entityGroups) { return null; }

    public NSArray dropPrimaryKeySupportStatementsForEntityGroups(NSArray entityGroups) { return null; }

    public void appendExpressionToScript(EOSQLExpression expression, StringBuffer script) {}

    public String schemaCreationScriptForEntities(NSArray allEntities, EOSchemaGenerationOptions options) { return null; }

    public NSArray tableEntityGroupsForEntities(NSArray entities) { return null; }

    public NSArray primaryKeyEntityGroupsForEntities(NSArray entities) { return null; }

    public NSArray schemaCreationStatementsForEntities(NSArray allEntities, EOSchemaGenerationOptions options) { return null; }

    public NSArray _foreignKeyConstraintStatementsForEntityGroup(NSArray entityGroup) { return null; }

    public NSArray createDatabaseStatementsForConnectionDictionary(NSDictionary connectionDictionary, NSDictionary administrativeConnectionDictionary) { return null; }

    public NSArray dropDatabaseStatementsForConnectionDictionary(NSDictionary connectionDictionary, NSDictionary administrativeConnectionDictionary) { return null; }

    public EOSQLExpression _expressionForString(String string) { return null; }

    public EOSQLExpression _expressionForEntity(EOEntity entity) { return null; }

    public boolean _allowsNullForColumnNamed(String columnName, String tableName) { return true; }

    public String _alterPhraseCoercingColumnsWithNames(NSArray columnNames, EOSchemaSynchronizationTableChanges updates, NSArray entityGroup, EOSchemaGenerationOptions eoschemagenerationoptions) { return null; }

    public String _alterPhraseDeletingColumnsWithNames(NSArray columnNames, NSArray entityGroup, EOSchemaGenerationOptions options) { return null; }

    public String _alterPhraseInsertingColumnsWithNames(NSArray columnNames, NSArray entityGroup, EOSchemaGenerationOptions options) { return null; }

    public String _alterPhraseInsertionClausePrefixAtIndex(int clauseIndex) { return null; }

    public String _alterPhraseJoinString() { return null; }

    public boolean _arePurelyForeignKeyConstraintRelatedChanges(EOSchemaSynchronizationTableChanges changes) { return true; }

    public NSArray _columnAttributesInEntityGroup(NSArray entityGroup) { return null; }

    public EOSchemaSynchronization.ColumnTypes _columnTypeNamedWithPrecisionScaleAndWidth(String name, int precision, int scale, int width) { return null; }

    public Object _directCoercionsForEntityGroupInTable(NSArray entityGroup, String tableName, EOSchemaSynchronizationTableChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray _entityGroupsInModelReferringToTableNamed(EOModel model, String tableName) { return null; }

    public EOAttribute attributeInEntityWithColumnName(EOEntity entity, String columnName) { return null; }

    public boolean isCaseSensitive() { return true; }

    public boolean isColumnTypeEquivalentToColumnType(EOSchemaSynchronization.ColumnTypes candidate, EOSchemaSynchronization.ColumnTypes columnType, EOSchemaGenerationOptions options) { return true; }

    public boolean _isPoorlyFormedColumnType(EOSchemaSynchronization.ColumnTypes columnType) { return true; }

    public NSArray logicalErrorsInChangeDictionaryForModelOptions(EOSchemaSynchronizationModelChanges changes, EOModel model, EOSchemaGenerationOptions options) { return null; }

    public NSArray _namesOfColumnsCoercedInChangeDictionaryForEntityGroup(EOSchemaSynchronizationTableChanges changes, NSArray entityGroup) { return null; }

    public NSDictionary _parameterizedTypes() { return null; }

    public String phraseCastingColumnNamed(String columnName, EOSchemaSynchronization.ColumnTypes type, EOSchemaSynchronization.ColumnTypes castType, EOSchemaGenerationOptions eoschemagenerationoptions) { return null; }

    public String _prettyDictionary(NSDictionary dictionary) { return null; }

    public NSArray _schemaCreationStatementsForEntityGroup(NSArray entityGroup, EOSchemaGenerationOptions options) { return null; }

    public boolean _schemaSynchronizationCommentsEnabled() { return true; }

    public void setSchemaSynchronizationDelegate(Delegate delegate) {}

    public Delegate schemaSynchronizationDelegate() { return null; }

    public void _setSchemaSynchronizationCommentsEnabled(boolean commentsEnabled) {}

    public int _intForExpressionStringAdaptorChannel(String expressionString, EOAdaptorChannel adaptorChannel) { return 0; }

    public boolean _isSignificantExceptionAtIndexOfSynchronizationStatements(Exception exception, int index, NSArray statements) { return true; }

    public boolean _isTableNamed(String tableName) { return true; }

    public int _nullCountForColumnNamedInTableNamedBeneathModel(String columnName, String tableName, EOModel model) { return 0; }

    public NSArray _primaryKeyEntityGroupsForEntityGroups(NSArray entityGroups) { return null; }

    public EOAdaptor _schemaSynchronizationAdaptor() { return null; }

    public NSArray _statementsCommentedWithString(NSArray statements, String comment) { return null; }

    boolean arrayHasValue(NSArray objects, String string) { return null; }

    public NSArray statementsToCopyTableNamed(String tempTableName, NSArray entityGroup, EOSchemaSynchronizationTableChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray _statementsToCreateTableForEntityGroupOptions(NSArray entityGroup, EOSchemaGenerationOptions options) { return null; }

    public NSArray _statementsToDeleteTableNamedOptions(String tableName, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToConvertColumnType(String columnName, String tableName, EOSchemaSynchronization.ColumnTypes type, EOSchemaSynchronization.ColumnTypes newType, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToDeleteColumnNamed(String columnName, String tableName, EOSchemaGenerationOptions options) { return null; }

    private NSArray __coercions(Object value) { return null; }

    public NSArray _statementsToDirectlyUpdateObjectStoreForEntityGroup(NSArray entityGroup, EOSchemaSynchronizationTableChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToDropForeignKeyConstraintsOnEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToDropForeignKeyConstraintsOnEntityGroup(NSArray entityGroup, EOSchemaSynchronizationTableChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray _statementsToDropPrimaryKeyConstraintsOnTableNamed(String tableName) { return null; }

    public NSArray statementsToDropPrimaryKeyConstraintsOnEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToDropPrimaryKeySupportForEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToImplementForeignKeyConstraintsOnEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToImplementPrimaryKeyConstraintsOnEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToImplementPrimaryKeySupportForEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray _statementsToIndirectlyUpdateObjectStoreForEntityGroupWithChangeDictionaryOptions(NSArray entityGroup, EOSchemaSynchronizationTableChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToInsertColumnForAttribute(EOAttribute attribute, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToModifyColumnNullRule(String columnName, String tableName, boolean allowsNull, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToRenameColumnNamed(String columnName, String tableName, String newName, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToRenameTableNamed(String oldTableName, String newTableName, EOSchemaGenerationOptions options) { return null; }

    public NSArray _statementsToUpdateObjectStoreForEntityGroup(NSArray entityGroup, EOSchemaSynchronizationTableChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToUpdateObjectStoreForEntityGroups(NSArray entityGroups, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

    public NSArray statementsToUpdateObjectStoreForModel(EOModel model, EOSchemaSynchronizationModelChanges changes, EOSchemaGenerationOptions options) { return null; }

    public EOAdaptorChannel _schemaSynchronizationAdaptorChannelForModel(EOModel model) { return null; }

    public EOSchemaTableDescription tableDescriptionForModel(String tableName, EOModel eomodel) { return null; }

    public EOSchemaColumnDescription columnDescriptionForTableAndModel(String columnName, String tableName, EOModel eomodel) { return null; }

    public EOSchemaIndexDescription indexDescriptionForTableAndModel(String indexName, String tableName, EOModel eomodel) { return null; }

    public NSDictionary _sqlReplacements() { return null; }

    public boolean supportsDirectColumnCoercion() { return true; }

    public boolean supportsDirectColumnDeletion() { return true; }

    public boolean supportsDirectColumnInsertion() { return true; }

    public boolean supportsDirectColumnRenaming() { return true; }

    public boolean supportsDirectColumnNullRuleModification() { return true; }

    public boolean supportsSchemaSynchronization() { return true; }

    public boolean supportsTableDescriptionIntrospection() { return true; }

    public NSMutableDictionary _tableNameMapInChangeDictionary(EOSchemaSynchronizationModelChanges changes) { return null; }

    public String _temporaryNameForTableName(String tableName) { return null; }

    public boolean _canConvertColumnOfTypeToTypeOptions(EOSchemaSynchronization.ColumnTypes type, EOSchemaSynchronization.ColumnTypes newType, EOSchemaGenerationOptions options) { return true; }

    public String _columnCreationClauseForAttribute(EOAttribute attribute) { return null; }

    public EOSchemaSynchronization.ColumnTypes _columnTypeForAttribute(EOAttribute attribute) { return null; }

    public EOSchemaSynchronization.ColumnTypes _columnTypeForChangeDictionaryAndAttribute(EOSchemaSynchronizationColumnChanges changes, EOAttribute attribute) { return null; }

    public NSArray _entityGroupInModelForTableNamed(EOModel model, String tableName) { return null; }

    public EOAttribute _firstAttributeInEntityGroupWithColumnName(NSArray entityGroup, String columnName) { return null; }

    public boolean _isTableCopyingRequiredByColumnChangesToEntityGroup(EOSchemaSynchronizationTableChanges changes, NSArray entityGroup) { return true; }

    public String _nameInObjectStoreForEntityGroupWithChangeDictionary(NSArray entityGroup, EOSchemaSynchronizationTableChanges changes) { return null; }

    public int _rowCountForTableNamedBeneathModel(String tableName, EOModel model) { return 0; }

    public EOSchemaSynchronizationColumnChanges objectStoreChangesFromAttributeToAttribute(EOAttribute schemaAttribute, EOAttribute modelAttribute) { return null; }

    protected NSArray indexDefinitionForEntity(EOEntity entity) { return null; }

    public NSArray createIndexStatementsForEntityGroups(NSArray entityGroups) { return null; }

    public NSArray createIndexStatementsForEntityGroup(NSArray entityGroup) { return null; }

    protected NSArray createIndexExpressionsForEntity(EOEntity entity, EOEntityIndex anIndex, EOEntity masterEntity) { return null; }

    protected String createIndexStatementForEntity(EOEntity entity, String indexName, String tableName, NSArray attributeList) { return null; }

    public NSArray dropIndexStatementsForEntityGroups(NSArray entityGroups) { return null; }

    public NSArray dropIndexStatementsForEntityGroup(NSArray entityGroup) { return null; }

    protected NSArray dropIndexExpressionsForEntity(EOEntity entity, EOEntityIndex anIndex, EOEntity masterEntity) { return null; }

    protected String dropIndexStatementForEntity(EOEntity entity, String indexName, String tableName) { return null; }

    static  {}

    private EOSchemaGeneration.Delegate _schemaGenerationDelegate;
    private boolean _commentsEnabled;
    private Delegate _delegate;
    protected EOAdaptor _adaptor;
    private static final NSSelector _selColumnName;
    private static final NSDictionary _sqlReplacementsDictionary;

}
