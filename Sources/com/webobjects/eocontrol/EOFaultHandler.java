
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;


public abstract class EOFaultHandler {


    public EOFaultHandler() { return null; }

    public static boolean isFault(Object object) { return null; }

    static boolean isFault(EOFaulting object) { return true; }

    public static String eoShallowDescription(Object object) { return null; }

    public abstract void completeInitializationOfObject(Object obj);

    public Object createFaultForDeferredFault(Object fault, EOEnterpriseObject sourceEO) { return null; }

    public String descriptionForObject(Object object) { return null; }

    public static void makeObjectIntoFault(Object object, EOFaultHandler handler) { return null; }

    public static EOFaultHandler handlerForFault(Object object) { return null; }

    public static void clearFault(Object object) { return null; }

    public abstract void faultWillFire(Object obj);

    static void makeObjectIntoFault(EOFaulting object, EOFaultHandler handler) {}

    static EOFaultHandler handlerForFault(EOFaulting object) { return null; }

    static void clearFault(EOFaulting object) {}

    public Class targetClass() { return null; }

    public String toString() { return null; }

    public NSArray _immutableCloneForArray(NSArray array) { return null; }

    public NSMutableArray _mutableCloneForArray(NSArray array) { return null; }

    protected void _lockResources(EOEditingContext ec) {}

    protected void _unlockResources(EOEditingContext ec) {}

    static  {}

    public static final Class _CLASS;
    protected transient Class _targetClass;

}
