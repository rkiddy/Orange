package com.webobjects.eointerface;
/**
 * An EOAssociation maintains a two-way binding between the properties of a display object, such as a text field or combo box, and the properties of one or more enterprise objects contained in one or more EODisplayGroups. You typically create and configure associations in Interface Builder, using the programmatic interface only when you write your own EOAssociation subclasses.
 * Principal Attributes: A display object (such as a text field or combo box) Aspects that control different parameters of the display object (such as value and enabled) One or more EODisplayGroups (no more than one per aspect) One or more keys (enteprise object properties) (as many as one key per aspect)
 * EOAssociation is an abstract class, defining only the general mechanism for binding display objects to EODisplayGroups. You always create instances of its various subclasses, which define behavior specific to different kinds of display objects. For information on the different EOAssociation subclasses you can use, see the following subclass specifications:
 * You normally set up EOAssociations using Interface Builder. Each of the class specifications for EOAssociation's subclasses provide an example using Interface Builder to set them up. EOAssociation's programmatic interface is more important when defining custom EOAssociation subclasses.
 * Constants EOAssociation defines the following String constants to identify the names of association aspects: ActionAspectNullAspectSignature ArgumentAspectParentAspect AttributeAspectSignatureSelectedIndexAspect AttributeToManyAspectSignatureSelectedObjectAspect AttributeToOneAspectSignatureSelectedTitleAspect AttributeToOneToManyAspectSignatureSourceAspect BackgroundColorAspectTextColorAspect BoldAspectTitlesAspect DestinationAspectToManyAspectSignature EnabledAspectToOneAspectSignature ItalicAspectToOneToManyAspectSignature MatchKey1AspectURLAspect MatchKey2AspectValueAspect MatchKey3Aspect
 */
public abstract class EOAssociation extends com.webobjects.eocontrol.EODelayedObserver implements com.webobjects.foundation.NSDisposable{
    /**
     * String value of the Action aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String ActionAspect="action";

    /**
     * String value of the Argument aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String ArgumentAspect="argument";

    /**
     * String signature of a Attribute aspect.
     * See Also:Constant Field Values
     */
    public static final java.lang.String AttributeAspectSignature="A";

    /**
     * String signature of a Attribute To Many aspect.
     * See Also:Constant Field Values
     */
    public static final java.lang.String AttributeToManyAspectSignature="AM";

    /**
     * String signature of a Attribute To One aspect.
     * See Also:Constant Field Values
     */
    public static final java.lang.String AttributeToOneAspectSignature="A1";

    /**
     * String signature of a Attribute To One To Many aspect.
     * See Also:Constant Field Values
     */
    public static final java.lang.String AttributeToOneToManyAspectSignature="A1M";

    /**
     * String value of the Background Color aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String BackgroundColorAspect="backgroundColor";

    /**
     * String value of the Bold aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String BoldAspect="bold";

    /**
     * String value of the Children aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String ChildrenAspect="children";

    /**
     * String value of the Destination aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String DestinationAspect="destination";

    /**
     * String value of the Enabled aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String EnabledAspect="enabled";

    /**
     * String value of the ExpandedIconAspect aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String ExpandedIconAspect="expandedIcon";

    /**
     * String value of the IconAspect aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String IconAspect="icon";

    /**
     * Used to indicate that an aspect value has not been set to a usable value.
     */
    public static int IgnoreValue;

    /**
     * String value of the IsLeaf aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String IsLeafAspect="isLeaf";

    /**
     * String value of the Italic aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String ItalicAspect="italic";

    /**
     * String value of the MatchKey1 aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String MatchKey1Aspect="matchKey1";

    /**
     * String value of the MatchKey2 aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String MatchKey2Aspect="matchKey2";

    /**
     * String value of the MatchKey3 aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String MatchKey3Aspect="matchKey3";

    /**
     * String signature of a Null aspect.
     * See Also:Constant Field Values
     */
    public static final java.lang.String NullAspectSignature="";

    /**
     * String value of the Parent aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String ParentAspect="parent";

    /**
     * String value of the Root aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String RootAspect="root";

    /**
     * String value of the Selected Index aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String SelectedIndexAspect="selectedIndex";

    /**
     * String value of the Selected Object aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String SelectedObjectAspect="selectedObject";

    /**
     * String value of the Selected Title aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String SelectedTitleAspect="selectedTitle";

    /**
     * Used to indicate that an aspect value has been set to a true/enabled value.
     */
    public static int SetValue;

