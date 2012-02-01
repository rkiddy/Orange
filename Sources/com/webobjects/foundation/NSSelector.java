package com.webobjects.foundation;
/**
 * An NSSelector object specifies a method signature (a method's name and parameter list). You can apply a selector on any object, and it performs the method that matches it, if there is one.
 * NSSelector is very similar to Method. However, java.lang.reflect.Method objects specify a particular class's implementation of a method, and you can only apply them to objects of that class (or subclass). NSSelectors can be used on any object, regardless of class, which has a method name and signature that matches the selector. To find the java.lang.reflect.Method object that matches an NSSelector for a particular object or class, use methodOnObject or methodOnClass
 * To create a selector, you can use a single-argument constructor or a two-argument constructor. The two-argument constructor takes the method's name and an array of the parameter types. Note that to obtain a Class object for a type, .class is to be appended to the type's name. For example, the Class object for Object is Object.class.
 * Class properties: method: method name parameters: parameter types
 * NSSelector sel = new NSSelector("doIt",new Class [] {String.class,Integer.class});
 * This code sample gives two ways to apply the selector sel (defined above) to an object:
 * See Also:Method, NSSelector.invoke(Object, Object[]), NSSelector._name, NSSelector.parameterTypes(), NSSelector.implementedByObject(java.lang.Object), NSSelector.implementedByClass(java.lang.Class), NSSelector.methodOnObject(java.lang.Object), NSSelector.methodOnClass(java.lang.Class), Serialized Form
 */
public class NSSelector implements java.io.Serializable{
    /**
     * Creates a selector for a method that takes no parameters.
     * Parameters:name - name of the method this NSSelector specifies
     */
    public NSSelector(java.lang.String name){
         //TODO codavaj!!
    }

    /**
     * Creates a new selector for a method that takes arguments.
     * The parameterTypes array can be created easily: Class parameters[] = new Class[] {String.class, Integer.class, Boolean.class}
     * Parameters:name - name of the method this NSSelector specifiesparameterTypes - parameter-type list for the method specified by name; null if the method takes no parameters
     */
    public NSSelector(java.lang.String name, java.lang.Class[] parameterTypes){
         //TODO codavaj!!
    }

    /**
     * Determines whether an object is an NSSelector equal to this NSSelector. Two selectors are equal if their names and parameter types are equal.
     */
    public boolean equals(java.lang.Object otherSelector){
        return false; //TODO codavaj!!
    }

    public int hashCode(){
        return 0; //TODO codavaj!!
    }

    /**
     * Indicates whether a class implements the method that this NSSelector specifies.
     */
    public boolean implementedByClass(java.lang.Class targetClass){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether the target object implements the method that this NSSelector specifies.
     */
    public boolean implementedByObject(java.lang.Object target){
        return false; //TODO codavaj!!
    }

    /**
     * A convenience method similar to invoke(Object, Object[]), but with no arguments.
     */
    public java.lang.Object invoke(java.lang.Object target) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException{
        return null; //TODO codavaj!!
    }

    /**
     * A convenience method similar to invoke(Object, Object[]), but using one argument.
     */
    public java.lang.Object invoke(java.lang.Object target, java.lang.Object argument) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException{
        return null; //TODO codavaj!!
    }

    java.lang.Object invoke(java.lang.Object target, java.lang.Object[] parameters){
        return null; //TODO codavaj!!
    }

    /**
     * A convenience method similar to invoke(Object, Object[]), but using two arguments.
     */
    public java.lang.Object invoke(java.lang.Object target, java.lang.Object argument1, java.lang.Object argument2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException{
        return null; //TODO codavaj!!
    }

    /**
     * A convenience method that creates an NSSelector for a method that one argument, and immediately applies it to the target object.
     */
    public static java.lang.Object invoke(java.lang.String name, java.lang.Class[] parameterTypes, java.lang.Object target, java.lang.Object[] parameters) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException{
        return null; //TODO codavaj!!
    }

    /**
     * A convenience method that creates an NSSelector for a method that two arguments, and immediately applies it to the target object.
     */
    public static java.lang.Object invoke(java.lang.String name, java.lang.Class parameterType1, java.lang.Class parameterType2, java.lang.Object target, java.lang.Object argument1, java.lang.Object argument2) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException{
        return null; //TODO codavaj!!
    }

    java.lang.Object invoke(java.lang.String name, java.lang.Class parameterType, java.lang.Object target, java.lang.Object argument){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the java.lang.reflect.Method that corresponds to this NSSelector on the targetClass.
     */
    public java.lang.reflect.Method methodOnClass(java.lang.Class targetClass) throws java.lang.NoSuchMethodException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns the java.lang.reflect.Method that corresponds to this NSSelector on the target object.
     */
    public java.lang.reflect.Method methodOnObject(java.lang.Object target) throws java.lang.NoSuchMethodException{
        return null; //TODO codavaj!!
    }

    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a copy of the array of parameter types specified by this NSSelector.
     */
    public java.lang.Class[] parameterTypes(){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
