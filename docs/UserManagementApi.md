# UserManagementApi

All URIs are relative to *https://api.fax.to/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subUserPost**](UserManagementApi.md#subUserPost) | **POST** /subuser | This API creates a subuser
[**userLoginPost**](UserManagementApi.md#userLoginPost) | **POST** /user/login | This API is used for logging in on an existing user account
[**userPost**](UserManagementApi.md#userPost) | **POST** /user | This API registers a new user account


<a name="subUserPost"></a>
# **subUserPost**
> InlineResponse2006 subUserPost(email, password, apiKey)

This API creates a subuser

### Example
```java
// Import classes:
//import io.swagger.client.api.UserManagementApi;

UserManagementApi apiInstance = new UserManagementApi();
 email = new null(); //  | The unique email of the user
 password = new null(); //  | The password of the subuser
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2006 result = apiInstance.subUserPost(email, password, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#subUserPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | [****](.md)| The unique email of the user |
 **password** | [****](.md)| The password of the subuser |
 **apiKey** | **String**|  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="userLoginPost"></a>
# **userLoginPost**
> InlineResponse2005 userLoginPost(email, password)

This API is used for logging in on an existing user account

### Example
```java
// Import classes:
//import io.swagger.client.api.UserManagementApi;

UserManagementApi apiInstance = new UserManagementApi();
 email = new null(); //  | The unique email of the user
 password = new null(); //  | The password of the user
try {
    InlineResponse2005 result = apiInstance.userLoginPost(email, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#userLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | [****](.md)| The unique email of the user |
 **password** | [****](.md)| The password of the user |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="userPost"></a>
# **userPost**
> InlineResponse2005 userPost(email, password)

This API registers a new user account

### Example
```java
// Import classes:
//import io.swagger.client.api.UserManagementApi;

UserManagementApi apiInstance = new UserManagementApi();
 email = new null(); //  | The unique email of the user
 password = new null(); //  | The password of the user
try {
    InlineResponse2005 result = apiInstance.userPost(email, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#userPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | [****](.md)| The unique email of the user |
 **password** | [****](.md)| The password of the user |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

