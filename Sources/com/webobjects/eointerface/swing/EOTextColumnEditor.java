
package com.webobjects.eointerface.swing;

import com.webobjects.eointerface.EOTableColumnAssociation;
import com.webobjects.foundation._NSUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
import java.util.EventObject;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


public class EOTextColumnEditor extends EOColumnEditor
    implements ActionListener, DocumentListener, FocusListener {


    public EOTextColumnEditor() { return null; }

    public void actionPerformed(ActionEvent event) {}

    public void focusGained(FocusEvent event) {}

    public void focusLost(FocusEvent event) {}

    private void _documentEventReceived() {}

    public void changedUpdate(DocumentEvent event) {}

    public void insertUpdate(DocumentEvent event) {}

    public void removeUpdate(DocumentEvent event) {}

    protected Component createEditorComponent() { return null; }

    public void setCellEditorValue(Object value) {}

    public Object getCellEditorValue() { return null; }

    public boolean isCellEditable(EventObject event) { return true; }

    protected void beginEditing() {}

    protected void endEditing() {}

    static  {}

    public static final Class _CLASS;
    private boolean _hasFocus;
    private boolean _textHasChangedSinceFocusGain;
    private boolean _processingFocusLost;

}
