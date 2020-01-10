/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ManagedDatabaseSecurityAlertPolicies.
 */
public class ManagedDatabaseSecurityAlertPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private ManagedDatabaseSecurityAlertPoliciesService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedDatabaseSecurityAlertPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ManagedDatabaseSecurityAlertPoliciesInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(ManagedDatabaseSecurityAlertPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ManagedDatabaseSecurityAlertPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagedDatabaseSecurityAlertPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseSecurityAlertPolicies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/securityAlertPolicies/{securityAlertPolicyName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("databaseName") String databaseName, @Path("securityAlertPolicyName") String securityAlertPolicyName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseSecurityAlertPolicies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/securityAlertPolicies/{securityAlertPolicyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("databaseName") String databaseName, @Path("securityAlertPolicyName") String securityAlertPolicyName, @Path("subscriptionId") String subscriptionId, @Body ManagedDatabaseSecurityAlertPolicyInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseSecurityAlertPolicies listByDatabase" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/databases/{databaseName}/securityAlertPolicies")
        Observable<Response<ResponseBody>> listByDatabase(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("databaseName") String databaseName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseSecurityAlertPolicies listByDatabaseNext" })
        @GET
        Observable<Response<ResponseBody>> listByDatabaseNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a managed database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagedDatabaseSecurityAlertPolicyInner object if successful.
     */
    public ManagedDatabaseSecurityAlertPolicyInner get(String resourceGroupName, String managedInstanceName, String databaseName) {
        return getWithServiceResponseAsync(resourceGroupName, managedInstanceName, databaseName).toBlocking().single().body();
    }

    /**
     * Gets a managed database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagedDatabaseSecurityAlertPolicyInner> getAsync(String resourceGroupName, String managedInstanceName, String databaseName, final ServiceCallback<ManagedDatabaseSecurityAlertPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, managedInstanceName, databaseName), serviceCallback);
    }

    /**
     * Gets a managed database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedDatabaseSecurityAlertPolicyInner object
     */
    public Observable<ManagedDatabaseSecurityAlertPolicyInner> getAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        return getWithServiceResponseAsync(resourceGroupName, managedInstanceName, databaseName).map(new Func1<ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner>, ManagedDatabaseSecurityAlertPolicyInner>() {
            @Override
            public ManagedDatabaseSecurityAlertPolicyInner call(ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a managed database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedDatabaseSecurityAlertPolicyInner object
     */
    public Observable<ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner>> getWithServiceResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String securityAlertPolicyName = "default";
        return service.get(resourceGroupName, managedInstanceName, databaseName, securityAlertPolicyName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagedDatabaseSecurityAlertPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagedDatabaseSecurityAlertPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or updates a database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param parameters The database security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagedDatabaseSecurityAlertPolicyInner object if successful.
     */
    public ManagedDatabaseSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String managedInstanceName, String databaseName, ManagedDatabaseSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, databaseName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates a database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param parameters The database security alert policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagedDatabaseSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, String databaseName, ManagedDatabaseSecurityAlertPolicyInner parameters, final ServiceCallback<ManagedDatabaseSecurityAlertPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, databaseName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param parameters The database security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedDatabaseSecurityAlertPolicyInner object
     */
    public Observable<ManagedDatabaseSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, String databaseName, ManagedDatabaseSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, databaseName, parameters).map(new Func1<ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner>, ManagedDatabaseSecurityAlertPolicyInner>() {
            @Override
            public ManagedDatabaseSecurityAlertPolicyInner call(ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a database's security alert policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param parameters The database security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedDatabaseSecurityAlertPolicyInner object
     */
    public Observable<ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String managedInstanceName, String databaseName, ManagedDatabaseSecurityAlertPolicyInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String securityAlertPolicyName = "default";
        return service.createOrUpdate(resourceGroupName, managedInstanceName, databaseName, securityAlertPolicyName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagedDatabaseSecurityAlertPolicyInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagedDatabaseSecurityAlertPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagedDatabaseSecurityAlertPolicyInner>() { }.getType())
                .register(201, new TypeToken<ManagedDatabaseSecurityAlertPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of managed database's security alert policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policies are defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ManagedDatabaseSecurityAlertPolicyInner&gt; object if successful.
     */
    public PagedList<ManagedDatabaseSecurityAlertPolicyInner> listByDatabase(final String resourceGroupName, final String managedInstanceName, final String databaseName) {
        ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>> response = listByDatabaseSinglePageAsync(resourceGroupName, managedInstanceName, databaseName).toBlocking().single();
        return new PagedList<ManagedDatabaseSecurityAlertPolicyInner>(response.body()) {
            @Override
            public Page<ManagedDatabaseSecurityAlertPolicyInner> nextPage(String nextPageLink) {
                return listByDatabaseNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of managed database's security alert policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policies are defined.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ManagedDatabaseSecurityAlertPolicyInner>> listByDatabaseAsync(final String resourceGroupName, final String managedInstanceName, final String databaseName, final ListOperationCallback<ManagedDatabaseSecurityAlertPolicyInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByDatabaseSinglePageAsync(resourceGroupName, managedInstanceName, databaseName),
            new Func1<String, Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>> call(String nextPageLink) {
                    return listByDatabaseNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of managed database's security alert policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policies are defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedDatabaseSecurityAlertPolicyInner&gt; object
     */
    public Observable<Page<ManagedDatabaseSecurityAlertPolicyInner>> listByDatabaseAsync(final String resourceGroupName, final String managedInstanceName, final String databaseName) {
        return listByDatabaseWithServiceResponseAsync(resourceGroupName, managedInstanceName, databaseName)
            .map(new Func1<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>, Page<ManagedDatabaseSecurityAlertPolicyInner>>() {
                @Override
                public Page<ManagedDatabaseSecurityAlertPolicyInner> call(ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of managed database's security alert policies.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policies are defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedDatabaseSecurityAlertPolicyInner&gt; object
     */
    public Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>> listByDatabaseWithServiceResponseAsync(final String resourceGroupName, final String managedInstanceName, final String databaseName) {
        return listByDatabaseSinglePageAsync(resourceGroupName, managedInstanceName, databaseName)
            .concatMap(new Func1<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>, Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>> call(ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByDatabaseNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of managed database's security alert policies.
     *
    ServiceResponse<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>> * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
    ServiceResponse<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>> * @param managedInstanceName The name of the managed instance.
    ServiceResponse<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>> * @param databaseName The name of the managed database for which the security alert policies are defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ManagedDatabaseSecurityAlertPolicyInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>> listByDatabaseSinglePageAsync(final String resourceGroupName, final String managedInstanceName, final String databaseName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByDatabase(resourceGroupName, managedInstanceName, databaseName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>> result = listByDatabaseDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>> listByDatabaseDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of managed database's security alert policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ManagedDatabaseSecurityAlertPolicyInner&gt; object if successful.
     */
    public PagedList<ManagedDatabaseSecurityAlertPolicyInner> listByDatabaseNext(final String nextPageLink) {
        ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>> response = listByDatabaseNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ManagedDatabaseSecurityAlertPolicyInner>(response.body()) {
            @Override
            public Page<ManagedDatabaseSecurityAlertPolicyInner> nextPage(String nextPageLink) {
                return listByDatabaseNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of managed database's security alert policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ManagedDatabaseSecurityAlertPolicyInner>> listByDatabaseNextAsync(final String nextPageLink, final ServiceFuture<List<ManagedDatabaseSecurityAlertPolicyInner>> serviceFuture, final ListOperationCallback<ManagedDatabaseSecurityAlertPolicyInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByDatabaseNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>> call(String nextPageLink) {
                    return listByDatabaseNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of managed database's security alert policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedDatabaseSecurityAlertPolicyInner&gt; object
     */
    public Observable<Page<ManagedDatabaseSecurityAlertPolicyInner>> listByDatabaseNextAsync(final String nextPageLink) {
        return listByDatabaseNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>, Page<ManagedDatabaseSecurityAlertPolicyInner>>() {
                @Override
                public Page<ManagedDatabaseSecurityAlertPolicyInner> call(ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of managed database's security alert policies.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedDatabaseSecurityAlertPolicyInner&gt; object
     */
    public Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>> listByDatabaseNextWithServiceResponseAsync(final String nextPageLink) {
        return listByDatabaseNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>, Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>> call(ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByDatabaseNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of managed database's security alert policies.
     *
    ServiceResponse<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ManagedDatabaseSecurityAlertPolicyInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>> listByDatabaseNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByDatabaseNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>> result = listByDatabaseNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ManagedDatabaseSecurityAlertPolicyInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>> listByDatabaseNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ManagedDatabaseSecurityAlertPolicyInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}