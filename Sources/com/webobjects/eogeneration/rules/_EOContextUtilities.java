
package com.webobjects.eogeneration.rules;

import com.webobjects.appserver.WOSession;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.eoaccess.*;
import com.webobjects.eogeneration._EOKeyPathUtility;
import com.webobjects.foundation.*;
import java.util.Enumeration;
import java.util.Vector;


public class _EOContextUtilities {


    public _EOContextUtilities() { return null; }

    private static boolean _booleanForKey(D2WContext context, String key, boolean defaultValue) { return null; }

    private static int _intForKey(D2WContext context, String key, int defaultValue) { return null; }

    public static NSArray allPossibleValuesForKey(D2WContext context, String key) { return null; }

    public static NSArray allPossibleValuesForKeyInSession(WOSession session, String key) { return null; }

    public static Object defaultValueForKey(String key, NSDictionary specification, WOSession session) { return null; }

    public static boolean generateSubcontrollers(D2WContext context) { return null; }

    public static boolean displayStatistics(D2WContext context) { return null; }

    private static D2WContext _evaluationContextForLayoutKey(D2WContext context, EOEntity entity, String propertyKey) { return null; }

    public static String layoutHint(D2WContext context, EOEntity entity, String propertyKey, int numberOfPropertyKeysInLayout) { return null; }

    public static Integer layoutLevel(D2WContext context, EOEntity entity, String propertyKey) { return null; }

    public static int maximumNumberOfWidgetsPerColumn(D2WContext context) { return null; }

    public static boolean _entityExists(D2WContext context) { return null; }

    public static NSArray entityHierarchy(D2WContext context) { return null; }

    private static NSArray _entitiesWithEntityNames(NSArray entityNames) { return null; }

    public static NSArray mainEntitiesInContext(D2WContext context) { return null; }

    public static NSArray enumerationEntitiesInContext(D2WContext context) { return null; }

    public static NSArray mainEntityNamesInContext(D2WContext context) { return null; }

    public static NSArray enumerationEntityNamesInContext(D2WContext context) { return null; }

    public static boolean isMainEntityInContext(D2WContext context, EOEntity entity) { return null; }

    public static boolean isEnumerationEntityInContext(D2WContext context, EOEntity entity) { return null; }

    public static int numberOfMainEntitiesInContext(D2WContext context) { return null; }

    public static int numberOfEnumerationEntitiesInContext(D2WContext context) { return null; }

    public static boolean hasMainEntitiesInContext(D2WContext context) { return null; }

    public static boolean hasEnumerationEntitiesInContext(D2WContext context) { return null; }

    public static int typeOfPropertyKey(D2WContext context, EOEntity entity, String key) { return null; }

    public static NSArray propertyKeysForEntity(D2WContext context, EOEntity entity, String taskName) { return null; }

    public static NSArray identifyPropertyKeysForEntity(D2WContext context, EOEntity entity) { return null; }

    private static boolean _propertyCannotBeDisplayedAsText(String entityName, String keyPath) { return null; }

    public static void _addExpandedKeysToArray(D2WContext context, EOEntity entity, String key, boolean onlyTextBasedPropertyKeys, boolean allowUnexpandedToOneRelationshipsToEnumerationEntities, NSMutableArray entityHierarchy, NSMutableArray array) { return null; }

    public static NSArray expandedPropertyKey(D2WContext context, EOEntity entity, String key, boolean onlyTextBasedPropertyKeys, boolean allowUnexpandedToOneRelationshipsToEnumerationEntities) { return null; }

    public static NSArray expandedPropertyKeys(D2WContext context, EOEntity entity, NSArray keys, boolean onlyTextBasedPropertyKeys, boolean allowUnexpandedToOneRelationshipsToEnumerationEntities) { return null; }

    private static boolean _shouldPropertyKeyBeUsedInEntityHierarchy(String entityName, String key, NSArray entityNameHierarchy) { return null; }

    public static NSArray entityHierarchyFilteredPropertyKeys(D2WContext context, EOEntity entity, NSArray keys, NSArray entityHierarchy) { return null; }

    public static NSArray expandedIdentifyKeysForEntity(D2WContext context, EOEntity entity, boolean onlyTextBasedPropertyKeys) { return null; }

    public static NSArray expandedIdentifyKeysForDestinationEntityOfPropertyKey(D2WContext context, EOEntity entity, String propertyKey, boolean onlyTextBasedPropertyKeys) { return null; }

    private static boolean _isMandatoryRelationshipPath(D2WContext context, String entityName, String key) { return null; }

    public static NSArray mandatoryRelationshipPathsFilteredPropertyKeys(D2WContext context, EOEntity entity, NSArray keys) { return null; }

    public static NSArray mandatoryRelationshipPathsInPropertyKeys(D2WContext context, EOEntity entity, NSArray keys) { return null; }

