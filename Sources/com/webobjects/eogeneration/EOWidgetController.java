
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.awt.Dimension;
import javax.swing.JComponent;

public abstract class EOWidgetController extends EOComponentController {
    public static interface DefaultAction {
        public static interface CommonWidgetHandler {

            public abstract boolean canTakeResposibilityForDefaultActionWithActionWidget(JComponent jcomponent);

            public abstract void takeResposibilityForDefaultActionWithActionWidget(JComponent jcomponent);
        }



        public abstract void defaultAction();



        public static final Class _CLASS = null;

    }

    public static interface TableWidget {


        public abstract EOTable table();

        public abstract void setAllowsMultipleSelection(boolean flag);

        public abstract boolean allowsMultipleSelection();



        public static final Class _CLASS = null;

    }

    public static interface QueryWidget {


        public abstract void setIsQueryWidget(boolean flag);

        public abstract boolean isQueryWidget();



        public static final Class _CLASS = null;

    }

    public static interface FormatWidget {


        public abstract void setFormatAllowed(boolean flag);

        public abstract boolean isFormatAllowed();

        public abstract void setFormatClass(Class class1);

        public abstract Class formatClass();

        public abstract void setFormatPattern(String s);

        public abstract String formatPattern();



        public static final Class _CLASS = null;

    }



    public EOWidgetController() { return null; }

    public EOWidgetController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void dispose() {}

    protected DefaultAction _defaultActionTarget() { return null; }

    protected JComponent toolTipComponent() { return null; }

    protected int preferredLabelComponentPosition() { return 0; }

    protected boolean preferredUsesLabelComponent() { return true; }

    protected JComponent newLabelComponent(String label, int minimumWidth, boolean appendColon, int alignment, boolean highlightLabel) { return null; }

    protected int preferredWidgetAutosizingMask() { return 0; }

    protected int _labelComponentVerticalOffset() { return 0; }

    protected void _addLabelComponentToComponent(JComponent labelComponent, JComponent component, int x, int widgetHeight, boolean isSeparator) {}

    protected String _labelComponentString() { return null; }

    protected void generateComponent() {}

    public void setLabelComponentPosition(int position) {}

    public int labelComponentPosition() { return 0; }

    public void setWidgetAlignment(int alignment) {}

    public int widgetAlignment() { return 0; }

    public void setLabelComponentAlignment(int alignment) {}

    public int labelComponentAlignment() { return 0; }

    public void setUsesLabelComponent(boolean flag) {}

    public boolean usesLabelComponent() { return true; }

    public void setHighlightsLabel(boolean flag) {}

    public boolean highlightsLabel() { return true; }

    public void setLabelComponentWidth(int labelComponentWidth) {}

    public int labelComponentWidth() { return 0; }

    public void setMinimumWidgetSize(Dimension size) {}

    public Dimension minimumWidgetSize() { return null; }

    protected abstract JComponent newWidget();

    protected void setAlignmentForWidget(JComponent jcomponent, int i) {}

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    public void setWidget(JComponent widget) {}

    public JComponent widget() { return null; }

    public void setLabelComponent(JComponent labelComponent) {}

    public JComponent labelComponent() { return null; }

    static  {}

    public static final Class _CLASS = null;
    private JComponent _widget;
    private JComponent _labelComponent;
    private int _labelComponentPosition;
    private int _widgetAlignment;
    private int _labelComponentAlignment;
    private boolean _usesLabelComponent;
    private boolean _highlightsLabel;
    private int _labelComponentWidth;
    private Dimension _minimumWidgetSize;

}
