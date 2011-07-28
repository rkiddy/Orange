
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.sql.*;


public class JDBCChannel extends EOAdaptorChannel {


    public JDBCChannel(JDBCContext context) { return null; }

    private JDBCPlugIn _plugIn() { return null; }

    public boolean isOpen() { return true; }

    public void openChannel() {}

    private void _resetUpdateCount() {}

    public void closeChannel() {}

    private EOSQLExpressionFactory _expressionFactory() { return null; }

    public void insertRow(NSDictionary row, EOEntity entity) {}

    public int updateValuesInRowsDescribedByQualifier(NSDictionary row, EOQualifier qualifier, EOEntity entity) { return 0; }

    public int deleteRowsDescribedByQualifier(EOQualifier qualifier, EOEntity entity) { return 0; }

    public void selectAttributes(NSArray attributes, EOFetchSpecification fetchSpec, boolean yn, EOEntity entity) {}

    private ResultSet _bindInputVariablesWithBindingsAndExecute(NSArray bindings, String sqlString, Connection connection, boolean isExecutingStoredProc, boolean needResultCount) throws SQLException { return null; }

    public void evaluateExpression(EOSQLExpression expression) {}

    private void _evaluateExpression(EOSQLExpression expression, boolean isExecutingStoredProc, boolean needResultCount) {}

    boolean _errorEvaluateExpression() { return null; }

    void _setErrorEvaluateExpression(boolean value) { return null; }

    private void _beginFetch(JDBCContext context) {}

    private void _endFetch() {}

    public boolean isFetchInProgress() { return true; }

    public NSArray describeResults() { return null; }

    public void setAttributesToFetch(NSArray attributes) {}

    public NSArray attributesToFetch() { return null; }

    public void cancelFetch() {}

    NSArray _entityGroupForEntity(EOEntity entity) { return null; }

    NSArray _fetchRowsForSQLExpressionAndAttributes(EOSQLExpression expression, NSArray attributes) { return null; }

    public NSDictionary primaryKeyForNewRowWithEntity(EOEntity entity) { return null; }

    public NSArray primaryKeysForNewRowsWithEntity(int count, EOEntity entity) { return null; }

    public NSArray describeTableNames() { return null; }

    private DatabaseMetaData _dbMetaData() throws SQLException { return null; }

    public NSArray describeStoredProcedureNames() { return null; }

    private void _describeResultSet(ResultSet rs) {}

    private void _jdbcGetAttributesForEntity(EOEntity entity) {}

    private String _modelObjectNameForDatabaseName(String name) { return null; }

    private void _getToOneRelationshipsForEntity(EOEntity entity) {}

    public EOModel describeModelWithTableNames(NSArray tableNames) { return null; }

    private void _addInverseToManyRelationship(EORelationship rel) {}

    public void addStoredProceduresNamed(NSArray storedProcedureNames, EOModel model) {}

    public void executeStoredProcedure(EOStoredProcedure storedProcedure, NSDictionary values) {}

    public NSDictionary returnValuesForLastStoredProcedureInvocation() { return null; }

    public NSMutableDictionary fetchRow() { return null; }

    public int rowsProcessedCount() { return 0; }

    NSArray _fetchOrderedRow(boolean materializeLOBs) { return null; }

    protected boolean _isOpen;
    protected Statement _statement;
    protected NSArray _attributes;
    protected NSArray _selectedColumns;
    protected int _rowsProcessedCount;
    protected NSArray _storedProcedureBindings;
    protected ResultSet _resultSet;
    protected int _rowsUpdateCount;
    protected int _fetchColumnCount;
    private JDBCColumn _inputColumn;
    private boolean _errorEvaluateExpression;
    private JDBCFetchPrivate _fetchAssociation;
    private boolean _fetchInProgress;
    private boolean _beganTransaction;
    private boolean _isFetchingStoredProc;
    private DatabaseMetaData _dbMetaData;

}
