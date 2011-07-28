
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.foundation.*;
import java.io.PrintStream;


public class EOControllerFactory
    implements NSDisposable, com.webobjects.eoapplication.EOController._DisposeCallback {
    public static class _SpecificationData {


        public _SpecificationData() { return null; }

        public void setRootObjectArchive(NSDictionary archive) {}

        public NSDictionary rootObjectArchive() { return null; }

        public void setReuseMode(int reuseMode) {}

        public int reuseMode() { return 0; }

        public void setCacheSize(int cacheSize) {}

        public int cacheSize() { return 0; }

        public int numberOfProvidedControllers() { return 0; }

        public int numberOfCachedControllers() { return 0; }

        public boolean canCacheAnotherController() { return true; }

        public EOController provideCachedControllerIfAvailable() { return null; }

        public void registerControllerAsProvided(EOController controller) {}

        public void registerControllerAsCached(EOController controller) {}

        public void unregisterController(EOController controller) {}

        public void unregisterAllControllers() {}

        public NSArray providedControllers() { return null; }

        public NSArray cachedControllers() { return null; }

        public boolean isControllerRegisteredAsProvided(EOController controller) { return true; }

        public void moveControllerToBackInRegistry(EOController controller) {}

        static  {}

        private NSDictionary _rootObjectArchive;
        private int _reuseMode;
        private int _cacheSize;
        private NSMutableArray _providedControllers;
        private NSMutableArray _cachedControllers;
        public static _SpecificationData _unavailablePlaceholder;

    }

    public static class _XMLProvider {


        public _XMLProvider() { return null; }

        public Object _provideXML(NSDictionary specification) { return null; }

        public Object[] _provideXMLs(NSArray specifications) { return null; }

        static  {}

        public static final Class _CLASS = null;

    }

    public static class ControllerTaskAdaptor
        implements ControllerTaskCallback {


        public ControllerTaskAdaptor() { return null; }

        public boolean prepareTask(EOController controller, Object parameters[]) { return true; }

        public boolean performTask(EOController controller, Object parameters[]) { return true; }

        public boolean finishTask(EOController controller, Object parameters[]) { return true; }

        static  {}

        public static final Class _CLASS = null;

    }

    public static interface ControllerTaskCallback {


        public abstract boolean prepareTask(EOController eocontroller, Object aobj[]);

        public abstract boolean performTask(EOController eocontroller, Object aobj[]);

        public abstract boolean finishTask(EOController eocontroller, Object aobj[]);



        public static final Class _CLASS = null;

    }

    public static interface Delegate {


        public abstract NSDictionary controllerFactoryWillEvaluateRules(EOControllerFactory eocontrollerfactory, NSDictionary nsdictionary);

        public abstract NSArray controllerFactoryWillUseActions(EOControllerFactory eocontrollerfactory, NSArray nsarray);

        public abstract boolean controllerFactoryShouldActivateDefaultControllers(EOControllerFactory eocontrollerfactory);

        public abstract boolean controllerFactoryShouldCacheController(EOControllerFactory eocontrollerfactory, EOController eocontroller);

        public abstract int controllerFactoryWillReuseControllersForSpecificationWithMode(EOControllerFactory eocontrollerfactory, int i, NSDictionary nsdictionary);

        public abstract NSArray controllerFactoryWillReturnPropertyKeysForEntityAndTaskName(EOControllerFactory eocontrollerfactory, NSArray nsarray, String s, String s1);

        public abstract EOController controllerFactoryWillReturnControllerForSpecification(EOControllerFactory eocontrollerfactory, EOController eocontroller, NSDictionary nsdictionary);

        public abstract NSDictionary controllerFactoryWillUseSpecificationForController(EOControllerFactory eocontrollerfactory, NSDictionary nsdictionary, String s, String s1);

        public abstract NSDictionary controllerFactoryWillUseSpecificationForWindowController(EOControllerFactory eocontrollerfactory, NSDictionary nsdictionary, String s);

        public abstract NSDictionary controllerFactoryWillUseSpecificationForModalDialogController(EOControllerFactory eocontrollerfactory, NSDictionary nsdictionary, String s);

        public abstract NSDictionary controllerFactoryWillUseSpecificationForModalDialogWithSelectController(EOControllerFactory eocontrollerfactory, NSDictionary nsdictionary, String s);

        public abstract NSDictionary controllerFactoryWillUseSpecificationForModalDialogWithSelectByInsertingController(EOControllerFactory eocontrollerfactory, NSDictionary nsdictionary, String s);

        public abstract NSDictionary controllerFactoryWillUseSpecificationForWindowWithQueryController(EOControllerFactory eocontrollerfactory, NSDictionary nsdictionary, String s);

        public abstract NSDictionary controllerFactoryWillUseSpecificationForWindowWithInsertController(EOControllerFactory eocontrollerfactory, NSDictionary nsdictionary, String s);

        public abstract NSDictionary controllerFactoryWillUseSpecificationForWindowWithOpenController(EOControllerFactory eocontrollerfactory, NSDictionary nsdictionary, String s);

        public abstract NSDictionary controllerFactoryWillUseSpecificationForWindowWithListController(EOControllerFactory eocontrollerfactory, NSDictionary nsdictionary, String s);



        public static final Class _CLASS = null;

    }

    public static interface List
        extends EOObjectDisplay {


        public abstract void listObjectsWithFetchSpecification(EOFetchSpecification eofetchspecification);

        public abstract void listObjectsWithGlobalIDs(NSArray nsarray);



        public static final Class _CLASS = null;

    }

    public static interface Select
        extends EOObjectDisplay {


        public abstract void prepareToSelect(boolean flag, boolean flag1);

        public abstract EOGlobalID provideSelectedObjectGlobalID();

        public abstract NSArray provideSelectedObjectsGlobalIDs();

        public abstract void finishSelecting();



        public static final Class _CLASS = null;

    }

    public static interface Query
        extends EOObjectDisplay {


        public abstract void queryObjectsWithFetchSpecification(EOFetchSpecification eofetchspecification);



        public static final Class _CLASS = null;

    }

    public static interface SelectByInserting
        extends Insert {


        public abstract void prepareToSelectByInserting();

        public abstract EOGlobalID provideSelectedObjectGlobalID();

        public abstract void finishSelecting();



        public static final Class _CLASS = null;

    }

    public static interface Insert
        extends EOObjectDisplayDocument {


        public abstract boolean insertNewObject();

        public abstract boolean insertNewObjectWithRelationshipPathsFilled(NSDictionary nsdictionary);



        public static final Class _CLASS = null;

    }

    public static interface Open
        extends EOObjectDisplayDocument {


        public abstract void openObjectWithGlobalID(EOGlobalID eoglobalid);



        public static final Class _CLASS = null;

    }



    public static EOControllerFactory createSharedControllerFactoryWithClass(String className) { return null; }

    public static EOControllerFactory sharedControllerFactory() { return null; }

    public static void _useXMLProviderIfNotSpecified(_XMLProvider xmlProvider) { return null; }

    public static void _setXMLProvider(_XMLProvider xmlProvider) { return null; }

    public static _XMLProvider _xmlProvider() { return null; }

    public EOControllerFactory() { return null; }

    private void _disposeWithSpecificationData(_SpecificationData specificationData) {}

    private void _disposeAllSpecificationDatas() {}

    public void dispose() {}

    public void setDelegate(Object delegate) {}

    public Object _mthdelegate() { return null; }

    public void performTaskWithController(EOController controller, ControllerTaskCallback callback, Object parameters[]) {}

    public void setCachesControllers(boolean flag) {}

    public boolean cachesControllers() { return true; }

    public void invalidateRules() {}

    protected Object _concreteEvaluateRules(NSDictionary specification) { return null; }

    protected Object[] _concreteEvaluateMultipleRules(NSArray specifications) { return null; }

    private NSDictionary _evaluationSpecification(NSDictionary specification) { return null; }

    public Object evaluateRules(NSDictionary specification) { return null; }

    public Object[] _evaluateMultipleRules(NSArray specifications) { return null; }

    public NSDictionary _specificationWithParameters(String questionName, String entityName, String taskName) { return null; }

    protected void _concreteGenerateSpecificationsAndActions() {}

    public NSArray _defaultSpecifications() { return null; }

    public NSArray _availableSpecifications() { return null; }

    public NSArray actions() { return null; }

    private NSMutableDictionary _specificationIdentifierToDatasMapTable() { return null; }

    public String _uniqueDescriptionForEntityAndTaskName(String entityName, String taskName) { return null; }

    protected NSArray _concretePropertyKeysForEntityAndTaskName(String entityName, String taskName) { return null; }

    public NSArray propertyKeysForEntityAndTaskName(String entityName, String taskName) { return null; }

    private NSArray _expandedKeyPathsForEntityName(String entityName, NSArray keys, NSMutableArray entityHierarchy) { return null; }

    public NSArray expandedKeyPathsForEntityName(String entityName, String key) { return null; }

    public NSArray expandedKeyPathsForEntityName(String entityName, NSArray keys) { return null; }

    protected void _activateDefaultControllers() {}

    public void activateDefaultControllers() {}

    public String _uniqueDescriptionForSpecification(NSDictionary specification) { return null; }

    protected EOController _controllerWithSpecificationAndNonReusableControllers(NSDictionary specification, NSArray nonReusableControllers, boolean checkRulesIfUnknown) { return null; }

    public EOController controllerWithSpecification(NSDictionary specification, boolean checkRulesIfUnknown) { return null; }

    protected int defaultReuseModeForSpecification(NSDictionary specification) { return 0; }

    private void _setRootObjectArchiveOfSpecificationData(_SpecificationData specificationData, NSDictionary specification, NSDictionary archive) {}

    protected NSDictionary _concreteControllerArchiveWithSpecification(NSDictionary specification) { return null; }

    private boolean _archivesAreIdentical(Object object1, Object object2) { return true; }

    private _SpecificationData _specificationDataWithIdenticalControllerArchive(NSDictionary archive) { return null; }

    public _SpecificationData _specificationDataIfAvailable(NSDictionary specification, boolean ensureControllerArchiveIsAvailable, boolean checkRulesIfUnknown) { return null; }

    public boolean hasControllerWithSpecification(NSDictionary specification, boolean checkRulesIfUnknown) { return true; }

    public EOController controllerWithEntityName(EOController rootController, Class controllerInterface, String entityName) { return null; }

    public boolean _shouldControllerBeDisposed(EOController controller) { return true; }

    public void _controllerDisposed(EOController controller) {}

    private EOController _controllerWithEntityAndTaskName(String entityName, String taskName) { return null; }

    public EOController queryControllerWithEntity(String entityName) { return null; }

    public EOController listControllerWithEntity(String entityName) { return null; }

    public EOController formControllerWithEntity(String entityName) { return null; }

    public EOController selectControllerWithEntity(String entityName) { return null; }

    public EOController editorControllerWithEntity(String entityName) { return null; }

    public boolean _isMainEntity(String entityName) { return true; }

    public boolean _isEnumerationEntity(String entityName) { return true; }

    public boolean _isRootLevelEntity(String entityName) { return true; }

    private NSDictionary _specificationForWindowWithTaskName(String taskName) { return null; }

    public boolean canOpenWindowForTaskName(String taskName) { return true; }

    public EOController openWindowForTaskName(String taskName) { return null; }

    private NSDictionary _specificationForModalDialogWithTaskName(String taskName) { return null; }

    public boolean canOpenModalDialogForTaskName(String taskName) { return true; }

    public EOController openModalDialogForTaskName(String taskName) { return null; }

    private NSDictionary _specificationForModalSelectDialogWithEntityName(String entityName) { return null; }

    public boolean canSelectWithEntityName(String entityName) { return true; }

    public NSArray selectWithEntityName(String entityName, boolean allowsMultipleGlobalIDs, boolean allowsInserting) { return null; }

    private NSDictionary _specificationForModalSelectByInsertingDialogWithEntityName(String entityName) { return null; }

    public boolean canSelectByInsertingWithEntityName(String entityName) { return true; }

    public EOGlobalID selectByInsertingWithEntityName(String entityName) { return null; }

    private NSDictionary _specificationForQueryWindowWithEntityName(String entityName) { return null; }

    public boolean canQueryWithEntityName(String entityName) { return true; }

    public Query queryWithEntityName(String entityName) { return null; }

    private NSDictionary _specificationForInsertWindowWithEntityName(String entityName) { return null; }

    public boolean canInsertWithEntityName(String entityName) { return true; }

    public Insert insertWithEntityName(String entityName) { return null; }

    protected boolean _makeDocumentsWithGlobalIDVisible(String entityName, EOGlobalID globalID) { return true; }

    private NSDictionary _specificationForOpenWindowWithEntityName(String entityName) { return null; }

    public boolean canOpenGlobalIDsWithEntityName(String entityName) { return true; }

    protected Open _openGlobalIDWithEntityName(String entityName, EOGlobalID globalID, NSMutableArray nonReusableTopLevelControllers) { return null; }

    public Open openGlobalIDWithEntityName(String entityName, EOGlobalID globalID) { return null; }

    public NSArray openGlobalIDsWithEntityName(String entityName, NSArray globalIDs) { return null; }

    public boolean canOpenWithEntityName(String entityName) { return true; }

    public Open openSingleWithEntityName(String entityName) { return null; }

    public NSArray openWithEntityName(String entityName) { return null; }

    private NSDictionary _specificationForListWindowWithEntityName(String entityName) { return null; }

    public boolean canListWithEntityName(String entityName) { return true; }

    public List listWithEntityName(String entityName) { return null; }

    public List listFetchSpecificationWithEntityName(String entityName, EOFetchSpecification fetchSpecification) { return null; }

    public List listGlobalIDsWithEntityName(String entityName, NSArray globalIDs) { return null; }

    public void _printFactoryInformation() {}

    public void _toggleXMLLogging() {}

    public void _setLogsXML(boolean flag) {}

    public boolean _logsXML() { return true; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS = null;
    public static final String QuestionSpecification = "question";
    public static final String TaskSpecification = "task";
    public static final String EntitySpecification = "entity";
    public static final String LocalesSpecification = "locales";
    public static final String PlatformsSpecification = "platforms";
    public static final String _AssistantActionsQuestion = "assistantActions";
    public static final String UserInterfaceParametersQuestion = "userInterfaceParameters";
    public static final String ActionsQuestion = "actions";
    public static final String PropertyKeysQuestion = "propertyKeys";
    public static final String AvailableSpecificationsQuestion = "availableSpecifications";
    public static final String DefaultSpecificationsQuestion = "defaultSpecifications";
    public static final String ControllerQuestion = "controller";
    public static final String TopLevelWindowQuestion = "window";
    public static final String TopLevelModalDialogQuestion = "modalDialog";
    public static final String IdentifyTask = "identify";
    public static final String QueryTask = "query";
    public static final String ListTask = "list";
    public static final String FormTask = "form";
    public static final String SelectTask = "select";
    public static final String EditorTask = "editor";
    public static final String _SpecificationKey = "specification";
    public static final int NeverReuseController = 0;
    public static final int ReuseControllerIfNotEdited = 1;
    public static final int ReuseControllerAfterSave = 2;
    public static final int ReuseControllerIfInvisible = 3;
    public static final int AlwaysReuseController = 4;
    public static final String ReuseModeParameter = "reuseMode";
    public static final String CacheSizeParameter = "cacheSize";
    private static final String controllerFactoryWillEvaluateRules = "controllerFactoryWillEvaluateRules";
    private static final String controllerFactoryWillUseActions = "controllerFactoryWillUseActions";
    private static final String controllerFactoryShouldActivateDefaultControllers = "controllerFactoryShouldActivateDefaultControllers";
    private static final String controllerFactoryShouldCacheController = "controllerFactoryShouldCacheController";
    private static final String controllerFactoryWillReuseControllersForSpecificationWithMode = "controllerFactoryWillReuseControllersForSpecificationWithMode";
    private static final String controllerFactoryWillReturnPropertyKeysForEntityAndTaskName = "controllerFactoryWillReturnPropertyKeysForEntityAndTaskName";
    private static final String controllerFactoryWillReturnControllerForSpecification = "controllerFactoryWillReturnControllerForSpecification";
    private static final String controllerFactoryWillUseSpecificationForController = "controllerFactoryWillUseSpecificationForController";
    private static final String controllerFactoryWillUseSpecificationForWindowController = "controllerFactoryWillUseSpecificationForWindowController";
    private static final String controllerFactoryWillUseSpecificationForModalDialogController = "controllerFactoryWillUseSpecificationForModalDialogController";
    private static final String controllerFactoryWillUseSpecificationForModalDialogWithSelectController = "controllerFactoryWillUseSpecificationForModalDialogWithSelectController";
    private static final String controllerFactoryWillUseSpecificationForModalDialogWithSelectByInsertingController = "controllerFactoryWillUseSpecificationForModalDialogWithSelectByInsertingController";
    private static final String controllerFactoryWillUseSpecificationForWindowWithQueryController = "controllerFactoryWillUseSpecificationForWindowWithQueryController";
    private static final String controllerFactoryWillUseSpecificationForWindowWithInsertController = "controllerFactoryWillUseSpecificationForWindowWithInsertController";
    private static final String controllerFactoryWillUseSpecificationForWindowWithOpenController = "controllerFactoryWillUseSpecificationForWindowWithOpenController";
    private static final String controllerFactoryWillUseSpecificationForWindowWithListController = "controllerFactoryWillUseSpecificationForWindowWithListController";
    private static EOControllerFactory _sharedInstance;
    private static _XMLProvider _xmlProvider;
    private static EOAction _toggleXMLLoggingAction;
    protected _NSDelegate _delegate;
    private NSArray _actions;
    private NSMutableDictionary _entityAndTaskIdentifierToKeysMapTable;
    private NSArray _availableSpecifications;
    private NSArray _defaultSpecifications;
    private NSMutableDictionary _specificationIdentifierToDatasMapTable;
    private boolean _cachesControllers;
    private boolean _logsXML;


    // Unreferenced inner class com/webobjects/eogeneration/EOControllerFactory$1

/* anonymous class */
    class _cls1 extends ControllerTaskAdaptor {


        _cls1() { return null; }

        final EOControllerFactory this$0;

    }


    // Unreferenced inner class com/webobjects/eogeneration/EOControllerFactory$2

/* anonymous class */
    class _cls2 extends ControllerTaskAdaptor {


        _cls2() { return null; }

        final EOControllerFactory this$0;

    }


    // Unreferenced inner class com/webobjects/eogeneration/EOControllerFactory$3

/* anonymous class */
    class _cls3 extends ControllerTaskAdaptor {


        _cls3() { return null; }

        final EOControllerFactory this$0;

    }


    // Unreferenced inner class com/webobjects/eogeneration/EOControllerFactory$4

/* anonymous class */
    class _cls4 extends ControllerTaskAdaptor {


        _cls4() { return null; }

        public boolean prepareTask(EOController selectController, Object parameters[]) { return true; }

        public boolean finishTask(EOController selectController, Object parameters[]) { return true; }

        final EOControllerFactory this$0;

    }


    // Unreferenced inner class com/webobjects/eogeneration/EOControllerFactory$5

/* anonymous class */
    class _cls5 extends ControllerTaskAdaptor {


        _cls5() { return null; }

        public boolean prepareTask(EOController selectByInsertingController, Object parameters[]) { return true; }

        public boolean performTask(EOController selectByInsertingController, Object parameters[]) { return true; }

        public boolean finishTask(EOController controller3, Object parameters[]) { return true; }

        final EOControllerFactory this$0;

    }


    // Unreferenced inner class com/webobjects/eogeneration/EOControllerFactory$6

/* anonymous class */
    class _cls6 extends ControllerTaskAdaptor {


        _cls6() { return null; }

        public boolean performTask(EOController queryController, Object parameters[]) { return true; }

        final EOControllerFactory this$0;

    }


    // Unreferenced inner class com/webobjects/eogeneration/EOControllerFactory$7

/* anonymous class */
    class _cls7 extends ControllerTaskAdaptor {


        _cls7() { return null; }

        public boolean performTask(EOController insertController, Object parameters[]) { return true; }

        final EOControllerFactory this$0;

    }


    // Unreferenced inner class com/webobjects/eogeneration/EOControllerFactory$8

/* anonymous class */
    class _cls8 extends ControllerTaskAdaptor {


        _cls8() { return null; }

        public boolean performTask(EOController openController, Object parameters[]) { return true; }

        final EOControllerFactory this$0;

    }


    // Unreferenced inner class com/webobjects/eogeneration/EOControllerFactory$9

/* anonymous class */
    class _cls9 extends ControllerTaskAdaptor {


        _cls9() { return null; }

        public boolean performTask(EOController listController, Object parameters[]) { return true; }

        final EOControllerFactory this$0;

    }


    // Unreferenced inner class com/webobjects/eogeneration/EOControllerFactory$10

/* anonymous class */
    class _cls10 extends ControllerTaskAdaptor {


        _cls10() { return null; }

        public boolean performTask(EOController listController, Object parameters[]) { return true; }

        final EOControllerFactory this$0;

    }

}
