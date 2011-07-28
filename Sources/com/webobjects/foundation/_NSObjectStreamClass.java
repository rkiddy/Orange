
package com.webobjects.foundation;

import java.io.*;
import java.lang.reflect.*;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.*;


public abstract class _NSObjectStreamClass
    implements Serializable {


    private _NSObjectStreamClass cloneFor(Class cl) throws InvalidClassException { return null; }

    private void initForPutFields() {}

    protected _NSObjectStreamClass() { return null; }

    protected _NSObjectStreamClass(Class cl) { return null; }

    protected long serialVersionUID(Class cl) { return 0L; }

    public _NSSerialFieldDesc[] serializableFields() { return null; }

    public boolean hasWriteObject() { return true; }

    public Method writeObjectMethod() { return null; }

    public boolean hasWriteReplace() { return true; }

    public Method writeReplaceMethod() { return null; }

    public _NSObjectStreamClass[] classHierarchy() throws InvalidClassException { return null; }

    public int numPrimFields() { return 0; }

    public int numObjFields() { return 0; }

    public int primFieldPosition(String fieldName) { return 0; }

    public int objFieldPosition(String fieldName) { return 0; }

    public boolean isProxy() { return true; }

    public _NSObjectStreamClass superDesc() { return null; }

    public Class forClass() { return null; }

    public String getName() { return null; }

    public long getSerialVersionUID() { return 0L; }

    public static _NSObjectStreamClass lookup(Class cl) { return null; }

    public String toString() { return null; }

    static  {}

    private static _NSSerialClassReflector.Factory _reflFactory;
    private static WeakHashMap _cachedDescs;
    public static final ObjectStreamField NO_FIELDS[];
    protected static Constructor objectStreamClassCtor;
    protected Class clazz;
    protected String name;
    protected long uid;
    protected boolean serializable;
    protected boolean externalizable;
    protected boolean isProxy;
    protected _NSObjectStreamClass superDesc;
    protected _NSSerialClassReflector reflector;
    protected _NSSerialFieldDesc fieldDescs[];
    protected Method methodsForSerialization[];
    protected int numPrimFields;
    protected int numObjFields;
    protected _NSMutableIntegerDictionary primFieldPos;
    protected _NSMutableIntegerDictionary objFieldPos;
    protected _NSObjectStreamClass hierarchy[];


    // Unreferenced inner class com/webobjects/foundation/_NSObjectStreamClass$1

/* anonymous class */
    static class _cls1
        implements PrivilegedAction {

        _cls1() { return null; }

        public Object run() { return null; }
    }

}
