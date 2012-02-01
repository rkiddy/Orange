package com.webobjects.eointerface;
/**
 * EOMasterAssociation is the abstract superclass of associations that link a master display group with a second, "child" display group. Use one of the concrete subclasses: EOMasterDetailAssociation, EOMasterPeerAssociation, or EOMasterCopyAssociation.
 * See Also:EOMasterDetailAssociation, EOMasterPeerAssociation, EOMasterCopyAssociation
 */
public abstract class EOMasterAssociation extends com.webobjects.eointerface.EOAssociation{
    /**
     * Used by subclasses of EOMasterAssociation to initialize data structures and set object as the display group that the association manages.
     * Parameters:object - display object for this association to manage; subclasses should call super and pass in a display group as the object parameter
     */
    public EOMasterAssociation(java.lang.Object object){
         //TODO codavaj!!
    }

    /**
     * Returns true if object is an instance of EODisplayGroup.
     */
    public boolean isUsableWithObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return the default aspect.
     */
    public java.lang.String primaryAspect(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's change notification priority. For more information, see the EODelayedObserver class specification (EOControl).
     */
    public int priority(){
        return 0; //TODO codavaj!!
    }

}
