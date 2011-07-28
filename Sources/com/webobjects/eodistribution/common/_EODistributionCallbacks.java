
package com.webobjects.eodistribution.common;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;

public interface _EODistributionCallbacks {
    public static interface ObjectStore {

        public abstract NSArray snapshotForSourceGlobalID(EOGlobalID eoglobalid, String s);
    }

    public static interface Replace {
        public static interface Callback {

            public abstract EOEnterpriseObject _serverEOWithGlobalID(EOGlobalID eoglobalid);

            public abstract EOEnterpriseObject _serverEOWithGlobalID(EOGlobalID eoglobalid, EOClassDescription eoclassdescription);

            public abstract void _throwOptimisticLockingFailureForGlobalIDIfNecessary(EOGlobalID eoglobalid);
        }


        public abstract Object replacementEOInEditingContext(EOEditingContext eoeditingcontext, Callback callback);
    }

    public static interface Awake {
        public static interface Callback {

            public abstract NSArray _collectAndResetNotifications();

            public abstract EOEditingContext editingContext();

            public abstract void _insertedObject(EOEnterpriseObject eoenterpriseobject, EOGlobalID eoglobalid);
        }


        public abstract void awakeInDistributionContext(Callback callback);
    }



    public abstract EOEditingContext editingContext();

    public abstract Object invocationTarget();

    public abstract NSArray remoteMethodReceivers();

    public abstract boolean _shouldFollowKeyPath(String s, NSSelector nsselector);

    public abstract boolean _shouldAllowInvocation(Object obj, NSSelector nsselector, Object aobj[]);



    public static final Class _CLASS = null;

}
