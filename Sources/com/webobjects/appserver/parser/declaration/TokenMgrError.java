package com.webobjects.appserver.parser.declaration;
/**
 * See Also:Serialized Form
 */
public class TokenMgrError extends java.lang.Error{
    public TokenMgrError(){
         //TODO codavaj!!
    }

    public TokenMgrError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, java.lang.String errorAfter, char curChar, int reason){
         //TODO codavaj!!
    }

    public TokenMgrError(java.lang.String message, int reason){
         //TODO codavaj!!
    }

    /**
     * Replaces unprintable characters by their escaped (or unicode escaped) equivalents in the given string
     */
    protected static final java.lang.String addEscapes(java.lang.String str){
        return null; //TODO codavaj!!
    }

    /**
     * You can also modify the body of this method to customize your error messages. For example, cases like LOOP_DETECTED and INVALID_LEXICAL_STATE are not of end-users concern, so you can return something like : "Internal Error : Please file a bug report .... " from this method for such cases in the release version of your parser.
     */
    public java.lang.String getMessage(){
        return null; //TODO codavaj!!
    }

    /**
     * Returns a detailed message for the Error when it is thrown by the token manager to indicate a lexical error. Parameters : EOFSeen : indicates if EOF caused the lexical error curLexState : lexical state in which this error occurred errorLine : line number when the error occurred errorColumn : column number when the error occurred errorAfter : prefix that was seen before this error occurred curchar : the offending character Note: You can customize the lexical error message by modifying this method.
     */
    protected static java.lang.String LexicalError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, java.lang.String errorAfter, char curChar){
        return null; //TODO codavaj!!
    }

}
