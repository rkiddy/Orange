package com.webobjects.eogeneration;
public class EORangeTextFieldController extends com.webobjects.eogeneration.EORangeValueController implements java.awt.event.ActionListener, com.webobjects.eogeneration.EOWidgetController.FormatWidget, com.webobjects.eogeneration.EOWidgetController.QueryWidget{
    public EORangeTextFieldController(){
         //TODO codavaj!!
    }

    public EORangeTextFieldController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Disposes the receiver if it's transient, first removing it from its supercontroller with removeTransientSubcontroller If the receiver's supercontroller is non-null, this method also attempts to dispose of the supercontroller if it's transient. Supercontrollers can prevent a controller from becoming transient, in which case this method returns false. Subclasses should first invoke the super implementation and only continue disposing if the super implementation returns true.
     */
    protected boolean disposeIfTransient(){
        return false; //TODO codavaj!!
    }

    public java.lang.Class formatClass(){
        return null; //TODO codavaj!!
    }

    protected java.text.Format formatForMaximumAssociation(){
        return null; //TODO codavaj!!
    }

    protected java.text.Format formatForMinimumAssociation(){
        return null; //TODO codavaj!!
    }

    public java.lang.String formatPattern(){
        return null; //TODO codavaj!!
    }

    public boolean isFormatAllowed(){
        return false; //TODO codavaj!!
    }

    public boolean isQueryWidget(){
        return false; //TODO codavaj!!
    }

    protected com.webobjects.eointerface.EOAssociation newMaximumAssociation(javax.swing.JComponent widget, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String enabledKey, com.webobjects.eointerface.EODisplayGroup enabledDisplayGroup){
        return null; //TODO codavaj!!
    }

    protected com.webobjects.eointerface.EOAssociation newMinimumAssociation(javax.swing.JComponent widget, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String enabledKey, com.webobjects.eointerface.EODisplayGroup enabledDisplayGroup){
        return null; //TODO codavaj!!
    }

    protected javax.swing.JComponent newWidget(){
        return null; //TODO codavaj!!
    }

    protected boolean preferredUsesLabelComponent(){
        return false; //TODO codavaj!!
    }

    protected void setAlignmentForWidget(javax.swing.JComponent widget, int alignment){
        return; //TODO codavaj!!
    }

    public void setFormatAllowed(boolean flag){
        return; //TODO codavaj!!
    }

    public void setFormatClass(java.lang.Class formatClass){
        return; //TODO codavaj!!
    }

    public void setFormatPattern(java.lang.String formatPattern){
        return; //TODO codavaj!!
    }

    public void setIsQueryWidget(boolean flag){
        return; //TODO codavaj!!
    }

    protected void startListeningToRangeWidget(){
        return; //TODO codavaj!!
    }

    protected void startListeningToWidget(){
        return; //TODO codavaj!!
    }

    protected void stopListeningToRangeWidget(){
        return; //TODO codavaj!!
    }

    protected void stopListeningToWidget(){
        return; //TODO codavaj!!
    }

}
