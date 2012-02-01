package com.webobjects.appserver.parser.declaration;
/**
 * This exception is thrown when parse errors are encountered. You can explicitly create objects of this exception type by calling the method generateParseException in the generated parser. You can modify this class to customize your error reporting mechanisms so long as you retain the public fields.
 * See Also:Serialized Form
 */
public class ParseException extends java.lang.Exception{
    /**
     * This is the last token that has been consumed successfully. If this object has been created due to a parse error, the token followng this token will (therefore) be the first error token.
     */
    public com.webobjects.appserver.parser.declaration.Token currentToken;

    /**
     * The end of line string for this machine.
     */
    protected java.lang.String eol;

    /**
     * Each entry in this array is an array of integers. Each array of integers represents a sequence of tokens (by their ordinal values) that is expected at this point of the parse.
     */
    public int[][] expectedTokenSequences;

    /**
     * This variable determines which constructor was used to create this object and thereby affects the semantics of the "getMessage" method (see below).
     */
    protected boolean specialConstructor;

    /**
     * This is a reference to the "tokenImage" array of the generated parser within which the parse error occurred. This array is defined in the generated ...Constants interface.
     */
    public java.lang.String[] tokenImage;

    /**
     * The following constructors are for use by you for whatever purpose you can think of. Constructing the exception in this manner makes the exception behave in the normal way - i.e., as documented in the class "Throwable". The fields "errorToken", "expectedTokenSequences", and "tokenImage" do not contain relevant information. The JavaCC generated code does not use these constructors.
     */
    public ParseException(){
         //TODO codavaj!!
    }

    public ParseException(java.lang.String message){
         //TODO codavaj!!
    }

    /**
     * This constructor is used by the method "generateParseException" in the generated parser. Calling this constructor generates a new object of this type with the fields "currentToken", "expectedTokenSequences", and "tokenImage" set. The boolean flag "specialConstructor" is also set to true to indicate that this constructor was used to create this object. This constructor calls its super class with the empty string to force the "toString" method of parent class "Throwable" to print the error message in the form: ParseException:
     */
    public ParseException(com.webobjects.appserver.parser.declaration.Token currentTokenVal, int[][] expectedTokenSequencesVal, java.lang.String[] tokenImageVal){
         //TODO codavaj!!
    }

    /**
     * Used to convert raw characters to their escaped version when these raw version cannot be used as part of an ASCII string literal.
     */
    protected java.lang.String add_escapes(java.lang.String str){
        return null; //TODO codavaj!!
    }

    /**
     * This method has the standard behavior when this object has been created using the standard constructors. Otherwise, it uses "currentToken" and "expectedTokenSequences" to generate a parse error message and returns it. If this object has been created due to a parse error, and you do not catch it (it gets thrown from the parser), then this method is called during the printing of the final stack trace, and hence the correct error message gets displayed.
     */
    public java.lang.String getMessage(){
        return null; //TODO codavaj!!
    }

}
