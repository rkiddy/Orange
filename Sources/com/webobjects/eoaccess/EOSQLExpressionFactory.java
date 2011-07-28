
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.*;


public class EOSQLExpressionFactory {


    public EOSQLExpressionFactory(EOAdaptor adaptor) { return null; }

    private EOSQLExpressionFactory() { return null; }

    public EOAdaptor adaptor() { return null; }

    public Class expressionClass() { return null; }

    public EOSQLExpression createExpression(EOEntity entity) { return null; }

    public EOSQLExpression expressionForString(String string) { return null; }

    public EOSQLExpression expressionForEntity(EOEntity entity) { return null; }

    public EOSQLExpression insertStatementForRow(NSDictionary row, EOEntity entity) { return null; }

    public EOSQLExpression updateStatementForRow(NSDictionary row, EOQualifier qualifier, EOEntity entity) { return null; }

    public EOSQLExpression deleteStatementWithQualifier(EOQualifier qualifier, EOEntity entity) { return null; }

    public EOSQLExpression selectStatementForAttributes(NSArray attributes, boolean yn, EOFetchSpecification fetchSpec, EOEntity entity) { return null; }

    static  {}

    protected EOAdaptor _adaptor;
    protected Class _expressionClass;
    private static final Class expressionParameterTypes[];

}
