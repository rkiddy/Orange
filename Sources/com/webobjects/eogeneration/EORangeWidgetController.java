
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import javax.swing.JComponent;


public abstract class EORangeWidgetController extends EOWidgetController {


    public EORangeWidgetController() { return null; }

    public EORangeWidgetController(EOXMLUnarchiver unarchiver) { return null; }

    public void dispose() {}

    protected void generateComponent() {}

    public void setWidgetAlignment(int alignment) {}

    protected void startListeningToRangeWidget() {}

    protected void stopListeningToRangeWidget() {}

    public void setRangeWidget(JComponent widget) {}

    public JComponent rangeWidget() { return null; }

    public void setSeparatorLabelComponent(JComponent labelComponent) {}

    public JComponent separatorLabelComponent() { return null; }

    static  {}

    public static final Class _CLASS;
    private JComponent _rangeWidget;
    private JComponent _separatorLabelComponent;

}
