package com.webobjects.appserver;
/**
 * WOEvent is a subclass of EOEvent (defined in the EOControl framework) that serves as the parent class for objects that gather information such as duration about various operations in WebObjects. You can see the results of this information gathering in your web browser by accessing a special "event display" page, and you can configure how the results are displayed by accessing a special "event setup" page. Both of these are accessed through special direct actions (WOEventDisplay and WOEventSetup, respectively). For example, if you've been running the CreatePlot example, the following URL will access the event display page
 * Event Group Logged Events WOApplication Event pageWithName WOAssociation Event valueForKeyPath, takeValueForKeyPath WOComponent Event takeValuesFromRequest, invokeAction, appendToResponse, awake, sleep WOComponentReference Event pushComponent
 * See Also:Serialized Form
 */
public class WOEvent extends com.webobjects.eocontrol.EOEvent{
    /**
     * Integer representing an association signature.
     * See Also:WOEvent.signatureOfType(int), Constant Field Values
     */
    public static final int AssociationSignature=3;

    /**
     * Integer representing a WOComponent name signature.
     * See Also:WOEvent.signatureOfType(int), Constant Field Values
     */
    public static final int ComponentSignature=1;

    /**
     * Integer representing a page name signature.
     * See Also:WOEvent.signatureOfType(int), Constant Field Values
     */
    public static final int PageSignature=2;

    public WOEvent(){
         //TODO codavaj!!
    }

    /**
     * Special information on the event. In the default implementation, this method returns the description of the "info" instance variable which is passed at log time. This method can be overridden by subclasses to provide information for the event display.
     */
    public java.lang.String comment(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the event's component name to aComponentName. Event data can be grouped or aggregated according to the component name.
     */
    public void setComponentName(java.lang.String aComponentName){
        return; //TODO codavaj!!
    }

    /**
     * Sets the event's page name to aPageName. Event data can be grouped or aggregated according to the page name.
     */
    public void setPageName(java.lang.String aPageName){
        return; //TODO codavaj!!
    }

    /**
     * The returned signatures are used to group or aggregate data on the WOEventDisplay page. WOEvent is able to generate signatures for the following types:
     * Type Signature EOBasicEventSignature A combination of the event's type and the component name WOComponentSignature The component name WOPageSignature The page name WOAssociationSignature varies based upon the context
     * Override this method if you are creating a custom subclass of WOEvent and need to provide signatures for additional event types.
     */
    public java.lang.String signatureOfType(int aType){
        return null; //TODO codavaj!!
    }

    /**
     * Required for proper functioning of the event logging display.
     */
    public java.lang.String title(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns a String that includes the receiver's title, comment, and duration or start date (whichever is appropriate).
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
