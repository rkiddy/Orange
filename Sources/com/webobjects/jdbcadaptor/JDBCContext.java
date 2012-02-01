package com.webobjects.jdbcadaptor;
public class JDBCContext extends com.webobjects.eoaccess.EOAdaptorContext{
    public static final java.lang.String ANSI92ConformanceKey="ANSI92_CONFORMANCE";

    public static final java.lang.String ANSIEntryConformance="ANSI92EntryLevel";

    public static final java.lang.String ANSIFullConformance="ANSI92Full";

    public static final java.lang.String ANSIIntermediateConformance="ANSI92Intermediate";

    public static final java.lang.String CreateParamsKey="createParams";

    public static final java.lang.String DBMSNameKey="DBMS_NAME";

    public static final java.lang.String DefaultJDBCTypeKey="defaultJDBCType";

    public static final java.lang.String DriverNameKey="DRIVER_NAME";

    public static final java.lang.String DriverVersionKey="DRIVER_VER";

    public static final java.lang.String IdentifierQuoteStringKey="IDENTIFIER_QUOTE_STRING";

    public static final java.lang.String InternalTypeKey="internalType";

    public static final java.lang.String MaxScaleKey="maxScale";

    public static final java.lang.String MinScaleKey="minScale";

    public static final java.lang.String NonNullableColumnsKey="NON_NULLABLE_COLUMNS";

    public static final java.lang.String NullableKey="isNullable";

    public static final java.lang.String PrecisionKey="precision";

    public static final java.lang.String SearchableKey="isSearchable";

    public static final java.lang.String StringFunctionsKey="STRING_FUNCTIONS";

    public JDBCContext(com.webobjects.eoaccess.EOAdaptor adaptor){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to attempt to begin a new transaction. A successful invocation of beginTransaction must be paired with an invocation of either commitTransaction or rollbackTransaction to end the transaction.
     * The Enterprise Objects Framework automatically wraps database operations in transactions, so you don't have to begin and end transactions explicitly. In fact, letting the framework manage transactions is sometimes more efficient. You typically implement beginTransaction only to execute more than one database operation in the same transaction scope.
     * This method should invoke the delegate method adaptorContextShouldBegin before beginning the transaction. If the transaction is begun successfully, the method should invoke transactionDidBegin on the receiver and invoke the delegate method adaptorContextDidBegin. Should throw a runtime exception if the attempt is unsuccessful. Some possible reasons for failure are:
     * A connection to the database hasn't been established. A transaction is already in progress. A fetch is in progress. The delegate refuses. The database server fails to begin a transaction.
     */
    public void beginTransaction(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to attempt to commit the last transaction begun. Should invoke the delegate method adaptorContextShouldCommit before committing the transaction. If the transaction is committed successfully, the method should invoke transactionDidCommit and invoke the delegate method adaptorContextDidCommit. Should throw a runtime exception if the attempt is unsuccessful. Some possible reasons for failure are: A transaction is not in progress. Fetches are in progress. The delegate refuses. The database server fails to commit.
     */
    public void commitTransaction(){
        return; //TODO codavaj!!
    }

    public boolean connect() throws com.webobjects.jdbcadaptor.JDBCAdaptorException{
        return false; //TODO codavaj!!
    }

    public java.sql.Connection connection(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to create and return a new EOAdaptorChannel, or null if a new channel cannot be created. Should set the new channel's adaptorContext to this.
     * A newly created adaptor context has no channels. Specific adaptors have different limits on the maximum number of channels a context can have, and createAdaptorChannel should fail if a creating a new channel would exceed the limits.
     */
    public com.webobjects.eoaccess.EOAdaptorChannel createAdaptorChannel(){
        return null; //TODO codavaj!!
    }

    public void disconnect() throws com.webobjects.jdbcadaptor.JDBCAdaptorException{
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to clean up after the receiver's adaptor has lost its connection to its database server. Invoked from EOAdaptor's handleDroppedConnection, this method should clean up the state of the receiver and its adaptor channels so they can be safely disposed of without any errors. Subclasses must implement this method if the adaptor supports automatic database reconnection.
     * Never invoke this method yourself; it is invoked automatically by the Enterprise Objects Framework.
     */
    public void handleDroppedConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to attempt to roll back the last transaction begun. Should invoke the delegate method adaptorContextShouldRollback before rolling back the transaction. If the transaction is begun successfully, the method should invoke transactionDidRollback and invoke the delegate method adaptorContextDidRollback. Should throw a runtime exception if the attempt is unsuccessful. Some possible reasons for failure are: A transaction is not in progress. Fetches are in progress. The delegate refuses. The database server fails to rollback.
     */
    public void rollbackTransaction(){
        return; //TODO codavaj!!
    }

    public void setupJndiConfiguration() throws com.webobjects.jdbcadaptor.JDBCAdaptorException{
        return; //TODO codavaj!!
    }

}
