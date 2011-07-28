
package com.webobjects.appserver;



public class WOVariableAssociation extends WOAssociation {


    public WOVariableAssociation(String variable) { return null; }

    public Object valueInComponent(WOComponent aComponent) { return null; }

    public void setValue(Object aValue, WOComponent aComponent) {}

    public boolean isValueSettable() { return true; }

    public boolean isValueConstant() { return true; }

    public String bindingInComponent(WOComponent aComponent) { return null; }

    public String keyPath() { return null; }

    private String variable;

}
