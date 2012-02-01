package com.webobjects.appserver.xml;
/**
 * This interface allows WOXMLCoder, when used without a mapping model, to encode the class that implements this interface as XML data. Except for a small defined set of classes, WOXMLCoder depends on a class to actually implement this interface in order for WOXMLCoder to call the encodeWithWOXMLCoder method.
 * See Also:WOXMLCoder
 */
public interface WOXMLCoding{
    /**
     * Allows the receiver, before being encoded, to substitute a class other than its own in a coder. For example, private subclasses can substitute the name of a public superclass when being encoded. The substituted class is then recorded in the XML data and used during the decoding process to create an object of that class.
     */
    abstract java.lang.Class classForCoder();

    /**
     * Encodes this object as XML data using the coder. Usually, the implementation of this method would then make use of coder's various encode...ForKey methods to carry out the actual task of encoding. Note that encoding an object to XML data is usually part one of the story. Part two would involve decoding the XML data into a meaningful object; the class must have a constructor that takes a WOXMLDecoder object as its sole argument. This constructor should consist of a series of decode...ForKey method invocations that restore each of your object's instance variables and they corresponds to the encode...ForKey method invocations implemented in this method.
     * The following simple Person class implements both the WOXMLCoding interface and the single-argument constructor needed to later decode objects of this class. import com.webobjects.appserver.xml.*; import com.webobjects.foundation.*; import java.lang.*; import java.net.*; import java.math.*; public class Person implements WOXMLCoding { String name; boolean married; int children; public Person() { name = "John Smith"; married = true; children = 2; } public void encodeWithWOXMLCoder(WOXMLCoder coder) { coder.encodeObjectForKey(name, "Name"); coder.encodeBooleanForKey(married, "MaritalStatus"); coder.encodeIntForKey(children, "NumberOfChildren"); } // constructor required for decoding public Person(WOXMLDecoder decoder) { name = (String)decoder.decodeObjectForKey("Name"); married = decoder.decodeBooleanForKey("MaritalStatus"); children = decoder.decodeIntForKey("NumberOfChildren"); } public Class classForCoder() { return this.getClass(); } }
     */
    abstract void encodeWithWOXMLCoder(com.webobjects.appserver.xml.WOXMLCoder coder);

}
