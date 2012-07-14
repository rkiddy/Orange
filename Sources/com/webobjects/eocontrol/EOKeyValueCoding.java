package com.webobjects.eocontrol;
/**
 * <p>
 * The EOKeyValueCoding interface defines an extension to the basic <code>NSKeyValueCoding</code> and <code>NSKeyValueCoding.ErrorHandling</code>
 * interfaces. The pair of methods in EOKeyValueCoding - takeStoredValueForKey and storedValueForKey - are an API for use by the Enterprise Object 
 * Framework for transporting data to and from trusted sources.
 * </p><p>
 * For example, <code>takeStoredValueForKey</code> is used to initialize an object's properties with values fetched from the database, whereas
 * NSKeyValueCoding's <code>takeValueForKey</code> is used to modify an object's properties to values provided by a user (from a graphical user 
 * interface) or other business logic.
 * </p><p>
 * The EOKeyValueCoding interface contains two inner classes, EOKeyValueCoding.DefaultImplementation and EOKeyValueCoding.Utility. The former 
 * provides a default implementation of the interface, making it easy to implement on your own custom classes. The latter is a convenience 
 * class that allows you to access the properties of EOKeyValueCoding objects and non-EOKeyValueCoding objects using the same code.
 * <h3>Default Implementation</h3>
 * The methods in the EOKeyValueCoding.DefaultImplementation class are just like the methods defined by the EOKeyValueCoding interface, except 
 * they are static methods and they take an extra argument - the object on which the default implementation should operate.
 * </p><p>
 * For example, suppose it is wanted to implement an Employee class that implements EOKeyValueCoding using EOKeyValueCoding.DefaultImplementation. 
 * Employee's storedValueForKey method would then look like this:
 * <blockquote><pre>
   public Object storedValueForKey(String key) {
        return EOKeyValueCoding.DefaultImplementation.storedValueForKey(this, key);
   } 
   </pre></blockquote>
 * </p><p>
 * <strong>Note:</strong> Always try to use the default implementation of EOKeyValueCoding. The default implementations have significant 
 * performance optimizations. To benefit from them, EOKeyValueCoding can be implemented on a custom class as shown above by using the methods 
 * in EOKeyValueCoding.DefaultImplementation; or if your class inherits from an EOF class that implements EOKeyValueCoding, don't override the 
 * inherited implementation. Using a custom implementation incurs significant performance penalties.
 * <h3>Utility</h3>
 * Recall that the EOKeyValueCoding.Utility class is a convenience that allows to access the properties of EOKeyValueCoding objects and 
 * non-EOKeyValueCoding objects using the same code.
 * </p><p>
 * Utility's methods are similar to DefaultImplementation's methods in that they are static methods and they take an extra argument - the object on 
 * which the method should operate. However, Utility's methods simply check to see if the object on which they operate is an EOKeyValueCoding object 
 * and invoke the corresponding EOKeyValueCoding method on the object if it is. Otherwise, they invoke the corresponding DefaultImplementation 
 * method, passing the object on which to operate.
 * </p><p>
 * For example, suppose that you want to access an object with the EOKeyValueCoding API but you don't know if the object is an EOKeyValueCoding object.
 * To do so, you simply use the corresponding Utility API, as in the following line of code:
 * <blockquote><pre>
   value = EOKeyValueCoding.Utility.storedValueForKey(key);
   </pre></blockquote>
 * </p><p>
 * The above line of code is essentially a short-cut for the following:
 * </blockquote><pre>
   if (object instanceof EOKeyValueCoding) {
        value = ((EOKeyValueCoding) object).storedValueForKey(key);
   } else {
        value = EOKeyValueCoding.DefaultImplementation.storedValueForKey(key);
   }
   </pre></blockquote>
 * </p><p>
 * <h3>Preventing Special Stored Accessors</h3>
 * If you always want the method of EOKeyValueCoding to work exactly like the corresponding methods on NSKeyValueCoding, implement the static method
 * <blockquote><pre>
   public static boolean canAccessFieldsDirectly()
   </pre></blockquote>
 * on your EOKeyValueCoding class to return <code>false</code>.
 * An EOKeyValueCoding class doesn't have to implement this method. It's an optional method that allows a class to tailor key-value coding behavior. 
 * By default, the key-value implementation provided by EOKeyValueCoding.DefaultImplementation does use private accessors. An EOKeyValueCoding class 
 * can override this behavior by implementing this method to return false, in which case the key-value coding methods don't use private accessors.
 * </p><p>
 * This method isn't strictly part of this interface because static methods can't be formally declared in an interface. However, this method is so 
 * closely related to the interface as to be considered part of it.
 * </p>
 */
