package com.webobjects.eogeneration;
public class EODynamicApplication extends com.webobjects.eoapplication.EOApplication{
    public EODynamicApplication(){
         //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Returns true if the receiver can perform the action method (sent by an EOAction object) named actionName, false otherwise. An EOController's implementation of this method generally returns false if the receiver doesn't have an action named actionName or if the actionName action is explicitly disabled.
     */
    public boolean canPerformActionNamed(java.lang.String actionName){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns an NSArray containing the actions (EOAction objects) for the application. The application object's actions are displayed in the main menu of the Java Client application.
     */
    protected com.webobjects.foundation.NSArray defaultActions(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is invoked after the final event thread is guaranteed to be running. If you subclass EOApplication, use this method to initialize anything relating to the user interface or event handling. Do not perform such initialization using EOApplication's constructor.
     */
    protected void finishInitialization(){
        return; //TODO codavaj!!
    }

}
