package com.webobjects.eogeneration;
public class EODisplayStatisticsController extends com.webobjects.eogeneration.EOStaticLabelController{
    public EODisplayStatisticsController(){
         //TODO codavaj!!
    }

    public EODisplayStatisticsController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns whether the controller can be transient. By default, a component controller is transient only if it's an instance of EOComponentController, not an instance of a subclass.
     */
    public boolean canBeTransient(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked when the receiver's component becomes visible, giving the receiver a chance to react. EOComponentController's implementation invokes establishConnection to ensure the receiver is connected to the controller hierarchy.
     */
    protected void componentDidBecomeVisible(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked from breakConnection to notify the receiver that its connection to its supercontroller has been broken, giving the receiver the opportunity to clean up after its become idle.
     */
    protected void connectionWasBroken(){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Invoked from establishConnection to notify the receiver that its connection to the controller hierarchy has been established, giving the receiver the opportunity to prepare itself (for example, setting delegates).
     */
    protected void connectionWasEstablished(){
        return; //TODO codavaj!!
    }

    public com.webobjects.eointerface.EODisplayGroup displayGroup(){
        return null; //TODO codavaj!!
    }

    public java.lang.String displayGroupProviderMethodName(){
        return null; //TODO codavaj!!
    }

    public java.lang.String displayPattern(){
        return null; //TODO codavaj!!
    }

    public void setDisplayGroup(com.webobjects.eointerface.EODisplayGroup displayGroup){
        return; //TODO codavaj!!
    }

    public void setDisplayGroupProviderMethodName(java.lang.String string){
        return; //TODO codavaj!!
    }

    public void setDisplayPattern(java.lang.String displayPattern){
        return; //TODO codavaj!!
    }

    public void subjectChanged(){
        return; //TODO codavaj!!
    }

}
