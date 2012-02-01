package com.webobjects.directtoweb;
/**
 * The D2WSwitchComponent class gives a reusable Direct to Web component the option to choose which D2WComponent to use in a given context.
 * See Also:Serialized Form
 */
public class D2WSwitchComponent extends com.webobjects.appserver.WOComponent{
    /**
     * The set of possible bindings.
     * In the current implementation, the bindings include: nextPageDelegate, dataSource, queryDataSource, nextPage, object, masterObjectAndRelationshipKey, selectedObject, fetchSpecificationName, action, and menu.
     * The implementation is subject to change in future releases.
     */
    protected static java.util.Vector possibleBindings;

    /**
     * Creates an instance of D2WSwitchComponent with the specified context.
     * Parameters:aContext - instance of WOContextSee Also:WOComponent.WOComponent(WOContext)
     */
    public D2WSwitchComponent(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Adds the specified binding to the set of possible bindings.
     */
    public static void addToPossibleBindings(java.lang.String newBinding){
        return; //TODO codavaj!!
    }

    /**
     * Throws an exception if any of the required bindings are missing.
     * The current implementation requires the following bindings: _dynamicPage, _task, _entityName.
     * The implementation is subject to change in future releases.
     */
    public void awake(){
        return; //TODO codavaj!!
    }

    /**
     * Gets the name of the component.
     * Throws an exception if no rule can be found to decide which page to embed in the parent to display in the sub-context.
     */
    public java.lang.String componentName(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the name of the entity.
     * The current implementation uses the binding _entityName.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String entityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the extra bindings.
     * The current implementation removes all objects and copies the values for the possible bindings.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.foundation.NSDictionary extraBindings(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the name of the look from the settings.
     */
    public java.lang.String lookFromSettings(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the extra bindings to the specified value.
     * The current implementation expects the new value to be an instance of NSMutableDictionary and sets the values for the bindings.
     * The implementation is subject to change in future releases.
     */
    public void setExtraBindings(java.lang.Object newValue){
        return; //TODO codavaj!!
    }

    /**
     * Sets the sub-context.
     * The current implementation does nothing.
     * The implementation is subject to change in future releases.
     */
    public void setSubContext(java.lang.Object newValue){
        return; //TODO codavaj!!
    }

    /**
     * Gets the settings with the display properties.
     * The current implementation uses the bindings _settings and displayKeys. Parses a property list if the value for settings is a String.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.foundation.NSDictionary settings(){
        return null; //TODO codavaj!!
    }

    /**
     * Clears the local settings.
     */
    public void sleep(){
        return; //TODO codavaj!!
    }

    /**
     * Gets the sub-context.
     * The current implementation uses the binding _dynamicPage. Takes value from the settings and the look from settings.
     * The implementation is subject to change in future releases.
     */
    public com.webobjects.directtoweb.D2WContext subContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates that the component does not synchronize variables with bindings.
     */
    public boolean synchronizesVariablesWithBindings(){
        return false; //TODO codavaj!!
    }

    /**
     * Gets the name of the task.
     * The current implementation uses the binding _task.
     * The implementation is subject to change in future releases.
     */
    public java.lang.String task(){
        return null; //TODO codavaj!!
    }

}
