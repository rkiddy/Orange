package com.webobjects.eogeneration;
public class EOControllerFactory implements com.webobjects.foundation.NSDisposable{
    public static final java.lang.String ActionsQuestion="actions";

    public static final int AlwaysReuseController=4;

    public static final java.lang.String AvailableSpecificationsQuestion="availableSpecifications";

    public static final java.lang.String CacheSizeParameter="cacheSize";

    public static final java.lang.String ControllerQuestion="controller";

    public static final java.lang.String DefaultSpecificationsQuestion="defaultSpecifications";

    public static final java.lang.String EditorTask="editor";

    public static final java.lang.String EntitySpecification="entity";

    public static final java.lang.String FormTask="form";

    public static final java.lang.String IdentifyTask="identify";

    public static final java.lang.String ListTask="list";

    public static final java.lang.String LocalesSpecification="locales";

    public static final int NeverReuseController=0;

    public static final java.lang.String PlatformsSpecification="platforms";

    public static final java.lang.String PropertyKeysQuestion="propertyKeys";

    public static final java.lang.String QueryTask="query";

    public static final java.lang.String QuestionSpecification="question";

    public static final int ReuseControllerAfterSave=2;

    public static final int ReuseControllerIfInvisible=3;

    public static final int ReuseControllerIfNotEdited=1;

    public static final java.lang.String ReuseModeParameter="reuseMode";

    public static final java.lang.String SelectTask="select";

    public static final java.lang.String TaskSpecification="task";

    public static final java.lang.String TopLevelModalDialogQuestion="modalDialog";

    public static final java.lang.String TopLevelWindowQuestion="window";

    public static final java.lang.String UserInterfaceParametersQuestion="userInterfaceParameters";

    public static class _XMLProvider { }

    public EOControllerFactory(){
         //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray actions(){
        return null; //TODO codavaj!!
    }

    public void activateDefaultControllers(){
        return; //TODO codavaj!!
    }

    public boolean cachesControllers(){
        return false; //TODO codavaj!!
    }

    public boolean canInsertWithEntityName(java.lang.String entityName){
        return false; //TODO codavaj!!
    }

    public boolean canListWithEntityName(java.lang.String entityName){
        return false; //TODO codavaj!!
    }

    public boolean canOpenGlobalIDsWithEntityName(java.lang.String entityName){
        return false; //TODO codavaj!!
    }

    public boolean canOpenModalDialogForTaskName(java.lang.String taskName){
        return false; //TODO codavaj!!
    }

    public boolean canOpenWindowForTaskName(java.lang.String taskName){
        return false; //TODO codavaj!!
    }

    public boolean canOpenWithEntityName(java.lang.String entityName){
        return false; //TODO codavaj!!
    }

    public boolean canQueryWithEntityName(java.lang.String entityName){
        return false; //TODO codavaj!!
    }

    public boolean canSelectByInsertingWithEntityName(java.lang.String entityName){
        return false; //TODO codavaj!!
    }

