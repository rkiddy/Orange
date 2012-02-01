package com.webobjects.foundation;
/**
 * An NSRange represents a range, a measurement of a segment of something linear, such as a byte stream. An NSRange has two primary values, a location and a length. The methods of NSRange give access to these values, convert between NSRanges and their string representations, test and compare ranges, and create ranges based on operations involving the union, intersection, and subtraction of two ranges.
 * The NSRange methods described below provide the basis for all NSRange's other methods; that is, all other methods are implemented in terms of these two. If you create a subclass of NSRange, you need only ensure that these base methods work properly. Having done so, you can be sure that all your subclass's inherited methods operate properly.
 * NSRange's Base API MethodDescription lengthreturns the length of this NSRange from its starting location locationreturns the starting location of this NSRange
 * See Also:NSRange.length(), NSRange.location(), Serialized Form
 */
public class NSRange implements java.io.Serializable, java.lang.Cloneable{
    /**
     * An NSRange set to zero in location and length.
     */
    public static final com.webobjects.foundation.NSRange ZeroRange=null;

    /**
     * Creates an NSRange with zero location and length. For better performance, use the ZeroRange shared instance.
     */
    public NSRange(){
         //TODO codavaj!!
    }

    /**
     * Creates a NSRange with the range elements of location and length.
     * Parameters:location - location of the current rangelength - length of the current range Throws: IllegalArgumentException - if either location or length of the range is negative
     */
    public NSRange(int location, int length){
         //TODO codavaj!!
    }

    /**
     * Creates an NSRange with the location and length values of range.
     * Parameters:range - measurement of the linear stream segment
     */
    public NSRange(com.webobjects.foundation.NSRange range){
         //TODO codavaj!!
    }

    /**
     * Simply returns this NSRange. Since NSRange objects are immutable, there's no need to make an actual clone.
     */
    public java.lang.Object clone(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether a location falls within the limits specified by this NSRange.
     */
    public boolean containsLocation(int location){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether an object is an NSRange whose location and length are equal to this range's location and length.
     */
    public boolean equals(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Creates an NSRange from a string. The string must be of the form "{location,length}" where location is a number representing the starting location of the range and length is the range's length.
     */
    public static com.webobjects.foundation.NSRange fromString(java.lang.String string){
        return null; //TODO codavaj!!
    }

    /**
     * Provides an appropriate hash code useful for storing this NSRange in a hash-based data structure.
     */
    public int hashCode(){
        return 0; //TODO codavaj!!
    }

    /**
     * Indicates whether the range otherRange intersects this NSRange.
     */
    public boolean intersectsRange(com.webobjects.foundation.NSRange otherRange){
        return false; //TODO codavaj!!
    }

    public boolean isEmpty(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether the range's location and length are equal to this NSRange's location and length.
     */
    public boolean isEqualToRange(com.webobjects.foundation.NSRange otherRange){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether this NSRange's end points match or fall within those of another range.
     */
    public boolean isSubrangeOfRange(com.webobjects.foundation.NSRange otherRange){
        return false; //TODO codavaj!!
    }

    public int length(){
        return 0; //TODO codavaj!!
    }

    public int location(){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public boolean locationInRange(int location){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the extent of this NSRange (its starting location plus its length). This number is one greater than the last location in the range.
     */
    public int maxRange(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns an NSRange that is the intersection of a range and this NSRange. If the ranges do not intersect, returns an empty range.
     */
    public com.webobjects.foundation.NSRange rangeByIntersectingRange(com.webobjects.foundation.NSRange otherRange){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSRange that is the union of a range and this NSRange (a range constructed from the lowest starting location and the highest ending location of both NSRanges).
     */
    public com.webobjects.foundation.NSRange rangeByUnioningRange(com.webobjects.foundation.NSRange otherRange){
        return null; //TODO codavaj!!
    }

    /**
     * Subtracts a range from this NSRange and stores the result in one or two NSMutableRanges. Either or both of the the result ranges might be empty when this method finishes.
     */
    public void subtractRange(com.webobjects.foundation.NSRange otherRange, com.webobjects.foundation.NSMutableRange resultRange1, com.webobjects.foundation.NSMutableRange resultRange2){
        return; //TODO codavaj!!
    }

    /**
     * Returns a string representing this NSRange. The string is in the form "{location,length}" where location is the starting location of the range and length is its length.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
