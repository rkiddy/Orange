
package com.webobjects.eodistribution;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOSession;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eodistribution.common._EOCompleteProxy;
import com.webobjects.eodistribution.common._EODistributionCallbacks;
import com.webobjects.eodistribution.common._EONotificationCarrier;
import com.webobjects.eodistribution.common._EONotificationRequest;
import com.webobjects.eodistribution.common._EOReferenceProxy;
import com.webobjects.eodistribution.common._EOReferenceRecordingCoder;
import com.webobjects.eodistribution.common._EOReferenceRecordingCoding;
import com.webobjects.eodistribution.common._EOServerInvocation;
import com.webobjects.eodistribution.common._EOServerReturnValue;
import com.webobjects.foundation.*;
import java.util.Enumeration;

public class EODistributionContext
    implements NSDisposable, com.webobjects.eodistribution.common._EODistributionCallbacks.Awake.Callback, com.webobjects.eodistribution.common._EODistributionCallbacks.Replace.Callback, _EODistributionCallbacks {
    public static class _EntityClassDescriptionCoding extends com.webobjects.foundation.NSCoding.Support {

        public _EntityClassDescriptionCoding() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}

        public Object decodeObject(NSCoder coder) { return null; }
    }

    public static class _RelationshipCoding extends com.webobjects.foundation.NSCoding.Support {

        public _RelationshipCoding() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}

        public Object decodeObject(NSCoder coder) { return null; }
    }

    public static class _AttributeCoding extends com.webobjects.foundation.NSCoding.Support {

        public _AttributeCoding() { return null; }

        public void encodeWithCoder(Object receiver, NSCoder coder) {}

        public Object decodeObject(NSCoder coder) { return null; }
    }

    public static class _EntityClassDescriptionReferenceCoding extends com.webobjects.eodistribution.common._EOReferenceRecordingCoding.Support {

        public _EntityClassDescriptionReferenceCoding() { return null; }

        public boolean shouldRecordCodingReferences(Object receiver) { return true; }

        public String _distributedClassName(Object receiver) { return null; }
    }

    public static class _RelationshipReferenceCoding extends com.webobjects.eodistribution.common._EOReferenceRecordingCoding.Support {

        public _RelationshipReferenceCoding() { return null; }

        public String _distributedClassName(Object receiver) { return null; }
    }

    public static class _AttributeReferenceCoding extends com.webobjects.eodistribution.common._EOReferenceRecordingCoding.Support {

        public _AttributeReferenceCoding() { return null; }

        public String _distributedClassName(Object receiver) { return null; }
    }

    public class _RemoteMethodReceiver {


        public _RemoteMethodReceiver() { return null; }

        public _EONotificationCarrier clientSideRequestGetNotifications(_EONotificationRequest notificationRequest) { return null; }

        private EOClassDescription _classDescriptionIfAllowed(EOClassDescription classDescription) { return null; }

        public EOGlobalID clientSideRequestGIDForRawRow(NSDictionary row, String entityName) { return null; }

        public Object clientSideRequestPropertiesForGlobalID(EOGlobalID gid, NSArray released) { return null; }

        public NSArray clientSideRequestObjectsForSourceGlobalIDRelationshipName(EOGlobalID gid, String name, NSArray released) { return null; }

        public void clientSideRequestPush(NSArray inserted, NSArray updated, NSArray deleted, NSArray released) {}

        public void clientSideRequestSave() {}

        public void clientSideRequestSnapshotsReleased(NSArray released) {}

        public EOQualifier clientSideRequestQualifierForRelationshipKey(String key, EOEnterpriseObject source) { return null; }

        public Object clientSideRequestObjectsForFetchSpecification(EOFetchSpecification fetchSpec, NSArray released) { return null; }

        private void _processInheritanceHierarchyClassDescriptions(EOClassDescription parentClassDescription, NSMutableArray classDescriptions) {}

        private void _processClassDescription(EOClassDescription classDescription, NSMutableArray classDescriptions, boolean processInheritanceHierarchy) {}

        private Object _necessaryClientClassDescriptions(EOClassDescription classDescription) { return null; }

        public Object clientSideRequestClassDescriptionForName(String name) { return null; }

        public Object clientSideRequestClassDescriptionNeededForClass(String name) { return null; }

        public EOFetchSpecification clientSideRequestFetchSpecificationByName(String name, String entityName) { return null; }

        public void clientSideRequestHandleExit() {}

        final EODistributionContext this$0;

    }

    public static interface Delegate {


        public abstract NSData distributionContextWillSendData(EODistributionContext eodistributioncontext, NSData nsdata);

        public abstract NSData distributionContextDidReceiveData(EODistributionContext eodistributioncontext, NSData nsdata);

        public abstract boolean distributionContextShouldFollowKeyPath(EODistributionContext eodistributioncontext, String s);

        public abstract boolean distributionContextShouldAllowInvocation(EODistributionContext eodistributioncontext, Object obj, NSSelector nsselector, Object aobj[]);

        public abstract boolean distributionContextShouldAllowAccessToClassDescription(EODistributionContext eodistributioncontext, EOClassDescription eoclassdescription);

        public abstract boolean distributionContextShouldFetchObjectsWithFetchSpecification(EODistributionContext eodistributioncontext, EOFetchSpecification eofetchspecification);

        public abstract boolean distributionContextShouldFetchObjectWithGlobalID(EODistributionContext eodistributioncontext, EOGlobalID eoglobalid, EOClassDescription eoclassdescription);

        public abstract boolean distributionContextShouldSave(EODistributionContext eodistributioncontext, EOEditingContext eoeditingcontext);



        public static final Class _CLASS = null;

    }



    public static NSArray distributionContextsForSession(WOSession session) { return null; }

    public EODistributionContext(WOSession session, EOEditingContext editingContext) { return null; }

    public EODistributionContext(WOSession session) { return null; }

    public void dispose() {}

    public static String _checkedURL(String url) { return null; }

    private void _initializeRemoteMethodReceivers() {}

    public void addRemoteMethodReceiver(Object target) {}

    public NSArray remoteMethodReceivers() { return null; }

    public void setDelegate(Object delegate) {}

    public Object _mthdelegate() { return null; }

    public void setInvocationTarget(Object invocationTarget) {}

    public Object invocationTarget() { return null; }

    public EOEditingContext editingContext() { return null; }

    public WOSession session() { return null; }

    public NSArray _processClientRequest(NSArray object) { return null; }

    public NSData _responseUsingTransientCoderWithObjects(NSArray objects) { return null; }

    public NSArray _collectAndResetNotifications() { return null; }

    public NSData responseToClientMessage(NSData message) { return null; }

    public void _rememberGID(EOGlobalID gid, NSArray additionalToManyRelationshipKeys) {}

    public void _forgetGID(EOGlobalID gid) {}

    public void _insertedObject(EOEnterpriseObject eo, EOGlobalID gid) {}

    private void _markGids(NSArray gids) {}

    void _snapshotsReleased(NSArray gids) { return null; }

    public void _sharedEditingContextChanged(NSNotification notification) {}

    private NSArray _filteredNotificationGIDs(NSArray globalIDs) { return null; }

    public void _objectsChangedInStore(NSNotification notification) {}

    public void _invalidatedAllObjectsInStore(NSNotification nsnotification) {}

    public void _globalIDChanged(NSNotification notification) {}

    void _throwOptimisticLockingFailurForDeletionOfGlobalID(EOGlobalID gid) { return null; }

    public void _throwOptimisticLockingFailureForGlobalIDIfNecessary(EOGlobalID gid) {}

    public EOEnterpriseObject _serverEOWithGlobalID(EOGlobalID gid, EOClassDescription classDescription) { return null; }

    public EOEnterpriseObject _serverEOWithGlobalID(EOGlobalID gid) { return null; }

    public Object _replacementObjectForEncodedObject(Object object) { return null; }

    public Object _replacementObjectForDecodedObject(Object object) { return null; }

    private boolean _selectorRepresentsUnrestrictedMethod(NSSelector selector) { return true; }

    public boolean _shouldFollowKeyPath(String path, NSSelector selector) { return true; }

    public boolean _shouldAllowInvocation(Object target, NSSelector selector, Object arguments[]) { return true; }

    static  {}

    public static final Class _CLASS = null;
    _NSDelegate _delegate;
    Object _invocationTarget;
    _EOReferenceRecordingCoder _coder;
    NSMutableDictionary _classDescriptionCache;
    NSMutableDictionary _byGlobalIDReplacement;
    NSMutableArray _notificationsToReplay;
    NSMutableArray _awakeDecodedObjects;
    NSMutableArray _awakeEnterpriseObjects;
    EOEditingContext _editingContext;
    EOEditingContext _sharedEditingContext;
    WOSession _session;
    NSMutableSet _lockedGids;
    NSMutableSet _deletedGids;
    NSMutableDictionary _changedGids;
    boolean _lockedAndChangedGidsSent;
    NSMutableDictionary _toManySend;
    NSMutableDictionary _toManyPrefetch;
    NSMutableArray _targets;
    boolean _targetsInitialized;
    private static final String distributionContextWillSendData = "distributionContextWillSendData";
    private static final String distributionContextDidReceiveData = "distributionContextDidReceiveData";
    private static final String distributionContextShouldFollowKeyPath = "distributionContextShouldFollowKeyPath";
    private static final String distributionContextShouldAllowInvocation = "distributionContextShouldAllowInvocation";
    private static final String distributionContextShouldAllowAccessToClassDescription = "distributionContextShouldAllowAccessToClassDescription";
    private static final String distributionContextShouldFetchObjectsWithFetchSpecification = "distributionContextShouldFetchObjectsWithFetchSpecification";
    private static final String distributionContextShouldFetchObjectWithGlobalID = "distributionContextShouldFetchObjectWithGlobalID";
    private static final String distributionContextShouldSave = "distributionContextShouldSave";
    public static final String DistributionContextInstantiatedNotification = "EODistributionContextInstantiatedNotification";
    public static final String RemoteMethodReceiverNeededNotification = "EORemoteMethodReceiverNeededNotification";
    private static final String _DistributionContextInSessionKey = "_EODistributionContextInSession";
    static final NSSelector _entitySelector;
    private static final NSSelector _sharedEditingContextChangedSelector;
    private static final NSSelector _objectsChangedInStoreSelector;
    private static final NSSelector _invalidatedAllObjectsInStoreSelector;
    private static final NSSelector _globalIDChangedSelector;

}
