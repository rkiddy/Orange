package com.webobjects.eointerface;
/**
 * An EOPickTextAssociation takes the value of its display object's plugin, a EOValueAssociation.ValuePlugin or subclass, and uses it's string value to form a qualifier with up to three LIKE operators, each compared to a different key of the EODisplayGroup. (Keys are specified in MatchKey1Aspect, MatchKey2Aspect, MatchKey3Aspect). It thereby acts as a filter on the display group. This allows the user to perform a similarity search based on whole or partial values.
 * Aspects:
 * EOAssociation.MatchKey1Aspect,
 * EOAssociation.MatchKey2Aspect,
 * EOAssociation.MatchKey3Aspect
 * Example
 * Make an EOPickTextAssociation between an NSTextField and an EODisplayGroup of People objects. Bind the matchKey1 and matchKey2 aspects to the "lastName" and "firstName" keys. If the user types "Bi" in the field, the EOPickTextAssociation applies the following qualifier to the EODisplayGroup:
 * (lastName like "*Bi*") OR (firstName like "*Bi*")
 * which matches names like "Bill Smith" and "Joe Biggs". The list of objects displayed in the display group is restricted to those that match the qualifier.
 * See Also:EOAssociation
 */
public class EOPickTextAssociation extends com.webobjects.eointerface.EOValueAssociation{
    /**
     * Creates a new EOPickTextAssociation to monitor and update the row values of a display group according to the text widget 'object', which supplies a text (String) value. You normally set up associations with Interface Builder, in which case you don't need to create them programmatically. However, if you do create them up programmatically, setting them up is a multi-step process. After creating an association, you must bind its aspects and establish its connections.
     * Parameters:object - the text widget which supplies the string value used as a filter on the display group
     */
    public EOPickTextAssociation(java.lang.Object object){
         //TODO codavaj!!
    }

    /**
     * This method returns null since the corresponding text widget is not used to display values, but to filter rows in a display group.
     */
    protected java.lang.String displayValueAspect(){
        return null; //TODO codavaj!!
    }

    /**
     * This method returns this association's primary aspect, which is EOAssociation.MatchKey1Aspect.
     */
    public java.lang.String primaryAspect(){
        return null; //TODO codavaj!!
    }

}
