package com.webobjects.eocontrol;
/**
 * EODataSource is an abstract class that defines a basic API for providing enterprise objects. It exists primarily as a simple means for a display group (EODisplayGroup from EOInterface or WODisplayGroup from WebObjects) or other higher level class to access a store of objects. EODataSource defines functional implementations of concrete subclasses, such as EODatabaseDataSource (defined in com.webobjects.eoaccess) and EODetailDataSource, which define working data sources by implementing the others. EODatabaseDataSource, for example, provides objects fetched through an EOEditingContext, while EODetailDataSource provides objects from a relationship property of a master object.
 * An EODataSource provides its objects with its fetchObjects method. insertObject and deleteObject add and remove individual objects, while createObject instantiates new objects. Other methods provide information about the objects.
 * See EODataSourceConcepts for more information.
 * See Also:EODataSource.fetchObjects(), EODataSource.insertObject(Object eo), EODataSource.deleteObject(Object eo), EODataSource.createObject()
 */
public abstract class EODataSource{
    public EODataSource(){
         //TODO codavaj!!
    }

    /**
     * Implemented by subclasses to return an EOClassDescription that provides information about the objects provided by the receiver.
     */
    public com.webobjects.eocontrol.EOClassDescription classDescriptionForObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Creates a new object, inserts it in the receiver's collection of objects if appropriate, and returns the object. Returns null if the receiver can't create the object or can't insert it. You should invoke insertObject after this method to actually add the new object to the receiver.
     * As a convenience, EODataSource's implementation sends the receiver's EOClassDescription a createInstanceWithEditingContext message to create the object. If this succeeds and the receiver has an EOEditingContext, it sends the EOEditingContext an insertObject message to register the new object with the EOEditingContext (note that this does not insert the object into the EODataSource). Subclasses that don't use EOClassDescriptions or EOEditingContexts should override this method without invoking the superclass's implementation.
     */
    public java.lang.Object createObject(){
        return null; //TODO codavaj!!
    }

    /**
     * Implemented by subclasses to provide the destination objects of a relationship. The detail EODataSource can be qualified using qualifyWithRelationshipKey to set a specific master object or to change the relationship key.
     */
    public abstract com.webobjects.eocontrol.EODataSource dataSourceQualifiedByKey(java.lang.String key);

    /**
     * Implemented by subclasses to delete an object. EODataSource's implementation merely throws an exception. Subclasses shouldn't invoke the superclass's implementation.
     */
    public abstract void deleteObject(java.lang.Object eo);

    /**
     * Implemented by subclasses to return the receiver's EOEditingContext.
     */
    public com.webobjects.eocontrol.EOEditingContext editingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Implemented by subclasses to fetch and return the objects provided by the receiver.
     */
    public com.webobjects.foundation.NSArray fetchObjects(){
        return null; //TODO codavaj!!
    }

    /**
     * Implemented by subclasses to insert objects.
     */
    public abstract void insertObject(java.lang.Object eo);

    /**
     * Implemented by subclasses to qualify the receiver, a detailed EODataSource, to display destination objects for a relationship. The key should be the same as the key specified in the dataSourceQualifiedByKey message that created the receiver. If source object is null, the receiver qualifies itself to provide no objects.
     */
    public abstract void qualifyWithRelationshipKey(java.lang.String key, java.lang.Object sourceObject);

}
