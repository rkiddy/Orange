package com.webobjects.appserver;
/**
 * The WOResourceManager class manages all resources of an application. It is a singleton object, designed to be thread safe, assuming that only one WOResourceManager exists in any one address space.
 */
public class WOResourceManager{
    /**
     * This is the default constructor for the WOResourceManager class.
     */
    protected WOResourceManager(){
         //TODO codavaj!!
    }

    /**
     * Returns raw data for the specified resource. When calling this method you must provide the name of the resource (including the filename extension) specified by aResourceName, the name of the framework in which the resource resides (or null if the resource resides within the application) specified by aFrameworkName, and an NSArray of String objects identifying the order in which the language-specific resources should be searched (supply null for this third argument specified by aLanguageList if the default order is sufficient). It is a good idea to start using this method instead of pathForResourceNamed as we will be changing the WebObjects resource packaging in the near future. This method calls inputStreamForResourceNamed with the same parameters.
     */
    public byte[] bytesForResourceNamed(java.lang.String aResourceName, java.lang.String aFrameworkName, com.webobjects.foundation.NSArray aLanguagesList){
        return null; //TODO codavaj!!
    }

    /**
     * Finds the content type for a given resource name extension. The content type is determined based upon the filename extension; if the resource's filename supplied to this method has no extension or the extension isn't one of those listed in [/System, c:/Apple, /opt/Apple]/Library/Frameworks/JavaWebObjects.framework/Resources/MIME.plist this method returns "text/plain".
     */
    public java.lang.String contentTypeForResourceNamed(java.lang.String aResourcePath){
        return null; //TODO codavaj!!
    }

    /**
     * Error URL returned when a resource specified is not found. If a resource name is not supplied (that is, if null is passed as the first parameter), the error message will contain "null" in place of the resource name. If a framework name is passed as the second parameter, the error message will have the following form: /ERROR/NOT_FOUND/framework=frameworkName/filename=resourceName. If null is passed as the second parameter, the error message will include the application name instead of a framework name and will have the following form: /ERROR/NOT_FOUND/app=applicationName/filename=resourceName.
     */
    public java.lang.String errorMessageUrlForResourceNamed(java.lang.String aResourceName, java.lang.String aFrameworkName){
        return null; //TODO codavaj!!
    }

    /**
     * Removes all data from the dynamic data cache. This method can be used to remove persistent dynamic data from the application-wide cache. Access to the WOResourceManager object is locked at the beginning of this method and unlocked at the end.
     */
    public void flushDataCache(){
        return; //TODO codavaj!!
    }

