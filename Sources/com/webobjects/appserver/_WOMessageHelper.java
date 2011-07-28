
package com.webobjects.appserver;

import com.webobjects.foundation.NSForwardException;
import java.io.StringReader;
import javax.xml.parsers.*;
import org.apache.xerces.dom.DocumentImpl;
import org.w3c.dom.*;
import org.xml.sax.InputSource;


public class _WOMessageHelper {


    public _WOMessageHelper(WOMessage aMessage) { return null; }

    protected Document contentAsDOMDocument() throws WODOMParserException { return null; }

    protected void appendContentDOMDocumentFragment(DocumentFragment aDocumentFragment) {}

    protected void setContentDOMDocument(Document aDocument) {}

    private void generateXML(Node aNode) {}

    private void processTextNode(Text aNode) {}

    private void processCDATANode(CDATASection aNode) {}

    private void processDocumentNode(Document aNode) {}

    private void processElementNode(Element aNode) {}

    private void processAttributes(NamedNodeMap aNamedNodeMap) {}

    private void processAttributeNode(Attr attribute) {}

    private void processProcessingInstructionNode(ProcessingInstruction aNode) {}

    private void processCommentNode(Comment aComment) {}

    private void processDocumentTypeNode(DocumentType aNode) {}

    private void processDocumentFragmentNode(DocumentFragment aNode) {}

    private void processNotationNode(Notation aNotation) {}

    private void processProlog(String aString) {}

    private String extractDTD(String aString) { return null; }

    WOMessage woMessage;
    StringBuffer xmlString;

}
