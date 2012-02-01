package com.webobjects.eoapplication;
public class EOActionTrigger extends com.webobjects.eoapplication.EOComponentController implements com.webobjects.eoapplication.EOComponentController.ActionCollector{
    public EOActionTrigger(){
         //TODO codavaj!!
    }

    public EOActionTrigger(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns an array of all actions collected from subcontrollers.
     */
    public com.webobjects.foundation.NSArray collectedActions(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked when it's necessary to create the receiver's component, including setting up the subcontroller area. Subclass implementations of this method usually invoke setComponent and if necessary setSubcontrollerArea. EOComponentController's default implementation creates an empty EOView to hold subcontroller components.
     * The layout mechanisms used to integrate the components of controllers expect that the component is generated with the minimum size possible.
     */
    protected void generateComponent(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Sets actions to be added to the controllers default actions.
     */
    public void setAdditionalActions(com.webobjects.foundation.NSArray additionalActions){
        return; //TODO codavaj!!
    }

    public void setUsesLargeButtonRepresentation(boolean flag){
        return; //TODO codavaj!!
    }

    public boolean usesLargeButtonRepresentation(){
        return false; //TODO codavaj!!
    }

}
