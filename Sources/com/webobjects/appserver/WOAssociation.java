package com.webobjects.appserver;
/**
 * The WOAssociation abstract class declares the programmatic interface to objects that represent the values of WebObject attributes, as specified in a declarations file.
 * The purpose of a WOAssociation object is to provide a unified interface to values of different types. For example, consider these declarations:
 * TREENAME1:WOString {value ="Ash"}; TREENAME2:WOString {value =treeName}; TREENAME3:WOString {value =selectedTree.name};
 * At runtime, the WebObjects parser scans an HTML template and these declarations and creates three WOString dynamic element objects. In the first case, the WOString's value attribute is assigned a constant string. In the second, it's associated with the treeName variable of the component in which the dynamic element is declared. In the third, value is associated with the name attribute of the component's selectedTree variable. The search path for the value can be arbitrarily deep, depending on the needs of your application:
 * MAYOR:WOString {value =country.state.city.mayor.name};
 * To resolve a path such as this, WebObjects accesses each part in turn. First, it looks for the component's country variable. If the component implements a country method, it sends one to determine the value; otherwise, it directly accesses the component's country instance variable to determine the value. Next, it checks the country object for a state attribute, using the same strategy of looking for an accessor method named state and then, if necessary, accessing the state variable's value directly. It continues in this way until it determines the ultimate value. This follows the NSKeyValueCoding interface scheme.
 * WOAssociation objects present the WebObjects framework with a unified interface to attribute values, whether their values are static or dynamic. The value attribute for TREENAME1 in the example above will never change during the course of program execution, but the other WOStrings have values that are potentially dynamic, and so will have to be determined at runtime.
 * Privately, WebObjects has its own set of subclasses of WOAssociation, each dealing with one of the above-mentioned association types. Since the value of any WOAssociation can be determined by invoking its valueInComponent method, objects that use WOAssociation objects don't have to be concerned with how values are resolved.
 * Also, objects that own WOAssociation objects can be used in a multithreaded environment and shared by multiple components safely. The component instance on which the association applies is determined at runtime, passed through by the various API defined below. The WODynamicElement subclasses make extensive use of this feature: although there is only one instance of a given dynamic element for a given page, several instances of the same page can be rendered dynamically each using their own value, at the same time, thanks to the WOAssociation owned by this dynamic element.
 * You rarely need to create subclasses of WOAssociation, except perhaps in situations where you subclassed WODynamicElement and wanted a special type of WOAssociation. In that case you would most likely instantiate your own WOAssociation subclass objects in your own WODynamicElement constructor.
 * See Also:WOAssociation.valueInComponent(WOComponent aComponent), WODynamicElement, NSKeyValueCoding
 */
public abstract class WOAssociation implements java.lang.Cloneable{
    /**
     * name of Event for timing value assignment involving traversing an arbitrary key path.
     * See Also:WOEvent, Constant Field Values
     */
    public static final java.lang.String TakeValueForKeyPathEvent="takeValueForKeyPath";

    /**
     * name of Event for timing value retrieval involving traversing an arbitrary key path.
     * See Also:WOEvent, Constant Field Values
     */
    public static final java.lang.String ValueForKeyPathEvent="valueForKeyPath";

    protected WOAssociation(){
         //TODO codavaj!!
    }

    /**
     * Creates and returns a WOAssociation object for a key path. The value is determined by evaluating aKeyPath at runtime, in a given component. This method is used when a dynamic element's attribute is set to a variable from the component's script. For example, when the WebObjects parser sees a declaration of this sort,
     * TREENAME3:WOString {value = selectedTree.name}; it invokes associationWithKeyPath to create a WOAssociation whose key is "selectedTree.name". When the resulting WOAssociation is asked for its value, it searches for the value of the name attribute of the current component's selectedTree attribute. If aKeyPath is null, the value of the WOAssociation is also null.
     */
    public static com.webobjects.appserver.WOAssociation associationWithKeyPath(java.lang.String aKeyPath){
        return null; //TODO codavaj!!
    }

