
package com.webobjects.webservices.generation;

import com.webobjects.appserver.*;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.webservices.support.xml.WOSoapConstants;


public class WOOperationWSDLTemplate extends WOComponent {


    public WOOperationWSDLTemplate(WOContext context) { return null; }

    public D2WContext d2wContext() { return null; }

    public void setD2wContext(D2WContext context) {}

    public String operationTypesSchema() { return null; }

    public void setOperationTypesSchema(String newOperationTypesSchema) {}

    public String otherNamespaces() { return null; }

    public void setOtherNamespaces(String newOtherNamespaces) {}

    public String serviceLocationURL() { return null; }

    public void setServiceLocationURL(String newServiceLocationURL) {}

    public String targetNamespace() { return null; }

    public void setTargetNamespace(String newTargetNamespace) {}

    public String operationName() { return null; }

    public void setOperationName(String newOperationName) {}

    public NSArray inputPartNames() { return null; }

    public void setInputPartNames(NSArray names) {}

    public String operationInputName() { return null; }

    public String operationOutputName() { return null; }

    public String tnsOperationInputName() { return null; }

    public String tnsOperationOutputName() { return null; }

    public String partType() { return null; }

    public String parameterOrder() { return null; }

    public String partName() { return null; }

    public void setPartName(String newPartName) {}

    private static final long serialVersionUID = 0x222911a2L;
    protected D2WContext _d2wContext;
    protected String _operationTypesSchema;
    protected NSArray _inputPartNames;
    protected String _serviceLocationURL;
    protected String _otherNamespaces;
    protected String _targetNamespace;
    protected String _operationName;
    protected String _partName;

}
