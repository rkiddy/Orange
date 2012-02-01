package com.webobjects.eoaccess.synchronization;
/**
 * A wrapper object for relational database table information used for schema synchronization. This encapsulates column, index, relationship and foreign key constraint information.
 * Since: 5.4 See Also:EOSchemaColumnDescription, EOSchemaForeignKeyConstraintDescription, EOSchemaIndexDescription, EOSchemaSynchronizationFactory
 */
public class EOSchemaTableDescription extends com.webobjects.eoaccess.synchronization.EOSchemaPropertyDescription{
    public static final com.webobjects.eoaccess.synchronization.EOSchemaTableDescription EmptyDescription=null;

    protected EOSchemaTableDescription(){
         //TODO codavaj!!
    }

    protected void addToColumns(com.webobjects.eoaccess.synchronization.EOSchemaColumnDescription value){
        return; //TODO codavaj!!
    }

    protected void addToForeignKeyConstraints(com.webobjects.eoaccess.synchronization.EOSchemaForeignKeyConstraintDescription value){
        return; //TODO codavaj!!
    }

    protected void addToIndexes(com.webobjects.eoaccess.synchronization.EOSchemaIndexDescription value){
        return; //TODO codavaj!!
    }

    public java.util.Iterator columnIterator(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray columns(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Adds the fields for each subclass. Subclasses must override this method and call super first if they have specific fields to display.
     */
    protected void fieldsToString(java.lang.StringBuilder aLog){
        return; //TODO codavaj!!
    }

    public java.util.Iterator foreignKeyConstraintIterator(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray foreignKeyConstraints(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoaccess.synchronization.EOSchemaColumnDescription getColumnByName(java.lang.String value){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoaccess.synchronization.EOSchemaForeignKeyConstraintDescription getForeignKeyConstraintByName(java.lang.String value){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoaccess.synchronization.EOSchemaIndexDescription getIndexByName(java.lang.String value){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray indexes(){
        return null; //TODO codavaj!!
    }

    public java.util.Iterator indexIterator(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns true is the property description is empty
     */
    public boolean isEmpty(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a newly initialized column description object. This object is not inserted in the description list. This is to facilitate subclassing.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaColumnDescription newColumnDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a newly initialized foreign key constraint description object. This object is not inserted in the description list. This is to facilitate subclassing.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaForeignKeyConstraintDescription newForeignKeyConstraintDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a newly initialized index description object. This object is not inserted in the description list. This is to facilitate subclassing.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaIndexDescription newIndexDescription(){
        return null; //TODO codavaj!!
    }

    protected void removeFromColumns(com.webobjects.eoaccess.synchronization.EOSchemaColumnDescription value){
        return; //TODO codavaj!!
    }

    protected void removeFromForeignKeyConstraints(com.webobjects.eoaccess.synchronization.EOSchemaForeignKeyConstraintDescription value){
        return; //TODO codavaj!!
    }

    protected void removeFromIndexes(com.webobjects.eoaccess.synchronization.EOSchemaIndexDescription value){
        return; //TODO codavaj!!
    }

}
