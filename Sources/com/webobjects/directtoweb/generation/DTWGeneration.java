
package com.webobjects.directtoweb.generation;

import com.webobjects.appserver.WOAssociation;
import com.webobjects.appserver.WOContext;


public interface DTWGeneration {

    public abstract WOAssociation replacementAssociationForAssociation(WOAssociation woassociation, String s, DTWTemplate dtwtemplate, WOContext wocontext);
}