    /**
     * Creates and returns a WOAssociation object for a constant value. This method is used when a dynamic element's attribute is set to a constant. For example, when the WebObjects parser sees a declaration of this sort,
     * TREENAME3:WOString {value =
     * Time Flies!
     * }; it invokes this method to create a WOAssociation whose value is "Time Flies!".
     */
    public static com.webobjects.appserver.WOAssociation associationWithValue(java.lang.Object aValue){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the binding String as seen in WebObjects Builder. This abstract method is implemented by WOAssociation subclasses to return, as a String, the binding string from the declarations ('wod') file. It may be resolved by the component in which the association resides. This is used during DirectToWeb page generation.
     */
    public abstract java.lang.String bindingInComponent(com.webobjects.appserver.WOComponent aComponent);

    /**
     * Returns the association's value for this component as a boolean. First, the association value is computed by calling valueInComponent(aComponent)
     * Then, this method returns false if:
     * - value is null
     * - value is a java.lang.Boolean with a value of false
     * - value is a java.lang.Number, a numeric value equivalent to zero.
     * - value is a java.lang.String, either "no", "false", "nil" or "null" (independent of case)
     * - value is a java.lang.String that can be interpreted as a number whose value is zero (using Integer.parseInt())
     * Otherwise, this method returns true.
     */
    public boolean booleanValueInComponent(com.webobjects.appserver.WOComponent aComponent){
        return false; //TODO codavaj!!
    }

    /**
     * Used to check if an association value is constant at runtime.
     */
    public boolean isValueConstant(){
        return false; //TODO codavaj!!
    }

    /**
     * Used to check if an association value is constant at runtime for a given component.
     */
    public boolean isValueConstantInComponent(com.webobjects.appserver.WOComponent aComponent){
        return false; //TODO codavaj!!
    }

    /**
     * Used to check if an association can assign values at runtime.
     */
    public boolean isValueSettable(){
        return false; //TODO codavaj!!
    }

    /**
     * Used to check if an association can assign values at runtime for a given component.
     */
    public boolean isValueSettableInComponent(com.webobjects.appserver.WOComponent aComponent){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the key path if there is one. This abstract method is implemented by WOAssociation subclasses to return, as a String, the keypath that the association binds to the component attribute (variable or accessor method) if there is one. If the association doesn't contain a keypath, as is the case when the association binds a constant value, the String "none" is returned.
     */
    public abstract java.lang.String keyPath();

    /**
     * Enables logging whenever the association assigns or retrieves values. This is a great debugging feature, as it allows the developer to monitor which associations are triggered, when, and in which order during the request-response loop. The three String parameters are included for logging purpose only, and allow you to specify the binding name, the declaration name, and the declaration type, respectively.
     */
    public void setDebugEnabledForBinding(java.lang.String aBindingName, java.lang.String aDeclarationName, java.lang.String aDeclarationType){
        return; //TODO codavaj!!
    }

    /**
     * Sets the value for this association in the component. Using NSKeyValueCoding, this method finds the variable, or setter method in aComponent pointed to by the association binding name. It then sets the variable's value to aValue, or invokes the setter method with aValue as a parameter. This method throws an exception if the receiver's value is not settable. For example, invoking setValue on a WOAssociation created from this declaration,
     * USER:WOTextField {value = userName}; sets the current component's userName variable to the value typed into the WOTextField.
     * This method is used to set values throughout the WebObjects framework by all private subclasses of WODynamicElement.
     * Another way in which the WebObjects framework uses this method is to synchronize the values of nested components. When attributes in child and parent components are associated with one another and changes occur in one component, this method is invoked to migrate those changes to the other component.
     */
    public void setValue(java.lang.Object aValue, com.webobjects.appserver.WOComponent aComponent){
        return; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the association's value for this component.
     * For example, invoking value on a WOAssociation created from this declaration,
     * DOWNPAYMENT:WOString {value = downpayment}; returns the value of the current component's downpayment variable. Invoking value on a WOAssociation created from this declaration,
     * DOWNPAYMENT:WOString {value =
     * $5000.00
     * }; returns the value "$5000.00" (independent of the current component).
     * This method raises an exception if it cannot resolve the WOAssociation's value with the current component.
     * This method is used to retrieve values throughout the WebObjects framework by all private subclasses of WODynamicElement.
     * Another way in which the WebObjects framework uses this method is to synchronize the values of nested components. When attributes in child and parent components are associated with one another and changes occur in one component, this method is invoked to migrate those changes to the other component.
     */
    public java.lang.Object valueInComponent(com.webobjects.appserver.WOComponent aComponent){
        return null; //TODO codavaj!!
    }

    /**
     * The WOAssociation.Event class is used to time value assignment/retrieval at the component level.
     * See Also:WOEvent, WOAssociation.ValueForKeyPathEvent, WOAssociation.TakeValueForKeyPathEvent, Serialized Form
     */
    public static class Event extends com.webobjects.appserver.WOEvent{
        public Event(){
             //TODO codavaj!!
        }

        /**
         * Used by The WOAssociationEventRow component in WOJExtensions to display the association's binding name.
         */
        public java.lang.String bindingName(){
            return null; //TODO codavaj!!
        }

        /**
         * This method provides information for the event display.
         */
        public java.lang.String comment(){
            return null; //TODO codavaj!!
        }

        /**
         * Used by The WOAssociationEventRow component in WOJExtensions to display the association's declaration name.
         */
        public java.lang.String declarationName(){
            return null; //TODO codavaj!!
        }

        /**
         * Used by The WOEventDisplay page in WOJExtensions to determine the event row name displayed.
         */
        public java.lang.String displayComponentName(){
            return null; //TODO codavaj!!
        }

        /**
         * Used by The WOAssociationEventRow component to determine the event type.
         */
        public boolean isPush(){
            return false; //TODO codavaj!!
        }

        /**
         * Used by The WOAssociationEventRow component in WOJExtensions to display the association's key path.
         */
        public java.lang.String keyPath(){
            return null; //TODO codavaj!!
        }

        /**
         * Used to set a default binding name on Events created for associations which have not had setDebugEnabledForBinding() invoked.
         */
        public void setBindingNameWithComponent(com.webobjects.appserver.WOComponent component, com.webobjects.appserver.WOAssociation assoc){
            return; //TODO codavaj!!
        }

        /**
         * Unused, but added for key value coding symmetry.
         */
        public void setKeyPath(java.lang.String aKeyPath){
            return; //TODO codavaj!!
        }

    }
}
