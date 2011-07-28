
package com.webobjects.directtoweb.generation;

import com.webobjects.appserver.*;
import com.webobjects.appserver._private.*;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOKeyValueArchiver;
import com.webobjects.foundation.*;
import java.io.File;
import java.net.URL;
import java.util.Enumeration;


public class DTWTemplate {


    public DTWTemplate() { return null; }

    public static DTWTemplate templateWithName(String aName) { return null; }

    public static DTWTemplate templateForComponent(WOComponent component, WOContext oldContext, String componentName) { return null; }

    private Class generationClass(WOElement anElement) { return null; }

    public void appendElement(WOElement anElement, WOContext aContext) {}

    public void writeComponentToPath(String s, String s1) {}

    public EOKeyValueArchiver wooArchiver() { return null; }

    public WOResponse responseForHTML() { return null; }

    public String newNameWithBaseName(String rootName) { return null; }

    public String componentName() { return null; }

    public void setComponentName(String aName) {}

    public void appendOpeningWebObjectTagWithName(String aName) {}

    public void appendClosingWebObjectTag() {}

    public NSDictionary _replaceAssociations(NSDictionary associations, WOElement anElement, WOContext aContext) { return null; }

    private String elementClassName(WOElement element) { return null; }

    public void addDeclarationForElement(WOElement anElement, String name, WOContext aContext) {}

    public Object referenceToEncodeForObject(EOKeyValueArchiver archiver, Object object) { return null; }

    public void archiveObject(Object object, String aName) {}

    private static NSDictionary _parseString(String code, Object someStringOrArray) { return null; }

    private NSDictionary _loadTemplateJavaForClass(Class aClass, String frameworkName) { return null; }

    private NSDictionary _loadTemplateJavaForComponent(WOComponent component) { return null; }

    private void _addJavaCode(NSArray code, String aName, NSMutableDictionary aDictionary) {}

    public void addImports(NSArray imports) {}

    public void addInterfaceName(String oldName, WOComponent component) {}

    public void addInterfaces(NSArray interfaces) {}

    public void generateJavaForComponent(WOComponent component) {}

    public void addImportsForComponent(WOComponent component) {}

    public void addInterfacesForComponent(WOComponent component) {}

    public String addVariableNamed(String oldName, WOComponent component, boolean rename) { return null; }

    public String addMethodNamed(String oldName, WOComponent component, boolean rename) { return null; }

    public String addMethod(String code) { return null; }

    public String addVariable(String code) { return null; }

    public String _stringRepresentationWithDeclaration(NSDictionary aDeclaration) { return null; }

    public String woo() { return null; }

    String _postProcessFor45WOB(String aSrc) { return null; }

    public String wod() { return null; }

    public String html() { return null; }

    public String javaForClassNamed(String className) { return null; }

    public String toString() { return null; }

    public boolean writeGeneratedComponentToPath(String aPath, String aName) { return true; }

    public void writeAndAddToProjectComponentNamed(String aName) {}

    public void generateUserModelFile() {}

    public void generateDynamicTemplate(String templateName, String dtwComponentName, String parentClass) {}

    String _replaceSubstr(String sourceString, String originalPattern, String replacementPatter) { return null; }

    static  {}

    private static String D2WNULLCONSTANTREPLACEMENT;
    private static NSMutableDictionary _generatedJavaCache;
    private NSMutableDictionary _namesDictionary;
    private WOResponse response;
    private NSMutableSet _imports;
    private NSMutableDictionary _variablesSection;
    private NSMutableDictionary _methodsSection;
    private NSMutableSet _interfaces;
    private NSMutableArray _wodBindings;
    private EOKeyValueArchiver _wooArchiver;
    private String _componentName;
    private NSSelector _generationSel;
    static final String TemplateNameKey = "TEMPLATE_CLASS_NAME";
    static final String TemplateParentKey = "TEMPLATE_PARENT_CLASS_NAME";
    private static final String TemplateFileSuffix = ".gava";

}
