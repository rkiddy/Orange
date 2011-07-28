
package com.webobjects.foundation;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.*;
import java.util.Map;


public interface NSKeyValueCoding {
    public static class _ReflectionKeyBindingCreation {
        private static class _BindingStorage {


            public _BindingStorage() { return null; }

            public String toString() { return null; }

            _KeyBinding _keyGetBindings[];
            _KeyBinding _keySetBindings[];

        }

        public static interface Callback {

            public abstract _KeyBinding _fieldKeyBinding(String s, String s1);

            public abstract _KeyBinding _methodKeyGetBinding(String s, String s1);

            public abstract _KeyBinding _methodKeySetBinding(String s, String s1);

            public abstract _KeyBinding _otherStorageBinding(String s);
        }



        public static void _flushCaches() { return null; }

        public static boolean _canAccessFieldsDirectlyForClass(Class objectClass) { return null; }

        public static _KeyBinding _fieldKeyBinding(Object object, String key, String fieldName) { return null; }

        public static _KeyBinding _methodKeyGetBinding(Object object, String key, String methodName) { return null; }

        public static _KeyBinding _methodKeySetBinding(Object object, String key, String methodName) { return null; }

        private static _KeyBinding _createKeyBindingForKey(Object object, String key, int lookupOrder[], boolean trueForSetAndFalseForGet) { return null; }

        public static _KeyBinding _createKeyGetBindingForKey(Object object, String key, int lookupOrder[]) { return null; }

        public static _KeyBinding _createKeySetBindingForKey(Object object, String key, int lookupOrder[]) { return null; }

        _ReflectionKeyBindingCreation() { return null; }

        static  {}

        public static final Class _CLASS = null;
        public static final int MethodLookup = 0;
        public static final int UnderbarMethodLookup = 1;
        public static final int FieldLookup = 2;
        public static final int UnderbarFieldLookup = 3;
        public static final int OtherStorageLookup = 4;
        public static final int _ValueForKeyLookupOrder[];
        public static final int _StoredValueForKeyLookupOrder[];
        private static final _KeyBinding _NotAvailableIndicator;
        private static final _NSThreadsafeMutableDictionary _bindingStorageMapTable;

    }

    public static class DefaultImplementation {


        public static void _flushCaches() { return null; }

        public static Object valueForKey(Object object, String key) { return null; }

        public static void takeValueForKey(Object object, Object value, String key) { return null; }

        private static String _identityString(Object object) { return null; }

        public static Object handleQueryWithUnboundKey(Object object, String key) { return null; }

        public static void handleTakeValueForUnboundKey(Object object, Object value, String key) { return null; }

        public static void unableToSetNullForKey(Object object, String key) { return null; }

        public static _KeyBinding _keyGetBindingForKey(Object object, String key) { return null; }

        public static _KeyBinding _keySetBindingForKey(Object object, String key) { return null; }

        public static _KeyBinding _createKeyGetBindingForKey(Object object, String key) { return null; }

        public static _KeyBinding _createKeySetBindingForKey(Object object, String key) { return null; }

        DefaultImplementation() { return null; }

        static  {}

        public static final Class _CLASS = null;
        private static final _NSThreadsafeMutableSet _keyGetBindings;
        private static final _NSThreadsafeMutableSet _keySetBindings;

    }

    public static class MapImplementation {


        public static Object valueForKey(Map map, String key) { return null; }

        public static void takeValueForKey(Map map, Object value, String key) { return null; }

        MapImplementation() { return null; }

        static  {}

        public static final Class _CLASS = null;

    }

    public static class _BooleanMethodBinding extends _MethodBinding {

        public _BooleanMethodBinding(Class targetClass, String key, Method method, ValueAccessor valueAccessor) { return null; }

        public Class valueType() { return null; }

        public void setValueInObject(Object value, Object object) {}
    }

    public static class _NumberMethodBinding extends _MethodBinding {


        public _NumberMethodBinding(Class targetClass, String key, Method method, Class valueClass, ValueAccessor valueAccessor) { return null; }

