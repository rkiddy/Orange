package com.webobjects.eoapplication;
/**
 * The EODialogs class offers several static methods which can be used to run alert panels and dialogs.
 */
public class EODialogs{
    public static final int AnyValueAllowed=0;

    public static final int CancelOperation=2;

    public static final int DefaultOperation=0;

    public static final int NoWhitespaceAllowed=1;

    public static final int OnlyJavaIdentifiersAllowed=2;

    public static final int OptionalOperation=1;

    public EODialogs(){
         //TODO codavaj!!
    }

    /**
     * Shows a panel with the title title and the message message. The user has three choices: The default choice described by defaultOperation, a second option by optionalOperation, and the third choice is "Cancel" (a localized string). If title is not specified, "Alert" (localized) is used.
     * Returns EODialogs.DefaultOperation if the user chooses the default operation, EODialogs.OptionalOperation if the user chooses the second option, and EODialogs.CancelOperation if the user chooses the "Cancel" option.
     */
    public static int runChooseOperationDialog(java.lang.String title, java.lang.String message, java.lang.String defaultOperation, java.lang.String optionalOperation){
        return 0; //TODO codavaj!!
    }

    /**
     * Shows a panel with the title title and the message message. The user has two choices: The default choice described by operation, and the second choice is "Cancel" (a localized string). If title is not specified, "Alert" (localized) is used. Returns true if the user chooses the default operation, and false if the user chooses the "Cancel" option. You typically use this method for dialogs of the type "Do you really want to perform this operation?"
     */
    public static boolean runConfirmOperationDialog(java.lang.String title, java.lang.String message, java.lang.String operation){
        return false; //TODO codavaj!!
    }

    /**
     * Shows a panel with the title title and the message message. The user has two choices: The default choice described by operation, and the second choice described by alternateOperation (and defaults to a "Cancel" (a localized string) operation if not specified). If title is not specified, "Alert" (localized) is used. Returns true if the user chooses the default operation, and false if the user chooses the alternate ("Cancel") option. You typically use this method for "Do Something/Don't Something" dialogs.
     */
    public static boolean runConfirmOperationDialog(java.lang.String title, java.lang.String message, java.lang.String operation, java.lang.String alternateOperation){
        return false; //TODO codavaj!!
    }

    /**
     * Shows an error panel with the title title and the message message. The user confirms the dialog with an "Ok" button. If title is not specified, "Error" (localized) is used.
     */
    public static void runErrorDialog(java.lang.String title, java.lang.String message){
        return; //TODO codavaj!!
    }

    /**
     * Shows an information panel with the title title and the message message. The user confirms the dialog with an "Ok" button. If title is not specified, "Information" (localized) is used.
     */
    public static void runInformationDialog(java.lang.String title, java.lang.String message){
        return; //TODO codavaj!!
    }

    public static java.lang.String runStringInputDialog(java.lang.String title, java.lang.String message, java.lang.String operation, java.lang.String alternateOperation, int minimumInputFieldWidth, java.lang.String suggestedValue, java.lang.String defaultsIdentifier, boolean allowEmptyString, int validationStrategy){
        return null; //TODO codavaj!!
    }

}
