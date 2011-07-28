
package com.webobjects.eoapplication;

import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation._NSUtilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


public class EODialogs {
    private static class _StringInputHandler {
        public class _OperationListener
            implements ActionListener {


            public _OperationListener(int operation) { return null; }

            public void actionPerformed(ActionEvent event) {}

            private int _listenerOperation;
            final _StringInputHandler this$0;

        }

        public class _DocumentListener
            implements DocumentListener {


            public _DocumentListener() { return null; }

            public void _updateEnabling() {}

            public void changedUpdate(DocumentEvent event) {}

            public void insertUpdate(DocumentEvent event) {}

            public void removeUpdate(DocumentEvent event) {}

            final _StringInputHandler this$0;

        }



        public _StringInputHandler(String suggestedValue, String defaultsIdentifier, boolean allowEmptyString, int validationStrategy) { return null; }

        private void _runDialog(String title, String message, String operation, String optionalOperation, String alternateOperation, int minimumInputFieldWidth) {}

        public String value(String title, String message, String operation, String alternateOperation, int minimumInputFieldWidth) { return null; }

        public _InputData inputData(String title, String message, String operation, String optionalOperation, int minimumInputFieldWidth) { return null; }

        static JTextField access$000(_StringInputHandler x0) { return null; }

        static boolean access$100(_StringInputHandler x0) { return true; }

        static int access$200(_StringInputHandler x0) { return 0; }

        static JButton access$300(_StringInputHandler x0) { return null; }

        static JButton access$400(_StringInputHandler x0) { return null; }

        static JLabel access$500(_StringInputHandler x0) { return null; }

        static String access$602(_StringInputHandler x0, String x1) { return null; }

        static int access$702(_StringInputHandler x0, int x1) { return 0; }

        static JDialog access$800(_StringInputHandler x0) { return null; }

        private String _defaultsIdentifier;
        private String _suggestedValue;
        private boolean _allowEmptyString;
        private int _validationStrategy;
        private String _value;
        private int _operation;
        private JDialog _dialog;
        private JTextField _textField;
        private JButton _operationButton;
        private JButton _optionalOperationButton;
        private JButton _alternateOperationButton;
        private JLabel _invalidWarningField;


        static JTextField access$000(_StringInputHandler x0) { return null; }

        static boolean access$100(_StringInputHandler x0) { return true; }

        static int access$200(_StringInputHandler x0) { return 0; }

        static JButton access$300(_StringInputHandler x0) { return null; }

        static JButton access$400(_StringInputHandler x0) { return null; }

        static JLabel access$500(_StringInputHandler x0) { return null; }

        static String access$602(_StringInputHandler x0, String x1) { return null; }

        static int access$702(_StringInputHandler x0, int x1) { return 0; }

        static JDialog access$800(_StringInputHandler x0) { return null; }
    }

    public static class _InputData {


        public _InputData(String value, int operation) { return null; }

        public String value() { return null; }

        public int operation() { return 0; }

        private String _value;
        private int _operation;

    }



    public EODialogs() { return null; }

    private static int _runOptionsDialog(JOptionPane optionPane, String title, Object options[], int values[]) { return null; }

    public static int runChooseOperationDialog(String title, String message, String defaultOperation, String optionalOperation) { return null; }

    public static boolean runConfirmOperationDialog(String title, String message, String operation) { return null; }

    public static boolean runConfirmOperationDialog(String title, String message, String operation, String alternateOperation) { return null; }

    public static void runInformationDialog(String title, String message) { return null; }

    public static void runErrorDialog(String title, String message) { return null; }

    public static String runStringInputDialog(String title, String message, String operation, String alternateOperation, int minimumInputFieldWidth, String suggestedValue, String defaultsIdentifier, boolean allowEmptyString, 
            int validationStrategy) { return null; }

    public static _InputData _runChooseStringInputDialog(String title, String message, String operation, String optionalOperation, int minimumInputFieldWidth, String suggestedValue, String defaultsIdentifier, boolean allowEmptyString, 
            int validationStrategy) { return null; }

    static  {}

    public static final Class _CLASS;
    public static final int DefaultOperation = 0;
    public static final int OptionalOperation = 1;
    public static final int CancelOperation = 2;
    public static final int AnyValueAllowed = 0;
    public static final int NoWhitespaceAllowed = 1;
    public static final int OnlyJavaIdentifiersAllowed = 2;

}
