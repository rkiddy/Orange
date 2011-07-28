
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;

public interface EOKeyValueCoding
    extends NSKeyValueCoding, com.webobjects.foundation.NSKeyValueCoding.ErrorHandling {
    public static class _BestBindingCreation {
        public static interface _ForwardingBindingCheck {

            public abstract boolean _forwardingBindingNeededForClass(Class class1, String s, Class aclass[]);
        }



        public static void _flushCaches() { return null; }

        public static boolean _isMethodOverriddenInSubclass(Class rootClassForImplementation, Class objectClass, String methodName, Class methodArgumentTypes[]) { return null; }

        private static boolean _needForwardingBindingForObject(Object object, Class baseInterface, String methodName, Class methodArgumentTypes[]) { return null; }

        public static com.webobjects.foundation.NSKeyValueCoding._KeyBinding _bestKeyGetBindingForKey(Object object, String key) { return null; }

        public static com.webobjects.foundation.NSKeyValueCoding._KeyBinding _bestKeySetBindingForKey(Object object, String key) { return null; }

        public static com.webobjects.foundation.NSKeyValueCoding._KeyBinding _bestStoredKeyGetBindingForKey(Object object, String key) { return null; }

        public static com.webobjects.foundation.NSKeyValueCoding._KeyBinding _bestStoredKeySetBindingForKey(Object object, String key) { return null; }

        _BestBindingCreation() { return null; }

        static  {}

        public static final Class _CLASS = null;
        private static final _NSThreadsafeMutableDictionary _classToValueForKeyForwardingBindingNeededMapTable;
        private static final _NSThreadsafeMutableDictionary _classToTakeValueForKeyForwardingBindingNeededMapTable;
        private static final _NSThreadsafeMutableDictionary _classToStoredValueForKeyForwardingBindingNeededMapTable;
        private static final _NSThreadsafeMutableDictionary _classToTakeStoredValueForKeyForwardingBindingNeededMapTable;

    }

    public static class DefaultImplementation {


        public static void _flushCaches() { return null; }

        public static Object storedValueForKey(Object object, String key) { return null; }

        public static void takeStoredValueForKey(Object object, Object value, String key) { return null; }

        public static com.webobjects.foundation.NSKeyValueCoding._KeyBinding _storedKeyGetBindingForKey(Object object, String key) { return null; }

        public static com.webobjects.foundation.NSKeyValueCoding._KeyBinding _storedKeySetBindingForKey(Object object, String key) { return null; }

        private static boolean _shouldUseStoredAccessorsForClass(Class objectClass) { return null; }

        public static com.webobjects.foundation.NSKeyValueCoding._KeyBinding _createStoredKeyGetBindingForKey(Object object, String key) { return null; }

        public static com.webobjects.foundation.NSKeyValueCoding._KeyBinding _createStoredKeySetBindingForKey(Object object, String key) { return null; }

        DefaultImplementation() { return null; }

        static  {}

        public static final Class _CLASS = null;
        private static final _NSThreadsafeMutableSet _storedKeyGetBindings;
        private static final _NSThreadsafeMutableSet _storedKeySetBindings;

    }

    public static class _StoredForwardingBinding extends com.webobjects.foundation.NSKeyValueCoding._ForwardingBinding {

        public _StoredForwardingBinding(Class targetClass, String key) { return null; }

        public Object valueInObject(Object object) { return null; }

        public void setValueInObject(Object value, Object object) {}
    }

    public static interface _KeyBindingCreation
        extends com.webobjects.foundation.NSKeyValueCoding._KeyBindingCreation {


        public abstract com.webobjects.foundation.NSKeyValueCoding._KeyBinding _createStoredKeyGetBindingForKey(String s);

        public abstract com.webobjects.foundation.NSKeyValueCoding._KeyBinding _createStoredKeySetBindingForKey(String s);

        public abstract com.webobjects.foundation.NSKeyValueCoding._KeyBinding _storedKeyGetBindingForKey(String s);

        public abstract com.webobjects.foundation.NSKeyValueCoding._KeyBinding _storedKeySetBindingForKey(String s);



        public static final Class _CLASS = null;

    }

    public static class Utility {


        public static Object storedValueForKey(Object object, String key) { return null; }

        public static void takeStoredValueForKey(Object object, Object value, String key) { return null; }

        Utility() { return null; }

        static  {}

        public static final Class _CLASS = null;

    }



    public abstract Object storedValueForKey(String s);

    public abstract void takeStoredValueForKey(Object obj, String s);



    public static final Class _CLASS = null;

}
