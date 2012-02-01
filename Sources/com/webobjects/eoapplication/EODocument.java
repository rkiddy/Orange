package com.webobjects.eoapplication;
/**
 * EODocument is an interface that defines the behavior of a controller that displays and edits enterprise objects.
 */
public interface EODocument{
    /**
     * Returns whether the receiver is a document for the enterprise object associated with globalID and entityName. Typically implementations return true if the receiver's display group is displaying the specified enterprise object.
     */
    abstract boolean isDocumentForGlobalID(com.webobjects.eocontrol.EOGlobalID globalID, java.lang.String entityName);

    /**
     * Returns the receiver's edited state.
     */
    abstract boolean isEdited();

    /**
     * Saves the receiver's edits, returning whether the operation was successful. The user is not given a choice to cancel the save, the save is always executed.
     */
    abstract boolean save();

    /**
     * If the receiver's enterprise object graph has been edited, opens an alert panel that allows the user to save the edits, discard the edits, or cancel the save operation. The operationTitle argument is used as the title of the alert panel, and message is used as the message in the panel. Returns whether the operation was successful or whether it failed or was cancelled.
     */
    abstract boolean saveIfUserConfirms(java.lang.String operationTitle, java.lang.String message);

    /**
     * Sets the receiver's edited state.
     */
    abstract void setEdited(boolean flag);

}
