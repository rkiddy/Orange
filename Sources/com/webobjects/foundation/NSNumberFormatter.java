package com.webobjects.foundation;
/**
 * NSNumberFormatter converts between java.lang.Number and textual representations of numeric values. The representation encompasses integers and floating-point numbers; floating-point numbers can be formatted to a specified decimal position. NSNumberFormatters can also impose ranges on the numeric values that can be formatted.
 * You can associate a number pattern with a WOString or WOTextField dynamic element. WebObjects uses an NSNumberFormatter object to perform the appropriate conversions.
 * Instances of NSNumberFormatter are mutable, so caution should be exercised when sharing them.
 * The most common technique for creating an NSNumberFormatter is to use the one-argument constructor, which takes as its argument a string whose contents can be one of the following:
 * As implied in the above list, you're only required to specify a pattern for positive values. If you don't specify a pattern for negative and zero values, a default pattern based on the positive value pattern is . used. For example, if your positive value pattern is #,##0.00 , an input value of 0 will be displayed as 0.00.
 * If you don't specify a pattern for negative values, the pattern specified for positive values is used, preceded by a minus sign (-).
 * If you specify a separate pattern for negative values, its separators should be parallel to those specified in the positive pattern string. In NSNumberFormatter, separators are either enabled or disabled for all patterns -- both negative and positive patterns should therefore use the same approach.
 * As an alternative to using the one-argument constructor is to use the no-argument constructor and invoking setPattern with the pattern. You can also use the setPositivePattern and setNegativePattern methods.
 * Pattern strings can include the following types of characters:
 * Pattern strings can include numeric characters. Wherever a number is included in a pattern string, the number is displayed unless an input character in the same relative position overwrites it. For example, suppose for the positive pattern string 9,990.00, and the value 53.88 is entered into a cell to which the pattern has been applied. The cell would display the value as 9,953.88.
 * Pattern strings can include the period character (.) as a decimal separator, and comma character (,) as a thousand separator. If you want to use different characters as separators, you can set them using the setDecimalSeparator and setThousandSeparator methods.
 * You use the pound sign character (#) to represent numeric characters that will be input by the user. For example, for the positive pattern $#,##0.00, if the characters 76329 were entered into a cell to which the pattern has been applied, they would be displayed as $76,329.00. Strictly speaking, however, you don't need to use placeholders. The format strings ,0.00, #,#0.00, and #,##0.00 are functionally equivalent. In other words, including separator characters in a pattern string signals NSNumberFormatter to use the separators, regardless of whether you use (or where you put) placeholders. The placeholder character's chief virtue lies in its ability to make pattern strings more human-readable, which is especially useful for displaying patterns in the user interface.
 * To include a space in a pattern string, use the underscore character (_). This character inserts a space if no numeric character has been input to occupy that position.
 * The dollar sign character ($) is the canonical currency mark in pattern strings. If the setCurrencySymbol method is used, the new currency symbol will be used whenever the presence of "$" in the pattern string implies the use of a currency symbol. Note that the pattern string itself is not altered by changing the currency symbol.
 * All other characters specified in a pattern string are displayed as typed. The following table shows examples of the how the value 1019.55 is displayed for different positive patterns:
 * NSNumberFormatter supports two different kinds of separators: thousands and decimal. By default these separators are represented by the comma (,) and period (.) characters respectively. The default pattern (#,##0.##) enables them.
 * All of the following statements have the effect of enabling the thousands separator:
 * If you use the statement numberFormatter.setHasThousandSeparators(false), it disables the thousands separator, even if you've set them through another means.
 * Both of the following statements have the effect of enabling decimal separators:
 * When you enable or disable separators, it affects both positive and negative patterns. Consequently, both patterns must use the same separator scheme.
 * You can use the thousandSeparator and decimalSeparator methods to return a string containing the character the receiver uses to represent each separator. However, this shouldn't be taken as an indication of whether separators are enabled. Even when separators are disabled, an NSNumberFormatter still knows the characters it uses to represent separators.
 * Separators must be single characters. If multiple characters are specified in the arguments to setThousandSeparator and setDecimalSeparator, an IllegalArgumentException will be thrown.
 * You can't set the same character to represent thousand and decimal separators. If you try, the two separator characters will be swapped.
 * NSNumberFormatter provides methods to localize pattern strings. You can change the currency symbol, the decimal separator, and the thousands separator manually, or you can trust NSNumberFormatter to do it for you, based on locales. If you enable localization for an instance of NSNumberFormatter, it will check the current locale and localize pattern strings appropriately for that locale. By default, instances of NSNumberFormatter are not localized. You can enable localization for all new instances of NSNumberFormatter using setDefaultLocalizesPattern or for a specific instance of NSNumberFormatter using setLocalizesPattern.
 * The following code excerpt shows the three different approaches for setting an NSNumberFormatter object's format using setPattern:
 * blockquote NSNumberFormatter numberFormatter = new NSNumberFormatter(); // specify just positive format numberFormatter.setPattern($#,##0.00); // specify positive and negative formats numberFormatter.setPattern($#,##0.00;($#,##0.00)); // specify positive, zero, and negative formats numberFormatter.setFormat($#,###.00;0.00;($#,##0.00)); /blockquote
 * See Also:Format, NSNumberFormatter.thousandSeparator(), NSNumberFormatter.decimalSeparator(), NSNumberFormatter.roundingBehavior(), NSNumberFormatter.setPattern(java.lang.String), NSNumberFormatter.setNegativePattern(java.lang.String), NSNumberFormatter.setPositivePattern(java.lang.String), NSNumberFormatter.setThousandSeparator(java.lang.String), NSNumberFormatter.setDecimalSeparator(java.lang.String), NSNumberFormatter.setThousandSeparator(java.lang.String), NSNumberFormatter.setDecimalSeparator(java.lang.String), NSNumberFormatter.setDefaultLocalizesPattern(boolean), NSNumberFormatter.setLocalizesPattern(boolean), NSNumberFormatter.setRoundingBehavior(int), Serialized Form
 */
