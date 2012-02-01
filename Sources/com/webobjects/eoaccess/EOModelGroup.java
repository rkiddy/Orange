package com.webobjects.eoaccess;
/**
 * An EOModelGroup represents an aggregation of related models. When a model in the group needs to resolve a relationship to an entity in another model, it looks for that model in its group. Model groups allow applications to load entities and their properties only as they're needed, by distributing them among separate EOModels.
 * The default model group contains all models for an application, as well as any frameworks the application references. It is automatically created on demand. The entity name space among all of these models is global; consequently, the same entity name should not appear in any two of models in the group. All cross-model information is represented in the models by entity name only. Binding the entity name to an actual entity is done at runtime within the EOModelGroup.
 * In the majority of applications, the automatically created default model group is sufficient. If different model grouping semantics are needed, programmers can create their own model group instance, add whatever models they like, and then replace the default model group with their custom model group.
 * The following code demonstrates programmatic creation of a model group.
 * Each model lives within a group and can form connections to other models in its group. EOModeler puts models with identical names in separate groups to allow you to load two models with the same name at the same time.
 * A model can find a related model by name using the statement this.modelGroup().modelNamed(name);.
 * A data source can locate a model using the statement: EOModelGroup.defaultGroup().modelNamed(name);.
 * Your EOModelGroup object should have a delegate which can influence how it finds and loads models. In addition to the delegates you assign to EOModelGroup instances, the EOModelGroup class itself can have a delegate. The class delegate implements a single method, defaultModelGroup. The instance delegate can implement the methods defined in the EOModelGroup.Delegate interface.
 * Note that the following delegate methods are set on EOModelGroup, rather than EOEntity, to provide a single point in the code where you can alter the database-to-objects mapping.
 * See Also:EOModelGroup.ClassDelegate.defaultModelGroup(), EOModelGroup.Delegate.classForObjectWithGlobalID(EOEntity entity, EOGlobalID gid), EOModelGroup.Delegate.subEntityForEntity(EOEntity entity, NSDictionary dic), EOModelGroup.ClassDelegate, EOModelGroup, EOModel
 */
public class EOModelGroup{
    /**
     * Posted by an EOModelGroup when an EOModel is added to the group. This notification is sent, for instance, inside Interface Builder when the user has saved changes to a model in EOModeler and the objects in Interface Builder must be resynchronized. The old model is invalidated and recipients of the notification (like data sources) can invoke modelNamed to re-fetch their models.
     * See Also:EOModelGroup.modelNamed(String modelName), Constant Field Values
     */
    public static final java.lang.String ModelAddedNotification="EOModelAddedNotification";

    /**
     * Posted by an EOModelGroup when an EOModel is removed from the group. This notification is sent, for instance, inside Interface Builder when the user has saved changes to a model in EOModeler and the objects in Interface Builder must be resynchronized. The old model is invalidated and recipients of the notification (like data sources) can invoke modelNamed to re-fetch their models.
     * See Also:EOModelGroup.modelNamed(String modelName), Constant Field Values
     */
    public static final java.lang.String ModelInvalidatedNotification="EOModelInvalidatedNotification";

    /**
     * Creates and returns a new EOModelGroup.
     */
    public EOModelGroup(){
         //TODO codavaj!!
    }

