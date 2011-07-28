
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.EOXMLUnarchiver;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation._NSUtilities;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;


public abstract class EODefaultActionTrigger extends EOAssociationController
    implements MouseListener {


    public EODefaultActionTrigger() { return null; }

    public EODefaultActionTrigger(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void setInvokesDefaultAction(boolean flag) {}

    public boolean invokesDefaultAction() { return true; }

    protected JComponent mouseListenerViewInWidget() { return null; }

    protected void startListeningToWidget() {}

    protected void stopListeningToWidget() {}

    public void triggerDefaultAction() {}

    public void mouseClicked(MouseEvent event) {}

    public void mouseEntered(MouseEvent mouseevent) {}

    public void mouseExited(MouseEvent mouseevent) {}

    public void mousePressed(MouseEvent mouseevent) {}

    public void mouseReleased(MouseEvent mouseevent) {}

    static  {}

    public static final Class _CLASS;
    private boolean _invokesDefaultAction;

}