public class NSNumberFormatter extends java.text.Format{
    /**
     * The default pattern string used by the no-argument constructor: #,##0
     * ##.
     * See Also:NSNumberFormatter.roundingBehavior(), NSNumberFormatter.setRoundingBehavior(int), Constant Field Values
     */
    public static final java.lang.String DefaultPattern="#,##0.##";

    /**
     * The constant BigDecimal object as a place holder for all numbers incapable of being represented as real numbers (NaN).
     * See Also:NSNumberFormatter.roundingBehavior(), NSNumberFormatter.setRoundingBehavior(int)
     */
    public static final java.math.BigDecimal NSDecimalNotANumber=null;

    /**
     * Rounding mode : Bankers. Equivalent to BigDecimal.ROUND_HALF_EVEN.
     * See Also:NSNumberFormatter.roundingBehavior(), NSNumberFormatter.setRoundingBehavior(int), Constant Field Values
     */
    public static final int RoundBankers=6;

    /**
     * Rounding mode : Down. Equivalent to BigDecimal.ROUND_FLOOR.
     * See Also:NSNumberFormatter.roundingBehavior(), NSNumberFormatter.setRoundingBehavior(int), Constant Field Values
     */
    public static final int RoundDown=3;

    /**
     * Rounding mode : Plain. The default. Equivalent to BigDecimal.ROUND_HALF_UP.
     * See Also:NSNumberFormatter.roundingBehavior(), NSNumberFormatter.setRoundingBehavior(int), Constant Field Values
     */
    public static final int RoundPlain=4;

    /**
     * Rounding mode : Up. Equivalent to BigDecimal.ROUND_CEILING.
     * See Also:NSNumberFormatter.roundingBehavior(), NSNumberFormatter.setRoundingBehavior(int), Constant Field Values
     */
    public static final int RoundUp=2;

    /**
     * Creates an NSNumberFormatter and sets its pattern to the default pattern.
     * See Also:NSNumberFormatter.DefaultPattern
     */
    public NSNumberFormatter(){
         //TODO codavaj!!
    }

    /**
     * Creates an NSFormatter and sets its pattern to pattern.
     * Parameters:pattern - the format string Throws: java.lang.IllegalArgumentException - if the pattern is invalidSee Also:NSNumberFormatter.setPattern(java.lang.String)
     */
    public NSNumberFormatter(java.lang.String pattern){
         //TODO codavaj!!
    }

