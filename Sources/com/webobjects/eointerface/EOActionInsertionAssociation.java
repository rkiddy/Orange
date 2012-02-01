package com.webobjects.eointerface;
/**
 * An EOActionInsertionAssociation object inserts objects from one display group into another.
 * Usable With: com.webobjects.eointerface.swing: Any object that implements the method addActionListener (javax.swing.JButton and javax.swing.JMenuItem, for example). com.webobjects.eointerface.cocoa: Any object that responds to setAction, typically an NSControl.
 * Aspects: sourceBound to the EODisplayGroup containing objects to insert. This aspect doesn't use a key. destinationA relationship of the selected object, into which objects from the source EODisplayGroup are inserted. Usually bound to a different EODisplayGroup than source. enabledA boolean attribute of the selected object (usually in the destination EODisplayGroup), which determines whether the NSControl is enabled.
 * Suppose an application shows Talent in one display group and Movies in another. You want a user to be able to select a talent, select a movie, and then click an Assign Director button that assigns the selected talent as one of the movie's directors. To do this, in Interface Builder, control-drag a connection from the button to the Talent display group. Select EOActionInsertionAssociation in the Connections inspector, and double-click the association's source aspect, binding it to the Talent display group. Similarly, control-drag a connection from the button to the Movie display group. Select EOActionAssociation in the Connections inspector, and bind the association's destination aspect to the "directors" key. Now, when the user clicks the button, the selected Talent is added to the directors relationship of the selected Movie. If more than one talent is selected, both are added to the relationship. If more than one Movie is selected, the selected talent are added to the relationship of the first Movie in the selection.
 */
public class EOActionInsertionAssociation extends com.webobjects.eointerface.EOActionWidgetAssociation{
    /**
     * Creates a new EOActionInsertionAssociation to monitor and update the value in aDisplayObject, typically a button or menu item.
     * You normally set up associations in Interface Builder, in which case you don't need to create them programmatically. However, if you do create them up programmatically, setting them up is a multi-step process. After creating an association, you must bind its aspects and establish its connections.
     * Parameters:aDisplayObject - display object for this association to manage.See Also:EOAssociation.bindAspect(java.lang.String, com.webobjects.eointerface.EODisplayGroup, java.lang.String), EOAssociation.establishConnection()
     */
    public EOActionInsertionAssociation(java.lang.Object aDisplayObject){
         //TODO codavaj!!
    }

    /**
     * Returns whether or not the set of selected items in the action display group allows for this association to perform its action. If true, then the action can be invoked, otherwise nothing will happen when the invokeAction method is called on this association.
     */
    protected boolean displayGroupSelectionsAllowEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked by the receiver's plugin when its display object is acted upon. Adds the selected objects of the source display group to the relationship of the selected object of the destination display group with the name of the key used to bind the destination aspect.
     */
    public void invokeAction(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the primary aspect this association gets bound to.
     */
    public java.lang.String primaryAspect(){
        return null; //TODO codavaj!!
    }

}
