package com.webobjects.eoaccess;
/**
 * An EOAdaptor represents a single connection to a database server. It is responsible for keeping login and model information, performing server-specific formatting of SQL expressions, and reporting errors.
 * An EOAdaptor can manage several EOAdaptorContexts, each of which represents a transaction scope on the database server. An EOAdaptorContext can, in turn, manage several EOAdaptorChannels, each of which handles actual access to the data on the server. An EOAdaptor by default has no EOAdaptorContexts. To create a new EOAdaptorContext, use the EOAdaptor method createAdaptorContext.
 * The EOAdaptor class has the following principal attributes:
 * Other framework classes create EOAdaptor objects. The method adaptorWithModel creates a new adaptor with the adaptor name in the specified model. The method adaptorWithName creates a new adaptor with the specified name.
 * An EOAdaptor uses a connection dictionary to connect to the database server. The keys of this dictionary identify the information the server expects, and the values of those keys are the values that the adaptor will try when connecting.
 * A connection to the database server isn't actually formed until an adaptor channel is opened. When the adaptor is asked to validate its connection dictionary, it only confirms with the server that it will accept the values in the dictionary when a connection is requested.
 * The following table lists the most commonly-used methods in the EOAdaptor class:
 * Method Description assertConnectionDictionaryIsValid Verifies that the adaptor can connect with its connection information. setConnectionDictionary Sets the connection dictionary.
 * Enterprise Objects Framework provides a concrete JDBC adaptor for communication with JDBC-compliant relational databases and a concrete JNDI adaptor for communication with LDAP data sources. You may want to create your own concrete EOAdaptor subclass for a different database or persistent storage system. EOAdaptor provides many default method implementations that are sufficient for concrete subclasses:
 * The following methods establish structure and conventions that other Enterprise Objects Framework classes depend on and should be overridden with caution:
 * If you override setConnectionDictionary or setDelegate, your implementations should incorporate the superclass's implementation by calling super.
 * The remaining EOAdaptor methods must be overridden by every concrete adaptor subclass in terms of the persistent storage system with which it interacts:
 * See Also:EOAdaptor.adaptorWithName(String name), EOAdaptor.adaptorWithModel(EOModel model), EOAdaptor.assignExternalInfoForEntireModel(EOModel model), EOAdaptor.connectionDictionary(), EOAdaptor.contexts(), EOAdaptor.delegate(), EOAdaptor.hasOpenChannels(), EOAdaptor.name(), EOAdaptor.setExpressionClassName( String sqlExpressionClassName, String adaptorClassName), EOAdaptor.setConnectionDictionary(NSDictionary dictionary), EOAdaptor.setDelegate(Object delegate), EOAdaptor.assignExternalInfoForAttribute(EOAttribute attribute), EOAdaptor.assignExternalInfoForEntity(EOEntity entity), EOAdaptor.externalTypesWithModel(EOModel model), EOAdaptor.internalTypeForExternalType(String extType, EOModel model), EOAdaptor.assertConnectionDictionaryIsValid(), EOAdaptor.createAdaptorContext(), EOAdaptor.fetchedValueForDataValue(NSData value, EOAttribute attribute), EOAdaptor.fetchedValueForDateValue( NSTimestamp value, EOAttribute attribute), EOAdaptor.fetchedValueForNumberValue(Number value, EOAttribute attribute), EOAdaptor.fetchedValueForStringValue(String value, EOAttribute attribute), EOAdaptor.fetchedValueForValue(Object value, EOAttribute attribute), EOAdaptor.isValidQualifierType(String typeName, EOModel model)
 */
public abstract class EOAdaptor{
    /**
     * Creates and returns a new EOAdaptor with the specified name. When you create an adaptor subclass, override this method.
     * Never use this constructor directly. It is invoked automatically from adaptorWithName and adaptorWithModel, the EOAdaptor static methods used to create new adaptor instances.
     * Parameters:name - The name of adaptor to create.See Also:EOAdaptor.adaptorWithName(String name), EOAdaptor.adaptorWithModel(EOModel model)
     */
    public EOAdaptor(java.lang.String name){
         //TODO codavaj!!
    }

