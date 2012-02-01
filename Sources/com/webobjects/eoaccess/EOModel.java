package com.webobjects.eoaccess;
/**
 * An EOModel represents a mapping between a database schema and a set of classes based on the entity-relationship model for an application. The model contains a number of EOEntity objects representing the tables (entities) of the database schema. Each EOEntity object has a number of EOAttribute and EORelationship objects representing the properties (columns or fields) of the table (entity) in the database schema.
 * An EOModel maintains a mapping between each of its EOEntity objects and a corresponding Enterprise Object class for use with the database level of the Enterprise Objects Framework. You can determine the EOEntity for a particular Enterprise Object with the entityForObject method.
 * An EOModel is specific to a particular database server, and can store information needed to connect to that server as well as the name of an adaptor framework to load so that the Enterprise Objects Framework can communicate with the database.
 * Models can be organized into model groups and may have relationships that reference other models in the same model group. The other models may map to different databases and types of servers.
 * EOModel files are usually built using the EOModeler application, but it is possible to build an EOModel file programmatically if needed. The EOAdaptorChannel class declares methods for reading basic schema information from a relational database. You can use this information to build up an EOModel programmatically, and then enhance that model by defining extra relationships, flattening attributes, and so on.
 * EOModel files are typically stored in a project or a framework. To load an EOModel, provide a model file's path to the constructor. Note that loading an EOModel doesn't have the effect of loading all of its entities. EOModel files can be quite large, so to reduce start-up time, entity definitions are only loaded as needed. This incremental model loading is possible because an EOModel actually consists of one index file and two files for each entity. Models have an .eomodeld file wrapper ( which is actually a directory), and the individual entity files within the model are in ASCII format. The index file has the name index.eomodeld, and it contains the connection dictionary, the adaptor name, and a list of all of the entities in the model. This is the file that is loaded when you create a new model from a path.
 * The two entity files consist of a property list (.plist) file that describes the entity and a fetch specification (.fspec) file that describes any named fetch specifications for that entity.
 * When an entity is loaded, EOModel posts an EntityLoadedNotification.
 * See Also:EOModel.entityForObject(EOEnterpriseObject object)
 */
public class EOModel implements com.webobjects.foundation.NSDisposable{
    /**
     * The notification posted after an EOEntity is loaded into memory. This notification contains:
     */
    public static final java.lang.String EntityLoadedNotification="EOEntityLoadedNotification";

    EOModel(){
         //TODO codavaj!!
    }

    EOModel(com.webobjects.foundation.NSDictionary propertyList, java.lang.String path){
         //TODO codavaj!!
    }

    EOModel(com.webobjects.foundation.NSDictionary propertyList, java.net.URL url){
         //TODO codavaj!!
    }

    EOModel(java.lang.String path){
         //TODO codavaj!!
    }

    EOModel(java.net.URL url){
         //TODO codavaj!!
    }

    java.lang.String adaptorName(){
        return null; //TODO codavaj!!
    }

    void addEntity(com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    void addStoredProcedure(com.webobjects.eoaccess.EOStoredProcedure storedProcedure){
        return; //TODO codavaj!!
    }

    com.webobjects.foundation.NSArray availablePrototypeAttributeNames(){
        return null; //TODO codavaj!!
    }

    void beautifyNames(){
        return; //TODO codavaj!!
    }

    com.webobjects.foundation.NSDictionary connectionDictionary(){
        return null; //TODO codavaj!!
    }

    void dispose(){
        return; //TODO codavaj!!
    }

    void encodeTableOfContentsIntoPropertyList(com.webobjects.foundation.NSMutableDictionary result){
        return; //TODO codavaj!!
    }

    com.webobjects.foundation.NSArray entities(){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSArray entitiesWithSharedObjects(){
        return null; //TODO codavaj!!
    }

    com.webobjects.eoaccess.EOEntity entityForObject(com.webobjects.eocontrol.EOEnterpriseObject object){
        return null; //TODO codavaj!!
    }

    com.webobjects.eoaccess.EOEntity entityNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSArray entityNames(){
        return null; //TODO codavaj!!
    }

    java.lang.String entityPrototypeNameForAdaptor(com.webobjects.eoaccess.EOAdaptor adaptor){
        return null; //TODO codavaj!!
    }

    java.lang.String entityPrototypePlugInNameForAdaptor(com.webobjects.eoaccess.EOAdaptor adaptor){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSArray externalModelsReferenced(){
        return null; //TODO codavaj!!
    }

    void loadAllModelObjects(){
        return; //TODO codavaj!!
    }

    com.webobjects.eoaccess.EOModelGroup modelGroup(){
        return null; //TODO codavaj!!
    }

    java.lang.String name(){
        return null; //TODO codavaj!!
    }

    java.lang.String path(){
        return null; //TODO codavaj!!
    }

    java.net.URL pathURL(){
        return null; //TODO codavaj!!
    }

    com.webobjects.eoaccess.EOAttribute prototypeAttributeNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSArray referencesToProperty(java.lang.Object property){
        return null; //TODO codavaj!!
    }

    void removeEntity(com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    void removeEntityAndReferences(com.webobjects.eoaccess.EOEntity entity){
        return; //TODO codavaj!!
    }

    void removeStoredProcedure(com.webobjects.eoaccess.EOStoredProcedure storedProcedure){
        return; //TODO codavaj!!
    }

    void setAdaptorName(java.lang.String adaptorName){
        return; //TODO codavaj!!
    }

    void setConnectionDictionary(com.webobjects.foundation.NSDictionary connectionDictionary){
        return; //TODO codavaj!!
    }

    void setModelGroup(com.webobjects.eoaccess.EOModelGroup group){
        return; //TODO codavaj!!
    }

    void setName(java.lang.String newName){
        return; //TODO codavaj!!
    }

    void setUserInfo(com.webobjects.foundation.NSDictionary dictionary){
        return; //TODO codavaj!!
    }

    com.webobjects.eoaccess.EOStoredProcedure storedProcedureNamed(java.lang.String name){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSArray storedProcedureNames(){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSArray storedProcedures(){
        return null; //TODO codavaj!!
    }

    java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    com.webobjects.foundation.NSDictionary userInfo(){
        return null; //TODO codavaj!!
    }

    void writeToFile(java.lang.String path){
        return; //TODO codavaj!!
    }

    /**
     * Used to filter out all the EOModel managed file and copy teh rest of the file over to the new model. The main purpose is to copy cvs and svn files.
     */
    protected static class EOModelFileNameFilter implements java.io.FilenameFilter{
        protected EOModelFileNameFilter(){
             //TODO codavaj!!
        }

        public boolean accept(java.io.File dir, java.lang.String name){
            return false; //TODO codavaj!!
        }

    }
}
