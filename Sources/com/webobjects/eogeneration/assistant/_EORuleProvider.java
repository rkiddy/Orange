
package com.webobjects.eogeneration.assistant;

import com.webobjects.appserver.WOSession;
import com.webobjects.eogeneration.rules.*;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;


public class _EORuleProvider
    implements EOAssistant._RuleProvider {

    public _EORuleProvider() { return null; }

    private boolean _assistantEnabled() { return true; }

    public void revertRules() {}

    public void saveRuleDescriptions(NSArray ruleDescriptions) {}

    public void applyRuleDescriptions(NSArray ruleDescriptions) {}

    public NSArray ruleDescriptions() { return null; }

    public Object defaultValue(String key, NSDictionary specification) { return null; }

    public NSArray allEntityNames() { return null; }

    public NSArray allPossibleValuesForKey(String key) { return null; }
}
