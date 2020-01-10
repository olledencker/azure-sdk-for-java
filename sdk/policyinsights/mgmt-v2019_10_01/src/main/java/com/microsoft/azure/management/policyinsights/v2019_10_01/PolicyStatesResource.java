/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PolicyStatesResource.
 */
public final class PolicyStatesResource extends ExpandableStringEnum<PolicyStatesResource> {
    /** Static value default for PolicyStatesResource. */
    public static final PolicyStatesResource DEFAULT = fromString("default");

    /** Static value latest for PolicyStatesResource. */
    public static final PolicyStatesResource LATEST = fromString("latest");

    /**
     * Creates or finds a PolicyStatesResource from its string representation.
     * @param name a name to look for
     * @return the corresponding PolicyStatesResource
     */
    @JsonCreator
    public static PolicyStatesResource fromString(String name) {
        return fromString(name, PolicyStatesResource.class);
    }

    /**
     * @return known PolicyStatesResource values
     */
    public static Collection<PolicyStatesResource> values() {
        return values(PolicyStatesResource.class);
    }
}