package com.webobjects.foundation;
/**
 * The NSKeyValueCoding interface defines a data transport mechanism in which the properties of an object are accessed indirectly by name (or key), rather than directly through invocation of an accessor method or as instance variables. Thus, all of an object's properties can be accessed in a consistent manner. The takeValueForKey method sets the value for an object's property, and valueForKey returns the value for an object's property.
 * The NSKeyValueCoding interface contains an inner interface, NSKeyValueCoding.ErrorHandling, that defines an extension to the basic NSKeyValueCoding interface for handling errors that occur during key-value coding.
 * Additionally, NSKeyValueCoding contains two inner classes, NSKeyValueCoding.DefaultImplementation and NSKeyValueCoding.Utility. The former provides a default implementation of the interface, making it easy to implement NSKeyValueCoding on your's own custom classes. The latter is a convenience that allows you to access the properties of NSKeyValueCoding objects and non-NSKeyValueCoding objects using the same code. Both the DefaultImplementation class and the Utility class provide NSKeyValueCoding.ErrorHandling API in addition to basic NSKeyValueCoding API.
 * The methods in the NSKeyValueCoding.DefaultImplementation class are just like the methods defined by the NSKeyValueCoding interface (and the NSKeyValueCoding.ErrorHandling interface), except they are static methods and they take an extra argument -- the object on which the default implementation should operate.
 * For example, suppose you want to implement an Employee class that implements NSKeyValueCoding using NSKeyValueCoding.DefaultImplementation. Employee's valueForKey method would then look like this:
 * The NSKeyValueCoding.DefaultImplementation methods use accessor methods normally implemented by objects (such as setKey and key), or they access instance variables directly if no accessors for a key exist.
 * Recall that the NSKeyValueCoding.Utility class is a convenience that allows you to access the properties of NSKeyValueCoding objects and non-NSKeyValueCoding objects using the same code.
 * Utility's methods are similar to DefaultImplementation's methods in that they are static methods and they take an extra argument -- the object on which the method should operate. However, Utility's methods simply check to see if the object on which they operate is an NSKeyValueCoding object and invoke the corresponding NSKeyValueCoding method on the object if it is. Otherwise, they invoke the corresponding DefaultImplementation method, passing the object on which to operate.
 * For example, suppose that you want to access an object with the NSKeyValueCoding API but you do not know if the object is an NSKeyValueCoding object. To do so, you simply use the corresponding Utility API, as in the following line of code:
 * The above line of code is simply a short-cut for the following:
 * By default, key-value coding methods directly access instance variables if there are no accessor methods for setting and retrieving values. However, you can modify this behavior without overriding the default implementation. To instruct the default implementation to not directly access instance variables, implement the static method canAccessFieldsDirectly on your NSKeyValueCoding class to return false.
 * public static boolean canAccessFieldsDirectly()
 * An NSKeyValueCoding class does not have to implement this method. It's an optional method that allows a class to tailor key-value coding behavior. By default, the key-value implementation provided by NSKeyValueCoding.DefaultImplementation accesses fields directly if it can not find corresponding accessor methods. An NSKeyValueCoding class can override this behavior by implementing this method to return false, in which case the key-value coding methods will not access fields directly.
 * This method is not strictly part of this interface because static methods cannot be formally declared in an interface. However, this method is so closely related to the interface as to be considered part of it.
 * See Also:NSKeyValueCoding.takeValueForKey(java.lang.Object, java.lang.String), NSKeyValueCoding.valueForKey(java.lang.String), NSKeyValueCoding.ErrorHandling, NSKeyValueCoding.DefaultImplementation, NSKeyValueCoding.Utility
 */
public interface NSKeyValueCoding{
    /**
     * A constant used to represent null in places which do not handle raw null.
     */
    static final com.webobjects.foundation.NSKeyValueCoding.Null NullValue=null;

