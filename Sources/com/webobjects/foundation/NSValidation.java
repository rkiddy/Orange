
package com.webobjects.foundation;

import java.lang.reflect.Method;


public interface NSValidation {
    public static class DefaultImplementation {


        DefaultImplementation() { return null; }

        public static void _flushCaches() { return null; }

        public static Object validateValueForKey(Object object, Object value, String key) throws ValidationException { return null; }

        public static Object _validateValueForKey(Object object, Object value, String key, Class valueBaseInterfaceHint) throws ValidationException { return null; }

        public static Object validateTakeValueForKeyPath(Object object, Object value, String keyPath) throws ValidationException { return null; }

        static  {}

        public static final Class _CLASS = null;
        private static final _NSThreadsafeMutableSet _validationBindings;

    }

    public static class _MethodBinding extends _ValidationBinding {


        public _MethodBinding(Class targetClass, String key, Method method) { return null; }

        public Object validateValueOnObject(Object value, Object object) throws ValidationException { return null; }

        public String toString() { return null; }

        protected Method _method;

    }

    public static class _ValidationBinding {


        public _ValidationBinding(Class targetClass, String key) { return null; }

        public final Class targetClass() { return null; }

        public final String key() { return null; }

        public final int hashCode() { return null; }

        public final boolean isEqualToValidationBinding(_ValidationBinding otherValidationBinding) { return null; }

        public final boolean equals(Object object) { return null; }

        public Object validateValueOnObject(Object value, Object object) throws ValidationException { return null; }

        public String toString() { return null; }

        static  {}

        public static final Class _CLASS = null;
        protected Class _targetClass;
        protected String _key;
        private int _hashCode;

    }

    public static class Utility {


        Utility() { return null; }

        public static Object validateValueForKey(Object object, Object value, String key) throws ValidationException { return null; }

        public static Object validateTakeValueForKeyPath(Object object, Object value, String keyPath) throws ValidationException { return null; }

        static  {}

        public static final Class _CLASS = null;

    }

    public static class ValidationException extends RuntimeException {


        public static ValidationException aggregateExceptionWithExceptions(NSArray aggregateExceptions) { return null; }

        public ValidationException(String message) { return null; }

        public ValidationException(String message, Object object, String key) { return null; }

        /**
         * @deprecated Method ValidationException is deprecated
         */

        public ValidationException(String message, NSDictionary userInfo) { return null; }

        public Object object() { return null; }

        public String key() { return null; }

        public NSArray additionalExceptions() { return null; }

        /**
         * @deprecated Method userInfo is deprecated
         */

        public NSDictionary userInfo() { return null; }

        /**
         * @deprecated Method exceptionAddingEntriesToUserInfo is deprecated
         */

        public ValidationException exceptionAddingEntriesToUserInfo(Object object, String key) { return null; }

        public ValidationException exceptionWithObjectAndKey(Object object, String key) { return null; }

        static  {}

        private static final long serialVersionUID = 0xda55349cL;
        public static final Class _CLASS = null;
        /**
         * @deprecated Field ValidatedObjectUserInfoKey is deprecated
         */
        public static final String ValidatedObjectUserInfoKey = "NSValidatedObjectUserInfoKey";
        /**
         * @deprecated Field ValidatedKeyUserInfoKey is deprecated
         */
        public static final String ValidatedKeyUserInfoKey = "NSValidatedKeyUserInfoKey";
        /**
         * @deprecated Field AdditionalExceptionsKey is deprecated
         */
        public static final String AdditionalExceptionsKey = "NSAdditionalExceptionsKey";
        private NSDictionary _userInfo;

    }



    public abstract Object validateValueForKey(Object obj, String s) throws ValidationException;

    public abstract Object validateTakeValueForKeyPath(Object obj, String s) throws ValidationException;



    public static final Class _CLASS = null;

}
