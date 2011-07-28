
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;


public abstract class EOCooperatingObjectStore extends EOObjectStore
    implements NSLocking {


    public EOCooperatingObjectStore() { return null; }

    public abstract boolean ownsGlobalID(EOGlobalID eoglobalid);

    public abstract boolean ownsObject(EOEnterpriseObject eoenterpriseobject);

    public abstract boolean handlesFetchSpecification(EOFetchSpecification eofetchspecification);

    protected void _willPrepareForSave() {}

    public abstract void prepareForSaveWithCoordinator(EOObjectStoreCoordinator eoobjectstorecoordinator, EOEditingContext eoeditingcontext);

    public abstract void recordChangesInEditingContext();

    public abstract void recordUpdateForObject(EOEnterpriseObject eoenterpriseobject, NSDictionary nsdictionary);

    public abstract void performChanges();

    public abstract void commitChanges();

    public abstract void rollbackChanges();

    public abstract NSDictionary valuesForKeys(NSArray nsarray, EOEnterpriseObject eoenterpriseobject);

    public EOObjectStoreCoordinator coordinator() { return null; }

    public void setCoordinator(EOObjectStoreCoordinator newCoordinator) {}

    public abstract void lock();

    public abstract void unlock();

    static  {}

    public static final Class _CLASS;
    protected EOObjectStoreCoordinator _coordinator;

}
