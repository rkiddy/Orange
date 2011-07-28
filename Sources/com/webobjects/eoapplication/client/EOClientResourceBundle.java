
package com.webobjects.eoapplication.client;

import com.webobjects.eoapplication.*;
import com.webobjects.foundation.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 * @deprecated Class EOClientResourceBundle is deprecated
 */

public class EOClientResourceBundle extends ResourceBundle
    implements com.webobjects.eoapplication.EOUserInterfaceParameters._IconHandler {
    private static class _Enumeration
        implements Enumeration {


        public _Enumeration(NSArray stringKeys, NSArray imageKeys) { return null; }

        public boolean hasMoreElements() { return true; }

        public Object nextElement() { return null; }

        private int index;
        private NSMutableArray _keys;

    }



    public EOClientResourceBundle() { return null; }

    private NSDictionary _stringTableFromURL(String url) { return null; }

    public ImageIcon _iconFromURL(String url) { return null; }

    private void _generateUrls() {}

    private NSDictionary _stringToLocalizedStringMapTable() { return null; }

    private NSDictionary _iconNameToIconURLMapTable() { return null; }

    public String _nameForLocalizedIcon(Icon icon) { return null; }

    protected Object handleGetObject(String key) throws MissingResourceException { return null; }

    public Enumeration getKeys() { return null; }

    static  {}

    public static final Class _CLASS;
    private NSArray _stringTableURLs;
    private NSDictionary _iconNameToIconURLMapTable;
    private NSMutableDictionary _stringToLocalizedStringMapTable;
    private NSMutableDictionary _iconNameToLocalizedIconMapTable;

}
