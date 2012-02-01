package com.webobjects.eoapplication;
/**
 * EOObjectDisplay is an interface that defines the behavior of a controller that displays enterprise objects.
 */
public interface EOObjectDisplay{
    /**
     * Returns a display group containing the receiver -- an EOController or subclass. This display group can be used to connect controller methods to the user interface through associations.
     */
    abstract com.webobjects.eointerface.EODisplayGroup controllerDisplayGroup();

    /**
     * Returns the display group the receiver uses to display its enterprise objects.
     */
    abstract com.webobjects.eointerface.EODisplayGroup displayGroup();

    /**
     * Returns the editing context the receiver uses to manage the graph of its enterprise objects.
     */
    abstract com.webobjects.eocontrol.EOEditingContext editingContext();

    /**
     * Returns the name of the entity of the enterprise objects displayed in the receiver's display group.
     */
    abstract java.lang.String entityName();

}
