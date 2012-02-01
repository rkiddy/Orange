package com.webobjects.eoaccess;
/**
 * This class is a collection of convenience methods intended to make common operations with EOF easier. It consists entirely of static methods: you never instantiate an EOUtilities object.
 * Most methods require an EOEditingContext into which the objects should be fetched. This editing context is passed as the first argument to those methods.
 */
public class EOUtilities{
    /**
     * Connects to the database using the connection information in the specified model augmented by the overrides dictionary. This method facilitates per-session database logins in WebObjects applications. Typically, you will put a login name and password in the overrides dictionary and otherwise use the values in the model's connection dictionary.
     */
    public static void connectWithModelNamed(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, com.webobjects.foundation.NSDictionary overrides){
        return; //TODO codavaj!!
    }

    /**
     * Creates a new Enterprise Object for the specified entity, inserts it into ec, and returns the new object.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject createAndInsertInstance(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the database context used to service the specified model.
     */
    public static com.webobjects.eoaccess.EODatabaseContext databaseContextForModelNamed(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the foreign key for the rows at the destination of the specified relationship. As an example, given entities Department and Employee with a relationship called department joining Department.ID and Employee.deptID, invoking this method on a Department object with ID equal to 5 returns a dictionary with a value of 5 for the deptID key.
     */
    public static com.webobjects.foundation.NSDictionary destinationKeyForSourceObject(com.webobjects.eocontrol.EOEditingContext ec, com.webobjects.eocontrol.EOEnterpriseObject object, java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the entity associated with the specified class. Throws an exception if the specified entity can't be found or if more than one entity is associated with the class.
     */
    public static com.webobjects.eoaccess.EOEntity entityForClass(com.webobjects.eocontrol.EOEditingContext ec, java.lang.Class theClass){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the entity associated with the provided Enterprise Object. Throws an exception if the specified entity can't be found.
     */
    public static com.webobjects.eoaccess.EOEntity entityForObject(com.webobjects.eocontrol.EOEditingContext ec, com.webobjects.eocontrol.EOEnterpriseObject obj){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the entity with the specified name.
     */
    public static com.webobjects.eoaccess.EOEntity entityNamed(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Executes the specified stored procedure with the provided arguments. Returns the stored procedure's return values (if any). Use only with stored procedures that don't return results rows.
     */
    public static com.webobjects.foundation.NSDictionary executeStoredProcedureNamed(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, com.webobjects.foundation.NSDictionary args){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the Enterprise Object identified by the specified primary key dictionary. The result may be a fault. It is not an error for the fault to refer to a nonexistent row but such a fault may eventually cause an exception to be raised if it is ever fired.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject faultWithPrimaryKey(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String entityName, com.webobjects.foundation.NSDictionary pkDict){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches the Enterprise Object identified by the specified primary key value. For use only with Enterprise Objects that have non-compound primary keys. The result may be a fault. It is not an error for the fault to refer to a nonexistent row but such a fault may eventually cause an exception to be raised if it is ever fired.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject faultWithPrimaryKeyValue(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String entityName, java.lang.Object value){
        return null; //TODO codavaj!!
    }

    /**
     * Translates the specified Enterprise Object from another editing context to the specified one.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject localInstanceOfObject(com.webobjects.eocontrol.EOEditingContext ec, com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    /**
     * Translates the specified Enterprise Objects from another editing context to the specified one.
     */
    public static com.webobjects.foundation.NSArray localInstancesOfObjects(com.webobjects.eocontrol.EOEditingContext ec, com.webobjects.foundation.NSArray objects){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the model group associated with the editing context's root object store, an EOObjectStoreCoordinator.
     */
    public static com.webobjects.eoaccess.EOModelGroup modelGroup(com.webobjects.eocontrol.EOEditingContext ec){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches the object corresponding to the specified raw row (using faultForRawRow). This method can only be used on raw rows that include the row's primary key.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject objectFromRawRow(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, com.webobjects.foundation.NSDictionary row){
        return null; //TODO codavaj!!
    }

    /**
     * Creates an EOKeyValueQualifier with the specified key and value and returns the matching Enterprise Object. Throws an exception unless exactly one object is retrieved.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject objectMatchingKeyAndValue(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, java.lang.String key, java.lang.Object value){
        return null; //TODO codavaj!!
    }

    /**
     * Creates EOKeyValueQualifiers for each key-value pair in the specified dictionary, ANDs these qualifiers together into an EOAndQualifier, and returns the matching Enterprise Object. Throws an exception unless exactly one object is retrieved.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject objectMatchingValues(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, com.webobjects.foundation.NSDictionary values){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches the Enterprise Objects associated with the specified entity.
     */
    public static com.webobjects.foundation.NSArray objectsForEntityNamed(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Creates an EOKeyValueQualifier with the specified key and value and returns matching Enterprise Objects.
     */
    public static com.webobjects.foundation.NSArray objectsMatchingKeyAndValue(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String entityName, java.lang.String key, java.lang.Object value){
        return null; //TODO codavaj!!
    }

    /**
     * Creates EOKeyValueQualifiers for each key-value pair in the specified dictionary, ANDs these qualifiers together into an EOAndQualifier, and returns matching Enterprise Objects.
     */
    public static com.webobjects.foundation.NSArray objectsMatchingValues(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, com.webobjects.foundation.NSDictionary values){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches the Enterprise Objects associated with the specified class. Throws an exception if more than one entity for the class exists.
     */
    public static com.webobjects.foundation.NSArray objectsOfClass(com.webobjects.eocontrol.EOEditingContext ec, java.lang.Class aClass){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches the Enterprise Objects retrieved with the specified fetch specification and bindings.
     */
    public static com.webobjects.foundation.NSArray objectsWithFetchSpecificationAndBindings(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String entityName, java.lang.String fetchSpecName, com.webobjects.foundation.NSDictionary bindings){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a qualifier with the provided format string and ordered arguments, and returns matching Enterprise Objects.
     */
    public static com.webobjects.foundation.NSArray objectsWithQualifierFormat(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String entityName, java.lang.String format, com.webobjects.foundation.NSArray args){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches the Enterprise Object retrieved with the specified fetch specification and bindings. Throws an exception unless exactly one object is retrieved.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject objectWithFetchSpecificationAndBindings(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String entityName, java.lang.String fetchSpecName, com.webobjects.foundation.NSDictionary bindings){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches the Enterprise Object identified by the specified primary key dictionary. Throws an exception unless exactly one object is retrieved.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject objectWithPrimaryKey(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String entityName, com.webobjects.foundation.NSDictionary pkDict){
        return null; //TODO codavaj!!
    }

    /**
     * Fetches the Enterprise Object identified by the specified primary key value. For use only with enterprise objects that have non-compound primary keys. Throws an exception unless exactly one object is retrieved.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject objectWithPrimaryKeyValue(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String entityName, java.lang.Object value){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a qualifier with the provided format string and arguments, and returns the matching Enterprise Object. Throws an exception unless exactly one object is retrieved.
     */
    public static com.webobjects.eocontrol.EOEnterpriseObject objectWithQualifierFormat(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, java.lang.String format, com.webobjects.foundation.NSArray args){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the primary key dictionary for the specified Enterprise Object.
     */
    public static com.webobjects.foundation.NSDictionary primaryKeyForObject(com.webobjects.eocontrol.EOEditingContext ec, com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an EOQualifier for the specified Enterprise Object.
     */
    public static com.webobjects.eocontrol.EOQualifier qualifierForEnterpriseObject(com.webobjects.eocontrol.EOEditingContext ec, com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static com.webobjects.foundation.NSArray rawRowsForSQL(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String modelName, java.lang.String sqlString){
        return null; //TODO codavaj!!
    }

    /**
     * Evaluates the specified SQL and returns the resulting raw rows.
     */
    public static com.webobjects.foundation.NSArray rawRowsForSQL(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String modelName, java.lang.String sqlString, com.webobjects.foundation.NSArray keys){
        return null; //TODO codavaj!!
    }

    /**
     * Executes the specified stored procedure with the provided arguments and returns the resulting raw rows.
     */
    public static com.webobjects.foundation.NSArray rawRowsForStoredProcedureNamed(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, com.webobjects.foundation.NSDictionary args){
        return null; //TODO codavaj!!
    }

    /**
     * Creates an EOKeyValueQualifier with the specified key and value and returns matching raw rows.
     */
    public static com.webobjects.foundation.NSArray rawRowsMatchingKeyAndValue(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, java.lang.String key, java.lang.Object value){
        return null; //TODO codavaj!!
    }

    /**
     * Creates EOKeyValueQualifiers for each key-value pair in the specified dictionary, ANDs these qualifiers together into an EOAndQualifier, and returns matching raw rows.
     */
    public static com.webobjects.foundation.NSArray rawRowsMatchingValues(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, com.webobjects.foundation.NSDictionary values){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a qualifier for the specified entity and with the specified qualifier format and returns matching raw row dictionaries.
     */
    public static com.webobjects.foundation.NSArray rawRowsWithQualifierFormat(com.webobjects.eocontrol.EOEditingContext ec, java.lang.String name, java.lang.String format, com.webobjects.foundation.NSArray args){
        return null; //TODO codavaj!!
    }

    /**
     * This exception is thrown from the methods in EOUtilities, indicating that multiple objects were found in a search that expected exactly one object as result.
     * See Also:Serialized Form
     */
    public static class MoreThanOneException extends java.lang.RuntimeException{
        /**
         * Creates a new exception with a specified message.
         * Parameters:message - specifies message
         */
        public MoreThanOneException(java.lang.String message){
             //TODO codavaj!!
        }

    }
}
