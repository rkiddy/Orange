package com.webobjects.eoaccess.synchronization;
/**
 * A wrapper object for relational database column information used for schema synchronization.
 * Since: 5.4 See Also:EOSchemaTableDescription, EOSchemaSynchronizationFactory
 */
public class EOSchemaColumnDescription extends com.webobjects.eoaccess.synchronization.EOSchemaPropertyDescription{
    public static final com.webobjects.eoaccess.synchronization.EOSchemaColumnDescription EmptyDescription=null;

    protected EOSchemaColumnDescription(){
         //TODO codavaj!!
    }

    /**
     * Allows null as specified by the eomodel
     */
    public java.lang.Boolean allowsNull(){
        return null; //TODO codavaj!!
    }

    /**
     * External data type as specified in the eomodel
     */
    public java.lang.String dataType(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Adds the fields for each subclass. Subclasses must override this method and call super first if they have specific fields to display.
     */
    protected void fieldsToString(java.lang.StringBuilder aLog){
        return; //TODO codavaj!!
    }

    /**
     * Returns the internal data type of the column as specified in the eomodel
     */
    public java.lang.Object internalDataType(){
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
     * Scale as defined by the eomodel
     */
    public java.lang.Number scale(){
        return null; //TODO codavaj!!
    }

    protected void setAllowsNull(java.lang.Boolean value){
        return; //TODO codavaj!!
    }

    protected void setDataType(java.lang.String value){
        return; //TODO codavaj!!
    }

    protected void setInternalDataType(java.lang.Object value){
        return; //TODO codavaj!!
    }

    protected void setScale(java.lang.Number value){
        return; //TODO codavaj!!
    }

    protected void setWidth(java.lang.Number value){
        return; //TODO codavaj!!
    }

    /**
     * Width as defined by the eomodel
     */
    public java.lang.Number width(){
        return null; //TODO codavaj!!
    }

}
