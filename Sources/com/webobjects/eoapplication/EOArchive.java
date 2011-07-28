
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import java.awt.*;
import java.beans.*;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.*;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;


public class EOArchive {
    public static interface _ObjectInstantiationDelegate {


        public abstract Object objectForOutletPath(EOArchive eoarchive, String s);



        public static final Class _CLASS = null;
        public static final String NullObject = "NullObject";

    }



    public EOArchive(Object owner, NSDisposableRegistry registry) { return null; }

    protected void _awaken() {}

    public NSDisposableRegistry disposableRegistry() { return null; }

    protected Method _beansBasedSetterfor(Object receiver, String key) { return null; }

    private static void _addWithPlatformAndLanguageToArchiveClassNames(NSMutableArray classNames, String archiveName, String packageName, String language, String platform) { return null; }

    private static void _addWithLanguageToArchiveClassNames(NSMutableArray classNames, String archiveName, String packageName, String language) { return null; }

    private static NSArray _classNamesForArchiveNamed(String archiveName, String packageName) { return null; }

    private static Class _bestClassForArchiveNamed(String archiveName, String packageName) { return null; }

    protected void _connect(Object source, Object destination, String outlet) {}

    protected void _construct() {}

    protected void debug(String message) {}

    public Object _registered(Object object, String name) { return null; }

    protected Object _owner() { return null; }

    protected void _init() {}

    protected boolean _isContentPane(Component component) { return true; }

    protected Object _javaBeanFromBytes(byte bytes[]) { return null; }

    public static NSDictionary loadArchiveNamed(String archiveName, Object owner, String archivePackageName, NSDisposableRegistry registry) { return null; }

    public NSDictionary namedObjects() { return null; }

    protected Object _newCustomObjectClassNamed(String className) { return null; }

    protected void _setFontForComponent(Component component, String fontName, int size, int style) {}

    protected void _setOwner(Object owner) {}

    protected boolean _setValueForBeanProperty(Object object, Object value, String name) { return true; }

    protected void _setValueForKey(Object object, Object value, String name) {}

    public String _stringForDimension(Dimension dimension) { return null; }

    public String _stringForDimensions(int width, int height) { return null; }

    static  {}

    public static final Class _CLASS = null;
    private static NSMutableDictionary _archiveNameToClassMap;
    private Object _owner;
    private NSDisposableRegistry _disposableRegistry;
    private NSMutableDictionary _namedObjects;
    protected NSMutableDictionary _replacedObjects;

}