    /**
     * Sets the value for the property identified by key to value.
     * The default implementation provided by NSKeyValueCoding.DefaultImplementation works as follows:
     * Searches for a public accessor method of the form setKey, and invokes it if there is one. If a public accessor method is not found, searches for a private accessor method of the form _setKey, and invokes it if there is one. If an accessor method is not found and the static method canAccessFieldsDirectly returns true, searches for a field based on key and sets its value directly. For the key "lastName", this would be _lastName, _isLastName, lastName, or isLastName. If the type of the value argument is not compatible with the underlying field or method parameter, the default implementation will make an effort to convert between different Java numeric types (Integer, Double, BigDecimal, etc) as well as between Boolean and Number (true = 1, false = 0). If any other conversion would be necessary, an exception is thrown. If neither an accessor method nor a field is found, it is an error condition. It invokes handleTakeValueForUnboundKey if the object implements NSKeyValueCoding.ErrorHandling or throws NSKeyValueCoding.UnknownKeyException if the object does not.
     * Note: : The default implementations have significant performance optimizations. To benefit from them, implement NSKeyValueCoding on a custom class as shown above by using the methods in NSKeyValueCoding. DefaultImplementation, or if your class inherits from an WebObjects class that implements NSKeyValueCoding, do not override the inherited implementation. Using a custom implementation incurs significant performance penalties.
     */
    abstract void takeValueForKey(java.lang.Object value, java.lang.String key);

    /**
     * Retrieves the value of the property named by key.
     * The default implementation provided by NSKeyValueCoding.DefaultImplementation works as follows:
     * Searches for a public accessor method based on key. For example, with a key of "lastName", the method looks for a method named getLastName, lastName, or isLastName. If a public accessor method is not found, searches for a private accessor method based on key (a method preceded by an underbar). For example, with a key of "lastName", the method looks for a method named _getLastName, _lastName, or _isLastName If an accessor method is not found and the static method canAccessFieldsDirectly returns true, the method searches for a field based on key and returns its value directly. For the key "lastName", this would be _lastName, _isLastName, lastName, or isLastName. If neither an accessor method nor a field is found, the method invokes handleQueryWithUnboundKey (defined in NSKeyValueCoding.ErrorHandling).
     * Note: The default implementations have significant performance optimizations. To benefit from them, implement NSKeyValueCoding on a custom class as shown above by using the methods in NSKeyValueCoding.DefaultImplementation, or if your class inherits from an WebObjects class that implements NSKeyValueCoding, do not override the inherited implementation. Using a custom implementation incurs significant performance penalties.
     */
    abstract java.lang.Object valueForKey(java.lang.String key);

    /**
     * Instances of the NSKeyValueCoding.UnknownKeyException class are created and thrown when an unknown key is encountered during key-value coding.
     * For example, suppose an Employee object receives a valueForKey message with "partNumber" as the key. The Employee class does not declare a method or instance variable for "partNumber", so valueForKey throws an UnknownKeyException. An NSKeyValueCoding.UnknownKeyException has a user info dictionary containing entries for the object for which key-value coding failed (TargetObjectUserInfoKey) and the unknown key (UnknownUserInfoKey). For the Employee/partNumber example, the TargetObjectUserInfoKey entry would contain the Employee object and the UnknownUserInfoKey would contain the string "partNumber".
     * See Also:NSKeyValueCoding.UnknownKeyException.object(), NSKeyValueCoding.UnknownKeyException.key(), NSKeyValueCoding.valueForKey, NSKeyValueCoding, NSKeyValueCoding.ErrorHandling, Serialized Form
     */
    public static class UnknownKeyException extends java.lang.RuntimeException{
        /**
         * Deprecated.
         */
        public static final java.lang.String TargetObjectUserInfoKey="NSTargetObjectUserInfoKey";

        /**
         * Deprecated.
         */
        public static final java.lang.String UnknownUserInfoKey="NSUnknownUserInfoKey";

        /**
         * Deprecated.
         * Parameters:message - A message or summary associated with the new exceptionuserInfo - the user info dictionary containing more information about the errorSee Also:NSKeyValueCoding.UnknownKeyException.NSKeyValueCoding.UnknownKeyException(String, Object, String), NSKeyValueCoding.UnknownKeyException.TargetObjectUserInfoKey, NSKeyValueCoding.UnknownKeyException.UnknownUserInfoKey
         */
        public UnknownKeyException(java.lang.String message, com.webobjects.foundation.NSDictionary userInfo){
             //TODO codavaj!!
        }

        /**
         * Creates and returns a new UnknownKeyException with message as the message and a user info dictionary specifying object for the TargetObjectUserInfoKey and key for the UnknownUserInfoKey.
         * Parameters:message - the message created and returnobject - object specified for the TargetObjectUserInfoKey. It may be nullkey - identifies the property of an object. It may be nullSee Also:NSKeyValueCoding.UnknownKeyException.object(), NSKeyValueCoding.UnknownKeyException.key()
         */
        public UnknownKeyException(java.lang.String message, java.lang.Object object, java.lang.String key){
             //TODO codavaj!!
        }

