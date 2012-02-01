package com.webobjects.foundation;
/**
 * The NSValidation interface defines a validation mechanism in which the properties of an object are validated indirectly by name (or key), rather than directly through invocation of an specific validation method. Thus, all of an object's properties can be validated in a consistent manner. The validateValueForKey method confirms that a value is legal for a particular property, and validateTakeValueForKeyPath performs the validation and assigns the value if it's legal and different from the current value.
 * The NSValidation interface contains two inner classes, NSValidation.DefaultImplementation and NSValidation.Utility. The former provides a default implementation of the interface, making it easy to implement custom classes. The latter is a convenience class that allows you to access the properties of NSValidation objects and non-NSValidation objects using the same code.
 * The methods in the NSValidation.DefaultImplementation class are just like the methods defined by the NSValidation interface, except they are static methods and they take an extra argument -- the object on which the default implementation should operate.
 * For example, suppose you want to implement an Employee class that implements NSValidation using NSValidation.DefaultImplementation. Employee's validateValueForKey method would then look like this:
 * The NSValidation.DefaultImplementation methods search for property- specific methods of the form validateKey and invoke them if they exist. Thus an NSValidation class should implement a validate method for each property that has associated validation logic. For example, a validateAge method could check that the value a user enters as an age is within acceptable limits and throw an NSValidation.ValidationException if it finds an unacceptable value.
 * Because custom validation logic is implements in the validateKey methods, you rarely need to implement the NSValidation methods from scratch. Rather, the default implementation provided by NSValidation.DefaultImplementation is generally sufficient.
 * Recall that the NSValidation.Utility class is a convenience class that allows you to access the properties of NSValidation objects and non-NSValidation objects using the same code.
 * Utility's methods are similar to DefaultImplementation's methods in that they are static methods and they take an extra argument -- the object on which the method should operate. However, Utility's methods simply check to see if the object on which they operate is an NSValidation object and invoke the corresponding NSValidation method on the object if it is. Otherwise, they invoke the corresponding DefaultImplementation method, passing the object on which to operate.
 * For example, suppose that you want to access an object with the NSValidation API but doesn't know if the object is an NSValidation object. To do so, you simply use the corresponding Utility API, as in the following line of code:
 * The above line of code is simply a short-cut for the following:
 * To implement validation logic in an NSValidation class, a validateKey method is created for each property needing validation. The default implementations of NSValidation's methods look for these validateKey methods and use them to perform the actual validation.
 * A class's validateKey methods should have the following form:
 * The implementation should confirm that the value passed in is legal and throw an NSValidation.ValidationException if it's not. It should also coerce the argument to the proper type, if necessary. Note that a validateKey method's argument type is Object, and not specifically the class of the corresponding property (String, Integer, or NSTimestamp, for example). Thus, a validateKey method needs to check the type of the argument and convert it to a different type if necessary. The return type of a validateKey method doesn't have to be Object. In fact, it's a good idea to specify the class of the value the method returns, which is generally the class of the corresponding property. The argument type, on the other hand, should generally be Object.
 * The following validateAge method is an example that validates values for a property named age that's stored as an Integer. The method handles arguments of type String and Number. If the argument is an instance of any other class, the method throws a NSValidation.ValidationException.
 * The validateAge method checks the argument's class. If the argument is a String or Number, it creates an Integer from the argument and validates it. If the Integer fails the validation test (if the value is less than 16), the method throws an NSValidation.ValidationException inserting the NSValidation object and the key into the exception's userInfo dictionary by providing them to the constructor. On the other hand, if the Integer passes the validation test, the method returns the Integer.
 * The code that invokes the validation process is expected to use the value returned from the validateKey method instead of the original value it provided. Thus, a validateKey method has an opportunity to coerce a value into a type it prefers. As another example of coercion, a validateKey method can return null. A method might do this, for example, if it is invoked with the empty string as the argument.
 * The argument type of a validateKey method doesn't have to be specifically Object; it can be Object or any subclass. However, generally Object is the most appropriate type for a validateKey method's argument (the one exception is described later in this section). As explained in Writing validateKey Methods, a validateKey method should be able to handle any reasonable argument type. You can type the argument to the common superclass of all reasonable arguments, but this is frequently Object.
 * You should not overload a validateKey method for a particular property, creating different validateKey methods for each argument type. Instead you should create one version of the validateKey method for the property that takes Object as its argument (or at least a superclass of all the possible argument types). The method's implementation should test the argument's type and coerce it appropriately.
 * There's one situation in which the argument type should be more specific than Object. If the property corresponding to the validateKey method is a to-one relationship to an enterprise object, the argument's type should be EOEnterpriseObject.
 * See Also:NSValidation.validateValueForKey(java.lang.Object, java.lang.String), NSValidation.validateTakeValueForKeyPath(java.lang.Object, java.lang.String), NSValidation.DefaultImplementation, NSValidation.Utility, NSKeyValueCoding
 */
