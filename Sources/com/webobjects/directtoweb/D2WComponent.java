
package com.webobjects.directtoweb;

import com.apple.client.directtoweb.common.*;
import com.webobjects.appserver.*;
import com.webobjects.directtoweb.generation.DTWGeneration;
import com.webobjects.directtoweb.generation.DTWTemplate;
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSArray;
import java.util.Enumeration;
import java.util.Vector;


public class D2WComponent extends WOComponent
    implements DTWGeneration {


    public D2WComponent(WOContext aContext) { return null; }

    /**
     * @deprecated Method localContext is deprecated
     */

    public D2WContext localContext() { return null; }

    public D2WContext d2wContext() { return null; }

    public void setLocalContext(D2WContext newValue) {}

    public static String keyForGenerationReplacementForVariableNamed(String variableName) { return null; }

    protected String generationReplacementFor(String variableName) { return null; }

    public String generationReplacementForCurrentObject() { return null; }

    public String propertyKey() { return null; }

    public void setPropertyKey(String newValue) {}

    public EOEnterpriseObject object() { return null; }

    public void setObject(EOEnterpriseObject eo) {}

    public boolean isEntityReadOnly() { return true; }

    public boolean isEntityReadOnly(EOEntity e) { return true; }

    public EOAttribute attribute() { return null; }

    public EORelationship relationship() { return null; }

    public Object property() { return null; }

    public boolean objectPropertyValueIsNonNull() { return true; }

    public Object objectPropertyValue() { return null; }

    public String keyWhenRelationship() { return null; }

    public String target() { return null; }

    public String formatter() { return null; }

    public String length() { return null; }

    public Integer allowCollapsing() { return null; }

    public String pageTitle() { return null; }

    public boolean hasEntity() { return true; }

    public String task() { return null; }

    public void setTask(String newValue) {}

    public EOEntity entity() { return null; }

    public void setEntity(EOEntity newValue) {}

    public String entityName() { return null; }

    public void setEntityName(String newValue) {}

    public String propertyValueClassName() { return null; }

    public String displayNameForProperty() { return null; }

    public boolean isPropertyAnAttribute() { return true; }

    public boolean showBanner() { return true; }

    public boolean isNotBoldAsBoolean() { return true; }

    public boolean isNotItalicAsBoolean() { return true; }

    public String color() { return null; }

    public boolean hasNoColor() { return true; }

    public boolean hasCustomKey(String customKey) { return true; }

    public NSArray displayPropertyKeys() { return null; }

    public String backgroundColorForPage() { return null; }

    public String backgroundColorForHeaderRow() { return null; }

    public String backgroundColorForTable() { return null; }

    public String backgroundColorForTableDark() { return null; }

    public String backgroundColorForTableLight() { return null; }

    public String defaultRowspan() { return null; }

    public String d2wContextVisibleEntityNamesCountPlus1() { return null; }

    public String displayNameForKeyWhenRelationship() { return null; }

    public NSArray visibleEntityNames() { return null; }

    public boolean isEditing() { return true; }

    public String submitActionName() { return null; }

    public WOComponent logout() { return null; }

    public WOComponent homeClicked() { return null; }

    public String homeHref() { return null; }

    public String resourcePathURL() { return null; }

    public void setResourcePathURL(String s) {}

    public String tasks() { return null; }

    public void setTasks(String s) {}

    public String dynamicPages() { return null; }

    public void setDynamicPages(String s) {}

    public String allEntities() { return null; }

    public void setEntities(String s) {}

    public String currentSettings() { return null; }

    public void setCurrentSettings(String s) {}

    public int applicationPort() { return 0; }

    public int assistantPort() { return 0; }

    public String sessionID() { return null; }

    public WOComponent showWebAssistant() { return null; }

    public boolean isWebAssistantConnected() { return true; }

    public boolean isWebAssistantActive() { return true; }

    public boolean isWebAssistantEnabled() { return true; }

    /**
     * @deprecated Method isLiveAssistantEnabled is deprecated
     */

    public boolean isLiveAssistantEnabled() { return true; }

    public String currentUrl() { return null; }

    public String lastUrl() { return null; }

    public WOAssociation replacementAssociationForAssociation(WOAssociation oldAssociation, String oldBinding, DTWTemplate aTemplate, WOContext aContext) { return null; }

    private static final long serialVersionUID = 0xeb2f77cbL;
    public static final String currentObjectKey = "currentObject";
    protected D2WContext _localContext;
    protected EOEnterpriseObject _eo;
    private String _entitiesString;
    private Settings _settings;
    private String _settingsString;
    private String _dynamicPagesString;
    private boolean _readOnlyComputed;
    private boolean _entityIsReadOnly;
    private String _tasksString;

}
