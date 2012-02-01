package com.webobjects.directtoweb;
/**
 * The Assignment class performs assignments on the right-hand side of rules. Every rule in the rule database has an instance of this class that holds the right-hand side key and the right-hand side value. The rule engine uses this class; you should never need to use it.
 * If you need custom assignment behavior you can subclass Assignment. To do so, you need to provide the two constructors: MyAssignmentSubclass (String keyPath, Object value) MyAssignmentSubclass (EOKeyValueUnarchiver unarchiver)
 * You can invoke super for each constructor.
 * You also need to implement these two methods: public void encodeWithKeyValueArchiver(EOKeyValueArchiver archiver) { super.encodeWithKeyValueArchiver(archiver); } public static Object decodeWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return new MyAssignmentSubclass(archiver); }
 * You can then override the fire method to provide the value. For example, if you define a method myMethod that returns the right-hand-side value myValue for a key, the fire method could look like: public Object fire(D2WContext context) { if (value().equals("myValue")) return myMethod(context); }
 * See Also:Serialized Form
 */
public class Assignment implements com.webobjects.eocontrol.EOKeyValueArchiving, java.io.Serializable{
    /**
     * This constant is intentionally undocumented.
     * See Also:Constant Field Values
     */
    public static final java.lang.String KeyPathKey="keyPath";

    /**
     * This constant is intentionally undocumented.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ValueKey="value";

    /**
     * Constructs a new Assignment based on an EOKeyValueUnarchiver. This is used to read the assignment information from a rule file.
     * Parameters:unarchiver - - the unarchiver.
     */
    public Assignment(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Constructs a new Assignment with the specified key path and value.
     * Parameters:keyPath - - the key path.value - - the value.
     */
    public Assignment(java.lang.String keyPath, java.lang.Object value){
         //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public static java.lang.Object decodeWithKeyValueUnarchiver(com.webobjects.eocontrol.EOKeyValueUnarchiver unarchiver){
        return null; //TODO codavaj!!
    }

    /**
     * This method is intentionally undocumented. You should never have to invoke or customize it.
     */
    public void encodeWithKeyValueArchiver(com.webobjects.eocontrol.EOKeyValueArchiver archiver){
        return; //TODO codavaj!!
    }

    /**
     * This method is invoked when a rule fires. It returns the right-hand side value (an Object) for a right-hand side key in the Direct to Web context. You can override this method to provide your own assignments.
     */
    public java.lang.Object fire(com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the receiver's right-hand-side key.
     */
    public java.lang.String keyPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of this Assignment object rendered as the key path, equals sign, and the value.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the receiver's right-hand-side value.
     */
    public java.lang.Object value(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Gets the receiver's right-hand-side value.
     */
    public java.lang.Object value(com.webobjects.directtoweb.D2WContext context){
        return null; //TODO codavaj!!
    }

}
