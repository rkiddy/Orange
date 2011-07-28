
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.util.HashMap;
import java.util.Map;


public abstract class EOObjectStore
    implements NSDisposable, NSLocking {


    public EOObjectStore() { return null; }

    public abstract EOEnterpriseObject faultForGlobalID(EOGlobalID eoglobalid, EOEditingContext eoeditingcontext);

    public abstract EOEnterpriseObject faultForRawRow(NSDictionary nsdictionary, String s, EOEditingContext eoeditingcontext);

    public abstract NSArray arrayFaultWithSourceGlobalID(EOGlobalID eoglobalid, String s, EOEditingContext eoeditingcontext);

    public abstract void initializeObject(EOEnterpriseObject eoenterpriseobject, EOGlobalID eoglobalid, EOEditingContext eoeditingcontext);

    public abstract void editingContextDidForgetObjectWithGlobalID(EOEditingContext eoeditingcontext, EOGlobalID eoglobalid);

    public abstract NSArray objectsForSourceGlobalID(EOGlobalID eoglobalid, String s, EOEditingContext eoeditingcontext);

    public abstract void refaultObject(EOEnterpriseObject eoenterpriseobject, EOGlobalID eoglobalid, EOEditingContext eoeditingcontext);

    public abstract void saveChangesInEditingContext(EOEditingContext eoeditingcontext);

    public abstract NSArray objectsWithFetchSpecification(EOFetchSpecification eofetchspecification, EOEditingContext eoeditingcontext);

    public abstract boolean isObjectLockedWithGlobalID(EOGlobalID eoglobalid, EOEditingContext eoeditingcontext);

    public abstract void lockObjectWithGlobalID(EOGlobalID eoglobalid, EOEditingContext eoeditingcontext);

    public abstract void invalidateAllObjects();

    public abstract void invalidateObjectsWithGlobalIDs(NSArray nsarray);

    public Object invokeRemoteMethod(EOEditingContext context, EOGlobalID gid, String methodName, Class argumentTypes[], Object arguments[]) { return null; }

    public abstract void lock();

    public abstract void unlock();

    public void dispose() {}

    protected boolean _invalidateObjectsDuringSave() { return true; }

    public static void _suppressAssertLock() { return null; }

    public static void _resetAssertLock() { return null; }

    protected static void _checkAssertLock() { return null; }

    public void setUserInfo(Map aDictionary) {}

    public NSDictionary userInfo() { return null; }

    public Object userInfoForKey(String key) { return null; }

    public void setUserInfoForKey(Object value, String key) {}

    static  {}

    public static final Class _CLASS;
    public static final String ObjectsChangedInStoreNotification = "EOObjectsChangedInStoreNotification";
    public static final String InvalidatedAllObjectsInStoreNotification = "EOInvalidatedAllObjectsInStoreNotification";
    public static final String InsertedKey = "inserted";
    public static final String UpdatedKey = "updated";
    public static final String DeletedKey = "deleted";
    public static final String InvalidatedKey = "invalidated";
    protected static volatile boolean _doAssertLockInitialized;
    protected static volatile boolean _doAssertLock;
    protected volatile boolean _wasDisposed;
    protected volatile Map _userInfo;

}
