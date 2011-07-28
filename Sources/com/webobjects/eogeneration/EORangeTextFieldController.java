
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import javax.swing.JComponent;
import javax.swing.JTextField;


public class EORangeTextFieldController extends EORangeValueController
    implements ActionListener, EOWidgetController.FormatWidget, EOWidgetController.QueryWidget {


    public EORangeTextFieldController() { return null; }

    public EORangeTextFieldController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected boolean disposeIfTransient() { return true; }

    protected boolean preferredUsesLabelComponent() { return true; }

    public void setIsQueryWidget(boolean flag) {}

    public boolean isQueryWidget() { return true; }

    public void setFormatAllowed(boolean flag) {}

    public boolean isFormatAllowed() { return true; }

    public void setFormatClass(Class formatClass) {}

    public Class formatClass() { return null; }

    public void setFormatPattern(String formatPattern) {}

    public String formatPattern() { return null; }

    protected JComponent newWidget() { return null; }

    protected void setAlignmentForWidget(JComponent widget, int alignment) {}

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    protected void startListeningToRangeWidget() {}

    protected void stopListeningToRangeWidget() {}

    protected EODisplayGroup _defaultDisplayGroup() { return null; }

    protected String _minimumAssociationKey() { return null; }

    protected String _maximumAssociationKey() { return null; }

    protected Format formatForMinimumAssociation() { return null; }

    protected Format formatForMaximumAssociation() { return null; }

    protected EOAssociation newMinimumAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    protected EOAssociation newMaximumAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    public void actionPerformed(ActionEvent event) {}

    static  {}

    public static final Class _CLASS;
    private boolean _isQueryWidget;
    private boolean _formatAllowed;
    private Class _formatClass;
    private String _formatPattern;

}
