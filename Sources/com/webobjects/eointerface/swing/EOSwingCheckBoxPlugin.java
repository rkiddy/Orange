
package com.webobjects.eointerface.swing;

import com.webobjects.eointerface.EOValueAssociation;
import com.webobjects.eointerface.EOWidgetAssociation;
import com.webobjects.foundation._NSUtilities;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;


public class EOSwingCheckBoxPlugin extends com.webobjects.eointerface.EOValueAssociation.ValuePlugin
    implements ItemListener {


    public EOSwingCheckBoxPlugin(EOWidgetAssociation association, Object widget) { return null; }

    public void establishConnection() {}

    public void breakConnection() {}

    public String[] widgetKeysTaken() { return null; }

    public void setValue(Object value, boolean isEnabled) {}

    public Object value() { return null; }

    public void itemStateChanged(ItemEvent event) {}

    static  {}

    public static final Class _CLASS;
    private boolean _ignoreChanges;

}
