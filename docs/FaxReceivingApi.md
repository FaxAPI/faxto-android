# FaxReceivingApi

All URIs are relative to *https://api.fax.to/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**areaCodesCountryCodeStateIdGet**](FaxReceivingApi.md#areaCodesCountryCodeStateIdGet) | **GET** /areacodes/{COUNTRY_CODE}/{STATE_ID} | This API gets a list of countries with its area code
[**countriesCountryCodeDidGroupsGet**](FaxReceivingApi.md#countriesCountryCodeDidGroupsGet) | **GET** /countries/{countryCode}/didgroups | This API gets a list of DID groups
[**countriesGet**](FaxReceivingApi.md#countriesGet) | **GET** /countries | This API gets a list of countries available in the Fax.to coverage
[**incomingFaxesGet**](FaxReceivingApi.md#incomingFaxesGet) | **GET** /incoming-faxes | This API gets a list of incoming faxes
[**incomingFaxesRecipientGet**](FaxReceivingApi.md#incomingFaxesRecipientGet) | **GET** /incoming-faxes/{recipient} | This API gets a list of incoming faxes for a specific recipient
[**numbersGet**](FaxReceivingApi.md#numbersGet) | **GET** /numbers | This API gets a list of numbers to get the current configuration of one or multiple number
[**provisionNumbersGet**](FaxReceivingApi.md#provisionNumbersGet) | **GET** /countries/didgroups/{did_group_id}/provision | This API gets a list of provisioned numbers
[**statesCountryCodeGet**](FaxReceivingApi.md#statesCountryCodeGet) | **GET** /states/{COUNTRY_CODE} | This API gets a list of states of a given country available in the Fax.to coverage


<a name="areaCodesCountryCodeStateIdGet"></a>
# **areaCodesCountryCodeStateIdGet**
> InlineResponse20014 areaCodesCountryCodeStateIdGet(COUNTRY_CODE, STATE_ID, apiKey)

This API gets a list of countries with its area code

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxReceivingApi;

FaxReceivingApi apiInstance = new FaxReceivingApi();
Integer COUNTRY_CODE = 56; // Integer | Indicates the country code in its ISO 3166-1 alpha-3 format
Integer STATE_ID = 56; // Integer | The numerical identifier for the state
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20014 result = apiInstance.areaCodesCountryCodeStateIdGet(COUNTRY_CODE, STATE_ID, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxReceivingApi#areaCodesCountryCodeStateIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **COUNTRY_CODE** | **Integer**| Indicates the country code in its ISO 3166-1 alpha-3 format |
 **STATE_ID** | **Integer**| The numerical identifier for the state |
 **apiKey** | **String**|  |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="countriesCountryCodeDidGroupsGet"></a>
# **countriesCountryCodeDidGroupsGet**
> InlineResponse20015 countriesCountryCodeDidGroupsGet(COUNTRY_CODE, areaCode, apiKey, didGroupIds, stateId, cityNamePattern)

This API gets a list of DID groups

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxReceivingApi;

FaxReceivingApi apiInstance = new FaxReceivingApi();
Integer COUNTRY_CODE = 56; // Integer | Indicates the country code of the DID group in its ISO 3166-1 alpha-3 format
Integer areaCode = 56; // Integer | The area code of the DID group
String apiKey = "apiKey_example"; // String | 
Integer didGroupIds = 56; // Integer | Used to display more information about specific DID groups
Integer stateId = 56; // Integer | The numerical identifier for the didGroup's state
Integer cityNamePattern = 56; // Integer | A string pattern for the beginning of city name
try {
    InlineResponse20015 result = apiInstance.countriesCountryCodeDidGroupsGet(COUNTRY_CODE, areaCode, apiKey, didGroupIds, stateId, cityNamePattern);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxReceivingApi#countriesCountryCodeDidGroupsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **COUNTRY_CODE** | **Integer**| Indicates the country code of the DID group in its ISO 3166-1 alpha-3 format |
 **areaCode** | **Integer**| The area code of the DID group |
 **apiKey** | **String**|  |
 **didGroupIds** | **Integer**| Used to display more information about specific DID groups | [optional]
 **stateId** | **Integer**| The numerical identifier for the didGroup&#39;s state | [optional]
 **cityNamePattern** | **Integer**| A string pattern for the beginning of city name | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="countriesGet"></a>
# **countriesGet**
> InlineResponse20012 countriesGet(apiKey)

This API gets a list of countries available in the Fax.to coverage

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxReceivingApi;

FaxReceivingApi apiInstance = new FaxReceivingApi();
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20012 result = apiInstance.countriesGet(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxReceivingApi#countriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="incomingFaxesGet"></a>
# **incomingFaxesGet**
> InlineResponse2004 incomingFaxesGet(apiKey, limit, page)

This API gets a list of incoming faxes

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxReceivingApi;

FaxReceivingApi apiInstance = new FaxReceivingApi();
String apiKey = "apiKey_example"; // String | 
String limit = "limit_example"; // String | The number of record to return
String page = "page_example"; // String | The page you want to get
try {
    InlineResponse2004 result = apiInstance.incomingFaxesGet(apiKey, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxReceivingApi#incomingFaxesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **limit** | **String**| The number of record to return | [optional]
 **page** | **String**| The page you want to get | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="incomingFaxesRecipientGet"></a>
# **incomingFaxesRecipientGet**
> InlineResponse2004 incomingFaxesRecipientGet(recipient, apiKey, limit, page)

This API gets a list of incoming faxes for a specific recipient

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxReceivingApi;

FaxReceivingApi apiInstance = new FaxReceivingApi();
Integer recipient = 56; // Integer | The recipient's fax number
String apiKey = "apiKey_example"; // String | 
String limit = "limit_example"; // String | The number of record to return
String page = "page_example"; // String | The page you want to get
try {
    InlineResponse2004 result = apiInstance.incomingFaxesRecipientGet(recipient, apiKey, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxReceivingApi#incomingFaxesRecipientGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recipient** | **Integer**| The recipient&#39;s fax number |
 **apiKey** | **String**|  |
 **limit** | **String**| The number of record to return | [optional]
 **page** | **String**| The page you want to get | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="numbersGet"></a>
# **numbersGet**
> InlineResponse20017 numbersGet(apiKey, limit, page)

This API gets a list of numbers to get the current configuration of one or multiple number

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxReceivingApi;

FaxReceivingApi apiInstance = new FaxReceivingApi();
String apiKey = "apiKey_example"; // String | 
String limit = "limit_example"; // String | The number of record to return
String page = "page_example"; // String | The page you want to get
try {
    InlineResponse20017 result = apiInstance.numbersGet(apiKey, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxReceivingApi#numbersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **limit** | **String**| The number of record to return | [optional]
 **page** | **String**| The page you want to get | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="provisionNumbersGet"></a>
# **provisionNumbersGet**
> InlineResponse20016 provisionNumbersGet(didGroupId, apiKey)

This API gets a list of provisioned numbers

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxReceivingApi;

FaxReceivingApi apiInstance = new FaxReceivingApi();
Integer didGroupId = 56; // Integer | The id of the did group
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20016 result = apiInstance.provisionNumbersGet(didGroupId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxReceivingApi#provisionNumbersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **didGroupId** | **Integer**| The id of the did group |
 **apiKey** | **String**|  |

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="statesCountryCodeGet"></a>
# **statesCountryCodeGet**
> InlineResponse20013 statesCountryCodeGet(COUNTRY_CODE, apiKey)

This API gets a list of states of a given country available in the Fax.to coverage

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxReceivingApi;

FaxReceivingApi apiInstance = new FaxReceivingApi();
Integer COUNTRY_CODE = 56; // Integer | Indicates the country code in its ISO 3166-1 alpha-3 format
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20013 result = apiInstance.statesCountryCodeGet(COUNTRY_CODE, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxReceivingApi#statesCountryCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **COUNTRY_CODE** | **Integer**| Indicates the country code in its ISO 3166-1 alpha-3 format |
 **apiKey** | **String**|  |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

