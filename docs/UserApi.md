# UserApi

All URIs are relative to *https://api.fax.to/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**balanceGet**](UserApi.md#balanceGet) | **GET** /balance | This API gets the balance of a user account


<a name="balanceGet"></a>
# **balanceGet**
> InlineResponse2007 balanceGet(apiKey)

This API gets the balance of a user account

### Example
```java
// Import classes:
//import io.swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2007 result = apiInstance.balanceGet(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#balanceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

