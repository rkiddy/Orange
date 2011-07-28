
package com.webobjects.eodistribution.common;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;


public class _EOSavingProxy
    implements NSCoding, _EODistributionCallbacks.Awake, _EODistributionCallbacks.Replace {


    public _EOSavingProxy(EOEnterpriseObject eo, EOGlobalID gid) { return null; }

    public _EOSavingProxy(EOEnterpriseObject eo, EOGlobalID gid, boolean insertedObject) { return null; }

    private _EOSavingProxy(EOGlobalID gid, EOClassDescription classDescription, NSArray properties, NSDictionary toManyRemoved, NSDictionary toManyAdded, boolean insertedObject) { return null; }

    EOGlobalID globalID() { return null; }

    public Class classForCoder() { return null; }

    public Object replacementEOInEditingContext(EOEditingContext editingContext, _EODistributionCallbacks.Replace.Callback data) { return null; }

    public void awakeInDistributionContext(_EODistributionCallbacks.Awake.Callback distributionContext) {}

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    static  {}

    public static final Class _CLASS;
    EOGlobalID _gid;
    boolean _insertedObject;
    NSArray _properties;
    EOClassDescription _classDescription;
    NSDictionary _toManyRemoved;
    NSDictionary _toManyAdded;
    EOEnterpriseObject _eo;
    boolean _needToInsertEOIntoEditingContext;

}
