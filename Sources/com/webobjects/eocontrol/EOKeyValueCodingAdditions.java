package com.webobjects.eocontrol;
/**
 * The EOKeyValueCodingAdditions combines (extends) the NSKeyValueCoding, NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions and EOKeyValueCoding and adds two more methods--takeValuesFromDictionary and valuesForKeys-- which are useful when working with groups of properties.
 * The EOKeyValueCodingAdditions interface contains two inner classes, EOKeyValueCodingAdditions.DefaultImplementation and EOKeyValueCodingAdditions.Utility. The former provides a default implementation of the interface, making it easy to implement on your own custom classes. The latter is a convenience class that allows you to access the properties of EOKeyValueCodingAdditions objects and non-EOKeyValueCodingAdditions objects using the same code.
 * Since the WebObjects collections such as NSArray and NSDictionary can't contain null as a value, null must be represented by a special object, NSKeyValueCoding.NullValue. NSKeyValueCoding.NullValue is a single instance of the NSKeyValueCoding.Null class and is used by the key-value coding implementations inside the WebObjects collections.
 * The default implementations of takeValuesFromDictionary and valuesForKeys translate NSKeyValueCoding.NullValue and null between NSDictionaries and enterprise objects so the objects don't have to explicitly test for NSKeyValueCoding.NullValue.
 * The methods in the EOKeyValueCodingAdditions.DefaultImplementation class are just like the methods defined by the EOKeyValueCodingAdditions interface, except they are static methods and they take an extra argument - the object on which the default implementation should operate.
 * For example, suppose you want to implement an Employee class that implements EOKeyValueCodingAdditions using EOKeyValueCodingAdditions.DefaultImplementation. Employee's valuesForKeys method would then look like this:
 * Note:Always try to use the default implementation of EOKeyValueCodingAdditions. The default implementations have significant performance optimizations. To benefit from them, EOKeyValueCodingAdditions can be implemented on a custom class as shown above by using the methods in EOKeyValueCodingAdditions.DefaultImplementation; or if your class inherits from an EOF class that implements EOKeyValueCodingAdditions, don't override the inherited implementation. Using a custom implementation incurs significant performance penalties.
 * Recall that the EOKeyValueCodingAdditions.Utility class is a convenience that allows you to access the properties of EOKeyValueCodingAdditions objects and non-EOKeyValueCodingAdditions objects using the same code.
 * Utility's methods are similar to DefaultImplementation's methods in that they are static methods and they take an extra argument, the object on which the method should operate. However, Utility's methods simply check to see if the object on which they operate is an EOKeyValueCodingAdditions object and invoke the corresponding EOKeyValueCodingAdditions method on the object if it is. Otherwise, they invoke the corresponding DefaultImplementation method, passing the object on which to operate.
 * For example, suppose that you want to access an object with the EOKeyValueCodingAdditions API but you don't know if the object is an EOKeyValueCodingAdditions object. To do so, you simply use the corresponding Utility API, as in the following line of code:
 * The above line of code is essentially a short-cut for the following:
 * See Also:NSKeyValueCoding, NSKeyValueCoding.ErrorHandling, NSKeyValueCodingAdditions, EOKeyValueCoding, EOKeyValueCodingAdditions.DefaultImplementation, EOKeyValueCodingAdditions.Utility
 */
public interface EOKeyValueCodingAdditions extends com.webobjects.foundation.NSKeyValueCodingAdditions, com.webobjects.eocontrol.EOKeyValueCoding{
    /**
     * Sets properties of the receiver with values from dictionary, using its keys to identify the properties. The default implementation invokes takeValueForKey for each key-value pair, substituting null for NSKeyValueCoding.NullValue values in the dictionary.
     */
    abstract void takeValuesFromDictionary(com.webobjects.foundation.NSDictionary dictionary);

    /**
     * Sets properties of the receiver with values from dictionary, using its keys and mapping to identify the properties. mapping associates the keys of dictionary, which are arbitrary external names for the properties to be set, with the internal or EOModel names for those properties. Each of the keys in dictionary must also be a key in mapping.
     * The default implementation invokes takeValueForKey for each key-value pair of dictionary, substituting null for NSKeyValueCoding.NullValue values in the dictionary.
     */
    abstract void takeValuesFromDictionaryWithMapping(com.webobjects.foundation.NSDictionary dictionary, com.webobjects.foundation.NSDictionary mapping);

    /**
     * Returns a dictionary containing the property values identified by each of keys. The default implementation invokes valueForKey for each key in keys, substituting NSKeyValueCoding.NullValue in the returned dictionary for returned null values.
     */
    abstract com.webobjects.foundation.NSDictionary valuesForKeys(com.webobjects.foundation.NSArray keys);

