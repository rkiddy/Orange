
package com.webobjects.eodistribution.common;

import com.webobjects.eocontrol.EOKeyGlobalID;
import com.webobjects.foundation.*;

public interface _EOReferenceRecordingCoding {
    public static class _EOKeyGlobalIDSupport extends Support {

        public _EOKeyGlobalIDSupport() { return null; }

        public boolean shouldRecordCodingReferences(Object receiver) { return true; }
    }

    public static class Support {


        public Support() { return null; }

        public static Support supportForClass(Class aClass) { return null; }

        public static void setSupportForClass(Support support, Class aClass) { return null; }

        public boolean shouldRecordCodingReferences(Object receiver) { return true; }

        public String _distributedClassName(Object receiver) { return null; }

        static  {}

        private static NSMutableDictionary _supportByClass;

    }



    public abstract boolean shouldRecordCodingReferences();



    public static final Class _CLASS = null;

}
