
package com.webobjects.eoapplication;

import com.webobjects.foundation._NSUtilities;


public interface _EOControllerNotifications {


    public abstract void subcontrollerEditedDidChange(EOController eocontroller);

    public abstract void subcontrollerConnectionDidChange(EOController eocontroller);

    public abstract void subcontrollerActionsDidChange(EOController eocontroller);

    public abstract void subcontrollerVisibilityDidChange(EOComponentController eocomponentcontroller);



    public static final Class _CLASS = null;

}
