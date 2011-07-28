
package com.webobjects.eocontrol;

import com.webobjects.foundation.NSSelector;
import com.webobjects.foundation._NSUtilities;


public class EOObserverProxy extends EODelayedObserver {


    public EOObserverProxy(Object target, NSSelector action, int priority) { return null; }

    public int priority() { return 0; }

    public void subjectChanged() {}

    static  {}

    public static final Class _CLASS;
    private final Object _target;
    private final NSSelector _action;
    private final int _priority;

}
