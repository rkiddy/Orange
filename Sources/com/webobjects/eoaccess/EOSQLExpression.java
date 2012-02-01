package com.webobjects.eoaccess;
/**
 * EOSQLExpression is an abstract superclass that defines how to build SQL statements for adaptor channels. You don't typically use instances of EOSQLExpression; rather, you can use EOSQLExpression subclasses written to work with a particular RDBMS (relational database management system) and corresponding adaptor. A concrete subclass of EOSQLExpression overrides many of its methods in terms of the query language syntax for its specific RDBMS. EOSQLExpression objects are used internally by the Framework, and unless you are creating a concrete adaptor, you won't ordinarily need to interact with EOSQLExpression objects itself. You would create and use an EOSQLExpression object when you want to send a SQL statement directly to the server. In this case, you simply create an expression with the EOSQLExpressionFactory's method expressionForString, and send that expression object to an adaptor channel using EOAdaptorChannel's method evaluateExpression. See EOSQLExpression Concepts for more information.
 */
public abstract class EOSQLExpression{
    /**
     * A key for the attribute that uses the bind variable.
     * See Also:EOSQLExpression.bindVariableDictionaryForAttribute(com.webobjects.eoaccess.EOAttribute, java.lang.Object), Constant Field Values
     */
    public static final java.lang.String BindVariableAttributeKey="BindVariableAttribute";

    /**
     * A key for the column name to be used in SQL.
     * See Also:EOSQLExpression.bindVariableDictionaryForAttribute(com.webobjects.eoaccess.EOAttribute, java.lang.Object), Constant Field Values
     */
    public static final java.lang.String BindVariableColumnKey="BindVariableColumn";

    /**
     * The key for the name of a bind variable.
     * See Also:EOSQLExpression.bindVariableDictionaryForAttribute(com.webobjects.eoaccess.EOAttribute, java.lang.Object), Constant Field Values
     */
    public static final java.lang.String BindVariableNameKey="BindVariableName";

    /**
     * A key for the placeholder string to be used in SQL.
     * See Also:EOSQLExpression.bindVariableDictionaryForAttribute(com.webobjects.eoaccess.EOAttribute, java.lang.Object), Constant Field Values
     */
    public static final java.lang.String BindVariablePlaceHolderKey="BindVariablePlaceholder";

    /**
     * A key for the value of the bind variable.
     * See Also:EOSQLExpression.bindVariableDictionaryForAttribute(com.webobjects.eoaccess.EOAttribute, java.lang.Object), Constant Field Values
     */
    public static final java.lang.String BindVariableValueKey="BindVariableValue";

    /**
     * Creates a new EOSQLExpression rooted to an EOEntity.
     * Parameters:entity - an EOEntitySee Also:EOEntity
     */
    public EOSQLExpression(com.webobjects.eoaccess.EOEntity entity){
         //TODO codavaj!!
    }

