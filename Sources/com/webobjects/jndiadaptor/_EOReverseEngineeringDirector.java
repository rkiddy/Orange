
package com.webobjects.jndiadaptor;

import com.webobjects.eoaccess.*;
import com.webobjects.foundation.NSArray;

class _EOReverseEngineeringDirector {
    public static interface _ModelBuilder {

        public abstract EOModel model();

        public abstract EOEntity entity();

        public abstract EOAttribute attribute();

        public abstract void buildModel(EOAdaptor eoadaptor);

        public abstract void buildEntity(String s);

        public abstract void buildPrimaryKeyAttributes(boolean flag);

        public abstract void buildAttributes();

        public abstract void buildAttribute(String s, boolean flag);
    }

    public static interface _EntityExternalNamesBuilder {

        public abstract NSArray entityExternalNames();

        public abstract void buildEntityExternalNames();
    }


    public _EOReverseEngineeringDirector() { return null; }

    public NSArray createEntityExternalNames(_EntityExternalNamesBuilder builder) { return null; }

    public EOModel createModel(_ModelBuilder builder, EOAdaptor adaptor, NSArray entityExternalNames) { return null; }
}
