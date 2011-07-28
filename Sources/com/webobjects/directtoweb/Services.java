
package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.PropertyListParser;
import com.webobjects.foundation.*;
import java.io.*;
import java.net.URL;
import java.util.*;

public class Services {

    public Services() { return null; }

    public static Object objectFromPListFile(File f) throws IOException { return null; }

    public static Object objectFromPListPathURL(URL url) throws IOException { return null; }

    public static NSDictionary dictionaryFromFile(File f) throws IOException { return null; }

    public static NSDictionary dictionaryFromPathURL(URL url) throws IOException { return null; }

    public static void writeDictionaryToFile(NSDictionary d, File f) throws IOException { return null; }

    public static void replaceFileContents(File f, String s) throws IOException { return null; }

    public static String replace(String contentsString, String searchString, String replaceString, int startPosition, int endPosition) { return null; }

    public static String replace(String contentsString, String searchString, String replaceString) { return null; }

    public static String htmlify(String s) { return null; }

    public static String htmlQuotify(String s) { return null; }

    public static String formKeyForKey(String key) { return null; }

    public static Vector vectorFromImmutableVector(NSArray iv) { return null; }

    public static void mergeHashtableIntoHashtable(Hashtable from, Hashtable to) { return null; }

    public static void mergeVectorIntoVector(Vector list, Vector target) { return null; }

    public static void mergeVectorIntoVectorWithoutDuplicates(Vector list, Vector target) { return null; }

    public static String capitalize(String s) { return null; }

    public static String breakDown(String inputString, int cols) { return null; }

    public static String plurify(String s, int howMany) { return null; }

    public static NSArray flatten(NSArray array) { return null; }
}
