package com.webobjects.eoapplication;
public abstract class EOActionWidgetController extends com.webobjects.eoapplication.EOComponentController implements com.webobjects.eoapplication.EOComponentController.ActionCollector{
    public EOActionWidgetController(){
         //TODO codavaj!!
    }

    /**
     * Parameters:unarchiver -
     */
    public EOActionWidgetController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public javax.swing.JComponent actionWidgetContainer(){
        return null; //TODO codavaj!!
    }

    public int actionWidgetPosition(){
        return 0; //TODO codavaj!!
    }

    public abstract com.webobjects.foundation.NSArray actionWidgets();

    public com.webobjects.foundation.NSArray collectedActions(){
        return null; //TODO codavaj!!
    }

    protected void componentDidBecomeVisible(){
        return; //TODO codavaj!!
    }

    protected abstract void createWidgetsForActionsAndPlaceInContainers(com.webobjects.foundation.NSArray actions, com.webobjects.foundation.NSArray secondaryActions, javax.swing.JComponent container, javax.swing.JComponent secondaryContainer, int widgetPosition);

    public void dispose(){
        return; //TODO codavaj!!
    }

    protected abstract void disposeActionWidgets();

    protected void generateComponent(){
        return; //TODO codavaj!!
    }

    public void resetActions(){
        return; //TODO codavaj!!
    }

    public javax.swing.JComponent secondaryActionWidgetContainer(){
        return null; //TODO codavaj!!
    }

    public void setActionWidgetContainer(javax.swing.JComponent component){
        return; //TODO codavaj!!
    }

    public void setActionWidgetPosition(int position){
        return; //TODO codavaj!!
    }

    public void setSecondaryActionWidgetContainer(javax.swing.JComponent component){
        return; //TODO codavaj!!
    }

    public void subcontrollerActionsDidChange(com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    public void subcontrollerConnectionDidChange(com.webobjects.eoapplication.EOController controller){
        return; //TODO codavaj!!
    }

    protected boolean supportsSecondaryActionWidget(){
        return false; //TODO codavaj!!
    }

    protected abstract void updateActionWidgetEnabling();

}
