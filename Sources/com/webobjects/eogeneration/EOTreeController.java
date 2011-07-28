
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.EOSwingTreePlugin;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import java.util.Enumeration;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;


public class EOTreeController extends EODefaultActionTrigger
    implements TreeSelectionListener {
    public static class _SelectionUtilities extends JTree {

        public _SelectionUtilities() { return null; }

        public static JTree treeView(JScrollPane scrollPane) { return null; }

        public static boolean isEmpty(TreeSelectionModel treeSelectionModel) { return null; }

        public static Object objectWithPath(TreePath path) { return null; }

        public static NSArray objectsWithPaths(TreePath paths[]) { return null; }

        public static NSArray objectPathForPath(TreePath path) { return null; }

        public static NSArray objectPathsForPaths(TreePath paths[]) { return null; }

        protected static Object userObject(Object lastComponent) { return null; }

        public static TreePath pathForNumericPath(JTree tree, NSArray numericPath) { return null; }

        public static TreePath[] pathsForNumericPaths(JTree tree, NSArray numericPaths) { return null; }

        public static TreePath pathForObjectPath(JTree tree, NSArray objectPath) { return null; }

        public static TreePath[] pathsForObjectPaths(JTree tree, NSArray objectPaths) { return null; }

        public static TreePath pathForObject(JTree tree, Object object) { return null; }

        public static TreePath[] pathsForObjects(JTree tree, NSArray objects) { return null; }

        public static TreePath pathForObjectWithParentKey(JTree tree, Object object, String parentKey) { return null; }

        public static TreePath[] pathsForObjectsWithParentKey(JTree tree, NSArray objects, String parentKey) { return null; }

        protected static int length(Object objects[]) { return null; }

        protected static boolean isEmpty(NSArray a) { return null; }

        protected static TreePath[] emptyPaths(JTree tree, NSArray objects) { return null; }

        protected static NSArray reverse(NSArray a) { return null; }
    }



    public EOTreeController() { return null; }

    public EOTreeController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    private static Boolean _booleanObject(boolean b) { return null; }

    private static boolean _isEmpty(String s) { return null; }

    protected int _labelComponentVerticalOffset() { return 0; }

    protected int preferredLabelComponentPosition() { return 0; }

    protected boolean preferredUsesLabelComponent() { return true; }

    protected int preferredWidgetAutosizingMask() { return 0; }

    protected boolean _preferredCanResizeVertically() { return true; }

    protected String _derivedLabel() { return null; }

    public void setChildrenKey(String string) {}

    public String childrenKey() { return null; }

    public void setParentKey(String string) {}

    public String parentKey() { return null; }

    public void setIsLeafKey(String string) {}

    public String isLeafKey() { return null; }

    public void setRootKey(String string) {}

    public String rootKey() { return null; }

    public void setValueKey(String string) {}

    public String valueKey() { return null; }

    public void setIconKey(String string) {}

    public String iconKey() { return null; }

    public void setExpandedIconKey(String string) {}

    public String expandedIconKey() { return null; }

    public void setRootVisible(boolean flag) {}

    public boolean isRootVisible() { return true; }

    public void setAllowsMultipleSelection(boolean flag) {}

    public boolean allowsMultipleSelection() { return true; }

    public void setAllowsDiscontiguousSelection(boolean flag) {}

    public boolean allowsDiscontiguousSelection() { return true; }

    protected void _setSelectionModel() {}

    public NSArray selectedObjects() { return null; }

    public NSArray selectedObjectPaths() { return null; }

    public void setSelectedObjectWithNumericPath(NSArray newSelectedNumericPath) {}

    public void setSelectedObjectsWithNumericPaths(NSArray newSelectedNumericPaths) {}

    public void setSelectedObjectWithObjectPath(NSArray newSelectedObjectPath) {}

    public void setSelectedObjectsWithObjectPaths(NSArray newSelectedObjectPaths) {}

    public void setSelectedObject(Object newSelectedObject) {}

    public void setSelectedObjects(NSArray newSelectedObjects) {}

    public void setSelectedObjectWithParentKey(Object newSelectedObject) {}

    public void setSelectedObjectsWithParentKey(NSArray newSelectedObjects) {}

    protected void selectionDidChange(NSArray nsarray, NSArray nsarray1) {}

    protected JComponent newWidget() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    public JTree tree() { return null; }

    protected JComponent mouseListenerViewInWidget() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    public void valueChanged(TreeSelectionEvent event) {}

    static  {}

    public static final Class _CLASS;
    private JTree _tree;
    private String _childrenKey;
    private String _isLeafKey;
    private String _rootKey;
    private String _valueKey;
    private String _iconKey;
    private String _expandedIconKey;
    private String _parentKey;
    private boolean _isRootVisible;
    private boolean _allowsMultipleSelection;
    private boolean _allowsDiscontiguousSelection;

}
