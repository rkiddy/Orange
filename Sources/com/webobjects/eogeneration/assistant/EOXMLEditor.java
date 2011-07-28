
package com.webobjects.eogeneration.assistant;

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.EOCustomObject;
import com.webobjects.eogeneration.*;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.foundation.*;
import java.io.*;
import javax.swing.JFileChooser;


public class EOXMLEditor extends EODocumentController
    implements EOAssistant.Editor {
    public class _DisplayObject extends EOCustomObject {


        public _DisplayObject(NSDictionary specification, boolean useXMLFromControllerFactory) { return null; }

        public String description() { return null; }

        public String xml() { return null; }

        public void saveToFile() {}

        private NSDictionary _specification;
        private String _description;
        private String _xml;
        private boolean _useXMLFromControllerFactory;

    }



    public EOXMLEditor() { return null; }

    protected void connectionWasEstablished() {}

    public boolean fetchesOnConnect() { return true; }

    protected EODisplayGroup _defaultDisplayGroup() { return null; }

    public int priority() { return 0; }

    public void refresh() {}

    public void saveXMLToFile(String xml) {}

    static  {}

    public static final Class _CLASS;
    private String _suggestedFileName;


    // Unreferenced inner class com/webobjects/eogeneration/assistant/EOXMLEditor$1

/* anonymous class */
    class _cls1 extends NSComparator {


        _cls1() { return null; }

        public int compare(Object object1, Object object2) throws com.webobjects.foundation.NSComparator.ComparisonException { return 0; }

    }

}
