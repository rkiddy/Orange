
package com.webobjects.eodistribution.client;

import com.webobjects.eocontrol.*;
import com.webobjects.eodistribution.common._EOReferenceRecordingCoding;
import com.webobjects.foundation.*;
import java.lang.reflect.Constructor;
import java.text.Format;
import java.util.Enumeration;


public class EODistributedClassDescription extends EOClassDescription
    implements NSCoding, _EOReferenceRecordingCoding {


    private EODistributedClassDescription() { return null; }

    public EODistributedClassDescription(Class theClass) { return null; }

    public EODistributedClassDescription(String name, Class theClass) { return null; }

    private void _commonInit(String name) {}

    public String entityName() { return null; }

    public EOEnterpriseObject createInstanceWithEditingContext(EOEditingContext ec, EOGlobalID gid) { return null; }

    public EOAttribute attributeNamed(String key) { return null; }

    public EORelationship relationshipNamed(String key) { return null; }

    public NSArray attributeKeys() { return null; }

    public NSArray toOneRelationshipKeys() { return null; }

    public NSArray toManyRelationshipKeys() { return null; }

    public Class classForAttributeKey(String key) { return null; }

    public NSMutableDictionary _newDictionaryForProperties() { return null; }

    public String inverseForRelationshipKey(String relationshipKey) { return null; }

    public int deleteRuleForRelationshipKey(String relationshipKey) { return 0; }

    public boolean ownsDestinationObjectsForRelationshipKey(String relationshipKey) { return true; }

    public EOClassDescription classDescriptionForDestinationKey(String detailKey) { return null; }

    public Object validateValueForKey(Object value, String key) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    public void awakeObjectFromInsertion(EOEnterpriseObject target, EOEditingContext ec) {}

    public void awakeObjectFromFetch(EOEnterpriseObject eo, EOEditingContext ec) {}

    public Format defaultFormatterForKey(String key) { return null; }

    boolean usesDeferredFault() { return null; }

    public Class classForCoder() { return null; }

    public static Object decodeObject(NSCoder coder) { return null; }

    public void encodeWithCoder(NSCoder coder) {}

    public boolean shouldRecordCodingReferences() { return true; }

    static  {}

    private static final long serialVersionUID = 0x6fe1cb64L;
    public static final Class _CLASS;
    protected String _name;
    private static final Class threeArgumentConstructor[];
    private static final Class oneArgumentConstructor[];
    private static final Class defaultConstructor[];
    private static final Object _threeArgumentsMarker[];
    private Class _constructorClass;
    private Constructor _constructor;
    private Object _arguments[];
    private boolean _useSetClassDescription;
    private NSDictionary _attributes;
    private NSDictionary _toOneRelationships;
    private NSDictionary _toManyRelationships;
    private NSArray _attributeKeys;
    private NSArray _toOneRelationshipKeys;
    private NSArray _toManyRelationshipKeys;
    private com.webobjects.eocontrol._EOMutableKnownKeyDictionary.Initializer _propertyDictionaryInitializer;
    private Class _concreteClass;
    private Class _class;
    private int _usesDeferredFault;

}
