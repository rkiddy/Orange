
package com.webobjects.directtoweb;

import com.webobjects._eoproject.*;
import com.webobjects.appserver.*;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.*;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;


public class D2WUtils {


    public D2WUtils() { return null; }

    public static String readableDateFormatDescription(String aString) { return null; }

    public static String lighter(String hexColor) { return null; }

    public static String darker(String hexColor) { return null; }

    public static boolean safeEquals(Object o1, Object o2) { return null; }

    private static int filterRGB(int rgb, double factor) { return null; }

    public static NSArray propertyKeyDescriptorsFromEntity(EOEntity e) { return null; }

    public static NSArray availableKeysForInterfaceAndKeyPath(_WBInterfaceDescriptor i, NSArray keyPath) { return null; }

    public static _WBKeyDescriptor keyDescriptorForInterfaceAndKeyPath(_WBInterfaceDescriptor i, NSArray keyPath) { return null; }

    private static _WBKeyDescriptor keyWithName(_WBKeyDescriptor kd, String name) { return null; }

    private static _WBKeyDescriptor _keyDescriptorForInterfaceAndKeyPath(_WBInterfaceDescriptor i, NSArray keyPath, int fromIndex) { return null; }

    public static final Class dataTypeForCustomKeyAndEntity(String customKey, EOEntity entity) { return null; }

    private static boolean isPrototypesEntity(EOEntity e) { return null; }

    public static NSArray allEntities() { return null; }

    public static NSArray smartDefaultEntityNames() { return null; }

    public static NSArray visibleEntityNames(D2WContext c) { return null; }

    public static NSArray readOnlyEntityNames(D2WContext c) { return null; }

    static String[] availableComponentsInDirectory(String directory) { return null; }

    protected static void flushCaches() { return null; }

    static Vector componentsInApplicationWrapper() { return null; }

    static String componentToAddFromWo(String wo) { return null; }

    public static String smartDefaultKeyForEntity(EOEntity entity) { return null; }

    public static String userDefaultsValueForKey(String key) { return null; }

    public static String homeHrefInContext(WOContext context) { return null; }

    public static int applicationPort() { return null; }

    public static String appletViewerCommand() { return null; }

    static String resourcePathURL(WOContext context) { return null; }

    public static String urlFromUrlAndFormValues(String currentUrl, NSDictionary formValues) { return null; }

    public static D2WContext makeSubContextForTaskAndEntity(String task, EOEntity entity, WOSession session) { return null; }

    public static D2WContext makeSubContextForDynamicPageNamed(String pageName, WOSession session) { return null; }

    static  {}

    private static Hashtable _smartDefaultKeys;
    private static final EOSortOrdering _nameSortOrdering;
    private static final NSArray _nameSortOrderingKeyVector;
    private static NSMutableArray _entities;
    private static NSMutableArray _defaultEntityNames;
    private static final NSArray emptyArray;
    private static D2WContext _visibleEntitiesContext;
    private static Vector _componentsInApplicationWrapper;
    public static Random _random;
    public static String _bogusKey;

}
