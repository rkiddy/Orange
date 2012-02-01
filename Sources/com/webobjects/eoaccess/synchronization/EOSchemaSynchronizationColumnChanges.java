package com.webobjects.eoaccess.synchronization;
/**
 * Encapsulates column changes.
 * Since: 5.4 See Also:EOSchemaSynchronizationTableChanges, EOSchemaSynchronizationFactory, EOSchemaSynchronization
 */
public class EOSchemaSynchronizationColumnChanges extends com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationChanges{
    public EOSchemaSynchronizationColumnChanges(java.lang.String name){
         //TODO codavaj!!
    }

    public boolean allowNull(){
        return false; //TODO codavaj!!
    }

    /**
     * Resets the allow null parameter
     */
    public void clearAllowNull(){
        return; //TODO codavaj!!
    }

    /**
     * Resets the External Type parameter
     */
    public void clearExternalType(){
        return; //TODO codavaj!!
    }

    /**
     * Resets the Precision parameter
     */
    public void clearPrecision(){
        return; //TODO codavaj!!
    }

    /**
     * Resets the scale parameter
     */
    public void clearScale(){
        return; //TODO codavaj!!
    }

    /**
     * Resets the width parameter
     */
    public void clearWidth(){
        return; //TODO codavaj!!
    }

    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationColumnChanges clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the default precision for the column if not set.
     */
    public java.lang.String defaultExternalType(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the default precision for the column if not set.
     */
    public java.lang.Number defaultPrecision(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the default scale for the column if not set.
     */
    public java.lang.Number defaultScale(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the default width for the column if not set.
     */
    public java.lang.Number defaultWidth(){
        return null; //TODO codavaj!!
    }

    public java.lang.String externalType(){
        return null; //TODO codavaj!!
    }

    public void fieldsToString(java.lang.StringBuilder aLog){
        return; //TODO codavaj!!
    }

    /**
     * Check if allow null have been defined
     */
    public boolean isAllowNullDefined(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if there is any changes defined by this structrure
     */
    public boolean isEmpty(){
        return false; //TODO codavaj!!
    }

    /**
     * Check if External Type have been defined
     */
    public boolean isExternalTypeDefined(){
        return false; //TODO codavaj!!
    }

    /**
     * Check if Precision have been defined
     */
    public boolean isPrecisionDefined(){
        return false; //TODO codavaj!!
    }

    /**
     * Checks if this is a column rename
     */
    public boolean isRename(){
        return false; //TODO codavaj!!
    }

    /**
     * Check if Scale have been defined
     */
    public boolean isScaleDefined(){
        return false; //TODO codavaj!!
    }

    /**
     * Check if Width have been defined
     */
    public boolean isWidthDefined(){
        return false; //TODO codavaj!!
    }

    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the old name of the column
     */
    public java.lang.String oldName(){
        return null; //TODO codavaj!!
    }

    public int precision(){
        return 0; //TODO codavaj!!
    }

    public int scale(){
        return 0; //TODO codavaj!!
    }

    public void setAllowNull(boolean value){
        return; //TODO codavaj!!
    }

    public void setExternalType(java.lang.String value){
        return; //TODO codavaj!!
    }

    /**
     * Sets the old name of the column
     */
    public void setOldName(java.lang.String value){
        return; //TODO codavaj!!
    }

    public void setPrecision(int value){
        return; //TODO codavaj!!
    }

    public void setScale(int scale){
        return; //TODO codavaj!!
    }

    public void setWidth(int value){
        return; //TODO codavaj!!
    }

    public int width(){
        return 0; //TODO codavaj!!
    }

}
