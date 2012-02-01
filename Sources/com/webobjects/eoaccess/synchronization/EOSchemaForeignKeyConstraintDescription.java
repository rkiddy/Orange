package com.webobjects.eoaccess.synchronization;
/**
 * A wrapper object for relational database foreign constrain information used for schema synchronization.
 * Since: 5.4 See Also:EOSchemaTableDescription, EOSchemaSynchronizationFactory
 */
public class EOSchemaForeignKeyConstraintDescription extends com.webobjects.eoaccess.synchronization.EOSchemaPropertyDescription{
    public static final com.webobjects.eoaccess.synchronization.EOSchemaForeignKeyConstraintDescription EmptyDescription=null;

    public EOSchemaForeignKeyConstraintDescription(){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Adds the fields for each subclass. Subclasses must override this method and call super first if they have specific fields to display.
     */
    protected void fieldsToString(java.lang.StringBuilder aLog){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns true is the property description is empty
     */
    public boolean isEmpty(){
        return false; //TODO codavaj!!
    }

}