    /**
     * Returns a stream of data for the specified resource. When calling this method you must provide the name of the resource (including the filename extension) specified by aResourceName, the name of the framework in which the resource resides (or null if the resource resides within the application) specified by aFrameworkName, and an NSArray of String objects identifying the order in which the language-specific resources should be searched (supply null for this third argument if the default order is sufficient) specified by aLanguageList. It is a good idea to start using this method instead of pathForResourceNamed as we will be changing the WebObjects resource packaging in the near future.
     */
    public java.io.InputStream inputStreamForResourceNamed(java.lang.String aResourceName, java.lang.String aFrameworkName, com.webobjects.foundation.NSArray aLanguagesList){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Returns the file path of the specified resource. This method has been deprecated. Please use pathURLForResourceNamed instead.
     */
    public java.lang.String pathForResourceNamed(java.lang.String aResourceName, java.lang.String aFrameworkName, com.webobjects.foundation.NSArray aLanguagesList){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the URL to the specified resource. Include the file's extension when specifying aResourceName. If the file is in the application, specify null for aFrameworkName.
     * This method returns a URL like file:/Local/Library/WebObjects/Applications/MyApp.woa/Contents/Resources/MyResource. It does not return the path relative to the HTTP server's document root unless the entire application is located in the document root.
     * Access to the WOResourceManager object is locked at the beginning of this method and unlocked at the end. Although WebObjects makes heavy use of this method internally, it is deprecated and inputStreamForResourceNamed or bytesForResourceNamed should be prefered when possible.
     * Be aware that this method is called very often internally by WebObjects. If you reimplement it, make sure it stays very fast!
     * Note that if you use Project Builder (rather than ProjectBuilderWO) and you add a folder of resources, they must be added as Folder References. This allows WOResourceManager to find them in rapid turnaround mode.
     * WOComponents (directories with a .wo extension) and EOModels (directories with a .eomodeld extension) are treated differently - they can be located directly (resourceManager().pathURLForResourceNamed("MyModel.eomodeld",null,null)) in additional to being able to locate individual files within them (resourceManager().pathURLForResourceNamed("Main.wo/Main.wod",null,null)).
     */
    public java.net.URL pathURLForResourceNamed(java.lang.String aResourceName, java.lang.String aFrameworkName, com.webobjects.foundation.NSArray aLanguagesList){
        return null; //TODO codavaj!!
    }

    /**
     * Removes the data stored in the dynamic data cache under the key aKey. The session argument is currently ignored; in later implementations, specify null to have WOResourceManager use the application-wide cache.
     * WebObjects uses this method when a dynamic element requests an image or embedded object from a database and the key attribute is not set for that dynamic element. If the key attribute isn't set, the data retrieved from the database is stored in the cache using setData, sent to the dynamic element, and then removed from the cache using removeDataForKey. If the key attribute is set, removeDataForKey is not invoked.
     * You rarely needed to invoke this method. Use it only if you need to limit the amount of memory your application uses, if your application has data stored in the cache, and you know exactly which data is no longer needed.
     * Access to the WOResourceManager object is locked at the beginning of this method and unlocked at the end.
     */
    public void removeDataForKey(java.lang.String aKey, com.webobjects.appserver.WOSession aSession){
        return; //TODO codavaj!!
    }

    /**
     * Assigns someData to a key and caches it for later url retrieval. It adds the image or embedded object someData of MIME type type to the dynamic data cache for the session specified by aSession. The data is stored under the key key. The session argument is currently ignored; in later implementations, specify null to have WOResourceManager use the application-wide cache.
     * This method is invoked anytime a dynamic element requests an image or embedded object from a database. You rarely need to invoke it.
     * By default when a dynamic element requests an image from the database, or builds a graph on the fly, it tells the resource manager to store its data in a cache, using either a developer-specified key, or a random key. In return the dynamic element inserts a special url in the HTML so that the browser, on callback, can retrieve the data out of the resource manager cache and display it. If the key was specified by the component, the data stays in the cache as long as the cache is not flushed. If the key was randomly generated by the resource manager, the data is removed from the cache (using removeDataForKey), as soon as the browser retrieves it.
     * Access to the WOResourceManager object is locked at the beginning of this method and unlocked at the end.
     */
    public void setData(com.webobjects.foundation.NSData someData, java.lang.String key, java.lang.String type, com.webobjects.appserver.WOSession aSession){
        return; //TODO codavaj!!
    }

    /**
     * Searches aTableName using aKey to find a localized string. If no string value for the key is found in the table, aDefaultValue (optional) is returned. The method first searches the aTableName file, if it exists, in each of the localized (.lproj) subdirectories of the application wrapper; searching proceeds in the order specified by the array aLanguagesList. If no string value matching the key is found, the search then continues to the aTableName file (if it exists) directly under the Resources directory (inside the directory with the .woa extension).
     */
    public java.lang.String stringForKey(java.lang.String aKey, java.lang.String aTableName, java.lang.String aDefaultValue, java.lang.String aFrameworkName, com.webobjects.foundation.NSArray aLanguagesList){
        return null; //TODO codavaj!!
    }

    public java.lang.String toString(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the public url for the specified resource. The URL returned is of the following form: /WebObjects/MyApp.woa/Contents/WebServerResources/English.lproj/aResourceName.
     * Include the file's extension when specifying aResourceName. If the file is in the application, specify null for the framework argument.
     * This method locates webserver resources under the application or framework. The URL returned is computed by concatenating the application's base URL (returned by WOApplication's baseURL method and settable using the WOApplicationBaseURL property) and the relative path of the resource. This method does not check to see if the file is actually under the document root. For example, if the application is installed in /Local/Library/WebObjects/Applications, and the method finds aResourceName in the /Local/Library/WebObjects/Applications/MyApp.woa/Contents/WebServerResources directory, it returns /WebObjects/MyApp.woa/Contents/WebServerResources/aResourceName even though the WebServerResources directory may not yet be under the document root.
     * Access to the WOResourceManager object is locked at the beginning of this method and unlocked at the end.
     * Be aware that this method is called very often internally by WebObjects. If you reimplement it, make sure it stays very fast!
     */
    public java.lang.String urlForResourceNamed(java.lang.String aResourceName, java.lang.String aFrameworkName, com.webobjects.foundation.NSArray aLanguagesList, com.webobjects.appserver.WORequest aRequest){
        return null; //TODO codavaj!!
    }

}
