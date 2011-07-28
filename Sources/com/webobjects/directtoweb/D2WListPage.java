
package com.webobjects.directtoweb;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;


public class D2WListPage extends D2WPage
    implements DTWGeneration, ListPageInterface, SelectPageInterface {
    class DeletionDelegate
        implements NextPageDelegate {


        public DeletionDelegate(EOEnterpriseObject object, EODataSource dataSource, WOComponent nextPage) { return null; }

        public WOComponent nextPage(WOComponent sender) { return null; }

        private EOEnterpriseObject _object;
        private EODataSource _dataSource;
        private WOComponent _nextPage;
        final D2WListPage this$0;

    }



    public WODisplayGroup displayGroup() { return null; }

    public int numberOfObjectsPerBatch() { return 0; }

    public D2WListPage(WOContext aContext) { return null; }

    public boolean isEntityReadOnly() { return true; }

    public void setLocalContext(D2WContext newValue) {}

    public String defaultSortKey() { return null; }

    public String _generateSortStatementForConstructor() { return null; }

    public void setDataSource(EODataSource dataSource) {}

    public boolean isSelecting() { return true; }

    public boolean isListEmpty() { return true; }

    public int listSize() { return 0; }

    public String alternatingColorForRow() { return null; }

    public String backgroundColorForRow() { return null; }

    public void setBackgroundColorForRow(String s) {}

    public EOEnterpriseObject selectedObject() { return null; }

    public void setSelectedObject(EOEnterpriseObject selectedObject) {}

    public WOComponent selectObjectAction() { return null; }

    public WOComponent inspectObjectAction() { return null; }

    public WOComponent editObjectAction() { return null; }

    public WOComponent deleteObjectAction() { return null; }

    public WOComponent backAction() { return null; }

    public String backgroundColorForRowMethod() { return null; }

    public void editingContextDidSaveChanges(NSNotification notif) {}

    public void finalize() throws Throwable {}

    public void appendToResponse(WOResponse r, WOContext c) {}

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 1L;
    public WODisplayGroup _displayGroup;
    public boolean _hasToUpdate;
    private boolean _rowFlip;
    private String _defaultSortKey;
    private boolean _displayGroupAlreadySetUp;

}
