package com.webobjects.eoapplication;
/**
 * EOInterfaceController serves as a convenient base class for logic related to the interface of client-side applications. When the WebObjects assistants in Xcode create a new client-side interface file (a nib file edited in Interface Builder), they always create an EOInterfaceController subclass together with the interface file.
 * In an application constructed in conformance to the Model-View-Controller paradigm, EOInterfaceController plays the role of controller. It has four special outlets (defined in the EOEntityController superclass): Its editingContext, its component, its displayGroup, and its controllerDisplayGroup, all of which you can configure using Interface Builder.
 * The object identified by component is a JComponent that functions as the view, since it is the main entry point into the user interface. Because an enterprise object must always inhabit an editing context, editingContext and its contents serve as the model. The displayGroup is an EODisplayGroup containing the enterprise objects manipulated by the controller's user interface (which may involve other display groups). The controllerDisplayGroup is a convenience instance containing nothing but the interface controller itself, so you can use associations to bind the controller to user interface widgets.
 * Unless otherwise specified, the name of the interface file loaded by the interface controller is the same as its class name (without the package name).
 */
public abstract class EOInterfaceController extends com.webobjects.eoapplication.EODocumentController{
    /**
     * Creates a new interface controller.
     */
    public EOInterfaceController(){
         //TODO codavaj!!
    }

    /**
     * Creates a new interface controller using the editing context editingContext. The editing context is used as substitution editing context when loading the interface file.
     * Parameters:editingContext - the editing context for the interface controller
     */
    public EOInterfaceController(com.webobjects.eocontrol.EOEditingContext editingContext){
         //TODO codavaj!!
    }

    /**
     * Creates a new interface controller using a special interface file name archiveName (usually the interface file name defaults to the class name) and using the editing context editingContext. The editing context is used as substitution editing context when loading the interface file.
     * Parameters:editingContext - the editing context for the interface controllerarchiveName - the name of the interface file loaded by the interface controller
     */
    public EOInterfaceController(com.webobjects.eocontrol.EOEditingContext editingContext, java.lang.String archiveName){
         //TODO codavaj!!
    }

    /**
     * Creates a new interface controller from an EOXMLUnarchiver.
     * Parameters:unarchiver - the unarchiver providing XML attributes.
     */
    public EOInterfaceController(com.webobjects.eoapplication.EOXMLUnarchiver unarchiver){
         //TODO codavaj!!
    }

    /**
     * Overridden from the superclass to substitute the class name (without package name) of the interface controller as the interface file name unless it was explicitly specified in the constructor.
     */
    public java.lang.String archiveName(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden from the superclass to raise an IllegalStateException: A interface controller requires an interface file when it prepares its user interface.
     */
    protected void generateComponent(){
        return; //TODO codavaj!!
    }

}