    /**
     * Adds binding to this object's array of bind variable dictionaries. binding is generally created using bindVariableDictionaryForAttribute and is added to the bind variable dictionaries in sqlStringForValue when this receiver uses a bind variable for the specified attribute.
     */
    public void addBindVariableDictionary(com.webobjects.foundation.NSDictionary binding){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Adds the SQL string for creating attribute to a comma-separated list of attribute creation clauses. The list is constructed for use in a CREATE TABLE statement produced by createTableStatementsForEntityGroup. One can use listString to access the creation clauses.
     * EOSQLExpression's implementation creates clauses in the following form:
     * COLUMN_NAME COLUMN_TYPE ALLOWS_NULL_CLAUSE Where COLUMN_TYPE is the string returned from columnTypeStringForAttribute for attribute. ALLOWS_NULL_CLAUSE is the string returned from allowsNullClauseForConstraint with true if attribute allowsNull or with false otherwise.
     */
    public void addCreateClauseForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Adds the SQL string for attribute to a comma-separated list of attributes and value to a comma-separated list of values. Both lists are constructed for use in an INSERT statement. You can use the methods listString and valueList to access the attributes and value lists.
     * Invokes appendItemToListString to add an SQL string for attribute to the receiver's listString, and again to add a formatted SQL string for value to the receiver's valueList.
     */
    public void addInsertListAttribute(com.webobjects.eoaccess.EOAttribute attribute, java.lang.Object value){
        return; //TODO codavaj!!
    }

    /**
     * Creates a new join clause by invoking assembleJoinClause and adds it to the receiver's join clause string. Separates join conditions already in the join clause string with the word "and". Invoked from joinExpression.
     */
    public void addJoinClause(java.lang.String leftName, java.lang.String rightName, int semantic){
        return; //TODO codavaj!!
    }

    /**
     * Adds an attribute-direction pair ("LAST_NAME asc", for example) to the receiver's ORDER BY string. If sortOrdering's selector is EOSortOrdering.CompareCaseInsensitiveAscending or EOSortOrdering.CompareCaseInsensitiveAscending, the string generated has the format "upper(attribute) direction". Method orderByString can be used to access the ORDER BY string. This method invokes appendItemToListString to add the attribute-direction pair.
     */
    public void addOrderByAttributeOrdering(com.webobjects.eocontrol.EOSortOrdering sortOrdering){
        return; //TODO codavaj!!
    }

    /**
     * Adds a SQL string for attribute to a comma-separated list of attribute names for use in a SELECT statement. The SQL string for attribute is formatted with its "read" format. This method invokes appendItemToListString to add the attribute name.
     */
    public void addSelectListAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Adds an attribute-value assignment ("LAST_NAME = 'Thomas'", for example) to a comma-separated list for use in an UPDATE statement. Formats value with attribute's "write" format. Method listString can be used to access the list. This method invokes appendItemToListString to add the attribute-value assignment.
     */
    public void addUpdateListAttribute(com.webobjects.eoaccess.EOAttribute attribute, java.lang.Object value){
        return; //TODO codavaj!!
    }

    /**
     * Returns a dictionary of table aliases. The keys of the dictionary are relationship paths -- "department" and "department.location", for example. The values are the table aliases for the corresponding table -- "t1" and "t2", for example. The dictionary always has at least one entry: an entry for the EOSQLExpression's entity. The key of this entry is the empty string ("") and the value is "t0". The dictionary returned from this method is built up over time with successive calls to sqlStringForAttributePath.
     */
    public com.webobjects.foundation.NSMutableDictionary aliasesByRelationshipPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns according to flag an adaptor specific string for use in a CREATE TABLE statement. The returned string indicates whether a column allows null values. EOSQLExpression's implementation returns the empty string if flag is true, "NOT NULL" otherwise. A subclass should override this if its database server's semantics are different.
     */
    public java.lang.String allowsNullClauseForConstraint(boolean flag){
        return null; //TODO codavaj!!
    }

    /**
     * Adds itemString to a comma-separated list. If listString already has entries, this method appends a comma followed by itemString.
     */
    public void appendItemToListString(java.lang.String itemString, java.lang.StringBuffer listString){
        return; //TODO codavaj!!
    }

    /**
     * This method is invoked from prepareDeleteExpressionForQualifier to return an SQL DELETE statement. The statement is of the form: DELETE FROM tableList SQL_WHERE whereClause
     */
    public java.lang.String assembleDeleteStatementWithQualifier(com.webobjects.eocontrol.EOQualifier qualifier, java.lang.String tableList, java.lang.String whereClause){
        return null; //TODO codavaj!!
    }

    /**
     * This method is invoked from prepareInsertExpressionWithRow to return an SQL INSERT statement. The statement is of the form: INSERT INTO tableList (columnList) VALUES valueList or, if columnList is null: INSERT INTO tableList VALUES valueList
     */
    public java.lang.String assembleInsertStatementWithRow(com.webobjects.foundation.NSDictionary row, java.lang.String tableList, java.lang.String columnList, java.lang.String valueList){
        return null; //TODO codavaj!!
    }

    /**
     * This method is invoked from addJoinClause to return a JOIN clause. The clause is of the form: leftName
     * i
     * operator
     * /i
     * rightName where
     * is "=" for an inner join, "*=" for a left-outer join, and "=*" for a right-outer join.
     */
    public java.lang.String assembleJoinClause(java.lang.String leftName, java.lang.String rightName, int semantic){
        return null; //TODO codavaj!!
    }

    /**
     * This method is invoked from prepareSelectExpressionWithAttributes to return an SQL SELECT statement. The statment is of the form: SELECT columnList FROM tableList lockClause WHERE whereClause AND joinClause ORDER BY orderByClause If lockClause is null, it is omitted from the statement. Similarly, if orderByClause is null, the "ORDER BY orderByClause" is omitted. If either whereClause or joinClause is null, the "AND" and null-valued argument are omitted. If both are null, the entire WHERE clause is omitted. attributes, lock, qualifer, fetchOrder arguments to prepareSelectExpressionWithAttributes from which the other assembleSelect... arguments were derived. They are provided for subclasses that need to generate the clauses of the SELECT statement in a particular way.
     */
    public java.lang.String assembleSelectStatementWithAttributes(com.webobjects.foundation.NSArray attributes, boolean lock, com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.foundation.NSArray fetchOrder, java.lang.String selectString, java.lang.String columnList, java.lang.String tableList, java.lang.String whereClause, java.lang.String joinClause, java.lang.String orderByClause, java.lang.String lockClause){
        return null; //TODO codavaj!!
    }

    /**
     * This method is invoked from prepareUpdateExpressionWithRow to return an SQL UPDATE statement. The statement is of the form: UPDATE tableList SET updateList WHERE whereClause row and qualifier are the arguments to prepareUpdateExpressionWithRow from which updateList and whereClause were derived. They are provided for subclasses that need to generate the clauses of the UPDATE statement in a particular way.
     */
    public java.lang.String assembleUpdateStatementWithRow(com.webobjects.foundation.NSDictionary row, com.webobjects.eocontrol.EOQualifier qualifier, java.lang.String tableList, java.lang.String updateList, java.lang.String whereClause){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the bind variable dictionaries.
     */
    public com.webobjects.foundation.NSArray bindVariableDictionaries(){
        return null; //TODO codavaj!!
    }

    /**
     * Implemented by subclasses to create and return the bind variable dictionary for attribute and value. The dictionary returned from this method must contain the following key-value pairs:
     * Key Corresponding Value BindVariableNameKey Name of the bind variable for attribute BindVariablePlaceHolderKey Placeholder string used in the SQL statement BindVariableAttributeKey attribute BindVariableValueKey value
     * An adaptor subclass may define additional entries as required by its RDBMS.
     * Invoked from sqlStringForValue when the message mustUseBindVariableForAttribute returns true or when the receiver's class uses bind variables and the message shouldUseBindVariableForAttribute returns true.
     * A subclass that uses bind variables should implement this method without invoking EOSQLExpression's implementation. The subclass implementation must return a dictionary with entries for the keys listed above and may add additional keys.
     */
    public abstract com.webobjects.foundation.NSMutableDictionary bindVariableDictionaryForAttribute(com.webobjects.eoaccess.EOAttribute attribute, java.lang.Object value);

    /**
     * Returns an adaptor specific type string for attribute that's suitable for use in a CREATE TABLE statement. EOSQLExpression's implementation creates a string based on anAttribute's externalType, precision, and width as follows:
     * A subclass should override the default implementation if its database server requires column types in a different format.
     */
    public java.lang.String columnTypeStringForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's entity.
     */
    public com.webobjects.eoaccess.EOEntity entity(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String with the character used to quote SQL identifiers that use unusual characters which would not otherwise be legal.
     */
    public java.lang.String externalNameQuoteCharacter(){
        return null; //TODO codavaj!!
    }

    /**
     * Applies the format specified by format to a SQL string sqlString.
     */
    public java.lang.String formatSQLString(java.lang.String sqlString, java.lang.String format){
        return null; //TODO codavaj!!
    }

    /**
     * Formats string for use as a string constant in a SQL statement. EOSQLExpression's implementation encloses the string in single quotes, escaping any single quotes already present in string.
     */
    public java.lang.String formatStringValue(java.lang.String string){
        return null; //TODO codavaj!!
    }

    /**
     * This method should be overridden by subclasses to return a string representation of value suitable for use in an SQL statement, depending on attribute's externalType. For example, a subclass might format a date using a special database-specific syntax or standard form or truncate numbers to attribute's precision and scale. EOSQLExpression's implementation merely returns the string representation of value.
     */
    public java.lang.String formatValueForAttribute(java.lang.Object value, com.webobjects.eoaccess.EOAttribute attribute){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the part of the receiver's WHERE clause that specifies join conditions. Together, the joinExpression and the whereClauseString make up a statement's WHERE clause. If the receiver's statement doesn't contain join conditions, this method returns an empty string.
     * An EOSQLExpression's joinClauseString is generally set by invoking joinExpression.
     */
    public java.lang.String joinClauseString(){
        return null; //TODO codavaj!!
    }

    /**
     * Builds up the joinClauseString for use in a SELECT statement. For each relationship path in the aliasesByRelationshipPath dictionary, this method invokes addJoinClause for each of the relationship's EOJoin objects.
     * If the aliasesByRelationshipPath dictionary only has one entry (the entry for the EOSQLExpression's entity), the joinClauseString is empty.
     * You must invoke this method after invoking addSelectListAttribute for each attribute to be selected and after sending sqlStringForSQLExpression(this) to the qualifier for the SELECT statement. (These methods build up the aliasesByRelationshipPath dictionary by invoking sqlStringForAttributePath.)
     */
    public void joinExpression(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a comma-separated list of attributes or "attribute = value" assignments. listString is built up with successive invocations of addInsertListAttribute, addSelectListAttribute, or addUpdateListAttribute for INSERT statements, SELECT statements, and UPDATE statements, respectively. The contents of listString vary according to the type of statement the receiver is building:
     */
    public java.lang.String listString(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return the SQL string used in a SELECT statement to lock selected rows. A concrete subclass of EOSQLExpression must override this method to return the string used by its adaptor's RDBMS.
     */
    public java.lang.String lockClause(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver must use bind variables for attribute, false otherwise. EOSQLExpression's implementation returns false. An SQL expression subclass that uses bind variables should override this method to return true if the underlying RDBMS requires that bind variables be used for attributes with attribute's external type.
     */
    public boolean mustUseBindVariableForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the comma-separated list of "attribute direction" pairs ("LAST_NAME asc, FIRST_NAME asc", for example) for use in a SELECT statement.
     */
    public java.lang.String orderByString(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the receiver's statement to an adaptor specific constraint for relationship. EOSQLExpression's implementation generates statements of the form: ALTER TABLE TABLE_NAME ADD CONSTRAINT CONSTRAINT_NAME FOREIGN KEY (SOURCE_KEY_LIST) REFERENCES DESTINATION_TABLE_NAME (DESTINATION_KEY_LIST) Where TABLE_NAME is the external name of the receiver's entity. CONSTRAINT_NAME is the external name of the receiver's entity, relationship's name, and the string "FK", concatenated with underbars between them (EMPLOYEE_MANAGER_FK, for example), SOURCE_KEY_LIST is a comma-separated list of the source columns in sourceColumns. DESTINATION_TABLE_NAME is the external name of relationship's destination entity. DESTINATION_KEY_LIST is a comma-separated list of the destination columns in destinationColumns
     */
    public void prepareConstraintStatementForRelationship(com.webobjects.eoaccess.EORelationship relationship, com.webobjects.foundation.NSArray sourceColumns, com.webobjects.foundation.NSArray destinationColumns){
        return; //TODO codavaj!!
    }

    /**
     * Generates a DELETE statement. It is done by performing the following steps: Generates the receiver's whereClauseString. Invokes tableListWithRootEntity to get the table name for the FROM clause. Invokes assembleDeleteStatementWithQualifier.
     */
    public void prepareDeleteExpressionForQualifier(com.webobjects.eocontrol.EOQualifier qualifier){
        return; //TODO codavaj!!
    }

    /**
     * Generates an INSERT statement. It is done by performing the following steps: Invokes addInsertListAttribute for each entry in row to prepare the comma-separated list of attributes and the corresponding list of values. Invokes tableListWithRootEntity to get the table name. Invokes assembleInsertStatementWithRow.
     */
    public void prepareInsertExpressionWithRow(com.webobjects.foundation.NSDictionary row){
        return; //TODO codavaj!!
    }

    /**
     * Generates a SELECT statement. It is done by performing the following steps: Invokes addSelectListAttribute for each entry in attributes to prepare the comma-separated list of attributes. Use fetchSpec's qualifier to generate the receiver's whereClauseString}. Invokes addOrderByAttributeOrdering for each EOAttributeOrdering object in fetchSpec. First conjoins the qualifier in fetchSpec with the restricting qualifier, if any, of the receiver's entity. Invokes joinExpression to generate the receiver's joinClauseString. Invokes tableListWithRootEntity to get the comma-separated list of tables for the FROM clause. If flag lock is true, invokes lockClause to get the SQL string to lock selected rows. Invokes assembleSelectStatementWithAttributes.
     */
    public void prepareSelectExpressionWithAttributes(com.webobjects.foundation.NSArray attributes, boolean lock, com.webobjects.eocontrol.EOFetchSpecification fetchSpec){
        return; //TODO codavaj!!
    }

    /**
     * Generates an UPDATE statement. It is done by performing the following steps: Invokes addUpdateListAttribute for each entry in row to prepare the comma-separated list of "attribute = value" assignments. Generates the receiver's whereClauseString using qualifer. Invokes tableListWithRootEntity to get the table name for the FROM clause. Invokes assembleUpdateStatementWithRow.
     */
    public void prepareUpdateExpressionWithRow(com.webobjects.foundation.NSDictionary row, com.webobjects.eocontrol.EOQualifier qualifier){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's SQL statement to statement, which should be a valid expression in the target query language. This method can be used instead of a prepare... method to directly assign an SQL string to an EOSQLExpression object. This method does not perform substitutions or formatting of any kind.
     */
    public void setStatement(java.lang.String statement){
        return; //TODO codavaj!!
    }

    /**
     * Tells the receiver whether or not to use table aliases.
     */
    public void setUseAliases(boolean useAliases){
        return; //TODO codavaj!!
    }

    /**
     * Sets according to flag whether all instances of EOSQLExpression subclasses use bind variables.
     */
    public void setUseBindVariables(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static void setUseQuotedExternalNames(boolean bool){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver can provide a bind variable dictionary for attribute, false otherwise. Bind variables aren't used for values associated with this attribute when useBindVariables returns false. EOSQLExpression's implementation returns false. An SQL expression subclass should override this method to return true if the receiver should use bind variables for attributes with attribute's external type. It should also return true for any attribute for which the receiver must use bind variables.
     */
    public boolean shouldUseBindVariableForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the char used for the ESCAPE clause in an SQL LIKE expression. The default is backslash '\\'. A subclass should return (char)0 if the database doesn't support LIKE...ESCAPE...
     */
    public char sqlEscapeChar(){
        return ' '; //TODO codavaj!!
    }

    /**
     * Translates a "like" qualifier to an SQL LIKE expression. Invoked from sqlStringForKeyValueQualifier when the qualifier argument is an EOKeyValueQualifier object whose selector is EOQualifier.QualifierOperatorLike. EOSQLExpression's implementation performs the following substitutions:
     * Literal '%' and '_' are actually "escaped" using the sqlEscapeChar, typically backslash '\\' as shown.
     */
    public java.lang.String sqlPatternFromShellPattern(java.lang.String pattern){
        return null; //TODO codavaj!!
    }

    /**
     * Like sqlPatternFromShellPattern except that escapeCharacter allows you to specify a character for escaping the SQL wild card characters "%" and "_". Doing so escapes those characters in the return value (it does not allow the input, sqlPatternFromShellPattern, to contain those escaped characters).
     */
    public java.lang.String sqlPatternFromShellPatternWithEscapeCharacter(java.lang.String pattern, char escapeCharacter){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the SQL string for attribute, complete with a table alias if the receiver uses table aliases. Invoked from sqlStringForAttributeNamed when the attribute name is not a path.
     */
    public java.lang.String sqlStringForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the SQL string for the attribute name, complete with a table alias if the receiver uses table aliases. Generates the return value using sqlStringForAttributePath if name is an attribute path ("department.name", for example); otherwise, uses sqlStringForAttribute.
     */
    public java.lang.String sqlStringForAttributeNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the SQL string for path, complete with a table alias if the receiver uses table aliases. Invoked from sqlStringForAttributeNamed when the specified attribute name is a path ("department.location.officeNumber", for example). path is an array of any number of EORelationship objects followed by an EOAttribute object. The EORelationship and EOAttribute objects each correspond to a component in path. For example, if the attribute name argument to sqlStringForAttributeNamed is "department.location.officeNumber", path is an array containing the following objects in the order listed: The EORelationship object in the receiver's entity named "department". (Assume the relationship's destination entity is named "Department".) The EORelationship object in the Department entity named "location". (Assume the relationship's destination entity is named "Location".) The EOAttribute object in the Location entity named "officeNumber".
     * Assuming that the receiver uses aliases and the alias for the Location table is t2, the SQL string for this sample attribute path is "t2.officeNumber".
     * If the receiver uses table aliases, this method has the side effect of adding a "relationship path"-"alias name" entry to the aliasesByRelationshipPath dictionary.
     */
    public java.lang.String sqlStringForAttributePath(com.webobjects.foundation.NSArray path){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return a case insensitive comparison of valueString and keyString. For example, a subclass implementation might return the string "UPPER(keyString) LIKE UPPER(valueString)".
     */
    public java.lang.String sqlStringForCaseInsensitiveLike(java.lang.String valueString, java.lang.String keyString){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns an SQL string that is the result of interposing the word "AND" between the SQL strings for the qualifiers in qualifiers. If the SQL string for a qualifier contains only white space, it isn't included in the return value. The return value is enclosed in parentheses if the SQL strings for two or more qualifiers were ANDed together.
     */
    public java.lang.String sqlStringForConjoinedQualifiers(com.webobjects.foundation.NSArray qualifiers){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the SQL string for a data of type NSData. The default implementation returns the hexadecimal equivalent of data.
     */
    public java.lang.String sqlStringForData(com.webobjects.foundation.NSData data){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a SQL string that is the result of interposing the word "OR" between the SQL strings for the qualifiers in qualifiers. If the SQL string for a qualifier contains only white space, it isn't included in the return value. The return value is enclosed in parentheses if the SQL strings for two or more qualifiers were ORed together.
     */
    public java.lang.String sqlStringForDisjoinedQualifiers(com.webobjects.foundation.NSArray qualifiers){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a SQL string that is the result of interposing an operator between the SQL strings for the right and left keys in qualifier. Determines the SQL operator by invoking sqlStringForSelector with qualifier's selector and null for the value. Generates SQL strings for qualifier's keys by invoking sqlStringForAttributeNamed to get SQL strings. This method also formats the strings for the right and left keys using formatSQLString with the corresponding attributes' "read" formats.
     */
    public java.lang.String sqlStringForKeyComparisonQualifier(com.webobjects.eocontrol.EOKeyComparisonQualifier qualifier){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a SQL string that is the result of interposing an operator between the SQL strings for qualifier's key and value. Determines the SQL operator by invoking sqlStringForSelector with qualifier's selector and value. Generates an SQL string for qualifier's key by invoking sqlStringForAttributeNamed to get an SQL string and formatSQLString with the corresponding attribute's "read" format. Similarly, generates an SQL string for qualifier's value by invoking sqlStringForValue to get an SQL string and formatValueForAttribute to format it. (First invokes sqlPatternFromShellPattern for the value if qualifier's selector is EOQualifier.QualifierOperatorLike.)
     */
    public java.lang.String sqlStringForKeyValueQualifier(com.webobjects.eocontrol.EOKeyValueQualifier qualifier){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a SQL string that is the result of surrounding the SQL string for qualifier in parentheses and appending it to the word "not". For example, if the string for qualifier is "FIRST_NAME = 'John'", sqlStringForNegatedQualifier returns the string "not (FIRST_NAME = 'John')". If the SQL string for qualifier contains only white space, this method returns null.
     */
    public java.lang.String sqlStringForNegatedQualifier(com.webobjects.eocontrol.EOQualifier qualifier){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the SQL string for number.
     */
    public static java.lang.String sqlStringForNumber(java.lang.Number number){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a SQL statement for qualifier suitable for inclusion in a WHERE clause. Invoked from an EOSQLExpression while it's preparing a SELECT, UPDATE, or DELETE statement.
     */
    public java.lang.String sqlStringForQualifier(com.webobjects.eoaccess.EOQualifierSQLGeneration qualifier){
        return null; //TODO codavaj!!
    }

    /**
     * Returns name enclosed in the external name quote character if the receiver uses quoted external names, otherwise simply returns name unaltered.
     */
    public java.lang.String sqlStringForSchemaObjectName(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a SQL operator for selector and value. The possible values for selector are defined as constants in EOQualifier. The following table summarizes EOSQLExpression's default mapping:
     */
    public java.lang.String sqlStringForSelector(com.webobjects.foundation.NSSelector selector, java.lang.Object value){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the SQL string for string.
     */
    public static java.lang.String sqlStringForString(java.lang.String string){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string for value appropriate for use in an SQL statement. If the receiver uses a bind variable for the attribute named keyPath, then sqlStringForValue gets the bind variable dictionary for the attribute, adds it to the receiver's array of bind variables dictionaries, and returns the value for the binding's BindVariablePlaceHolderKey. Otherwise, this method invokes formatValueForAttribute and returns the formatted string for value.
     */
    public java.lang.String sqlStringForValue(java.lang.Object value, java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * An SQL statement can be assigned to an EOSQLExpression object directly using expressionForString or using setStatement. Generally, however, an EOSQLExpression's statement is built up using one of the following methods:
     * prepareSelectExpressionWithAttributes prepareInsertExpressionWithRow prepareUpdateExpressionWithRow prepareDeleteExpressionForQualifier
     */
    public java.lang.String statement(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the comma-separated list of tables for use in a SELECT, UPDATE, or DELETE statement's FROM clause. If the receiver doesn't use table aliases, the table list consists only of the table name for entity-"EMPLOYEE", for example. If the receiver does use table aliases (only in SELECT statements by default), the table list is a comma separated list of table names and their aliases, for example: EMPLOYEE t0, DEPARTMENT t1 tableListWithRootEntity creates a string containing the table name for entity and a corresponding table alias ("EMPLOYEE t0", for example). For each entry in aliasesByRelationshipPath, this method appends a new table name and table alias.
     */
    public java.lang.String tableListWithRootEntity(com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a readable description of the SQL expression.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver generates statements with table aliases, false otherwise. For example, the following SELECT statement uses table aliases: SELECT t0.FIRST_NAME, t0.LAST_NAME, t1.NAME FROM EMPLOYEE t0, DEPARTMENT t1 WHERE t0.DEPARTMENT_ID = t1.DEPARTMENT_ID The EMPLOYEE table has the alias t0, and the DEPARTMENT table has the alias t1.
     * By default, EOSQLExpression uses table aliases only in SELECT statements. Enterprise Objects Framework assumes that INSERT, UPDATE, and DELETE statements are single-table operations.
     */
    public boolean useAliases(){
        return false; //TODO codavaj!!
    }

    /**
     * Queries if instances use bind variables. By default, instances don't; if the value for the System property "EOAdaptorUseBindVariables" is "true", instances do use them.
     */
    public boolean useBindVariables(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static boolean useQuotedExternalNames(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the comma-separated list of values used in an INSERT statement. For example, the value list for the following INSERT statement: INSERT EMPLOYEE (FIRST_NAME, LAST_NAME, EMPLOYEE_ID, DEPARTMENT_ID, SALARY) VALUES ('Shaun', 'Hayes', 1319, 23, 4600) is "'Shaun', 'Hayes', 1319, 23, 4600". An EOSQLExpression's valueList is generated a value at a time with addInsertListAttribute messages.
     */
    public java.lang.String valueList(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the part of the receiver's WHERE clause that qualifies rows. The whereClauseString does not specify join conditions; the joinClauseString does that. Together, the whereClauseString and the joinClauseString make up a statement's where clause. For example, a qualifier for an Employee entity specifies that a statement only affects employees who belong to the Finance department and whose monthly salary is greater than $4500. Assume the corresponding where clause looks like this: WHERE EMPLOYEE.SALARY
     * 4500 AND DEPARTMENT.NAME = 'Finance' AND EMPLOYEE.DEPARTMENT_ID = DEPARTMENT.DEPARTMENT_ID EOSQLExpression generates both a whereClauseString and a joinClauseString for this qualifier. The whereClauseString qualifies the rows and looks like this: EMPLOYEE.SALARY
     * 4500 AND DEPARTMENT.NAME = 'Finance' The joinClauseString specifies the join conditions between the EMPLOYEE table and the DEPARTMENT table and looks like this: EMPLOYEE.DEPARTMENT_ID = DEPARTMENT.DEPARTMENT_ID
     */
    public java.lang.String whereClauseString(){
        return null; //TODO codavaj!!
    }

    /**
     * This interface defines API for objects that can provide values for themselves to be used in SQL statements. Classes that implement the method -- EOAttribute, EOEntity, EORelationship, and EOSQLQualifier -- declare that they implement this method.
     */
    public static interface SQLValue{
        /**
         * Returns a String to be used to represent the receiver in an SQL statement.
         */
        abstract java.lang.String valueForSQLExpression(com.webobjects.eoaccess.EOSQLExpression context);

    }
}
