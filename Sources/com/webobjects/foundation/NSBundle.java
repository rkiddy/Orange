package com.webobjects.foundation;
/**
 * An NSBundle represents a location in the file system that groups code and resources that can be used in a program. NSBundles locate program resources and assist in localization. You build a bundle in Xcode using a Java WebObjects Application or Java WebObjects Framework project.
 * NSBundles can be stored on disk in two ways.
 * The first way is a directory where related resources--including executable code--are stored. The directory, in essence, "bundles" a set of resources used by an application into convenient chunks, and the NSBundle object makes those resources available to the application. NSBundle can find requested resources in the directory. The term bundle refers both to the object and to the directory it represents.
 * The second way is a java JAR file (Java ARchive). Again, all of the classes and resources are encapsulated into the JAR file. In this case, the term bundle refers to the JAR file itself.
 * At this point, JAR files are the preferred storage mechanism for NSBundles. However using JAR files requires that java.net.URLs be used to reference resources inside bundles. Path APIs (which typically operate on Strings) cannot be used. All Path APIs in the base WebObjects frameworks should be deprecated.
 * Bundles are useful in a variety of contexts. Since bundles combine executable code with the resources used by that code, they facilitate installation and localization. NSBundles are also used to locate specific resources and to determine which classes are loaded.
 * Each resource in a bundle usually resides in its own file. Bundled resources include such things as: Images--GIF or JPEG images displayed on web pages Localized character strings
 * Every application has a single application bundle called the "main bundle". You obtain an NSBundle object corresponding to the main bundle with the mainBundle static method. This is typically the running application itself.
 * You can get an NSBundle object associated with a framework by invoking the static method bundleForName specifying, as the argument, the name of the framework without the ".framework" extension. Alternatively you can invoke the bundleForClass method specifying a class that's defined in the framework. To get all the framework bundles available to your application, you can invoke the frameworkBundles static method.
 * Resources specific to a particular language are grouped together in a resource directory. This directory has the name of the language (in English) followed by a ".lproj" extension (for "language project"). The application mentioned above, for example, would have Japanese.lproj, English.lproj, French.lproj, German.lproj, and Spanish.lproj directories. The application also has a Nonlocalized.lproj directory, which contains resources shared by all locales.
 * It is good programming practice to ensure that if a resource appears in one language directory it also appears in all the others. Thus, Icon.gif in French.lproj should be the French counterpart to the Spanish Icon.gif in Spanish.lproj, and so on. However this discipline is not completely necessary. If German.lproj does not contain an Icon.gif resource, the Icon.gif resource in Nonlocalized.lproj will be used instead.
 * The server's locale determines which set of localized resources will actually be used by the application. NSBundle objects invoke the java.util.Locale.getDefault method to determine the locale and chooses the localized resources accordingly.
 * For example, suppose the NSBundle resources are organized as shown below in Xcode: English.lproj Edit.wo Edit.html Edit.wod Edit.woo Nonlocalized.lproj Edit.wo Edit.html Edit.wod Edit.woo Images Icon.gif Background.jpeg Main.wo Main.html Main.wod Main.woo Then, these resources will appear on the file system as: Resources Edit.wo Edit.html Edit.wod Edit.woo Images Icon.gif Background.jpeg Main.wo Main.html Main.wod Main.woo English.lproj Edit.wo Edit.html Edit.wod Edit.woo
 * NSBundle provides two methods to determine the resources it contains: resourcePathsForResources and resourcePathsForLocalizedResources. These methods return resource paths, or paths specified according to NSBundle's resource organization, not the physical resource organization as it appears on the file system. For example, the resource path to the Background.jpeg resource in above example is Nonlocalized.lproj/Images/Background.jpeg.
 * NSBundle provides two methods to access resources: bytesForResourcePath and inputStreamForResourcePath. Both methods require a single argument: a full resource path as returned by the resourcePathsForResources and resourcePathsForLocalizedResources methods. The bytesForResourcePath method returns a byte array containing data for the resource specified by the path. The inputStreamForResourcePath returns an java.io.InputStream for the resource specified by the path.
 * Sometimes you want to access a localized resource without specifying the full resource path. For example, if you might want to get the Icon.gif resource appropriate for the current locale. To do this, you invoke resourcePathForLocalizedResourceNamed to determine the full resource path for the localized resource and, in turn, invoke bytesForResourcePath or inputStreamForResourcePath with the full path.
 * See Also:NSBundle.mainBundle(), NSBundle.bundleForName(String), NSBundle.bundleForClass(Class), NSBundle.frameworkBundles(), NSBundle.resourcePathsForResources(String, String), NSBundle.resourcePathsForLocalizedResources(String, String), NSBundle.resourcePathsForDirectories(String, String), NSBundle.bytesForResourcePath(String), NSBundle.inputStreamForResourcePath(String), NSBundle.resourcePathForLocalizedResourceNamed(String, String)
 */
