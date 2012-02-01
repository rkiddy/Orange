package com.webobjects.eointerface;
/**
 * An EOMasterDetailAssociation object binds one EODisplayGroup (the detail) to a relationship in another (the master), so that the detail display group contains the destination objects for the object selected in the master. The display group's data sources also operate in a master-detail arrangement, meaning changes to one are immediately reflected in the other. In this arrangement, the detail EODisplayGroup's data source must be an EODetailDataSource. The detail objects are taken directly from the selected object in the master EODisplayGroup, so that changes to the objects in one EODisplayGroup are instantly reflected in the other.
 * In com.webobjects.eointerface.cocoa, by contrast, with an EOMasterPeerAssociation, the two EODisplayGroups are independent of each other. In a master-peer setup, insertions and deletions in the detail EODisplayGroup don't affect the corresponding relationship property of the selected object in the master EODisplayGroup. Master-peer setups are more appropriate when no insertions or deletions will be made in the detail EODisplayGroup. See the EOMasterPeerAssociation class specification for more information.
 * Usable With: EODisplayGroup with a null or detail datasource
 * Aspects parentAn EODisplayGroup with which the association's display group should be synchronized.
 * Suppose you have a master EODisplayGroup displaying Movie objects and a detail display group displaying Talent objects. The two display groups are bound to one another through Movie's directors relationship -- a to-many relationship from Movie to Talent. When a Movie is selected, you want the Talent display group to display the Talents who directed the Movie. Inserting a new director into the Talent display group should add the director to the selected Movie's directors relationship; and similarly, deleting a director from the Talent display group should remove the director from the selected Movie's directors relationship.
 * To do this, in Interface Builder, Control-drag a connection from the Talent display group to the Movie display group. In the Connections inspector, choose EOMasterDetailAssociation, and bind parent aspect to the directors key.
 */
public class EOMasterDetailAssociation extends com.webobjects.eointerface.EOMasterAssociation{
    /**
     * Creates a new EOMasterDetailAssociation to monitor and update the objects in object, an EODisplayGroup. You normally set up associations with Interface Builder, in which case you don't need to create them programmatically. However, if you do create them up programmatically, setting them up is a multi-step process. After creating an association, you must bind its aspects and establish its connections.
     * Parameters:object - EODisplayGroup for this association to monitor and updateSee Also:EOAssociation.bindAspect(java.lang.String, com.webobjects.eointerface.EODisplayGroup, java.lang.String), EOAssociation.establishConnection()
     */
    public EOMasterDetailAssociation(java.lang.Object object){
         //TODO codavaj!!
    }

    /**
     * Clears all references this association has to other objects, especially its display object and EODisplayGroup. Call this method before nulling out a reference to this association to ensure it gets garbage collected properly. Subclasses should override this method to do any additional cleanup that may be needed and invoke super's implementation at the end.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Returns true if object is an instance of EODisplayGroup and its data source is either null or an EODetailDataSource (EOControl).
     */
    public boolean isUsableWithObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * See the subjectChanged method description in the superclass EOAssociation.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

}
