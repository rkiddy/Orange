package com.webobjects.foundation.xml;
/**
 * This simple class specifies an output format to control the XML output and is based on the XSLT specification for output format.
 */
public final class NSXMLOutputFormat{
    /**
     * Creates an output format that has the following properties: indentation is on UTF-8 encoding XML 1.0 version not a standalone document XML declaration is written out
     */
    public NSXMLOutputFormat(){
         //TODO codavaj!!
    }

    /**
     * Creates an output format that has the same properties as an default NSXMLOutputFormat except that for the identation property.
     * Parameters:on - true if indentation should be on
     */
    public NSXMLOutputFormat(boolean on){
         //TODO codavaj!!
    }

    /**
     * Returns the specified encoding. If no encoding was specified, the default is always "UTF-8".
     */
    public java.lang.String encoding(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true if indentation was specified.
     */
    public boolean indenting(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns true if the XML document declaration should be ommited. The default is false.
     */
    public boolean omitXMLDeclaration(){
        return false; //TODO codavaj!!
    }

    /**
     * Sets the encoding for this output method. If no encoding was specified, the default is always "UTF-8".
     */
    public void setEncoding(java.lang.String encoding){
        return; //TODO codavaj!!
    }

    /**
     * Sets the indentation on and off.
     */
    public void setIndenting(boolean on){
        return; //TODO codavaj!!
    }

    /**
     * Sets XML declaration omitting on and off.
     */
    public void setOmitXMLDeclaration(boolean omit){
        return; //TODO codavaj!!
    }

    /**
     * Sets the version for this XML output. Currently, the value would be "1.0".
     */
    public void setVersion(java.lang.String version){
        return; //TODO codavaj!!
    }

    /**
     * Returns the version for this output method. If no version was specified, will return null and the default version number will be used.
     */
    public java.lang.String version(){
        return null; //TODO codavaj!!
    }

}
