
package com.webobjects.eoapplication;

import com.webobjects.eointerface.EOTextAssociation;
import com.webobjects.eointerface.EOWidgetPluginRegistry;
import com.webobjects.eointerface.swing.EOSwingUtilities;
import com.webobjects.foundation.*;
import java.awt.*;
import java.awt.image.*;
import java.net.URL;
import java.text.Format;
import java.util.*;
import javax.swing.*;


public class EOUserInterfaceParameters {
    private static class _ConcreteIconSet
        implements _IconSet {


        public _ConcreteIconSet(Icon icon, Icon smallIcon) { return null; }

        public Icon icon() { return null; }

        public Icon smallIcon() { return null; }

        private Icon _icon;
        private Icon _smallIcon;

    }

    private static class _ConcreteTitleSet
        implements _TitleSet {


        public _ConcreteTitleSet(String title, String shortTitle) { return null; }

        public String title() { return null; }

        public String shortTitle() { return null; }

        private String _title;
        private String _shortTitle;

    }

    public static class _TransparentIconFilter extends RGBImageFilter {


        public static ImageIcon createTransparentIcon(ImageIcon icon) { return null; }

        public _TransparentIconFilter(ImageIcon icon) { return null; }

        public _TransparentIconFilter(ImageIcon icon, Color originalBackgroundColor) { return null; }

        public int filterRGB(int x, int y, int rgb) { return 0; }

        private int _originalBackgroundColorRGB;
        private int _replacementBackgroundColorRGB;

    }

    public static class _DarkImageFilter extends RGBImageFilter {

        public static Image createDarkImage(Image image) { return null; }

        public _DarkImageFilter() { return null; }

        public int filterRGB(int x, int y, int rgb) { return 0; }
    }

    public static class _LightImageFilter extends RGBImageFilter {

        public static Image createLightImage(Image image) { return null; }

        public _LightImageFilter() { return null; }

        public int filterRGB(int x, int y, int rgb) { return 0; }
    }

    public static interface _IconHandler {


        public abstract String _nameForLocalizedIcon(Icon icon);

        public abstract ImageIcon _iconFromURL(String s);



        public static final Class _CLASS = null;

    }

    public static interface _TitleSet {


        public abstract String title();

        public abstract String shortTitle();



        public static final Class _CLASS = null;

    }

    public static interface _IconSet {


        public abstract Icon icon();

        public abstract Icon smallIcon();



        public static final Class _CLASS = null;

    }



    public EOUserInterfaceParameters() { return null; }

    public static Color _colorVariation(Color color, double redFactor, double greenFactor, double blueFactor) { return null; }

    public static void _populateValuesWithDefaults(boolean useSpecialFontsAndColors, boolean executeMethods) { return null; }

    public static void optimizeForMac() { return null; }

    public static void _populateValuesFromDictionary(NSDictionary values) { return null; }

    public static void setActivateWindowsDelayed(boolean flag) { return null; }

    public static boolean activateWindowsDelayed() { return null; }

    public static void setUseWindowMenus(boolean flag) { return null; }

    public static boolean useWindowMenus() { return null; }

    public static void setOptimizeMenuAccelerators(boolean flag) { return null; }

    public static boolean optimizeMenuAccelerators() { return null; }

    public static void setShowDefaultDocumentActionsInWindows(boolean flag) { return null; }

    public static boolean showDefaultDocumentActionsInWindows() { return null; }

    public static void setEnableSaveOnlyIfEdited(boolean flag) { return null; }

    public static boolean enableSaveOnlyIfEdited() { return null; }

    public static void setAllowActionIcons(boolean flag) { return null; }

    public static boolean allowActionIcons() { return null; }

    public static void setAllowSmallActionIcons(boolean flag) { return null; }

    public static boolean allowSmallActionIcons() { return null; }

    public static void setMakeIconBackgroundsTransparent(boolean flag) { return null; }

    public static boolean makeIconBackgroundsTransparent() { return null; }

    public static void setUseBorderWithActionIcons(boolean flag) { return null; }

    public static boolean useBorderWithActionIcons() { return null; }

    public static void setUseBorderWithSmallActionIcons(boolean flag) { return null; }

    public static boolean useBorderWithSmallActionIcons() { return null; }

    public static void setUseTitleWithActionIcons(boolean flag) { return null; }

