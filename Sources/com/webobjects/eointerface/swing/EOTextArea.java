package com.webobjects.eointerface.swing;
/**
 * The EOTextArea class is used to represent large text in a scrollable area. An EOTextArea is a JScrollPane with a JTextArea inside, using a vertical scrollbar to make the whole text visible. If you want to configure or message an EOTextArea's JTextArea directly, you can access it with the textArea method.
 * See Also:EOTextArea.textArea(), Serialized Form
 */
public class EOTextArea extends javax.swing.JScrollPane implements com.webobjects.eointerface.swing.EOTextComponentAccess{
    /**
     * Constructs a new EOTextArea which is configured to always use a vertical scroll bar and no a horizontal scrollbar.
     */
    public EOTextArea(){
         //TODO codavaj!!
    }

    /**
     * Sets the editablity flag of the text area.
     */
    public void setEditable(boolean editable){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the text area is opaque.
     */
    public void setOpaque(boolean opaque){
        return; //TODO codavaj!!
    }

    /**
     * Sets the size of the text area.
     */
    public void setSize(java.awt.Dimension dimension){
        return; //TODO codavaj!!
    }

    /**
     * Sets the size of the text area.
     */
    public void setSize(int width, int height){
        return; //TODO codavaj!!
    }

    /**
     * Sets the text displayed in the text area.
     */
    public void setText(java.lang.String text){
        return; //TODO codavaj!!
    }

    /**
     * Returns the JTextArea used by the EOTextArea.
     */
    public javax.swing.JTextArea textArea(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the text area of the receiver as JTextComponent.
     */
    public javax.swing.text.JTextComponent textComponent(){
        return null; //TODO codavaj!!
    }

}
