package com.webobjects.eocontrol;
/**
 * The EOKeyValueCoding interface defines an extension to the basic NSKeyValueCoding and NSKeyValueCoding.ErrorHandling interfaces. The pair of methods in EOKeyValueCoding - takeStoredValueForKey and storedValueForKey - are an API for use by the Enterprise Object Framework for transporting data to and from trusted sources.
 * For example, takeStoredValueForKey is used to initialize an object's properties with values fetched from the database, whereas NSKeyValueCoding's takeValueForKey is used to modify an object's properties to values provided by a user (from a graphical user interface) or other business logic.
 * The EOKeyValueCoding interface contains two inner classes, EOKeyValueCoding.DefaultImplementation and EOKeyValueCoding.Utility. The former provides a default implementation of the interface, making it easy to implement on your own custom classes. The latter is a convenience class that allows you to access the properties of EOKeyValueCoding objects and non-EOKeyValueCoding objects using the same code.
 * The methods in the EOKeyValueCoding.DefaultImplementation class are just like the methods defined by the EOKeyValueCoding interface, except they are static methods and they take an extra argument - the object on which the default implementation should operate.
 * For example, suppose it is wanted to implement an Employee class that implements EOKeyValueCoding using EOKeyValueCoding.DefaultImplementation. Employee's storedValueForKey method would then look like this:
 * Note:Always try to use the default implementation of EOKeyValueCoding. The default implementations have significant performance optimizations. To benefit from them, EOKeyValueCoding can be implemented on a custom class as shown above by using the methods in EOKeyValueCoding.DefaultImplementation; or if your class inherits from an EOF class that implements EOKeyValueCoding, don't override the inherited implementation. Using a custom implementation incurs significant performance penalties.
 * Recall that the EOKeyValueCoding.Utility class is a convenience that allows to access the properties of EOKeyValueCoding objects and non-EOKeyValueCoding objects using the same code.
 * Utility's methods are similar to DefaultImplementation's methods in that they are static methods and they take an extra argument - the object on which the method should operate. However, Utility's methods simply check to see if the object on which they operate is an EOKeyValueCoding object and invoke the corresponding EOKeyValueCoding method on the object if it is. Otherwise, they invoke the corresponding DefaultImplementation method, passing the object on which to operate.
 * For example, suppose that you want to access an object with the EOKeyValueCoding API but you don't know if the object is an EOKeyValueCoding object. To do so, you simply use the corresponding Utility API, as in the following line of code:
 * The above line of code is essentially a short-cut for the following:
 * If you always want the method of EOKeyValueCoding to work exactly like the corresponding methods on NSKeyValueCoding, implement the static method
 * on your EOKeyValueCoding class to return false.
 * An EOKeyValueCoding class doesn't have to implement this method. It's an optional method that allows a class to tailor key-value coding behavior. By default, the key-value implementation provided by EOKeyValueCoding.DefaultImplementation does use private accessors. An EOKeyValueCoding class can override this behavior by implementing this method to return false, in which case the key-value coding methods don't use private accessors.
 * This method isn't strictly part of this interface because static methods can't be formally declared in an interface. However, this method is so closely related to the interface as to be considered part of it.
 * See Also:NSKeyValueCoding, NSKeyValueCoding.ErrorHandling, EOKeyValueCoding.DefaultImplementation, EOKeyValueCoding.Utility
 */
public interface EOKeyValueCoding extends com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling{
    /**
     * Returns the property identified by key. This method is used when the value is retrieved for storage in an object store (generally, this is ultimately in a database) or for inclusion in a snapshot. The default implementation provided by EOKeyValueCoding.DefaultImplementation is similar to the implementation of NSKeyValueCoding.DefaultImplementation's valueForKey, but it resolves key with a different method and field search order:
     * Searches for a private accessor method based on key (a method preceded by an underbar). For example, with a key of "value", storedValueForKey looks for a method named _getValue, _isValue or _value. If a private accessor method isn't found, searches for a field based on key and returns its value directly. For example, with a key of "value", storedValueForKey looks for a field named _value, _isValue, value, or isValue. If neither a private accessor method or a field is found, storedValueForKey searches for a public accessor method based on key. For the key "value", this would be getValue, isValue or value. If key is unknown, storedValueForKey calls handleQueryWithUnboundKey, defined in NSKeyValueCoding.ErrorHandling.
     * This different search order allows an object to bypass processing that is performed before returning a value through public API. However, if you always want to use the search order in valueForKey, you can implement the static method shouldUseStoredAccessors to return false. And as with valueForKey, you can prevent direct access of a field with the static method canAccessFieldsDirectly.
     */
    abstract java.lang.Object storedValueForKey(java.lang.String key);

