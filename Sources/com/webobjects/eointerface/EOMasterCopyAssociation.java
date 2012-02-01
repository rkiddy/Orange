package com.webobjects.eointerface;
/**
 * An EOMasterCopyAssociation object synchronizes two EODisplayGroups that share the same data source but have different qualifiers.
 * By binding two display groups with an EOMasterCopyAssociation, any changes performed in one display group are immediately reflected in the other. Similarly, changing the selection in one display group immediately changes it in the other one.
 * Usable With: EODisplayGroup
 * Aspects parentAn EODisplayGroup with which the association's display group should be synchronized.
 * Examples Suppose you have an EODisplayGroup for displaying Talent objects (actors and directors) and another display group for displaying the pictures of the Talents who are actors. When a Talent is selected in the first display group, you want the "actor" display group to select that Talent's picture if the selected Talent is an actor. Since both display groups manage Talent objects, they can share the same EODataSource. However, the first display group is unqualified -- it fetches all Talent objects. The second display group is qualified to fetch only the Talents who are actors. To do this, in Interface Builder, start with an unqualified display group for displaying all the Talents. Drag a second display group from the Enterprise Objects palette into your nib. Control-drag a connection from the new display group to the unqualified Talent display group. In the Connections inspector, choose EOMasterCopyAssociation, select the parent aspect, and click Connect. This action automatically sets the second display group's data source. Initially, the data source is set to an EODetailDataSource -- that's what you'll see in Interface Builder. However, at runtime, the association switches the second display group's data source to that of the parent display group. Now when you run the application, the display groups will be synchronized with one another. (You'll programmatically assign a qualifier to the second display group so that it filters out non-actor Talents.)
 */
public class EOMasterCopyAssociation extends com.webobjects.eointerface.EOMasterAssociation{
    /**
     * Creates a new EOMasterCopyAssociation to monitor and update the objects in object, an EODisplayGroup. You normally set up associations with Interface Builder, in which case you don't need to create them programmatically. However, if you do create them up programmatically, setting them up is a multi-step process. After creating an association, you must bind its aspects and establish its connections.
     * Parameters:object - EODisplayGroup for this association to monitor and updateSee Also:EOAssociation.bindAspect(java.lang.String, com.webobjects.eointerface.EODisplayGroup, java.lang.String), EOAssociation.establishConnection()
     */
    public EOMasterCopyAssociation(java.lang.Object object){
         //TODO codavaj!!
    }

    /**
     * See the subjectChanged method description in the superclass EOAssociation.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

}
