
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.text.ParseException;


public interface EOKeyValueArchiving {
    public static class _NullValueSupport extends Support {

        public _NullValueSupport() { return null; }

        public void encodeWithKeyValueArchiver(Object obj, EOKeyValueArchiver eokeyvaluearchiver) {}

        public Object decodeObjectWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }
    }

    public static class _TimestampSupport extends Support {


        public _TimestampSupport() { return null; }

        public void encodeWithKeyValueArchiver(Object receiver, EOKeyValueArchiver archiver) {}

        public Object decodeObjectWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

        static  {}

        private static NSTimestampFormatter _formatter;

    }

    public static class _NumberSupport extends Support {


        public _NumberSupport() { return null; }

        public void encodeWithKeyValueArchiver(Object receiver, EOKeyValueArchiver archiver) {}

        public Object decodeObjectWithKeyValueUnarchiver(EOKeyValueUnarchiver unarchiver) { return null; }

        static  {}

        private static NSNumberFormatter _formatter;

    }

    public static abstract class Support {


        public Support() { return null; }

        public static Support supportForClass(Class aClass) { return null; }

        public static void setSupportForClass(Support support, Class aClass) { return null; }

        public abstract void encodeWithKeyValueArchiver(Object obj, EOKeyValueArchiver eokeyvaluearchiver);

        public abstract Object decodeObjectWithKeyValueUnarchiver(EOKeyValueUnarchiver eokeyvalueunarchiver);

        public void awakeFromKeyValueUnarchiver(Object obj, EOKeyValueUnarchiver eokeyvalueunarchiver) {}

        public void finishInitializationWithKeyValueUnarchiver(Object obj, EOKeyValueUnarchiver eokeyvalueunarchiver) {}

        static  {}

        private static _NSThreadsafeMutableDictionary _supportByClass;

    }

    public static interface FinishInitialization {


        public abstract void finishInitializationWithKeyValueUnarchiver(EOKeyValueUnarchiver eokeyvalueunarchiver);



        public static final Class _CLASS = null;

    }

    public static interface Awaking {


        public abstract void awakeFromKeyValueUnarchiver(EOKeyValueUnarchiver eokeyvalueunarchiver);



        public static final Class _CLASS = null;

    }



    public abstract void encodeWithKeyValueArchiver(EOKeyValueArchiver eokeyvaluearchiver);



    public static final Class _CLASS = null;

}