    /**
     * Returns a dictionary containing the property values identified by each of the key-value pairs in mapping. The keys of the mapping dictionary represent arbitrary external names for properties of an Enterprise Object and the values are the internal or EOModel names for these properties. The default implementation invokes valueForKey for each value in mapping, substituting NSKeyValueCoding.NullValue in the returned dictionary for returned null values.
     */
    abstract com.webobjects.foundation.NSDictionary valuesForKeysWithMapping(com.webobjects.foundation.NSDictionary mapping);

    /**
     * The EOKeyValueCodingAdditions.DefaultImplementation class provides the WebObjects default implementation of the EOKeyValueCodingAdditions interface.
     * See Also:EOKeyValueCodingAdditions
     */
    public static class DefaultImplementation{
        /**
         * Sets properties of object with values from dictionary, using its keys to identify the properties. Invokes takeValueForKey (or the corresponding NSKeyValueCoding.DefaultImplementation method) for each key-value pair, substituting null for NSKeyValueCoding.NullValue values in the dictionary.
         */
        public static void takeValuesFromDictionary(java.lang.Object object, com.webobjects.foundation.NSDictionary dictionary){
            return; //TODO codavaj!!
        }

        /**
         * Sets properties of object with values from dictionary, using its keys and mapping to identify the properties. mapping associates the keys of dictionary, which are arbitrary external names for the properties to be set, with the internal or EOModel names for those properties. If a key in dictionary does not have a corresponding entry in mapping, the external key (i.e., the key from dictionary) is used.
         * Invokes takeValueForKey (or the corresponding NSKeyValueCoding.DefaultImplementation method)for each key-value pair of dictionary, substituting null for NSKeyValueCoding.NullValue values in the dictionary.
         */
        public static void takeValuesFromDictionaryWithMapping(java.lang.Object object, com.webobjects.foundation.NSDictionary dictionary, com.webobjects.foundation.NSDictionary mapping){
            return; //TODO codavaj!!
        }

        /**
         * Returns a dictionary containing the property values of object identified by each of keys. Invokes valueForKey (or the corresponding NSKeyValueCoding.DefaultImplementation method) for each key in keys, substituting NSKeyValueCoding.NullValue in the returned dictionary for returned null values.
         */
        public static com.webobjects.foundation.NSDictionary valuesForKeys(java.lang.Object object, com.webobjects.foundation.NSArray keys){
            return null; //TODO codavaj!!
        }

        /**
         * Returns a dictionary containing the property values of object identified by each of the key-value pairs in mapping. The keys of the mapping dictionary represent arbitrary external names for properties of an Enterprise Object and the values are the internal or EOModel names for these properties. Invokes valueForKey (or the corresponding NSKeyValueCoding.DefaultImplementation method) for each value in mapping, substituting NSKeyValueCoding.NullValue in the returned dictionary for returned null values.
         */
        public static com.webobjects.foundation.NSDictionary valuesForKeysWithMapping(java.lang.Object object, com.webobjects.foundation.NSDictionary mapping){
            return null; //TODO codavaj!!
        }

    }
    /**
     * The EOKeyValueCodingAdditions.Utility class is a convenience that allows you to access the properties of EOKeyValueCodingAdditions objects and non-EOKeyValueCodingAdditions objects using the same code.
     * See Also:EOKeyValueCodingAdditions
     */
    public static class Utility{
        /**
         * If object implements EOKeyValueCodingAdditions, this method invokes takeValuesFromDictionary on object. Otherwise it invokes EOKeyValueCodingAdditions.DefaultImplementation's takeValuesFromDictionary method with object as the object on which to operate.
         */
        public static void takeValuesFromDictionary(java.lang.Object object, com.webobjects.foundation.NSDictionary dictionary){
            return; //TODO codavaj!!
        }

        /**
         * If object implements EOKeyValueCodingAdditions, this method invokes takeValuesFromDictionaryWithMapping on object. Otherwise it invokes EOKeyValueCodingAdditions.DefaultImplementation's takeValuesFromDictionaryWithMapping method with object as the object on which to operate.
         */
        public static void takeValuesFromDictionaryWithMapping(java.lang.Object object, com.webobjects.foundation.NSDictionary dictionary, com.webobjects.foundation.NSDictionary mapping){
            return; //TODO codavaj!!
        }

        /**
         * If object implements EOKeyValueCodingAdditions, this method invokes valuesForKeys on object. Otherwise it invokes EOKeyValueCodingAdditions.DefaultImplementation's valuesForKeys method with object as the object on which to operate.
         */
        public static com.webobjects.foundation.NSDictionary valuesForKeys(java.lang.Object object, com.webobjects.foundation.NSArray keys){
            return null; //TODO codavaj!!
        }

        /**
         * If object implements EOKeyValueCodingAdditions, this method invokes valuesForKeysWithMapping on object. Otherwise it invokes EOKeyValueCodingAdditions.DefaultImplementation's valuesForKeysWithMapping method with object as the object on which to operate.
         */
        public static com.webobjects.foundation.NSDictionary valuesForKeysWithMapping(java.lang.Object object, com.webobjects.foundation.NSDictionary mapping){
            return null; //TODO codavaj!!
        }

    }
}