    /**
     * Adds model to the receiving model group, sets the receiving model group as model's model group, and posts a ModelAddedNotification. Throws an exception if the receiver already contains an EOModel with the same name as model, of if there is a name conflict between entities in model and entities in any of the model group's other models.
     */
    public void addModel(com.webobjects.eoaccess.EOModel model){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public com.webobjects.eoaccess.EOModel addModelWithPath(java.lang.String path){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a new EOModel object from the contents of the model archive identified by url; may return null. If a model can be created from path, adds the newly created model to the receiver.
     */
    public com.webobjects.eoaccess.EOModel addModelWithPathURL(java.net.URL url){
        return null; //TODO codavaj!!
    }

    /**
     * Returns EOModelGroup's class delegate.
     */
    public static java.lang.Object classDelegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the default EOModelGroup, which is the same as the global EOModelGroup unless you have either explicitly set a default model group with setDefaultGroup or implemented the class delegate method defaultModelGroup to return a non-null value.
     * Note: In WebObjects applications, the WOApplication instance assigns the WOApplication class as the EOModelGroup's class delegate. Its implementation of defaultModelGroup can return a different default model group than the one returned by this method.
     */
    public static com.webobjects.eoaccess.EOModelGroup defaultGroup(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's instance delegate, which is different than the EOModelGroup class delegate. Each EOModelGroup object can have its own delegate in addition to the delegate that's assigned to the EOModelGroup class.
     */
    public java.lang.Object delegate(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array of entities that have objects to load into a shared editing context.
     */
    public com.webobjects.foundation.NSArray entitiesWithSharedObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOEntity associated with object from any of the models in the receiver that handle object, or null if none of the models in the receiver handle object.
     */
    public com.webobjects.eoaccess.EOEntity entityForObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    /**
     * Searches each of the EOModels in the receiver for the entity specified by name, and returns the entity, if found, or null if unable to find the specified entity.
     */
    public com.webobjects.eoaccess.EOEntity entityNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the fetch specification identifed by fetchSpecName from the entity specified by entityName in the receiving model group.
     */
    public com.webobjects.eocontrol.EOFetchSpecification fetchSpecificationNamed(java.lang.String fetchSpecName, java.lang.String entityName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an EOModelGroup composed of all models in the resource directory of the application, as well as those in all frameworks loaded into the application.
     */
    public static com.webobjects.eoaccess.EOModelGroup globalModelGroup(){
        return null; //TODO codavaj!!
    }

    /**
     * Invokes loadAllModelObjects on each of the receiver's EOModels, thereby loading any EOEntities, EOAttributes, EORelationships, and EOStoredProcedures that haven't yet been loaded from each of the EOModels in the receiver.
     */
    public void loadAllModelObjects(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the EOModelGroup used by the EOObjectStoreCoordinator objectCoord.
     */
    public static com.webobjects.eoaccess.EOModelGroup modelGroupForObjectStoreCoordinator(com.webobjects.eocontrol.EOObjectStoreCoordinator objectCoord){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOModel identifed by name if it is part of the receiving model group, or null if the receiver doesn't contain an EOModel with the specified name.
     */
    public com.webobjects.eoaccess.EOModel modelNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the names of all of the EOModels in the receiver, or an empty array if the receiver contains no EOModels. The order of the model names in the array isn't defined.
     */
    public com.webobjects.foundation.NSArray modelNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an array containing the receiver's EOModels, or an empty array if the receiver contains no EOModels. The order of the models in the array isn't defined.
     */
    public com.webobjects.foundation.NSArray models(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public com.webobjects.eoaccess.EOModel modelWithPath(java.lang.String path){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the EOModel whose URL is identical to url or null if the receiver does not contain an EOModel with the specified URL.
     */
    public com.webobjects.eoaccess.EOModel modelWithPathURL(java.net.URL url){
        return null; //TODO codavaj!!
    }

    /**
     * Removes model from the receiving model group and unbinds any references to model from other EOModels in the group. Posts a ModelInvalidatedNotification to the default notification center after removing model.
     */
    public void removeModel(com.webobjects.eoaccess.EOModel model){
        return; //TODO codavaj!!
    }

    /**
     * Assigns delegate as EOModelGroup's class delegate. The class delegate is optional; it allows modification of the creation of the default model group.
     */
    public static void setClassDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default model group to group. If you have implemented the defaultModelGroup class delegate method to return a non-null value, the delegate's return value overrides the value set by this method.
     */
    public static void setDefaultGroup(com.webobjects.eoaccess.EOModelGroup group){
        return; //TODO codavaj!!
    }

    /**
     * Sets the receiver's instance delegate to delegate. The EOModelGroup class may also have a class delegate set, which is independent of the instance delegate.
     */
    public void setDelegate(java.lang.Object delegate){
        return; //TODO codavaj!!
    }

    /**
     * Assigns group as the working model group for the EOObjectStoreCoordinator objectCoord. By default, an EOObjectStoreCoordinator uses the default model group. You might want to assign a different model group to an EOObjectStoreCoordinator if you need to scope models to particular coordinators, if different models have the same name, or if different entities in some models have the same name.
     */
    public static void setModelGroupForObjectStoreCoordinator(com.webobjects.eocontrol.EOObjectStoreCoordinator objectCoord, com.webobjects.eoaccess.EOModelGroup group){
        return; //TODO codavaj!!
    }

    /**
     * Searches each of the EOModels in the receiver for the stored procedure specified by name, and returns the stored procedure, if found, or null if unable to find the specified stored procedure.
     */
    public com.webobjects.eoaccess.EOStoredProcedure storedProcedureNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string representation of the model group.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * This interface defines a delegate to the EOModelGroup class to allow modification of the creation of the default model group. There is also an EOModelGroup instance delegate that can be implemented to change how the model group finds and loads models.
     * See Also:EOModelGroup.Delegate
     */
    public static interface ClassDelegate{
        /**
         * Allows the delegate the opportunity to construct and return a different model group to be used as the default model group than the one created by EOModelGroup. If the delegate returns null, EOModelGroup uses its own default model group.
         */
        abstract com.webobjects.eoaccess.EOModelGroup defaultModelGroup();

    }
    /**
     * This interface defines a delegate to EOModelGroup to allow instances to modify how the model group finds and loads models. There is also an EOModelGroup class delegate that can be implemented to change the creation of the default model group.
     * See Also:EOModelGroup.ClassDelegate
     */
    public static interface Delegate{
        /**
         * Used to fine-tune inheritance. The delegate can take action to substitute a different class for the object identified by the globalID gid in place of the one specified in entity. If the delegate cannot provide an alternate class, or if there is no delegate, EOGenericRecord is used.
         */
        abstract java.lang.Class classForObjectWithGlobalID(com.webobjects.eoaccess.EOEntity entity, com.webobjects.eocontrol.EOGlobalID gid);

        /**
         * Invoked when the class name specified for entity cannot be found at runtime. The delegate can take action to provide a different class to associate with entity. If the delegate cannot provide an alternate class, or if there is no delegate, EOGenericRecord is used as entity's class.
         */
        abstract java.lang.Class failedToLookupClassNamed(com.webobjects.eoaccess.EOEntity entity, java.lang.String className);

        /**
         * Invoked when relationship is being loaded and the destination entity identified by name in the model file cannot be found in the model group. This most often occurs when a model references entities in another model file that can't be found.
         * The delegate can implement this method to return a different destination entity to set for relationship, or null to set the destination entity to null. If the delegate doesn't implement this method, an exception is thrown by the Enterprise Objects Framework.
         */
        abstract com.webobjects.eoaccess.EOEntity relationshipFailedToLookupDestinationWithName(com.webobjects.eoaccess.EORelationship relationship, java.lang.String name);

        /**
         * Invoked when relationships are instantiated for a newly fetched object. Allows the delegate the opportunity to substitute a different relationship than relationship for the specified entity. dictionary is the snapshot of the database row for the newly fetched object. Should return relationship to leave the default behavior unchanged, or a different EORelationship object as appropriate.
         */
        abstract com.webobjects.eoaccess.EORelationship relationshipForRow(com.webobjects.eoaccess.EOEntity entity, com.webobjects.foundation.NSDictionary dictionary, com.webobjects.eoaccess.EORelationship relationship);

        /**
         * Allows the delegate to fine-tune inheritance by returning the sub-entity of entity from which an object should be fetched based on the primary key in dic.
         */
        abstract com.webobjects.eoaccess.EOEntity subEntityForEntity(com.webobjects.eoaccess.EOEntity entity, com.webobjects.foundation.NSDictionary dic);

    }
}
