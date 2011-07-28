
package com.webobjects.eointerface.swing;

import com.webobjects.foundation.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;


public class EOControlActionAdapter
    implements ActionListener, NSDisposable {


    public EOControlActionAdapter(Object target, String actionName, Object listenee) { return null; }

    public EOControlActionAdapter(String actionName, Object listenee) { return null; }

    public void dispose() {}

    public void setTarget(Object target) {}

    public void actionPerformed(ActionEvent event) {}

    static  {}

    public static final Class _CLASS;
    private Object _target;
    private Object _listenee;
    private String _actionName;
    private Method _actionMethod;

}
