package com.webobjects.eoaccess;
/**
 * An EOJoin describes one source-destination attribute pair for an EORelationship.
 * See Also:EORelationship
 */
public class EOJoin{
    /**
     * Creates and returns a new EOJoin with the given source and destination attributes. See the EORelationship class documentation for an example of creating a relationship using EOJoins.
     * Parameters:source - The source attribute for the new EOJoin.destination - The destination attribute for the new EOJoin.See Also:EORelationship, EORelationship.addJoin(EOJoin aJoin)
     */
    public EOJoin(com.webobjects.eoaccess.EOAttribute source, com.webobjects.eoaccess.EOAttribute destination){
         //TODO codavaj!!
    }

    /**
     * Returns a reference to the receiver. As EOJoin objects are immutable, it is not necessary to make a copy.
     */
    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the destination (
     * right
     * ) attribute of the receiver.
     */
    public com.webobjects.eoaccess.EOAttribute destinationAttribute(){
        return null; //TODO codavaj!!
    }

    /**
     * Compares object with the receiver and returns true if they are identical, false otherwise.
     */
    public boolean equals(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver's source attribute is identical to otherJoin's destination attribute, and otherJoin's source attribute is equal to the receiver's destination attribute; returns false otherwise. This type of join is known as a back-referencing join.
     */
    public boolean isReciprocalToJoin(com.webobjects.eoaccess.EOJoin otherJoin){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the source (
     * left
     * ) attribute of the receiver.
     */
    public com.webobjects.eoaccess.EOAttribute sourceAttribute(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of the receiver.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
