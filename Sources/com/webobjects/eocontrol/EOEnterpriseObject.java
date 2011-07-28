
package com.webobjects.eocontrol;

import com.webobjects.foundation.*;
import java.io.Serializable;


public interface EOEnterpriseObject
    extends Serializable, EOKeyValueCodingAdditions, EORelationshipManipulation, EOValidation, EODeferredFaulting {


    public abstract EOEditingContext editingContext();

    public abstract void willChange();

    public abstract EOClassDescription classDescription();

    public abstract String entityName();

    public abstract NSArray attributeKeys();

    public abstract NSArray toOneRelationshipKeys();

    public abstract NSArray toManyRelationshipKeys();

    public abstract String inverseForRelationshipKey(String s);

    public abstract int deleteRuleForRelationshipKey(String s);

    public abstract boolean ownsDestinationObjectsForRelationshipKey(String s);

    public abstract EOClassDescription classDescriptionForDestinationKey(String s);

    public abstract void awakeFromInsertion(EOEditingContext eoeditingcontext);

    public abstract void awakeFromFetch(EOEditingContext eoeditingcontext);

    public abstract NSDictionary snapshot();

    public abstract void updateFromSnapshot(NSDictionary nsdictionary);

    public abstract NSDictionary changesFromSnapshot(NSDictionary nsdictionary);

    public abstract void reapplyChangesFromDictionary(NSDictionary nsdictionary);

    public abstract boolean isToManyKey(String s);

    public abstract NSArray allPropertyKeys();

    public abstract void clearProperties();

    public abstract void propagateDeleteWithEditingContext(EOEditingContext eoeditingcontext);

    public abstract String userPresentableDescription();

    public abstract String eoShallowDescription();

    public abstract String eoDescription();

    public abstract Object invokeRemoteMethod(String s, Class aclass[], Object aobj[]);

    public abstract void prepareValuesForClient();

    public abstract void awakeFromClientUpdate(EOEditingContext eoeditingcontext);

    public abstract Object opaqueState();

    public abstract boolean isReadOnly();



    public static final Class _CLASS = null;

}
