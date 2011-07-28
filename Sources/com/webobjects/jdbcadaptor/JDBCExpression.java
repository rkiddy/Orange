
package com.webobjects.jdbcadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.foundation.*;


public class JDBCExpression extends EOSQLExpression {


    public JDBCExpression(EOEntity entity) { return null; }

    public boolean useBindVariables() { return true; }

    public boolean shouldUseBindVariableForAttribute(EOAttribute att) { return true; }

    public boolean mustUseBindVariableForAttribute(EOAttribute att) { return true; }

    protected NSDictionary jdbcInfo() { return null; }

    protected void setJDBCInfo(NSDictionary jdbcInfo) {}

    public String externalNameQuoteCharacter() { return null; }

    public String lockClause() { return null; }

    public NSMutableDictionary bindVariableDictionaryForAttribute(EOAttribute att, Object value) { return null; }

    public String formatValueForAttribute(Object value, EOAttribute attribute) { return null; }

    public void prepareSelectExpressionWithAttributes(NSArray attributes, boolean lock, EOFetchSpecification fetchSpec) {}

    public String columnTypeStringForAttribute(EOAttribute attribute) { return null; }

    public String allowsNullClauseForConstraint(boolean allowsNull) { return null; }

    protected void appendItemToListString(String sqlString) {}

    protected void appendItemToOrderByString(String sqlString) {}

    protected void appendItemToValueListString(String sqlString) {}

    public void addSelectListAttribute(EOAttribute attribute) {}

    protected boolean _inSelect;
    protected String _externalQuoteChar;
    protected String _rtrimFunctionName;
    protected NSDictionary _jdbcInfo;

}
