package com.webobjects.eointerface;
/**
 * An EOMasterPeerAssociation binds two EODisplayGroups together in a master-detail relationship, where the detail EODisplayGroup shows the destination objects for the relationship of the master EODisplayGroup.
 * In a master-peer arrangement, the detail display group's data source is independent. Detail objects are fetched independently from the detail's data source, which means that changes to one display group aren't automatically reflected in the other. To update the other display group, it's necessary to save the changes made and then have the other display group fetch its objects again.
 * Contrast this with a master-detail setup using an EOMasterDetailAssociation. With an EOMasterDetailAssociation, the display group's data sources also operate in a master-detail arrangement, meaning changes to one are immediately reflected in the other. The detail objects are taken directly from the selected object in the master display group, so that changes to the objects in one display group are instantly reflected in the other. Master-peer setups display these advantages over master-detail setups:
 * You can use them to display the destination objects for relationships that are defined in the model but are not declared as class properties. This is typically done for rarely accessed information, or information that is costly to access. By not defining the relationship as a class property, the destination objects aren't stored as instance variables in the source objects, which saves memory and the cost of constructing faults for the relationship.
 * Because the detail display group fetches objects with its own data source, you can configure the detail data source with an auxiliary EOQualifier to limit the objects fetched. This further reduces the cost of fetching data.
 * You can use an EOMasterPeerAssociation to fetch detail information that may be updated in another editing context or even in another application. Thus this association helps you to remain "up to date" with the database.
 * Generally, master-peer setups are only appropriate when no insertions or deletions will be made in the detail display group. For a master-detail relationship that reflects changes between two display groups, including insertions and deletions, use an EOMasterDetailAssociation.
 * Usable With: EODisplayGroups whose data sources are not EODetailDataSources
 * Aspects: parentA relationship from the master EODisplayGroup.
 * Example
 * Suppose you have a database of salesmen and their associated sales. Each salesman has a city ID. The sales are related to the salesmen by salesman ID, but also have a city ID. You want a list of all the sales in a salesman's city so you could evaluate it against other salesmen. For this, you create a relationship between salesman and sales based on city ID (the relationship is not a class property). You can then display that information using an EOMasterPeerAssociation.
 */
public class EOMasterPeerAssociation extends com.webobjects.eointerface.EOMasterDetailAssociation{
    /**
     * Creates a new EOMasterPeerAssociation to monitor and update the objects in object, an EODisplayGroup. You normally set up associations with Interface Builder, in which case you don't need to create them programmatically. However, if you do create them up programmatically, setting them up is a multi-step process. After creating an association, you must bind its aspects and establish its connections.
     * Parameters:object - EODisplayGroup for this association to monitor and updateSee Also:EOAssociation.bindAspect(java.lang.String, com.webobjects.eointerface.EODisplayGroup, java.lang.String), EOAssociation.establishConnection()
     */
    public EOMasterPeerAssociation(java.lang.Object object){
         //TODO codavaj!!
    }

    /**
     * Returns true if object is an instance of EODisplayGroup and its data source is either null or an EODetailDataSource (EOControl).
     */
    public boolean isUsableWithObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * See the subjectChanged method description in the superclass EOAssociation.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

}