    public static boolean useTitleWithActionIcons() { return null; }

    public static void setUseTitleWithSmallActionIcons(boolean flag) { return null; }

    public static boolean useTitleWithSmallActionIcons() { return null; }

    public static void setActionTitlePosition(int position) { return null; }

    public static int actionTitlePosition() { return null; }

    public static void setSmallActionTitlePosition(int position) { return null; }

    public static int smallActionTitlePosition() { return null; }

    public static void setSpecialActionTitlePosition(int position) { return null; }

    public static int specialActionTitlePosition() { return null; }

    public static void setMinimumActionButtonSize(Dimension size) { return null; }

    public static Dimension minimumActionButtonSize() { return null; }

    public static void setMinimumSmallActionButtonSize(Dimension size) { return null; }

    public static Dimension minimumSmallActionButtonSize() { return null; }

    public static void setMinimumSpecialActionButtonSize(Dimension size) { return null; }

    public static Dimension minimumSpecialActionButtonSize() { return null; }

    public static void setSmallBorder(int border) { return null; }

    public static int smallBorder() { return null; }

    public static void setMediumBorder(int border) { return null; }

    public static int mediumBorder() { return null; }

    public static void setLargeBorder(int border) { return null; }

    public static int largeBorder() { return null; }

    public static void setLabelDistance(int distance) { return null; }

    public static int labelDistance() { return null; }

    public static void setUseSpecialFonts(boolean flag) { return null; }

    public static boolean useSpecialFonts() { return null; }

    public static void setWidgetFont(Font font) { return null; }

    public static Font widgetFont() { return null; }

    public static void setLabelFont(Font font) { return null; }

    public static Font labelFont() { return null; }

    public static void setHighlightLabelFont(Font font) { return null; }

    public static Font highlightLabelFont() { return null; }

    public static void setTitleFont(Font font) { return null; }

    public static Font titleFont() { return null; }

    public static void setHighlightTitleFont(Font font) { return null; }

    public static Font highlightTitleFont() { return null; }

    public static void setActionTitleFont(Font font) { return null; }

    public static Font actionTitleFont() { return null; }

    public static void setSmallActionTitleFont(Font font) { return null; }

    public static Font smallActionTitleFont() { return null; }

    public static void setSpecialActionTitleFont(Font font) { return null; }

    public static Font specialActionTitleFont() { return null; }

    public static void setSpecialTextOnlyActionTitleFont(Font font) { return null; }

    public static Font specialTextOnlyActionTitleFont() { return null; }

    public static void setUseSpecialColors(boolean flag) { return null; }

    public static boolean useSpecialColors() { return null; }

    public static void setEditableTextBackgroundColor(Color color) { return null; }

    public static Color editableTextBackgroundColor() { return null; }

    public static void setDisabledTextBackgroundColor(Color color) { return null; }

    public static Color disabledTextBackgroundColor() { return null; }

    public static void setQueryTextBackgroundColor(Color color) { return null; }

    public static Color queryTextBackgroundColor() { return null; }

    public static void setLabelColor(Color color) { return null; }

    public static Color labelColor() { return null; }

    public static void setHighlightLabelColor(Color color) { return null; }

    public static Color highlightLabelColor() { return null; }

    public static void setTitleColor(Color color) { return null; }

    public static Color titleColor() { return null; }

    public static void setHighlightTitleColor(Color color) { return null; }

    public static Color highlightTitleColor() { return null; }

    public static void setStandardResourceBundle(ResourceBundle resourceBundle) { return null; }

    public static ResourceBundle standardResourceBundle() { return null; }

    public static String _localizedPatternForClass(Class objectClass) { return null; }

    public static Format _localizedFormatForValueClassName(String className) { return null; }

    public static String _localizedColon() { return null; }

    public static String _localizedQuestionMark() { return null; }

    public static String _localizedDot() { return null; }

    public static String _localizedDots() { return null; }

    public static String _localizedBang() { return null; }

    public static String _localizedOpenBracket() { return null; }

    public static String _localizedCloseBracket() { return null; }

    public static String localizedString(String string) { return null; }

    public static String _localizedStringWithComponentSeparator(String string, String separator) { return null; }

    public static _TitleSet _standardActionTitleSet(String actionName) { return null; }

