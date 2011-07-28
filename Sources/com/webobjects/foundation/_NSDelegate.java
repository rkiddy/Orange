
package com.webobjects.foundation;

import java.io.*;
import java.lang.reflect.Method;


public class _NSDelegate
    implements Serializable {


    public _NSDelegate(Class delegateInterface) { return null; }

    public _NSDelegate(Class delegateInterface, Object delegate) { return null; }

    public void setDelegate(Object delegate) {}

    public Object _mthdelegate() { return null; }

    public boolean delegateConformsToInterface() { return true; }

    private synchronized void _setupForDelegate(Object delegate) { return null; }

    private Method _cachedMethodForName(String methodName) { return null; }

    private static Method _delegateMethodForInterfaceMethod(String name, Method method, Class delegateClass) { return null; }

    public boolean respondsTo(String methodName) { return true; }

    public Object perform(String methodName) { return null; }

    public Object perform(String methodName, Object arg) { return null; }

    public Object perform(String methodName, Object arg1, Object arg2) { return null; }

    public Object perform(String methodName, Object arg1, Object arg2, Object arg3) { return null; }

    public Object perform(String methodName, Object args[]) { return null; }

    public boolean booleanPerform(String methodName) { return true; }

    public boolean booleanPerform(String methodName, Object arg) { return true; }

    public boolean booleanPerform(String methodName, Object arg1, Object arg2) { return true; }

    public boolean booleanPerform(String methodName, Object arg1, Object arg2, Object arg3) { return true; }

    public boolean booleanPerform(String methodName, Object args[]) { return true; }

    public String toString() { return null; }

    private Object _perform(String methodName, Object args[]) { return null; }

    private void writeObject(ObjectOutputStream out) throws IOException {}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    private static final Object MethodNotFoundMarker;
    static final long serialVersionUID = 0x3300d5b3L;
    private static final String InterfaceFieldKey = "interface";
    private static final String DelegateFieldKey = "delegate";
    private static final ObjectStreamField serialPersistentFields[];
    private volatile Class _interface;
    private volatile Object _delegate;
    private volatile transient boolean _delegateConformsToInterface;
    private volatile transient NSMutableDictionary _methodsByName;
    private transient String _lastMethodName;
    private transient Method _lastMethod;
    private transient Method _interfaceMethods[];

}
