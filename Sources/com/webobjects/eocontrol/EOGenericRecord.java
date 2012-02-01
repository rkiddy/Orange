package com.webobjects.eocontrol;
/**
 * EOGenericRecord is a generic enterprise object class that can be used in place of custom classes when custom behavior is not needed. It implements the EOEnterpriseObject interface to provide the basic enterprise object behavior. An EOGenericRecord object has an EOClassDescription that provides metadata about the generic record, including the name of the entity that the generic record represents and the names of the record's attributes and relationships. A generic record stores its properties in a dictionary using its attribute and relationship names as keys.
 * In the typical case where applications access a relational database, the EOAccess layer's modeling objects are an important part of how generic records map to database rows. If an EOModel doesn't have a custom enterprise object class defined for a particular entity, an EODatabaseChannel using that model creates EOGenericRecords when fetching objects for that entity from the database server. During this process, the EODatabaseChannel also sets each generic record's class description to an EOEntityClassDescription, providing the link to the record's associated modeling objects. (EOModel, EODatabaseChannel, and EOEntityClassDescription are defined in EOAccess.)
 * See EOGenericRecordConcepts for more information.
 * See Also:EOModel, EODatabaseChannel, EOEntityClassDescription, Serialized Form
 */
public class EOGenericRecord extends com.webobjects.eocontrol.EOCustomObject{
    /**
     * Default constructor.
     */
    public EOGenericRecord(){
         //TODO codavaj!!
    }

    /**
     * Create a new instance and assigns it classDescription
     * Parameters:classDescription - Contains the metadata for the EOGenericRecord.
     */
    public EOGenericRecord(com.webobjects.eocontrol.EOClassDescription classDescription){
         //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public EOGenericRecord(com.webobjects.eocontrol.EOEditingContext editingContext, com.webobjects.eocontrol.EOClassDescription classDescription, com.webobjects.eocontrol.EOGlobalID gid){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the EOClassDescription registered for the receiver's class by invoking the EOClassDescription static method classDescriptionForClass.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescription(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true, specifying that EOGenericRecords use deferred faulting. Note that deferred faulting offers performance benefits.
     */
    public static boolean usesDeferredFaultCreation(){
        return false; //TODO codavaj!!
    }

}
