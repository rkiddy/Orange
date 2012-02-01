package com.webobjects.eointerface;
/**
 * EOActionWidgetAssociation is an abstract superclass for associations that invoke methods on objects in response to an action in a user interface widget
 */
public abstract class EOActionWidgetAssociation extends com.webobjects.eointerface.EOWidgetAssociation{
    /**
     * Subclasses should override this contructor to do any custom instance initialization and invoke super's implementation.
     * Parameters:aDisplayObject - display object for this association to manage
     */
    public EOActionWidgetAssociation(java.lang.Object aDisplayObject){
         //TODO codavaj!!
    }

    /**
     * Evaluates whether the state of the association's display groups should allow the association to be enabled. If false, calls to isEnabled for the association will return false. Subclasses can override this method to alter the behavior of isEnabled.
     */
    protected boolean displayGroupSelectionsAllowEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Tells the action widget association to perform it's action. Subclasses override this method to provide custom actions, such as EOActionInsertion's insertion action.
     */
    public abstract void invokeAction();

    /**
     * If true, this association is enabled. If false, this association's invokeAction method has no effect.
     */
    protected boolean isEnabled(){
        return false; //TODO codavaj!!
    }

    /**
     * If true, this association is enabled for the object at index index in the display group's displayed objects array. If false, this association's invokeAction method has no effect.
     */
    protected boolean isEnabledAtIndex(int index){
        return false; //TODO codavaj!!
    }

    /**
     * See the subjectChanged method description in the superclass EOAssociation.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

    /**
     * Specifies the widget plugin class this association can work wth. Subclasses should override this method to return the Class object for the plugin the association should be allowed to establish a connection to.
     */
    protected java.lang.Class widgetPluginClass(){
        return null; //TODO codavaj!!
    }

    /**
     * ActionPlugin is an abstract superclass for plugins that provide a layer of abstraction between user interface widgets and EOActionWidgetAssociation subclasses. When a user interface element (like a button) connected to an EOActionWidgetAssociation subclass is manipulated (pressed), the plugin calls the invokeAction method of its association.
     */
    public static abstract class ActionPlugin extends com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin{
        /**
         * Subclasses should override this constructor to perform any additional setup and then invoke super's implementation.
         * Parameters:association - EOActionWidgetAssociation that the plugin will communicate withwidget - the UI widget that the plugin will communicate with
         */
        public ActionPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
             //TODO codavaj!!
        }

        /**
         * Set whether or not the user should be able to manipulate the association's User Interface widget.
         */
        public abstract void setEnabled(boolean flag);

    }
}
