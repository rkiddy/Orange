
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.EOAdaptor;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.synchronization.EOSchemaGenerationOptions;
import com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.*;


public class SybasePlugIn extends JDBCPlugIn {
    public static class SybaseExpression extends JDBCExpression {

        public SybaseExpression(EOEntity entity) { return null; }

        public String allowsNullClauseForConstraint(boolean allowsNull) { return null; }

        public String lockClause() { return null; }

        public String assembleSelectStatementWithAttributes(NSArray attributes, boolean lock, EOQualifier qualifier, NSArray fetchOrder, String selectString, String columnList, String tableList, 
                String whereClause, String joinClause, String orderByClause, String lockClause) { return null; }
    }

    public static class SybaseSynchronizationFactory extends EOSchemaSynchronizationFactory {

        public SybaseSynchronizationFactory(EOAdaptor adaptor) { return null; }

        public NSArray primaryKeySupportStatementsForEntityGroups(NSArray entityGroups) { return null; }

        public NSArray dropPrimaryKeySupportStatementsForEntityGroups(NSArray entityGroups) { return null; }

        public NSArray _statementsToDeleteTableNamedOptions(String tableName, EOSchemaGenerationOptions options) { return null; }

        public NSArray dropTableStatementsForEntityGroup(NSArray entityGroup) { return null; }

        public boolean supportsSchemaSynchronization() { return true; }

        public NSArray _statementsToDropPrimaryKeyConstraintsOnTableNamed(String tableName) { return null; }

        public NSArray statementsToRenameTableNamed(String tableName, String newName, EOSchemaGenerationOptions options) { return null; }
    }



    public SybasePlugIn(JDBCAdaptor adaptor) { return null; }

    public String name() { return null; }

    public String defaultDriverName() { return null; }

    public String databaseProductName() { return null; }

    public Class defaultExpressionClass() { return null; }

    public EOSchemaSynchronizationFactory createSchemaSynchronizationFactory() { return null; }

    public NSDictionary jdbcInfo() { return null; }

    public String newPrimaryKeySelectString(String pkTableName, String entityRootName) { return null; }

    public String primaryKeyLockString(String pkTableName, String entityRootName) { return null; }

    private static final String DriverClassName = "com.sybase.jdbc2.jdbc.SybDriver";
    private static final String DriverProductName = "Sybase";

}
