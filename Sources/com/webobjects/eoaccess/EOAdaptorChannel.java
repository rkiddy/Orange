package com.webobjects.eoaccess;
/**
 * EOAdaptorChannel is an abstract class that provides its concrete subclasses with a structure for performing database operations. It is associated with EOAdaptor and EOAdaptorContext, which, together with EOAdaptorChannel, form the adaptor level of Enterprise Objects Framework's access layer.
 * Concrete subclasses of EOAdaptorChannel provide database-specific method implementations and represent an independent communication channel to the database server to which its EOAdaptor object is connected. You never interact with instances of the EOAdaptorChannel class, rather the Enterprise Objects Framework applications use instances of concrete subclasses that are written to interact with a specific database or other persistent storage system.
 * An EOAdaptorChannel represents an independent communication channel to the database server. Adaptor channels are used to manipulate rows (records) by selecting, fetching, inserting, updating, and deleting them. An EOAdaptorChannel also gives access to some of the meta-data on the server (which entities exist, and what their basic attributes or relationships are).
 * An EOAdaptorChannel works with an EOAdaptorContext object, which handles transactions. All of an EOAdaptorChannel's operations take place within the context of transactions controlled or tracked by the EOAdaptorContext. An EOAdaptorContext may manage several EOAdaptorChannels, but a channel is associated with only one context. Not all adaptors support multiple channels per context. See EOAdaptor and EOAdaptorContext documentation for more information.
 * Any EOAdaptorChannel method that uses attribute names uses the internal names of the EOAttribute objects, not the external names in the database server. External names are only used privately by an adaptor channel and in the evaluateExpression method, which sends an expression directly to the server for processing.
 * You can assign a delegate to an adaptor channel. The EOAdaptorChannel sends certain messages directly to the delegate, and the delegate responds to these messages on the channel's behalf. Many of the adaptor channel methods notify the channel's delegate before and after an operation is performed. Some delegate methods, such as adaptorChannelShouldEvaluateExpression, let the delegate determine whether the channel should perform an operation. Others, such as adaptorChannelDidEvaluateExpression, simply inform the delegate that an operation has occurred. The delegate has an opportunity to respond by implementing the delegate methods. If the delegate wants to intervene, it implements adaptorChannelShouldEvaluateExpression . If it simply wants notification when a transaction has begun, it implements adaptorChannelDidEvaluateExpression.
 * The principal attributes of the EOAdaptorChannel class are:
 * To create an instance of a concrete EOAdaptorChannel subclass, you send a createAdaptorChannel message to an instance of the corresponding EOAdaptorContext subclass. You rarely create adaptor channels yourself. They are generally created automatically by other framework objects.
 * The following table lists EOAdaptorChannel's more commonly-used methods:
 * Method Description openChannel Opens the channel so it can perform database operations. closeChannel Close the channel. selectAttributes Selects rows matching the specified qualifier. fetchRow Fetches a row resulting from the last selectAttributes, executeStoredProcedure, or evaluateExpression. insertRow Inserts the specified row. updateValuesInRowsDescribedByQualifier Updates the row described by the specified qualifier. deleteRowDescribedByQualifier Deletes the row described by the specified qualifier. executeStoredProcedure Performs the specified stored procedure. evaluateExpression Sends the specified expression to the database. performAdaptorOperation Performs an adaptor operation by invoking the EOAdaptorChannel method appropriate for performing the specified operation.
 * EOAdaptorChannel provides many default method implementations that are sufficient for concrete subclasses:
 * The following methods establish structure and conventions that other Enterprise Objects Framework classes depend on and should be overridden with caution:
 * If you override any of the above methods, the implementations should incorporate the superclass's implementation by calling super.
 * The remaining EOAdaptorChannel methods must be overridden by concrete subclasses in terms of the persistent storage system with which the adaptor channel interacts:
 */
public abstract class EOAdaptorChannel{
    /**
     * A userInfo dictionary key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String AdaptorFailureKey="EOAdaptorFailureKey";

    /**
     * A userInfo dictionary key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String AdaptorOperationsKey="EOAdaptorOperationsKey";

    /**
     * A userInfo dictionary key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String AdaptorOptimisticLockingFailure="EOAdaptorOptimisticLockingFailure";

    /**
     * A userInfo dictionary key.
     * See Also:Constant Field Values
     */
    public static final java.lang.String FailedAdaptorOperationKey="EOFailedAdaptorOperationKey";