        /**
         * This method returns the key that NSKeyValueCoding operations were using at the time of the error, or null if it is unavailable. This is equivalent to getting the UnknownUserInfoKey entry from the userInfo dictionary.
         */
        public java.lang.String key(){
            return null; //TODO codavaj!!
        }

        /**
         * This method returns the value that NSKeyValueCoding operations were using at the time of the error, or null if it is unavailable. This is equivalent to getting the TargetObjectUserInfoKey entry from the userInfo dictionary.
         */
        public java.lang.Object object(){
            return null; //TODO codavaj!!
        }

        public java.lang.String toString(){
            return null; //TODO codavaj!!
        }

        /**
         * Deprecated.
         */
        public com.webobjects.foundation.NSDictionary userInfo(){
            return null; //TODO codavaj!!
        }

    }
    /**
     * The NSKeyValueCoding.Utility class is a convenience that allows you to access the properties of NSKeyValueCoding objects and non-NSKeyValueCoding objects using the same code.
     * See Also:NSKeyValueCoding
     */
    public static class Utility{
        /**
         * If object implements NSKeyValueCoding.ErrorHandling, this method invokes handleQueryWithUnboundKey on object. Otherwise it invokes NSKeyValueCoding.DefaultImplementation's handleQueryWithUnboundKey method with object as the object on which to operate.
         */
        public static java.lang.Object handleQueryWithUnboundKey(java.lang.Object object, java.lang.String key){
            return null; //TODO codavaj!!
        }

        /**
         * If object is an NSKeyValueCoding.ErrorHandling, this method invokes handleTakeValueForUnboundKey on object. Otherwise it invokes NSKeyValueCoding.DefaultImplementation's handleTakeValueForUnboundKey method with object as the object on which to operate.
         */
        public static void handleTakeValueForUnboundKey(java.lang.Object object, java.lang.Object value, java.lang.String key){
            return; //TODO codavaj!!
        }

        /**
         * Returns the Null Object (NSKeyValueCoding.NullValue ).
         * Implementation note: Implementations of this method need not create a separate NSKeyValueCoding.Null object for each call. Using this method is likely to have comparable cost to using the like-named field. (Unlike this method, the field does not provide type safety.)
         */
        public static final java.lang.Object nullValue(){
            return null; //TODO codavaj!!
        }

        /**
         * If object implements NSKeyValueCoding, this method invokes takeValueForKey on object. Otherwise it invokes NSKeyValueCoding.DefaultImplementation's takeValueForKey method with object as the object on which to operate.
         */
        public static void takeValueForKey(java.lang.Object object, java.lang.Object value, java.lang.String key){
            return; //TODO codavaj!!
        }

        /**
         * If object is an NSKeyValueCoding.ErrorHandling, this method invokes unableToSetNullForKey on object. Otherwise it invokes NSKeyValueCoding.DefaultImplementation's unableToSetNullForKey method with object as the object on which to operate.
         */
        public static void unableToSetNullForKey(java.lang.Object object, java.lang.String key){
            return; //TODO codavaj!!
        }

        /**
         * If object implements NSKeyValueCoding, this method invokes valueForKey on object. Otherwise it invokes NSKeyValueCoding.DefaultImplementation's valueForKey method with object as the object on which to operate.
         */
        public static java.lang.Object valueForKey(java.lang.Object object, java.lang.String key){
            return null; //TODO codavaj!!
        }

    }
    /**
     * NSKeyValueCoding.Null is a final class that defines a unique object used to represent null values in collection objects, such as NSArrays, which do not allow null values.
     * For instance, Enterprise Objects Framework uses NSKeyValueCoding.Null to represent null values from database rows in its database level snapshots (NSDictionary objects). However, Enterprise Objects Framework automatically translates NSKeyValueCoding.Null to null in enterprise objects, so you should rarely need to write code that accounts for this class.
     * Whenever null is represented by NSKeyValueCoding.Null, it should be represented with the instance stored in the NSKeyValueCoding constant, NullValue. You can safely use this instance with the == operator to test for the presence of a null value:
     * blockquote if (value == NSKeyValueCoding.NullValue){ //...... } /blockquote
     * See Also:NSKeyValueCoding.NullValue, Serialized Form
     */
    public static final class Null implements java.io.Serializable, java.lang.Cloneable, com.webobjects.foundation.NSCoding{
        /**
         * Description copied from interface:
         * Allows the receiver, before being encoded, to substitute a class other than its own in a coder. For example, private subclasses can substitute the name of a public superclass when being encoded.
         */
        public java.lang.Class classForCoder(){
            return null; //TODO codavaj!!
        }

