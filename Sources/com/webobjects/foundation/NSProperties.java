package com.webobjects.foundation;
/**
 * This class extends Java's properties mechanism to merge application properties with the standard system properties available using the java.lang.System.getProperties method. The application properties can come from four sources: the command line, the application's Properties file, the Properties files of any frameworks the application includes, and the file WebObjects.properties in the user's home directory.
 * This class has only static methods and cannot be instantiated.
 * To access the application properties you first need to merge the application and command line properties with the system properties. A WebObjects application automatically performs this step for you. You can then access the property as a string, and convert the string to the property's actual data type.
 * To obtain the application properties and merge them with the system properties you have to invoke setPropertiesFromArgv.
 * Every property is a key-value pair. For example, on Unix machines, the property value for the key "file.separator" is "/". To access a property corresponding to a particular key, use the java.lang.System.getProperty method. This method returns the property as a string.
 * If the property string represents a value other than java.lang.String, for example, a boolean value, NSArray, or NSDictionary, you can convert it to the appropriate data type using the NSPropertyListSerialization's booleanForString, arrayForString, or dictionaryForString method, respectively. NSPropertyListSerialization also provides an intForString method to simplify converting a property string to an integer.
 * The Properties file must be in the format specified by java.io.Properties.
 * Boolean values, NSArrays, and NSDictionaries must be specified using the property list representation. See the NSPropertyListSerialization class description for more information on property lists.
 * The setPropertiesFromArgv method parses the command line arguments and recognizes the property formats listed in the table below.
 * Properties specified in these formats will be available as system properties after you invoke setPropertiesFromArgv.
 * See Also:System.getProperty(java.lang.String), NSProperties.setPropertiesFromArgv(java.lang.String[]), NSPropertyListSerialization
 */
public class NSProperties{
    /**
     * Deprecated.
     */
    public static com.webobjects.foundation.NSArray arrayForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static boolean booleanForKey(java.lang.String aKey){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static com.webobjects.foundation.NSData dataForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static com.webobjects.foundation.NSDictionary dictionaryForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static double doubleForKey(java.lang.String aKey){
        return 0.0d; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static float floatForKey(java.lang.String aKey){
        return 0.0f; //TODO codavaj!!
    }

    public static java.lang.String getProperty(java.lang.String name){
        return null; //TODO codavaj!!
    }

    public static java.lang.String getProperty(java.lang.String name, java.lang.String defaultValue){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static int integerForKey(java.lang.String aKey){
        return 0; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static long longForKey(java.lang.String aKey){
        return 0l; //TODO codavaj!!
    }

    /**
     * Loads all of the application's properties from all the three sources described in the class description and merges them with the Java System properties.
     * This method obtains the properties for every bundle in the application including the application and all of the frameworks it includes. It also merges any properties specified by the string array argv into the system properties.
     */
    public static void setPropertiesFromArgv(java.lang.String[] argv){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * This method will be replaced by finding the system property using System.getProperty(key).
     * Equivalent to System.getProperty(key).
     */
    public static java.lang.String stringForKey(java.lang.String aKey){
        return null; //TODO codavaj!!
    }

    /**
     * Parses a String array of properties. Usually, this String array comes from the command line and its format is described in the class description.
     */
    public static com.webobjects.foundation.NSDictionary valuesFromArgv(java.lang.String[] argv){
        return null; //TODO codavaj!!
    }

}