    /**
     * Sets the property identified by key to value. This method is used to initialize the receiver with values from an object store (generally, this is ultimately from a database) or to restore a value from a snapshot. The default implementation provided by EOKeyValueCoding.DefaultImplementation is similar to the implementation of NSKeyValueCoding.DefaultImplementation's takeValueForKey, but it resolves key with a different method and field search order:
     * Searches for a private accessor method based on key (a method preceded by an underbar). For example, with a key of "value", takeStoredValueForKey looks for a method named _setValue. If a private accessor method isn't found, searches for a field based on key and sets its value directly. For example, with a key of "value", takeStoredValueForKey looks for a field named _value, _isValue, value, or isValue. If neither a private accessor method or a field is found, takeStoredValueForKey searches for a public accessor method based on key. For the key "value", this would be setValue. If key is unknown, takeStoredValueForKey calls handleTakeValueForUnboundKey.
     * This different search order allows an object to bypass processing that is performed before setting a value through public API. However, if you always want to use the search order in takeValueForKey, you can implement the static method shouldUseStoredAccessors to return false. And as with takeValueForKey, you can prevent direct access of a field with the static method canAccessFieldsDirectly.
     */
    abstract void takeStoredValueForKey(java.lang.Object value, java.lang.String key);

    /**
     * The EOKeyValueCoding.Utility class is a convenience that allows you to access the properties of EOKeyValueCoding objects and non-EOKeyValueCoding objects using the same code.
     * See Also:EOKeyValueCoding
     */
    public static class Utility{
        /**
         * If object implements EOKeyValueCoding, this method invokes storedValueForKey on object. Otherwise it invokes EOKeyValueCoding.DefaultImplementation's storedValueForKey method with object as the object on which to operate.
         */
        public static java.lang.Object storedValueForKey(java.lang.Object object, java.lang.String key){
            return null; //TODO codavaj!!
        }

        /**
         * If object implements EOKeyValueCoding, this method invokes takeStoredValueForKey on object. Otherwise it invokes EOKeyValueCoding.DefaultImplementation's takeStoredValueForKey method with object as the object on which to operate.
         */
        public static void takeStoredValueForKey(java.lang.Object object, java.lang.Object value, java.lang.String key){
            return; //TODO codavaj!!
        }

    }
    /**
     * The EOKeyValueCoding.DefaultImplementation class provides the WebObjects default implementation of the EOKeyValueCoding interface.
     * See Also:EOKeyValueCoding
     */
    public static class DefaultImplementation{
        /**
         * Retrieves the value associated with the property named key on object. This method is used when the value is retrieved for storage in an object store (generally, this ultimately in a database) or for inclusion in a snapshot.
         * The default implementation searches for a method and (if canAccessFieldsDirectly is true) for a field matching key. For example, for key "value" the search order is as follows: (a) method "_getValue"; (b) method "_value"; (c) method "_isValue"; (d) field "_value"; (e) field "_isValue"; (f) field "value"; (g) field "isValue"; (h) method "getValue"; (i) method "value"; (j) method "isValue". If an unknown key is encountered and the object implements the NSKeyValueCoding.ErrorHandling interface, handleQueryWithUnboundKey is invoked, otherwise a NSKeyValueCoding.UnknownKeyException is raised.
         */
        public static java.lang.Object storedValueForKey(java.lang.Object object, java.lang.String key){
            return null; //TODO codavaj!!
        }

        /**
         * Sets the property identified by key to value on object. This method is used to initialize the receiver with values from an object store (generally, this is ultimately from a database) or to restore a value from a snapshot.
         * The default implementation searches for a method and (if canAccessFieldsDirectly is true) for a field matching key. For example, for key "value" the search order is as follows: (a) method "_setValue"; (b) field "_value"; (c) field "_isValue"; (d) field "value"; (e) field "isValue"; (f) method "setValue". If an unknown key is encountered and the object implements the NSKeyValueCoding.ErrorHandling interface, handleTakeValueForUnboundKey is invoked, otherwise a NSKeyValueCoding.UnknownKeyException is raised.
         */
        public static void takeStoredValueForKey(java.lang.Object object, java.lang.Object value, java.lang.String key){
            return; //TODO codavaj!!
        }

    }
}
