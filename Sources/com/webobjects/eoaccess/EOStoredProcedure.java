
package com.webobjects.eoaccess;

import com.webobjects.foundation.*;
import java.util.Enumeration;


public class EOStoredProcedure
    implements EOPropertyListEncoding {


    public EOStoredProcedure(String name) { return null; }

    public String name() { return null; }

    public String externalName() { return null; }

    public EOModel model() { return null; }

    public NSArray arguments() { return null; }

    public NSDictionary userInfo() { return null; }

    public NSDictionary _internalInfo() { return null; }

    protected boolean _isIdentifierStartingChar(char ch) { return true; }

    protected boolean _isIdentifierChar(char ch) { return true; }

    public void setName(String name) {}

    public void setExternalName(String externalName) {}

    public void setArguments(NSArray arguments) {}

    public void setUserInfo(NSDictionary aDictionary) {}

    public void _setInternalInfo(NSDictionary aDictionary) {}

    public String toString() { return null; }

    public String _toString(int indent) { return null; }

    public EOStoredProcedure(NSDictionary propertyList, Object owner) { return null; }

    public void awakeWithPropertyList(NSDictionary nsdictionary) {}

    public void encodeIntoPropertyList(NSMutableDictionary result) {}

    protected void _setIsEdited() {}

    protected void _setModel(EOModel model) {}

    public void beautifyName() {}

    protected String _name;
    protected String _externalName;
    protected EOModel _model;
    protected NSArray _arguments;
    protected NSDictionary _userInfo;
    protected NSDictionary _internalInfo;

}
