
package com.webobjects.eocontrol;

import java.lang.ref.WeakReference;


class _EOWeakReference extends WeakReference {


    _EOWeakReference(EOEnterpriseObject referent, EOGlobalID gid, EOEditingContext context) { return null; }

    public boolean equals(Object other) { return true; }

    public int hashCode() { return 0; }

    EOGlobalID globalID() { return null; }

    void setGlobalID(EOGlobalID gid) { return null; }

    boolean shouldObjectStoreForget() { return null; }

    void setObjectStoreShouldForget(boolean alreadyCleanedUp) { return null; }

    public String toString() { return null; }

    EOGlobalID _gid;
    boolean _shouldForget;
    int _hash;

}