    /**
     * Indicates whether this NSNumberFormatter allows floating-point values as input. By default, floating-point values are allowed.
     */
    public boolean allowsFloats(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String attributedStringForNil(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String attributedStringForNotANumber(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String attributedStringForZero(){
        return null; //TODO codavaj!!
    }

    public static java.util.Locale[] availableLocales(){
        return null; //TODO codavaj!!
    }

    public java.lang.String currencySymbol(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the current decimal separator character as a String. The default is "."
     */
    public java.lang.String decimalSeparator(){
        return null; //TODO codavaj!!
    }

    public static java.util.Locale defaultLocale(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns true to indicate that the pattern will be localized for all new instances of NSNumberFormatter in your application. By default, patterns are not localized.
     */
    public static boolean defaultLocalizesPattern(){
        return false; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String format(){
        return null; //TODO codavaj!!
    }

    /**
     * Formats obj to produce a string, appends the string to toAppendTo, and returns the resulting StringBuffer. The pos parameter specifies an alignment field to place the formatted object. When the method returns, this parameter contains the position of the alignment field.
     */
    public java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos){
        return null; //TODO codavaj!!
    }

    /**
     * Indicates whether this NSNumberFormatter's format includes a thousands separator.
     */
    public boolean hasThousandSeparators(){
        return false; //TODO codavaj!!
    }

    public java.util.Locale locale(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public boolean localizesFormat(){
        return false; //TODO codavaj!!
    }

    /**
     * Indicates whether this NSNumberFormatter's pattern is localized. By default, instances of NSNumberFormatter are not localized.
     */
    public boolean localizesPattern(){
        return false; //TODO codavaj!!
    }

    /**
     * The default, no maximal value, is represented with the constant NSDecimalNotANumber.
     */
    public java.math.BigDecimal maximum(){
        return null; //TODO codavaj!!
    }

    /**
     * The default, no minimum value, is represented with the constant NSDecimalNotANumber.
     */
    public java.math.BigDecimal minimum(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String negativeFormat(){
        return null; //TODO codavaj!!
    }

    public java.lang.String negativePattern(){
        return null; //TODO codavaj!!
    }

    /**
     * Converts a string to a java.lang.Number using this NSNumberFormatter's pattern. This method is equivalent to java.Text.Format.parseObject
     */
    public java.lang.Object objectValueForString(java.lang.String inString) throws java.text.ParseException{
        return null; //TODO codavaj!!
    }

    /**
     * Parses a string to produce an object.
     */
    public java.lang.Object parseObject(java.lang.String source) throws java.text.ParseException{
        return null; //TODO codavaj!!
    }

    /**
     * Parses a string using the current pattern to produce a Number object.
     */
    public java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition status){
        return null; //TODO codavaj!!
    }

    public java.lang.String pattern(){
        return null; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public java.lang.String positiveFormat(){
        return null; //TODO codavaj!!
    }

    public java.lang.String positivePattern(){
        return null; //TODO codavaj!!
    }

    /**
     * Provides the rounding behavior that this NSNumberFormatter uses. The possible values are listed in the See Also section.
     */
    public int roundingBehavior(){
        return 0; //TODO codavaj!!
    }

    /**
     * Sets whether this NSNumberFormatter allows as input floating-point values (that is, values that include the decimal-separator character). By default, floating-point values are allowed as input.
     */
    public void setAllowsFloats(boolean allowsRealNumbers){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setAttributedStringForNil(java.lang.String newString){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setAttributedStringForNotANumber(java.lang.String newString){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setAttributedStringForZero(java.lang.String newString){
        return; //TODO codavaj!!
    }

    /**
     * Sets the string this NSNumberFormatter uses to represent currency. The pattern string itself remains unchanged. The currency symbol is used instead of "$" whenever the pattern string implies a "$" should be used while formatting numbers.
     */
    public void setCurrencySymbol(java.lang.String newSymbol){
        return; //TODO codavaj!!
    }

    /**
     * Sets the first character of newSeparator as the decimal separator for this NSNumberFormatter If newSeparator is the current thousands' separator for this formatter, the thousands' separator and the decimal separator are swapped.
     */
    public void setDecimalSeparator(java.lang.String newSeparator){
        return; //TODO codavaj!!
    }

    /**
     * Sets the default locale of this NSNumberFormatter.
     */
    public static void setDefaultLocale(java.util.Locale newLocale){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether all new NSNumberFormatter instances should localize their patterns based on the locale. The NSNumberFormatter factory will choose the appropriate currency symbol, decimal separator, thousands separator, string for zero, and string for NaN based on locale. By default, NSNumberFormatters are not localized.
     */
    public static void setDefaultLocalizesPattern(boolean newDefault){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setFormat(java.lang.String pattern){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether this NSNumberFormatter uses a thousands separator. When newThousandsUsage is false, the thousands separator is disabled for both positive and negative formats (even if it is set through other means, such as setPattern). When newThousandsUsage is true, a thousands separator is used.
     */
    public void setHasThousandSeparators(boolean newThousandsUsage){
        return; //TODO codavaj!!
    }

    /**
     * Sets the locale of this NSNumberFormatter. The locale does not have an active effect on the formatter until setLocalizesPattern(true) is invoked.
     */
    public void setLocale(java.util.Locale newLocale){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setLocalizesFormat(boolean doLocalization){
        return; //TODO codavaj!!
    }

    /**
     * Sets whether this NSNumberFormatter's pattern should be localized. When newDefault is true, NSNumberFormatter chooses the appropriate currency symbol, thousands separator, string for zero, and string for NaN based on locale By default, NSNumberFormatters are not localized.
     */
    public void setLocalizesPattern(boolean newDefault){
        return; //TODO codavaj!!
    }

    /**
     * Sets the highest number this NSNumberFormatter allows as input. The default, no maximal value, is represented with the constant NSDecimalNotANumber.
     */
    public void setMaximum(java.math.BigDecimal newMaximum){
        return; //TODO codavaj!!
    }

    /**
     * Sets the minimum number this NSNumberFormatter allows as input. The default, no minimum value, is represented with the constant NSDecimalNotANumber.
     */
    public void setMinimum(java.math.BigDecimal newMinimum){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     * Use setNegativePattern instead.
     */
    public void setNegativeFormat(java.lang.String pattern){
        return; //TODO codavaj!!
    }

    /**
     * Sets the pattern this NSNumberFormatter uses to display negative numbers.
     */
    public void setNegativePattern(java.lang.String pattern){
        return; //TODO codavaj!!
    }

    /**
     * Sets this NSNumberFormatter's pattern. This pattern can consist of one, two, or three parts separated by
     * ;
     * . The first part of the string represents the positive pattern, the second part of the string represents the zero value, and the last part of the string represents the negative pattern. If the string has just two parts, the first one becomes the positive pattern, and the second one becomes the negative pattern. If the string has just one part, it becomes the positive pattern, and default formats are provided for zero and negative values based on the positive format. The following code excerpt shows the three different approaches for setting an NSNumberFormatter object's format using setPattern: NSNumberFormatter numberFormatter = new NSNumberFormatter(); numberFormatter.setPattern(
     * $#,##0.00
     * ); // specify just positive format numberFormatter.setPattern(
     * $#,##0.00;($#,##0.00)
     * ); // specify positive and negative formats numberFormatter.setPattern(
     * $#,###.00;0.00;($#,##0.00)
     * ); // specify positive, zero, and negative formats
     */
    public void setPattern(java.lang.String pattern){
        return; //TODO codavaj!!
    }

    /**
     * Deprecated.
     */
    public void setPositiveFormat(java.lang.String pattern){
        return; //TODO codavaj!!
    }

    /**
     * Sets the pattern this NSNumberFormatter uses to display positive numbers.
     */
    public void setPositivePattern(java.lang.String pattern){
        return; //TODO codavaj!!
    }

    /**
     * Sets this NSNumberFormatter's rounding behavior.
     */
    public void setRoundingBehavior(int newBehavior){
        return; //TODO codavaj!!
    }

    /**
     * Sets the string this NSNumberFormatter uses to display values that are incapable of being displayed as real numbers.
     * NSNumberFormatters use the constant NSDecimalNotANumber to represent such numbers. NSDecimalNotANumber is a java.math.BigDecimal object.
     * By default, imaginary numbers are represented with the string "NaN".
     */
    public void setStringForNotANumber(java.lang.String newString){
        return; //TODO codavaj!!
    }

    /**
     * Sets the string this NSNumberFormatter uses to represent null values.
     */
    public void setStringForNull(java.lang.String newString){
        return; //TODO codavaj!!
    }

    /**
     * Sets the string this NSNumberFormatter uses to display zero values.
     */
    public void setStringForZero(java.lang.String newString){
        return; //TODO codavaj!!
    }

    /**
     * Sets the first character of newSeparator as the thousands separator for this NSNumberFormatter If newSeparator is the current decimal separator for this formatter, the thousands' separator and the decimal separator are swapped. If using the thousands separator is disabled through any other means (such as setPattern), using this method enables them.
     */
    public void setThousandSeparator(java.lang.String newSeparator){
        return; //TODO codavaj!!
    }

    /**
     * Returns the string this NSNumberFormatter displays for numeric values incapable of being displayed as real numbers.
     * NSNumberFormatters use the constant NSDecimalNotANumber to represent such numbers as BigDecimals.
     */
    public java.lang.String stringForNotANumber(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns the string this NSNumberFormatter uses to display null values. By default, null values are displayed as an empty string.
     */
    public java.lang.String stringForNull(){
        return null; //TODO codavaj!!
    }

    /**
     * Formats an object into a string using this NSNumberFormatter's pattern. This method is equivalent to java.text.Format.format
     */
    public java.lang.String stringForObjectValue(java.lang.Object inNumber) throws java.lang.IllegalArgumentException{
        return null; //TODO codavaj!!
    }

    /**
     * Returns the zero-value string. By default zero values are displayed according to the format specified for positive values.
     */
    public java.lang.String stringForZero(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a string containing the single character this NSNumberFormatter uses to represent the thousands separator. By default, the thousands separator is the comma character (,). Note that the return value doesn't indicate whether the thousands separator is enabled.
     */
    public java.lang.String thousandSeparator(){
        return null; //TODO codavaj!!
    }

}
