package com.webobjects.eoaccess.synchronization;
/**
 * A wrapper object for relational database column information used for schema synchronization.
 * Since: 5.4 See Also:EOSchemaTableDescription, EOSchemaSynchronizationFactory
 */
public class EOSchemaIndexDescription extends com.webobjects.eoaccess.synchronization.EOSchemaPropertyDescription{
    public static final com.webobjects.eoaccess.synchronization.EOSchemaIndexDescription EmptyDescription=null;

    public static final java.lang.String EXPLICIT="EXPLICIT";

    public static final java.lang.String PRIMARYKEY="PRIMARY KEY";

    protected EOSchemaIndexDescription(){
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
     * Index type
     */
    public java.lang.String indexType(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns true is the property description is empty
     */
    public boolean isEmpty(){
        return false; //TODO codavaj!!
    }

    protected void setIndexType(java.lang.String value){
        return; //TODO codavaj!!
    }

}
