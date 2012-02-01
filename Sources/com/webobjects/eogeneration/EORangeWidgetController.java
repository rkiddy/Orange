package com.webobjects.eogeneration;
public abstract class EORangeWidgetController extends com.webobjects.eogeneration.EOWidgetController{
    public EORangeWidgetController(){
         //TODO codavaj!!
    }

    public EORangeWidgetController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
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

    public javax.swing.JComponent rangeWidget(){
        return null; //TODO codavaj!!
    }

    public javax.swing.JComponent separatorLabelComponent(){
        return null; //TODO codavaj!!
    }

    public void setRangeWidget(javax.swing.JComponent widget){
        return; //TODO codavaj!!
    }

    public void setSeparatorLabelComponent(javax.swing.JComponent labelComponent){
        return; //TODO codavaj!!
    }

    public void setWidgetAlignment(int alignment){
        return; //TODO codavaj!!
    }

    protected void startListeningToRangeWidget(){
        return; //TODO codavaj!!
    }

    protected void stopListeningToRangeWidget(){
        return; //TODO codavaj!!
    }

}
