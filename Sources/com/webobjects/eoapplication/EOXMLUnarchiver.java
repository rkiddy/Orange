
package com.webobjects.eoapplication;

import com.webobjects.foundation.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import javax.swing.Icon;


public class EOXMLUnarchiver {
    public static interface _SpecialInstance {




        public static final Class _CLASS = null;

    }



    public static void _useTagToClassNameMapTable(String tagNames[], String classNames[], String classNamePackagePrefix) { return null; }

    public static void _useTagToClassNameMapTable(NSDictionary mapTable) { return null; }

    public static void _useDefaultValue(Class objectClass, Object value, String key) { return null; }

    public static Object decodeRootObject(NSDictionary rootObjectValues) { return null; }

    private static Object _decodeObjectWithKeyValueUnarchiver(EOXMLUnarchiver unarchiver) { return null; }

    public static Icon _decodeIconFromUnarchiver(EOXMLUnarchiver unarchiver, boolean usesLargeRepresentation) { return null; }

    public EOXMLUnarchiver(NSDictionary values) { return null; }

    NSDictionary _values() { return null; }

    public Class decodeClassForKey(String key) { return null; }

    public Class decodeClassForKey(String key, Class defaultValueIfNotAvailable) { return null; }

    private Class _objectClass() { return null; }

    public Object decodeValueForKey(String key) { return null; }

    public NSArray decodeChildren() { return null; }

    public NSArray decodeArrayForKey(String key) { return null; }

    public NSArray decodeArrayForKey(String key, NSArray defaultValueIfNotAvailable) { return null; }

    private NSArray _decodeArrayForKey(String key, NSArray defaultValueIfNotAvailable, boolean forceObjectArchives, boolean testForObjectArchives) { return null; }

    public NSDictionary decodeDictionaryForKey(String key) { return null; }

    public NSDictionary decodeDictionaryForKey(String key, NSDictionary defaultValueIfNotAvailable) { return null; }

    public String decodeStringForKey(String key) { return null; }

    public String decodeStringForKey(String key, String defaultValueIfNotAvailable) { return null; }

    public double decodeDoubleForKey(String key) { return null; }

    public double decodeDoubleForKey(String key, double defaultValueIfNotAvailable) { return null; }

    public int decodeIntForKey(String key) { return 0; }

    public int decodeIntForKey(String key, int defaultValueIfNotAvailable) { return 0; }

    public int _decodeIntForKey(String key, int defaultValueIfNotAvailable, int minimumValue) { return 0; }

    public boolean decodeBooleanForKey(String key) { return true; }

    public boolean decodeBooleanForKey(String key, boolean defaultValueIfNotAvailable) { return true; }

    public Color decodeColorForKey(String key) { return null; }

    public Color decodeColorForKey(String key, Color defaultValueIfNotAvailable) { return null; }

    public Font decodeFontForKey(String key) { return null; }

    public Font decodeFontForKey(String key, Font defaultValueIfNotAvailable) { return null; }

    public Font _decodeFontForKey(String key, Font defaultValueIfNotAvailable, Font baseFont) { return null; }

    public Insets decodeInsetsForKey(String key) { return null; }

    public Insets decodeInsetsForKey(String key, Insets defaultValueIfNotAvailable) { return null; }

    public int decodeAlignmentForKey(String key) { return 0; }

    public int decodeAlignmentForKey(String key, int defaultValueIfNotAvailable) { return 0; }

    public int decodePositionForKey(String key) { return 0; }

    public int decodePositionForKey(String key, int defaultValueIfNotAvailable) { return 0; }

    public int _decodeBorderTypeForKey(String key) { return 0; }

    public int _decodeBorderTypeForKey(String key, int defaultValueIfNotAvailable) { return 0; }

    public int decodeEditabilityForKey(String key) { return 0; }

    public int decodeEditabilityForKey(String key, int defaultValueIfNotAvailable) { return 0; }

    public int _decodeImageScalingForKey(String key) { return 0; }

    public int _decodeImageScalingForKey(String key, int defaultValueIfNotAvailable) { return 0; }

    public int _decodeScalingHintsForKey(String key) { return 0; }

