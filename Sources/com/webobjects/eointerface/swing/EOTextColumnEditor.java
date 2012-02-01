package com.webobjects.eointerface.swing;
/**
 * EOTextColumnEditor is an concrete subclass of EOColumnEditor that handles text cell editing for javax.swing.JTables.
 * See Also:EOColumnEditor
 */
public class EOTextColumnEditor extends com.webobjects.eointerface.swing.EOColumnEditor implements java.awt.event.ActionListener, javax.swing.event.DocumentListener, java.awt.event.FocusListener{
    /**
     * Constructs a new EOTextColumnEditor.
     */
    public EOTextColumnEditor(){
         //TODO codavaj!!
    }

    /**
     * Invoked when the user leaves the edited text cell. Invokes EOColumnEditor.stopCellEditing.
     */
    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Prepares the editor component for use in a table, by adding the appropriate listeners and setting the right fonts.
     */
    protected void beginEditing(){
        return; //TODO codavaj!!
    }

    /**
     * Conformance to DocumentListener API.
     */
    public void changedUpdate(javax.swing.event.DocumentEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Returns a new editor component, a javax.swing.JTextField with a black javax.swing.border.LineBorder.
     */
    protected java.awt.Component createEditorComponent(){
        return null; //TODO codavaj!!
    }

    /**
     * Cleans out resources after editing has finished, for example removes listeners from the editor component.
     */
    protected void endEditing(){
        return; //TODO codavaj!!
    }

    /**
     * Invoked when the edited text cell gains focus.
     */
    public void focusGained(java.awt.event.FocusEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Invoked when the edited text cell looses focus. Invokes EOColumnEditor.stopCellEditing.
     */
    public void focusLost(java.awt.event.FocusEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Returns the value of the text field editor component (the text displayed in the editor cell).
     */
    public java.lang.Object getCellEditorValue(){
        return null; //TODO codavaj!!
    }

    /**
     * Conformance to DocumentListener API.
     */
    public void insertUpdate(javax.swing.event.DocumentEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the event event can start editing in the editor component. For EOTextColumnEditors, editing can start if event is not a mouse event or if the click count is less than 2.
     */
    public boolean isCellEditable(java.util.EventObject event){
        return false; //TODO codavaj!!
    }

    /**
     * Conforming to DocumentListener API.
     */
    public void removeUpdate(javax.swing.event.DocumentEvent event){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value of the text field editor component (the text displayed in the editor cell).
     */
    public void setCellEditorValue(java.lang.Object value){
        return; //TODO codavaj!!
    }

}
