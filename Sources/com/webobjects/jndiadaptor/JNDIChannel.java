package com.webobjects.jndiadaptor;
/**
 * The JNDIChannel class represents a communication channel to a Java Naming and Directory Interface service.
 */
public class JNDIChannel extends com.webobjects.eoaccess.EOAdaptorChannel{
    /**
     * Creates a new instance of JNDIChannel.
     * Parameters:context - - the contextSee Also:EOAdaptorChannel.EOAdaptorChannel(EOAdaptorContext)
     */
    public JNDIChannel(com.webobjects.jndiadaptor.JNDIContext context){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to return the set of attributes to retrieve when fetchRow is next invoked.
     */
    public com.webobjects.foundation.NSArray attributesToFetch(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to clear all result sets established by the last selectAttributes, executeStoredProcedure, or evaluateExpression message and terminate the current fetch, so that isFetchInProgress returns false.
     */
    public void cancelFetch(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to close the EOAdaptorChannel so that it can't perform operations with the server. Any fetch in progress should be canceled.
     * If the receiver is the last open channel in an adaptor context and if the channel's adaptor context has outstanding transactions, closing the channel has server-dependent results: some database servers roll back all outstanding transactions but others do nothing. Regardless of whether outstanding transactions are rolled back, this method has the side effect of closing the receiver's adaptor context's connection with the database if the receiver is its adaptor context's last open channel.
     */
    public void closeChannel(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to delete the rows described by qualifier from the database table corresponding to entity. Should return the number of rows deleted. Should throw a runtime exception on failure. Some possible reasons for failure are: The adaptor channel isn't open. The adaptor channel is in an invalid state (for example, it's fetching). An error occurs in the database server.
     */
    public int deleteRowsDescribedByQualifier(com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOEntity entity){
        return 0; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * The default implementation of this method returns null. It can be overridden by subclasses to create and return a default model containing entities for the tables specified in tableNames and assign the adaptor name and connection dictionary to the new model. This method is typically used in conjunction with describeTableNames and describeStoredProcedureNames.
     */
    public com.webobjects.eoaccess.EOModel describeModelWithTableNames(com.webobjects.foundation.NSArray tableNames){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to return an array of EOAttributes describing the properties available in the current result set, as determined by selectAttributes, executeStoredProcedure, or a statement evaluated by evaluateExpression. Only invoke this method if a fetch is in progress as determined by isFetchInProgress.
     */
    public com.webobjects.foundation.NSArray describeResults(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * The default implementation of this method returns an empty array. It can be overridden by subclasses to read and return an array of table names from the database metadata.
     * This method is used in conjunction with describeStoredProcedureNames to build a default model in EOModeler.
     */
    public com.webobjects.foundation.NSArray describeTableNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to send expression to the database server for evaluation, beginning a transaction first and committing it after evaluation if a transaction isn't already in progress. Should throw a runtime exception if an error occurs. An adaptor channel uses this method to send SQL expressions to the database.
     * If expression results in a select operation being performed, you can fetch the results as you would if you had invoked selectAttributes. You must use the method setAttributesToFetch before you begin fetching. If expression evaluates to multiple result sets, you must invoke setAttributesToFetch before you begin fetching each subsequent set.
     * evaluateExpression invokes the delegate methods adaptorChannelShouldEvaluateExpression and adaptorChannelDidEvaluateExpression.
     * The upper layers of the Framework never invoke evaluateExpression directly. Thus, in adaptors for data stores that don't naturally support an expression language (for example, flat file adaptors), the implementation of this method doesn't need to do anything in order for the adaptor to work with the Framework.
     */
    public void evaluateExpression(com.webobjects.eoaccess.EOSQLExpression expression){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to execute storedProcedure. Any arguments to the stored procedure are in values, a dictionary whose keys are the argument names. You should use fetchRow to get result rows and returnValuesForLastStoredProcedureInvocation to get return arguments and result status, if any. Should throw a runtime exception if an error occurs.
     * The upper layers of the Framework never invoke executeStoredProcedure directly. Thus, in adaptors for data stores that don't naturally support stored procedures, the implementation of this method doesn't need to do anything in order for the adaptor to work with the Framework.
     */
    public void executeStoredProcedure(com.webobjects.eoaccess.EOStoredProcedure storedProcedure, com.webobjects.foundation.NSDictionary values){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to fetch the next row from the result set of the last selectAttributes, executeStoredProcedure, or evaluateExpression message sent to the receiver. Should return values for the receiver's attributesToFetch in a dictionary whose keys are the attribute names. When there are no more rows in the current result set, this method should return null and invoke the delegate method adaptorChannelDidChangeResultSet if there are more results sets.
     * When there are no more rows or result sets, this method should return null, end the fetch, and invoke adaptorChannelDidFinishFetching. isFetchInProgress returns true until the fetch is canceled or until this method exhausts all result sets and returns null.
     * This method should also invoke the delegate methods adaptorChannelWillFetchRow and adaptorChannelDidFetchRow. Should throw a runtime exception if an error occurs.
     */
    public com.webobjects.foundation.NSMutableDictionary fetchRow(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to insert the values of row into the table in the database that corresponds to entity. row is a dictionary whose keys are attribute names and whose values are the values to insert. Row keys must refer to attributes that all belong to entity and that are either non- flattened or all flattened through the same relationship path. Should throw a runtime exception on failure. Some possible reasons for failure are: The user logged in to the database doesn't have permission to insert a new row. The adaptor channel is in an invalid state (for example, fetching). The row fails to satisfy a constraint defined in the database server.
     */
    public void insertRow(com.webobjects.foundation.NSDictionary row, com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to return true if the receiver is fetching, false otherwise. An adaptor channel is fetching if: It has successfully invoked selectAttributes. A stored procedure that returns rows has been successfully executed using executeStoredProcedure. An expression sent through evaluateExpression resulted in a select operation being performed.
     * An adaptor channel stops fetching when there are no more records to fetch or when cancelFetch is invoked.
     */
    public boolean isFetchInProgress(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to return true if the channel has been opened with openChannel, false if not.
     */
    public boolean isOpen(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to put the channel, and both its context and adaptor, into a state where they are ready to perform database operations. Should throw a runtime exception if an error occurs.
     */
    public void openChannel(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns an NSArray of primary key dictionaries for the number of new rows specified by count in the database table that corresponds to entity. The primary keys returned from this method are dictionaries whose keys are the primary key attribute names. For example, suppose you've got a table MOVIE with primary key MOVIE_ID, and the corresponding Movie entity's primary key attribute is movieID. In this scenario, each dictionary in the NSArray returned from this method has one entry whose key is movieID and whose value is the unique value to assign.
     * If the primary key is compound (made up of more than one attribute), the dictionary should contain an entry for each primary key attribute. Note, however, that the Enterprise Objects Frameworks adaptors don't handle compound primary keys; they return null if the primary key is compound.
     */
    public com.webobjects.foundation.NSArray primaryKeysForNewRowsWithEntity(int count, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to return values from the execution of a stored procedure. Used in conjunction with executeStoredProcedure. The dictionary returned by this method should have entries whose keys are the names of the stored procedure's parameters and whose values are the parameter values. The dictionary also should contain a special entry for the stored procedure's return value with the key
     * returnValue
     * .
     * Should return an empty dictionary for stored procedures that have void return types. Should return null if the stored procedure has results to fetch. In this case, you must use fetchRow until there are no more results to fetch before the return value will be available.
     */
    public com.webobjects.foundation.NSDictionary returnValuesForLastStoredProcedureInvocation(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to select attributes in rows matching the qualifier in fetchSpecification and set the receiver's attributes to fetch. The selected rows compose one or more result sets, each row of which should be returned by subsequent fetchRow calls according to fetchSpecification's sort orderings. If the yn flag is true, the rows should be locked if possible so that no other user can modify them. The lock specification in fetchSpecification should be ignored. Should throw a runtime exception if an error occurs. Some possible reasons for failure are: The adaptor channel is in an invalid state (for example, fetching). The database failed to lock the specified rows.
     */
    public void selectAttributes(com.webobjects.foundation.NSArray attributes, com.webobjects.eocontrol.EOFetchSpecification fetchSpecification, boolean isLocking, com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to specify the set of attributes used to describe fetch data from a corresponding select. attribute is an array of the attributes to fetch. This method should be invoked after evaluateExpression but before the first call to fetchRow. This method should throw a runtime exception if invoked when there is no fetch in progress.
     */
    public void setAttributesToFetch(com.webobjects.foundation.NSArray attributes){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to update the rows described by qualifier with the values in row. row is a dictionary whose keys are attribute names and whose values are the new values for those attributes (the dictionary need only contain entries for the attributes being changed). Should return the number of updated rows. Should throw a runtime exception if an error occurs. Some possible reasons for failure are: The user logged in to the database doesn't have permission to update. The adaptor channel is in an invalid state (for example, fetching). The new values fail to satisfy a constraint defined in the database server.
     */
    public int updateValuesInRowsDescribedByQualifier(com.webobjects.foundation.NSDictionary row, com.webobjects.eocontrol.EOQualifier qualifier, com.webobjects.eoaccess.EOEntity entity){
        return 0; //TODO codavaj!!
    }

}
