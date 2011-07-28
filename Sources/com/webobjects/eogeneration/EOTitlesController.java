
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.EOTable;
import com.webobjects.foundation.*;
import javax.swing.JComponent;
import javax.swing.table.TableColumn;


public abstract class EOTitlesController extends EOAssociationController
    implements com.webobjects.eoapplication.EOComponentController.EndEditing {


    public static NSArray _objectsInEditingContextWithEntityName(EOEditingContext editingContext, String entityName) { return null; }

    public EOTitlesController() { return null; }

    public EOTitlesController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected void disposeAssociations() {}

    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask) {}

    protected void connectionWasEstablished() {}

    protected void connectionWasBroken() {}

    public boolean endEditing() { return true; }

    protected boolean _preferredCanResizeVertically() { return true; }

    public void setTitlesDisplayGroupProviderMethodName(String string) {}

    public String titlesDisplayGroupProviderMethodName() { return null; }

    public void addTitleKey(String key) {}

    public void removeTitleKey(String key) {}

    public void setTitleKeys(NSArray keys) {}

    public void setSingleTitleKey(String key) {}

    public NSArray titleKeys() { return null; }

    protected String _mainTitleKey() { return null; }

    public void setAvailableTitlesKey(String string) {}

    public String availableTitlesKey() { return null; }

    public void setSearchesTitlesObjectsInEditingContext(boolean flag) {}

    public boolean searchesTitlesObjectsInEditingContext() { return true; }

    public void setResetTitlesObjectsOnEveryConnect(boolean flag) {}

    public boolean resetTitlesObjectsOnEveryConnect() { return true; }

    public void setTitlesEntityName(String string) {}

    public String titlesEntityName() { return null; }

    protected EOEditingContext _defaultEditingContext() { return null; }

    protected EODataSource newTitlesDataSource() { return null; }

    protected NSArray _sortOrderings(NSArray keys) { return null; }

    protected NSArray titlesDisplayGroupSortOrderings() { return null; }

    public EODisplayGroup newTitlesDisplayGroup() { return null; }

    public void setTitlesDisplayGroup(EODisplayGroup displayGroup) {}

    public EODisplayGroup titlesDisplayGroup() { return null; }

    protected EOAssociation newAssociation(JComponent widget, EODisplayGroup displayGroup, String enabledKey, EODisplayGroup enabledDisplayGroup) { return null; }

    protected boolean _tableColumnForKeyShouldBeExplicitlyDisabled(String key, String nonEditableKeyPath, String additionalNonEditableKey) { return true; }

    private EOTableColumnAssociation _newTableColumnAssociation(String key, String entityName, EODisplayGroup displayGroup, EOTable table, TableColumn tableColumn, String nonEditableKeyPath, String additionalNonEditableKey) { return null; }

    protected String _labelForTitleKey(String key) { return null; }

    protected void _createTableColumnAssociationsAndAddThemToArray(NSMutableArray associationsArray, NSArray keys, String entityName, EODisplayGroup displayGroup, EOTable table, String specialOneColumnTitle, String nonEditableKeyPath, 
            String additionalNonEditableKey) { return null; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    public static final String NewTitlesDisplayGroupProviderMethodName = "newTitlesDisplayGroup";
    private String _titlesDisplayGroupProviderMethodName;
    private String _titlesEntityName;
    private NSMutableArray _titleKeys;
    private String _availableTitlesKey;
    private EODisplayGroup _titlesDisplayGroup;
    private EOAssociation _titlesMasterDetailAssociation;
    private boolean _fetchTitlesDisplayGroupWhenConnecting;
    private boolean _searchesTitlesObjectsInEditingContext;
    private boolean _resetTitlesObjectsOnEveryConnect;

}
