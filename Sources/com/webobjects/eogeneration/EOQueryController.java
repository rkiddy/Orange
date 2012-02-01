package com.webobjects.eogeneration;
public class EOQueryController extends com.webobjects.eoapplication.EOEntityController implements java.awt.event.ActionListener, com.webobjects.eogeneration.EOWidgetController.DefaultAction, com.webobjects.eogeneration.EOWidgetController.DefaultAction.CommonWidgetHandler, com.webobjects.eogeneration.EOControllerFactory.Query, com.webobjects.eogeneration.EOQueryObjectDisplay{
    public EOQueryController(){
         //TODO codavaj!!
    }

    public EOQueryController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    public void actionPerformed(java.awt.event.ActionEvent event){
        return; //TODO codavaj!!
    }

    public void append(){
        return; //TODO codavaj!!
    }

    public boolean canTakeResposibilityForDefaultActionWithActionWidget(javax.swing.JComponent actionWidget){
        return false; //TODO codavaj!!
    }

    public void clear(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Reacts to the connection for the receiver being established, taking care of association connecting and fetching if necessary.
     */
    protected void connectionWasEstablished(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked from loadArchive to notify the receiver that its interface file has been loaded completely. You can override this method to perform additional initialization for the objects loaded from the interface file archive.
     */
    protected void controllerDidLoadArchive(com.webobjects.foundation.NSDictionary namedObjects){
        return; //TODO codavaj!!
    }

    public void defaultAction(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns an array of the receiver's default actions (EOAction objects). A subclass of EOController should override this method to return the actions it defines merged with the actions of its superclass. Never invoke this method directly. Instead, invoke actions, which caches the results of defaultActions and is therefore more efficient.
     */
    protected com.webobjects.foundation.NSArray defaultActions(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Prepares the receiver so it is disposed when Java performs garbage collection.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Ensures that all editors of the receiver's display groups end editing (flush current user edits to the enterprise object graph if necessary). This method is invoked automatically before saving or reverting changes in subclasses.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns whether the receiver should fetch its display group content next time its connection is established. This value changes often: Whenever an entity controller prepares for a new task, it sets this flag to true. Once it retrieves objects explicitly (for example from a global ID) or actually performs the fetch while connecting, it sets this flag to false.
     */
    public boolean fetchesOnConnect(){
        return false; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOFetchSpecification fetchSpecification(){
        return null; //TODO codavaj!!
    }

    public void find(){
        return; //TODO codavaj!!
    }

    public void findAll(){
        return; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EODataSource newQueryDataSource(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eointerface.EODisplayGroup newQueryDisplayGroup(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOEditingContext newQueryEditingContext(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns an object for an outlet path to be substituted in an interface file archive loaded by the receiver. This methods allows you to substitute objects for all objects that can be reached through an outlet connection from the file's owner, for example the editingContext of the receiver (which is the file's owner of the archive) or displayGroup.dataSource. If no substitution object is needed, this method returns null.
     */
    public java.lang.Object objectForOutletPath(com.webobjects.eoapplication.EOArchive archive, java.lang.String outletPath){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Prepares the receiver for performing a new task by resetting any data and refetching objects if necessary.
     */
    public void prepareForNewTask(boolean prepareSubcontrollersForNewTask){
        return; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOQualifier qualifier(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eointerface.EODisplayGroup queryDisplayGroup(){
        return null; //TODO codavaj!!
    }

    public com.webobjects.eocontrol.EOEditingContext queryEditingContext(){
        return null; //TODO codavaj!!
    }

    public void queryObjectsWithFetchSpecification(com.webobjects.eocontrol.EOFetchSpecification fetchSpecification){
        return; //TODO codavaj!!
    }

    public boolean runsConfirmDialogForEmptyQualifiers(){
        return false; //TODO codavaj!!
    }

    public void setQueryDisplayGroup(com.webobjects.eointerface.EODisplayGroup displayGroup){
        return; //TODO codavaj!!
    }

    public void setQueryEditingContext(com.webobjects.eocontrol.EOEditingContext editingContext){
        return; //TODO codavaj!!
    }

    public void setRunsConfirmDialogForEmptyQualifiers(boolean flag){
        return; //TODO codavaj!!
    }

    public void takeResposibilityForDefaultActionWithActionWidget(javax.swing.JComponent actionWidget){
        return; //TODO codavaj!!
    }

}
