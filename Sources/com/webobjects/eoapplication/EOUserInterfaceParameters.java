package com.webobjects.eoapplication;
/**
 * EOUserInterfaceParameters has many static methods used to localize strings and icons and to determine several aspects (fonts, colors, border sizes) of the user interface.
 * The methods to retrieve localized and platform-specific strings and images use a resource bundle which you can set with setStandardResourceBundle. Unless you specify your own custom resource bundle, an instance of EODefaultResourceBundle is used to load resources from the server.
 * EOUserInterfaceParameters also has various methods to set and get fonts, colors and border sizes which are used by controllers while they dynamically generate elements of the user interface. So you can widely modify the look of the application by invoking a few set methods on EOUserInterfaceParameters as long as you use dynamic user interface generation (Direct to Java Client).
 * See Also:EOUserInterfaceParameters.standardResourceBundle(), EODefaultResourceBundle
 */
public class EOUserInterfaceParameters{
    public static final java.lang.String OptimizeForMacKey="optimizeForMac";

    public EOUserInterfaceParameters(){
         //TODO codavaj!!
    }

    /**
     * Returns the font used for large-size action buttons.
     */
    public static java.awt.Font actionTitleFont(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the title position in large-size action buttons. The default is EOComponentController.Bottom.
     */
    public static int actionTitlePosition(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns whether windows should be activated delayed at the end of an event. Activating windows delayed prevents the window size from changing visibly for the user in case the window content is layed out dynamically and has to grow multiple times while building up all widgets during an event. The default is true.
     */
    public static boolean activateWindowsDelayed(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether large-size action buttons should use icons or not (if icons are available). The default is true.
     */
    public static boolean allowActionIcons(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether small-size action buttons should use icons or not (if icons are available). The default is true.
     */
    public static boolean allowSmallActionIcons(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the color used for the background of disabled text fields.
     */
    public static java.awt.Color disabledTextBackgroundColor(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the color used for the background of editable text fields.
     */
    public static java.awt.Color editableTextBackgroundColor(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether Save actions should only be enabled if a document is edited. The default is true.
     */
    public static boolean enableSaveOnlyIfEdited(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the color used for highlighted labels (in front of widgets).
     */
    public static java.awt.Color highlightLabelColor(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the font used for highlighted labels (in front of widgets).
     */
    public static java.awt.Font highlightLabelFont(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the color used for highlighted titles, for example in boxes and tab views.
     */
    public static java.awt.Color highlightTitleColor(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the font used for highlighted titles, for example in boxes and tab views.
     */
    public static java.awt.Font highlightTitleFont(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the color used for labels (in front of widgets).
     */
    public static java.awt.Color labelColor(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the distance between labels and widgets used by the default controller layout mechanisms. The default is 1.
     */
    public static int labelDistance(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the font used for labels (in front of widgets).
     */
    public static java.awt.Font labelFont(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the large border size used by the default controller layout mechanisms. The default is 6.
     */
    public static int largeBorder(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns a localized version of the icon named iconName or null if no icon can be found with the specified name.
     */
    public static javax.swing.Icon localizedIcon(java.lang.String iconName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a localized version of string or string itself if no localized version can be found.
     */
    public static java.lang.String localizedString(java.lang.String string){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether the background of all icons loaded through the default resource bundle should be made explicitly transparent. This option is useful if you load your own icons whithout transparent background. The assumption is that the pixel in the top-left corner of the icons determines the background color. The default is false.
     */
    public static boolean makeIconBackgroundsTransparent(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the medium border size used by the default controller layout mechanisms. The default is 2.
     */
    public static int mediumBorder(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the minimum size of large-size action buttons. The default is 32 x 48.
     */
    public static java.awt.Dimension minimumActionButtonSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the minimum size of small-size action buttons. The default is 60 x 12.
     */
    public static java.awt.Dimension minimumSmallActionButtonSize(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the minimum size of special action buttons used as integration components for controllers activated by buttons. The default is 60 x 16.
     */
    public static java.awt.Dimension minimumSpecialActionButtonSize(){
        return null; //TODO codavaj!!
    }

    public static void optimizeForMac(){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether standard menu accelerators like Command-n (new), Command-o (open) should be constantly updated to affect the active type of document (object). The default is true.
     */
    public static boolean optimizeMenuAccelerators(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the color used for the background of query text fields.
     */
    public static java.awt.Color queryTextBackgroundColor(){
        return null; //TODO codavaj!!
    }

    /**
     * Sets the font used for large-size action buttons.
     */
    public static void setActionTitleFont(java.awt.Font font){
        return; //TODO codavaj!!
    }

    /**
     * Sets the title position in large-size action buttons. The default is EOComponentController.Bottom.
     */
    public static void setActionTitlePosition(int position){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether windows should be activated delayed at the end of an event. Activating windows delayed prevents the window size from changing visibly for the user in case the window content is layed out dynamically and has to grow multiple times while building up all widgets during an event. The default is true.
     */
    public static void setActivateWindowsDelayed(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether large-size action buttons should use icons or not (if icons are available). The default is true.
     */
    public static void setAllowActionIcons(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether small-size action buttons should use icons or not (if icons are available).
     */
    public static void setAllowSmallActionIcons(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the color used for the background of disabled text fields. Also updates the default background color used by EOTextAssociations unless it has been set explicitly before.
     */
    public static void setDisabledTextBackgroundColor(java.awt.Color color){
        return; //TODO codavaj!!
    }

    /**
     * Sets the color used for the background of editable text fields. Also updates the default background color used by EOTextAssociations unless it has been set explicitly before.
     */
    public static void setEditableTextBackgroundColor(java.awt.Color color){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether Save actions should only be enabled if a document is edited. The default is true.
     */
    public static void setEnableSaveOnlyIfEdited(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the color used for highlighted labels (in front of widgets).
     */
    public static void setHighlightLabelColor(java.awt.Color color){
        return; //TODO codavaj!!
    }

    /**
     * Sets the font used for highlighted labels (in front of widgets).
     */
    public static void setHighlightLabelFont(java.awt.Font font){
        return; //TODO codavaj!!
    }

    /**
     * Sets the color used for highlighted titles, for example in boxes and tab views.
     */
    public static void setHighlightTitleColor(java.awt.Color color){
        return; //TODO codavaj!!
    }

    /**
     * Sets the font used for highlighted titles, for example in boxes and tab views.
     */
    public static void setHighlightTitleFont(java.awt.Font font){
        return; //TODO codavaj!!
    }

    /**
     * Sets the color used for labels (in front of widgets).
     */
    public static void setLabelColor(java.awt.Color color){
        return; //TODO codavaj!!
    }

    /**
     * Sets the distance between labels and widgets used by the default controller layout mechanisms. The default is 1.
     */
    public static void setLabelDistance(int distance){
        return; //TODO codavaj!!
    }

    /**
     * Sets the font used for labels (in front of widgets).
     */
    public static void setLabelFont(java.awt.Font font){
        return; //TODO codavaj!!
    }

    /**
     * Sets the large border size used by the default controller layout mechanisms. The default is 6.
     */
    public static void setLargeBorder(int border){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the background of all icons loaded through the default resource bundle should be made explicitly transparent. This option is useful if you load your own icons whithout transparent background. The assumption is that the pixel in the top-left corner of the icons determines the background color. The default is false.
     */
    public static void setMakeIconBackgroundsTransparent(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the medium border size used by the default controller layout mechanisms. The default is 2.
     */
    public static void setMediumBorder(int border){
        return; //TODO codavaj!!
    }

    /**
     * Sets the minimum size of large-size action buttons. The default is 32 x 48.
     */
    public static void setMinimumActionButtonSize(java.awt.Dimension size){
        return; //TODO codavaj!!
    }

    /**
     * Sets the minimum size of small-size action buttons. The default is 60 x 12.
     */
    public static void setMinimumSmallActionButtonSize(java.awt.Dimension size){
        return; //TODO codavaj!!
    }

    /**
     * Sets the minimum size of small-size of special action buttons used as integration components for controllers activated by buttons. The default is 60 x 16.
     */
    public static void setMinimumSpecialActionButtonSize(java.awt.Dimension size){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether standard menu accelerators like Command-n (new), Command-o (open) should be constantly updated to affect the active type of document (object). The default is true.
     */
    public static void setOptimizeMenuAccelerators(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the color used for the background of query text fields.
     */
    public static void setQueryTextBackgroundColor(java.awt.Color color){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether the default document actions like Save and Revert should be shown with explicit buttons in document windows. The default is true.
     */
    public static void setShowDefaultDocumentActionsInWindows(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the font used for small-size action buttons.
     */
    public static void setSmallActionTitleFont(java.awt.Font font){
        return; //TODO codavaj!!
    }

    /**
     * Sets the title position in small-size action buttons. The default is EOComponentController.Right.
     */
    public static void setSmallActionTitlePosition(int position){
        return; //TODO codavaj!!
    }

    /**
     * Sets the small border size used by the default controller layout mechanisms. The default is 1.
     */
    public static void setSmallBorder(int border){
        return; //TODO codavaj!!
    }

    /**
     * Sets the font used for special action buttons with icons.
     */
    public static void setSpecialActionTitleFont(java.awt.Font font){
        return; //TODO codavaj!!
    }

    /**
     * Sets the title position in the special action buttons used as integration components for controllers activated by buttons. The default is EOComponentController.Right.
     */
    public static void setSpecialActionTitlePosition(int position){
        return; //TODO codavaj!!
    }

    /**
     * Sets the font used for special action buttons without icons (text only).
     */
    public static void setSpecialTextOnlyActionTitleFont(java.awt.Font font){
        return; //TODO codavaj!!
    }

    /**
     * Sets the resource bundle used by the methods on EOUserInterfaceParameters to retrieve localized and platform specific resources. The default is an instance of EODefautResourceBundle.
     */
    public static void setStandardResourceBundle(java.util.ResourceBundle resourceBundle){
        return; //TODO codavaj!!
    }

    /**
     * Sets the color used for titles, for example in boxes and tab views.
     */
    public static void setTitleColor(java.awt.Color color){
        return; //TODO codavaj!!
    }

    /**
     * Sets the font used for titles, for example in boxes and tab views.
     */
    public static void setTitleFont(java.awt.Font font){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether large-size action buttons with icons use borders or not. The default is false on Mac OS X and true on all other platforms.
     */
    public static void setUseBorderWithActionIcons(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether small-size action buttons with icons use borders or not. The default is false on Mac OS X and true on all other platforms.
     */
    public static void setUseBorderWithSmallActionIcons(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether widgets generated dynamically by controllers use the colors specified in EOUserInterfaceParameters or not. If not, widgets simply use the default colors. By using the colors specified in EOUserInterfaceParameters, application user interfaces look more consistent and you can change the look of the complete application with one single set method. The default is false, but the EODynamicApplication class used for Direct to Java Client sets it to true at startup time.
     */
    public static void setUseSpecialColors(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether widgets generated dynamically by controllers use the fonts specified in EOUserInterfaceParameters or not. If not, widgets simply use the default fonts. By using the fonts specified in EOUserInterfaceParameters, application user interfaces look more consistent and you can change the look of the complete application with one single set method. The default is false, but the EODynamicApplication class used for Direct to Java Client sets it to true at startup time.
     */
    public static void setUseSpecialFonts(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether large-size action buttons with icons also display titles or not. The default is true.
     */
    public static void setUseTitleWithActionIcons(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether small-size action buttons with icons also display titles or not. The default is true.
     */
    public static void setUseTitleWithSmallActionIcons(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether all windows (frames) of the application should show the standard application actions menu. The default is true.
     */
    public static void setUseWindowMenus(boolean flag){
        return; //TODO codavaj!!
    }

    /**
     * Sets the font used for normal input widgets, for example text fields.
     */
    public static void setWidgetFont(java.awt.Font font){
        return; //TODO codavaj!!
    }

    /**
     * Returns whether the default document actions like Save and Revert should be shown with explicit buttons in document windows. The default is true.
     */
    public static boolean showDefaultDocumentActionsInWindows(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the font used for small-size action buttons.
     */
    public static java.awt.Font smallActionTitleFont(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the title position in small-size action buttons. The default is EOComponentController.Right.
     */
    public static int smallActionTitlePosition(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the small border size used by the default controller layout mechanisms. The default is 1.
     */
    public static int smallBorder(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the font used for special action buttons with icons.
     */
    public static java.awt.Font specialActionTitleFont(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the title position in the special action buttons used as integration components for controllers activated by buttons. The default is EOComponentController.Right.
     */
    public static int specialActionTitlePosition(){
        return 0; //TODO codavaj!!
    }

    /**
     * Returns the font used for special action buttons without icons (text only).
     */
    public static java.awt.Font specialTextOnlyActionTitleFont(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a localized version of a large-size icon representing the action actionName (for example "save") or null if no icon for the action can be found. The name of the icon looked up is derived from the action name as "ActionIcon", (for example "ActionIconSave").
     */
    public static javax.swing.Icon standardActionIcon(java.lang.String actionName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the resource bundle used by the methods on EOUserInterfaceParameters to retrieve localized and platform specific resources. The default is an instance of EODefautResourceBundle.
     */
    public static java.util.ResourceBundle standardResourceBundle(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a localized version of a small-size icon representing the action actionName (for example "save") or null if no icon for the action can be found. The name of the icon looked up is derived from the action name as "SmallActionIcon", (for example "SmallActionIconSave").
     */
    public static javax.swing.Icon standardSmallActionIcon(java.lang.String actionName){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the color used for titles, for example in boxes and tab views.
     */
    public static java.awt.Color titleColor(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the font used for titles, for example in boxes and tab views.
     */
    public static java.awt.Font titleFont(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns whether large-size action buttons with icons use borders or not. The default is false on Mac OS X and true on all other platforms.
     */
    public static boolean useBorderWithActionIcons(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether small-size action buttons with icons use borders or not. The default is false on Mac OS X and true on all other platforms.
     */
    public static boolean useBorderWithSmallActionIcons(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether widgets generated dynamically by controllers use the colors specified in EOUserInterfaceParameters or not. If not, widgets simply use the default colors. By using the colors specified in EOUserInterfaceParameters, application user interfaces look more consistent and you can change the look of the complete application with one single set method. The default is false, but the EODynamicApplication class used for Direct to Java Client sets it to true at startup time.
     */
    public static boolean useSpecialColors(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether widgets generated dynamically by controllers use the fonts specified in EOUserInterfaceParameters or not. If not, widgets simply use the default fonts. By using the fonts specified in EOUserInterfaceParameters, application user interfaces look more consistent and you can change the look of the complete application with one single set method. The default is false, but the EODynamicApplication class used for Direct to Java Client sets it to true at startup time.
     */
    public static boolean useSpecialFonts(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether large-size action buttons with icons also display titles or not. The default is true.
     */
    public static boolean useTitleWithActionIcons(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether small-size action buttons with icons also display titles or not. The default is true.
     */
    public static boolean useTitleWithSmallActionIcons(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns whether all windows (frames) of the application should show the standard application actions menu. The default is true.
     */
    public static boolean useWindowMenus(){
        return false; //TODO codavaj!!
    }

    /**
     * Returns the font used for normal input widgets, for example text fields.
     */
    public static java.awt.Font widgetFont(){
        return null; //TODO codavaj!!
    }

}
