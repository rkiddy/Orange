
package com.webobjects.webservices.generation;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.*;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.*;
import java.io.*;


public class _WSDirectAction extends WODirectAction {


    public _WSDirectAction(WORequest request) { return null; }

    private WOResponse _createSerializedResponse(Serializable dataObject) { return null; }

    public WOActionResults loadEOModelAction() { return null; }

    public WOActionResults revertD2WModelAction() { return null; }

    public WOActionResults loadD2WModelAction() { return null; }

    private Object _parameterFromRequest() { return null; }

    private boolean _pushModel() { return true; }

    public WOActionResults pushD2WModelAction() { return null; }

    public WOActionResults saveD2WModelAction() { return null; }

    private EOQualifier _operationQualifier(String operationName) { return null; }

    public WOActionResults freezeOperationAction() { return null; }

    static  {}

    public static final String _EODefaultJavaClientMimeType = "x-eojavaclient-message";
    public static final String NameKey = "name";
    public static final String AttributesKey = "attributes";
    public static final String RelationshipsKey = "relationships";
    public static final String FetchSpecificationsKey = "fetchSepcifications";
    public static final String ClassPropertyNamesKey = "classPropertyNames";
    public static final String PkAttributeNamesKey = "pkAttributeNames";
    public static final String ClassNameKey = "className";
    public static final String ValueTypeKey = "valueType";
    public static final String AllowsNullKey = "allowsNull";
    public static final String DestinationKey = "destination";
    public static final String IsMandatoryKey = "isMandatory";
    public static final String IsToManyKey = "isToMany";
    public static final String OperationNameKey = "operationName";
    public static final String LoadEOModelActionName = "loadEOModel";
    public static final String RevertD2WModelActionName = "revertD2WModel";
    public static final String LoadD2WModelActionName = "loadD2WModel";
    public static final String PushD2WModelActionName = "pushD2WModel";
    public static final String SaveD2WModelActionName = "saveD2WModel";
    public static final String FreezeOperationActionName = "freezeOperation";
    private static final int _AssistantAuthor = 100;
    private static final String _OperationNameLHSKey = "operationName";
    private static final String _OperationClassNameRHSKey = "operationClassName";
    private static final String _IsOperationFrozenRHSKey = "isOperationFrozen";

}
