package com.webobjects.eogeneration;
public interface EOQueryObjectDisplay extends com.webobjects.eoapplication.EOObjectDisplay{
    abstract com.webobjects.eointerface.EODisplayGroup queryDisplayGroup();

    abstract com.webobjects.eocontrol.EOEditingContext queryEditingContext();

}
