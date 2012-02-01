package com.webobjects.eoapplication;
/**
 * EOXMLUnarchivers are used to unarchive objects (controllers and actions) from an XML description. Instances of EOXMLUnarchiver are passed to constructors of the objects to unarchive and can be used to retrieve the XML arguments.
 */
public class EOXMLUnarchiver{
    public static final java.lang.String ActionKeyParameter="actionKey";

    public static final java.lang.String ActionNameParameter="actionName";

    public static final java.lang.String ActionPriorityParameter="actionPriority";

    public static final java.lang.String ActionWidgetPositionParameter="widgetPosition";

    public static final java.lang.String AdditionalActionsParameter="actions";

    public static final java.lang.String AlignmentParameter="alignment";

    public static final java.lang.String AlignsComponentsParameter="alignsComponents";

    public static final java.lang.String AllowsDiscontiguousSelectionParameter="allowsDiscontiguousSelection";

    public static final java.lang.String AllowsDuplicatesParameter="allowsDuplicates";

    public static final java.lang.String AllowsMultipleSelectionParameter="allowsMultipleSelection";

    public static final java.lang.String AllowsOneTouchExpandableParameter="allowsOneTouchExpandable";

    public static final java.lang.String AllowsRemoveAllParameter="allowsRemoveAll";

    public static final java.lang.String AllowsSnapToZeroParameter="allowsSnapToZero";

    public static final java.lang.String ArchiveNameParameter="archive";

    public static final java.lang.String AvailableTitlesKeyParameter="availableTitlesKey";

    public static final java.lang.String BorderTypeParameter="borderType";

    public static final java.lang.String ButtonPositionParameter="buttonPosition";

    public static final java.lang.String CategoryNameParameter="categoryName";

    public static final java.lang.String CategoryPriorityParameter="categoryPriority";

    public static final java.lang.String ChildrenKeyParameter="childrenKey";

    public static final java.lang.String ClassNameParameter="className";

    public static final java.lang.String ColorParameter="color";

    public static final java.lang.String DescriptionPathParameter="descriptionPath";

    public static final java.lang.String DetailKeysParameter="detailKeys";

    public static final java.lang.String DetailRelationshipPathParameter="detailPath";

    public static final java.lang.String DisabledActionNamesParameter="disabledActionNames";

    public static final java.lang.String DisplayGroupProviderMethodNameParameter="displayGroupProviderMethodName";

    public static final java.lang.String DisplayPatternParameter="displayPattern";

    public static final java.lang.String DisplaysLabelInWidgetParameter="displaysLabelInWidget";

    public static final java.lang.String DisposeIfDeactivatedParameter="disposeIfDeactivated";

    public static final java.lang.String EditabilityParameter="editability";

    public static final java.lang.String EditingContextProviderMethodNameParameter="editingContextProviderMethodName";

    public static final java.lang.String EnabledDisplayGroupProviderMethodNameParameter="enabledDisplayGroupProviderMethodName";

    public static final java.lang.String EnabledKeyParameter="enabledKey";

    public static final java.lang.String EntityParameter="entity";

    public static final java.lang.String ExpandedIconKeyParameter="expandedIconKey";

    public static final java.lang.String FetchesOnConnectEnabledParameter="fetchesOnConnectEnabled";

    public static final java.lang.String FontParameter="font";

    public static final java.lang.String FormatAllowedParameter="formatAllowed";

    public static final java.lang.String FormatClassParameter="formatClass";

    public static final java.lang.String FormatPatternParameter="formatPattern";

    public static final java.lang.String HighlightParameter="highlight";

    public static final java.lang.String HorizontalBorderParameter="horizontalBorder";

    public static final java.lang.String HorizontallyResizableParameter="horizontallyResizable";

    public static final java.lang.String IconKeyParameter="iconKey";

    public static final java.lang.String IconNameParameter="iconName";

    public static final java.lang.String IconURLParameter="iconURL";

    public static final java.lang.String ImageScalingParameter="imageScaling";

    public static final java.lang.String IndexKeyParameter="indexKey";

    public static final java.lang.String InsetsParameter="insets";

    public static final java.lang.String InvokesDefaultActionParameter="invokesDefaultAction";

    public static final java.lang.String IsLeafKeyParameter="isLeafKey";

