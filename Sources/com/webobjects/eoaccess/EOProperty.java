
package com.webobjects.eoaccess;



public abstract class EOProperty {

    public EOProperty() { return null; }

    public abstract EOEntity entity();

    public abstract String name();

    public String initialCapitalName() { return null; }

    public abstract String relationshipPath();

    public boolean equals(Object value) { return true; }
}
