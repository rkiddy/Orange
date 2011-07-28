
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class EOQueryController extends EOEntityController
    implements ActionListener, EOWidgetController.DefaultAction, EOWidgetController.DefaultAction.CommonWidgetHandler, EOControllerFactory.Query, EOQueryObjectDisplay {


    public EOQueryController() { return null; }

    public EOQueryController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    public void dispose() {}

    protected void _lightPrepareForNewTask() {}

    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask) {}

    protected void connectionWasEstablished() {}

    protected void controllerDidLoadArchive(NSDictionary namedObjects) {}

    public Object objectForOutletPath(EOArchive archive, String outletPath) { return null; }

    public EOEditingContext newQueryEditingContext() { return null; }

    public void setQueryEditingContext(EOEditingContext editingContext) {}

    public EOEditingContext queryEditingContext() { return null; }

    protected EOEditingContext _queryEditingContextOptimizedOfNeverBeenVisible() { return null; }

    public EODataSource newQueryDataSource() { return null; }

    public EODisplayGroup newQueryDisplayGroup() { return null; }

    public void setQueryDisplayGroup(EODisplayGroup displayGroup) {}

    public EODisplayGroup queryDisplayGroup() { return null; }

    protected EODisplayGroup _queryDisplayGroupOptimizedOfNeverBeenVisible() { return null; }

    public EOQualifier qualifier() { return null; }

    public EOFetchSpecification fetchSpecification() { return null; }

    public boolean fetchesOnConnect() { return true; }

    public boolean endEditing() { return true; }

    public void setRunsConfirmDialogForEmptyQualifiers(boolean flag) {}

    public boolean runsConfirmDialogForEmptyQualifiers() { return true; }

    protected NSArray defaultActions() { return null; }

    public void defaultAction() {}

    public boolean canTakeResposibilityForDefaultActionWithActionWidget(JComponent actionWidget) { return true; }

    public void takeResposibilityForDefaultActionWithActionWidget(JComponent actionWidget) {}

    private void _search(EOFetchSpecification fetchSpecification, boolean append, boolean checkWithUserIfEmptyQualifier) {}

    public void find() {}

    public void append() {}

    public void findAll() {}

    public void clear() {}

    public void queryObjectsWithFetchSpecification(EOFetchSpecification fetchSpecification) {}

    public void actionPerformed(ActionEvent event) {}

    static  {}

    public static final Class _CLASS;
    private EOEditingContext _queryEditingContext;
    private EODisplayGroup _queryDisplayGroup;
    private boolean _fetchesAdditionalQueryDisplayGroupsOnConnect;
    private NSMutableArray _additionalQueryDisplayGroups;
    private boolean _runsConfirmDialogForEmptyQualifiers;
    private NSMutableArray _defaultActionWidgets;

}
