package com.webobjects.eoaccess;
/**
 * An EODatabaseOperation object represents an operation (insert, update, or delete) to perform on an Enterprise Object and all the necessary information required to perform that operation. You don't ordinarily create instances of EODatabaseOperation. Rather, the Framework automatically creates an EODatabaseOperation object for each new, updated, or deleted object in an EOEditingContext. An EODatabaseContext object analyzes a set of database operations and maps each operation to one or more adaptor operations. The adaptor operations are then performed by an EOAdaptorChannel object. You generally interact with EODatabaseOperation objects only if you need to specify the order in which a set of operations are carried out.
 * An EODatabaseOperation specifies the Enterprise Object (called "object") on which the operation is performed, the EOGlobalID for the object, and the object's entity. In addition, the database operation has a snapshot containing the last known database values for the object and a newRow dictionary of new or updated values to save in the database.
 * See Also:EODatabaseContext.Delegate.databaseContextWillOrderAdaptorOperations( EODatabaseContext dbCtxt, NSArray databaseOps)
 */
public class EODatabaseOperation{
    /**
     * An EOAdaptorOperation object that deletes a row in a database server.
     * See Also:Constant Field Values
     */
    public static final int AdaptorDeleteOperator=3;

    /**
     * An EOAdaptorOperation object that inserts a row in a database server.
     * See Also:Constant Field Values
     */
    public static final int AdaptorInsertOperator=1;

    /**
     * An EOAdaptorOperation object that locks a row in a database server.
     * See Also:Constant Field Values
     */
    public static final int AdaptorLockOperator=0;

    /**
     * An EOAdaptorOperation object that executes a stored procedure in a database server.
     * See Also:Constant Field Values
     */
    public static final int AdaptorStoredProcedureOperator=4;

    /**
     * An EOAdaptorOperation object that updates a row in a database server.
     * See Also:Constant Field Values
     */
    public static final int AdaptorUpdateOperator=2;

    /**
     * An EODatabaseOperation object that deletes an Enterprise Object.
     * See Also:Constant Field Values
     */
    public static final int DatabaseDeleteOperator=3;

    /**
     * An EODatabaseOperation object that inserts an Enterprise Object.
     * See Also:Constant Field Values
     */
    public static final int DatabaseInsertOperator=1;

    /**
     * An EODatabaseOperation object that does nothing on an Enterprise Object.
     * See Also:Constant Field Values
     */
    public static final int DatabaseNothingOperator=0;

    /**
     * An EODatabaseOperation object that updates an Enterprise Object.
     * See Also:Constant Field Values
     */
    public static final int DatabaseUpdateOperator=2;

    /**
     * Creates and returns a new EODatabaseOperation object, setting the Enterprise Object to which the operation will be applied to object, its globalID to globalID, and its entity to entity.
     * Parameters:globalID - The unique identifier for object.object - The Enterprise Object on which the receiver will operate.entity - The EOEntity to which object belongs.
     */
    public EODatabaseOperation(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.Object object, com.webobjects.eoaccess.EOEntity entity){
         //TODO codavaj!!
    }

    /**
     * Returns the EOAdaptorOperation objects that need to be performed to carry out the database operation represented by the receiver. Returns an empty array if no adaptor operations are set for the receiver.
     */
    public com.webobjects.foundation.NSArray adaptorOperations(){
        return null; //TODO codavaj!!
    }

