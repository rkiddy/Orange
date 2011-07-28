
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.util.Enumeration;
import java.util.Iterator;


public abstract class EOSQLExpression {
    public static interface SQLValue {

        public abstract String valueForSQLExpression(EOSQLExpression eosqlexpression);
    }



    protected EOEntity _entityForRelationshipPathOrigin(String path, EOEntity entity) { return null; }

    public String _aliasForRelatedAttributeRelationshipPath(EOAttribute attribute, String relationshipPath) { return null; }

    public String _sqlStringForJoinSemanticMatchSemantic(int semantic, int matchSemantic) { return null; }

    protected String _flattenRelPathEntity(String relPath, EOEntity entity) { return null; }

    public String _aliasForRelationshipPath(String relationshipPath) { return null; }

    public EOEntity _rootEntityForExpression() { return null; }

    private EOSQLExpression() { return null; }

    public EOSQLExpression(EOEntity entity) { return null; }

    public String toString() { return null; }

    protected static String _truncatedString(String value, boolean truncate, int limit) { return null; }

    protected static String _truncatedStringForData(NSData value, boolean truncate, int limit) { return null; }

    protected String _stringForDate(NSTimestamp value) { return null; }

    protected NSTimestampFormatter _defaultDateFormatter() { return null; }

    public NSMutableDictionary aliasesByRelationshipPath() { return null; }

    public EOEntity entity() { return null; }

    public void _setEntity(EOEntity entity) {}

    public String listString() { return null; }

    protected StringBuffer _listString() { return null; }

    public String valueList() { return null; }

    protected StringBuffer _valueList() { return null; }

    public String whereClauseString() { return null; }

    void setWhereClauseString(String whereClauseString) { return null; }

    public String joinClauseString() { return null; }

    protected StringBuffer _orderByString() { return null; }

    public String orderByString() { return null; }

    public String statement() { return null; }

    public void setStatement(String statement) {}

    public String lockClause() { return null; }

    public String tableListWithRootEntity(EOEntity entity) { return null; }

    public void prepareInsertExpressionWithRow(NSDictionary row) {}

    public void prepareUpdateExpressionWithRow(NSDictionary row, EOQualifier qualifier) {}

    public void prepareDeleteExpressionForQualifier(EOQualifier qualifier) {}

    public void prepareSelectExpressionWithAttributes(NSArray attributes, boolean lock, EOFetchSpecification fetchSpec) {}

    public String assembleJoinClause(String leftName, String rightName, int semantic) { return null; }

    public void addJoinClause(String leftName, String rightName, int semantic) {}

    public void joinExpression() {}

    public String assembleInsertStatementWithRow(NSDictionary row, String tableList, String columnList, String valueList) { return null; }

    public String assembleUpdateStatementWithRow(NSDictionary row, EOQualifier qualifier, String tableList, String updateList, String whereClause) { return null; }

    public String assembleDeleteStatementWithQualifier(EOQualifier qualifier, String tableList, String whereClause) { return null; }

    public String assembleSelectStatementWithAttributes(NSArray attributes, boolean lock, EOQualifier qualifier, NSArray fetchOrder, String selectString, String columnList, String tableList, 
            String whereClause, String joinClause, String orderByClause, String lockClause) { return null; }

    public void addSelectListAttribute(EOAttribute attribute) {}

    public void addInsertListAttribute(EOAttribute attribute, Object value) {}

    public void addUpdateListAttribute(EOAttribute attribute, Object value) {}

    public String formatStringValue(String string) { return null; }

    public String formatValueForAttribute(Object value, EOAttribute attribute) { return null; }

    public String formatSQLString(String sqlString, String format) { return null; }

    String sqlStringForArrayOfQualifiers(NSArray qualifiers, String op) { return null; }

    public String sqlStringForConjoinedQualifiers(NSArray qualifiers) { return null; }

    public String sqlStringForDisjoinedQualifiers(NSArray qualifiers) { return null; }

    public String sqlStringForNegatedQualifier(EOQualifier qualifier) { return null; }

