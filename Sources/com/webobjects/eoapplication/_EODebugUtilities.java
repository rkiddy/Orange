
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.EOViewLayout;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.JComponent;


public class _EODebugUtilities {


    public _EODebugUtilities() { return null; }

    public static String _startMeasuringTime(String description, String specialTimerID, String categoryDescription) { return null; }

    public static void _stopMeasuringTime(String timerID) { return null; }

    private static String _classNameWithoutPackage(String string) { return null; }

    public static String _classDescription(Object object) { return null; }

    public static String _identiyDescription(Object object) { return null; }

    public static String _classAndIdentityDescription(Object object) { return null; }

    public static String _sizeDescription(Dimension size) { return null; }

    public static String _dictionaryDescription(NSDictionary dictionary) { return null; }

    public static String _arrayDescription(NSArray array) { return null; }

    public static void _printStackTrace() { return null; }

    public static String componentLayoutString(Component component) { return null; }

    private static void _addHierarchicalComponentLayoutInformation(Component component, StringBuffer buffer, String indentionString, String nextIndentionStringPrefix) { return null; }

    public static String hierarchicalComponentLayoutString(Component component) { return null; }

    public String actionString(EOAction description) { return null; }

    public static String controllerString(EOController controller) { return null; }

    private static void _addHierarchicalControllerInformation(EOController controller, StringBuffer buffer, String indentionString, String nextIndentionStringPrefix) { return null; }

    public static String hierarchicalControllerString(EOController controller) { return null; }

    public static String allControllerString() { return null; }

    private static String _optimzedTag(Object object) { return null; }

    private static boolean _controllerXMLTagCannotBeSelfClosing(EOController controller, NSDictionary xmlParameters) { return null; }

    private static String _controllerXMLStartDescription(EOController controller, NSDictionary xmlParameters, boolean optimizeTag) { return null; }

    private static String _controllerXMLEndDescription(EOController controller, NSDictionary xmlParameters, boolean optimizeTag) { return null; }

    private static void _addHierarchicalControllerXMLDescription(EOController controller, NSDictionary xmlParameters, StringBuffer buffer, String indentionString, boolean optimizeTag) { return null; }

    private static String _controllerXMLDescription(EOController controller, String indentionString, boolean optimizeTag) { return null; }

    public static String controllerXMLDescription(EOController controller, boolean optimizeTag) { return null; }

    public static String specificationAndControllerXMLDescription(NSDictionary specification, EOController controller, boolean optimizeTag) { return null; }

    private static String _addActionXMLDescription(EOAction action, StringBuffer buffer, String indentionString, boolean optimizeTag) { return null; }

    public static String actionsXMLDescription(NSArray actions, boolean optimizeTag) { return null; }

    private static void _addXMLDescription(Object object, String name, StringBuffer buffer, String indentionString) { return null; }

    public static String XMLDescription(Object object) { return null; }

    static  {}

    public static final Class _CLASS;
    private static final String _xmlIndention = "    ";
    public static boolean _measureTimes;
    private static int _timerIDGenerator;
    private static NSMutableDictionary _timeMeasuringInformation;

}
