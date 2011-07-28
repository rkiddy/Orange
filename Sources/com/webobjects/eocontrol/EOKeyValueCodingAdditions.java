
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.util.Enumeration;


public interface EOKeyValueCodingAdditions
    extends NSKeyValueCodingAdditions, EOKeyValueCoding {
    public static class DefaultImplementation {


        public static NSDictionary valuesForKeys(Object object, NSArray keys) { return null; }

        public static NSDictionary valuesForKeysWithMapping(Object object, NSDictionary mapping) { return null; }

        public static void takeValuesFromDictionary(Object object, NSDictionary dictionary) { return null; }

        public static void takeValuesFromDictionaryWithMapping(Object object, NSDictionary dictionary, NSDictionary mapping) { return null; }

        public static void _takeStoredValuesFromDictionary(Object object, NSDictionary dictionary) { return null; }

        DefaultImplementation() { return null; }

        static  {}

        public static final Class _CLASS = null;

    }

    public static class Utility {


        public static NSDictionary valuesForKeys(Object object, NSArray keys) { return null; }

        public static NSDictionary valuesForKeysWithMapping(Object object, NSDictionary mapping) { return null; }

        public static void takeValuesFromDictionary(Object object, NSDictionary dictionary) { return null; }

        public static void takeValuesFromDictionaryWithMapping(Object object, NSDictionary dictionary, NSDictionary mapping) { return null; }

        Utility() { return null; }

        static  {}

        public static final Class _CLASS = null;

    }



    public abstract NSDictionary valuesForKeys(NSArray nsarray);

    public abstract NSDictionary valuesForKeysWithMapping(NSDictionary nsdictionary);

    public abstract void takeValuesFromDictionary(NSDictionary nsdictionary);

    public abstract void takeValuesFromDictionaryWithMapping(NSDictionary nsdictionary, NSDictionary nsdictionary1);



    public static final Class _CLASS = null;

}
