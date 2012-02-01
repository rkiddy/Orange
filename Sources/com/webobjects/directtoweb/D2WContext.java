package com.webobjects.directtoweb;
/**
 * Direct to Web contexts are objects of the D2WContext class. When a Direct to Web template renders, it does so with the help of a Direct to Web context which provides values for bindings in the template and maintains state information about the rendering process. See the "Direct to Web Architecture" chapter of Developing WebObjects Applications With Direct to Web for more information about the Direct to Web context.
 * The primary function of the Direct to Web context is to implement the EOKeyValueCoding interface (defined in the EOControl framework) by implementing valueForKey and takeValueForKey. It resolves the keys with the help of the rule system. Many of the keys mentioned in the class are defined as constants in the D2WModel class. D2WContext also provides two methods for accessing key paths such as entity.name. These are valueForKeyPath and takeValueForKeyPath. When you use the d2wContext key in a Direct to Web template's bindings (.wod) file, you indirectly use one of these methods.
 * For a list of the keys implemented by the D2WContext, see Direct To Web Context Keys. The D2WContext class also provides convenience methods to access keys in Java.
 */
public class D2WContext implements com.webobjects.eocontrol.EOKeyValueCodingAdditions{
    /**
     * This constant is intentionally undocumented.
     */
    public static final java.lang.Object NULL_VALUE=null;

    /**
     * This constant is intentionally undocumented.
     */
    public static final java.lang.Object VALUE_TO_BE_DERIVED=null;

    /**
     * Standard no-argument constructions. Invokes the session argument constructor with a null session.
     */
    public D2WContext(){
         //TODO codavaj!!
    }

    /**
     * Creates a new instance with the values of parentContext. The new instance is initialized with the key-value pairs in parentContext.
     * Parameters:parentContext - a context to copy initial values from.
     */
    public D2WContext(com.webobjects.directtoweb.D2WContext parentContext){
         //TODO codavaj!!
    }

    /**
     * Creates a new instance of a context. The following keys are given null values: D2WModel.TaskKey, D2WModel.EntityKey, and D2WModel.PropertyKeyKey. Also, sets the key D2WModel.SessionKey to the session passed as the argument.
     * Parameters:session - object set as the value to the key D2WModel.SessionKey. This way you can access the current session.
     */
    public D2WContext(com.webobjects.appserver.WOSession session){
         //TODO codavaj!!
    }

