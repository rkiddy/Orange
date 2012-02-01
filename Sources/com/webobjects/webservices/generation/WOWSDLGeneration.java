package com.webobjects.webservices.generation;
/**
 * See Also:Serialized Form
 */
public class WOWSDLGeneration extends com.webobjects.webservices.generation.WOOperation{
    /**
     * Key used with takeValueForKey to set the D2WContext of a WSDL generating WOComponent
     */
    public static java.lang.String D2WContextKey;

    public WOWSDLGeneration(com.webobjects.appserver.WOContext context){
         //TODO codavaj!!
    }

    /**
     * Returns the result of invoking generateResponse on a WOComponent configured to generate WSDL. First, the name is found for the WOComponent which will generate the service's WSDL. The component name is found by getting the D2WContext value for WOServiceUtilities.RuleSystemConstants.WSDLComponentNameKey. Once found, the component has its D2WContext set by takeValueForKey using D2WContextKey.
     */
    public java.lang.Object invoke(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns false since this operation class does not require an entity.
     */
    public static boolean requiresEntity(){
        return false; //TODO codavaj!!
    }

}
