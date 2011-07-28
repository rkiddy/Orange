
package com.webobjects.appserver.xml._private;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

public class _DecodingNode {


    public _DecodingNode(String tagName) { return null; }

    public String getTagName() { return null; }

    public void addChild(_DecodingNode aNode) {}

    public NSArray getChildren() { return null; }

    public String getContent() { return null; }

    public void setContent(String content) {}

    public void appendContent(char ch[], int start, int length) {}

    public void setType(String aType) {}

    public String getType() { return null; }

    public void setRelationshipType(String aType) {}

    public String getRelationshipType() { return null; }

    public void setObjectID(String anID) {}

    public String getObjectID() { return null; }

    public void setObjectIDRef(String anIDRef) {}

    public String getObjectIDRef() { return null; }

    public String toString() { return null; }

    String _tagName;
    String _type;
    String _relationshipType;
    String _objectID;
    String _objectIDRef;
    NSMutableArray _children;
    String _content;
    StringBuffer _contentStringBuffer;

}
