
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.EOAssociation;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.foundation.*;
import javax.swing.JComponent;


public abstract class EORangeValueController extends EORangeWidgetController
    implements EOEditable, EOAssociationConnector {


    public EORangeValueController() { return null; }

    public EORangeValueController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected void disposeAssociations() {}

    public void dispose() {}

    protected boolean disposeIfTransient() { return true; }

    public boolean canBeTransient() { return true; }

    protected void connectionWasEstablished() {}

    protected void connectionWasBroken() {}

    protected boolean _preferredCanResizeVertically() { return true; }

    public void setSuppressesAssociation(boolean flag) {}

    public boolean suppressesAssociation() { return true; }

    public void setDisplayGroupProviderMethodName(String string) {}

    public String displayGroupProviderMethodName() { return null; }

    public void setEnabledDisplayGroupProviderMethodName(String string) {}

    public String enabledDisplayGroupProviderMethodName() { return null; }

    public void setEnabledKey(String string) {}

    public String enabledKey() { return null; }

    public void setBothValueKeys(String string) {}

    public void setMinimumValueKey(String string) {}

    public String minimumValueKey() { return null; }

    public void setMaximumValueKey(String string) {}

    public String maximumValueKey() { return null; }

    protected String _derivedLabel() { return null; }

    private void _updateEditability() {}

    public void setEditability(int editability) {}

    public int editability() { return 0; }

    public boolean isEditable() { return true; }

    public void supercontrollerEditabilityDidChange() {}

    public void takeResponsibilityForEditabilityOfAssociation(EOAssociation association) {}

    protected EODisplayGroup _defaultDisplayGroup() { return null; }

    public EODisplayGroup controllerDisplayGroup() { return null; }

    public void setDisplayGroup(EODisplayGroup displayGroup) {}

    public EODisplayGroup displayGroup() { return null; }

    public void setEnabledDisplayGroup(EODisplayGroup displayGroup) {}

    public EODisplayGroup enabledDisplayGroup() { return null; }

    public void takeResposibilityForConnectionOfAssociation(EOAssociation association) {}

    protected abstract EOAssociation newMinimumAssociation(JComponent jcomponent, EODisplayGroup eodisplaygroup, String s, EODisplayGroup eodisplaygroup1);

    protected abstract EOAssociation newMaximumAssociation(JComponent jcomponent, EODisplayGroup eodisplaygroup, String s, EODisplayGroup eodisplaygroup1);

    public void setMinimumAssociation(EOAssociation association) {}

    public EOAssociation minimumAssociation() { return null; }

    public void setMaximumAssociation(EOAssociation association) {}

    public EOAssociation maximumAssociation() { return null; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    public static final String ControllerDisplayGroupProviderMethodName = "controllerDisplayGroup";
    private boolean _suppressesAssociation;
    private String _displayGroupProviderMethodName;
    private String _enabledDisplayGroupProviderMethodName;
    private EODisplayGroup _displayGroup;
    private EODisplayGroup _enabledDisplayGroup;
    private String _enabledKey;
    private String _minimumValueKey;
    private String _maximumValueKey;
    private EOAssociation _minimumAssociation;
    private EOAssociation _maximumAssociation;
    private int _editability;
    private NSMutableArray _editabilityAssociations;
    private NSMutableArray _connectionAssociations;

}