    /**
     * Returns the EOAttribute object for the current property
     */
    public com.webobjects.eoaccess.EOAttribute attribute(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    protected com.webobjects.eoaccess.EOAttribute attribute(java.lang.String propertyKey){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    protected com.webobjects.eoaccess.EOAttribute attributeForProperty(java.lang.String propertyKey){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public void clearDerivedValues(){
        return; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public boolean componentClassPresentInRuntime(java.lang.String componentClassName){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the name of the property-level component to display based on the current property.. This value is resolved using the rule system.
     */
    public java.lang.String componentName(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public java.util.Vector componentsAvailable(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public void computeDerivedValues(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a String containing a user-presentable name for the current property. This value is resolved using the rule system.
     */
    public java.lang.String displayNameForProperty(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public com.webobjects.eoaccess.EOAttribute distantAttribute(java.lang.String propertyKey, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public com.webobjects.eoaccess.EORelationship distantRelationship(java.lang.String propertyKey, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the current named configuration
     */
    public java.lang.String dynamicPage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the setting for the current entity.
     */
    public com.webobjects.eoaccess.EOEntity entity(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public boolean frame(){
        return false; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public java.lang.Object handleQueryWithUnboundKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public void handleTakeValueForUnboundKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public java.util.Vector inferAllPossibleValuesForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public java.lang.Object inferSystemValueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Forces the use of the Rule System to get the value of key.
     */
    public java.lang.Object inferValueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public boolean isGenerating(){
        return false; //TODO codavaj!!
    }

    /**
     * When the current property is a relationship, returns the key for a property of the destination entity that identifies the entity. For example, if the receiver's current entity is Movie and the current property is the toStudio relationship (and thus the destination entity is Studio), an appropriate value for keyWhenRelationship is name since the name property identifies the studio.
     */
    public java.lang.String keyWhenRelationship(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns model being used by context to derive values. This is normally the default model.
     */
    public com.webobjects.directtoweb.D2WModel model(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public void nullOutDerivedValues(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the name of the Direct to Web template based on the current task and entity. This value is resolved using the rule system.
     */
    public java.lang.String pageName(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public java.util.Vector pagesAvailable(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of the current property.
     */
    public java.lang.String propertyKey(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if the current property key is a key path. Calls propertyKey() and if its a keypath (includes a dot) returns true.
     */
    public boolean propertyKeyIsKeyPath(){
        return false; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public int propertyType(){
        return 0; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public static java.lang.String propertyTypeForUnknownKeyPath(java.lang.String keyPath, com.webobjects.eoaccess.EOEntity entity){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public java.lang.String rawPageName(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public java.lang.String rawSystemPageName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the relationship object for the current property.
     */
    public com.webobjects.eoaccess.EORelationship relationship(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    protected com.webobjects.eoaccess.EORelationship relationship(java.lang.String propertyKey){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    protected com.webobjects.eoaccess.EORelationship relationshipForProperty(java.lang.String propertyKey){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public void sessionDidTimeOut(com.webobjects.foundation.NSNotification notification){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of the current named configuration
     */
    public void setDynamicPage(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of the current entity. Stores newValue under the key D2WModel.EntityKey.
     */
    public void setEntity(com.webobjects.eoaccess.EOEntity newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of the current property. Stores newValue under the key D2WModel.PropertyKeyKey.
     */
    public void setPropertyKey(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of the current task. Stores newValue under the key D2WModel.TaskKey.
     */
    public void setTask(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public java.lang.String startupEntityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the setting for the start up task. Returns a String containing the name of the application's startup page task ("queryAll" by default). The startup page is the page created by D2W defaultPage method and is the first page displayed after the user logs into an application. A user can change this start up page by adding a rule that overrides the default value of startupTask.
     */
    public java.lang.String startupTask(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public java.lang.Object storedValueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public void takeStoredValueForKey(java.lang.Object value, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public void takeValueForInferrableKey(java.lang.Object newValue, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of key to newValue in the local cache.
     */
    public void takeValueForKey(java.lang.Object newValue, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of key path to value in the local cache.
     */
    public void takeValueForKeyPath(java.lang.Object value, java.lang.String keyPath){
        return; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public void takeValuesFromDictionary(com.webobjects.foundation.NSDictionary dict){
        return; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public void takeValuesFromDictionaryWithMapping(com.webobjects.foundation.NSDictionary dictionary, com.webobjects.foundation.NSDictionary mapping){
        return; //TODO codavaj!!
    }

    /**
     * Returns the setting for the current task.
     */
    public java.lang.String task(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public void unableToSetNullForKey(java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Returns the value of 'key' using the Rule System. Returns the receiver's value (an Object) for key. This method may resolve the key using the rule system.
     */
    public java.lang.Object valueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of 'key' without using the Rule System. Looks up the value for 'key' in the context's local cache. If the value isn't there, null is returned. The Rule System does not play a role in deriving the value.
     */
    public java.lang.Object valueForKeyNoInference(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the inferred value of keyPath. This method works similarly to valueForKey except that you can pass a key path such as entity.name.
     */
    public java.lang.Object valueForKeyPath(java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the value of 'keyPath' using the Rule System. Returns the receiver's value (an Object) for keyPath. This method may resolve the key path using the rule system.
     */
    public java.lang.Object valueForKeyPathNoInference(java.lang.String keyPath){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public com.webobjects.foundation.NSDictionary valuesForKeys(com.webobjects.foundation.NSArray keys){
        return null; //TODO codavaj!!
    }

    /**
     * This is an intentionally undocumented private use method.
     */
    public com.webobjects.foundation.NSDictionary valuesForKeysWithMapping(com.webobjects.foundation.NSDictionary mapping){
        return null; //TODO codavaj!!
    }

}
