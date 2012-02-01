package com.webobjects.eocontrol;
/**
 * EOCooperatingObjectStore is a part of the control layer's object storage abstraction. It is an abstract class that defines the basic API for object stores that work together to manage data from several distinct data repositories.
 * For more general information on the object storage abstraction, see Object Storage Abstraction in the introduction to the EOControl Framework.
 * The interaction between EOCooperatingObjectStores is managed by another class, EOObjectStoreCoordinator. The EOObjectStoreCoordinator communicates changes to its EOCooperatingObjectStores by passing them an EOEditingContext. Each cooperating store examines the modified objects in the editing context and determines if it's responsible for handling the changes. When a cooperating store has changes that need to be handled by another store, it communicates the changes to the other store back through the coordinator.
 * For relational databases, Enterprise Objects Framework provides a concrete subclass of EOCooperatingObjectStore, EODatabaseContext (EOAccess). A database context represents a single connection to a database server, fetching and saving objects on behalf of one or more editing contexts. However, a database context and an editing context don't interact with each other directly-a coordinator acts as a mediator between them.
 * For more information on EOCooperatingObjectStore, refer to:
 */
public abstract class EOCooperatingObjectStore extends com.webobjects.eocontrol.EOObjectStore implements com.webobjects.foundation.NSLocking{
    public EOCooperatingObjectStore(){
         //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to commit the transaction. Throws an exception if an error occurs; the error message indicates the nature of the problem.
     */
    public abstract void commitChanges();

    public com.webobjects.eocontrol.EOObjectStoreCoordinator coordinator(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return true if the receiver is responsible for fetching the objects described by fetchSpecification. For example, EODatabaseContext (EOAccess) determines whether it's responsible based on fetchSpecification's entity name.
     */
    public abstract boolean handlesFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification);

    /**
     * Description copied from class:
     * This method is used to protect access to the receiver from concurrent operations by multiple threads. Most EOObjectStores can only service one thread at a time (i.e. they are not reentreant) so properly locking them ensures correct concurrent behavior (i.e. threads take turns) Applications which make direct use of an EOObjectStore should lock and unlock it as appropriate. EOObjectStores are expected to lock and unlock any additional resources they need as appropriate. Specifically, so long as an object store is properly locked and unlocked by its clients, any indirect locks or resoruces the EOObjectStore requires to fulfill its client's requests are expected to be managed by the EOObjectStore, not its client. Do not confuse this with any methods which work with the database locking mechanism.
     */
    public abstract void lock();

    /**
     * Overridden by subclasses to return true if the receiver is responsible for fetching and saving the object identified by globalID. For example, EODatabaseContext (EOAccess) determines whether it's responsible based on the entity associated with globalID.
     */
    public abstract boolean ownsGlobalID(com.webobjects.eocontrol.EOGlobalID globalID);

    /**
     * Overridden by subclasses to return true if the receiver is responsible for fetching and saving object. For example, EODatabaseContext (EOAccess) determines whether it's responsible based on the entity associated with object.
     */
    public abstract boolean ownsObject(com.webobjects.eocontrol.EOEnterpriseObject object);

    /**
     * Overridden by subclasses to transmit changes to the receiver's underlying database. Raises an exception if an error occurs; the error message indicates the nature of the problem.
     */
    public abstract void performChanges();

    /**
     * Overridden by subclasses to notify the receiver that a multi-store save operation overseen by coordinator is beginning for the EOEditingContext, context. For example, the receiver might prepare primary keys for newly inserted objects so that they can be handed out to other EOCooperatingObjectStores upon request. The receiver should be prepared to receive the messages recordChangesInEditingContext and recordUpdateForObject. After performing these methods, the receiver should be prepared to receive the possible messages ownsGlobalID and then commitChanges or rollbackChanges.
     */
    public abstract void prepareForSaveWithCoordinator(com.webobjects.eocontrol.EOObjectStoreCoordinator coordinator, com.webobjects.eocontrol.EOEditingContext context);

    /**
     * Overridden by subclasses to instruct the receiver to examine the changed objects in the receiver's EOEditingContext, record any operations that need to be performed, and notify the receiver's EOObjectStoreCoordinator of any changes that need to be forwarded to other EOCooperatingObjectStores.
     */
    public abstract void recordChangesInEditingContext();

    /**
     * Overridden by subclasses to communicate from one EOCooperatingObjectStore to another (through the EOObjectStoreCoordinator) that changes need to be made to the an EOEnterpriseObject. For example, an insert of an object in a relationship property might require changing a foreign key property in an object owned by another EOCooperatingObjectStore. This method is primarily used to manipulate relationships.
     */
    public abstract void recordUpdateForObject(com.webobjects.eocontrol.EOEnterpriseObject object, com.webobjects.foundation.NSDictionary changes);

    /**
     * Overridden by subclasses to roll back changes to the underlying database. Raises one of several possible exceptions if an error occurs; the error message should indicate the nature of the problem.
     */
    public abstract void rollbackChanges();

    public void setCoordinator(com.webobjects.eocontrol.EOObjectStoreCoordinator newCoordinator){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * This method is used to protect access to the receiver from concurrent operations by multiple threads. Most EOObjectStores can only service one thread at a time (i.e. they are not reentreant) so properly unlocking them ensures another thread can utilize the object store (i.e. prevent deadlock) Applications which make direct use of an EOObjectStore should lock and unlock it as appropriate. EOObjectStores are expected to lock and unlock any additional resources they need as appropriate. Specifically, so long as an object store is properly locked and unlocked by its clients, any indirect locks or resoruces the EOObjectStore requires to fulfill its client's requests are expected to be managed by the EOObjectStore, not its client. Do not confuse this with any methods which work with the database locking mechanism.
     */
    public abstract void unlock();

    /**
     * Overridden by subclasses to return values (as identified by keys) held by the receiver that augment properties in object. For instance, an EODatabaseContext (EOAccess) stores foreign keys for the objects it owns (and primary keys for new objects). These foreign and primary keys may not be defined as properties of the object. Other database contexts can find out these keys by sending the database context that owns the object a valuesForKeys message. Note that you use this for properties that are not stored in the object, so using key-value coding directly on the object won't always work.
     */
    public abstract com.webobjects.foundation.NSDictionary valuesForKeys(com.webobjects.foundation.NSArray keys, com.webobjects.eocontrol.EOEnterpriseObject object);

}
