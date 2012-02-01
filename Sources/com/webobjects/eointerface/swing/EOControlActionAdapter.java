package com.webobjects.eointerface.swing;
/**
 * The EOControlActionAdapter class is used to connect user interface widgets to the actions performed with those controls. They are usually generated automatically to represent connections made in Interface Builder. For example, suppose you create a connection from a "Fetch" button to a display group and that you connect the button to the display group's fetch method. At runtime, an EOControlActionAdapter object is used to invoke the display group's fetch method when a user clicks the Fetch button. In this example, the display group is the EOControlActionAdapter's target, "fetch" is the name of the action method to perform on the target, and the button is the listenee. An EOControlActionAdapter listens for the listenee (the button) to be acted upon (to be pushed). When the listenee is acted upon, the EOControlActionAdapter performs the action on its target (invokes the display group's fetch method).
 */
public class EOControlActionAdapter implements java.awt.event.ActionListener, com.webobjects.foundation.NSDisposable{
    /**
     * Constructs a new EOControlActionAdapter that performs the method identified by actionName on the object target when the widget listenee is acted upon.
     * Parameters:target - the action targetactionName - the name of the action methodlistenee - listenee (widget) to be acted upon Throws: java.lang.illegalStateException - if listenee is null
     */
    public EOControlActionAdapter(java.lang.Object target, java.lang.String actionName, java.lang.Object listenee){
         //TODO codavaj!!
    }

    /**
     * Constructs a new EOControlActionAdapter that performs the method identified by actionName when the widget listenee is acted upon. Note that you have to set the target later if you want this action to have any effect.
     * Parameters:actionName - the name of the action methodlistenee - listenee (widget) to be acted upon Throws: java.lang.illegalStateException - if listenee is null
     */
    public EOControlActionAdapter(java.lang.String actionName, java.lang.Object listenee){
         //TODO codavaj!!
    }

    /**
     * Invokes the action method on the target of the EOControlActionAdaptor. Invoked when the listenee is acted upon.
     */
    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Releases all resources used by this object and ensures that it becomes available for garbage collection. Note that you should not use the object any further after invoking dispose.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's target to target.
     */
    public void setTarget(java.lang.Object target){
        return; //TODO codavaj!!
    }

}