public interface NSValidation{
    /**
     * Confirms that value is legal for the object's property named by keyPath and then assigns it to the property.
     * If value is valid, this method then assigns a new value to the property. The new value may be different than value if a custom validation method performed any coercions or substitutions. Finally, this method returns the Object actually assigned to the property. By default, this is value If value is an invalid value for this property, this method throws an NSValidation.ValidationException
     * A keyPath has the form relationship.property (with one or more relationships); for example "movieRole.roleName" or "movieRole.talent.lastName".
     * The default implementation of this method (provided by NSValidation.DefaultImplementation) gets the destination object for each relationship using valueForKey, and sends the final object a validateValueForKey message with value and property.
     */
    abstract java.lang.Object validateTakeValueForKeyPath(java.lang.Object value, java.lang.String keyPath) throws com.webobjects.foundation.NSValidation.ValidationException;

    /**
     * Confirms that value is legal for the object's property named by key.
     * It returns the validated value if it's legal, or throws an NSValidation.ValidationException. Custom implementations may return something other than value, including a coerced value or a substitution.
     * The default implementation of this method (provided by NSValidation.DefaultImplementation) checks for a method of the form validateKey (for example, validateBudget for a key of "budget"). If such a method exists, it invokes it and returns the result. Thus, NSValidation objects can implement individual validateKey methods to check limits, test for nonsense values, and coerce values (convert strings to dates or numbers, for example). If no such method exists, it simply returns value
     */
    abstract java.lang.Object validateValueForKey(java.lang.Object value, java.lang.String key) throws com.webobjects.foundation.NSValidation.ValidationException;

    /**
     * This class is a convenience that allows you to access the properties of NSValidation objects and non-NSValidation objects using the same code.
     * Utility's methods are similar to DefaultImplementation's methods in that they are static methods and they take an extra argument -- the object on which the method should operate. However, Utility's methods simply check to see whether the object on which they operate is an NSValidation object and invoke the corresponding NSValidation method on the object if it is. Otherwise, they invoke the corresponding DefaultImplementation method, passing the object on which to operate.
     * For example, to access an object with the NSValidation API but it is not known if the object is an NSValidation object. To do so, the corresponding Utility API is used , as in the following line of code: blockquote theValue = NSValidation.Utility.validateValueForKey(object,value,key); /blockquote The above line of code is simply a shortcut for the following: blockquote if (object instanceof NSValidation) { theValue =((NSValidation)object).validateValueForKey(key); } else { theValue =validateValueForKey.DefaultImplementation.validateValueForKey( object,value,key); } /blockquote
     */
    public static class Utility{
        /**
         * If object is an NSValidation, invokes validateTakeValueForKeyPath on object; otherwise invokes NSValidation.DefaultImplementation's validateTakeValueForKeyPath method with object as the object on which to operate.
         */
        public static java.lang.Object validateTakeValueForKeyPath(java.lang.Object object, java.lang.Object value, java.lang.String keyPath) throws com.webobjects.foundation.NSValidation.ValidationException{
            return null; //TODO codavaj!!
        }

        /**
         * If object is an NSValidation, invokes validateValueForKey on object; otherwise invokes NSValidation.DefaultImplementation's validateValueForKey method with object as the object on which to operate.
         */
        public static java.lang.Object validateValueForKey(java.lang.Object object, java.lang.Object value, java.lang.String key) throws com.webobjects.foundation.NSValidation.ValidationException{
            return null; //TODO codavaj!!
        }

    }
    /**
     * The methods in the NSValidation.DefaultImplementation class are just like the methods defined by the NSValidation interface, except they are static methods and they take an additional argument, which is the object on which the default implementation should operate.
     * For example, suppose an Employee class implements NSValidation using NSValidation.DefaultImplementation. Employee's validateValueForKey method would then look like this: blockquote public Object validateValueForKey(Object value,String key){ return NSValidation.DefaultImplementation.validateValueForKey(this,value,key)} /blockquote
     * The NSValidation.DefaultImplementation methods search for property-specific methods of the form validateKey and invoke them if they exist. Thus an NSValidation class should implement a validate method for each property that has associated validation logic. For example, a validateAge method could check that the value a user enters as an age is within acceptable limits and throw an NSValidation.ValidationException if it finds an unacceptable value.
     * Because custom validation logic was implemented in the validateKey methods, implementing it from scratch in NSValidation methods is rarely needed. Rather, the default implementation provided by NSValidation.DefaultImplementation is generally sufficient.
     * Note: Always use the default implementation of NSValidation provided by the foundation package. The default implementations have significant performance optimizations. To benefit from them, implement NSValidation on a custom class as shown above by using the methods in NSValidation.DefaultImplementation or, if your class inherits from an WebObjects class that implements NSValidation, don't override the inherited implementation. Using a custom implementation incurs significant performance penalties.
     * See Also:NSValidation.validateValueForKey(java.lang.Object, java.lang.String), NSValidation.validateTakeValueForKeyPath(java.lang.Object, java.lang.String)
     */
    public static class DefaultImplementation{
        /**
         * Confirms that value is legal for an objects's property, which is named by keyPath, and assigns the value to the property if it's legal (and if value is different from the current value).
         */
        public static java.lang.Object validateTakeValueForKeyPath(java.lang.Object object, java.lang.Object value, java.lang.String keyPath) throws com.webobjects.foundation.NSValidation.ValidationException{
            return null; //TODO codavaj!!
        }

