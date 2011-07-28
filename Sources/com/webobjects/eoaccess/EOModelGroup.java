
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.net.URL;
import java.util.*;


public class EOModelGroup {
    public static interface ClassDelegate {

        public abstract EOModelGroup defaultModelGroup();
    }

    public static interface Delegate {

        public abstract EORelationship relationshipForRow(EOEntity eoentity, NSDictionary nsdictionary, EORelationship eorelationship);

        public abstract EOEntity subEntityForEntity(EOEntity eoentity, NSDictionary nsdictionary);

        public abstract Class failedToLookupClassNamed(EOEntity eoentity, String s);

        public abstract Class classForObjectWithGlobalID(EOEntity eoentity, EOGlobalID eoglobalid);

        public abstract EOEntity relationshipFailedToLookupDestinationWithName(EORelationship eorelationship, String s);
    }



    public EOModelGroup() { return null; }

    public String toString() { return null; }

    public static void setClassDelegate(Object delegate) { return null; }

    public static Object classDelegate() { return null; }

    public static EOModelGroup globalModelGroup() { return null; }

    public static EOModelGroup defaultGroup() { return null; }

    public static void setDefaultGroup(EOModelGroup group) { return null; }

    public NSArray models() { return null; }

    public NSArray modelNames() { return null; }

    public EOModel modelNamed(String name) { return null; }

    public void addModel(EOModel model) {}

    /**
     * @deprecated Method addModelWithPath is deprecated
     */

    public EOModel addModelWithPath(String path) { return null; }

    public EOModel addModelWithPathURL(URL url) { return null; }

    /**
     * @deprecated Method modelWithPath is deprecated
     */

    public EOModel modelWithPath(String path) { return null; }

    public EOModel modelWithPathURL(URL url) { return null; }

    public EOEntity entityNamed(String name) { return null; }

    public EOStoredProcedure storedProcedureNamed(String name) { return null; }

    public EOFetchSpecification fetchSpecificationNamed(String fetchSpecName, String entityName) { return null; }

    public EOEntity entityForObject(EOEnterpriseObject object) { return null; }

    void unbindAllModels() { return null; }

    void unbindReferencesToModel(EOModel target) { return null; }

    public void removeModel(EOModel model) {}

    public void loadAllModelObjects() {}

    public Object _mthdelegate() { return null; }

    public void setDelegate(Object delegate) {}

    protected void _addSubEntitiesCache(NSDictionary cache) {}

    protected void _registerChildForParent(String child, String parent) {}

    protected NSArray _childrenForEntityNamed(String entity) { return null; }

    static NSMutableDictionary projectPathToModelGroup() { return null; }

    static EOModelGroup modelGroupForLoadedBundles() { return null; }

    static void flushModelGroupCache() {}

    void addModelsFromDirectory(String directoryPath) { return null; }

    public NSArray entitiesWithSharedObjects() { return null; }

    public static void setModelGroupForObjectStoreCoordinator(EOObjectStoreCoordinator objectCoord, EOModelGroup group) { return null; }

    public static EOModelGroup modelGroupForObjectStoreCoordinator(EOObjectStoreCoordinator objectCoord) { return null; }

    static  {}

    protected NSMutableDictionary _modelsByName;
    protected NSMutableDictionary _subEntitiesCache;
    protected _NSDelegate _delegate;
    protected boolean _delegateRespondsTo_relationshipForRow;
    protected boolean _delegateRespondsTo_subEntityForEntity;
    protected boolean _delegateRespondsTo_failedToLookupClassNamed;
    protected boolean _delegateRespondsTo_classForObjectWithGlobalID;
    protected boolean _delegateRespondsTo_relationshipFailedToLookupDestinationWithName;
    public static final String ModelInvalidatedNotification = "EOModelInvalidatedNotification";
    public static final String ModelAddedNotification = "EOModelAddedNotification";
    private static final _NSDelegate _groupClassDelegate;
    private static volatile EOModelGroup _defaultGroup;
    private static volatile EOModelGroup _globalGroup;
    private static NSMutableDictionary _projectPathToModelGroup;

}