    public static final java.lang.String IsQueryWidgetParameter="isQueryWidget";

    public static final java.lang.String IsRootVisibleParameter="isRootVisible";

    public static final java.lang.String KeyValuePairsParameter="keyValuePairs";

    public static final java.lang.String LabelAlignmentParameter="labelAlignment";

    public static final java.lang.String LabelComponentPositionParameter="labelComponentPosition";

    public static final java.lang.String LabelComponentWidthParameter="labelComponentWidth";

    public static final java.lang.String LabelParameter="label";

    public static final java.lang.String MandatoryRelationshipPathsParameter="mandatoryRelationshipPaths";

    public static final java.lang.String MaximumValueKeyParameter="maximumValueKey";

    public static final java.lang.String MenuAcceleratorParameter="menuAccelerator";

    public static final java.lang.String MinimumHeightParameter="minimumHeight";

    public static final java.lang.String MinimumValueKeyParameter="minimumValueKey";

    public static final java.lang.String MinimumWidgetHeightParameter="minimumWidgetHeight";

    public static final java.lang.String MinimumWidgetWidthParameter="minimumWidgetWidth";

    public static final java.lang.String MinimumWidthParameter="minimumWidth";

    public static final java.lang.String MultipleWindowsAvailableParameter="multipleWindowsAvailable";

    public static final java.lang.String ParentKeyParameter="parentKey";

    public static final java.lang.String PrefersContinuousChangeNotificationParameter="prefersContinuousChangeNotification";

    public static final java.lang.String PrefersIconOnlyParameter="prefersIconOnly";

    public static final java.lang.String QuickTimeCanvasResizingParameter="quickTimeCanvasResizing";

    public static final java.lang.String RelationshipPathParameter="path";

    public static final java.lang.String ResetTitlesObjectsOnEveryConnectParameter="resetTitlesObjectsOnEveryConnect";

    public static final java.lang.String ResizeWeightParameter="resizeWeight";

    public static final java.lang.String RootKeyParameter="rootKey";

    public static final java.lang.String RunsConfirmDialogForEmptyQualifiers="runsConfirmDialogForEmptyQualifiers";

    public static final java.lang.String ScalingHintsParameter="scalingHints";

    public static final java.lang.String SearchesTitlesObjectsInEditingContextParameter="searchesTitlesObjectsInEditingContext";

    public static final java.lang.String SendsActionToAllControllersParameter="sendsActionToAllControllers";

    public static final java.lang.String SharedIdentifierParameter="sharedIdentifier";

    public static final java.lang.String ShortDescriptionParameter="shortDescription";

    public static final java.lang.String SmallIconNameParameter="smallIconName";

    public static final java.lang.String SmallIconURLParameter="smallIconURL";

    public static final java.lang.String SortsByColumnOrderParameter="sortsByColumnOrder";

    public static final java.lang.String SuppressesAssociationParameter="suppressesAssociation";

    public static final java.lang.String TaskParameter="task";

    public static final java.lang.String TitleKeysParameter="titleKeys";

    public static final java.lang.String TitlePositionParameter="titlePosition";

    public static final java.lang.String TitlesDisplayGroupProviderMethodNameParameter="titlesDisplayGroupProviderMethodName";

    public static final java.lang.String TitlesEntityParameter="titlesEntity";

    public static final java.lang.String ToolTipParameter="toolTip";

    public static final java.lang.String TransientParameter="transient";

    public static final java.lang.String TypeNameParameter="typeName";

    public static final java.lang.String URLKeyParameter="URLKey";

    public static final java.lang.String UsesActionParameter="usesAction";

    public static final java.lang.String UsesButtonParameter="usesButton";

    public static final java.lang.String UsesContinuousLayoutParameter="usesContinuousLayout";

    public static final java.lang.String UsesHorizontalLayoutParameter="usesHorizontalLayout";

    public static final java.lang.String UsesLabelComponentParameter="usesLabelComponent";

    public static final java.lang.String UsesLargeButtonRepresentationParameter="usesLargeButtonRepresentation";

    public static final java.lang.String UsesPasswordFieldParameter="usesPasswordField";

    public static final java.lang.String UsesTableLabelsParameter="usesTableLabels";

    public static final java.lang.String UsesTitledBorderParameter="usesTitledBorder";

