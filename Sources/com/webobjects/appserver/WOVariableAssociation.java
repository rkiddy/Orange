package com.webobjects.appserver;
public class WOVariableAssociation extends com.webobjects.appserver.WOAssociation{
    public WOVariableAssociation(java.lang.String variable){
         //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Returns the binding String as seen in WebObjects Builder. This abstract method is implemented by WOAssociation subclasses to return, as a String, the binding string from the declarations ('wod') file. It may be resolved by the component in which the association resides. This is used during DirectToWeb page generation.
     */
    public java.lang.String bindingInComponent(com.webobjects.appserver.WOComponent aComponent){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Used to check if an association value is constant at runtime.
     */
    public boolean isValueConstant(){
        return false; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Used to check if an association can assign values at runtime.
     */
    public boolean isValueSettable(){
        return false; //TODO codavaj!!
    }

    /**
     * Overridden to return "".
     */
    public java.lang.String keyPath(){
        return null; //TODO codavaj!!
    }

    /**
     * Description copied from class:
     * Sets the value for this association in the component. Using NSKeyValueCoding, this method finds the variable, or setter method in aComponent pointed to by the association binding name. It then sets the variable's value to aValue, or invokes the setter method with aValue as a parameter. This method throws an exception if the receiver's value is not settable. For example, invoking setValue on a WOAssociation created from this declaration,
     * USER:WOTextField {value = userName}; sets the current component's userName variable to the value typed into the WOTextField.
     * This method is used to set values throughout the WebObjects framework by all private subclasses of WODynamicElement.
     * Another way in which the WebObjects framework uses this method is to synchronize the values of nested components. When attributes in child and parent components are associated with one another and changes occur in one component, this method is invoked to migrate those changes to the other component.
     */
    public void setValue(java.lang.Object aValue, com.webobjects.appserver.WOComponent aComponent){
        return; //TODO codavaj!!
    }

    /**
     * Description copied from class:
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

}
