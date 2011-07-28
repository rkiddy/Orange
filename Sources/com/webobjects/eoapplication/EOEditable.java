
package com.webobjects.eoapplication;

import com.webobjects.eointerface.EOAssociation;
import com.webobjects.foundation._NSUtilities;

public interface EOEditable {


    public abstract void setEditability(int i);

    public abstract int editability();

    public abstract boolean isEditable();

    public abstract void supercontrollerEditabilityDidChange();

    public abstract void takeResponsibilityForEditabilityOfAssociation(EOAssociation eoassociation);



    public static final Class _CLASS = null;
    public static final int NeverEditable = 0;
    public static final int AlwaysEditable = 1;
    public static final int IfSupercontrollerEditable = 2;

}
