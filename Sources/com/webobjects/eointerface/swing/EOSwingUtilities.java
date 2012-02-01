package com.webobjects.eointerface.swing;
/**
 * EOSwingUtilities is a class of static methods for convenience.
 */
public class EOSwingUtilities{
    /**
     * Lets the frameworks know that the completion of event handling will be necessary. When using JFC Widget Plugins, this function should be called at least once per user event/activity. The existing plugins do this, so you may have to call this method explicitly if you subclass and override some of the Plugin's methods.
     */
    public static void eventEnded(){
        return; //TODO codavaj!!
    }

    /**
     * This method registers several classes needed to work with Swing in the EOInterface layer, including setting the default widget plugins for specific combinations of EOAssociation subclasses and widget classes.
     */
    public static void registerSwingSet(){
        return; //TODO codavaj!!
    }

}
