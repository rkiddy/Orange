package com.webobjects.foundation;
/**
 * An NSMutableRange is an object representing a range that can be changed. A range is a measurement of a segment of something linear, such as a byte stream. The two primary values an NSMutableRange can be changed, its location and its length. The methods of NSMutableRange also enables you to alter an NSMutableRange based on its union or intersection with another NSRange object.
 * The main purpose for NSMutableRange is to provide a way for methods to return range values in an "out" parameter. A client creates and passes in one or more NSMutableRanges to a method and gets back changed objects when the method returns. NSMutableRanges are also useful for performance reasons; instead of creating multiple NSRanges in a loop, just one NSMutableRange can be created and reuseed.
 * The NSMutableRange methods that provide the basis for all NSMutableRange's other methods are described below. That is, all other methods are implemented in terms of these four. If you create a subclass of NSMutableRange, you need only ensure that these base methods work properly. Having done so, you can be sure that all your subclass's inherited methods operate properly. NSMutableRange's Base API MethodDescription locationReturns the starting location of the receiver. Inherited from NSRange. lengthReturns the length of the receiver from its starting location. Inherited from NSRange. setLengthSets the length of the receiver. setLocationSets the starting location of the receiver.
 * See Also:NSMutableRange.setLength(int newLength), NSMutableRange.setLocation(int newLocation), NSRange, NSRange.location(), NSRange.length(), Serialized Form
 */
public class NSMutableRange extends com.webobjects.foundation.NSRange{
    /**
     * Creates and returns an empty NSMutableRange.
     */
    public NSMutableRange(){
         //TODO codavaj!!
    }

    /**
     * Creates a new NSMutableRange with the range elements of location and length.
     * Parameters:location - location of the changeable rangelength - length of the changeable range Throws: IllegalArgumentException - when any of the inputs are negative
     */
    public NSMutableRange(int location, int length){
         //TODO codavaj!!
    }

    /**
     * Creates a new NSMutableRange with the location and length values of range. This constructor is used in cloning the receiver.
     * Parameters:range - name of the array of range
     */
    public NSMutableRange(com.webobjects.foundation.NSRange range){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Simply returns this NSRange. Since NSRange objects are immutable, there's no need to make an actual clone.
     */
    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Changes the receiver to the range resulting from the intersection of otherRange and the receiver before the operation. Sets the receiver to an empty range if they do not intersect.
     */
    public void intersectRange(com.webobjects.foundation.NSRange otherRange){
        return; //TODO codavaj!!
    }

    /**
     * Sets the length of the receiver to length. Throws an IllegalArgumentException if length is a negative value.
     */
    public void setLength(int length){
        return; //TODO codavaj!!
    }

    /**
     * Sets the starting location of the receiver to location.
     */
    public void setLocation(int location){
        return; //TODO codavaj!!
    }

    /**
     * Changes the receiver to the range resulting from the union of otherRange and the receiver before the operation. This is the lowest starting location and the highest ending location of the two NSRanges.
     */
    public void unionRange(com.webobjects.foundation.NSRange otherRange){
        return; //TODO codavaj!!
    }

}
