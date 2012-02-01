package com.webobjects.jdbcadaptor;
public class JDBCExpression extends com.webobjects.eoaccess.EOSQLExpression{
    public JDBCExpression(com.webobjects.eoaccess.EOEntity entity){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Adds a SQL string for attribute to a comma-separated list of attribute names for use in a SELECT statement. The SQL string for attribute is formatted with its "read" format. This method invokes appendItemToListString to add the attribute name.
     */
    public void addSelectListAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns according to flag an adaptor specific string for use in a CREATE TABLE statement. The returned string indicates whether a column allows null values. EOSQLExpression's implementation returns the empty string if flag is true, "NOT NULL" otherwise. A subclass should override this if its database server's semantics are different.
     */
    public java.lang.String allowsNullClauseForConstraint(boolean allowsNull){
        return null; //TODO codavaj!!
    }

    protected void appendItemToListString(java.lang.String sqlString){
        return; //TODO codavaj!!
    }

    protected void appendItemToOrderByString(java.lang.String sqlString){
        return; //TODO codavaj!!
    }

    protected void appendItemToValueListString(java.lang.String sqlString){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Implemented by subclasses to create and return the bind variable dictionary for attribute and value. The dictionary returned from this method must contain the following key-value pairs:
     * Key Corresponding Value BindVariableNameKey Name of the bind variable for attribute BindVariablePlaceHolderKey Placeholder string used in the SQL statement BindVariableAttributeKey attribute BindVariableValueKey value
     * An adaptor subclass may define additional entries as required by its RDBMS.
     * Invoked from sqlStringForValue when the message mustUseBindVariableForAttribute returns true or when the receiver's class uses bind variables and the message shouldUseBindVariableForAttribute returns true.
     * A subclass that uses bind variables should implement this method without invoking EOSQLExpression's implementation. The subclass implementation must return a dictionary with entries for the keys listed above and may add additional keys.
     */
    public com.webobjects.foundation.NSMutableDictionary bindVariableDictionaryForAttribute(com.webobjects.eoaccess.EOAttribute att, java.lang.Object value){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns an adaptor specific type string for attribute that's suitable for use in a CREATE TABLE statement. EOSQLExpression's implementation creates a string based on anAttribute's externalType, precision, and width as follows:
     * A subclass should override the default implementation if its database server requires column types in a different format.
     */
    public java.lang.String columnTypeStringForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns a String with the character used to quote SQL identifiers that use unusual characters which would not otherwise be legal.
     */
    public java.lang.String externalNameQuoteCharacter(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method should be overridden by subclasses to return a string representation of value suitable for use in an SQL statement, depending on attribute's externalType. For example, a subclass might format a date using a special database-specific syntax or standard form or truncate numbers to attribute's precision and scale. EOSQLExpression's implementation merely returns the string representation of value.
     */
    public java.lang.String formatValueForAttribute(java.lang.Object value, com.webobjects.eoaccess.EOAttribute attribute){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.foundation.NSDictionary jdbcInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Overridden by subclasses to return the SQL string used in a SELECT statement to lock selected rows. A concrete subclass of EOSQLExpression must override this method to return the string used by its adaptor's RDBMS.
     */
    public java.lang.String lockClause(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns true if the receiver must use bind variables for attribute, false otherwise. EOSQLExpression's implementation returns false. An SQL expression subclass that uses bind variables should override this method to return true if the underlying RDBMS requires that bind variables be used for attributes with attribute's external type.
     */
    public boolean mustUseBindVariableForAttribute(com.webobjects.eoaccess.EOAttribute att){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Generates a SELECT statement. It is done by performing the following steps: Invokes addSelectListAttribute for each entry in attributes to prepare the comma-separated list of attributes. Use fetchSpec's qualifier to generate the receiver's whereClauseString}. Invokes addOrderByAttributeOrdering for each EOAttributeOrdering object in fetchSpec. First conjoins the qualifier in fetchSpec with the restricting qualifier, if any, of the receiver's entity. Invokes joinExpression to generate the receiver's joinClauseString. Invokes tableListWithRootEntity to get the comma-separated list of tables for the FROM clause. If flag lock is true, invokes lockClause to get the SQL string to lock selected rows. Invokes assembleSelectStatementWithAttributes.
     */
    public void prepareSelectExpressionWithAttributes(com.webobjects.foundation.NSArray attributes, boolean lock, com.webobjects.eocontrol.EOFetchSpecification fetchSpec){
        return; //TODO codavaj!!
    }

    protected void setJDBCInfo(com.webobjects.foundation.NSDictionary jdbcInfo){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns true if the receiver can provide a bind variable dictionary for attribute, false otherwise. Bind variables aren't used for values associated with this attribute when useBindVariables returns false. EOSQLExpression's implementation returns false. An SQL expression subclass should override this method to return true if the receiver should use bind variables for attributes with attribute's external type. It should also return true for any attribute for which the receiver must use bind variables.
     */
    public boolean shouldUseBindVariableForAttribute(com.webobjects.eoaccess.EOAttribute att){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Queries if instances use bind variables. By default, instances don't; if the value for the System property "EOAdaptorUseBindVariables" is "true", instances do use them.
     */
    public boolean useBindVariables(){
        return false; //TODO codavaj!!
    }

}
