
package com.webobjects.webservices.generation;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.*;
import com.webobjects.webservices.support.xml.WOEnterpriseObjectSerializationStrategy;


public class WOOperation extends WOComponent {


    public WOOperation(WOContext context) { return null; }

    public D2WContext d2wContext() { return null; }

    public void setD2wContext(D2WContext context) {}

    public EOEditingContext editingContext() { return null; }

    public static boolean requiresEntity() { return null; }

    public String unspecifiedArgumentKey() { return null; }

    public String gidArgumentKey() { return null; }

    public void saveChangesInEditingContext() {}

    public WOEnterpriseObjectSerializationStrategy serializationStrategy() { return null; }

    protected Object _invoke(D2WContext d2wcontext) { return null; }

    public NSArray aggregateValuesResult(NSArray resultArray) { return null; }

    public String propertyNameForPartName(String name) { return null; }

    private void _computeOperationParameters() {}

    public NSArray inputPartKeyPaths() { return null; }

    public NSArray inputPartNames() { return null; }

    public NSArray inputPartValues() { return null; }

    public NSArray comparisonKeys() { return null; }

    public NSArray attributeClassNames() { return null; }

    public Object invoke() { return null; }

    public String _argumentListDescription() { return null; }

    public String _argumentKeysDescription() { return null; }

    public boolean _operationIsNotSearch() { return true; }

    private void _computeSerializationParameters() {}

    public NSArray _keyPathsForSerialization() { return null; }

    public NSArray classesForKeyPaths() { return null; }

    public NSArray outputPartNames() { return null; }

    public NSArray outputPartKeyPaths() { return null; }

    public String _classesString() { return null; }

    private static final long serialVersionUID = 0xd8e8d2c3L;
    private D2WContext _d2wcontext;
    private WOEnterpriseObjectSerializationStrategy _serializationStrategy;
    private EOEditingContext _editingContext;
    private NSMutableArray _comparisonKeys;
    private NSMutableArray _attributeClassNames;
    private NSMutableArray _inputPartKeyPaths;
    private NSArray _keyPathsForSerialization;
    private NSMutableArray _outputPartKeyPaths;
    private NSMutableArray _classesForKeyPaths;

}
