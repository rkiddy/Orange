
package com.webobjects.appserver.parser.woml;

import java.util.*;

public class WOMLTemplateExtensions {


    private WOMLTemplateExtensions() { return null; }

    public static WOMLTemplateExtensions instance() { return null; }

    public List combinedTemplateFileExtensions() { return null; }

    public void setCombinedTemplateFileExtensions(List extensions) {}

    public String dynamicAttributePrefix() { return null; }

    public void setDynamicAttributePrefix(String dynamicAttributePrefix) {}

    public String dynamicAttributeSuffix() { return null; }

    public void setDynamicAttributeSuffix(String dynamicAttributeSuffix) {}

    static  {}

    private static WOMLTemplateExtensions _instance;
    private static String _defaultExtensions[];
    private List _fileExtensions;
    private String _DynamicAttributePrefix;
    private String _DynamicAttributeSuffix;
    public static final String DYNAMIC_ATTRIBUTE_PREFIX = "[";
    public static final String DYNAMIC_ATTRIBUTE_SUFFIX = "]";

}
