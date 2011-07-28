
package com.webobjects.foundation;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.*;
import java.util.*;


public class _NSSerialClassReflector {
    public static final class Factory {


        Factory() { return null; }

        public _NSSerialClassReflector classReflector(Class cl) { return null; }

        static  {}

        private static WeakHashMap _cachedReflectors;

    }



    static _NSSerialClassReflector createClassReflector(Class cl) { return null; }

    _NSSerialClassReflector() { return null; }

    void init(Class cl) { return null; }

    private _NSSerialFieldDesc[] serialPersistentFields() { return null; }

    private _NSSerialFieldDesc[] defaultSerialFields() { return null; }

    private Method privateMethod(String name, Class argTypes[], Class returnType) { return null; }

    private Method inheritableMethod(String name, Class argTypes[], Class returnType) { return null; }

    public static Factory factory() { return null; }

    public _NSSerialFieldDesc[] serializableFields() { return null; }

    public Method[] methodsForSerialization() { return null; }

    static  {}

    private static final Permission XMLSerializationAccessPermission;
    private static final Factory _factory;
    private Class _cl;
    private boolean _s_zable;
    private boolean _e_zable;
    private _NSSerialFieldDesc _fieldDescs[];
    private Method _methodsForSerialization[];
    static final int WRITE_OBJECT = 0;
    static final int READ_OBJECT = 1;
    static final int WRITE_REPLACE = 2;
    static final int READ_RESOLVE = 3;
    private final int NUM_MTDS = 4;


    // Unreferenced inner class com/webobjects/foundation/_NSSerialClassReflector$1

/* anonymous class */
    static class _cls1
        implements PrivilegedAction {


        _cls1() { return null; }

        public Object run() { return null; }

        final Class val$cl;

    }


    // Unreferenced inner class com/webobjects/foundation/_NSSerialClassReflector$2

/* anonymous class */
    class _cls2
        implements Comparator {


        _cls2() { return null; }

        public int compare(Object o1, Object o2) { return 0; }

        final _NSSerialClassReflector this$0;

    }

}