    /**
     * Creates and returns an EOAdaptorChannel with the adaptor context context. Subclasses of EOAdaptorChannel should override this method.
     * You shouldn't invoke this method directly unless you are implementing a concrete adaptor context. It is invoked automatically from createAdaptorChannel, the EOAdaptorContext method used to create a new adaptor channel.
     * Parameters:context - The EOAdaptorContext that controls transactions for the channel.See Also:EOAdaptorContext.createAdaptorChannel(), EOAdaptorChannel.adaptorContext()
     */
    public EOAdaptorChannel(com.webobjects.eoaccess.EOAdaptorContext context){
         //TODO codavaj!!
    }

    /**
     * Returns the receiver's EOAdaptorContext. Subclasses of EOAdaptorChannel don't need to override this method.
     */
    public com.webobjects.eoaccess.EOAdaptorContext adaptorContext(){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation of this method does nothing. It can be overridden by subclasses to create EOStoredProcedure objects for the stored procedures named in storedProcedureNames and then to add them to model. Should throw a runtime exception if an error occurs.
     * This method is used in conjunction with describeStoredProcedureNames to build a default model in EOModeler.
     */
    public void addStoredProceduresNamed(com.webobjects.foundation.NSArray storedProcedureNames, com.webobjects.eoaccess.EOModel model){
        return; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to return the set of attributes to retrieve when fetchRow is next invoked.
     */
    public abstract com.webobjects.foundation.NSArray attributesToFetch();

    /**
     * An abstract method that should be implemented by subclasses to clear all result sets established by the last selectAttributes, executeStoredProcedure, or evaluateExpression message and terminate the current fetch, so that isFetchInProgress returns false.
     */
    public abstract void cancelFetch();

    /**
     * An abstract method that should be implemented by subclasses to close the EOAdaptorChannel so that it can't perform operations with the server. Any fetch in progress should be canceled.
     * If the receiver is the last open channel in an adaptor context and if the channel's adaptor context has outstanding transactions, closing the channel has server-dependent results: some database servers roll back all outstanding transactions but others do nothing. Regardless of whether outstanding transactions are rolled back, this method has the side effect of closing the receiver's adaptor context's connection with the database if the receiver is its adaptor context's last open channel.
     */
    public abstract void closeChannel();

    /**
     * Returns the receiver's delegate, or null if the receiver doesn't have a delegate. A subclass of EOAdaptorChannel doesn't need to override this method.
     */
    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Deletes the row described by qualifier from the database table corresponding to entity. Invokes deleteRowsDescribedByQualifier and throws an exception unless exactly one row is deleted. Subclasses of EOAdaptorChannel don't need to override this method.
     */
    public void deleteRowDescribedByQualifier(com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to delete the rows described by qualifier from the database table corresponding to entity. Should return the number of rows deleted. Should throw a runtime exception on failure. Some possible reasons for failure are: The adaptor channel isn't open. The adaptor channel is in an invalid state (for example, it's fetching). An error occurs in the database server.
     */
    public abstract int deleteRowsDescribedByQualifier(com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOEntity entity);

    /**
     * The default implementation of this method returns null. It can be overridden by subclasses to create and return a default model containing entities for the tables specified in tableNames and assign the adaptor name and connection dictionary to the new model. This method is typically used in conjunction with describeTableNames and describeStoredProcedureNames.
     */
    public com.webobjects.eoaccess.EOModel describeModelWithTableNames(com.webobjects.foundation.NSArray tableNames){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to return an array of EOAttributes describing the properties available in the current result set, as determined by selectAttributes, executeStoredProcedure, or a statement evaluated by evaluateExpression. Only invoke this method if a fetch is in progress as determined by isFetchInProgress.
     */
    public abstract com.webobjects.foundation.NSArray describeResults();

    /**
     * The default implementation of this method returns an empty array. It can be overridden by subclasses to read and return an array of stored procedure names from the database. Should throw a runtime exception if an error occurs.
     * This method is used in conjunction with addStoredProceduresNamed to build a default model in EOModeler.
     */
    public com.webobjects.foundation.NSArray describeStoredProcedureNames(){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation of this method returns an empty array. It can be overridden by subclasses to read and return an array of table names from the database metadata.
     * This method is used in conjunction with describeStoredProcedureNames to build a default model in EOModeler.
     */
    public com.webobjects.foundation.NSArray describeTableNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Used by EOAdaptorChannel subclasses to create dictionaries that can be returned from fetchRow. You don't ordinarily invoke this method unless you are writing your own concrete adaptor. If you are writing a concrete adaptor, use of this method is optional but strongly recommended because it enables performance optimizations. The objects in objects are the values for the row that correspond to the EOAttribute objects in attributes.
     * A subclass of EOAdaptorChannel shouldn't override this method.
     */
    public com.webobjects.foundation.NSMutableDictionary dictionaryWithObjectsForAttributes(java.lang.Object[] objects, com.webobjects.foundation.NSArray attributes){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to send expression to the database server for evaluation, beginning a transaction first and committing it after evaluation if a transaction isn't already in progress. Should throw a runtime exception if an error occurs. An adaptor channel uses this method to send SQL expressions to the database.
     * If expression results in a select operation being performed, you can fetch the results as you would if you had invoked selectAttributes. You must use the method setAttributesToFetch before you begin fetching. If expression evaluates to multiple result sets, you must invoke setAttributesToFetch before you begin fetching each subsequent set.
     * evaluateExpression invokes the delegate methods adaptorChannelShouldEvaluateExpression and adaptorChannelDidEvaluateExpression.
     * The upper layers of the Framework never invoke evaluateExpression directly. Thus, in adaptors for data stores that don't naturally support an expression language (for example, flat file adaptors), the implementation of this method doesn't need to do anything in order for the adaptor to work with the Framework.
     */
    public abstract void evaluateExpression(com.webobjects.eoaccess.EOSQLExpression expression);

    /**
     * An abstract method that should be implemented by subclasses to execute storedProcedure. Any arguments to the stored procedure are in values, a dictionary whose keys are the argument names. You should use fetchRow to get result rows and returnValuesForLastStoredProcedureInvocation to get return arguments and result status, if any. Should throw a runtime exception if an error occurs.
     * The upper layers of the Framework never invoke executeStoredProcedure directly. Thus, in adaptors for data stores that don't naturally support stored procedures, the implementation of this method doesn't need to do anything in order for the adaptor to work with the Framework.
     */
    public abstract void executeStoredProcedure(com.webobjects.eoaccess.EOStoredProcedure storedProcedure, com.webobjects.foundation.NSDictionary values);

    /**
     * An abstract method that should be implemented by subclasses to fetch the next row from the result set of the last selectAttributes, executeStoredProcedure, or evaluateExpression message sent to the receiver. Should return values for the receiver's attributesToFetch in a dictionary whose keys are the attribute names. When there are no more rows in the current result set, this method should return null and invoke the delegate method adaptorChannelDidChangeResultSet if there are more results sets.
     * When there are no more rows or result sets, this method should return null, end the fetch, and invoke adaptorChannelDidFinishFetching. isFetchInProgress returns true until the fetch is canceled or until this method exhausts all result sets and returns null.
     * This method should also invoke the delegate methods adaptorChannelWillFetchRow and adaptorChannelDidFetchRow. Should throw a runtime exception if an error occurs.
     */
    public abstract com.webobjects.foundation.NSMutableDictionary fetchRow();

    /**
     * An abstract method that should be implemented by subclasses to insert the values of row into the table in the database that corresponds to entity. row is a dictionary whose keys are attribute names and whose values are the values to insert. Row keys must refer to attributes that all belong to entity and that are either non- flattened or all flattened through the same relationship path. Should throw a runtime exception on failure. Some possible reasons for failure are: The user logged in to the database doesn't have permission to insert a new row. The adaptor channel is in an invalid state (for example, fetching). The row fails to satisfy a constraint defined in the database server.
     */
    public abstract void insertRow(com.webobjects.foundation.NSDictionary row, com.webobjects.eoaccess.EOEntity entity);

    /**
     * An abstract method that should be implemented by subclasses to return true if the receiver is fetching, false otherwise. An adaptor channel is fetching if: It has successfully invoked selectAttributes. A stored procedure that returns rows has been successfully executed using executeStoredProcedure. An expression sent through evaluateExpression resulted in a select operation being performed.
     * An adaptor channel stops fetching when there are no more records to fetch or when cancelFetch is invoked.
     */
    public abstract boolean isFetchInProgress();

    /**
     * An abstract method that should be implemented by subclasses to return true if the channel has been opened with openChannel, false if not.
     */
    public abstract boolean isOpen();

    /**
     * Attempts to lock a row in the database by selecting it with locking on. The lock operation succeeds if a select statement generated with qualifier retrieves exactly one row and the values in the row match the values in snapshot, a dictionary whose keys are attribute names and whose values are the values that were last fetched from the database.
     * lockRowComparingAttributes invokes selectAttributes with atts as the attributes to select, a fetch specification built from qualifier, locking on, and entity as the entity. If the select returns no rows or more than one row, the method throws an exception. It also throws an exception if the values in the returned row don't match the corresponding values in snapshot.
     * The Framework uses this method whenever it needs to lock a row. When the Framework invokes it, qualifier specifies the primary key of the row to be locked and attributes used for locking to be compared in the database server. If any of the values specified in qualifier are different than the values in the database row, the select operation will not retrieve or lock the row. When this happens, the row to be locked has been updated in the database since it was last retrieved, and it isn't safe to update it.
     * Some attributes (such as BLOB types) can't be compared in the database. atts should specify any such attributes. (If the row doesn't contain any such attributes, atts can be null.) If qualifier generates a select statement that returns and locks a single row, this method performs an in-memory comparison between the value in the retrieved row and the value in snapshot for each attribute in atts. Therefore, snapshot must contain an entry for each attribute in atts. In addition, it must contain an entry for the row's primary key.
     * Subclasses of EOAdaptorChannel don't need to override this method.
     */
    public void lockRowComparingAttributes(com.webobjects.foundation.NSArray attributes, com.webobjects.eoaccess.EOEntity entity, com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.foundation.NSDictionary snapshot){
        return; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to put the channel, and both its context and adaptor, into a state where they are ready to perform database operations. Should throw a runtime exception if an error occurs.
     */
    public abstract void openChannel();

    /**
     * Performs adaptorOp by invoking the adaptor channel method appropriate for performing the specified operation. For example, if the adaptor operator for adaptorOp is EOAdaptorInsertOperator, this method invokes insertRow using information in adaptorOp to supply the arguments. Throws an exception if an error occurs.
     * A subclass of EOAdaptorChannel doesn't need to override this method.
     */
    public void performAdaptorOperation(com.webobjects.eoaccess.EOAdaptorOperation adaptorOp){
        return; //TODO codavaj!!
    }

    /**
     * Performs adaptor operations by invoking performAdaptorOperation with each EOAdaptorOperation object in the array adaptorOps. An adaptor channel subclass may be able to override this method to take advantage of database-specific batch processing capabilities. Invokes the delegate methods adaptorChannelWillPerformOperations and adaptorChannelDidPerformOperations.
     * This method throws a runtime exception if an error occurs; the exception's userInfo dictionary provides details about the error. The exception's userInfo dictionary contains these keys:
     * Constant The corresponding value in the exception's userInfo dictionary AdaptorOperationsKey An array of the EOAdaptorOperations being executed. FailedAdaptorOperationKey The particular EOAdaptorOperation that failed. AdaptorFailureKey If present, offers additional information on the type of error that occurred. Currently, the only possible value for this key is AdaptorOptimisticLockingFailure, which indicates that an update or lock operation failed because the row found in the database did not match the snapshot taken when the row was last fetched into the application.
     * Subclasses of EOAdaptorChannel don't need to override this method.
     */
    public void performAdaptorOperations(com.webobjects.foundation.NSArray adaptorOperations){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public com.webobjects.foundation.NSDictionary primaryKeyForNewRowWithEntity(com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray of primary key dictionaries for the number of new rows specified by count in the database table that corresponds to entity. The primary keys returned from this method are dictionaries whose keys are the primary key attribute names. For example, suppose you've got a table MOVIE with primary key MOVIE_ID, and the corresponding Movie entity's primary key attribute is movieID. In this scenario, each dictionary in the NSArray returned from this method has one entry whose key is movieID and whose value is the unique value to assign.
     * If the primary key is compound (made up of more than one attribute), the dictionary should contain an entry for each primary key attribute. Note, however, that the Enterprise Objects Frameworks adaptors don't handle compound primary keys; they return null if the primary key is compound.
     */
    public com.webobjects.foundation.NSArray primaryKeysForNewRowsWithEntity(int count, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to return values from the execution of a stored procedure. Used in conjunction with executeStoredProcedure. The dictionary returned by this method should have entries whose keys are the names of the stored procedure's parameters and whose values are the parameter values. The dictionary also should contain a special entry for the stored procedure's return value with the key
     * returnValue
     * .
     * Should return an empty dictionary for stored procedures that have void return types. Should return null if the stored procedure has results to fetch. In this case, you must use fetchRow until there are no more results to fetch before the return value will be available.
     */
    public abstract com.webobjects.foundation.NSDictionary returnValuesForLastStoredProcedureInvocation();

    /**
     * An abstract method that should be implemented by subclasses to select attributes in rows matching the qualifier in fetchSpecification and set the receiver's attributes to fetch. The selected rows compose one or more result sets, each row of which should be returned by subsequent fetchRow calls according to fetchSpecification's sort orderings. If the yn flag is true, the rows should be locked if possible so that no other user can modify them. The lock specification in fetchSpecification should be ignored. Should throw a runtime exception if an error occurs. Some possible reasons for failure are: The adaptor channel is in an invalid state (for example, fetching). The database failed to lock the specified rows.
     */
    public abstract void selectAttributes(com.webobjects.foundation.NSArray attributes, com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, boolean yn, com.webobjects.eoaccess.EOEntity entity);

    /**
     * An abstract method that should be implemented by subclasses to specify the set of attributes used to describe fetch data from a corresponding select. attribute is an array of the attributes to fetch. This method should be invoked after evaluateExpression but before the first call to fetchRow. This method should throw a runtime exception if invoked when there is no fetch in progress.
     */
    public abstract void setAttributesToFetch(com.webobjects.foundation.NSArray attributes);

    /**
     * Sets the receiver's delegate to delegate or removes its delegate if delegate is null. A subclass of EOAdaptorChannel doesn't need to override this method. A subclass that does override it must incorporate the superclass's version through a message to super.
     */
    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Updates the row described by qualifier with the new values in row. Invokes updateValuesInRowsDescribedByQualifier and throws an exception unless exactly one row is updated. A subclass of EOAdaptorChannel doesn't need to override this method.
     */
    public void updateValuesInRowDescribedByQualifier(com.webobjects.foundation.NSDictionary row, com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to update the rows described by qualifier with the values in row. row is a dictionary whose keys are attribute names and whose values are the new values for those attributes (the dictionary need only contain entries for the attributes being changed). Should return the number of updated rows. Should throw a runtime exception if an error occurs. Some possible reasons for failure are: The user logged in to the database doesn't have permission to update. The adaptor channel is in an invalid state (for example, fetching). The new values fail to satisfy a constraint defined in the database server.
     */
    public abstract int updateValuesInRowsDescribedByQualifier(com.webobjects.foundation.NSDictionary row, com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOEntity entity);

    /**
     * EOAdaptorChannel invokes its delegate for nearly every operation that would affect data in the database server. The delegate can use these methods to preempt these operations, modify their results, or simply track activity.
     */
    public static interface Delegate{
        /**
         * Invoked from fetchRow when a select operation resulted in multiple result sets. This method tells the delegate that the next invocation of fetchRow will fetch from the next result set. This method is invoked when fetchRow returns null and there are still result sets left to fetch. The delegate can invoke setAttributesToFetch to prepare for fetching the new rows.
         */
        abstract void adaptorChannelDidChangeResultSet(com.webobjects.eoaccess.EOAdaptorChannel channel);

        /**
         * Invoked from evaluateExpression to tell the delegate that a query language expression has been evaluated by the database server.
         */
        abstract void adaptorChannelDidEvaluateExpression(com.webobjects.eoaccess.EOAdaptorChannel channel, com.webobjects.eoaccess.EOSQLExpression expression);

        /**
         * Invoked from executeStoredProcedure after storedProcedure is executed successfully with the arguments in values.
         */
        abstract void adaptorChannelDidExecuteStoredProcedure(com.webobjects.eoaccess.EOAdaptorChannel channel, com.webobjects.eoaccess.EOStoredProcedure storedProcedure, com.webobjects.foundation.NSDictionary values);

        /**
         * Invoked from fetchRow after a row is fetched successfully. This method is not invoked if an exception occurs during the fetch or if fetchRow returns null because there are no more rows in the current result set. The delegate may modify row, which will be returned from fetchRow.
         */
        abstract void adaptorChannelDidFetchRow(com.webobjects.eoaccess.EOAdaptorChannel channel, com.webobjects.foundation.NSMutableDictionary row);

        /**
         * Invoked from fetchRow to tell the delegate that fetching is finished for the current select operation. This method is invoked when a fetch ends in fetchRow because there are no more result sets.
         */
        abstract void adaptorChannelDidFinishFetching(com.webobjects.eoaccess.EOAdaptorChannel channel);

        /**
         * Invoked from performAdaptorOperations. The exception parameter is null if no exception was thrown while operations were performed, otherwise, exception is the thrown exception. The delegate can return the same or a different exception, which is re-thrown by performAdaptorOperation. Or it can return null to prevent the adaptor channel from throwing an exception.
         */
        abstract java.lang.Throwable adaptorChannelDidPerformOperations(com.webobjects.eoaccess.EOAdaptorChannel channel, com.webobjects.foundation.NSArray operations, java.lang.Throwable exception);

        /**
         * Invoked from selectAttributes to tell the delegate that some rows have been selected in the database server. The delegate may take whatever action it needs based on this information.
         */
        abstract void adaptorChannelDidSelectAttributes(com.webobjects.eoaccess.EOAdaptorChannel channel, com.webobjects.foundation.NSArray attributes, com.webobjects.eocontrol.EOFetchSpecification fetchSpec, boolean lock, com.webobjects.eoaccess.EOEntity entity);

        /**
         * Invoked from returnValuesForLastStoredProcedureInvocation to tell the delegate that object is constructing return values for the last stored procedure evaluated. If the delegate returns a value other than null, returnValuesForLastStoredProcedureInvocation will return that value immediately rather than constructing a return value from the execution of the stored procedure.
         */
        abstract com.webobjects.foundation.NSDictionary adaptorChannelShouldConstructStoredProcedureReturnValues(com.webobjects.eoaccess.EOAdaptorChannel channel);

        /**
         * Invoked from evaluateExpression to tell the delegate that the adaptor channel object is sending expression to the database server. The delegate should return true to permit the adaptor channel to send expression to the server. If the delegate returns false, the adaptor channel does not send the expression and returns immediately. When the delegate returns false, the adaptor channel expects that the implementor of the delegate has done the work that evaluateExpression would have done. The delegate can create a new EOSQLExpression and send the expression itself before returning false.
         */
        abstract boolean adaptorChannelShouldEvaluateExpression(com.webobjects.eoaccess.EOAdaptorChannel channel, com.webobjects.eoaccess.EOSQLExpression expression);

        /**
         * Invoked from executeStoredProcedure to tell the delegate that the adaptor channel object is executing storedProcedure with the arguments in values. The delegate can return a different dictionary of arguments to pass to the stored procedure, or null to permit the adaptor channel to use the original values.
         */
        abstract com.webobjects.foundation.NSDictionary adaptorChannelShouldExecuteStoredProcedure(com.webobjects.eoaccess.EOAdaptorChannel channel, com.webobjects.eoaccess.EOStoredProcedure storedProcedure, com.webobjects.foundation.NSDictionary values);

        /**
         * Invoked from returnValuesForLastStoredProcedureInvocation to tell the delegate that object is returning values for a stored procedure. If the delegate returns a value other than null, that value is returned from returnValuesForLastStoredProcedureInvocation instead of values.
         */
        abstract com.webobjects.foundation.NSDictionary adaptorChannelShouldReturnValuesForStoredProcedure(com.webobjects.eoaccess.EOAdaptorChannel channel, com.webobjects.foundation.NSDictionary values);

        /**
         * Invoked from selectAttributes to ask the delegate whether a select operation should be performed by the adaptor channel object for the attributes of entity using the fetch specification fetchSpec, locking the database rows or not according to the Boolean parameter lock. If the delegate wants to perform a different select it should invoke selectAttributes itself with a new fetch specification, and return false (indicating that the adaptor channel should not perform the select itself). The delegate should not modify fetchSpec but rather should create a new fetch specification if needed.
         */
        abstract boolean adaptorChannelShouldSelectAttributes(com.webobjects.eoaccess.EOAdaptorChannel channel, com.webobjects.foundation.NSArray attributes, com.webobjects.eocontrol.EOFetchSpecification fetchSpec, boolean lock, com.webobjects.eoaccess.EOEntity entity);

        /**
         * Invoked from fetchRow to tell the delegate that a single row will be fetched. The delegate can determine the attributes used by the fetch by sending attributesToFetch to object, and can change the set of attributes to fetch by sending setAttributesToFetch to object. The adaptor channel performs the actual fetch.
         */
        abstract void adaptorChannelWillFetchRow(com.webobjects.eoaccess.EOAdaptorChannel channel);

        /**
         * Invoked from performAdaptorOperations to tell the delegate that object is performing the EOAdaptorOperations in operations. The delegate may return operations or a different NSArray for the adaptor channel to perform. If the delegate returns null, the adaptor channel does not perform the operations and returns from the method immediately.
         */
        abstract com.webobjects.foundation.NSArray adaptorChannelWillPerformOperations(com.webobjects.eoaccess.EOAdaptorChannel channel, com.webobjects.foundation.NSArray operations);

    }
}
