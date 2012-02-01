package com.webobjects.foundation;
/**
 * NSComparator is an abstract class that defines an API for comparing two objects for the purpose of sorting them. The class defines one method, compare, which compares two parameters and returns one of OrderedAscending, OrderedSame, or OrderedDescending. This differs from java.lang.Comparable.compareTo which returns a non-specific positive or negative number.
 * Instead of invoking compare directly on a comparator, you typically use the NSArray method sortedArrayUsingComparator, which sorts the elements of the receiving array into a new array, or the NSMutableArray method sortUsingComparator, which sorts the elements of an array in place. NSComparator provides default comparators to use with these sorting methods.
 * See Also:Comparable.compareTo(T), NSMutableArray.sortUsingComparator(com.webobjects.foundation.NSComparator), NSArray.sortedArrayUsingComparator(com.webobjects.foundation.NSComparator)
 */
public abstract class NSComparator{
    /**
     * To be used for comparing objects of the class String, ignoring case.
     */
    public static final com.webobjects.foundation.NSComparator AscendingCaseInsensitiveStringComparator=null;

    /**
     * To be used for comparing objects of the class Number.
     */
    public static final com.webobjects.foundation.NSComparator AscendingNumberComparator=null;

    /**
     * To be used for comparing objects of the class String respecting case.
     */
    public static final com.webobjects.foundation.NSComparator AscendingStringComparator=null;

    /**
     * To be used for comparing objects of the class NSTimestamp.
     */
    public static final com.webobjects.foundation.NSComparator AscendingTimestampComparator=null;

    /**
     * To be used for comparing objects of the class String, ignoring case.
     */
    public static final com.webobjects.foundation.NSComparator DescendingCaseInsensitiveStringComparator=null;

    /**
     * To be used for comparing objects of the class Number.
     */
    public static final com.webobjects.foundation.NSComparator DescendingNumberComparator=null;

    /**
     * To be used for comparing objects of the class String, respecting case.
     */
    public static final com.webobjects.foundation.NSComparator DescendingStringComparator=null;

    /**
     * To be used for comparing objects of the class NSTimestamp.
     */
    public static final com.webobjects.foundation.NSComparator DescendingTimestampComparator=null;

    /**
     * Returned when the object arguments are in ascending order (the value of the first argument is less than the value of the second).
     * See Also:Constant Field Values
     */
    public static final int OrderedAscending=-1;

    /**
     * Returned when the object arguments are in descending order (the value of the first argument is greater than the value of the second).
     * See Also:Constant Field Values
     */
    public static final int OrderedDescending=1;

    /**
     * Returned when the values of the object arguments are equivalent. For most NSComparators, this means equal as defined by the equals method.
     * See Also:Constant Field Values
     */
    public static final int OrderedSame=0;

    public NSComparator(){
         //TODO codavaj!!
    }

    /**
     * Compares the values of object1 and object2 and returns the result, one of OrderedAscending, OrderedSame, or OrderedDescending. Specifically, for non-null x, y, and z:
     * compare(x, x) returns OrderedSame. If compare(x, y) returns OrderedSame, then compare(y, x) returns OrderedSame If compare(x, y) returns OrderedAscending, then compare(y, x) returns OrderedDescending. If compare(x, y) returns OrderedDescending, then compare(y, x) returns OrderedAscending. If compare(x, y) returns OrderedAscending and compare(y, z) returns OrderedAscending, then compare(x, z) returns OrderedAscending. Exactly one of the following is true: compare(x, x) == OrderedSame, compare(x, x) == OrderedAscending, or compare(x, x) == OrderedDescending. The result of compare(x, y) must be the same in all invocations.
     * This comparison must be an immutable total ordering relation on the set of objects compared. There is no necessary relationship between compare() and equals(), since X, Y, and Z need not be of the same class. Throws an NSComparator.ComparisonException if a comparison between first and second is impossible or undefined; for example, if either argument is null.
     */
    public abstract int compare(java.lang.Object object1, java.lang.Object object2) throws com.webobjects.foundation.NSComparator.ComparisonException;

    /**
     * Instances of the NSComparator.ComparisonException class are created and thrown when an error condition is encountered during the comparison of two objects.
     * See Also:NSComparator, Serialized Form
     */
    public static class ComparisonException extends java.lang.Exception{
        /**
         * Creates and returns a new Exception with message as the message.
         * Parameters:message - message of the Exception that is created
         */
        public ComparisonException(java.lang.String message){
             //TODO codavaj!!
        }

    }
}