public interface EOKeyValueCoding extends com.webobjects.foundation.NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling{
    /**
     * Returns the property identified by <code>key</code>. This method is used when the value is retrieved for storage in an object store 
     * (generally, this is ultimately in a database) or for inclusion in a snapshot. The default implementation provided by 
     * EOKeyValueCoding.DefaultImplementation is similar to the implementation of NSKeyValueCoding.DefaultImplementation's <code>valueForKey</code>, 
     * but it resolves key with a different method and field search order:
     * <ol>
     * <li>Searches for a private accessor method based on key (a method preceded by an underbar). For example, with a key of "value", 
     * <code>storedValueForKey</code> looks for a method named <code>_getValue</code>, <code>_isValue</code> or <code>_value</code>.</li>
     * <li>If a private accessor method isn't found, searches for a field based on key and returns its value directly. For example, with a key of "value",
     * <code>storedValueForKey</code> looks for a field named <code>_value</code>, <code>_isValue</code>, <code>value</code>, or <code>isValue</code>.</li>
     * <li>If neither a private accessor method or a field is found, <code>storedValueForKey</code> searches for a public accessor method based on
     * <key>. For the key "value", this would be <code>getValue</code>, <code>isValue</code>, or <code>value</code>. </li>
     * <li>If key is unknown, <code>storedValueForKey</code> calls <code>handleQueryWithUnboundKey</code>, defined in NSKeyValueCoding.ErrorHandling.</li>
     * </ol>
     * This different search order allows an object to bypass processing that is performed before returning a value through public API. However, 
     * if you always want to use the search order in <code>valueForKey</code>, you can implement the static method <code>shouldUseStoredAccessors</code>
     * to return <code>false</code>. And as with <code>valueForKey</code>, you can prevent direct access of a field with the static method 
     * <code>canAccessFieldsDirectly</code>.
     */
    abstract java.lang.Object storedValueForKey(java.lang.String key);

    /**
     * Sets the property identified by <code>key</code> to <code>value</code>. This method is used to initialize the receiver with values from an object store (generally, this is ultimately from a database) or to restore a value from a snapshot. The default implementation provided by EOKeyValueCoding.DefaultImplementation is similar to the implementation of NSKeyValueCoding.DefaultImplementation's <code>takeValueForKey</code>, but it resolves key with a different method and field search order:
     * <ol>
     * <li>Searches for a private accessor method based on key (a method preceded by an underbar). For example, with a key of "value", <code>takeStoredValueForKey</code> looks for a method named <code>_setValue</code>.</li>
     * <li>If a private accessor method isn't found, searches for a field based on key and sets its value directly. For example, with a key of "value", <code>takeStoredValueForKey</code> looks for a field named <code>_value</code>, <code>_isValue</code>, <code>value</code>, or <code>isValue</code>.</li>
     * <li>If neither a private accessor method or a field is found, <code>takeStoredValueForKey</code> searches for a public accessor method based on <code>key</code>. For the key "value", this would be <code>setValue</code>.</li>
     * <li> If <code>key</code> is unknown, <code>takeStoredValueForKey</code> calls <code>handleTakeValueForUnboundKey</code>.</li>
     * </ol>
     * This different search order allows an object to bypass processing that is performed before setting a value through public API. However, if you always want to use the search order in <code>takeValueForKey</code>, you can implement the static method <code>shouldUseStoredAccessors</code> to return <code>false</code>. And as with <code>takeValueForKey</code>, you can prevent direct access of a field with the static method <code>canAccessFieldsDirectly</code>.
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
