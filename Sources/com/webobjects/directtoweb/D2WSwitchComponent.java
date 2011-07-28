
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.eoaccess.EOModelGroup;
import com.webobjects.foundation.*;
import java.util.Enumeration;
import java.util.Vector;


public class D2WSwitchComponent extends WOComponent {


    public D2WSwitchComponent(WOContext aContext) { return null; }

    public void awake() {}

    public boolean synchronizesVariablesWithBindings() { return true; }

    public String task() { return null; }

    public String entityName() { return null; }

    public NSDictionary settings() { return null; }

    public String lookFromSettings() { return null; }

    public D2WContext subContext() { return null; }

    public void setSubContext(Object obj) {}

    public String componentName() { return null; }

    public static void addToPossibleBindings(String newBinding) { return null; }

    public NSDictionary extraBindings() { return null; }

    public void setExtraBindings(Object newValue) {}

    private WOAssociation associationWithName(String name) { return null; }

    public void sleep() {}

    static  {}

    private static final long serialVersionUID = 0xd4aa79e4L;
    private static Class D2WComponentClass;
    private String _task;
    private String _entityName;
    private NSDictionary _settings;
    private D2WContext _context;
    private NSMutableDictionary __extraBindings;
    private static final String _possibleBindings[];
    protected static Vector possibleBindings;

}
