
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;


class _EODBCtxEntityInfo {


    _EODBCtxEntityInfo() { return null; }

    public void _releaseRelMaps() {}

    public void computeInfoForEntityObject(EOEntity entity, EOEnterpriseObject eo) {}

    public void computeRelationshipInfoForEntityObjectRow(EOEntity entity, Object eo, NSDictionary row) {}

    public static _EODBCtxEntityInfo infoForEntityObjectRow(EOEntity entity, EOEnterpriseObject eo, NSDictionary row) { return null; }

    protected Class _lastClass;
    protected Object _rowToObjectAttributeMap[];
    protected Object _relValueToObjectMap[];
    protected Object _relationshipToObjectMap[];
    protected int _attributeCount;
    protected int _relValueCount;
    protected int _relationshipCount;
    protected boolean _needToCheckRels;

}
