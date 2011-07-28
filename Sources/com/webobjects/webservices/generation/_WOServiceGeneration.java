
package com.webobjects.webservices.generation;

import com.webobjects._ideservices._WOProject;
import com.webobjects.appserver.*;
import com.webobjects.appserver._private.WODeployedBundle;
import com.webobjects.appserver._private.WOProjectBundle;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.directtoweb.generation.DTWAddToPbUtils;
import com.webobjects.foundation.*;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Hashtable;


public class _WOServiceGeneration
    implements WOServiceUtilities.RuleSystemConstants {

    public _WOServiceGeneration() { return null; }

    public static boolean freezeOperation(String operationName, String className) { return null; }

    private static String codeForOperation(String operationName, String operationComponent, String className, D2WContext context) { return null; }

    private static String xmlForOperationNamed(String operationName, D2WContext context) { return null; }

    public static void writeAndAddToProjectOperationNamed(String operationName, String operationClass, String operationJavaCode, String operationWSDLXML) { return null; }

    public static String wooFileContentString() { return null; }

    public static boolean writeGeneratedFileToPath(String dir, String aFile, Object content) { return null; }
}
