
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.eoaccess.EOEntity;
import com.webobjects.eoaccess.EOModelGroup;
import com.webobjects.eogeneration._EOKeyPathUtility;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;


public class EOEntityController extends EOController {

    public EOEntityController(WOContext context) { return null; }

    public NSArray propertyKeys() { return null; }

    public NSArray entityHierarchy() { return null; }

    private NSArray _entityHierarchyByAddingEntity(EOEntity entity) { return null; }

    public NSArray entityHierarchyForSubcontrollers() { return null; }

    public boolean isEntityInEntityHierarchy(String entityName) { return true; }

    public EOEntity entityForSubcontrollers() { return null; }

    public boolean generateSubcontrollers() { return true; }
}