    public String sqlStringForCaseInsensitiveLike(String valueString, String keyString) { return null; }

    public String sqlStringForKeyValueQualifier(EOKeyValueQualifier qualifier) { return null; }

    public String sqlStringForKeyComparisonQualifier(EOKeyComparisonQualifier qualifier) { return null; }

    public void addOrderByAttributeOrdering(EOSortOrdering sortOrdering) {}

    public void setUseAliases(boolean useAliases) {}

    public boolean useAliases() { return true; }

    public String sqlStringForSchemaObjectName(String name) { return null; }

    public String sqlStringForAttributeNamed(String name) { return null; }

    public String sqlStringForSelector(NSSelector selector, Object value) { return null; }

    public String sqlStringForValue(Object value, String keyPath) { return null; }

    public String sqlStringForAttribute(EOAttribute attribute) { return null; }

    public String sqlStringForAttributePath(NSArray path) { return null; }

    public void appendItemToListString(String itemString, StringBuffer listString) {}

    public String sqlPatternFromShellPatternWithEscapeCharacter(String pattern, char escapeCharacter) { return null; }

    public char sqlEscapeChar() { return null; }

    public String sqlPatternFromShellPattern(String pattern) { return null; }

    public abstract NSMutableDictionary bindVariableDictionaryForAttribute(EOAttribute eoattribute, Object obj);

    public boolean shouldUseBindVariableForAttribute(EOAttribute attribute) { return true; }

    public boolean mustUseBindVariableForAttribute(EOAttribute attribute) { return true; }

    /**
     * @deprecated Method useQuotedExternalNames is deprecated
     */

    public static boolean useQuotedExternalNames() { return null; }

    /**
     * @deprecated Method setUseQuotedExternalNames is deprecated
     */

    public static void setUseQuotedExternalNames(boolean flag) { return null; }

    public String externalNameQuoteCharacter() { return null; }

    public boolean useBindVariables() { return true; }

    public void setUseBindVariables(boolean flag) {}

    public NSArray bindVariableDictionaries() { return null; }

    public void addBindVariableDictionary(NSDictionary binding) {}

    /**
     * @deprecated Method addCreateClauseForAttribute is deprecated
     */

    public void addCreateClauseForAttribute(EOAttribute attribute) {}

    public void prepareConstraintStatementForRelationship(EORelationship relationship, NSArray sourceColumns, NSArray destinationColumns) {}

    public String columnTypeStringForAttribute(EOAttribute attribute) { return null; }

    public String allowsNullClauseForConstraint(boolean flag) { return null; }

    public static String sqlStringForString(String string) { return null; }

    public static String sqlStringForNumber(Number number) { return null; }

    public String sqlStringForQualifier(EOQualifierSQLGeneration qualifier) { return null; }

    public String sqlStringForData(NSData data) { return null; }

    static  {}

    private static final int _DefaultPathLength = 128;
    private static final int _DefaultListStringLength = 256;
    private static final int _DefaultOrderByStringLength = 128;
    private static final int _DefaultTableListLength = 128;
    private static final int _DefaultFormatSQLStringLength = 64;
    private static final int _ValueLengthLimit = 40;
    protected static final char _NibbleToHex[];
    protected static NSTimestampFormatter _defaultDateFormatter;
    protected NSMutableDictionary _aliasesByRelationshipPath;
    protected EOEntity _entity;
    protected StringBuffer _listString;
    protected StringBuffer _valueListString;
    protected String _whereClauseString;
    protected String _joinClauseString;
    protected StringBuffer _orderByString;
    protected NSMutableArray _bindings;
    protected NSMutableArray _contextStack;
    protected String _statement;
    protected boolean _useAliases;
    protected String _upperFunctionName;
    public static final String BindVariableNameKey = "BindVariableName";
    public static final String BindVariableAttributeKey = "BindVariableAttribute";
    public static final String BindVariableValueKey = "BindVariableValue";
    public static final String BindVariablePlaceHolderKey = "BindVariablePlaceholder";
    public static final String BindVariableColumnKey = "BindVariableColumn";
    private static int UseBindings;

}
