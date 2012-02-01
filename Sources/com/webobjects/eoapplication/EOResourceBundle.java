package com.webobjects.eoapplication;
/**
 * EOResourceBundles are registered with EOUserInterfaceParameters to localize icons and strings. EOResourceBundles search the application's bundles for all available icons (gif, jpg, jpeg, png) and string tables (plist files in Unicode) and loads the resources on demand. All string tables are merged together, so if you place multiple string tables in your frameworks and applications, all strings from all string tables will be available on the client.
 * User preferred language and platform information is used to find the appropriate resources/strings for the client if multiple choices are available. You create platform and language variants of resources in Xcode (which basically means that you create copies of the resources in .lproj directories with names that indicate the platform). For example you can have an icon Apple.gif in multiple variants, English.lproj/Apple.gif, English.lproj/Apple-macos.gif, German.lproj/Apple.gif, German.lproj/Apple-macos.gif and EODefaultResourceBundle will use the right version for the client by checking the user preferred languages and the platform the client is running on.
 * Also, if an icon is available with the same name in multiple bundles, the version in the main bundle (the application bundle itself) is preferred over a version in the frameworks. So by placing an icon "ActionIconInspect.gif" in your application, you can "override" the default inspect icon provided by the WebObjects frameworks.
 */
public class EOResourceBundle extends java.util.ResourceBundle{
    /**
     * Default constructor. Calls super's implementation.
     */
    public EOResourceBundle(){
         //TODO codavaj!!
    }

    /**
     * Returns an enumeration of all available keys registered in the resource bundle.
     */
    public java.util.Enumeration getKeys(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the localized resource (a string or an icon) which is registered with the key key in the resource bundle. Throws a MissingResourceException if the resource is not found.
     */
    protected java.lang.Object handleGetObject(java.lang.String key) throws java.util.MissingResourceException{
        return null; //TODO codavaj!!
    }

}
