package com.webobjects.eoaccess.synchronization;
/**
 * Encapsulates the changes between the previous eomodel.
 * Since: 5.4 See Also:EOSchemaSynchronizationFactory, EOSchemaSynchronization
 */
public class EOSchemaSynchronizationModelChanges extends com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationChanges{
    public EOSchemaSynchronizationModelChanges(){
         //TODO codavaj!!
    }

    /**
     * Adds a table name to the list of table to be deleted.
     */
    public void addToDeletedTableNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Adds a table name to the list of table to be inserted.
     */
    public void addToInsertedTableNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Adds a table name to the list of table to be updated.
     */
    public void addToUpdatedTableNames(java.lang.String value, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationTableChanges change){
        return; //TODO codavaj!!
    }

    /**
     * Rerturns the changes for the named table. If there are no changes returns an empty Object.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationTableChanges changesForTableNamed(java.lang.String value){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the list of table to be deleted.
     */
    public java.util.Set deletedTableNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an iterator on the list of table names to be deleted.
     */
    public java.util.Iterator deletedTableNamesIterator(){
        return null; //TODO codavaj!!
    }

    public void fieldsToString(java.lang.StringBuilder aLog){
        return; //TODO codavaj!!
    }

    /**
     * Returns the list of table to be inserted.
     */
    public java.util.Set insertedTableNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an iterator on the list of table names to be inserted.
     */
    public java.util.Iterator insertedTableNamesIterator(){
        return null; //TODO codavaj!!
    }

    /**
     * Checks if there is any changes defined by this structrure
     */
    public boolean isEmpty(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if a table is to be deleted.
     */
    public boolean isTableNamedDeleted(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if a table is to be inserted.
     */
    public boolean isTableNamedInserted(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if a table is to be updated.
     */
    public boolean isTableNamedUpdated(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Returns enewly initialized change object. This object is not inserted in the update list. This is to facilitate subclassing.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationTableChanges newChangesForTable(java.lang.String value){
        return null; //TODO codavaj!!
    }

    /**
     * Removes a table name from the list of table to be deleted.
     */
    public void removeFromDeletedTableNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Removes a table name from the list of table to be inserted.
     */
    public void removeFromInsertedTableNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Removes a table name from the list of table to be updated.
     */
    public void removeFromUpdatedTableNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Set the deleted table names.
     */
    public void setDeletedTableNames(java.util.Collection value){
        return; //TODO codavaj!!
    }

    /**
     * Set the inserted table names.
     */
    public void setInsertedTableNames(java.util.Collection value){
        return; //TODO codavaj!!
    }

    /**
     * Set the updated table names and updates descriptions.
     */
    public void setUpdatedTableNames(java.util.Map value){
        return; //TODO codavaj!!
    }

    /**
     * Returns the list of tables to be updated.
     */
    public java.util.Set updatedTableNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an iterator on the list of table names to be updated.
     */
    public java.util.Iterator updatedTableNamesIterator(){
        return null; //TODO codavaj!!
    }

}