    /**
     * Adds adaptorOp to the receiver's list of adaptor operations.
     */
    public void addAdaptorOperation(com.webobjects.eoaccess.EOAdaptorOperation adaptorOp){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's database operator.
     */
    public int databaseOperator(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the database snapshot for the receiver's Enterprise Object. The snapshot contains the last known database values for the enterprise object. Returns an empty dictionary if the receiver's object has just been inserted into an EOEditingContext and has not yet been saved to the database.
     */
    public com.webobjects.foundation.NSDictionary dbSnapshot(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOEntity that owns to the receiver's enterprise object.
     */
    public com.webobjects.eoaccess.EOEntity entity(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOGlobalID object that corresponds to the receiver's Enterprise Object.
     */
    public com.webobjects.eocontrol.EOGlobalID globalID(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary representation of the receiver's enterprise object. In addition to all the properties of the Enterprise Object that are stored in the database, the dictionary contains values for the non-derived attributes of the Enterprise Object's entity that aren't visible in the Enterprise Object. For example, primary and foreign keys aren't ordinarily properties of an enterprise object but are attributes of the object's entity.
     * The newRow dictionary is initialized with the values in the receiver's snapshot. New or updated values are added to newRow (replacing out-of-date values) as the Enterprise Objects Framework maps changes in the object to an operation.
     */
    public com.webobjects.foundation.NSMutableDictionary newRow(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's Enterprise Object.
     */
    public java.lang.Object object(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a dictionary that contains any primary key values in newRow that are different from those in the object's database snapshot. Returns an empty dictionary if the database operation set for the receiver is not EODatabaseUpdateOperator.
     */
    public com.webobjects.foundation.NSDictionary primaryKeyDiffs(){
        return null; //TODO codavaj!!
    }

    /**
     * Records the to-many snapshot gids for the relationship identified by name, belonging to the receiver's Enterprise Object. gids is an array of globalIDs that identify the objects at the destination of the specified to-many relationship.
     */
    public void recordToManySnapshot(com.webobjects.foundation.NSArray gids, java.lang.String name){
        return; //TODO codavaj!!
    }

    /**
     * Removes adaptorOp from the receiver's list of adaptor operations.
     */
    public void removeAdaptorOperation(com.webobjects.eoaccess.EOAdaptorOperation adaptorOp){
        return; //TODO codavaj!!
    }

    /**
     * Returns the values in the receiver's newRow dictionary that are different than the corresponding values in its dbSnapshot, in other words, the new values for its Enterprise Object.
     */
    public com.webobjects.foundation.NSDictionary rowDiffs(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the values for the EOAttributes of the receiver's Enterprise Object specified in atts that are new or updated relative to the object's database snapshot. In other words, the attribute values in the object's newRow dictionary that are different than the corresponding values in its dbSnapshot. Returns an empty dictionary if there are no differences in attribute values.
     * Throws an exception if atts contains an attribute that is not present in the the database snapshot for the receiver's object.
     */
    public com.webobjects.foundation.NSDictionary rowDiffsForAttributes(com.webobjects.foundation.NSArray atts){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the receiver's database operator to databaseOperator, which must be one of the list below.
     * DatabaseNothingOperator DatabaseInsertOperator DatabaseUpdateOperator DatabaseDeleteOperator
     * Throws an exception if:
     * databaseOperator is DatabaseInsertOperator and the database operator that is currently set for the receiver is DatabaseDeleteOperator databaseOperator is DatabaseDeleteOperator and the database operator that is currently set for the receiver is DatabaseInsertOperator
     */
    public void setDatabaseOperator(int databaseOperator){
        return; //TODO codavaj!!
    }

    /**
     * Sets the snapshot for the receiver's Enterprise Object. If the object has just been inserted into an an EOEditingContext (EOControl), it won't have a snapshot. In this case, dbSnapshot should be an empty dictionary.
     */
    public void setDBSnapshot(com.webobjects.foundation.NSDictionary dbSnapshot){
        return; //TODO codavaj!!
    }

    /**
     * Sets the dictionary representation of the receiver's enterprise object. newRow should contain values for all the properties of the Enterprise Object that are stored in the database and for the non-derived attributes of the Enterprise Object's entity that aren't visible in the Enterprise Object.
     */
    public void setNewRow(com.webobjects.foundation.NSMutableDictionary newRow){
        return; //TODO codavaj!!
    }

    /**
     * Returns the NSDictionary containing the snapshots for the to-many relationships of the receiver's Enterprise Object.
     */
    public com.webobjects.foundation.NSDictionary toManySnapshots(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of the receiver.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
