
package com.webobjects.webservices.generation._private;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.foundation.*;
import com.webobjects.webservices.generation.WOOperation;
import com.webobjects.webservices.generation._WSRuleUtilities;
import java.util.Hashtable;

public class WOWSDLTemplate extends WOComponent {


    public WOWSDLTemplate(WOContext context) { return null; }

    public WOResponse generateResponse() { return null; }

    private NSDictionary _contentDictionaryForString(String contentString) { return null; }

    public String _contentForElementName(String content, String name, boolean includeElement) { return null; }

    public String namespaceString() { return null; }

    public void setNamespaceString(String newString) {}

    public NSArray inputPartNames() { return null; }

    public void setInputPartNames(NSArray newInputPartNames) {}

    public String xmlVersionString() { return null; }

    public String xsdURIString() { return null; }

    public String serviceName() { return null; }

    public void setServiceName(String newServiceName) {}

    public String requiresSession() { return null; }

    public void setRequiresSession(String newRequiresSession) {}

    public String partName() { return null; }

    public void setPartName(String newInputPartName) {}

    public NSArray outputPartNames() { return null; }

    public void setOutputPartNames(NSArray newOutputPartNames) {}

    public String outputPartName() { return null; }

    public void setOutputPartName(String newOutputPartName) {}

    public D2WContext d2wContext() { return null; }

    public void setD2wContext(D2WContext newd2wContext) {}

    public String definitionName() { return null; }

    public String wsdlTargetNamespace() { return null; }

    public NSArray operationNames() { return null; }

    public void setOperationNames(NSArray newOperationNames) {}

    public String operationName() { return null; }

    public void setOperationName(String newOperationName) {}

    public String operationResultElementName() { return null; }

    public void setOperationResultElementName(String newOperationResultElementName) {}

    public String operationInputName() { return null; }

    public void setOperationInputName(String newOperationInputName) {}

    public String operationOutputName() { return null; }

    public void setOperationOutputName(String newOperationOutputName) {}

    public String resultElementString() { return null; }

    public void setResultElementString(String newResultElementString) {}

    public String operationRequestElementName() { return null; }

    public String requestElementString() { return null; }

    public void setRequestElementString(String newRequestElementString) {}

    public String servicePortType() { return null; }

    public String tnsServicePortType() { return null; }

    public String serviceSoapBindingString() { return null; }

    public String tnsOperationInput() { return null; }

    public String tnsOperationOutput() { return null; }

    public String servicePortName() { return null; }

    public String tnsServiceSoapBindingString() { return null; }

    public String serviceLocationURL() { return null; }

    public String operationTypesSchema() { return null; }

    public String operationMessageDeclarations() { return null; }

    public String portTypeDeclaration() { return null; }

    public String bindingDeclaration() { return null; }

    private static final long serialVersionUID = 0x574aad2fL;
    static final String _MessageDeclarationKey = "message";
    static final String _PortTypeDeclarationKey = "portType";
    static final String _BindingDeclarationKey = "binding";
    static final String _BindingOperationDeclarationKey = "operation";
    static final String _TypesDeclarationKey = "types";
    protected NSArray inputPartNames;
    protected D2WContext d2wContext;
    protected NSArray outputPartNames;
    protected String partName;
    protected String serviceName;
    protected String requiresSession;
    protected String outputPartName;
    protected String definitionName;
    protected String operationRequestElementName;
    protected String wsdlTargetNamespace;
    private static final String xmlVersionString = "<?xml version=\"1.0\"?>";
    private static final String xmlURIString = "\"http://www.w3.org/2001/XMLSchema\"";
    protected NSArray operationNames;
    protected String operationName;
    protected String operationResultElementName;
    protected String operationInputName;
    protected String operationOutputName;
    protected String resultElementString;
    protected String requestElementString;
    protected String serviceLocationURL;
    protected String operationTypesSchema;
    protected String frozenPortType;
    protected String frozenOperationMessageDeclarations;
    protected NSDictionary _wsdlMap;
    protected String namespaceString;
    protected String definitionAttributes;

}
