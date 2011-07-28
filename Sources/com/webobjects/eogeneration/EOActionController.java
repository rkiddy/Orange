
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EODataSource;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;


public class EOActionController extends EOTitlesController
    implements ComponentListener {
    protected static class _Action extends EOAction {


        public _Action(EOActionAssociation association, String descriptionPath, String shortDescription, Icon icon, Icon smallIcon) { return null; }

        private boolean _associationButtonIsEnabled() { return true; }

        public boolean actionCanBePerformedInContextOfController(EOController controller) { return true; }

        public void actionPerformed(ActionEvent event) {}

        EOActionAssociation _association;

    }



    public EOActionController() { return null; }

    public EOActionController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected void disposeAssociations() {}

    protected boolean disposeIfTransient() { return true; }

    public boolean canBeTransient() { return true; }

    protected void connectionWasEstablished() {}

    protected void connectionWasBroken() {}

    protected void componentDidBecomeVisible() {}

    public void setUsesButton(boolean flag) {}

    public boolean usesButton() { return true; }

    public void setUsesAction(boolean flag) {}

    public boolean usesAction() { return true; }

    public void setActionKey(String string) {}

    public String actionKey() { return null; }

    public void setButtonPosition(int position) {}

    public int buttonPosition() { return 0; }

    protected String _derivedLabel() { return null; }

    protected int preferredWidgetAutosizingMask() { return 0; }

    protected JComponent newWidget() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    public EODataSource newTitlesDataSource() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    protected NSArray defaultActions() { return null; }

    public void componentHidden(ComponentEvent componentevent) {}

    public void componentMoved(ComponentEvent componentevent) {}

    public void componentResized(ComponentEvent event) {}

    public void componentShown(ComponentEvent componentevent) {}

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    private boolean _usesButton;
    private boolean _usesAction;
    private String _actionKey;
    private int _buttonPosition;
    private JButton _button;
    private EOTable _titlesTable;
    private NSMutableArray _associations;

}
