
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;


public class EOKeyValueArchiver {
    public static interface Delegate {


        public abstract Object referenceToEncodeForObject(EOKeyValueArchiver eokeyvaluearchiver, Object obj);



        public static final Class _CLASS = null;

    }



    public EOKeyValueArchiver() { return null; }

    public void setDelegate(Object delegate) {}

    public Object _mthdelegate() { return null; }

    protected void _encodeValueForKey(Object value, String key) {}

    protected void _encodeArrayForKey(NSArray objects, String key) {}

    protected void _encodeDictionaryForKey(NSDictionary dictionary, String key) {}

    public void encodeObject(Object object, String key) {}

    public void encodeReferenceToObject(Object object, String key) {}

    public void encodeBool(boolean value, String key) {}

    public void encodeInt(int value, String key) {}

    public NSDictionary dictionary() { return null; }

    static  {}

    public static final Class _CLASS = null;
    protected NSMutableDictionary _propertyList;
    private Delegate _delegate;
    private _NSDelegate _legacyDelegate;

}
