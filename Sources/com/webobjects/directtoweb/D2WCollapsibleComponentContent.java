package com.webobjects.directtoweb;
/**
 * See Also:Serialized Form
 */
public class D2WCollapsibleComponentContent extends com.webobjects.appserver.WOComponent{
    public D2WCollapsibleComponentContent(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Indicates if the push-pull of values in the parent component is enabled. Returns whether a nested component pulls all values down from its parent and pushes all values to its parent before and after each phase of the request-response loop.
     * This method returns false for stateless components and true otherwise. Override this method to create a non-synchronizing, stateful component (return false ), or a synchronizing stateless component (return true).
     */
    public boolean synchronizesVariablesWithBindings(){
        return false; //TODO codavaj!!
    }

}
