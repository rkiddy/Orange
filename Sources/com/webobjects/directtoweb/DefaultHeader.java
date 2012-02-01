package com.webobjects.directtoweb;
/**
 * The DefaultHeader class defines the behavior of the menu header in a Direct to Web application. The source code for this class is copied into the MenuHeader.java file in the project of the application.
 * See Also:Serialized Form
 */
public class DefaultHeader extends com.webobjects.appserver.WOComponent{
    /**
     * Is used as a temporary variable by the Entities WOPopupButton.
     */
    public java.lang.String entityNameInList;

    /**
     * Constructs a DefaultHeader with the specified context.
     * Parameters:aContext - - the WOContext.
     */
    public DefaultHeader(com.webobjects.appserver.WOContext aContext){
         //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks New in the menu bar. Creates an instance of the manipulated entity and displays an edit page for it.
     */
    public com.webobjects.appserver.WOComponent findEntityAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Home in the menu bar. Displays the startup task page.
     */
    public com.webobjects.appserver.WOComponent homeAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the Web Assistant is enabled. By default, it is enabled.
     */
    public boolean isWebAssistantEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Logout in the menu bar. Terminates the current session and returns the home page (Main WOComponent) of the application.
     */
    public com.webobjects.appserver.WOComponent logout(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the entity name that the user chooses in the Entities pop-up list in the menu bar.
     */
    public java.lang.String manipulatedEntityName(){
        return null; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Search in the menu bar. Creates and displays a query page for the selected entity.
     */
    public com.webobjects.appserver.WOComponent newObjectAction(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the entity name that the user chooses in the pop-up list in the menu bar.
     */
    public void setManipulatedEntityName(java.lang.String newValue){
        return; //TODO codavaj!!
    }

    /**
     * Is invoked when the user clicks Customize in the menu bar. Displays the Web Assistant in the browser of the user.
     */
    public com.webobjects.appserver.WOComponent showWebAssistant(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray containing the names of the visible entities in the session WOSession. You can hide entities using the Entities tab in the Web Assistant.
     */
    public com.webobjects.foundation.NSArray visibleEntityNames(){
        return null; //TODO codavaj!!
    }

}