    public static String _nameForLocalizedIcon(Icon icon) { return null; }

    public static Icon _iconFromURL(String url) { return null; }

    public static Icon localizedIcon(String iconName) { return null; }

    public static Icon standardActionIcon(String actionName) { return null; }

    public static Icon standardSmallActionIcon(String actionName) { return null; }

    public static _IconSet _standardActionIconSet(String actionName) { return null; }

    public static Icon _disabledIcon(ImageIcon icon) { return null; }

    public static Icon _pressedIcon(ImageIcon icon) { return null; }

    public static ImageIcon _transparentIconIfNeeded(ImageIcon icon) { return null; }

    static  {}

    public static final Class _CLASS = null;
    private static final String _actionIconNamePrefix = "ActionIcon";
    private static final String _smallActionIconNamePrefix = "SmallActionIcon";
    private static final String _shortStringPrefix = "SHORT: ";
    private static final String _formatInformationStringPrefix = "FORMAT: ";
    private static final String _formatInformationStringSeparator = ":";
    private static final String _patternInformationStringPrefix = "PATTERN: ";
    public static final String OptimizeForMacKey = "optimizeForMac";
    public static boolean _optimizeForMac;
    public static boolean _developerMode;
    public static boolean _allowMissingPropertiesAndSupercontrollers;
    public static boolean _activateWindowsDelayed;
    public static boolean _useWindowMenus;
    public static boolean _optimizeMenuAccelerators;
    public static boolean _showDefaultDocumentActionsInWindows;
    public static boolean _enableSaveOnlyIfEdited;
    public static int _menuAcceleratorModifierMask;
    public static int _additionalBottomWindowBorder;
    public static boolean _allowActionIcons;
    public static boolean _allowSmallActionIcons;
    public static boolean _makeIconBackgroundsTransparent;
    public static boolean _useBorderWithActionIcons;
    public static boolean _useBorderWithSmallActionIcons;
    public static boolean _useTitleWithActionIcons;
    public static boolean _useTitleWithSmallActionIcons;
    public static int _actionTitlePosition;
    public static int _smallActionTitlePosition;
    public static int _specialActionTitlePosition;
    public static Dimension _minimumActionButtonSize;
    public static Dimension _minimumSmallActionButtonSize;
    public static Dimension _minimumSpecialActionButtonSize;
    public static Insets _defaultWindowInsets;
    public static Insets _defaultTabInsets;
    public static Insets _defaultBoxInsets;
    public static int _smallWidgetMargin;
    public static int _labelDistance;
    public static int _smallToolbarItemDistance;
    public static int _largeToolbarItemDistance;
    public static int _smallBorder;
    public static int _smallBorderSize;
    public static int _mediumBorder;
    public static int _mediumBorderSize;
    public static int _largeBorder;
    public static int _largeBorderSize;
    public static Dimension _largeBorderSizeDimension;
    public static Insets _largeBorderInsets;
    public static boolean _useSpecialFonts;
    public static Font _widgetFont;
    public static Font _labelFont;
    public static Font _highlightLabelFont;
    public static Font _titleFont;
    public static Font _highlightTitleFont;
    public static Font _actionTitleFont;
    public static Font _smallActionTitleFont;
    public static Font _specialActionTitleFont;
    public static Font _specialTextOnlyActionTitleFont;
    public static boolean _useSpecialColors;
    public static Color _textColor;
    public static Color _backgroundColor;
    public static Color _editableTextBackgroundColor;
    public static Color _disabledTextBackgroundColor;
    public static Color _queryTextBackgroundColor;
    public static Color _labelColor;
    public static Color _highlightLabelColor;
    public static Color _titleColor;
    public static Color _highlightTitleColor;
    public static Color _defaultTextBackgroundColor;
    private static ResourceBundle _standardResourceBundle;
    private static NSMutableDictionary _classNameToPatternMapTable;
    private static NSMutableDictionary _valueClassNameToFormatMapTable;
    private static NSMutableDictionary _iconToDisabledIconMapTable;
    private static NSMutableDictionary _iconToPressedIconMapTable;
    private static String _localizedColon;
    private static String _localizedQuestionMark;
    private static String _localizedBang;
    private static String _localizedDot;
    private static String _localizedDots;
    private static String _localizedOpenBracket;
    private static String _localizedCloseBracket;

}
