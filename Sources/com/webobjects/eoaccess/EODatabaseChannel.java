
package com.webobjects.eoaccess;

import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;


public class EODatabaseChannel {
    static class _EODatabaseChannelFetchResult {


        public _EODatabaseChannelFetchResult(EOEnterpriseObject t, EOGlobalID g, EOEntity e, NSDictionary snap, boolean init) { return null; }

        public static NSArray initializeObjects(NSArray objects, EOEditingContext ec, EODatabaseContext dc) { return null; }

        public EOEnterpriseObject initializeObject(EOEditingContext ec, EODatabaseContext dc) { return null; }

        public EOEnterpriseObject _object;
        public EOGlobalID _globalID;
        public EOEntity _entity;
        public NSDictionary _effectiveSnapshot;
        public boolean _requiresECInit;

    }



    public EODatabaseChannel(EODatabaseContext databaseContext) { return null; }

    private void setEntity(EOEntity entity) {}

    public void setCurrentEntity(EOEntity entity) {}

    public void setCurrentEditingContext(EOEditingContext context) {}

    public void selectObjectsWithFetchSpecification(EOFetchSpecification fetchSpecification, EOEditingContext context) {}

    public boolean isFetchInProgress() { return true; }

    public Object fetchObject() { return null; }

    _EODatabaseChannelFetchResult _fetchObject() { return null; }

    _EODatabaseChannelFetchResult _recForFetch(EOEnterpriseObject t, EOGlobalID g, EOEntity e, NSDictionary snap, boolean init) { return null; }

    public void cancelFetch() {}

    public EODatabaseContext databaseContext() { return null; }

    public EOAdaptorChannel adaptorChannel() { return null; }

    public boolean isRefreshingObjects() { return true; }

    public void setIsRefreshingObjects(boolean isRefreshingObjects) {}

    public boolean isLocking() { return true; }

    public void setIsLocking(boolean isLocking) {}

    protected void _openChannel() {}

    protected void _closeChannel() {}

    protected void _cancelInternalFetch() {}

    private EOEditingContext currentEditingContext() { return null; }

    protected void _setCurrentEntityAndRelationshipWithFetchSpecification(EOFetchSpecification fetchSpec) {}

    protected void _buildNodeListWithParent(NSMutableArray nodes, EOEntity parent) {}

    protected void _selectWithFetchSpecificationEditingContext(EOFetchSpecification fetchSpecification, EOEditingContext context) {}

    public NSArray _propertiesToFetch() { return null; }

    protected EODatabaseContext _databaseContext;
    protected EOAdaptorChannel _adaptorChannel;
    protected EOEntity _currentEntity;
    protected EOEditingContext _currentEditCtx;
    protected long _currentEditCtxTimestamp;
    protected NSMutableArray _fetchProperties;
    protected NSMutableArray _fetchSpecifications;
    protected NSMutableArray _refreshedGIDs;
    protected boolean _isLocking;
    protected boolean _isRefreshingObjects;
    protected boolean _isFetchingSingleTableEntity;
    private final NSSelector _pathSelector;

}