        public Class valueType() { return null; }

        public void setValueInObject(Object value, Object object) {}

        public String toString() { return null; }

        protected Class _valueClass;

    }

    public static class _MethodBinding extends _KeyBinding {


        public _MethodBinding(Class targetClass, String key, Method method, ValueAccessor valueAccessor) { return null; }

        public Class valueType() { return null; }

        public boolean isScalarProperty() { return true; }

        private RuntimeException throwMethodExceptionWithDescription(Throwable exception, Object object, Object newValue, boolean isSetMethod) { return null; }

        public Object valueInObject(Object object) { return null; }

        public void setValueInObject(Object value, Object object) {}

        public String toString() { return null; }

        protected Method _method;
        protected boolean _isScalar;
        protected ValueAccessor _valueAccessor;

    }

    public static class _BooleanFieldBinding extends _FieldBinding {

        public _BooleanFieldBinding(Class targetClass, String key, Field field, ValueAccessor valueAccessor) { return null; }

        public Class valueType() { return null; }

        public void setValueInObject(Object value, Object object) {}
    }

    public static class _NumberFieldBinding extends _FieldBinding {


        public _NumberFieldBinding(Class targetClass, String key, Field field, Class valueClass, ValueAccessor valueAccessor) { return null; }

        public Class valueType() { return null; }

        public void setValueInObject(Object value, Object object) {}

        public String toString() { return null; }

        protected Class _valueClass;

    }

    public static class _FieldBinding extends _KeyBinding {


        public _FieldBinding(Class targetClass, String key, Field field, ValueAccessor valueAccessor) { return null; }

        public Class valueType() { return null; }

        public boolean isScalarProperty() { return true; }

        public Object valueInObject(Object object) { return null; }

        protected void _setValidatedValueInObject(Object value, Object object) throws IllegalAccessException {}

        public void setValueInObject(Object value, Object object) {}

        public String toString() { return null; }

        protected Field _field;
        protected boolean _isScalar;
        protected ValueAccessor _valueAccessor;

    }

    public static class _ForwardingBinding extends _KeyBinding {

        public _ForwardingBinding(Class targetClass, String key) { return null; }

        public Object valueInObject(Object object) { return null; }

        public void setValueInObject(Object value, Object object) {}
    }

    public static class _KeyBinding {


        public _KeyBinding(Class targetClass, String key) { return null; }

        public final Class targetClass() { return null; }

        public final String key() { return null; }

        public final int hashCode() { return null; }

        public final boolean isEqualToKeyBinding(_KeyBinding otherKeyBinding) { return null; }

        public final boolean equals(Object object) { return null; }

        public Class valueType() { return null; }

        public boolean isScalarProperty() { return true; }

        public Object valueInObject(Object object) { return null; }

        public void setValueInObject(Object value, Object object) {}

        protected void _unableToSetNull(Object object) {}

        protected Constructor _numberStringConstructorForValueClass(Class valueClass) { return null; }

        protected Object _convertValueIntoBoolean(Object value) { return null; }

        protected Object _convertValueIntoNumberOfValueType(Object value, Class numberType) { return null; }

        public String toString() { return null; }

        static  {}

        public static final Class _CLASS = null;
        protected static final Short _shortFalse;
        protected static final Short _shortTrue;
        protected Class _targetClass;
        protected String _key;
        private int _hashCode;

    }

    public static interface _KeyBindingCreation {


        public abstract _KeyBinding _createKeyGetBindingForKey(String s);

        public abstract _KeyBinding _createKeySetBindingForKey(String s);

        public abstract _KeyBinding _keyGetBindingForKey(String s);

        public abstract _KeyBinding _keySetBindingForKey(String s);



        public static final Class _CLASS = null;

    }

    public static abstract class ValueAccessor {


        public static void _flushCaches() { return null; }

        public static void setProtectedAccessorForPackageNamed(ValueAccessor valueAccessor, String packageName) { return null; }

        public static ValueAccessor protectedAccessorForPackageNamed(String packageName) { return null; }