        /**
         * Simply returns the shared instance of NSKeyValueCoding.Null stored in the constant NullValue.
         */
        public java.lang.Object clone(){
            return null; //TODO codavaj!!
        }

        /**
         * Returns the shared instance of NSKeyValueCoding.Null stored in the NSKeyValueCoding constant NullValue.
         */
        public static java.lang.Object decodeObject(com.webobjects.foundation.NSCoder coder){
            return null; //TODO codavaj!!
        }

        /**
         * Description copied from interface:
         * Encodes the receiver using coder. Object type information along with an object's data is stored.
         */
        public void encodeWithCoder(com.webobjects.foundation.NSCoder coder){
            return; //TODO codavaj!!
        }

        public java.lang.String toString(){
            return null; //TODO codavaj!!
        }

    }
    /**
     * The NSKeyValueCoding.ErrorHandling interface declares an API for handling errors that occur during key-value coding. If implemented, these methods allow customized handling error in the default implementation of key value coding.
     * See Also:NSKeyValueCoding
     */
    public static interface ErrorHandling{
        /**
         * Invoked from valueForKey when it finds no property binding for key. The default implementation throws an NSKeyValueCoding.UnknownKeyException, with the target object(TargetObjectUserInfoKey) and key(UnknownUserInfokey) in the user info. An NSKeyValueCoding.ErrorHandling class can override this method to handle the query in some other way. The method can return a value, in which case that value is returned by the corresponding valueForKey invocation.
         */
        abstract java.lang.Object handleQueryWithUnboundKey(java.lang.String key);

        /**
         * Invoked from takeValueForKey when it finds no property binding for key. The default implementation throws an NSKeyValueCoding.UnknownKeyException, with the target object(TargetObjectUserInfoKey) and key(UnknownUserInfoKey) in the user info dictionary of the exception. An NSKeyValueCoding.ErrorHandling class can override this method to handle the error in some other way.
         */
        abstract void handleTakeValueForUnboundKey(java.lang.Object value, java.lang.String key);

        /**
         * Invoked from takeValueForKey when it is given a null value for a scalar property (such as an int or a float). The default implementation throws an IllegalArgumentException. You might want to implement the method (or override the inherited implementation) to handle the request in some other way, such as by substituting new Integer(0) or a sentinel value and invoking takeValueForKey again.
         */
        abstract void unableToSetNullForKey(java.lang.String key);

    }
    public static class MapImplementation{
        public static void takeValueForKey(java.util.Map map, java.lang.Object value, java.lang.String key){
            return; //TODO codavaj!!
        }

        public static java.lang.Object valueForKey(java.util.Map map, java.lang.String key){
            return null; //TODO codavaj!!
        }

    }
    /**
     * The NSKeyValueCoding.DefaultImplementation class provides the WebObjects default implementations of the NSKeyValueCoding and NSKeyValueCoding.ErrorHandling interfaces.
     * See Also:NSKeyValueCoding.ErrorHandling, NSKeyValueCoding
     */
    public static class DefaultImplementation{
        /**
         * Invoked from valueForKey when it finds no property binding for key. The default implementation raises an NSKeyValueCoding.UnknownKeyException.
         */
        public static java.lang.Object handleQueryWithUnboundKey(java.lang.Object object, java.lang.String key){
            return null; //TODO codavaj!!
        }

        /**
         * Throws an NSKeyValueCoding.UnknownKeyException with object as the exception's object and key as the exception's key. Invoked from takeValueForKey when it finds no property binding for key. The default implementation raises an NSKeyValueCoding.UnknownKeyException
         */
        public static void handleTakeValueForUnboundKey(java.lang.Object object, java.lang.Object value, java.lang.String key){
            return; //TODO codavaj!!
        }

