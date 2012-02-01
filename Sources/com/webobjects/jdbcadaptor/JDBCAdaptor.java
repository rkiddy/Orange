package com.webobjects.jdbcadaptor;
/**
 * JDBCAdaptor is a concrete subclass of EOAdaptor that use JDBC for connecting to a database. It can be customized for a particular database and JDBC driver by using a JDBCPlugIn. Application code rarely needs to interact directly with an adaptor and should not normally use adaptor-specific API. All the useful API resides in EOAdaptor and the other generic EOAccess framework classes.
 * See Also:EOAdaptor, JDBCPlugIn
 */
public class JDBCAdaptor extends com.webobjects.eoaccess.EOAdaptor{
    /**
     * Key for JNDI datasource name
     * See Also:Constant Field Values
     */
    public static final java.lang.String DataSourceJndiNameKey="DataSourceJndiName";

    /**
     * Key labeling the JDBC driver class name in the connection dictionary.
     * See Also:Constant Field Values
     */
    public static final java.lang.String DriverKey="driver";

    /**
     * Connection dictionary key labeling database-specific information contained in an NSDictionary, commonly referred to as "JDBC info".
     * See Also:JDBCAdaptor.jdbcInfo(), Constant Field Values
     */
    public static final java.lang.String JDBCInfoKey="jdbc2Info";

    /**
     * Key labeling the password in the connection dictionary.
     * See Also:Constant Field Values
     */
    public static final java.lang.String PasswordKey="password";

    /**
     * Key labeling the plugin class name in the connection dictionary.
     * See Also:Constant Field Values
     */
    public static final java.lang.String PlugInKey="plugin";

    /**
     * Key labeling the NSDictionary of external type information in the JDBC info dictionary.
     * See Also:Constant Field Values
     */
    public static final java.lang.String TypeInfoKey="typeInfo";

    /**
     * Key labeling the JDBC URL String in the connection dictionary.
     * See Also:Constant Field Values
     */
    public static final java.lang.String URLKey="URL";

    /**
     * Key labeling the user name in the connection dictionary.
     * See Also:Constant Field Values
     */
    public static final java.lang.String UsernameKey="username";

    /**
     * Create a JDBCAdaptor. User code should not normally create an adaptor with this constructor.
     * See Also:EOAdaptor.adaptorWithModel(com.webobjects.eoaccess.EOModel), EOAdaptor.adaptorWithName(java.lang.String)
     */
    public JDBCAdaptor(java.lang.String name){
         //TODO codavaj!!
    }

    /**
     * Checks that the connectionary dictionary is valid by attempting to make a connection. If it fails, a JDBCAdaptorException is thrown.
     */
    public void assertConnectionDictionaryIsValid(){
        return; //TODO codavaj!!
    }

    /**
     * Assigns an appropriate external type to the attribute. The attribute should already have a value class, scale and precision. This method is invoked when reverse engineering or switching adaptors.
     */
    public void assignExternalTypeForAttribute(com.webobjects.eoaccess.EOAttribute attribute){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if the adaptor is compatible with the model; false otherwise. The decision is made by matching the connection dictionary of the adaptor against that of the model considering the following keys: URLKey, UsernameKey, PasswordKey, DriverKey, and PlugInKey.
     */
    public boolean canServiceModel(com.webobjects.eoaccess.EOModel model){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the JDBC URL from the adaptor's connection dictionary.
     */
    protected java.lang.String connectionDictionaryURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a Properties object specifying connection information.
     */
    public java.util.Properties connectionProperties(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the JDBC URL that should be used for connecting to the database as specified by the plugin.
     */
    public java.lang.String connectionURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a new JDBCContext for this adaptor.
     */
    public com.webobjects.eoaccess.EOAdaptorContext createAdaptorContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a new EOAttribute based on the arguments. This method is called during reverse engineering.
     */
    public com.webobjects.eoaccess.EOAttribute createAttribute(java.lang.String name, java.lang.String columnName, int columnType, java.lang.String externalType, int precision, int scale, int isNullable){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the expression class to use for this adaptor. The expression class is normally determined by the plugin. It should be a subclass of JDBCExpression.
     */
    public java.lang.Class defaultExpressionClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the JDBC driver's name.
     */
    public java.lang.String driverName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the expression factory to use for this adaptor. The expression factory is normally determined by the plugin. It should be a subclass of JDBCExpressionFactory.
     */
    public com.webobjects.eoaccess.EOSQLExpressionFactory expressionFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the name of an external type that matches the given JDBC type type.
     */
    public java.lang.String externalTypeForJDBCType(int type){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray of external type names for the model. This information is often cached in the connection dictionary of the model, but the adaptor can also fetch it at runtime.
     */
    public com.webobjects.foundation.NSArray externalTypesWithModel(com.webobjects.eoaccess.EOModel model){
        return null; //TODO codavaj!!
    }

    /**
     * Calls super with the result of the plugIn's plugInValueForValue. This allows a PlugIn to influence the value. The basic behavior is the same as EOAdaptor.fetchedValueForValue.
     */
    public java.lang.Object fetchedValueForValue(java.lang.Object value, com.webobjects.eoaccess.EOAttribute attribute){
        return null; //TODO codavaj!!
    }

    protected static com.webobjects.foundation.NSDictionary getJDBCInfoWithConnectionDictionary(com.webobjects.foundation.NSDictionary connectionDictionary) throws com.webobjects.jdbcadaptor.JDBCAdaptorException{
        return null; //TODO codavaj!!
    }

    /**
     * Handles cleaning up when a connection is dropped. Usually not called directly.
     */
    public void handleDroppedConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if exception is a JDBCAdaptorException and it is considered a "dropped" connection; otherwise false. The adaptor will try to reconnect automatically from a dropped connection. The decision is based on the SQLState of the underlying SQLException that is wrapped by the JDBCAdaptorException. For any other type of Exception, this method returns false.
     * This method defer the decision to the plug-in so that each database vendor can customize teh error detection.
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
     * Returns an NSDictionary of database-specific information.
     */
    protected com.webobjects.foundation.NSDictionary jdbcInfo(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the password from the adaptor's connection dictionary.
     */
    public java.lang.String password(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the JDBCPlugIn to use with this adaptor's connection dictionary.
     */
    public com.webobjects.jdbcadaptor.JDBCPlugIn plugIn(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the adaptor's plug-in name. Subclasses of EOAdaptor need to override this method if they support a plug-in achitecture.
     */
    public java.lang.String plugInName(){
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
    public void setConnectionDictionary(com.webobjects.foundation.NSDictionary dictionary) throws java.lang.IllegalArgumentException{
        return; //TODO codavaj!!
    }

    public static java.lang.String stringRepresentationForJDBCType(int columnType){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Description copied from class:
     * An abstract method that supports changes made to EOSQLExpression and related classes and interfaces. Subclass implementations return the EOSynchronizationFactory for the adaptor.
     */
    public com.webobjects.eoaccess.EOSchemaGeneration synchronizationFactory(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary of external type information.
     */
    protected com.webobjects.foundation.NSDictionary typeInfo(){
        return null; //TODO codavaj!!
    }

    protected static com.webobjects.foundation.NSDictionary typeInfoForModel(com.webobjects.eoaccess.EOModel model){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the user name from the adaptor's connection dictionary.
     */
    public java.lang.String username(){
        return null; //TODO codavaj!!
    }

    protected int varcharMaxLength(){
        return 0; //TODO codavaj!!
    }

}
