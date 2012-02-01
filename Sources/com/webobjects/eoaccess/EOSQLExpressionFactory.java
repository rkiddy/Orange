package com.webobjects.eoaccess;
/**
 * EOSQLExpressionFactory builds SQL statements for adaptor channels. You don't typically use instances of EOSQLExpression; rather, you use EOSQLExpression subclasses written to work with a particular RDBMS and corresponding adaptor. A concrete subclass of EOSQLExpression overrides many of its methods in terms of the query language syntax for its specific RDBMS. EOSQLExpression objects are used internally by the Framework, and unless you're creating a concrete adaptor, you won't ordinarily need to interact with EOSQLExpression objects yourself. You most commonly create and use an EOSQLExpression object when you want to send an SQL statement directly to the server. In this case, you simply create an expression with the EOSQLExpression class method expressionForString, and send the expression object to an adaptor channel using EOAdaptorChannel's evaluateExpression method.
 * See Also:EOSQLExpressionFactory.expressionForString(String)
 */
public class EOSQLExpressionFactory{
    /**
     * Creates an EOSQLExpressionFactory capable of creating EOSQLExpressions for the specified EOAdaptor.
     * Parameters:adaptor - the adaptor for which EOSQLExpressions are to be created
     */
    public EOSQLExpressionFactory(com.webobjects.eoaccess.EOAdaptor adaptor){
         //TODO codavaj!!
    }

    /**
     * Returns the EOAdaptor for which this factory creates expressions.
     */
    public com.webobjects.eoaccess.EOAdaptor adaptor(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new instance of the factory's EOSQLExpression class and assigns the parameter entity to that expression.
     */
    public com.webobjects.eoaccess.EOSQLExpression createExpression(com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns an SQL DELETE expression to delete the rows described by qualifier.
     * Creates an instance of EOSQLExpression, initializes it with entity (an EOEntity object), and sends it a prepareDeleteExpressionForQualifier message.
     * The expression created with this method does not use table aliases because Enterprise Objects Framework assumes that all INSERT, UPDATE, and DELETE statements are single-table operations. To generate INSERT statements that do use table aliases, you must override prepareInsertExpressionWithRow to send a setUseAliases(true) message prior to invoking super's version.
     */
    public com.webobjects.eoaccess.EOSQLExpression deleteStatementWithQualifier(com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the subclass of EOSQLExpression used by this factory to create expressions
     */
    public java.lang.Class expressionClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new instance of the factory's EOSQLExpression class and assigns the parameter entity to that expression. It is the same as createExpression.
     */
    public com.webobjects.eoaccess.EOSQLExpression expressionForEntity(com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns an SQL expression containing the string parameter.
     */
    public com.webobjects.eoaccess.EOSQLExpression expressionForString(java.lang.String string){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns an SQL INSERT expression to insert row. Creates an instance of EOSQLExpression, initializes it with entity, and sends it prepareInsertExpressionWithRow(). Raises an IllegalArgumentException if entity is null.
     * The expression created with this method does not use table aliases because Enterprise Objects Framework assumes that all INSERT, UPDATE, and DELETE statements are single-table operations. To generate INSERT statements that do use table aliases, you must override prepareInsertExpressionWithRow to send a setUseAliases(true) message prior to invoking super's version.
     */
    public com.webobjects.eoaccess.EOSQLExpression insertStatementForRow(com.webobjects.foundation.NSDictionary row, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns an SQL SELECT expression.
     * Creates an instance of EOSQLExpression, initializes it with entity and fetchSpec, and calls prepareSelectExpressionWithAttributes using that expression instance.
     * Raises an IllegalArgumentException if attributes is null or empty, fetchSpecification is null, or entity is null.
     * The expression created with this method may or may not use table aliases. To generate SELECT statements that unconditionally use or do not use them, you must override prepareSelectExpressionWithAttributes() in EOSQLExpression to send a setUseAliases(boolean) message after invoking super's version.
     */
    public com.webobjects.eoaccess.EOSQLExpression selectStatementForAttributes(com.webobjects.foundation.NSArray attributes, boolean yn, com.webobjects.eocontrol.EOFetchSpecification fetchSpec, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns an SQL UPDATE expression to update the row identified by qualifier with the values in row. row should only contain entries for values that have actually changed. Creates an instance of EOSQLExpression, initializes it with entity, and sends it prepareUpdateExpressionWithRow.
     * Raises an IllegalArgumentException if any parameter is null.
     * The expression created with this method does not use table aliases because Enterprise Objects Framework assumes that all INSERT, UPDATE, and DELETE statements are single-table operations. To generate INSERT statements that do use table aliases, you must override prepareInsertExpressionWithRow to send a setUseAliases(true) message prior to invoking super's version.
     */
    public com.webobjects.eoaccess.EOSQLExpression updateStatementForRow(com.webobjects.foundation.NSDictionary row, com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

}
