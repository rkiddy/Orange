
package com.webobjects.eointerface.swing;

import com.webobjects.eointerface.EOTreeAssociation;
import com.webobjects.eointerface.EOWidgetAssociation;
import com.webobjects.foundation.*;
import java.awt.Component;
import java.text.Format;
import java.util.Enumeration;
import javax.swing.Icon;
import javax.swing.JTree;
import javax.swing.event.*;
import javax.swing.tree.*;

public class EOSwingTreePlugin extends com.webobjects.eointerface.EOTreeAssociation.TreePlugin
    implements TreeWillExpandListener, TreeSelectionListener, com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin.Formatting {
    public class _TreeCellRenderer extends DefaultTreeCellRenderer {


        public _TreeCellRenderer() { return null; }

        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) { return null; }

        public Icon getLeafIcon() { return null; }

        public Icon getClosedIcon() { return null; }

        public Icon getOpenIcon() { return null; }

        private static final long serialVersionUID = 0x87d9c5ecL;
        Object _object;
        final EOSwingTreePlugin this$0;

    }

    public class _TreeNode {


        public _TreeNode(Object object) { return null; }

        public Object object() { return null; }

        public boolean isExpanded() { return true; }

        public void setIsExpanded(boolean value) {}

        public void setIsSelected(boolean value) {}

        public boolean isSelected() { return true; }

        public String previousValue() { return null; }

        public void setObject(Object object) {}

        public String toString() { return null; }

        private Object _object;
        private boolean _isExpanded;
        private boolean _isSelected;
        private String _previousValue;
        final EOSwingTreePlugin this$0;

    }



    public EOSwingTreePlugin(EOWidgetAssociation association, Object widget) { return null; }

    public void establishConnection() {}

    public void breakConnection() {}

    public void setValueFormatter(Object formatter) {}

    public Object valueFormatter() { return null; }

    public void setRootObject(Object root) {}

    public void setRootObjectChildren(NSArray objects) {}

    private void _addChildrenToNode(DefaultMutableTreeNode node, NSArray children, int depth) {}

    public void valueChanged(TreeSelectionEvent event) {}

    public void treeWillExpand(TreeExpansionEvent event) throws ExpandVetoException {}

    public void treeWillCollapse(TreeExpansionEvent event) throws ExpandVetoException {}

    private static Object _objectForSwingTreeNode(DefaultMutableTreeNode node) { return null; }

    static  {}

    public static final Class _CLASS;
    static String _UNSET_VALUE;
    private static boolean _isTreeWillExpandListener;
    private JTree _tree;
    Format _format;

}
