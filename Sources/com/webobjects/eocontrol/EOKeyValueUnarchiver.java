
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class EOKeyValueUnarchiver {
    private static class _EOKeyValueArchivingContainer {


        public _EOKeyValueArchivingContainer(Object object, Object parent, NSDictionary propertyList) { return null; }

        public Object _object() { return null; }

        public Object _parent() { return null; }

        public NSDictionary _propertyList() { return null; }

        Object _object;
        Object _parent;
        NSDictionary _propertyList;

    }

    public static interface Delegate {


        public abstract Object unarchiverObjectForReference(EOKeyValueUnarchiver eokeyvalueunarchiver, Object obj);



        public static final Class _CLASS = null;

    }



    public EOKeyValueUnarchiver(NSDictionary dictionary) { return null; }

    public void setDelegate(Object delegate) {}

    public Object _mthdelegate() { return null; }

    public Object parent() { return null; }

    protected Object _objectForPropertyList(NSDictionary propertyList) { return null; }

    protected NSArray _arrayForPropertyList(NSArray array) { return null; }

    protected NSDictionary _dictionaryForPropertyList(NSDictionary dictionary) { return null; }

    protected Object _findTypeForPropertyListDecoding(Object propertyList) { return null; }

    public Object decodeObjectForKey(String key) { return null; }

    public Object decodeObjectReferenceForKey(String key) { return null; }

    public boolean decodeBoolForKey(String key) { return true; }

    public int decodeIntForKey(String key) { return 0; }

    public void finishInitializationOfObjects() {}

    public void ensureObjectAwake(Object object) {}

    public void awakeObjects() {}

    static  {}

    public static final Class _CLASS = null;
    private static final Class _KeyValueUnarchiverClassArray[];
    protected NSDictionary _propertyList;
    protected Object _parent;
    protected Object _nextParent;
    protected NSMutableArray _allUnarchivedObjects;
    private Delegate _delegate;
    private _NSDelegate _legacyDelegate;
    protected NSMutableSet _awakenedObjects;

}
