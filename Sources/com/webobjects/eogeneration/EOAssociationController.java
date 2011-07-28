
package com.webobjects.eogeneration;

import com.webobjects.eoapplication.*;
import com.webobjects.eointerface.*;
import com.webobjects.foundation.*;
import java.text.Format;
import javax.swing.JComponent;


public abstract class EOAssociationController extends EOWidgetController
    implements EOEditable, EOAssociationConnector {


    static Format _formatForAssociation(EOController controller, Class formatClass, String formatPattern, EOWidgetController widgetController, String key) { return null; }

    static EODisplayGroup _displayGroupWithProviderMethodName(EOController controller, String providerMethodName) { return null; }

    static EOAssociationConnector _associationConnector(EOController controller) { return null; }

    static void _registerAssociationForConnectingInSupercontroller(EOController controller, EOAssociationConnector associationConnector, EOAssociation association) {}

    public EOAssociationController() { return null; }

    public EOAssociationController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected void disposeAssociations() {}

    public void dispose() {}

    protected boolean disposeIfTransient() { return true; }

    protected void connectionWasEstablished() {}

    protected void connectionWasBroken() {}

    public void setSuppressesAssociation(boolean flag) {}

    public boolean suppressesAssociation() { return true; }

    public void setPrefersContinuousChangeNotification(boolean flag) {}

    public boolean prefersContinuousChangeNotification() { return true; }

    public void setDisplayGroupProviderMethodName(String string) {}

    public String displayGroupProviderMethodName() { return null; }

    public void setEnabledDisplayGroupProviderMethodName(String string) {}

    public String enabledDisplayGroupProviderMethodName() { return null; }

    public void setEnabledKey(String string) {}

    public String enabledKey() { return null; }

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

    protected abstract EOAssociation newAssociation(JComponent jcomponent, EODisplayGroup eodisplaygroup, String s, EODisplayGroup eodisplaygroup1);

    public void setAssociation(EOAssociation association) {}

    public EOAssociation association() { return null; }

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    public static final String ControllerDisplayGroupProviderMethodName = "controllerDisplayGroup";
    private boolean _suppressesAssociation;
    private boolean _prefersContinuousChangeNotification;
    private String _displayGroupProviderMethodName;
    private String _enabledDisplayGroupProviderMethodName;
    private EODisplayGroup _displayGroup;
    private EODisplayGroup _enabledDisplayGroup;
    private String _enabledKey;
    private EOAssociation _association;
    private int _editability;
    private NSMutableArray _editabilityAssociations;
    private NSMutableArray _connectionAssociations;

}