        /**
         * Confirms that value is legal for the NSValidation's property, which is named by key, and returns the validated value if it's legal, or throws an NSValidation.ValidationException if it isn't.
         */
        public static java.lang.Object validateValueForKey(java.lang.Object object, java.lang.Object value, java.lang.String key) throws com.webobjects.foundation.NSValidation.ValidationException{
            return null; //TODO codavaj!!
        }

    }
    /**
     * Instances of the NSValidation.ValidationException class are created and thrown when an error condition is encountered during the validation of an object that implements NSValidation.
     * See Also:Serialized Form
     */
    public static class ValidationException extends java.lang.RuntimeException{
        /**
         * Deprecated.
         * The key for an entry in the exception's user info dictionary that contains subexceptions.
         * See Also:Constant Field Values
         */
        public static final java.lang.String AdditionalExceptionsKey="NSAdditionalExceptionsKey";

        /**
         * Deprecated.
         * The key for an entry in the exception's user info dictionary. The entry contains the key for the property that failed to validate.
         * See Also:Constant Field Values
         */
        public static final java.lang.String ValidatedKeyUserInfoKey="NSValidatedKeyUserInfoKey";

        /**
         * Deprecated.
         * A key for an entry in the exception's user info dictionary. The entry contains the object that failed to validate.
         * See Also:Constant Field Values
         */
        public static final java.lang.String ValidatedObjectUserInfoKey="NSValidatedObjectUserInfoKey";

        /**
         * Creates and returns a new exception with message as the message.
         * Parameters:message - message giving the datails of the exception
         */
        public ValidationException(java.lang.String message){
             //TODO codavaj!!
        }

        /**
         * Deprecated.
         * Parameters:message - exception messageuserInfo - information array giving the related object and the keySee Also:NSValidation.ValidationException.NSValidation.ValidationException(String, Object, String)
         */
        public ValidationException(java.lang.String message, com.webobjects.foundation.NSDictionary userInfo){
             //TODO codavaj!!
        }

        /**
         * Creates and returns a new exception with message as the message and a userInfo dictionary specifying object for the ValidatedObjectUserInfoKey and key for the ValidatedKeyUserInfoKey.
         * Parameters:message - exception messageobject - object on the destination showed by the keypathkey - property of the NSValidation implementorSee Also:NSValidation.ValidationException.object(), NSValidation.ValidationException.key()
         */
        public ValidationException(java.lang.String message, java.lang.Object object, java.lang.String key){
             //TODO codavaj!!
        }

        /**
         * Returns the array in this NSValidation's userInfo dictionary for the AdditionalExceptionsKey.
         */
        public com.webobjects.foundation.NSArray additionalExceptions(){
            return null; //TODO codavaj!!
        }

        /**
         * Returns an exception that is the aggregate of the exceptions in the aggregateExceptions array. The returned aggregate exception has the message and userInfo dictionary of the first exception in the aggregateExceptions array, but the userInfo dictionary is augmented with the list of subexceptions under the key AdditionalExceptionsKey.
         */
        public static com.webobjects.foundation.NSValidation.ValidationException aggregateExceptionWithExceptions(com.webobjects.foundation.NSArray aggregateExceptions){
            return null; //TODO codavaj!!
        }

        /**
         * Deprecated.
         * Returns a new exception that is a copy of this ValidationException's message and userInfo, but whose userInfo dictionary has been augmented with object and key.
         */
        public com.webobjects.foundation.NSValidation.ValidationException exceptionAddingEntriesToUserInfo(java.lang.Object object, java.lang.String key){
            return null; //TODO codavaj!!
        }

        /**
         * Returns a new exception with the same message as this ValidationException, but whose userInfo dictionary contains object and key. When validation exceptions are raised by certain validation methods such as validateValueForKey, this method is invoked on the exception to create a duplicate exception with object and property information stored to the new exception's userInfo dictionary. The information is stored under the keys ValidatedObjectUserInfoKey, ValidatedKeyUserInfoKey, respectively. The exception this method returns has the same message as the original, receiving exception; the only difference is the userInfo dictionary.
         */
        public com.webobjects.foundation.NSValidation.ValidationException exceptionWithObjectAndKey(java.lang.Object object, java.lang.String key){
            return null; //TODO codavaj!!
        }

        public java.lang.String key(){
            return null; //TODO codavaj!!
        }

        public java.lang.Object object(){
            return null; //TODO codavaj!!
        }

        /**
         * Deprecated.
         */
        public com.webobjects.foundation.NSDictionary userInfo(){
            return null; //TODO codavaj!!
        }

    }
}