    public boolean canSelectWithEntityName(java.lang.String entityName){
        return false; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController controllerWithEntityName(com.webobjects.eoapplication.EOController rootController, java.lang.Class controllerInterface, java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController controllerWithSpecification(com.webobjects.foundation.NSDictionary specification, boolean checkRulesIfUnknown){
        return null; //TODO codavaj!!
    }

    public static com.webobjects.eogeneration.EOControllerFactory createSharedControllerFactoryWithClass(java.lang.String className){
        return null; //TODO codavaj!!
    }

    protected int defaultReuseModeForSpecification(com.webobjects.foundation.NSDictionary specification){
        return 0; //TODO codavaj!!
    }

    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from interface:
     * Invoked when the receiver should prepare itself for destruction. Implementations of this method should break connections that other objects have to the receiver, including unregistering for notifications, resigning as other objects' delegates, release locks and system resources, close files, and any other clean up operations.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController editorControllerWithEntity(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public java.lang.Object evaluateRules(com.webobjects.foundation.NSDictionary specification){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray expandedKeyPathsForEntityName(java.lang.String entityName, com.webobjects.foundation.NSArray keys){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray expandedKeyPathsForEntityName(java.lang.String entityName, java.lang.String key){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController formControllerWithEntity(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public boolean hasControllerWithSpecification(com.webobjects.foundation.NSDictionary specification, boolean checkRulesIfUnknown){
        return false; //TODO codavaj!!
    }

    public com.webobjects.eogeneration.EOControllerFactory.Insert insertWithEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public void invalidateRules(){
        return; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController listControllerWithEntity(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eogeneration.EOControllerFactory.List listFetchSpecificationWithEntityName(java.lang.String entityName, com.webobjects.eocontrol.EOFetchSpecification fetchSpecification){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eogeneration.EOControllerFactory.List listGlobalIDsWithEntityName(java.lang.String entityName, com.webobjects.foundation.NSArray globalIDs){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eogeneration.EOControllerFactory.List listWithEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray openGlobalIDsWithEntityName(java.lang.String entityName, com.webobjects.foundation.NSArray globalIDs){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eogeneration.EOControllerFactory.Open openGlobalIDWithEntityName(java.lang.String entityName, com.webobjects.eocontrol.EOGlobalID globalID){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController openModalDialogForTaskName(java.lang.String taskName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eogeneration.EOControllerFactory.Open openSingleWithEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController openWindowForTaskName(java.lang.String taskName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray openWithEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public void performTaskWithController(com.webobjects.eoapplication.EOController controller, com.webobjects.eogeneration.EOControllerFactory.ControllerTaskCallback callback, java.lang.Object[] parameters){
        return; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray propertyKeysForEntityAndTaskName(java.lang.String entityName, java.lang.String taskName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController queryControllerWithEntity(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eogeneration.EOControllerFactory.Query queryWithEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOGlobalID selectByInsertingWithEntityName(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eoapplication.EOController selectControllerWithEntity(java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    public com.webobjects.foundation.NSArray selectWithEntityName(java.lang.String entityName, boolean allowsMultipleGlobalIDs, boolean allowsInserting){
        return null; //TODO codavaj!!
    }

    public void setCachesControllers(boolean flag){
        return; //TODO codavaj!!
    }

    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    public static com.webobjects.eogeneration.EOControllerFactory sharedControllerFactory(){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    public static interface Delegate{
        abstract boolean controllerFactoryShouldActivateDefaultControllers(com.webobjects.eogeneration.EOControllerFactory factory);

        abstract boolean controllerFactoryShouldCacheController(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.eoapplication.EOController controller);

        abstract com.webobjects.foundation.NSDictionary controllerFactoryWillEvaluateRules(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSDictionary specification);

        abstract com.webobjects.eoapplication.EOController controllerFactoryWillReturnControllerForSpecification(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.eoapplication.EOController controller, com.webobjects.foundation.NSDictionary specification);

        abstract com.webobjects.foundation.NSArray controllerFactoryWillReturnPropertyKeysForEntityAndTaskName(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSArray keys, java.lang.String entityName, java.lang.String taskName);

        abstract int controllerFactoryWillReuseControllersForSpecificationWithMode(com.webobjects.eogeneration.EOControllerFactory factory, int reuseMode, com.webobjects.foundation.NSDictionary specification);

        abstract com.webobjects.foundation.NSArray controllerFactoryWillUseActions(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSArray actions);

        abstract com.webobjects.foundation.NSDictionary controllerFactoryWillUseSpecificationForController(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSDictionary specification, java.lang.String entityName, java.lang.String taskName);

        abstract com.webobjects.foundation.NSDictionary controllerFactoryWillUseSpecificationForModalDialogController(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSDictionary specification, java.lang.String taskName);

        abstract com.webobjects.foundation.NSDictionary controllerFactoryWillUseSpecificationForModalDialogWithSelectByInsertingController(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSDictionary specification, java.lang.String entityName);

        abstract com.webobjects.foundation.NSDictionary controllerFactoryWillUseSpecificationForModalDialogWithSelectController(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSDictionary specification, java.lang.String entityName);

        abstract com.webobjects.foundation.NSDictionary controllerFactoryWillUseSpecificationForWindowController(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSDictionary specification, java.lang.String taskName);

        abstract com.webobjects.foundation.NSDictionary controllerFactoryWillUseSpecificationForWindowWithInsertController(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSDictionary specification, java.lang.String entityName);

        abstract com.webobjects.foundation.NSDictionary controllerFactoryWillUseSpecificationForWindowWithListController(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSDictionary specification, java.lang.String entityName);

        abstract com.webobjects.foundation.NSDictionary controllerFactoryWillUseSpecificationForWindowWithOpenController(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSDictionary specification, java.lang.String entityName);

        abstract com.webobjects.foundation.NSDictionary controllerFactoryWillUseSpecificationForWindowWithQueryController(com.webobjects.eogeneration.EOControllerFactory factory, com.webobjects.foundation.NSDictionary specification, java.lang.String entityName);

    }
    public static interface Select extends com.webobjects.eoapplication.EOObjectDisplay{
        abstract void finishSelecting();

        abstract void prepareToSelect(boolean allowMultipleObjects, boolean allowInsertingObject);

        abstract com.webobjects.eocontrol.EOGlobalID provideSelectedObjectGlobalID();

        abstract com.webobjects.foundation.NSArray provideSelectedObjectsGlobalIDs();

    }
    public static interface Insert extends com.webobjects.eoapplication.EOObjectDisplayDocument{
        abstract boolean insertNewObject();

        abstract boolean insertNewObjectWithRelationshipPathsFilled(com.webobjects.foundation.NSDictionary relationshipPathToGlobalIDsMapTable);

    }
    public static interface Query extends com.webobjects.eoapplication.EOObjectDisplay{
        abstract void queryObjectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification);

    }
    public static interface ControllerTaskCallback{
        abstract boolean finishTask(com.webobjects.eoapplication.EOController controller, java.lang.Object[] parameters);

        abstract boolean performTask(com.webobjects.eoapplication.EOController controller, java.lang.Object[] parameters);

        abstract boolean prepareTask(com.webobjects.eoapplication.EOController controller, java.lang.Object[] parameters);

    }
    public static interface Open extends com.webobjects.eoapplication.EOObjectDisplayDocument{
        abstract void openObjectWithGlobalID(com.webobjects.eocontrol.EOGlobalID globalID);

    }
    public static interface SelectByInserting extends com.webobjects.eogeneration.EOControllerFactory.Insert{
        abstract void finishSelecting();

        abstract void prepareToSelectByInserting();

        abstract com.webobjects.eocontrol.EOGlobalID provideSelectedObjectGlobalID();

    }
    public static class ControllerTaskAdaptor implements com.webobjects.eogeneration.EOControllerFactory.ControllerTaskCallback{
        public ControllerTaskAdaptor(){
             //TODO codavaj!!
        }

        public boolean finishTask(com.webobjects.eoapplication.EOController controller, java.lang.Object[] parameters){
            return false; //TODO codavaj!!
        }

        public boolean performTask(com.webobjects.eoapplication.EOController controller, java.lang.Object[] parameters){
            return false; //TODO codavaj!!
        }

        public boolean prepareTask(com.webobjects.eoapplication.EOController controller, java.lang.Object[] parameters){
            return false; //TODO codavaj!!
        }

    }
    public static interface List extends com.webobjects.eoapplication.EOObjectDisplay{
        abstract void listObjectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification);

        abstract void listObjectsWithGlobalIDs(com.webobjects.foundation.NSArray globalIDs);

    }
}
