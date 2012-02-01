package com.webobjects.eocontrol;
/**
 * EOArrayDataSource is a concrete subclass of EODataSource that can be used to provide enterprise objects to a display group (EODisplayGroup from EOInterface or WODisplayGroup from WebObjects) without having to fetch them from the database. In an EOArrayDataSource, objects are maintained in an NSArray.
 * EOArrayDataSource can fetch, insert, and delete objects by performing the operations directly on its array. It can also provide a detailed data source.
 * See Also:Serialized Form
 */
public class EOArrayDataSource extends com.webobjects.eocontrol.EODataSource implements java.io.Serializable{
    /**
     * Creates and returns an EOArrayDataSource object where desc contains information about the objects provided by the EOArrayDataSource and ec is the EOArrayDataSource's editing context. Either argument may be null.
     * Parameters:desc - specifies class description that contains information about the objects provided by the EOArrayDataSourceec - specifies EOArrayDataSource's editing context
     */
    public EOArrayDataSource(com.webobjects.eocontrol.EOClassDescription desc, com.webobjects.eocontrol.EOEditingContext ec){
         //TODO codavaj!!
    }

    /**
     * Returns the receiver's class description.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new object, inserts into the array of objects maintained by the receiver if appropriate, and returns the object. Returns null if the receiver can't create the object or can't insert it.
     */
    public java.lang.Object createObject(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates an EODetailDataSource for relationship key.
     */
    public com.webobjects.eocontrol.EODataSource dataSourceQualifiedByKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Deletes object from the array of objects maintained by the receiver.
     */
    public void deleteObject(java.lang.Object eo){
        return; //TODO codavaj!!
    }

    /**
     * Returns the receiver's editing context.
     */
    public com.webobjects.eocontrol.EOEditingContext editingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a copy of the array of objects maintained by the receiver.
     */
    public com.webobjects.foundation.NSArray fetchObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Inserts object into the array of objects maintained by the receiver.
     */
    public void insertObject(java.lang.Object eo){
        return; //TODO codavaj!!
    }

    /**
     * EOArrayDataSource provides a null implementation of this method.
     */
    public void qualifyWithRelationshipKey(java.lang.String key, java.lang.Object source){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's array of objects to array.
     */
    public void setArray(com.webobjects.foundation.NSArray array){
        return; //TODO codavaj!!
    }

}
