# FaxSendingApi

All URIs are relative to *https://api.fax.to/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**faxDocumentIdCostsGet**](FaxSendingApi.md#faxDocumentIdCostsGet) | **GET** /fax/{document_id}/costs | This API is for computing the cost of the fax to be sent
[**faxHistoryGet**](FaxSendingApi.md#faxHistoryGet) | **GET** /fax-history | This API gets the history of a fax
[**faxJobIdStatusGet**](FaxSendingApi.md#faxJobIdStatusGet) | **GET** /fax/{fax_job_id}/status | This API gets the status of a fax
[**faxPost**](FaxSendingApi.md#faxPost) | **POST** /fax | This API is for sending a new fax in any fax numbers anywhere in the world
[**fileCleanGet**](FaxSendingApi.md#fileCleanGet) | **GET** /file-clean | This API is used for cleaning a document
[**fileGeneratePreviewGet**](FaxSendingApi.md#fileGeneratePreviewGet) | **GET** /file-generate-preview | This API generates a preview of a document
[**filesDocumentIDDelete**](FaxSendingApi.md#filesDocumentIDDelete) | **DELETE** /files/{document_id} | This API deletes a document
[**filesGet**](FaxSendingApi.md#filesGet) | **GET** /files | This API gets all the files of a certain user


<a name="faxDocumentIdCostsGet"></a>
# **faxDocumentIdCostsGet**
> InlineResponse2001 faxDocumentIdCostsGet(documentId, apiKey, faxNumber)

This API is for computing the cost of the fax to be sent

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxSendingApi;

FaxSendingApi apiInstance = new FaxSendingApi();
Integer documentId = 56; // Integer | The id of the document to be sent
String apiKey = "apiKey_example"; // String | 
String faxNumber = "faxNumber_example"; // String | The fax number of the recipient
try {
    InlineResponse2001 result = apiInstance.faxDocumentIdCostsGet(documentId, apiKey, faxNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxSendingApi#faxDocumentIdCostsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **Integer**| The id of the document to be sent |
 **apiKey** | **String**|  |
 **faxNumber** | **String**| The fax number of the recipient | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="faxHistoryGet"></a>
# **faxHistoryGet**
> InlineResponse2003 faxHistoryGet(apiKey, limit, page)

This API gets the history of a fax

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxSendingApi;

FaxSendingApi apiInstance = new FaxSendingApi();
String apiKey = "apiKey_example"; // String | 
String limit = "limit_example"; // String | The number of record to return
String page = "page_example"; // String | The page you want to get
try {
    InlineResponse2003 result = apiInstance.faxHistoryGet(apiKey, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxSendingApi#faxHistoryGet");
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

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="faxJobIdStatusGet"></a>
# **faxJobIdStatusGet**
> InlineResponse2002 faxJobIdStatusGet(faxJobId, apiKey)

This API gets the status of a fax

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxSendingApi;

FaxSendingApi apiInstance = new FaxSendingApi();
Integer faxJobId = 56; // Integer | The id of the fax job
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.faxJobIdStatusGet(faxJobId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxSendingApi#faxJobIdStatusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faxJobId** | **Integer**| The id of the fax job |
 **apiKey** | **String**|  |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="faxPost"></a>
# **faxPost**
> InlineResponse200 faxPost(faxNumber, documentId, apiKey)

This API is for sending a new fax in any fax numbers anywhere in the world

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxSendingApi;

FaxSendingApi apiInstance = new FaxSendingApi();
 faxNumber = new null(); //  | The fax number of the recipient
 documentId = new null(); //  | The id of the document to be sent
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse200 result = apiInstance.faxPost(faxNumber, documentId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxSendingApi#faxPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faxNumber** | [****](.md)| The fax number of the recipient |
 **documentId** | [****](.md)| The id of the document to be sent |
 **apiKey** | **String**|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="fileCleanGet"></a>
# **fileCleanGet**
> InlineResponse2009 fileCleanGet(documentId, apiKey)

This API is used for cleaning a document

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxSendingApi;

FaxSendingApi apiInstance = new FaxSendingApi();
Integer documentId = 56; // Integer | The id of the document
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse2009 result = apiInstance.fileCleanGet(documentId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxSendingApi#fileCleanGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **Integer**| The id of the document |
 **apiKey** | **String**|  |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="fileGeneratePreviewGet"></a>
# **fileGeneratePreviewGet**
> InlineResponse20010 fileGeneratePreviewGet(documentId, apiKey)

This API generates a preview of a document

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxSendingApi;

FaxSendingApi apiInstance = new FaxSendingApi();
Integer documentId = 56; // Integer | The id of the document
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20010 result = apiInstance.fileGeneratePreviewGet(documentId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxSendingApi#fileGeneratePreviewGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **Integer**| The id of the document |
 **apiKey** | **String**|  |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="filesDocumentIDDelete"></a>
# **filesDocumentIDDelete**
> InlineResponse20011 filesDocumentIDDelete(documentId, apiKey)

This API deletes a document

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxSendingApi;

FaxSendingApi apiInstance = new FaxSendingApi();
Integer documentId = 56; // Integer | The id of the document
String apiKey = "apiKey_example"; // String | 
try {
    InlineResponse20011 result = apiInstance.filesDocumentIDDelete(documentId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxSendingApi#filesDocumentIDDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **Integer**| The id of the document |
 **apiKey** | **String**|  |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="filesGet"></a>
# **filesGet**
> InlineResponse2008 filesGet(apiKey, limit, page)

This API gets all the files of a certain user

### Example
```java
// Import classes:
//import io.swagger.client.api.FaxSendingApi;

FaxSendingApi apiInstance = new FaxSendingApi();
String apiKey = "apiKey_example"; // String | 
String limit = "limit_example"; // String | The number of record to return
String page = "page_example"; // String | The page you want to get
try {
    InlineResponse2008 result = apiInstance.filesGet(apiKey, limit, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaxSendingApi#filesGet");
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

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

