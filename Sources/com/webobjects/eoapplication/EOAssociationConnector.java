package com.webobjects.eoapplication;
/**
 * EOAssociationConnector is an interface that defines a controller that can assume the responsibilities for connecting and disconnecting the associations of a transient subcontroller.
 */
public interface EOAssociationConnector{
    /**
     * Invoked when one of the receiver's subcontrollers is disposed as a transient controller. Instructs the receiver to assume responsibility for managing the subcontroller's EOAssociation, association.
     */
    abstract void takeResposibilityForConnectionOfAssociation(com.webobjects.eointerface.EOAssociation association);

}
