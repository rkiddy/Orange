
package com.webobjects.eoapplication;

import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.EODisplayGroup;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;


public abstract class EOArchiveController extends EOComponentController
    implements EOObserving, EOComponentController.EndEditing {


    public EOArchiveController() { return null; }

    public EOArchiveController(EOXMLUnarchiver unarchiver) { return null; }

    public NSMutableDictionary _xmlParameters() { return null; }

    protected void controllerWillLoadArchive() {}

    protected void controllerDidLoadArchive(NSDictionary nsdictionary) {}

    protected boolean loadArchive() { return true; }

    protected void prepareComponent() {}

    public void setArchiveName(String string) {}

    public String archiveName() { return null; }

    public boolean endEditing() { return true; }

    protected void _stopListeningToControllerDisplayGroup() {}

    protected void _startListeningToControllerDisplayGroup() {}

    public void setControllerDisplayGroup(EODisplayGroup displayGroup) {}

    public EODisplayGroup controllerDisplayGroup() { return null; }

    public boolean hasControllerDisplayGroup() { return true; }

    public void _redisplayControllerDisplayGroup() {}

    public void objectWillChange(Object object) {}

    protected void _updateUserInterface() {}

    public void willChange() {}

    public String toString() { return null; }

    static  {}

    public static final Class _CLASS;
    private boolean _archiveLoaded;
    private String _archiveName;
    private EODisplayGroup _controllerDisplayGroup;
    private boolean _redisplaysControllerDisplayGroupAtEndOfEvent;

}
