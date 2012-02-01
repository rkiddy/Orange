package com.webobjects.eointerface;
/**
 * An EODetailSelectionAssociation binds two EODisplayGroups together through a relationship, so that the destination display group acts as an editor for that relationship.
 * The destination display group shows all possible values for the relationship and indicates the actual members of the relationship by selecting them. The user can change the objects included in the relationship of the source by selecting and deselecting them in the destination.
 * EODetailSelectionAssociation is a useful alternative to EOMasterDetailAssociation and EOMasterPeerAssociation when it's more important to add and remove objects from a relationship than it is to edit the attributes of those objects.
 * Usable with: EOSisplayGroup
 * Aspects: selectedObjectsA relationship from objects in the source EODisplayGroup.
 * Suppose that an employee can be assigned any number of projects. Your application displays employees in one table view and projects in another. When an employee is selected in the first table view, the employee's assigned projects are selected in the other. To change the employee's project assignments, a user changes the selection in the project table view: to add a project to the set, the user selects it, and to remove a project from the set, the user deselects it. To do this, in Interface Builder control-drag a connection from the Projects display group to the Employee display group. Choose EODetailSelectionAssociation in the Connections inspector, and bind the selectedObjects aspect to the "projects" key.
 */
public class EODetailSelectionAssociation extends com.webobjects.eointerface.EOAssociation{
    /**
     * Creates a new EODetailSelectionAssociation to monitor and update the objects in object, an EODisplayGroup. You normally set up associations with Interface Builder, in which case you don't need to create them programmatically. However, if you do create them up programmatically, setting them up is a multi-step process. After creating an association, you must bind its aspects and establish its connections.
     * Parameters:object - EODisplayGroup for this association to monitor and updateSee Also:EOAssociation.bindAspect(java.lang.String, com.webobjects.eointerface.EODisplayGroup, java.lang.String), EOAssociation.establishConnection()
     */
    public EODetailSelectionAssociation(java.lang.Object object){
         //TODO codavaj!!
    }

    /**
     * Returns true if object is an instance of EODisplayGroup.
     */
    public boolean isUsableWithObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the primary aspect this association gets bound to.
     */
    public java.lang.String primaryAspect(){
        return null; //TODO codavaj!!
    }

    /**
     * See the subjectChanged method description in the superclass EOAssociation.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

}
