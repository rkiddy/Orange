package com.webobjects.jndiadaptor;
/**
 * The JNDIAdaptor class represents a Java Naming and Directory Interface service.
 */
public class JNDIAdaptor extends com.webobjects.eoaccess.EOAdaptor{
    /**
     * A connection dictionary key representing the authentication method.
     * See Also:Constant Field Values
     */
    public static final java.lang.String AuthenticationMethodKey="authenticationMethod";

    /**
     * A connection dictionary key representing the default scope.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DefaultScopeKey="defaultScope";

    /**
     * A connection dictionary key representing the initial context factory.
     * See Also:Constant Field Values
     */
    public static final java.lang.String InitialContextFactoryKey="initialContextFactory";

    /**
     * A connection dictionary value representing no authentication method.
     * See Also:Constant Field Values
     */
    public static final java.lang.String NoneKey="none";

    /**
     * A connection dictionary value representing object scope.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ObjectKey="Object";

    /**
     * A connection dictionary value representing one-level scope.
     * See Also:Constant Field Values
     */
    public static final java.lang.String OneLevelKey="One Level";

    /**
     * A connection dictionary key representing the password.
     * See Also:Constant Field Values
     */
    public static final java.lang.String PasswordKey="password";

    /**
     * A connection dictionary key representing the plug-in class name.
     * See Also:Constant Field Values
     */
    public static final java.lang.String PlugInClassNameKey="plugInClassName";

    /**
     * A connection dictionary key representing the server URL.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ServerUrlKey="serverUrl";

    /**
     * A connection dictionary value representing subtree scope.
     * See Also:Constant Field Values
     */
    public static final java.lang.String SubtreeKey="Subtree";

    /**
     * A connection dictionary key representing the timeout.
     * See Also:Constant Field Values
     */
    public static final java.lang.String TimeoutKey="timeout";

    /**
     * A connection dictionary key representing the username.
     * See Also:Constant Field Values
     */
    public static final java.lang.String UsernameKey="username";

    /**
     * Creates a new instance of JNDIAdaptor.
     * Parameters:name - - name of adaptorSee Also:EOAdaptor.EOAdaptor(String)
     */
    public JNDIAdaptor(java.lang.String name){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to verify that the adaptor can connect to the database server with its connection dictionary. Should briefly form a connection to the server to validate the connection dictionary and then close the connection. This method should throw a runtime exception if the connection dictionary contains invalid information, or if any error occurs.
     * An actual connection is made when the first adaptor channel is sent an openChannel message.
     */
    public void assertConnectionDictionaryIsValid(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Assigns database-specific characteristics to model. Used in EOModeler to switch a model's adaptor. This method examines each entity in model. If an entity's external name is not set and all of the entity's attribute's external names are not set, then this method uses assignExternalInfoForEntity and assignExternalInfoForAttribute to assign external names. If the entity's external name is set or if any of the entity's attributes' external names are set, then the method doesn't assign external names to the entity or any of its attributes. Regardless, this method assigns external types for all the model's attributes. Recurses through entities and their attributes calling the conversion methods above.
     * A subclass of EOAdaptor doesn't need to implement this method.
     */
    public void assignExternalInfoForEntireModel(com.webobjects.eoaccess.EOModel model){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to create and return a new EOAdaptorContext, or null if a new context can't be created. A newly created EOAdaptor has no contexts.
     */
    public com.webobjects.eoaccess.EOAdaptorContext createAdaptorContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new instance of EOEditingContext with the specified model, server URL, username, and password.
     */
    public static com.webobjects.eocontrol.EOEditingContext createEditingContext(java.lang.String modelName, java.lang.String serverUrl, java.lang.String username, java.lang.String password){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to return the subclass of EOSQLExpression used as the default expression class for the adaptor. You won't ordinarily invoke this method directly. It is invoked automatically to determine which class should be used to represent query language expressions.
     */
    public java.lang.Class defaultExpressionClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that supports changes made to EOSQLExpression and related classes and interfaces. Subclass implementations return the EOExpressionFactory for the adaptor.
     */
    public com.webobjects.eoaccess.EOSQLExpressionFactory expressionFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * The default implementation returns an empty array. This method can be overridden by subclasses to return the names of the database types for use with the adaptor.
     * model is an optional argument that can be used to supplement the adaptor's set of database types with additional, user-defined database types. Refer to your adaptor's documentation to determine whether, and how, it uses the model for type mapping.
     */
    public com.webobjects.foundation.NSArray externalTypesWithModel(com.webobjects.eoaccess.EOModel model){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * The default implementation returns false. Subclasses that support database reconnection should implement this method to allow for automatic database reconnection. This method should return true if the exception is one that the adaptor can attempt to recover from by reconnecting to the database, false otherwise.
     * Invoked if an exception is thrown during fetching or saving. If the adaptor returns true, it then attempts to reconnect to the database and retries the operation. If the reconnection attempt fails, the exception from the failure is thrown as usual. If the adaptor returns false, reconnection isn't attempted and the exception is thrown.
     */
    public boolean isDroppedConnectionException(java.lang.Exception exception){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that should be implemented by subclasses to return true if an attribute of type typeName can be used in a qualifier (an SQL WHERE clause) sent to the database server, false otherwise. typeName is the name of a type as required by the database server. model is an optional argument that can be used to supplement the adaptor's set of type mappings with additional mappings for user-defined database types.
     */
    public boolean isValidQualifierType(java.lang.String typeName, com.webobjects.eoaccess.EOModel model){
        return false; //TODO codavaj!!
    }

    /**
     * Gets the instance of the plug-in class name specified in the connection dictionary.
     */
    public com.webobjects.jndiadaptor.JNDIPlugIn plugIn(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * An abstract method that supports changes made to EOSQLExpression and related classes and interfaces. Subclass implementations return the EOSchemaGeneration for the adaptor.
     */
    public com.webobjects.eoaccess.synchronization.EOSchemaSynchronizationFactory schemaSynchronizationFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Sets the adaptor's connection dictionary to dictionary, which must only contain String, NSData, NSDictionary, and NSArray objects. Connection information can not be changed while the adaptor is connected. Throws an exception if there are any open channels when this method is invoked.
     * Subclasses of EOAdaptor don't need to override this method. A subclass that does override this method must incorporate the superclass's version by calling super.
     */
    public void setConnectionDictionary(com.webobjects.foundation.NSDictionary dictionary){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Description copied from class:
     * An abstract method that supports changes made to EOSQLExpression and related classes and interfaces. Subclass implementations return the EOSynchronizationFactory for the adaptor.
     */
    public com.webobjects.eoaccess.EOSchemaGeneration synchronizationFactory(){
        return null; //TODO codavaj!!
    }

}
