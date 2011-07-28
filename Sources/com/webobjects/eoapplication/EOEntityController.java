
package com.webobjects.eoapplication;

import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.EOAssociation;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.foundation.*;


public abstract class EOEntityController extends EOArchiveController
    implements EOObjectDisplay, EOAssociationConnector, EOArchive._ObjectInstantiationDelegate {


    public EOEntityController() { return null; }

    public EOEntityController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void dispose() {}

    public void _prepareObjectDisplayForNewTask(boolean clearObjects) {}

    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask) {}

    public boolean isRootEntityController() { return true; }

    protected void connectionWasEstablished() {}

    protected void connectionWasBroken() {}

    public void establishConnection() {}

    public void setResetsEditingContextWhenPreparingForNewTask(boolean flag) {}

    public boolean resetsEditingContextWhenPreparingForNewTask() { return true; }

    protected NSMutableArray _fetchOnLoadDisplayGroupsInObjects(NSArray objects, EOEditingContext editingContext, NSMutableArray predeterminedDisplayGroups) { return null; }

    protected void controllerWillLoadArchive() {}

    protected void controllerDidLoadArchive(NSDictionary namedObjects) {}

    public Object objectForOutletPath(EOArchive archive, String outletPath) { return null; }

    public void setEditingContextProviderMethodName(String string) {}

    public String editingContextProviderMethodName() { return null; }

    public void setDisplayGroupProviderMethodName(String string) {}

    public String displayGroupProviderMethodName() { return null; }

    public void setEntityName(String string) {}

    public String entityName() { return null; }

    protected String _derivedLabel() { return null; }

    public void setFetchesOnConnectEnabled(boolean flag) {}

    public boolean isFetchesOnConnectEnabled() { return true; }

    public void setFetchesOnConnect(boolean flag) {}

    public boolean fetchesOnConnect() { return true; }

    protected void _performFetchOnConnect() {}

    protected boolean _performedFetchOnConnect() { return true; }

    protected void _prepareSpecialTask(boolean prepareForNewTask, boolean fetchesOnConnect) {}

    protected EOEditingContext _defaultEditingContext() { return null; }

    public EOEditingContext nestedEditingContext() { return null; }

    public EOEditingContext newEditingContext() { return null; }

    public void handleEditingContextNotification(NSNotification notification) {}

    protected void startListeningToEditingContext() {}

    protected void stopListeningToEditingContext() {}

    public void setEditingContext(EOEditingContext editingContext) {}

    protected EOEditingContext _editingContextBeforeLoadingArchive() { return null; }

    public EOEditingContext editingContext() { return null; }

    protected EOEditingContext _editingContextOptimizedOfNeverBeenVisible() { return null; }

    public boolean endEditing() { return true; }

    protected void _abortEditing() {}

    protected EODisplayGroup _defaultDisplayGroup() { return null; }

    protected EODataSource _newDataSource(EOEditingContext editingContext) { return null; }

    protected EODataSource newDataSource() { return null; }

    protected NSArray displayGroupSortOrderings() { return null; }

    protected EODisplayGroup _newDisplayGroup(EODataSource dataSource) { return null; }

    public EODisplayGroup newDisplayGroup() { return null; }

    public EODisplayGroup newDisplayGroupUsingOptimisticRefresh() { return null; }

    protected void startListeningToDisplayGroup() {}

    protected void stopListeningToDisplayGroup() {}

    public void setDisplayGroup(EODisplayGroup displayGroup) {}

    protected EODisplayGroup _displayGroupBeforeLoadingArchive() { return null; }

    public EODisplayGroup displayGroup() { return null; }

    protected EODisplayGroup _displayGroupOptimizedOfNeverBeenVisible() { return null; }

    public void setObjectsWithFetchSpecification(EOFetchSpecification fetchSpecification) {}

    public void setObjectsWithGlobalIDs(NSArray globalIDs) {}

    public void setObjectWithGlobalID(EOGlobalID globalID) {}

    public void _setObject(EOEnterpriseObject object) {}

    public NSArray _objects() { return null; }

    protected int _numberOfSelectedObjects() { return 0; }

    public NSArray selectedObjects() { return null; }

    public NSArray selectedObjectsGlobalIDs() { return null; }

    public EOEnterpriseObject selectedObject() { return null; }

    public EOGlobalID selectedObjectGlobalID() { return null; }

    public void takeResposibilityForConnectionOfAssociation(EOAssociation association) {}

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    public static final String NestedEditingContextProviderMethodName = "nestedEditingContext";
    public static final String NewEditingContextProviderMethodName = "newEditingContext";
    public static final String NewDisplayGroupProviderMethodName = "newDisplayGroup";
    public static final String NewDisplayGroupUsingOptimisticRefreshProviderMethodName = "newDisplayGroupUsingOptimisticRefresh";
    private static final NSSelector _handleEditingContextNotificationSelector;
    private String _editingContextProviderMethodName;
    private String _displayGroupProviderMethodName;
    private EOEditingContext _editingContext;
    private EODisplayGroup _displayGroup;
    private EODisplayGroup _controllerDisplayGroup;
    private String _entityName;
    private boolean _resetsEditingContextWhenPreparingForNewTask;
    private boolean _neverFetchOnConnect;
    private boolean _fetchesOnConnect;
    private boolean _performedFetchOnConnect;
    private boolean _displayGroupLookupToCheckEntityNameForbidden;
    private boolean _fetchesAdditionalDisplayGroupsOnConnect;
    private NSMutableArray _additionalDisplayGroups;
    private boolean _redisplaysControllerDisplayGroupAtEndOfEvent;
    private NSMutableArray _connectionAssociations;

}
