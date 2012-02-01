package com.webobjects.eoaccess;
/**
 * An EOAdaptorOperation object represents a single primitive operation in a database server (lock, insert, update, or delete a particular row, or execute a stored procedure) as well as all the necessary information required to perform the operation. An EOAdaptorOperation is processed by an EOAdaptorChannel object in the method performAdaptorOperation.
 * You don't ordinarily create instances of EOAdaptorOperation yourself. Rather, the Enterprise Objects Framework automatically creates an EOAdaptorOperation object and sends it to an adaptor channel when your application needs the database server to perform an operation. You generally directly interact with EOAdaptorOperation objects only if you need to specify the order in which a set of operations are carried out.
 * An EOAdaptorOperation has an entity and an operator (the type of operation it represents). EODatabaseOperation defines the following constants for adaptor operators:
 * An adaptor operation's operator determines the additional, operator- dependent information used by the EOAdaptorOperation object. For example, only a stored procedure operation has an EOStoredProcedure object. The operator-dependent information is accessible using the methods described below.
 * See Also:EODatabaseOperation.AdaptorLockOperator, EODatabaseOperation.AdaptorInsertOperator, EODatabaseOperation.AdaptorUpdateOperator, EODatabaseOperation.AdaptorDeleteOperator, EODatabaseOperation.AdaptorStoredProcedureOperator, EOAdaptorChannel.performAdaptorOperation(EOAdaptorOperation adaptorOperation), EOAdaptorOperation.adaptorOperator()
 */
public class EOAdaptorOperation{
    /**
     * Creates and returns a new EOAdaptorOperation, with entity as the entity to which the operation will be applied.
     * Parameters:entity - An entity.See Also:EOAdaptorOperation.entity(), EOEntity
     */
    public EOAdaptorOperation(com.webobjects.eoaccess.EOEntity entity){
         //TODO codavaj!!
    }

    /**
     * Returns the receiver's adaptor operator. The operator determines which of the other adaptor operation attributes are valid. For example, an adaptor operation whose operator is AdaptorInsertOperator uses changedValues, but not attributes, qualifier, or storedProcedure.
     */
    public int adaptorOperator(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the array of attributes to select when locking the row. If attributes have not been assigned to the receiver, the primary key attributes are selected. Only valid for adaptor operations with the AdaptorLockOperator.
     */
    public com.webobjects.foundation.NSArray attributes(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the dictionary of values that need to be updated, inserted, or compared for locking purposes.
     */
    public com.webobjects.foundation.NSDictionary changedValues(){
        return null; //TODO codavaj!!
    }

    /**
     * Orders the adaptor operations represented by the receiver and other alphabetically by entity name, and by adaptor operator within the same entity. Returns an NSComparator describing the relative order (NSOrderedAscending, NSOrderedSame, or NSOrderedDescending) of the receiver with respect to other.
     * Adaptor operators are ordered as follows (ascending order):
     * AdaptorLockOperator AdaptorInsertOperator AdaptorUpdateOperator AdaptorDeleteOperator AdaptorStoredProcedureOperator
     * An EODatabaseContext uses compareAdaptorOperation to order adaptor operations before invoking EOAdaptorChannel's performAdaptorOperations method.
     */
    public int compareAdaptorOperation(com.webobjects.eoaccess.EOAdaptorOperation other){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the EOEntity to which the operation will be applied.
     */
    public com.webobjects.eoaccess.EOEntity entity(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the exception that was thrown when an adaptor channel attempted to process the receiver, or null if no exception was thrown or if the receiver hasn't been processed yet.
     */
    public java.lang.Throwable exception(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOQualifier that identifies the specific row to which the adaptor operation applies. Not valid for adaptor operations with the operators AdaptorInsertOperator or AdaptorStoredProcedureOperator.
     */
    public com.webobjects.eocontrol.EOQualifier qualifier(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the receiver's adaptor operator to adaptorOperator. The value of adaptorOperator must be one of the following constants: AdaptorLockOperator AdaptorInsertOperator AdaptorUpdateOperator AdaptorDeleteOperator AdaptorStoredProcedureOperator
     */
    public void setAdaptorOperator(int adaptorOperator){
        return; //TODO codavaj!!
    }

    /**
     * Sets the array of attributes to select when locking the row to attributes. The selected values are compared in memory to the corresponding snapshot values to determine if a row has changed since the application last fetched it. attributes is an array of EOAttribute objects that can't be compared in a qualifier (generally BLOB types); it should not be null or empty.
     * Generally, an adaptor operation's qualifier contains all the comparisons needed to verify that a row hasn't changed since the application last fetched, inserted, or updated it. If there aren't any attributes that can't be compared in a qualifier (generally BLOB types), attributes should contain primary key attributes. This method is only valid for adaptor operations with the AdaptorLockOperator.
     */
    public void setAttributes(com.webobjects.foundation.NSArray attributes){
        return; //TODO codavaj!!
    }

    /**
     * Sets the dictionary of values that need to be updated, inserted, or compared for locking purposes. changedValues is a dictionary object whose keys are attribute names and whose values are the values for those attributes. As summarized in the following table, the contents of changedValues depends on the receiver's operator:
     * Operator Contents of changedValues Dictionary AdaptorLockOperator Snapshot values used to verify that the database row hasn't changed since this application last fetched it. AdaptorInsertOperator The values to insert. AdaptorUpdateOperator The new values for the columns to update. AdaptorDeleteOperator Snapshot values (changedValues is only valid for AdaptorDeleteOperator if the receiver's entity uses a stored procedure to perform delete operations). AdaptorStoredProcedureOperator Snapshot values
     */
    public void setChangedValues(com.webobjects.foundation.NSDictionary changedValues){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's exception to exception.
     * This method is typically invoked from EOAdaptorChannel's performAdaptorOperations method. If a database error occurs while processing an adaptor operation, the adaptor channel creates an exception and assigns it to the adaptor operation.
     */
    public void setException(java.lang.Throwable exception){
        return; //TODO codavaj!!
    }

    /**
     * Sets the EOQualifier that identifies the row to which the adaptor operation will be applied.
     */
    public void setQualifier(com.webobjects.eocontrol.EOQualifier qualifier){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's stored procedure.
     */
    public void setStoredProcedure(com.webobjects.eoaccess.EOStoredProcedure storedProcedure){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's stored procedure. Only valid for adaptor operations with the AdaptorStoredProcedureOperator.
     */
    public com.webobjects.eoaccess.EOStoredProcedure storedProcedure(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of the receiver.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