public class NSBundle{
    /**
     * Notification that is sent when bundle has been loaded.
     * See Also:Constant Field Values
     */
    public static final java.lang.String BundleDidLoadNotification="NSBundleDidLoadNotification";

    /**
     * Key to get the CFBundleShortVersion string in the Info.plist for the bundle
     * Since: 5.4 See Also:Constant Field Values
     */
    public static final java.lang.String CFBUNDLESHORTVERSIONSTRINGKEY="CFBundleShortVersionString";

    /**
     * Notification that is sent when classes of this NSBundle have been loaded.
     * See Also:Constant Field Values
     */
    public static final java.lang.String LoadedClassesNotification="NSLoadedClassesNotification";

    /**
     * Key to get the 'Implementation-Version' info from a Jar manifest
     * Since: 5.4 See Also:Constant Field Values
     */
    public static final java.lang.String MANIFESTIMPLEMENTATIONVERSIONKEY="Implementation-Version";

    /**
     * Deprecated.
     */
    public static com.webobjects.foundation.NSArray allBundles(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static com.webobjects.foundation.NSArray allFrameworks(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets array containing the names of all the receiver's classes
     */
    public com.webobjects.foundation.NSArray bundleClassNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets an NSArray of the names of all the packages containing the receiver's classes.
     */
    public com.webobjects.foundation.NSArray bundleClassPackageNames(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the NSBundle that contains the class aClass.
     */
    public static com.webobjects.foundation.NSBundle bundleForClass(java.lang.Class aClass){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the NSBundle with the specified name aName. See name() for more information about how the name relates to the NSBundle's file system organization. This should only be used to look up frameworks; the main bundle should be resolved using NSBundle.mainBundle()
     */
    public static com.webobjects.foundation.NSBundle bundleForName(java.lang.String aName){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String bundlePath(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the URL to the NSBundle. Currently, this will always be of the form file:/path/to/bundle
     */
    public java.net.URL bundlePathURL(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static com.webobjects.foundation.NSBundle bundleWithPath(java.lang.String aPath){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the byte array containing the data for the resource specified by aResourcePath. The resource path must be specified relative to the top level of the resources hierarchy, that is, the directory containing the language subdirectories. It is usually returned from resourcePathsForResources or resourcePathsForLocalizedResources.
     * Note that the resource path for a resource is not the same as its file system path. See "Determining Available Resources" in the class description for more information about resource paths.
     */
    public byte[] bytesForResourcePath(java.lang.String aResourcePath){
        return null; //TODO codavaj!!
    }

    /**
     * Gets an NSArray containing the bundles for all the frameworks included in the application.
     */
    public static com.webobjects.foundation.NSArray frameworkBundles(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public com.webobjects.foundation.NSDictionary infoDictionary(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets an input stream containing the resource specified by aResourcePath. The resource path must be specified relative to the top level of the resources hierarchy, that is, the directory containing the language subdirectories. It is usually returned from resourcePathsForResources or resourcePathsForLocalizedResources.
     * Note that the resource path for a resource is not the same as its file system path. See "Determining Available Resources" in the class description for more information about resource paths.
     */
    public java.io.InputStream inputStreamForResourcePath(java.lang.String aResourcePath){
        return null; //TODO codavaj!!
    }

    /**
     * Determines if this NSBundle object is a framework.
     */
    public boolean isFramework(){
        return false; //TODO codavaj!!
    }

    /**
     * Determines if this NSBundle object represents a JAR file.
     */
    public boolean isJar(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public boolean load(){
        return false; //TODO codavaj!!
    }

    /**
     * Gets the application's main bundle. In general, the main bundle corresponds to an application file package or application wrapper: a directory that bears the name of the application and is marked by a ".woa" extension.
     */
    public static com.webobjects.foundation.NSBundle mainBundle(){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the name of this NSBundle object. If the bundle is a WebObjects application, this method returns the name of the directory containing the application without the ".woa" extension. If the bundle is a WebObjects Framework, this method returns the name of the directory containing the framework without the ".framework" extension.
     */
    public java.lang.String name(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String pathForResource(java.lang.String aName, java.lang.String anExtension){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String pathForResource(java.lang.String aName, java.lang.String anExtension, java.lang.String aSubDirPath){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public com.webobjects.foundation.NSArray pathsForResources(java.lang.String anExtension, java.lang.String aSubDirPath){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an URL to the resource specified by aResourcePath. The resource path must be specified relative to the top level of the resources hierarchy, that is, the directory containing the language subdirectories. It is usually returned from resourcePathsForResources or resourcePathsForLocalizedResources.
     * Note that the resource path for a resource is not the same as its file system path. See "Determining Available Resources" in the class description for more information about resource paths.
     */
    public java.net.URL pathURLForResourcePath(java.lang.String aResourcePath){
        return null; //TODO codavaj!!
    }

    /**
     * Gets the NSBundle's principal class, which is responsible for ensuring that all classes in the framework are properly initialized. The NSBundle determines its principal class based on the bundle's property list. The property list represents a dictionary; the principle class is the value obtained using the key NSPrincipalClass. If the principal class is not specified in the property list, the method returns null. If you create a framework that needs to be initialized using a principal class, you must specify the class name in the CustomInfo.plist file, a source file for the bundle's property list. For example, if your principal class is myPackage.myPrincipalClass, your CustomInfo.plist file should look like: { NSPrincipalClass = myPackage.myPrincipalClass; }
     */
    public java.lang.Class principalClass(){
        return null; //TODO codavaj!!
    }

    /**
     * Get the properties that are located in the Properties file in the Resources subdirectory of the directory corresponding to this NSBundle.
     */
    public java.util.Properties properties(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String resourcePath(){
        return null; //TODO codavaj!!
    }

    /**
     * Determines the resource path of the resource named aName based on the current locale. This method first searches the current locale's language directory for the resource then the Nonlocalized.lproj directory. If it finds the resource, it returns the resource's path. Otherwise it returns null. You can specify a subdirectory aSubDirPath for the method to search in. For example, if the current locale is English, and the resources are organized as shown in the class description and you invoke resourcePathForLocalizedResourceNamed for the "Edit.html" resource in the "Edit.wo" subdirectory, the method returns "English.lproj/Edit.wo/Edit.html". If the current locale is German, the method returns "Nonlocalized.lproj/Edit.wo/Edit.html".
     */
    public java.lang.String resourcePathForLocalizedResourceNamed(java.lang.String aName, java.lang.String aSubDirPath){
        return null; //TODO codavaj!!
    }

    /**
     * Gets an array containing the resource paths of all the directories with the specified extension anExtension beneath the specified subdirectory aSubDirPath. If anExtension is null, the method includes directories regardless of extension. If aSubDirPath is null, the method returns directories beneath the top level directory (the one containing the language directories).
     * Examples of invoking resourcePathsForDirectories with various parameters for the bundle depicted in the class description.
     * Results of invoking resourcePathsForDirectories extension subdirectory Result null null {"English.lproj/Edit.wo", "English.lproj/Images", "Nonlocalized.lproj/Edit.wo", "Nonlocalized.lproj/Images", "Nonlocalized.lproj/Main.wo"} "wo" null {"Nonlocalized.lproj/Main.wo", "Nonlocalized.lproj/Edit.wo", "English.lproj/Edit.wo"} null "English.lproj" {"English.lproj/Edit.wo", "English.lproj/Images"} "wo" "English.lproj" {"English.lproj/Edit.wo"}
     */
    public com.webobjects.foundation.NSArray resourcePathsForDirectories(java.lang.String extension, java.lang.String aSubDirPath){
        return null; //TODO codavaj!!
    }

    /**
     * Gets an array containing the resource paths for all of the receiver's resources that are appropriate for the current locale, have the specified file extension anExtension, and lie within the specified subdirectory aSubDirPath.
     * If a resource appears in more than one language directory, this method chooses whether to include it in the array based on the following criteria: If the resource appears in the language directory for the current locale, the method includes its path in the results array. If the resource appears in Nonlocalized.lproj but not in the current locale's language directory, the method includes its path in the results array. If the resource doesn't appear in Nonlocalized.lproj or the current locale's language directory the method does not include its path in the results array.
     * This method also takes the extension and subdirectory arguments that allow you to filter the result array based on the extension or subdirectory. Examples of invoking this method with various parameters for the bundle depicted in the class description.
     * Results of invoking resourcePathsForLocalizedResources extension subdirectory Result null null { "English.lproj/Edit.wo/Edit.html", "English.lproj/Edit.wo/Edit.wod", "English.lproj/Edit.wo/Edit.woo", "Nonlocalized.lproj/Images/Icon.gif", "Nonlocalized.lproj/Images/Background.jpeg", "Nonlocalized.lproj/Main.wo/Main.html", "Nonlocalized.lproj/Main.wo/Main.wod", "Nonlocalized.lproj/Main.wo/Main.woo" } "html" null { "English.lproj/Edit.wo/Edit.html", "Nonlocalized.lproj/Main.wo/Main.html" } null "Edit.wo" { "English.lproj/Edit.wo/Edit.html", "English.lproj/Edit.wo/Edit.wod", "English.lproj/Edit.wo/Edit.woo" } "html" "Edit.wo" { "English.lproj/Edit.wo/Edit.html" }
     */
    public com.webobjects.foundation.NSArray resourcePathsForLocalizedResources(java.lang.String extension, java.lang.String aSubDirPath){
        return null; //TODO codavaj!!
    }

    /**
     * Gets an array containing the resource paths of all of the receiver's resources that have the specified file extension anExtension and lie within the specified subdirectory aSubDirPath.
     * If anExtension is null, the method includes resources regardless of extension. If aSubDirPath is null, the method returns resources beneath the top level directory (the one containing the language directories).
     * The following shows examples of invoking this method with various parameters for the bundle depicted in the class description.
     * Results from invoking resourcePathsForResources. extension subdirectory Result null null { "English.lproj/Edit.wo/Edit.html", "English.lproj/Edit.wo/Edit.wod", "English.lproj/Edit.wo/Edit.woo", "English.lproj/Images/Icon.gif", "Nonlocalized.lproj/Edit.wo/Edit.html", "Nonlocalized.lproj/Edit.wo/Edit.wod", "Nonlocalized.lproj/Edit.wo/Edit.woo", Nonlocalized.lproj/Images/Icon.gif", "Nonlocalized.lproj/Images/Background.jpeg", "Nonlocalized.lproj/Main.wo/Main.html", "Nonlocalized.lproj/Main.wo/Main.wod", "Nonlocalized.lproj/Main.wo/Main.woo" } "gif" null { "English.lproj/Images/Icon.gif", "Nonlocalized.lproj/Images/Icon.gif" } null "English.lproj" { "English.lproj/Edit.wo/Edit.html", "English.lproj/Edit.wo/Edit.wod", "English.lproj/Edit.wo/Edit.woo", "English.lproj/Images/Icon.gif" } "gif" "English.lproj" { "English.lproj/Images/Icon.gif" }
     */
    public com.webobjects.foundation.NSArray resourcePathsForResources(java.lang.String extension, java.lang.String aSubDirPath){
        return null; //TODO codavaj!!
    }

    /**
     * The string returned includes the receiver's class name (NSBundle or a subclass), its name, its path, the names of its packages (as returned by bundleClassPackageNames), and the number of classes it contains.
     */
    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

}
