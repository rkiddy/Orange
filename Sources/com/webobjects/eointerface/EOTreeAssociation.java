package com.webobjects.eointerface;
/**
 * EOTreeAssociation is used as an association for displaying hierarchical object trees, with widgets such as JTree. See EOAssociation for a general description of associations.
 * Aspects:
 * EOAssociation.ChildrenAspect,
 * EOAssociation.RootAspect,
 * EOAssociation.IsLeafAspect,
 * EOAssociation.ValueAspect,
 * EOAssociation.IconAspect,
 * EOAssociation.ExpandedIconAspect,
 * EOAssociation.EnabledAspect
 * See Also:EOAssociation
 */
public class EOTreeAssociation extends com.webobjects.eointerface.EOWidgetAssociation{
    /**
     * Returns a new EOValueAssociation object that is not bound to any display group.
     * Parameters:widget - the UI widget object that the association expects to use to display values
     */
    public EOTreeAssociation(java.lang.Object widget){
         //TODO codavaj!!
    }

    /**
     * Returns an array of objects representing the children of the tree node identified by identifier.
     */
    public com.webobjects.foundation.NSArray childrenOfObject(java.lang.Object identifier){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an expanded icon to display for the identifier object. The default implementation uses valueForKeyPath on the object with the key bound to the ExpandedIconAspect
     */
    public java.lang.Object expandedIconForObject(java.lang.Object identifier){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an icon to display for the identifier object. The default implementation uses valueForKeyPath on the object with the key bound to the IconAspect.
     */
    public java.lang.Object iconForObject(java.lang.Object identifier){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a boolean signifying whether or not to display the identifier as leaf. The default implementation uses valueForKeyPath on the object with the key bound to the IsLeafAspect.
     */
    public boolean isLeafObject(java.lang.Object identifier){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Overridden by subclasses to return the default aspect, usually one denoting the displayed value, which by convention is named "value". EOAssociation's implementation returns null.
     */
    public java.lang.String primaryAspect(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to update state based on when an EODisplayGroup's selection or contents changes. This method is invoked automatically anytime a display group that's bound to the receiver changes. The receiver can query its display group with selectionChanged and contentsChanged messages to determine how it needs to update.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

    /**
     * Returns the display value for the identifier object. The default implementation uses valueForKeyPath on the object with the key bound to the ValueAspect.
     */
    public java.lang.Object valueForObject(java.lang.Object identifier){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the Class of widget plugin that this association requires for operation. Subclasses should override this method to return the Class of plugin they require in order to work. (For example EOActionWidgetAsssociation requires a plugin class of EOActionWidgetAssociation.ActionPlugin).
     */
    protected java.lang.Class widgetPluginClass(){
        return null; //TODO codavaj!!
    }

    /**
     * TreePlugin communicates with a tree UI widget on behalf of an EOTreeAssociation. The TreePlugin class defines some basic functionality concrete subclasses must implement for this communication to work.
     */
    public static abstract class TreePlugin extends com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin{
        /**
         * Subclasses should override this constructor to do any initialization they need to, but should call the super(association, widget) constructor.
         * Parameters:association - EOTreeAssociation object for which the plugin will handle setting and getting values on the UI widgetwidget - the UI object that the plugin will use for display
         */
        public TreePlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
             //TODO codavaj!!
        }

        public abstract void setRootObject(java.lang.Object root);

        public abstract void setRootObjectChildren(com.webobjects.foundation.NSArray array);

    }
}
