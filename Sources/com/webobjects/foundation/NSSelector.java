
package com.webobjects.foundation;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class NSSelector
    implements Serializable {


    public static Object _safeInvokeSelector(NSSelector selector, Object receiver, Object parameters[]) { return null; }

    public static Object _safeInvokeMethod(Method method, Object receiver, Object parameters[]) { return null; }

    public NSSelector(String name) { return null; }

    private void initFromObjects(String name, Class parameterTypes[]) {}

    public NSSelector(String name, Class parameterTypes[]) { return null; }

    public boolean equals(Object otherSelector) { return true; }

    public String name() { return null; }

    public Class[] parameterTypes() { return null; }

    private synchronized Method _methodOnClass(Class targetClass) { return null; }

    public Method methodOnClass(Class targetClass) throws NoSuchMethodException { return null; }

    public Method methodOnObject(Object target) throws NoSuchMethodException { return null; }

    public boolean implementedByClass(Class targetClass) { return true; }

    public boolean implementedByObject(Object target) { return true; }

    public Object invoke(Object target, Object parameters[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException { return null; }

    public Object invoke(Object target) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException { return null; }

    public Object invoke(Object target, Object argument) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException { return null; }

    public Object invoke(Object target, Object argument1, Object argument2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException { return null; }

    public static Object invoke(String name, Class parameterTypes[], Object target, Object parameters[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException { return null; }

    public static Object invoke(String name, Class parameterType, Object target, Object argument) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException { return null; }

    public static Object invoke(String name, Class parameterType1, Class parameterType2, Object target, Object argument1, Object argument2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException { return null; }

    public int hashCode() { return 0; }

    public String toString() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    static  {}

    public static final Class _CLASS;
    static final long serialVersionUID = 0x378d94L;
    private static final String SerializationNameFieldKey = "name";
    private static final String SerializationTypesFieldKey = "types";
    protected String _name;
    protected Class _types[];
    private transient Class _cachedClass;
    private transient Method _cachedMethod;
    private transient NSMutableDictionary _classToMethodMapTable;
    private static final ObjectStreamField serialPersistentFields[];

}
