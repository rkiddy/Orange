
package com.webobjects.eointerface.swing;

import com.webobjects.eointerface.*;
import com.webobjects.foundation.*;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.UnsupportedEncodingException;
import java.text.Format;
import java.text.ParseException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;


public class EOSwingTextPlugin extends com.webobjects.eointerface.EOTextAssociation.TextPlugin
    implements FocusListener, DocumentListener, com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin.Formatting {


    public EOSwingTextPlugin(EOWidgetAssociation association, Object widget) { return null; }

    public void establishConnection() {}

    public void breakConnection() {}

    public String[] widgetKeysTaken() { return null; }

    public void setValue(Object value, boolean isEnabled) {}

    public Object value() { return null; }

    public boolean endEditing() { return true; }

    public void setColors(Object textColor, Object bgColor) {}

    public void setFontProperties(int i, int j) {}

    public void setValueFormatter(Object formatter) {}

    public Object valueFormatter() { return null; }

    public void focusGained(FocusEvent event) {}

    public void focusLost(FocusEvent event) {}

    private void _documentEventReceived() {}

    public void changedUpdate(DocumentEvent event) {}

    public void insertUpdate(DocumentEvent event) {}

    public void removeUpdate(DocumentEvent event) {}

    static  {}

    public static final Class _CLASS;
    private JTextComponent _textComponent;
    private boolean _hasFocus;
    private boolean _textHasChangedSinceFocusGain;
    private boolean _ignoreChanges;
    private Format _format;
    private Object _value;
    private String _stringValue;
    private boolean _processingFocusLost;

}
