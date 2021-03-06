/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Operations.
 */
public class OperationsInner {
    /** The Retrofit service to perform REST calls. */
    private OperationsService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_12_01.Operations listByTags" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/apis/{apiId}/operationsByTags")
        Observable<Response<ResponseBody>> listByTags(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("apiId") String apiId, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("$skip") Integer skip, @Query("includeNotTaggedOperations") Boolean includeNotTaggedOperations, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_12_01.Operations listByTagsNext" })
        @GET
        Observable<Response<ResponseBody>> listByTagsNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TagResourceContractInner&gt; object if successful.
     */
    public PagedList<TagResourceContractInner> listByTags(final String resourceGroupName, final String serviceName, final String apiId) {
        ServiceResponse<Page<TagResourceContractInner>> response = listByTagsSinglePageAsync(resourceGroupName, serviceName, apiId).toBlocking().single();
        return new PagedList<TagResourceContractInner>(response.body()) {
            @Override
            public Page<TagResourceContractInner> nextPage(String nextPageLink) {
                return listByTagsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<TagResourceContractInner>> listByTagsAsync(final String resourceGroupName, final String serviceName, final String apiId, final ListOperationCallback<TagResourceContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByTagsSinglePageAsync(resourceGroupName, serviceName, apiId),
            new Func1<String, Observable<ServiceResponse<Page<TagResourceContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagResourceContractInner>>> call(String nextPageLink) {
                    return listByTagsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TagResourceContractInner&gt; object
     */
    public Observable<Page<TagResourceContractInner>> listByTagsAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        return listByTagsWithServiceResponseAsync(resourceGroupName, serviceName, apiId)
            .map(new Func1<ServiceResponse<Page<TagResourceContractInner>>, Page<TagResourceContractInner>>() {
                @Override
                public Page<TagResourceContractInner> call(ServiceResponse<Page<TagResourceContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TagResourceContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<TagResourceContractInner>>> listByTagsWithServiceResponseAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        return listByTagsSinglePageAsync(resourceGroupName, serviceName, apiId)
            .concatMap(new Func1<ServiceResponse<Page<TagResourceContractInner>>, Observable<ServiceResponse<Page<TagResourceContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagResourceContractInner>>> call(ServiceResponse<Page<TagResourceContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByTagsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;TagResourceContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<TagResourceContractInner>>> listByTagsSinglePageAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (apiId == null) {
            throw new IllegalArgumentException("Parameter apiId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        final Integer top = null;
        final Integer skip = null;
        final Boolean includeNotTaggedOperations = null;
        return service.listByTags(resourceGroupName, serviceName, apiId, this.client.subscriptionId(), filter, top, skip, includeNotTaggedOperations, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<TagResourceContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagResourceContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<TagResourceContractInner>> result = listByTagsDelegate(response);
                        return Observable.just(new ServiceResponse<Page<TagResourceContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| apiName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param includeNotTaggedOperations Include not tagged Operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TagResourceContractInner&gt; object if successful.
     */
    public PagedList<TagResourceContractInner> listByTags(final String resourceGroupName, final String serviceName, final String apiId, final String filter, final Integer top, final Integer skip, final Boolean includeNotTaggedOperations) {
        ServiceResponse<Page<TagResourceContractInner>> response = listByTagsSinglePageAsync(resourceGroupName, serviceName, apiId, filter, top, skip, includeNotTaggedOperations).toBlocking().single();
        return new PagedList<TagResourceContractInner>(response.body()) {
            @Override
            public Page<TagResourceContractInner> nextPage(String nextPageLink) {
                return listByTagsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| apiName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param includeNotTaggedOperations Include not tagged Operations.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<TagResourceContractInner>> listByTagsAsync(final String resourceGroupName, final String serviceName, final String apiId, final String filter, final Integer top, final Integer skip, final Boolean includeNotTaggedOperations, final ListOperationCallback<TagResourceContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByTagsSinglePageAsync(resourceGroupName, serviceName, apiId, filter, top, skip, includeNotTaggedOperations),
            new Func1<String, Observable<ServiceResponse<Page<TagResourceContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagResourceContractInner>>> call(String nextPageLink) {
                    return listByTagsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| apiName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param includeNotTaggedOperations Include not tagged Operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TagResourceContractInner&gt; object
     */
    public Observable<Page<TagResourceContractInner>> listByTagsAsync(final String resourceGroupName, final String serviceName, final String apiId, final String filter, final Integer top, final Integer skip, final Boolean includeNotTaggedOperations) {
        return listByTagsWithServiceResponseAsync(resourceGroupName, serviceName, apiId, filter, top, skip, includeNotTaggedOperations)
            .map(new Func1<ServiceResponse<Page<TagResourceContractInner>>, Page<TagResourceContractInner>>() {
                @Override
                public Page<TagResourceContractInner> call(ServiceResponse<Page<TagResourceContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| apiName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param includeNotTaggedOperations Include not tagged Operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TagResourceContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<TagResourceContractInner>>> listByTagsWithServiceResponseAsync(final String resourceGroupName, final String serviceName, final String apiId, final String filter, final Integer top, final Integer skip, final Boolean includeNotTaggedOperations) {
        return listByTagsSinglePageAsync(resourceGroupName, serviceName, apiId, filter, top, skip, includeNotTaggedOperations)
            .concatMap(new Func1<ServiceResponse<Page<TagResourceContractInner>>, Observable<ServiceResponse<Page<TagResourceContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagResourceContractInner>>> call(ServiceResponse<Page<TagResourceContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByTagsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists a collection of operations associated with tags.
     *
    ServiceResponse<PageImpl<TagResourceContractInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<TagResourceContractInner>> * @param serviceName The name of the API Management service.
    ServiceResponse<PageImpl<TagResourceContractInner>> * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
    ServiceResponse<PageImpl<TagResourceContractInner>> * @param filter |   Field     |     Usage     |     Supported operators     |     Supported functions     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| displayName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| apiName | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| description | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| method | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;| urlTemplate | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith | &lt;/br&gt;
    ServiceResponse<PageImpl<TagResourceContractInner>> * @param top Number of records to return.
    ServiceResponse<PageImpl<TagResourceContractInner>> * @param skip Number of records to skip.
    ServiceResponse<PageImpl<TagResourceContractInner>> * @param includeNotTaggedOperations Include not tagged Operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;TagResourceContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<TagResourceContractInner>>> listByTagsSinglePageAsync(final String resourceGroupName, final String serviceName, final String apiId, final String filter, final Integer top, final Integer skip, final Boolean includeNotTaggedOperations) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (apiId == null) {
            throw new IllegalArgumentException("Parameter apiId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByTags(resourceGroupName, serviceName, apiId, this.client.subscriptionId(), filter, top, skip, includeNotTaggedOperations, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<TagResourceContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagResourceContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<TagResourceContractInner>> result = listByTagsDelegate(response);
                        return Observable.just(new ServiceResponse<Page<TagResourceContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<TagResourceContractInner>> listByTagsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<TagResourceContractInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<TagResourceContractInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TagResourceContractInner&gt; object if successful.
     */
    public PagedList<TagResourceContractInner> listByTagsNext(final String nextPageLink) {
        ServiceResponse<Page<TagResourceContractInner>> response = listByTagsNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<TagResourceContractInner>(response.body()) {
            @Override
            public Page<TagResourceContractInner> nextPage(String nextPageLink) {
                return listByTagsNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<TagResourceContractInner>> listByTagsNextAsync(final String nextPageLink, final ServiceFuture<List<TagResourceContractInner>> serviceFuture, final ListOperationCallback<TagResourceContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByTagsNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<TagResourceContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagResourceContractInner>>> call(String nextPageLink) {
                    return listByTagsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TagResourceContractInner&gt; object
     */
    public Observable<Page<TagResourceContractInner>> listByTagsNextAsync(final String nextPageLink) {
        return listByTagsNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<TagResourceContractInner>>, Page<TagResourceContractInner>>() {
                @Override
                public Page<TagResourceContractInner> call(ServiceResponse<Page<TagResourceContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists a collection of operations associated with tags.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TagResourceContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<TagResourceContractInner>>> listByTagsNextWithServiceResponseAsync(final String nextPageLink) {
        return listByTagsNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<TagResourceContractInner>>, Observable<ServiceResponse<Page<TagResourceContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagResourceContractInner>>> call(ServiceResponse<Page<TagResourceContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByTagsNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists a collection of operations associated with tags.
     *
    ServiceResponse<PageImpl<TagResourceContractInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;TagResourceContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<TagResourceContractInner>>> listByTagsNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByTagsNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<TagResourceContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagResourceContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<TagResourceContractInner>> result = listByTagsNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<TagResourceContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<TagResourceContractInner>> listByTagsNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<TagResourceContractInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<TagResourceContractInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
