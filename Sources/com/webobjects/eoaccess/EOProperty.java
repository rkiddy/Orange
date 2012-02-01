package com.webobjects.eoaccess;
/**
 * EOProperty is an abstract class that embodies the notion of an object that belongs to (is the property of) an EOEntity. The concrete subclasses of EOProperty in the Enterprise Objects Framework are EOAttribute and EORelationship.
 * See Also:EOAttribute, EOEntity, EORelationship
 */
public abstract class EOProperty{
    public EOProperty(){
         //TODO codavaj!!
    }

    /**
     * Returns the prent entity of this property
     */
    public abstract com.webobjects.eoaccess.EOEntity entity();

    public boolean equals(java.lang.Object value){
        return false; //TODO codavaj!!
    }

    /**
     * Retunr the name of the property with teh frist initial capital
     */
    public java.lang.String initialCapitalName(){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to return the name of the property object.
     */
    public abstract java.lang.String name();

    /**
     * An abstract method that should be implemented by subclasses to return a data path naming each component of a flattened property, separated by period characters (
     * ), or null if the receiver is not a flattened property.
     */
    public abstract java.lang.String relationshipPath();

}
