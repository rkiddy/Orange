
package com.webobjects.eointerface;

import com.webobjects.foundation.*;
import java.io.UnsupportedEncodingException;


public class EOTextAssociation extends EOValueAssociation {
    public static abstract class TextPlugin extends EOValueAssociation.ValuePlugin {


        public TextPlugin(EOWidgetAssociation association, Object widget) { return null; }

        public abstract void setFontProperties(int i, int j);

        public abstract void setColors(Object obj, Object obj1);

        static  {}

        public static final Class _CLASS;

    }



    public static void setDefaultBackgroundColors(Object enabledColor, Object disabledColor) { return null; }

    public static Object defaultDisabledBackgroundColor() { return null; }

    public static Object defaultEnabledBackgroundColor() { return null; }

    public EOTextAssociation(Object widget) { return null; }

    public void dispose() {}

    protected String[][] _aspectInfo() { return null; }

    protected void _connectionWasEstablished() {}

    protected void _connectionWasBroken() {}

    protected Object displayValueFromURL(String URLString) { return null; }

    protected void _updateDisplayValue(boolean ignoreLastDisplayedValue) {}

    public void setUsesDefaultBackgroundColors(boolean flag) {}

    public boolean usesDefaultBackgroundColors() { return true; }

    static  {}

    public static final Class _CLASS;
    private static Object _defaultDisabledBackgroundColor;
    private static Object _defaultEnabledBackgroundColor;
    private Object _lastTextColor;
    private Object _lastBackgroudColor;
    private int _lastItalicState;
    private int _lastBoldState;
    private boolean _textColorAspectBound;
    private boolean _backgroundColorAspectBound;
    private boolean _italicAspectBound;
    private boolean _boldAspectBound;
    private boolean _usesDefaultBackgroundColors;

}