        public static void removeProtectedAccessorForPackageNamed(String packageName) { return null; }

        public static ValueAccessor _valueAccessorForClass(Class objectClass) { return null; }

        public ValueAccessor() { return null; }

        public abstract Object fieldValue(Object obj, Field field) throws IllegalArgumentException, IllegalAccessException;

        public abstract void setFieldValue(Object obj, Field field, Object obj1) throws IllegalArgumentException, IllegalAccessException;

        public abstract Object methodValue(Object obj, Method method) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException;

        public abstract void setMethodValue(Object obj, Method method, Object obj1) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException;

        static  {}

        public static final Class _CLASS = null;
        private static final _NSThreadsafeMutableDictionary _packageNameToValueAccessorMapTable;
        private static final String _PackageProtectedAccessorClassName = "KeyValueCodingProtectedAccessor";
        static final ValueAccessor _defaultValueAccessor;


        // Unreferenced inner class com/webobjects/foundation/NSKeyValueCoding$ValueAccessor$1

/* anonymous class */
        static class _cls1 extends ValueAccessor {

            _cls1() throws InvocationTargetException, IllegalAccessException { return null; }

            public Object fieldValue(Object object, Field field) throws IllegalArgumentException, IllegalAccessException { return null; }

            public void setFieldValue(Object object, Field field, Object value) throws IllegalArgumentException, IllegalAccessException {}

            public Object methodValue(Object object, Method method) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException { return null; }

            public void setMethodValue(Object object, Method method, Object value) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {}

            public String toString() { return null; }
        }

    }

    public static class Utility {


        public static final Object nullValue() { return null; }

        public static Object valueForKey(Object object, String key) { return null; }

        public static void takeValueForKey(Object object, Object value, String key) { return null; }

        public static Object handleQueryWithUnboundKey(Object object, String key) { return null; }

        public static void handleTakeValueForUnboundKey(Object object, Object value, String key) { return null; }

        public static void unableToSetNullForKey(Object object, String key) { return null; }

        Utility() { return null; }

        static  {}

        public static final Class _CLASS = null;

    }

    public static final class Null
        implements Serializable, Cloneable, NSCoding {


        Null() { return null; }

        public String toString() { return null; }

        public Object clone() { return null; }

        public Class classForCoder() { return null; }

        public static Object decodeObject(NSCoder coder) { return null; }

        public void encodeWithCoder(NSCoder nscoder) {}

        Object readResolve() throws ObjectStreamException { return null; }

        static  {}

        private static final long serialVersionUID = 0x58d9c82bL;
        public static final Class _CLASS = null;

    }

    public static class UnknownKeyException extends RuntimeException {


        public UnknownKeyException(String message, Object object, String key) { return null; }

        /**
         * @deprecated Method UnknownKeyException is deprecated
         */

        public UnknownKeyException(String message, NSDictionary userInfo) { return null; }

        public Object object() { return null; }

        public String key() { return null; }

        /**
         * @deprecated Method userInfo is deprecated
         */

        public NSDictionary userInfo() { return null; }

        public String toString() { return null; }

        static  {}

        private static final long serialVersionUID = 0xbbffe87L;
        public static final Class _CLASS = null;
        /**
         * @deprecated Field TargetObjectUserInfoKey is deprecated
         */
        public static final String TargetObjectUserInfoKey = "NSTargetObjectUserInfoKey";
        /**
         * @deprecated Field UnknownUserInfoKey is deprecated
         */
        public static final String UnknownUserInfoKey = "NSUnknownUserInfoKey";
        private NSDictionary _userInfo;

    }

    public static interface ErrorHandling {


        public abstract Object handleQueryWithUnboundKey(String s);

        public abstract void handleTakeValueForUnboundKey(Object obj, String s);

        public abstract void unableToSetNullForKey(String s);



        public static final Class _CLASS = null;

    }



    public abstract Object valueForKey(String s);

    public abstract void takeValueForKey(Object obj, String s);



    public static final Class _CLASS = null;
    public static final Null NullValue = null;

}
