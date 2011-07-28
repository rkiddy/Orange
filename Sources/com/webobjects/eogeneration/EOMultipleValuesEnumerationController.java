
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;


public class EOMultipleValuesEnumerationController extends EOEnumerationController
    implements ActionListener, ComponentListener, MouseListener, com.webobjects.eoapplication.EOComponentController.EndEditing {


    public EOMultipleValuesEnumerationController() { return null; }

    public EOMultipleValuesEnumerationController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected void disposeAssociations() {}

    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask) {}

    protected void connectionWasEstablished() {}

    protected void connectionWasBroken() {}

    public void setUsesTableLabels(boolean flag) {}

    public boolean usesTableLabels() { return true; }

    protected boolean _preferredCanResizeVertically() { return true; }

    protected int preferredLabelComponentPosition() { return 0; }

    protected int _labelComponentVerticalOffset() { return 0; }

    protected void componentDidBecomeVisible() {}

    public boolean endEditing() { return true; }

    protected void _updateUserInterface() {}

    protected boolean _needsUserInterfaceUpdateNotifications() { return true; }

    protected String _derivedLabel() { return null; }

    public String detailEntityName() { return null; }

    public String titlesEntityName() { return null; }

    public void setDetailRelationshipPath(String string) {}

    public String detailRelationshipPath() { return null; }

    public void addDetailKey(String key) {}

    public void removeDetailKey(String key) {}

    public void setDetailKeys(NSArray keys) {}

    public void setSingleDetailKey(String key) {}

    public NSArray detailKeys() { return null; }

    public void setIndexKey(String string) {}

    public String indexKey() { return null; }

    protected NSArray detailDisplayGroupSortOrderings() { return null; }

    protected int _widthForTable(NSArray keys, boolean trueForDetailTableAndFalseForTitlesTable) { return 0; }

    protected int _heightForTables() { return 0; }

    protected JButton _newButton(String actionName, String unlocalizedTitle, NSMutableArray buttonsArray) { return null; }

    protected NSMutableArray _buttons() { return null; }

    protected JComponent _titlesWidget() { return null; }

    protected JComponent newWidget() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    public EODisplayGroup detailDisplayGroup() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    public void setAllowsRemoveAll(boolean flag) {}

    public boolean allowsRemoveAll() { return true; }

    public void setAllowsDuplicates(boolean flag) {}

    public boolean allowsDuplicates() { return true; }

    public boolean canPerformActionNamed(String actionName) { return true; }

    public boolean canAdd() { return true; }

    protected void _updateDetailIndexes(NSArray objects) {}

    protected void _addWithObjects(NSArray relationshipObjects) {}

    public void add() {}

    public boolean canRemove() { return true; }

    protected void _removeWithSelectedObjects(NSArray selectedObjects) {}

    public void remove() {}

    private boolean _canUpOrDown(boolean trueForUpAndFalseForDown) { return true; }

    private void _move(int direction) {}

    public boolean canUp() { return true; }

    public void up() {}

    public boolean canDown() { return true; }

    public void down() {}

    public void actionPerformed(ActionEvent event) {}

    public void componentHidden(ComponentEvent componentevent) {}

    public void componentMoved(ComponentEvent componentevent) {}

    public void componentResized(ComponentEvent event) {}

    public void componentShown(ComponentEvent componentevent) {}

    public void mouseClicked(MouseEvent event) {}

    public void mouseEntered(MouseEvent mouseevent) {}

    public void mouseExited(MouseEvent mouseevent) {}

    public void mousePressed(MouseEvent mouseevent) {}

    public void mouseReleased(MouseEvent mouseevent) {}

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    private NSMutableArray _detailKeys;
    private String _detailRelationshipPath;
    private String _indexKey;
    protected EOTable _relationshipTable;
    protected EOTable _titlesTable;
    protected JButton _addButton;
    protected JButton _removeButton;
    protected JButton _upButton;
    protected JButton _downButton;
    protected JButton _enabledTestButton;
    private EODisplayGroup _detailDisplayGroup;
    private NSMutableArray _associations;
    private EOActionAssociation _enabledTestAssociation;
    private int _labelComponentVerticalOffset;
    private boolean _usesTableLabels;
    private boolean _allowsRemoveAll;
    private boolean _allowsDuplicates;

}
