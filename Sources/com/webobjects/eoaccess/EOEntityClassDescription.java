
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.text.Format;


public class EOEntityClassDescription extends EOClassDescription {


    public EOEntityClassDescription(EOEntity entity) { return null; }

    public NSMutableDictionary _newDictionaryForProperties() { return null; }

    protected void _awakeFromRegistration() {}

    public String entityName() { return null; }

    public EOEntity entity() { return null; }

    public boolean isEntityReadOnly() { return true; }

    public EOFetchSpecification fetchSpecificationNamed(String name) { return null; }

    public EOClassDescription superClassDescription() { return null; }

    public EOKeyGlobalID _globalIDWithEntityName(String entityName, Object values[]) { return null; }

    public EOEnterpriseObject createInstanceWithEditingContext(EOEditingContext ec, EOGlobalID gid) { return null; }

    public Class classForAttributeKey(String key) { return null; }

    public NSArray attributeKeys() { return null; }

    public NSArray toOneRelationshipKeys() { return null; }

    public NSArray toManyRelationshipKeys() { return null; }

    public NSArray clientAttributeKeys() { return null; }

    public NSArray clientToOneRelationshipKeys() { return null; }

    public NSArray clientToManyRelationshipKeys() { return null; }

    public String inverseForRelationshipKey(String relationshipKey) { return null; }

    public int deleteRuleForRelationshipKey(String relationshipKey) { return 0; }

    public boolean ownsDestinationObjectsForRelationshipKey(String relationshipKey) { return true; }

    public NSArray allPropertyKeys() { return null; }

    public EOClassDescription classDescriptionForDestinationKey(String detailKey) { return null; }

    public EOClassDescription _concreteSubClassDescriptionForDeferredFault() { return null; }

    public Object validateValueForKey(Object valueP, String key) throws com.webobjects.foundation.NSValidation.ValidationException { return null; }

    public Exception validateObjectForSave(Object object) { return null; }

    public void awakeObjectFromInsertion(EOEnterpriseObject object, EOEditingContext ec) {}

    public void validateObjectForDelete(EOEnterpriseObject object) throws com.webobjects.foundation.NSValidation.ValidationException {}

    public Format defaultFormatterForKey(String key) { return null; }

    public Class _enforcedKVCNumberClassForKey(String key) { return null; }

    public NSArray allAttributeKeys() { return null; }

    public NSArray allToOneRelationshipKeys() { return null; }

    public NSArray allToManyRelationshipKeys() { return null; }

    private void writeObject(ObjectOutputStream s) throws IOException {}

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {}

    protected Object readResolve() throws ObjectStreamException { return null; }

    static  {}

    static final long serialVersionUID = 0xd1eafd1aL;
    protected transient EOEntity _entity;
    private static final Class threeArgumentConstructor[];
    private static final Class oneArgumentConstructor[];
    private static final Class defaultConstructor[];
    private static final Object _threeArgumentsMarker[];
    private transient Class _constructorClass;
    private transient Constructor _constructor;
    private transient Object _arguments[];
    private transient boolean _useSetClassDescription;
    private transient boolean _isPureGenericRecord;
    private String _entityName;
    private static final String SerializationEntityNameFieldKey = "entityName";
    private static final ObjectStreamField serialPersistentFields[];

}