    public static final int UnknownType = -1;
    public static final int Attribute = 0;
    public static final int ToOneRelationshipToMainEntity = 1;
    public static final int ToOneRelationshipToEnumerationEntity = 2;
    public static final int ToOneRelationshipToOtherEntity = 3;
    public static final int ToManyRelationshipToMainEntity = 4;
    public static final int ToManyRelationshipToEnumerationEntity = 5;
    public static final int ToManyRelationshipToOtherEntity = 6;
    public static final String RootSpecificationPostfix = "root";
    public static final String EntityNameKeyPath = "entity.name";
    public static final String QuestionKey = "question";
    public static final String KeysKey = "keys";
    public static final String TaskKey = "task";
    public static final String EntityKey = "entity";
    public static final String LocalesKey = "locales";
    public static final String PlatformsKey = "platforms";
    public static final String MainEntityNamesKey = "mainEntityNames";
    public static final String EnumerationEntityNamesKey = "enumerationEntityNames";
    public static final String PropertyKeyKey = "propertyKey";
    public static final String EntityHierarchyKey = "entityHierarchy";
    public static final String ArrayKey = "array";
    public static final String DictionaryKey = "dictionary";
    public static final String IsRootControllerKey = "isRootController";
    public static final String ControllerTypeKey = "controllerType";
    public static final String NumberOfDividedControllersKey = "numberOfDividedControllers";
    public static final String IsLargeWidgetKey = "isLargeWidget";
    public static final String ForceHorizontallyNotResizableKey = "forceHorizontallyNotResizable";
    public static final String ForceVerticallyNotResizableKey = "forceVerticallyNotResizable";
    public static final String ForceHorizontalLayoutKey = "forceHorizontalLayout";
    public static final String ForceWidgetReadOnlyKey = "forceWidgetReadOnly";
    public static final String ForceNoHighlightKey = "forceNoHighlight";
    public static final String ForceEntityReadOnlyKey = "forceEntityReadOnly";
    public static final String LayoutHintKey = "layoutHint";
    public static final String LayoutLevelKey = "layoutLevel";
    public static final String MaximumNumberOfWidgetsPerColumnKey = "maximumNumberOfWidgetsPerColumn";
    public static final String AdditionalActionsKey = "additionalActions";
    public static final String AdditionalAvailableSpecificationsKey = "additionalAvailableSpecifications";
    public static final String AdditionalDefaultSpecificationsKey = "additionalDefaultSpecifications";
    public static final String ReuseModeKey = "reuseMode";
    public static final String GenerateSubcontrollersKey = "generateSubcontrollers";
    public static final String DisplayStatisticsKey = "displayStatistics";
    public static final String _AssistantEnabledKey = "assistantEnabled";
    public static final String _AssistantEditorClassNameKey = "assistantEditorClassName";
    public static final String _ErrorKey = "_error";
    public static final String _ErrorMessageKey = "_errorMessage";
    public static final String TrueValue = "true";
    public static final String FalseValue = "false";
    public static final String IdentifyTaskValue = "identify";
    public static final String QueryTaskValue = "query";
    public static final String ListTaskValue = "list";
    public static final String FormTaskValue = "form";
    public static final String WindowQuestionValue = "window";
    public static final String NeverEditabilityValue = "Never";
    public static final String ReuseControllerAfterSaveValue = "ReuseAfterSave";
    public static final String AlwaysReuseControllerValue = "AlwaysReuse";
    public static final String ColumnsLayoutHintValue = "Columns";
    public static final String RowLayoutHintValue = "Row";
    public static final String FullWidthLayoutHintValue = "FullWidth";
    public static final String BoxLayoutHintValue = "Box";
    public static final String SwitchLayoutHintValue = "Switch";
    public static final String SubwindowLayoutHintValue = "Subwindow";
    public static final String InspectorLayoutHintValue = "Inspector";
    public static final String VerticalSplitLayoutHintValue = "VerticalSplit";
    public static final String HorizontalSplitLayoutHintValue = "HorizontalSplit";
    public static final String ActionWidgetControllerTypeValue = "actionWidgetController";
    public static final String DividingControllerTypeValue = "dividingController";
    public static final String GroupingControllerTypeValue = "groupingController";
    public static final String EntityControllerTypeValue = "entityController";
    public static final String ModalDialogControllerTypeValue = "modalDialogController";
    public static final String TableControllerTypeValue = "tableController";
    public static final String SplitControllerTypeValue = "splitController";
    public static final String WidgetControllerTypeValue = "widgetController";
    public static final String WindowControllerTypeValue = "windowController";
    public static final String InspectorControllerTypeValue = "inspectorController";
    public static final String StatisticsControllerTypeValue = "statisticsController";

}