    public int _decodeScalingHintsForKey(String key, int defaultValueIfNotAvailable) { return 0; }

    public int _decodeQuickTimeCanvasResizingForKey(String key) { return 0; }

    public int _decodeQuickTimeCanvasResizingForKey(String key, int defaultValueIfNotAvailable) { return 0; }

    static  {}

    public static final Class _CLASS = null;
    public static final String ClassNameParameter = "className";
    public static final String TypeNameParameter = "typeName";
    public static final String KeyValuePairsParameter = "keyValuePairs";
    public static final String ArchiveNameParameter = "archive";
    public static final String SharedIdentifierParameter = "sharedIdentifier";
    public static final String EntityParameter = "entity";
    public static final String TitlesEntityParameter = "titlesEntity";
    public static final String EnabledKeyParameter = "enabledKey";
    public static final String ValueKeyParameter = "valueKey";
    public static final String MinimumValueKeyParameter = "minimumValueKey";
    public static final String MaximumValueKeyParameter = "maximumValueKey";
    public static final String ActionKeyParameter = "actionKey";
    public static final String URLKeyParameter = "URLKey";
    public static final String TitleKeysParameter = "titleKeys";
    public static final String DetailKeysParameter = "detailKeys";
    public static final String DetailRelationshipPathParameter = "detailPath";
    public static final String ChildrenKeyParameter = "childrenKey";
    public static final String IsLeafKeyParameter = "isLeafKey";
    public static final String RootKeyParameter = "rootKey";
    public static final String IconKeyParameter = "iconKey";
    public static final String ExpandedIconKeyParameter = "expandedIconKey";
    public static final String ParentKeyParameter = "parentKey";
    public static final String IndexKeyParameter = "indexKey";
    public static final String AvailableTitlesKeyParameter = "availableTitlesKey";
    public static final String RelationshipPathParameter = "path";
    public static final String MandatoryRelationshipPathsParameter = "mandatoryRelationshipPaths";
    public static final String SuppressesAssociationParameter = "suppressesAssociation";
    public static final String PrefersContinuousChangeNotificationParameter = "prefersContinuousChangeNotification";
    public static final String EditingContextProviderMethodNameParameter = "editingContextProviderMethodName";
    public static final String DisplayGroupProviderMethodNameParameter = "displayGroupProviderMethodName";
    public static final String EnabledDisplayGroupProviderMethodNameParameter = "enabledDisplayGroupProviderMethodName";
    public static final String TitlesDisplayGroupProviderMethodNameParameter = "titlesDisplayGroupProviderMethodName";
    public static final String FetchesOnConnectEnabledParameter = "fetchesOnConnectEnabled";
    public static final String SearchesTitlesObjectsInEditingContextParameter = "searchesTitlesObjectsInEditingContext";
    public static final String ResetTitlesObjectsOnEveryConnectParameter = "resetTitlesObjectsOnEveryConnect";
    public static final String IsQueryWidgetParameter = "isQueryWidget";
    public static final String EditabilityParameter = "editability";
    public static final String AllowsMultipleSelectionParameter = "allowsMultipleSelection";
    public static final String AllowsDiscontiguousSelectionParameter = "allowsDiscontiguousSelection";
    public static final String AllowsRemoveAllParameter = "allowsRemoveAll";
    public static final String AllowsDuplicatesParameter = "allowsDuplicates";
    public static final String IsRootVisibleParameter = "isRootVisible";
    public static final String AllowsOneTouchExpandableParameter = "allowsOneTouchExpandable";
    public static final String AllowsSnapToZeroParameter = "allowsSnapToZero";
    public static final String SortsByColumnOrderParameter = "sortsByColumnOrder";
    public static final String RunsConfirmDialogForEmptyQualifiers = "runsConfirmDialogForEmptyQualifiers";
    public static final String AlignsComponentsParameter = "alignsComponents";
    public static final String MinimumWidthParameter = "minimumWidth";
    public static final String MinimumHeightParameter = "minimumHeight";
    public static final String MinimumWidgetWidthParameter = "minimumWidgetWidth";
    public static final String MinimumWidgetHeightParameter = "minimumWidgetHeight";
    public static final String LabelComponentWidthParameter = "labelComponentWidth";
    public static final String FormatAllowedParameter = "formatAllowed";
    public static final String FormatClassParameter = "formatClass";
    public static final String FormatPatternParameter = "formatPattern";
    public static final String DisplayPatternParameter = "displayPattern";
    public static final String BorderTypeParameter = "borderType";
    public static final String HorizontalBorderParameter = "horizontalBorder";
    public static final String VerticalBorderParameter = "verticalBorder";
    public static final String HorizontallyResizableParameter = "horizontallyResizable";
    public static final String VerticallyResizableParameter = "verticallyResizable";
    public static final String AlignmentParameter = "alignment";
    public static final String LabelAlignmentParameter = "labelAlignment";
    public static final String ImageScalingParameter = "imageScaling";
    public static final String ScalingHintsParameter = "scalingHints";
    public static final String QuickTimeCanvasResizingParameter = "quickTimeCanvasResizing";
    public static final String WindowPositionParameter = "windowPosition";
    public static final String TitlePositionParameter = "titlePosition";
    public static final String ActionWidgetPositionParameter = "widgetPosition";
    public static final String ButtonPositionParameter = "buttonPosition";
    public static final String LabelComponentPositionParameter = "labelComponentPosition";
    public static final String UsesHorizontalLayoutParameter = "usesHorizontalLayout";
    public static final String UsesContinuousLayoutParameter = "usesContinuousLayout";
    public static final String ResizeWeightParameter = "resizeWeight";
    public static final String PrefersIconOnlyParameter = "prefersIconOnly";
    public static final String UsesLargeButtonRepresentationParameter = "usesLargeButtonRepresentation";
    public static final String UsesTitledBorderParameter = "usesTitledBorder";
    public static final String UsesLabelComponentParameter = "usesLabelComponent";
    public static final String UsesPasswordFieldParameter = "usesPasswordField";
    public static final String UsesTableLabelsParameter = "usesTableLabels";
    public static final String UsesActionParameter = "usesAction";
    public static final String UsesButtonParameter = "usesButton";
    public static final String UsesUserDefaultsWindowSizeParameter = "usesUserDefaultsWindowSize";
    public static final String UsesUserDefaultsWindowLocationParameter = "usesUserDefaultsWindowLocation";
    public static final String InsetsParameter = "insets";
    public static final String DisplaysLabelInWidgetParameter = "displaysLabelInWidget";
    public static final String AdditionalActionsParameter = "actions";
    public static final String InvokesDefaultActionParameter = "invokesDefaultAction";
    public static final String DisabledActionNamesParameter = "disabledActionNames";
    public static final String DisposeIfDeactivatedParameter = "disposeIfDeactivated";
    public static final String HighlightParameter = "highlight";
    public static final String ColorParameter = "color";
    public static final String FontParameter = "font";
    public static final String LabelParameter = "label";
    public static final String ToolTipParameter = "toolTip";
    public static final String IconNameParameter = "iconName";
    public static final String IconURLParameter = "iconURL";
    public static final String SmallIconNameParameter = "smallIconName";
    public static final String SmallIconURLParameter = "smallIconURL";
    public static final String ActionNameParameter = "actionName";
    public static final String DescriptionPathParameter = "descriptionPath";
    public static final String ShortDescriptionParameter = "shortDescription";
    public static final String MenuAcceleratorParameter = "menuAccelerator";
    public static final String ActionPriorityParameter = "actionPriority";
    public static final String CategoryPriorityParameter = "categoryPriority";
    public static final String CategoryNameParameter = "categoryName";
    public static final String SendsActionToAllControllersParameter = "sendsActionToAllControllers";
    public static final String MultipleWindowsAvailableParameter = "multipleWindowsAvailable";
    public static final String TaskParameter = "task";
    public static final String TransientParameter = "transient";
    public static final String _StandardActionParameter = "standardAction";
    public static final String _SpecialSupercontrollerActionNameParameter = "_supercontrollerAction";
    public static final String _ChildrenParameter = "_eochildren";
    public static final String _TagParameter = "_eotag";
    private static NSMutableDictionary _tagToClassNameMapTable;
    private static NSMutableDictionary _defaultsPerClassMapTable;
    private NSDictionary _values;

}