    /**
     * Creates and returns a new adaptor by extracting the adaptor name from model, invoking adaptorWithName, and assigning model's connection dictionary to the new adaptor. Throws an exception if model is null, if model's adaptor name is null or an empty string, or if the adaptor named in model can't be loaded.
     */
    public static com.webobjects.eoaccess.EOAdaptor adaptorWithModel(com.webobjects.eoaccess.EOModel model){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a new adaptor from the class with the specified name. Usually you would use adaptorWithModel to create a new adaptor istance, but you can use this method when you don't have a model. In fact, this method is typically used when you are creating an adaptor for the purpose of creating a model from an existing database.
     */
    public static com.webobjects.eoaccess.EOAdaptor adaptorWithName(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * This method, formerly provided by the EOLoginPanel class, returns null in the default implementation. Adaptor subclasses can override this method to return the administrative connection dictionary for the specified adaptor. Should return null if the user cancels the panel.
     */
    public com.webobjects.foundation.NSDictionary administrativeConnectionDictionaryForAdaptor(com.webobjects.eoaccess.EOAdaptor adaptor){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to verify that the adaptor can connect to the database server with its connection dictionary. Should briefly form a connection to the server to validate the connection dictionary and then close the connection. This method should throw a runtime exception if the connection dictionary contains invalid information, or if any error occurs.
     * An actual connection is made when the first adaptor channel is sent an openChannel message.
     */
    public abstract void assertConnectionDictionaryIsValid();

    /**
     * The default implementation assigns the column name (external name) for attribute based on attribute's internal name. For example, if the attribute is named
     * firstName
     * , this method assigns the external name
     * FIRST_NAME
     * . Makes no changes to attribute's column name if attribute is derived.
     * This method can be overridden by subclasses to assign other database-specific characteristics to attribute, such as external type. Subclasses of EOAdaptor don't need to implement this method. A subclass that does implement this method must incorporate the superclass's version.
     */
    public void assignExternalInfoForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Assigns database-specific characteristics to model. Used in EOModeler to switch a model's adaptor. This method examines each entity in model. If an entity's external name is not set and all of the entity's attribute's external names are not set, then this method uses assignExternalInfoForEntity and assignExternalInfoForAttribute to assign external names. If the entity's external name is set or if any of the entity's attributes' external names are set, then the method doesn't assign external names to the entity or any of its attributes. Regardless, this method assigns external types for all the model's attributes. Recurses through entities and their attributes calling the conversion methods above.
     * A subclass of EOAdaptor doesn't need to implement this method.
     */
    public void assignExternalInfoForEntireModel(com.webobjects.eoaccess.EOModel model){
        return; //TODO codavaj!!
    }

    /**
     * The default implementation assigns an external name to entity based on entity's name attribute.
     * An adaptor subclass should implement this method to assign additional database-specific characteristics, if any, to entity. A subclass that does implement this method must incorporate the superclass's version.
     */
    public void assignExternalInfoForEntity(com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    /**
     * The default implementation does nothing. This method can be overridden by subclasses to assign the external type to attribute. An adaptor subclass should implement this method to assign an external type using attribute's internal type, precision, and length information.
     */
    public void assignExternalTypeForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if the receiver can service model, false otherwise. EOAdaptor's implementation returns true if the receiver's connection dictionary is equal to model's connection dictionary as determined by NSDictionary's isEqual method.
     * Subclasses of EOAdaptor don't need to override this method.
     */
    public boolean canServiceModel(com.webobjects.eoaccess.EOModel model){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the receiver's connection dictionary, or null if the adaptor doesn't have one. The connection dictionary contains the values, such as user name and password, needed to connect to the database server. The dictionary's keys identify the information the server expects, and its values are the values that the adaptor will try when connecting. Connection dictionary keys are specific to each adaptor; refer to your adaptor's documentation for the keys it uses.
     * A subclass of EOAdaptor doesn't need to override this method.
     */
    public com.webobjects.foundation.NSDictionary connectionDictionary(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the adaptor contexts created by the receiver, or an empty array if no adaptor contexts have been created. Subclasses of EOAdaptor don't need to override this method.
     */
    public com.webobjects.foundation.NSArray contexts(){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to create and return a new EOAdaptorContext, or null if a new context can't be created. A newly created EOAdaptor has no contexts.
     */
    public abstract com.webobjects.eoaccess.EOAdaptorContext createAdaptorContext();

    /**
     * Uses the administrative login information to create the database defined by administrativeConnectionDictionary. Throws an exception if administrativeConnectionDictionary is null.
     */
    public void createDatabaseWithAdministrativeConnectionDictionary(com.webobjects.foundation.NSDictionary administrativeConnectionDictionary){
        return; //TODO codavaj!!
    }

    /**
     * Returns the default delegate, which is the object that is assigned to new adaptor instances as the delegate, or null if no default delegate is set.
     */
    public static java.lang.Object defaultDelegate(){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to return the subclass of EOSQLExpression used as the default expression class for the adaptor. You won't ordinarily invoke this method directly. It is invoked automatically to determine which class should be used to represent query language expressions.
     */
    public abstract java.lang.Class defaultExpressionClass();

    /**
     * Returns the receiver's delegate or null if a delegate has not been assigned. Subclasses of EOAdaptor don't need to override this method.
     */
    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Uses the administrative login information to drop the database defined by the administrativeConnectionDictionary. Throws an exception if administrativeConnectionDictionary is null.
     */
    public void dropDatabaseWithAdministrativeConnectionDictionary(com.webobjects.foundation.NSDictionary administrativeConnectionDictionary){
        return; //TODO codavaj!!
    }

    /**
     * Returns the subclass of EOSQLExpression used by the receiver for query language expressions, which is assigned using the class method setExpressionClassName. If no class has been set for the receiver's class, this method determines the expression class by sending defaultExpressionClass to this. Throws an exception if the expression class is not loaded in memory.
     * You rarely need to invoke this method yourself. It is invoked by the Enterprise Objects Framework to determine the class to use to represent query language expressions. You should use this method if you explicitly create EOSQLExpression instances. To be sure that you are using the correct expression class, create instances of the class returned from this method.
     * Subclasses of EOAdaptor don't need to override this method. A subclass that does override this method must incorporate the superclass's version by calling super.
     */
    public java.lang.Class expressionClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the class name of the subclass of EOSQLExpression used for expression evaluation on a given adaptor class.
     */
    public static java.lang.String expressionClassName(java.lang.String adaptorClassName){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that supports changes made to EOSQLExpression and related classes and interfaces. Subclass implementations return the EOExpressionFactory for the adaptor.
     */
    public abstract com.webobjects.eoaccess.EOSQLExpressionFactory expressionFactory();

    /**
     * The default implementation returns an empty array. This method can be overridden by subclasses to return the names of the database types for use with the adaptor.
     * model is an optional argument that can be used to supplement the adaptor's set of database types with additional, user-defined database types. Refer to your adaptor's documentation to determine whether, and how, it uses the model for type mapping.
     */
    public com.webobjects.foundation.NSArray externalTypesWithModel(com.webobjects.eoaccess.EOModel model){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns value unchanged. This method can be overridden by subclasses to return the value that the receiver's database server would ultimately store for value if it were inserted or updated in the column described by att. An adaptor subclass should override this method if the adaptor's database performs transformations on binary types, such as BLOBs.
     * This method is invoked from fetchedValueForValue when the value argument is an NSData.
     */
    public com.webobjects.foundation.NSData fetchedValueForDataValue(com.webobjects.foundation.NSData value, com.webobjects.eoaccess.EOAttribute att){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns value unchanged. This method can be overridden by subclasses to return the value that the receiver's database server would ultimately store for value if it were inserted or updated in the column described by att. An adaptor subclass should override this method to convert or format date values. For example, a concrete adaptor subclass could set value's millisecond value to 0.
     * This method is invoked from fetchedValueForValue when the value argument is a date.
     */
    public com.webobjects.foundation.NSTimestamp fetchedValueForDateValue(com.webobjects.foundation.NSTimestamp value, com.webobjects.eoaccess.EOAttribute att){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns value unchanged. This method can be overridden by subclasses to return the value that the receiver's database server would ultimately store for value if it were inserted or updated in the column described by att. An adaptor subclass should override this method to convert or format numeric values. For example, a concrete adaptor subclass should probably round value according to the precision and scale rules of the database.
     * This method is invoked from fetchedValueForValue when the value argument is a number.
     */
    public java.lang.Number fetchedValueForNumberValue(java.lang.Number value, com.webobjects.eoaccess.EOAttribute att){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns value unchanged. This method can be overridden by subclasses to return the value that the receiver's database server would ultimately store for value if it were inserted or updated in the column described by att. An adaptor subclass should override this method to perform any additional conversion or formatting that is needed on string values.
     * This method is invoked from fetchedValueForValue when the value argument is a string.
     */
    public java.lang.String fetchedValueForStringValue(java.lang.String value, com.webobjects.eoaccess.EOAttribute att){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value that the receiver's database server would ultimately store for value if it were inserted or updated in the column described by att. Returns value unchanged if value is not a string, number, date, or data object (that is, an instance of String, Number, NSTimestamp, NSData, or one of their subclasses). The Framework uses this method to keep Enterprise Object snapshots synchronized with database values.
     * For example, assume that a product's price is marked down 15%. If the product's original price was 5.25, the sale price is 5.25*.85, or 4.4625. When the Enterprise Objects Framework updates the product's price, the database server truncates the price to 4.46 (assuming the scale of the price column in the database is 2). Before performing the update, the Framework calls fetchedValueForValue with the value 4.4625. The adaptor performs the database-specific transformation and returns 4.46. The Framework assigns the truncated value to the product object and to the product object's snapshot and then proceeds with the update.
     * An adaptor subclass can override this method or one of the data type-specific fetchedValue... methods. EOAdaptor's implementation invokes one of the data type-specific methods depending on value's class.
     * This method invokes adaptorFetchedValueForValue, which can override the adaptor's default behavior.
     */
    public java.lang.Object fetchedValueForValue(java.lang.Object value, com.webobjects.eoaccess.EOAttribute att){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked when necessary to clean up after a dropped connection. Sends handleDroppedConnection to all of its adaptor contexts and then clears its array of contexts. If the delegate implements reconnectionDictionaryForAdaptor, that method is invoked, and the return value is assigned to the adaptor as its new connection dictionary.
     * Never invoke this method yourself. It is invoked automatically by the Framework. Subclasses don't normally need to override the superclass implementation.
     */
    public void handleDroppedConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if any of the receiver's contexts have open channels, false otherwise. Subclasses of EOAdaptor don't need to override this method.
     */
    public boolean hasOpenChannels(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the adaptor's has a plug-in achitecture.
     */
    public boolean hasPlugIns(){
        return false; //TODO codavaj!!
    }

    /**
     * The default implementation returns null. This method can be overridden by subclasses to return the name of the class used to represent values stored in the database as extType. Should return null if no mapping for extType is found.
     * model is an optional argument that can be used to supplement the adaptor's set of type mappings with additional mappings for user-defined database types. Refer to your adaptor's documentation to determine whether, and how, it uses the model for type mapping.
     */
    public java.lang.String internalTypeForExternalType(java.lang.String extType, com.webobjects.eoaccess.EOModel model){
        return null; //TODO codavaj!!
    }

    /**
     * The default implementation returns false. Subclasses that support database reconnection should implement this method to allow for automatic database reconnection. This method should return true if the exception is one that the adaptor can attempt to recover from by reconnecting to the database, false otherwise.
     * Invoked if an exception is thrown during fetching or saving. If the adaptor returns true, it then attempts to reconnect to the database and retries the operation. If the reconnection attempt fails, the exception from the failure is thrown as usual. If the adaptor returns false, reconnection isn't attempted and the exception is thrown.
     */
    public boolean isDroppedConnectionException(java.lang.Exception exception){
        return false; //TODO codavaj!!
    }

    /**
     * An abstract method that should be implemented by subclasses to return true if an attribute of type typeName can be used in a qualifier (an SQL WHERE clause) sent to the database server, false otherwise. typeName is the name of a type as required by the database server. model is an optional argument that can be used to supplement the adaptor's set of type mappings with additional mappings for user-defined database types.
     */
    public abstract boolean isValidQualifierType(java.lang.String typeName, com.webobjects.eoaccess.EOModel model);

    /**
     * Returns the adaptor's name. Subclasses of EOAdaptor don't need to override this method.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the adaptor's plug-in name. Subclasses of EOAdaptor need to override this method if they support a plug-in achitecture.
     */
    public java.lang.String plugInName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of prototype attributes specific to the adaptor class, or an empty array if there are none. Adaptor writers should note that this method looks for an EOModel named EO
     * Prototypes in the Resources directory of the adaptor.
     */
    public com.webobjects.foundation.NSArray prototypeAttributes(){
        return null; //TODO codavaj!!
    }

    /**
     * An abstract method that supports changes made to EOSQLExpression and related classes and interfaces. Subclass implementations return the EOSchemaGeneration for the adaptor.
     */
    public abstract com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory schemaSynchronizationFactory();

    /**
     * Sets the adaptor's connection dictionary to dictionary, which must only contain String, NSData, NSDictionary, and NSArray objects. Connection information can not be changed while the adaptor is connected. Throws an exception if there are any open channels when this method is invoked.
     * Subclasses of EOAdaptor don't need to override this method. A subclass that does override this method must incorporate the superclass's version by calling super.
     */
    public void setConnectionDictionary(com.webobjects.foundation.NSDictionary dictionary){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default delegate, which is the object assigned as delegate to all newly created EOAdaptor instances. By default, there is no default delegate.
     */
    public static void setDefaultDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's delegate to delegate, or removes its delegate if delegate is null. Subclasses of EOAdaptor don't need to override this method. A subclass that does override this method must incorporate the superclass's version by calling super.
     */
    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Sets the expression class for instances of the class named adaptorClassName to sqlExpressionClassName. If sqlExpressionClassName is null, restores the expression class to the default. Throws an exception if adaptorClassName is null or an empty string. Use this method to substitute a subclass of EOSQLExpression for the expression class provided by the adaptor.
     */
    public static void setExpressionClassName(java.lang.String sqlExpressionClassName, java.lang.String adaptorClassName){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * An abstract method that supports changes made to EOSQLExpression and related classes and interfaces. Subclass implementations return the EOSynchronizationFactory for the adaptor.
     */
    public abstract com.webobjects.eoaccess.EOSchemaGeneration synchronizationFactory();

    /**
     * This interface defines a delegate to EOAdaptor to handle specific requests that are normally handled by EOAdaptor (or rather its subclass since EOAdaptor is an abstract class). The delegate can use these requests to preempt the operations, modify results, or simply track activity.
     */
    public static interface Delegate{
        /**
         * Allows the delegate to handle attribute processing when saving EOEnterpriseObjects to the database. When this method is implemented, it must return the processed value.
         */
        abstract java.lang.Object adaptorFetchedValueForValue(com.webobjects.eoaccess.EOAdaptor adaptor, java.lang.Object value, com.webobjects.eoaccess.EOAttribute attribute);

        /**
         * Creates a new connection dictionary for the adaptor. It is responsible for guaranteeing that the new connection dictionary is compatible with any EODatabase that is currently using the adaptor. Note that if reconnection succeeds, the EODatabase will continue to use its database snapshots as if nothing had happened so the new database server should have the same data as the original.
         */
        abstract com.webobjects.foundation.NSDictionary reconnectionDictionaryForAdaptor(com.webobjects.eoaccess.EOAdaptor adaptor);

    }
}
