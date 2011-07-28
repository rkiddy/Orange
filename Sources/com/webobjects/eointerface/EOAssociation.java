
package com.webobjects.eointerface;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.lang.reflect.*;


public abstract class EOAssociation extends EODelayedObserver
    implements NSDisposable {
    private static class _AspectBinding
        implements NSDisposable {


        public _AspectBinding(EODisplayGroup displayGroup, String key) { return null; }

        public void dispose() {}

        public EODisplayGroup displayGroup() { return null; }

        public String key() { return null; }

        private EODisplayGroup _displayGroup;
        private String _key;

    }



    public static void _registerDefaultAssociationClasses() { return null; }

    public static void registerAssociationClass(Class associationClass) { return null; }

    public static NSArray associationClassesForObject(Object object) { return null; }

    EOAssociation() { return null; }

    public EOAssociation(Object aDisplayObject) { return null; }

    public void dispose() {}

    public boolean isUsableWithObject(Object object) { return true; }

    public void setObject(Object aDisplayObject) {}

    public Object object() { return null; }

    String[][] _aspectInfo() { return null; }

    String[][] _filteredAspectInfo() { return null; }

    public NSArray aspects() { return null; }

    public void bindAspect(String aspect, EODisplayGroup displayGroup, String key) {}

    public void copyMatchingBindingsFromAssociation(EOAssociation source) {}

    public EODisplayGroup displayGroupForAspect(String aspect) { return null; }

    public String displayGroupKeyForAspect(String aspect) { return null; }

    protected String _indexAspect() { return null; }

    protected void _connectionWasEstablished() {}

    protected void _connectionWasBroken() {}

    public boolean isConnected() { return true; }

    public void establishConnection() {}

    public void breakConnection() {}

    public int priority() { return 0; }

    protected boolean _displayFlagFromValue(Object value) { return true; }

    protected boolean _areValuesIdentical(Object value1, Object value2) { return true; }

    public void subjectChanged() {}

    public boolean setValueForAspect(Object value, String aspect) { return true; }

    public Object valueForAspect(String aspect) { return null; }

    public boolean setValueForAspectAtIndex(Object value, String aspect, int index) { return true; }

    public Object valueForAspectAtIndex(String aspect, int index) { return null; }

    public boolean _addObjectToBothSidesOfSelectedObjectRelationshipWithAspect(Object value, String aspect) { return true; }

    public boolean _addObjectToBothSidesOfRelationshipWithAspectAtIndex(Object value, String aspect, int index) { return true; }

    public boolean _removeObjectFromBothSidesOfSelectedObjectRelationshipWithAspect(Object value, String aspect) { return true; }

    public boolean _removeObjectFromBothSidesOfRelationshipWithAspectAtIndex(Object value, String aspect, int index) { return true; }

    public boolean endEditing() { return true; }

    public boolean shouldEndEditing(String aspect, String invalidInput, String errorDescription) { return true; }

    public boolean shouldEndEditingAtIndex(String aspect, String invalidInput, String errorDescription, int index) { return true; }

    public void setExplicitlyDisabled(boolean flag) {}

    public boolean isExplicitlyDisabled() { return true; }

    protected boolean _isEnabledAspectBound() { return true; }

    protected boolean _booleanFromObjectValue(Object value) { return true; }

    protected boolean isEnabledAtIndex(int index) { return true; }

    protected boolean isEnabled() { return true; }

    public String primaryAspect() { return null; }

    public NSArray objectKeysTaken() { return null; }

    public NSArray aspectSignatures() { return null; }

    static  {}

    public static final Class _CLASS;
    public static final String NullAspectSignature = "";
    public static final String AttributeAspectSignature = "A";
    public static final String ToOneAspectSignature = "1";
    public static final String ToManyAspectSignature = "M";
    public static final String AttributeToOneAspectSignature = "A1";
    public static final String AttributeToOneToManyAspectSignature = "A1M";
    public static final String AttributeToManyAspectSignature = "AM";
    public static final String ToOneToManyAspectSignature = "1M";
    public static final String ActionAspect = "action";
    public static final String ArgumentAspect = "argument";
    public static final String BoldAspect = "bold";
    public static final String TextColorAspect = "textColor";
    public static final String BackgroundColorAspect = "backgroundColor";
    public static final String ChildrenAspect = "children";
    public static final String DestinationAspect = "destination";
    public static final String EnabledAspect = "enabled";
    public static final String ExpandedIconAspect = "expandedIcon";
    public static final String IconAspect = "icon";
    public static final String IsLeafAspect = "isLeaf";
    public static final String ItalicAspect = "italic";
    public static final String MatchKey1Aspect = "matchKey1";
    public static final String MatchKey2Aspect = "matchKey2";
    public static final String MatchKey3Aspect = "matchKey3";
    public static final String ParentAspect = "parent";
    public static final String RootAspect = "root";
    public static final String SelectedIndexAspect = "selectedIndex";
    public static final String SelectedObjectAspect = "selectedObject";
    public static final String SelectedTitleAspect = "selectedTitle";
    public static final String SourceAspect = "source";
    public static final String TitlesAspect = "titles";
    public static final String ValueAspect = "value";
    public static final String URLAspect = "URL";
    public static int IgnoreValue;
    public static int UnsetValue;
    public static int SetValue;
    private static NSMutableDictionary _nameToRegisteredInstanceMap;
    private Object _object;
    private NSArray _aspects;
    private boolean _isExplicitlyDisabled;
    private boolean _isEnabledAspectBound;
    private boolean _useIndexForEnabledAspect;
    private boolean _isConnected;
    private NSMutableDictionary _bindingMap;

}
