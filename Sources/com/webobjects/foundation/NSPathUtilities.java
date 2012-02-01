package com.webobjects.foundation;
/**
 * This class provides static methods that are useful when working with paths. Specifically, it includes methods that extract particular path components, modify paths, and return special paths.
 * This class cannot be instantiated.
 * See Also:NSPathUtilities.lastPathComponent(String path), NSPathUtilities.pathExtension(String path), NSPathUtilities.stringByAppendingPathComponent(String path, String component), NSPathUtilities.stringByAppendingPathExtension(String path, String extension), NSPathUtilities.stringByDeletingLastPathComponent(String path), NSPathUtilities.stringByDeletingPathExtension(String path), NSPathUtilities.stringByStandardizingPath(String path), NSPathUtilities.homeDirectory()
 */
public class NSPathUtilities{
    /**
     * Deprecated.
     */
    public static boolean fileExistsAtPath(java.lang.String path){
        return false; //TODO codavaj!!
    }

    public static boolean fileExistsAtPathURL(java.net.URL pathURL){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a String representing the home directory path of the user who executes the application.
     */
    public static java.lang.String homeDirectory(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the last path component of path.
     * The following table illustrates the effect of this method on a variety of paths:
     * path Result /tmp/scratch.tiff scratch.tiff /tmp/scratch scratch /tmp/ tmp scratch scratch / (an empty string)
     */
    public static java.lang.String lastPathComponent(java.lang.String path){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a path's extension, if any (not including the extension divider).
     * The following table illustrates the effect of this method on a variety of paths:
     * path's Result /tmp/scratch.tiff tiff /tmp/scratch (an empty string) /tmp/ (an empty string) /tmp/scratch..tiff tiff /tmp/test.eomodeld/ eomodeld
     */
    public static java.lang.String pathExtension(java.lang.String path){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static boolean pathIsAbsolute(java.lang.String path){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static boolean pathIsEqualToString(java.lang.String path1, java.lang.String path2){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a String made by appending path with component, preceded, if necessary, by a path separator. The following table illustrates the effect of this method on a variety of paths, assuming that component is supplied as
     * scratch.tiff
     * :
     * path Result /tmp /tmp/scratch.tiff /tmp/ /tmp/scratch.tiff / /scratch.tiff (an empty string) scratch.tiff
     */
    public static java.lang.String stringByAppendingPathComponent(java.lang.String path, java.lang.String component){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string made by appending to path an extension separator, followed by extension. Note that if path ends with one or more slashes (
     * /
     * ), these slashes are deleted. The following table illustrates the effect of this method on a variety of different paths, assuming that extension is supplied as
     * tiff
     * :
     */
    public static java.lang.String stringByAppendingPathExtension(java.lang.String path, java.lang.String extension){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string made by deleting the last path component from path, along with any final path separator. If path represents the root path, however, it's returned unaltered. The following table illustrates the effect of this method on a variety of paths:
     */
    public static java.lang.String stringByDeletingLastPathComponent(java.lang.String path){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String made by deleting the extension (if any, and only the last) from path. Strips any trailing path separator before checking for an extension. If path represents the root path, however, it's returned unaltered. The following table illustrates the effect of this method on a variety of paths:
     */
    public static java.lang.String stringByDeletingPathExtension(java.lang.String path){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the normalized path for an existing file.
     * If the file does not exist, this method returns an empty string. The normalized path is always absolute and corresponds to the canonical path returned by the java.io.File.getCanonicalPath method.
     */
    public static java.lang.String stringByNormalizingExistingPath(java.lang.String path){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String containing the normalized path for a path string.
     * This is exactly like stringByNormalizingExistingPath, except that the path does not have to reference an existing file.The normalized path is always absolute and corresponds to the canonical path returned by the java.io.File.getCanonicalPath method.
     */
    public static java.lang.String stringByNormalizingPath(java.lang.String path){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static java.lang.String stringByStandardizingPath(java.lang.String path){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public static java.net.URL URLWithPath(java.lang.String path){
        return null; //TODO codavaj!!
    }

}
