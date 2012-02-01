package com.webobjects.eoapplication;
/**
 * EOEditable is an interface that defines an API for managing the editability of a branch of the controller hierarchy. EOEditable controllers usually base the editability of their user interfaces on the editability of their supercontrollers. Thus, by default all the EOEditable subcontrollers of an editable controller are also editable. To enable or disable a portion of an application's user interface, you need only message the highest level controller associated with that user interface.
 */
public interface EOEditable{
    /**
     * The constant describing that a controller is always editable.
     * See Also:Constant Field Values
     */
    static final int AlwaysEditable=1;

    /**
     * The constant describing that a controller is editable if its supercontroller is editable. If none of a controller's supercontrollers implement EOEditable, then it defaults to EOEditable.AlwaysEditable.
     * See Also:Constant Field Values
     */
    static final int IfSupercontrollerEditable=2;

    /**
     * The constant describing that a controller is never editable.
     * See Also:Constant Field Values
     */
    static final int NeverEditable=0;

    /**
     * Returns the editability of the receiver. The default behavior should be to return EOEditable.IfSupercontrollerEditable.
     */
    abstract int editability();

    /**
     * Returns whether the receiver is currently editable. A receiver is editable if its editability is EOEditable.AlwaysEditable or its editability is EOEditable.IfSupercontrollerEditable and sending EOEditable.isEditable to the first EOEditable supercontroller of the receiver returns true.
     */
    abstract boolean isEditable();

    /**
     * Sets the editability of the receiver to editability. See the method description of setEditability in the interface specification for EOEditable.
     */
    abstract void setEditability(int editability);

    /**
     * Invoked to notify the receiver that the editability of its supercontroller changed, giving the receiver the opportunity to update its user interface to match the editability of the supercontroller. This method is only sent to connected subcontrollers whose editability is EOEditable.IfSupercontrollerEditable.
     */
    abstract void supercontrollerEditabilityDidChange();

    /**
     * Invoked when one of the receiver's subcontrollers is disposed as a transient controller. This method instructs the receiver to assume responsibility for managing the editability of the subcontroller's EOAssociation, association.
     */
    abstract void takeResponsibilityForEditabilityOfAssociation(com.webobjects.eointerface.EOAssociation association);

}
