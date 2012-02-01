package com.webobjects.eointerface.swing;
/**
 * EOFormCell objects implement entries in EOForms. An EOFormCell has a field component (an editable EOTextField into which users enter data) and a label (or title) component which is an uneditable text field that identifies the purpose of the form cell's field component.
 * See Also:EOForm, Serialized Form
 */
public class EOFormCell extends javax.swing.JComponent implements com.webobjects.eointerface.swing.EOTextComponentAccess, com.webobjects.foundation.NSDisposable{
    /**
     * Constructs a new EOFormCell.
     */
    public EOFormCell(){
         //TODO codavaj!!
    }

    /**
     * Adds an ActionListener to the receiver's editable text field.
     */
    public void addActionListener(java.awt.event.ActionListener listener){
        return; //TODO codavaj!!
    }

    /**
     * Releases all resources used by this object and ensures that it becomes available for garbage collection. Note that you should not use the object any further after invoking dispose.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the editable text field of the form cell.
     */
    public com.webobjects.eointerface.swing.EOTextField fieldComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Removes an ActionListener from the receiver's editable text field.
     */
    public void removeActionListener(java.awt.event.ActionListener listener){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's label to title.
     */
    public void setTitle(java.lang.String title){
        return; //TODO codavaj!!
    }

    /**
     * Sets the width of the receiver's label component. Typically the width of the label component is handled automatically, you should never need to invoke this method.
     */
    public void setTitleWidth(int width){
        return; //TODO codavaj!!
    }

    /**
     * Returns the editable text field of the form cell as JTextComponent.
     */
    public javax.swing.text.JTextComponent textComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's label.
     */
    public java.lang.String title(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the label component of the form cell.
     */
    public com.webobjects.eointerface.swing.EOTextField titleComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's label component width.
     */
    public int titleWidth(){
        return 0; //TODO codavaj!!
    }

}
