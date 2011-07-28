
package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication.EOUserInterfaceParameters;
import com.webobjects.eoapplication._EOWidgetUtilities;
import com.webobjects.eogeneration.EOWidgetController;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class _EOEditorStringAddition extends EOWidgetController
    implements ActionListener {
    public static interface AdditionListener {


        public abstract void stringAdded(_EOEditorStringAddition _peoeditorstringaddition, String s);



        public static final Class _CLASS = null;

    }



    public _EOEditorStringAddition(String label) { return null; }

    protected JComponent newWidget() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    public String string() { return null; }

    public void actionPerformed(ActionEvent event) {}

    static  {}

    public static final Class _CLASS = null;
    JTextField _textField;
    JButton _button;

}
