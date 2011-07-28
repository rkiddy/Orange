
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.foundation.NSArray;


public class EOAssistantActions extends EORuleComponent {

    public EOAssistantActions(WOContext context) { return null; }

    public boolean provideAssistantAction() { return true; }

    public NSArray assistantEditorClassNames() { return null; }
}
