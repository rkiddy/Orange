package com.webobjects.foundation;
/**
 * The NSKeyValueCodingAdditions interface defines an extension to the basic NSKeyValueCoding interface. The pair of methods in NSKeyValueCodingAdditions -- takeValueForKeyPath and valueForKeyPath -- give access to properties across relationships with key paths of the form relationship.property; for example, "department.name".
 * The NSKeyValueCodingAdditions interface contains two inner classes, NSKeyValueCodingAdditions.DefaultImplementation and NSKeyValueCodingAdditions.Utility. The former provides a default implementation of the interface, making it easy to implement custom classes. The latter is a convenience class that allows you to access the properties of NSKeyValueCodingAdditions objects and objects using the same code.
 * The methods in the NSKeyValueCodingAdditions.DefaultImplementation class are just like the methods defined by the NSKeyValueCodingAdditions interface, except they are static methods and they take an extra argument -- the object on which the default implementation should operate.
 * For example, suppose it is wanted to implement an Employee class that implements NSKeyValueCodingAdditions using NSKeyValueCodingAdditions.DefaultImplementation. Employee's valueForKeyPath method would then look like this:
 * Recall that the NSKeyValueCodingAdditions.Utility class is a convenience that allows to access the properties of NSKeyValueCodingAdditions objects and non-NSKeyValueCodingAdditions objects using the same code.
 * Utility's methods are similar to DefaultImplementation's methods in that they are static methods and they take an extra argument -- the object on which the method should operate. However, Utility's methods simply check to see if the object on which they operate is an NSKeyValueCodingAdditions object and invoke the corresponding NSKeyValueCodingAdditions method on the object if it is. Otherwise, they invoke the corresponding DefaultImplementation method, passing the object on which to operate.
 * For example, suppose that you want to access an object with the NSKeyValueCodingAdditions API but you do not know if the object is an NSKeyValueCodingAdditions object. To do so, you simply use the corresponding Utility API, as in the following line of code:
 * The above line of code is essentially a short-cut for the following:
 * See Also:NSKeyValueCodingAdditions.takeValueForKeyPath(java.lang.Object, java.lang.String), NSKeyValueCodingAdditions.valueForKeyPath(java.lang.String), NSKeyValueCoding, NSKeyValueCodingAdditions.DefaultImplementation, NSKeyValueCodingAdditions.Utility
 */
public interface NSKeyValueCodingAdditions extends com.webobjects.foundation.NSKeyValueCoding{
    /**
     * The string used to separate components of a key path, "."
     * See Also:Constant Field Values
     */
    static final java.lang.String KeyPathSeparator=".";

    /**
     * Sets the value for the property identified by keyPath to value. A key path has the form relationship.property (with one or more relationships); for example "movieRole.roleName" or "movieRole.talent.lastName". The default implementation of this method (provided by NSKeyValueCodingAdditions.DefaultImplementation) gets the destination object for each relationship using valueForKey, and sends the final object a takeValueForKey message with value and property.
     */
    abstract void takeValueForKeyPath(java.lang.Object value, java.lang.String keyPath);

    /**
     * Retrieves the value of a property of the object at the end of the key path (a key path is a string of the form "key1.key2"). A key path has the form relationship.property (with one or more relationships); for example "movieRole.roleName" or "movieRole.talent.lastName". The default implementation of this method (provided by NSKeyValueCodingAdditions.DefaultImplementation) gets the destination object for each relationship using valueForKey, and returns the result of a valueForKey message to the final object.
     */
    abstract java.lang.Object valueForKeyPath(java.lang.String keyPath);

    /**
     * The NSKeyValueCodingAdditions.DefaultImplementation class provides default implementations of the NSKeyValueCodingAdditions interface.
     * See Also:NSKeyValueCodingAdditions, NSKeyValueCodingAdditions.Utility
     */
    public static class DefaultImplementation{
        /**
         * Sets object's property identified by keyPath to value. A key path has the form relationship.property (with one or more relationships). This method gets the destination object for each relationship using valueForKey, and sends the final object a takeValueForKey message with value and property.
         */
        public static void takeValueForKeyPath(java.lang.Object object, java.lang.Object value, java.lang.String keyPath){
            return; //TODO codavaj!!
        }

        /**
         * A key path has the form relationship.property (with one or more relationships). This method gets the destination object for each relationship using valueForKey, and returns the result of a valueForKey message to the final object.
         */
        public static java.lang.Object valueForKeyPath(java.lang.Object object, java.lang.String keyPath){
            return null; //TODO codavaj!!
        }

    }
    /**
     * The NSKeyValueCodingAdditions.Utility class is a convenience that allows one to access the properties of NSKeyValueCodingAdditions objects and non-NSKeyValueCodingAdditions objects using the same code.
     * See Also:NSKeyValueCodingAdditions, NSKeyValueCodingAdditions.DefaultImplementation
     */
    public static class Utility{
        /**
         * If object is an NSKeyValueCodingAdditions, invokes takeValueForKeyPath on object; otherwise invokes NSKeyValueCodingAdditions.DefaultImplementation's takeValueForKeyPath method with object as the object on which to operate.
         */
        public static void takeValueForKeyPath(java.lang.Object object, java.lang.Object value, java.lang.String keyPath){
            return; //TODO codavaj!!
        }

        /**
         * If object is an NSKeyValueCodingAdditions, invokes valueForKeyPath on object; otherwise invokes NSKeyValueCodingAdditions.DefaultImplementation's valueForKeyPath method with object as the object on which to operate.
         */
        public static java.lang.Object valueForKeyPath(java.lang.Object object, java.lang.String keyPath){
            return null; //TODO codavaj!!
        }

    }
}