    public static final java.lang.String UsesUserDefaultsWindowLocationParameter="usesUserDefaultsWindowLocation";

    public static final java.lang.String UsesUserDefaultsWindowSizeParameter="usesUserDefaultsWindowSize";

    public static final java.lang.String ValueKeyParameter="valueKey";

    public static final java.lang.String VerticalBorderParameter="verticalBorder";

    public static final java.lang.String VerticallyResizableParameter="verticallyResizable";

    public static final java.lang.String WindowPositionParameter="windowPosition";

    /**
     * Creates a new EOXMLUnarchiver.
     * Parameters:values - the XML attributes as a dictionary
     */
    public EOXMLUnarchiver(com.webobjects.foundation.NSDictionary values){
         //TODO codavaj!!
    }

    /**
     * Returns an alignment (JTextField.LEFT, JTextField.CENTER, or JTextField.RIGHT) for the key XML attribute. If no value for key is specified, returns JTextField.LEFT. The alignment can be specified as "Center", "Left", or "Right".
     */
    public int decodeAlignmentForKey(java.lang.String key){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns an alignment (JTextField.LEFT, JTextField.CENTER, or JTextField.RIGHT) for the key XML attribute. If no value for key is specified, returns defaultValueIfNotAvailable. The alignment can be specified as "Center", "Left", or "Right".
     */
    public int decodeAlignmentForKey(java.lang.String key, int defaultValueIfNotAvailable){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns an NSArray specified as child in the XML with the name key or null if key is not specified in the XML.
     */
    public com.webobjects.foundation.NSArray decodeArrayForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSArray specified as child in the XML with the name key or defaultValueIfNotAvailable if key is not specified in the XML.
     */
    public com.webobjects.foundation.NSArray decodeArrayForKey(java.lang.String key, com.webobjects.foundation.NSArray defaultValueIfNotAvailable){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a boolean for the key XML attribute. If no value for key is specified, returns false.
     */
    public boolean decodeBooleanForKey(java.lang.String key){
        return false; //TODO codavaj!!
    }

    /**
     * Returns a boolean for the key XML attribute. If no value for key is specified, returns defaultValueIfNotAvailable.
     */
    public boolean decodeBooleanForKey(java.lang.String key, boolean defaultValueIfNotAvailable){
        return false; //TODO codavaj!!
    }

    /**
     * Returns an array containing the objects decoded as the receiver's children. The children are the objects created from XML tags contained in the receiver's XML description.
     */
    public com.webobjects.foundation.NSArray decodeChildren(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a Class specified by name as the XML attribute key or null if key is not specified in the XML.
     */
    public java.lang.Class decodeClassForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a Class specified by name as the XML attribute key or defaultValueIfNotAvailable if key is not specified in the XML.
     */
    public java.lang.Class decodeClassForKey(java.lang.String key, java.lang.Class defaultValueIfNotAvailable){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a Color for the key XML attribute. If no value for key is specified, returns null. The color can be specified either as "red,green,blue" with red, green and blue being integers between 0 and 255 or as "#RRGGBB" with RR, GG, BB being hexadecimal values between 00 and FF.
     */
    public java.awt.Color decodeColorForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a Color for the key XML attribute. If no value for key is specified, returns defaultValueIfNotAvailable. The color can be specified either as "red,green,blue" with red, green and blue being integers between 0 and 255 or as "#RRGGBB" with RR, GG, BB being hexadecimal values between 00 and FF.
     */
    public java.awt.Color decodeColorForKey(java.lang.String key, java.awt.Color defaultValueIfNotAvailable){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary specified as child in the XML with the name key or null if key is not specified in the XML.
     */
    public com.webobjects.foundation.NSDictionary decodeDictionaryForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an NSDictionary specified as child in the XML with the name key or defaultValueIfNotAvailable if key is not specified in the XML.
     */
    public com.webobjects.foundation.NSDictionary decodeDictionaryForKey(java.lang.String key, com.webobjects.foundation.NSDictionary defaultValueIfNotAvailable){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a double for the key XML attribute. If no value for key is specified, returns 0.
     */
    public double decodeDoubleForKey(java.lang.String key){
        return 0.0d; //TODO codavaj!!
    }

    /**
     * Returns an integer for the key XML attribute. If no value for key is specified, returns defaultValueIfNotAvailable.
     */
    public double decodeDoubleForKey(java.lang.String key, double defaultValueIfNotAvailable){
        return 0.0d; //TODO codavaj!!
    }

    /**
     * Returns a editability specification (EOEditable.IfSupercontrollerEditable, EOEditable.AlwaysEditable, or EOEditable.NeverEditable) for the key XML attribute. If no value for key is specified, returns EOEditable.IfSupercontrollerEditable. The editability can be specified as "Never", "Always", or "IfSupercontroller".
     */
    public int decodeEditabilityForKey(java.lang.String key){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns a editability specification (EOEditable.IfSupercontrollerEditable, EOEditable.AlwaysEditable, or EOEditable.NeverEditable) for the key XML attribute. If no value for key is specified, returns defaultValueIfNotAvailable. The editability can be specified as "Never", "Always", or "IfSupercontroller".
     */
    public int decodeEditabilityForKey(java.lang.String key, int defaultValueIfNotAvailable){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns a Font for the key XML attribute. If no value for key is specified, returns null. The font can be specified as a String "size[,style][:font_name]" with size being an absolute integer or a relative value like "+4", "-2" or "12", the style being one of the values "Plain", "Bold", "Italic", or "BoldItalic", and font_name being the name of the font. style and font_name are optional.
     */
    public java.awt.Font decodeFontForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a Font for the key XML attribute. If no value for key is specified, returns defaultValueIfNotAvailable. The font can be specified as a String "size[,style][:font_name]" with size being an absolute integer or a relative value like "+4", "-2" or "12", the style being one of the values "Plain", "Bold", "Italic", or "BoldItalic", and font_name being the name of the font. style and font_name are optional.
     */
    public java.awt.Font decodeFontForKey(java.lang.String key, java.awt.Font defaultValueIfNotAvailable){
        return null; //TODO codavaj!!
    }

    public java.awt.Insets decodeInsetsForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    public java.awt.Insets decodeInsetsForKey(java.lang.String key, java.awt.Insets defaultValueIfNotAvailable){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an integer for the key XML attribute. If no value for key is specified, returns 0.
     */
    public int decodeIntForKey(java.lang.String key){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns an integer for the key XML attribute. If no value for key is specified, returns defaultValueIfNotAvailable.
     */
    public int decodeIntForKey(java.lang.String key, int defaultValueIfNotAvailable){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns a position (EOComponentController.Top, EOComponentController.Bottom, EOComponentController.Left, EOComponentController.Right, EOComponentController.TopLeft, EOComponentController.TopRight, EOComponentController.BottomLeft, or EOComponentController.BottomRight) for the key XML attribute. If no value for key is specified, returns EOComponentController.Center. The position can be specified as "Center", "Top", "Bottom", "Left", "Right", "TopLeft", "TopRight", "BottomLeft", or "BottomRight".
     */
    public int decodePositionForKey(java.lang.String key){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns a position (EOComponentController.Top, EOComponentController.Bottom, EOComponentController.Left, EOComponentController.Right, EOComponentController.TopLeft, EOComponentController.TopRight, EOComponentController.BottomLeft, or EOComponentController.BottomRight) for the key XML attribute. If no value for key is specified, returns defaultValueIfNotAvailable. The position can be specified as "Center", "Top", "Bottom", "Left", "Right", "TopLeft", "TopRight", "BottomLeft", or "BottomRight".
     */
    public int decodePositionForKey(java.lang.String key, int defaultValueIfNotAvailable){
        return 0; //TODO codavaj!!
    }

    /**
     * Decodes the top object in an XML description, which is represented by an NSDictionary.
     */
    public static java.lang.Object decodeRootObject(com.webobjects.foundation.NSDictionary rootObjectValues){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String for the key XML attribute. If no value for key is specified, returns null.
     */
    public java.lang.String decodeStringForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a String for the key XML attribute. If no value for key is specified, returns defaultValueIfNotAvailable.
     */
    public java.lang.String decodeStringForKey(java.lang.String key, java.lang.String defaultValueIfNotAvailable){
        return null; //TODO codavaj!!
    }

    /**
     * Returns an Object for the key XML attribute. If no value for key is specified, returns null.
     */
    public java.lang.Object decodeValueForKey(java.lang.String key){
        return null; //TODO codavaj!!
    }

}
