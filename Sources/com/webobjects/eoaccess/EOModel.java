
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;


public class EOModel
    implements NSDisposable {
    public static class _DefaultModelCreator {


        static void _registerDefaultModelCreator() {}

        static void _unregisterDefaultModelCreator() {}

        _DefaultModelCreator() { return null; }

        public void _classDescriptionNeeded(NSNotification notification) {}

        static  {}

        private static _DefaultModelCreator _defaultModelCreator;

    }

    protected static class EOModelFileNameFilter
        implements FilenameFilter {

        protected EOModelFileNameFilter() { return null; }

        public boolean accept(File dir, String name) { return true; }
    }



    public void dispose() {}

    public EOModel() { return null; }

    void init() { return null; }

    public String toString() { return null; }

    public String _toString(int indent) { return null; }

    public String name() { return null; }

    /**
     * @deprecated Method path is deprecated
     */

    public String path() { return null; }

    public URL pathURL() { return null; }

    public NSArray entityNames() { return null; }

    public EOEntity entityNamed(String name) { return null; }

    public NSArray entities() { return null; }

    public EOEntity entityForObject(EOEnterpriseObject object) { return null; }

    public String adaptorName() { return null; }

    public NSDictionary connectionDictionary() { return null; }

    public NSDictionary userInfo() { return null; }

    public NSArray entitiesWithSharedObjects() { return null; }

    public NSDictionary _internalInfo() { return null; }

    public EOModelGroup modelGroup() { return null; }

    public NSArray storedProcedureNames() { return null; }

    public EOStoredProcedure storedProcedureNamed(String name) { return null; }

    public NSArray storedProcedures() { return null; }

    public static String entityPrototypeNameForAdaptor(EOAdaptor adaptor) { return null; }

    public static String entityPrototypePlugInNameForAdaptor(EOAdaptor adaptor) { return null; }

    private void addAttributesToPrototypesCache(NSArray attributes) {}

    private void removeAttributesToPrototypesCache(NSArray attributes) {}

    private void createPrototypeCache() {}

    public EOAttribute prototypeAttributeNamed(String name) { return null; }

    public NSArray availablePrototypeAttributeNames() { return null; }

    /**
     * @deprecated Method EOModel is deprecated
     */

    public EOModel(String path) { return null; }

    public EOModel(URL url) { return null; }

    public String _filenameForFetchSpecificationDictionaryForEntityNamedWithModelPath(String entityName, String modelPath) { return null; }

    public boolean _writeFetchSpecificationDictionaryForEntityNamedToModelPath(NSDictionary fetchSpecDict, String entityName, String modelPath) { return true; }

    private void write() {}

    public void writeToFile(String path) {}

    public NSMutableDictionary _loadFetchSpecificationDictionaryForEntityNamed(String entityName) { return null; }

    protected EOModel(NSDictionary propertyList, String path) { return null; }

    protected EOModel(NSDictionary propertyList, URL url) { return null; }

    protected void _initWithTableOfContentsPropertyListPathURL(NSDictionary propertyList, URL url) {}

    public void encodeTableOfContentsIntoPropertyList(NSMutableDictionary result) {}

    EOModel(NSDictionary propertyList, Object owner) { return null; }

    void _initializeInfo(NSDictionary propertyList) { return null; }

    public void _initWithPropertyListOwner(NSDictionary propertyList, Object owner) {}

    void awakeWithPropertyList(NSDictionary nsdictionary) { return null; }

    void encodeIntoPropertyList(NSMutableDictionary result) { return null; }

    public void _setEntityForEntityNameClassName(Object entity, String entityName, String className) {}

    public EOEntity _addEntity(EOEntity anEntity) { return null; }

    public void _addFakeEntityWithPropertyList(NSDictionary propertyList) {}

    public Object _addEntityWithPropertyList(Object propertyList) throws InstantiationException, IllegalAccessException { return null; }

    public void _removeEntity(Object entity) {}

    public void _setInheritanceLinks(NSDictionary pl) {}

    public void _registerChildForParent(String child, String parent) {}

    public NSArray _childrenForEntityNamed(String entity) { return null; }

    protected EOEntity _entityForClass(Class aClass) { return null; }

    protected void _setPathURL(URL url) {}

    static String _canonicalPath(String path) { return null; }

    public NSArray _instantiatedEntities() { return null; }

    public void _classDescriptionNeededForEntityName(NSNotification notification) {}

    public void _classDescriptionNeededForClass(NSNotification notification) {}

    public static boolean _isPrototypesEntity(EOEntity entity) { return null; }

    public void _resetPrototypeCache() {}

    public void setName(String newName) {}

    public void setAdaptorName(String adaptorName) {}

    public void setConnectionDictionary(NSDictionary connectionDictionary) {}

    public void setUserInfo(NSDictionary dictionary) {}

    public void _setEntitiesWithSharedObjects(NSArray entities) {}

    public void _setInternalInfo(NSDictionary dictionary) {}

    public void addEntity(EOEntity entity) {}

    protected void _removePropertiesReferencingEntity(EOEntity entity) {}

    public void removeEntity(EOEntity entity) {}

    public void removeEntityAndReferences(EOEntity entity) {}

    public void addStoredProcedure(EOStoredProcedure storedProcedure) {}

    public void removeStoredProcedure(EOStoredProcedure storedProcedure) {}

    public void setModelGroup(EOModelGroup group) {}

    public void loadAllModelObjects() {}

    public NSArray referencesToProperty(Object property) { return null; }

    public NSArray externalModelsReferenced() { return null; }

    public void beautifyNames() {}

    protected NSArray _externalModelsReferencedByEntities(NSArray entities) { return null; }

    NSArray externalModelsCurrentlyReferenced() { return null; }

    void unbindFromExternalReferences() { return null; }

    static  {}

    protected EOModelGroup _group;
    protected String _name;
    protected URL _url;
    protected NSDictionary _userInfo;
    protected NSDictionary _internalInfo;
    protected NSDictionary _connectionDictionary;
    protected String _adaptorName;
    protected NSMutableDictionary _entitiesByName;
    protected NSMutableDictionary _entitiesByClass;
    protected NSMutableArray _storedProcedures;
    protected NSArray _entities;
    protected NSArray _sharedObjectEntities;
    protected NSMutableDictionary _subEntitiesCache;
    protected NSMutableDictionary _prototypesByName;
    protected int _extraRefCount;
    static final String CURRENT_EOMODEL_VERSION = "2.1";
    public static final String EntityLoadedNotification = "EOEntityLoadedNotification";
    static final String ModelExtension = "eomodeld";
    static final String IndexFilename = "index.eomodeld";
    private static final NSSelector _classDescriptionNeededForClassSelector;
    private static final NSSelector _classDescriptionNeededForEntityNameSelector;
    private static final NSSelector _storedProcedureNamedSelector;
    static final NSSelector _classDescriptionNeededSelector;
    protected static ReentrantLock _EOGlobalModelLock;
    static final String prototypesKeyPrefix = "EO";
    static final String prototypesKeySuffix = "Prototypes";
    static final String prototypesToHideKey = "EOPrototypesToHide";

}