    /**
     * String value of the Source aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String SourceAspect="source";

    /**
     * String value of the Text Color aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String TextColorAspect="textColor";

    /**
     * String value of the Titles aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String TitlesAspect="titles";

    /**
     * String signature of a To Many aspect.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ToManyAspectSignature="M";

    /**
     * String signature of a To One aspect.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ToOneAspectSignature="1";

    /**
     * String signature of a To One To Many Aspect aspect.
     * See Also:Constant Field Values
     */
    public static final java.lang.String ToOneToManyAspectSignature="1M";

    /**
     * Used to indicate that an aspect value has been set to a false/inactive value.
     */
    public static int UnsetValue;

    /**
     * String value of the URL aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String URLAspect="URL";

    /**
     * String value of the Value aspect
     * See Also:Constant Field Values
     */
    public static final java.lang.String ValueAspect="value";

    /**
     * Used by subclasses of EOAssociation to initialize data structures and set aDisplayObject as the display object that the association manages.
     * Parameters:aDisplayObject - display object for this association. to manage; subclasses should call their super class's constructor and pass in aDisplayObject
     */
    public EOAssociation(java.lang.Object aDisplayObject){
         //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return the names of the receiving class's aspects as an array of string objects. Subclasses should include their superclass's aspects and add their own when overriding this method.
     */
    public com.webobjects.foundation.NSArray aspects(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return the signatures of the receiver's aspects, an array of string objects matching its aspects array index for index. The signature strings can be any of:
     * Interface Builder uses aspect signatures to enable and disable keys in its Connections inspectors.
     */
    public com.webobjects.foundation.NSArray aspectSignatures(){
        return null; //TODO codavaj!!
    }

    /**
     * Finds all EOAssociation subclasses that can be used with the specified display object.
     */
    public static com.webobjects.foundation.NSArray associationClassesForObject(java.lang.Object object){
        return null; //TODO codavaj!!
    }

    /**
     * Defines the receiver's link between its display object and an EODisplayGroup. Binds aspect to key in displayGroup. Passing a null key unbinds the aspect, and attempting to bind an invalid aspect or one of a connected Association throws an exception. Invoke establishConnection after this method to finish setting up the binding.
     */
    public void bindAspect(java.lang.String aspect, com.webobjects.eointerface.EODisplayGroup displayGroup, java.lang.String key){
        return; //TODO codavaj!!
    }

    /**
     * Removes the receiver from its EODisplayGroup and display object. Subclasses should override this method to remove the receiver from any outlets of the display object and invoke super's implementation at the end.
     */
    public void breakConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Binds this association's aspects to the same display group(s) as the source EOAssociation. This method only binds aspects that occur both in this association and in the source association.
     */
    public void copyMatchingBindingsFromAssociation(com.webobjects.eointerface.EOAssociation source){
        return; //TODO codavaj!!
    }

    public com.webobjects.eointerface.EODisplayGroup displayGroupForAspect(java.lang.String aspect){
        return null; //TODO codavaj!!
    }

    public java.lang.String displayGroupKeyForAspect(java.lang.String aspect){
        return null; //TODO codavaj!!
    }

    /**
     * Clears all references this association has to other objects, especially its display object and EODisplayGroup. Call this method before nulling out a reference to this association to ensure it gets garbage collected properly.
     * Subclasses should override this method to do any additional cleanup that may be needed and invoke super's implementation at the end.
     */
    public void dispose(){
        return; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to pass the value of the receiver's display object to the EODisplayGroup, by invoking setValueForAspect with the display object's value and the appropriate aspect (typically value). Subclasses whose display objects immediately pass their changes back to the EOAssociation (such as a button or pop-up list) need not override this method. It's only needed when the display object's value is edited rather than simply set.
     */
    public boolean endEditing(){
        return false; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to attach this association to the outlets of its display object and to otherwise configure the display object (such as by setting its action method). The default implementation subscribes this association as an observer of its EODisplayGroups. Subclasses should invoke super's implementation after establishing their own connections.
     */
    public void establishConnection(){
        return; //TODO codavaj!!
    }

    /**
     * Checks whether or not the association is connected and ready for use.
     */
    public boolean isConnected(){
        return false; //TODO codavaj!!
    }

    protected boolean isEnabled(){
        return false; //TODO codavaj!!
    }

    protected boolean isEnabledAtIndex(int index){
        return false; //TODO codavaj!!
    }

    public boolean isExplicitlyDisabled(){
        return false; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return whether or not the recieving instance will work with anObject. The receiver can examine any relevant characteristic of anObject such as its class, configuration (such as whether an NSMatrix operates in radio mode), and so on.
     */
    public boolean isUsableWithObject(java.lang.Object object){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the receiver's display object.
     */
    public java.lang.Object object(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return the names of display object outlets that instances assume control of. Interface Builder uses this information to disable connections from these outlets in its Connections Inspector.
     */
    public com.webobjects.foundation.NSArray objectKeysTaken(){
        return null; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to return the default aspect, usually one denoting the displayed value, which by convention is named "value". EOAssociation's implementation returns null.
     */
    public java.lang.String primaryAspect(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the receiver's change notification priority. For more information, see the EODelayedObserver class specification (EOControl).
     */
    public int priority(){
        return 0; //TODO codavaj!!
    }

    /**
     * Registers associationClass with the EOAssociation class map. Once an association class is registered, using the correct object argument, it can be found by the associationClassesForObject method.
     */
    public static void registerAssociationClass(java.lang.Class associationClass){
        return; //TODO codavaj!!
    }

    /**
     * Sets according to flag whether or not the association is explicitly disabled. An association is "explicitly disabled" when the display object shouldn't be editable, such as in the case where the display object simply displays the results of a search.
     */
    public void setExplicitlyDisabled(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets aDisplayObject to be the display object that the association manages.
     */
    public void setObject(java.lang.Object aDisplayObject){
        return; //TODO codavaj!!
    }

    /**
     * Sets value in the selected enterprise object in the EODisplayGroup bound to aspect. Retrieves the display group and key bound to aspect, and sends the display group a setSelectedObjectValue message with value and the key as arguments.
     */
    public boolean setValueForAspect(java.lang.Object value, java.lang.String aspect){
        return false; //TODO codavaj!!
    }

    /**
     * Sets a value of the enterprise object at index in the EODisplayGroup bound to aspect. Retrieves the display group and key bound to aspect, and sends the display group a setValueForObjectAtIndex message with value, index, and the key as arguments.
     */
    public boolean setValueForAspectAtIndex(java.lang.Object value, java.lang.String aspect, int index){
        return false; //TODO codavaj!!
    }

    /**
     * Invoked by subclasses when the display object fails to validate its input, this method informs the EODisplayGroup bound to aspect with an associationFailedToValidateValue message, using the display group's selected object. Returns the result of that message, or true if there's no display group.
     * For example, an association's plugin bound to an NSControl object (Cocoa) receives a controlDidFailToFormatStringErrorDescription delegate message when the control's formatter fails to format the input string. Its implementation of that method invokes shouldEndEditing.
     */
    public boolean shouldEndEditing(java.lang.String aspect, java.lang.String invalidInput, java.lang.String errorDescription){
        return false; //TODO codavaj!!
    }

    /**
     * Works in the same manner as shouldEndEditing, but allows you to specify a particular object by index rather than implicitly specifying the selected object.
     */
    public boolean shouldEndEditingAtIndex(java.lang.String aspect, java.lang.String invalidInput, java.lang.String errorDescription, int index){
        return false; //TODO codavaj!!
    }

    /**
     * Overridden by subclasses to update state based on when an EODisplayGroup's selection or contents changes. This method is invoked automatically anytime a display group that's bound to the receiver changes. The receiver can query its display group with selectionChanged and contentsChanged messages to determine how it needs to update.
     */
    public void subjectChanged(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a value of the selected enterprise object in the EODisplayGroup bound to aspect. Retrieves the display group and key bound to aspect and sends the display group a selectedObjectValueForKey message with the key.
     */
    public java.lang.Object valueForAspect(java.lang.String aspect){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a value of the enterprise object at index in the EODisplayGroup bound to aspect. Retrieves the display group and key bound to aspect, and sends the display group a valueForObjectAtIndex message with index and the key.
     */
    public java.lang.Object valueForAspectAtIndex(java.lang.String aspect, int index){
        return null; //TODO codavaj!!
    }

}
