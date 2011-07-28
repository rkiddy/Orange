
package com.webobjects.foundation;



public interface NSKeyValueCodingAdditions
    extends NSKeyValueCoding {
    public static class DefaultImplementation {


        public static Object valueForKeyPath(Object object, String keyPath) { return null; }

        public static void takeValueForKeyPath(Object object, Object value, String keyPath) { return null; }

        DefaultImplementation() { return null; }

        static  {}

        public static final Class _CLASS = null;

    }

    public static class Utility {


        public static Object valueForKeyPath(Object object, String keyPath) { return null; }

        public static void takeValueForKeyPath(Object object, Object value, String keyPath) { return null; }

        Utility() { return null; }

        static  {}

        public static final Class _CLASS = null;

    }



    public abstract Object valueForKeyPath(String s);

    public abstract void takeValueForKeyPath(Object obj, String s);



    public static final Class _CLASS = null;
    public static final String KeyPathSeparator = ".";
    public static final char _KeyPathSeparatorChar = 46;

}
