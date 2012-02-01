package com.webobjects.eocontrol;
/**
 * An EOSortOrdering object specifies the way that a group of objects should be sorted, using a property key and a method selector for comparing values of that property. EOSortOrderings are used both to generate SQL when fetching rows from a database server, and to sort objects in memory. EOFetchSpecification objects use an array of EOSortOrderings, which are applied in series to perform sorts by more than one property.
 * Using the mapping in the table above, the array of EOSortOrderings (nameOrdering) created in the following code example:
 * results in this ORDER BY clause:
 * The methods sortedArrayUsingKeyOrderArray and sortArrayUsingKeyOrderArray are used to sort objects in memory. Given an array of objects and an array of EOSortOrderings, sortedArrayUsingKeyOrderArray returns a new array of objects sorted according to the specified EOSortOrderings. Similarly, sortArrayUsingKeyOrderArray sorts the provided array of objects in place. This code fragment, for example, sorts an array of Employee objects in place, by last name, then first name using the array of EOSortOrderings created above:
 * See Also:EOSortOrdering.sortArrayUsingKeyOrderArray(com.webobjects.foundation.NSMutableArray, com.webobjects.foundation.NSArray), EOSortOrdering.sortedArrayUsingKeyOrderArray(com.webobjects.foundation.NSArray, com.webobjects.foundation.NSArray), Serialized Form
 */
public class EOSortOrdering implements java.io.Serializable, com.webobjects.foundation.NSCoding, com.webobjects.eocontrol.EOKeyValueArchiving{
    public static final com.webobjects.foundation.NSSelector CompareAscending=null;

    public static final com.webobjects.foundation.NSSelector CompareCaseInsensitiveAscending=null;

    public static final com.webobjects.foundation.NSSelector CompareCaseInsensitiveDescending=null;

    public static final com.webobjects.foundation.NSSelector CompareDescending=null;

    /**
     * Creates a new EOSortOrdering object. If key and selector are provided, the new EOSortOrdering is initialized with them.
     * Parameters:key - property key to sort objects byselector - selector to use when comparing values for key in objectsSee Also:EOSortOrdering.sortOrderingWithKey(java.lang.String, com.webobjects.foundation.NSSelector)
     */
    public EOSortOrdering(java.lang.String key, com.webobjects.foundation.NSSelector selector){
         //TODO codavaj!!
    }

    /**
     * Conformance to NSCoding.
     */
    public java.lang.Class classForCoder(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSCoding.
     */
    public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to EOKeyValueArchiving.
     */
    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to NSCoding.
     */
    public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to EOKeyValueArchiving.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * Returns the key by which the receiver orders items.
     */
    public java.lang.String key(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the method selector used to compare values when sorting.
     */
    public com.webobjects.foundation.NSSelector selector(){
        return null; //TODO codavaj!!
    }

    /**
     * Sorts objects in array in place according to the EOSortOrderings in sortOrderings. The objects are compared by extracting the sort properties using the NSKeyValueCoding method valueForKey and sending them compare... messages. See the table in
     * Sorting with SQL
     * for a list of the compare methods.
     */
    public static void sortArrayUsingKeyOrderArray(com.webobjects.foundation.NSMutableArray array, com.webobjects.foundation.NSArray sortOrderings){
        return; //TODO codavaj!!
    }

    /**
     * Creates and returns a new array by sorting objects according to the EOSortOrderings in sortOrderings. The objects are compared by extracting the sort properties using the added EOKeyValueCoding method valueForKey and sending them compare... messages. See the table in
     * Sorting with SQL
     * for a list of the compare methods.
     */
    public static com.webobjects.foundation.NSArray sortedArrayUsingKeyOrderArray(com.webobjects.foundation.NSArray array, com.webobjects.foundation.NSArray sortOrderings){
        return null; //TODO codavaj!!
    }

    /**
     * Creates an EOSortOrdering based on key and selector.
     */
    public static com.webobjects.eocontrol.EOSortOrdering sortOrderingWithKey(java.lang.String key, com.webobjects.foundation.NSSelector selector){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a description of the receiver.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * The Comparison interface defines methods for comparing values. These methods are used for sorting value objects. Support for these methods is provided for String, Number, and Date using EOSortOrdering.ComparisonSupport. EONullValue implements the interface directly. You should implement this interface for any value classes you write that you want to be properly sorted by EOSortOrdering instances.
     */
    public static interface Comparison{
        abstract int compareAscending(java.lang.Object other);

        abstract int compareCaseInsensitiveAscending(java.lang.Object other);

        abstract int compareCaseInsensitiveDescending(java.lang.Object other);

        abstract int compareDescending(java.lang.Object other);

    }
    /**
     * ComparisonSupport provides default implementations of the EOSortOrdering.Comparison interface and a registry for support objects.
     */
    public static class ComparisonSupport{
        public ComparisonSupport(){
             //TODO codavaj!!
        }

        /**
         * Returns the ordering of left relative to right.
         */
        public int compareAscending(java.lang.Object left, java.lang.Object right){
            return 0; //TODO codavaj!!
        }

        /**
         * Returns the ordering of left relative to right, ignoring case.
         */
        public int compareCaseInsensitiveAscending(java.lang.Object left, java.lang.Object right){
            return 0; //TODO codavaj!!
        }

        /**
         * Returns the ordering of left relative to right, ignoring case.
         */
        public int compareCaseInsensitiveDescending(java.lang.Object left, java.lang.Object right){
            return 0; //TODO codavaj!!
        }

        /**
         * Returns the ordering of left relative to right.
         */
        public int compareDescending(java.lang.Object left, java.lang.Object right){
            return 0; //TODO codavaj!!
        }

        /**
         * Compares the two objects using selector. You should use this method to compare value objects instead of calling selector directly. This method is the entry point for the comparison support, and calls methods in support objects if appropriate.
         */
        public static int compareValues(java.lang.Object left, java.lang.Object right, com.webobjects.foundation.NSSelector selector){
            return 0; //TODO codavaj!!
        }

        /**
         * Sets support as the support object to be used for comparing instances of aClass. When compareValues is called, the methods in support are used to do the comparison for instances of aClass.
         */
        public static void setSupportForClass(com.webobjects.eocontrol.EOSortOrdering.ComparisonSupport support, java.lang.Class aClass){
            return; //TODO codavaj!!
        }

        /**
         * Returns the support object used for doing sort ordering comparisons for instances of aClass.
         */
        public static com.webobjects.eocontrol.EOSortOrdering.ComparisonSupport supportForClass(java.lang.Class aClass){
            return null; //TODO codavaj!!
        }

    }
}
