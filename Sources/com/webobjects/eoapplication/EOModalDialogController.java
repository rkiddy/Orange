
package com.webobjects.eoapplication;

import com.webobjects.foundation._NSUtilities;
import java.awt.Container;
import java.awt.Window;
import javax.swing.*;


public class EOModalDialogController extends EODialogController
    implements EOComponentController.Modal {
    public static interface ModalActions {


        public abstract boolean ok();

        public abstract void cancel();

        public abstract boolean modalDialogShouldClose();



        public static final Class _CLASS = null;

    }



    public static void runControllerInNewModalDialog(EOComponentController controller, String windowTitle) { return null; }

    public EOModalDialogController() { return null; }

    public EOModalDialogController(EOXMLUnarchiver unarchiver) { return null; }

    public boolean isModal() { return true; }

    public void finishModal() {}

    protected Window newWindow(JComponent component) { return null; }

    public void activateWindow() {}

    public boolean closeWindow() { return true; }

    static  {}

    public static final Class _CLASS = null;

}
