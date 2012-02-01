package com.webobjects.eoaccess.synchronization;
/**
 * Encapsulates the changes between the previous schema including table names, indexes, columns and constraints.
 * Since: 5.4
 */
public class EOSchemaSynchronizationTableChanges extends com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationChanges{
    public EOSchemaSynchronizationTableChanges(java.lang.String name){
         //TODO codavaj!!
    }

    /**
     * Adds a column name to the list of column to be deleted.
     */
    public void addToDeletedColumnNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Adds a foreign key constraint name to the list of foreign key constraint to be deleted.
     */
    public void addToDeletedForeignKeyConstrainNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Adds a index name to the list of index to be deleted.
     */
    public void addToDeletedIndexNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Adds a column name to the list of column to be inserted.
     */
    public void addToInsertedColumnNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Adds a foreign key constraint name to the list of foreign key constraint to be inserted.
     */
    public void addToInsertedForeignKeyConstrainNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Adds a index name to the list of index to be inserted.
     */
    public void addToInsertedIndexNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Adds a column name to the list of column to be updated.
     */
    public void addToUpdatedColumnNames(java.lang.String value, com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationColumnChanges change){
        return; //TODO codavaj!!
    }

    /**
     * Returns the changes for the named column. If there are no changes returns an empty Object.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationColumnChanges changesForColumnNamed(java.lang.String value){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the list of column to be deleted.
     */
    public java.util.Set deletedColumnNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an iterator on the list of column names to be deleted.
     */
    public java.util.Iterator deletedColumnNamesIterator(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the list of foreign key constraint to be deleted.
     */
    public java.util.Set deletedForeignKeyConstrainNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an iterator on the list of foreign key constraint names to be deleted.
     */
    public java.util.Iterator deletedForeignKeyConstrainNamesIterator(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the list of index to be deleted.
     */
    public java.util.Set deletedIndexNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an iterator on the list of index names to be deleted.
     */
    public java.util.Iterator deletedIndexNamesIterator(){
        return null; //TODO codavaj!!
    }

    public void fieldsToString(java.lang.StringBuilder aLog){
        return; //TODO codavaj!!
    }

    /**
     * Checks if there are deleted columns.
     */
    public boolean hasColunmDeleted(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if there are inserted columns.
     */
    public boolean hasColunmInserted(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if there are updated columns.
     */
    public boolean hasColunmUpdated(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if there are deleted foreign key constraint.
     */
    public boolean hasForeignKeyConstrainsDeleted(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if there are foreign key constraint indexes.
     */
    public boolean hasForeignKeyConstrainsInserted(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if there are deleted indexes.
     */
    public boolean hasIndexesDeleted(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if there are inserted indexes.
     */
    public boolean hasIndexesInserted(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the list of column to be inserted.
     */
    public java.util.Set insertedColumnNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an iterator on the list of column names to be inserted.
     */
    public java.util.Iterator insertedColumnNamesIterator(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the list of foreign key constraint to be inserted.
     */
    public java.util.Set insertedForeignKeyConstrainNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an iterator on the list of foreign key constraint names to be inserted.
     */
    public java.util.Iterator insertedForeignKeyConstrainNamesIterator(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the list of index to be inserted.
     */
    public java.util.Set insertedIndexNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an iterator on the list of index names to be inserted.
     */
    public java.util.Iterator insertedIndexNamesIterator(){
        return null; //TODO codavaj!!
    }

    /**
     * Checks if a column is to be deleted.
     */
    public boolean isColumnNamedDeleted(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if a column is to be inserted.
     */
    public boolean isColumnNamedInserted(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if a column is to be updated.
     */
    public boolean isColumnNamedUpdated(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if there is any changes defined by this structrure
     */
    public boolean isEmpty(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if a foreign key constraint is to be deleted.
     */
    public boolean isForeignKeyConstrainNamedDeleted(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if a foreign key constraint is to be inserted.
     */
    public boolean isForeignKeyConstrainNamedInserted(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if a index is to be deleted.
     */
    public boolean isIndexNamedDeleted(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if a index is to be inserted.
     */
    public boolean isIndexNamedInserted(java.lang.String value){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if there is the changes defined by this structrure are only foreign key related
     */
    public boolean isOnlyForeignKeyRelated(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if this is a table rename
     */
    public boolean isRename(){
        return false; //TODO codavaj!!
    }

    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the newly initialized change object. This object is not inserted in the update list. This is to facilitate subclassing.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationColumnChanges newChangesForColumn(java.lang.String value){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the old name of the table
     */
    public java.lang.String oldName(){
        return null; //TODO codavaj!!
    }

    /**
     * Removes a column name from the list of column to be deleted.
     */
    public void removeFromDeletedColumnNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Removes a foreign key constraint name from the list of foreign key constraint to be deleted.
     */
    public void removeFromDeletedForeignKeyConstrainNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Removes a index name from the list of index to be deleted.
     */
    public void removeFromDeletedIndexNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Removes a column name from the list of column to be inserted.
     */
    public void removeFromInsertedColumnNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Removes a foreign key constraint name from the list of foreign key constraint to be inserted.
     */
    public void removeFromInsertedForeignKeyConstrainNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Removes a index name from the list of index to be inserted.
     */
    public void removeFromInsertedIndexNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Removes a column name from the list of column to be updated.
     */
    public void removeFromUpdatedColumnNames(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Set the deleted column names.
     */
    public void setDeletedColumnNames(java.util.Collection value){
        return; //TODO codavaj!!
    }

    /**
     * Set the deleted foreign key constraint names.
     */
    public void setDeletedForeignKeyConstrainNames(java.util.Collection value){
        return; //TODO codavaj!!
    }

    /**
     * Set the deleted index names.
     */
    public void setDeletedIndexNames(java.util.Collection value){
        return; //TODO codavaj!!
    }

    /**
     * Set the inserted column names.
     */
    public void setInsertedColumnNames(java.util.Collection value){
        return; //TODO codavaj!!
    }

    /**
     * Set the inserted foreign key constraint names.
     */
    public void setInsertedForeignKeyConstrainNames(java.util.Collection value){
        return; //TODO codavaj!!
    }

    /**
     * Set the inserted index names.
     */
    public void setInsertedIndexNames(java.util.Collection value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the old name of the table
     */
    public void setOldName(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Set the updated column names and updates descriptions.
     */
    public void setUpdatedColumnNames(java.util.Map value){
        return; //TODO codavaj!!
    }

    /**
     * Returns the list of columns to be updated.
     */
    public java.util.Set updatedColumnNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an iterator on the list of column names to be updated.
     */
    public java.util.Iterator updatedColumnNamesIterator(){
        return null; //TODO codavaj!!
    }

}
