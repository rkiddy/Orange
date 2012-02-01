package com.webobjects.eointerface;
/**
 * EOValueSelectionAssociation displays an attribute or to-one relationship value in a display object that offers the user multiple choices and the option of choosing just one of those choices. This association is typically used with pop-up lists, drop down menus, combo boxes, or radio matrices.
 * The value displayed in the display object can be set manually in Interface Builder or in the case of a relationship, constructed dynamically from values supplied by the destination entity's EODisplayGroup. The value displayed in the display object can be bound by one of three aspects: selectedTitle, which is useful for values representable as strings; selectedIndex, for integer values; and selectedObject, for the destination object of a relationship.
 * Usable with: com.webobjects.eointerface.swing: javax.swing.JComboBox and its subclasses. com.webobjects.eointerface.cocoa: NSComboBox, NSPopUpButton, NSRadioMatrix, and their subclasses.
 * Aspects: titlesAn attribute of the objects in an EODisplayGroup whose values can be represented as strings. selectedTitleAn attribute of the selected object whose values can be represented as strings. selectedTagAn integer attribute of the selected object. selectedObjectA to-one relationship of the selected object; the value displayed is that for the attribute bound to the titles aspect. enabledA boolean attribute of the selected object, which determines whether the display object is enabled.
 * Examples:
 * Suppose you have a Movie display group and you want to provide a pop-up list for setting the rating from a static list of strings. In this example, a Movie object's rating is a string property rather than a relationship to a Rating object. To do this, in Interface Builder, type the list of ratings into the pop-up list. Control-drag a connection from the pop-up list to the Movie display group. Choose EOValueSelectionAssociation in the Connections inspector, and bind the selectedTitle aspect to the "rating" key. With this configuration, if an object's string attribute value isn't in the pop-up list, it's temporarily added while the object is selected.
 * This example is similar to the previous one, except in this example, a Movie object's rating is chosen from strings in a Rating database table. There's a Rating EODisplayGroup that fetches the ratings into Rating objects, and the pop-up list is filled from the "ratingString" property of the rating display group's Rating objects. To do this, in Interface Builder, Control-drag a connection from the pop-up list to the Ratings display group. Choose EOValueSelectionAssociation in the Connections inspector, and bind the titles aspect to the "ratingString" key. Similarly, Control-drag a connection from the pop-up list to the Movie display group. Again choose EOComboBoxAssociation in the Connections inspector, and bind the selectedTitle aspect to the "rating" key.
 * Suppose you have a Customer enterprise object whose credit card type (Visa, MasterCard, and so on) is indicated by an integer tag. You want a user to be able to choose a customer's card type from a pop-up list. To do this, in Interface Builder, set the credit card names and tags for the pop-up list. Control-drag a connection from the pop-up list to the Customer display group. Choose EOValueSelectionAssociation in the Connections inspector, and bind the selectedTag aspect to the "cardType" key.
 * Suppose you have a list of employees and want to assign each employee a department. In terms of the object model, you want to assign a Department object as the destination of an Employee object's department relationship. To do this, in Interface Builder, Control-drag a connection from the pop-up list to a Department display group. Choose EOComboBoxAssociation in the Connections inspector, and bind the titles aspect to the "name" key. Similarly, Control-drag a connection from the pop-up list to the Employee display group. Again choose EOComboBoxAssociation in the Connections inspector, and bind the selectedObject to the "department" key. This fills the pop-up list with the names of departments, and causes the name of the selected Employee's Department to be selected in the pop-up list.
 */
public class EOValueSelectionAssociation extends com.webobjects.eointerface.EOWidgetAssociation{
    /**
     * Creates a new EOValueSelectionAssociation to monitor and update the values in aDisplayObject.
     * You normally set up associations with the Interface Builder application, in which case you don't need to create them programmatically. However, if you do create them up programmatically, setting them up is a multi-step process. After creating an association, you must bind its aspects and establish its connections.
     * Parameters:object - user interface widget for this association to connect to
     */
    public EOValueSelectionAssociation(java.lang.Object object){
         //TODO codavaj!!
    }

    /**
     * Defines the receiver's link between its display object and displayGroup. aspect is the name of the aspect it observes in its display object, and key is the name of the property it observes in aEODisplayGroup. Invoke establishConnection after this method to finish setting up the binding.
     */
    public void bindAspect(java.lang.String aspect, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * See the endEditing method description in the superclass EOAssociation. If ending editing fails, and the selected object aspect is bound, invokes associationFailedToValidateValue on the selected object display group.
     */
    public boolean endEditing(){
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
     * See the subjectChanged method description in the superclass EOAssociation.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

    /**
     * See the widgetPluginClass method description in the superclass EOWidgetAssociation.
     */
    protected java.lang.Class widgetPluginClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Invoked by the association's plugin when the selection in the display object changes.
     */
    public boolean widgetSelectionDidChange(){
        return false; //TODO codavaj!!
    }

    /**
     * ValueSelectionPlugin communicates with a UI widget on behalf of a EOValueSelectionAssociation. The ValueSelectionPlugin class defines some basic functionality concrete subclasses must implement for this communication to work.
     */
    public static abstract class ValueSelectionPlugin extends com.webobjects.eointerface.EOWidgetAssociation.WidgetPlugin{
        /**
         * Marker value to signify nothing has been selected.
         */
        public static int NoSelection;

        /**
         * Subclasses should override this constructor to do any initialization they need to, but should call the super(association, widget) constructor.
         * Parameters:association - EOValueSelectionAssociation object for which the plugin will handle setting and getting values on the UI widgetwidget - user interface object that the plugin will use for display
         */
        public ValueSelectionPlugin(com.webobjects.eointerface.EOWidgetAssociation association, java.lang.Object widget){
             //TODO codavaj!!
        }

        public abstract int selectionIndex();

        /**
         * Selects the title at index selectionIndex in the UI widget.
         */
        public abstract void setSelectionIndex(int selectionIndex, boolean isEnabled);

        /**
         * Sets the Object array to use for populating the titles of popup menu's or selection matrices. If the Object array, objects, is null, clear out titles. Only invoked if EOAssociation.TitlesAspect is bound.
         */
        public abstract void setTitlesFromObjects(java.lang.Object[] objects);

        /**
         * Returns a String array of titles that the plugin's widget currently displays Only invoked if EOAssociation.SelectedTitleAspect bound. Even if titles are derived from setTitlesFromObjects, returns the actual strings displayed
         */
        public abstract java.lang.String[] titles();

    }
}
