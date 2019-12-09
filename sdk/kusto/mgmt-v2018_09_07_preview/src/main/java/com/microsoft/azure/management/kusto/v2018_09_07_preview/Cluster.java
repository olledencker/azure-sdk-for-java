/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation.KustoManager;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation.AzureSkuInner;
import java.util.List;
import com.microsoft.azure.management.kusto.v2018_09_07_preview.implementation.ClusterInner;

/**
 * Type representing Cluster.
 */
public interface Cluster extends HasInner<ClusterInner>, Resource, GroupableResourceCore<KustoManager, ClusterInner>, HasResourceGroup, Refreshable<Cluster>, Updatable<Cluster.Update>, HasManager<KustoManager> {
    /**
     * @return the dataIngestionUri value.
     */
    String dataIngestionUri();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the sku value.
     */
    AzureSku sku();

    /**
     * @return the state value.
     */
    State state();

    /**
     * @return the trustedExternalTenants value.
     */
    List<TrustedExternalTenant> trustedExternalTenants();

    /**
     * @return the uri value.
     */
    String uri();

    /**
     * The entirety of the Cluster definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Cluster definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Cluster definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Cluster definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithSku> {
        }

        /**
         * The stage of the cluster definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku The SKU of the cluster
            * @return the next definition stage
*/
            WithCreate withSku(AzureSkuInner sku);
        }

        /**
         * The stage of the cluster definition allowing to specify TrustedExternalTenants.
         */
        interface WithTrustedExternalTenants {
            /**
             * Specifies trustedExternalTenants.
             * @param trustedExternalTenants The cluster's external tenants
             * @return the next definition stage
             */
            WithCreate withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Cluster>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithTrustedExternalTenants {
        }
    }
    /**
     * The template for a Cluster update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Cluster>, Resource.UpdateWithTags<Update>, UpdateStages.WithSku, UpdateStages.WithTrustedExternalTenants {
    }

    /**
     * Grouping of Cluster update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cluster update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU of the cluster
             * @return the next update stage
             */
            Update withSku(AzureSkuInner sku);
        }

        /**
         * The stage of the cluster update allowing to specify TrustedExternalTenants.
         */
        interface WithTrustedExternalTenants {
            /**
             * Specifies trustedExternalTenants.
             * @param trustedExternalTenants The cluster's external tenants
             * @return the next update stage
             */
            Update withTrustedExternalTenants(List<TrustedExternalTenant> trustedExternalTenants);
        }

    }
}