        /**
         * Sets object's property identified by key to value, or invokes handleTakeValueForUnboundKey.
         * The default implementation searches for a method or instance variable fitting a pattern for the key. For example, for key "foo" the search order is as follows: (a) method "setFoo"; (b) method "_setFoo"; (c) field "_foo"; (d) field "_isFoo"; (e) field "foo"; (f) field "isFoo". If an unknown key is encountered and the object implements the NSKeyValueCoding.ErrorHandling interface, handleTakeValueForUnboundKey is invoked, otherwise a NSKeyValueCoding.UnknownKeyException is raised.
         */
        public static void takeValueForKey(java.lang.Object object, java.lang.Object value, java.lang.String key){
            return; //TODO codavaj!!
        }

        /**
         * Invoked from takeValueForKey when it is given a null value for a scalar property (such as an int or a float). The default implementation raises an IllegalArgumentException.
         */
        public static void unableToSetNullForKey(java.lang.Object object, java.lang.String key){
            return; //TODO codavaj!!
        }

        /**
         * Retrieves the value associated with the property named key on object.
         * The default implementation searches first for a method and (if canAccessFieldsDirectly is true) for instance variables matching key. For example, for key "foo" the search order is as follows: (a) method "getFoo"; (b) method "foo"; (c) method "isFoo"; (d) method "_getFoo"; (e) method "_foo"; (f) method "_isFoo"; (g) field "_foo"; (h) field "_isFoo"; (i) field "foo"; (j) field "isFoo". If an unknown key is encountered and the object implements the NSKeyValueCoding.ErrorHandling interface, handleQueryWithUnboundKey is invoked, otherwise a NSKeyValueCoding.UnknownKeyException is raised.
         */
        public static java.lang.Object valueForKey(java.lang.Object object, java.lang.String key){
            return null; //TODO codavaj!!
        }

    }
    /**
     * NSKeyValueCoding.ValueAccessor is an abstract class that establishes a mechanism by which NSKeyValueCoding can operate on object's package access instance variables.
     * By default, Foundation's implementations of NSKeyValueCoding cannot access package access instance variables. If you have package access instance variables in your NSKeyValueCoding objects, you can make them available to key-value coding in one of the three ways:
     * Implement public setKey and key accessor methods for those instance variables that set and return the instance variable's values. Make the instance variables public. Add a subclass of NSKeyValueCoding.ValueAccessor named KeyValueCodingProtectedAccessor to your package. This class provides a mechanism to manipulate package access instance variables. The best solution is to implement accessor methods or to make the instance variables public. However, if you have a lot of classes with a lot of package access instance variables, you can use the short-term solution that NSKeyValueCoding.ValueAccessor provides until you make the necessary changes to your code.
     * To use NSKeyValueCoding.ValueAccessor's mechanism, simply create a class in your package as follows:
     * See Also:NSKeyValueCoding
     */
    public static abstract class ValueAccessor{
        /**
         * empty constructor is required for subclasses implementing the ValueAccessor interface
         */
        public ValueAccessor(){
             //TODO codavaj!!
        }

        public abstract java.lang.Object fieldValue(java.lang.Object object, java.lang.reflect.Field field) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException;

        /**
         * Uses method to return object's corresponding property value.
         */
        public abstract java.lang.Object methodValue(java.lang.Object object, java.lang.reflect.Method method) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException;

        public static com.webobjects.foundation.NSKeyValueCoding.ValueAccessor protectedAccessorForPackageNamed(java.lang.String packageName){
            return null; //TODO codavaj!!
        }

        /**
         * Removes (unregisters) the value accessor for the package identified by packageName.
         */
        public static void removeProtectedAccessorForPackageNamed(java.lang.String packageName){
            return; //TODO codavaj!!
        }

        /**
         * Sets object's field value to value.
         */
        public abstract void setFieldValue(java.lang.Object object, java.lang.reflect.Field field, java.lang.Object value) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException;

        /**
         * Uses method to set object's corresponding property to value.
         */
        public abstract void setMethodValue(java.lang.Object object, java.lang.reflect.Method method, java.lang.Object value) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException;

        /**
         * Sets the value accessor for the package identified by packageName to valueAccessor.
         */
        public static void setProtectedAccessorForPackageNamed(com.webobjects.foundation.NSKeyValueCoding.ValueAccessor valueAccessor, java.lang.String packageName){
            return; //TODO codavaj!!
        }

    }
}
