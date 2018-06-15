# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.FaxReceivingApi;

public class FaxReceivingApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.fax.to/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FaxReceivingApi* | [**areaCodesCountryCodeStateIdGet**](docs/FaxReceivingApi.md#areaCodesCountryCodeStateIdGet) | **GET** /areacodes/{COUNTRY_CODE}/{STATE_ID} | This API gets a list of countries with its area code
*FaxReceivingApi* | [**countriesCountryCodeDidGroupsGet**](docs/FaxReceivingApi.md#countriesCountryCodeDidGroupsGet) | **GET** /countries/{countryCode}/didgroups | This API gets a list of DID groups
*FaxReceivingApi* | [**countriesGet**](docs/FaxReceivingApi.md#countriesGet) | **GET** /countries | This API gets a list of countries available in the Fax.to coverage
*FaxReceivingApi* | [**incomingFaxesGet**](docs/FaxReceivingApi.md#incomingFaxesGet) | **GET** /incoming-faxes | This API gets a list of incoming faxes
*FaxReceivingApi* | [**incomingFaxesRecipientGet**](docs/FaxReceivingApi.md#incomingFaxesRecipientGet) | **GET** /incoming-faxes/{recipient} | This API gets a list of incoming faxes for a specific recipient
*FaxReceivingApi* | [**numbersGet**](docs/FaxReceivingApi.md#numbersGet) | **GET** /numbers | This API gets a list of numbers to get the current configuration of one or multiple number
*FaxReceivingApi* | [**provisionNumbersGet**](docs/FaxReceivingApi.md#provisionNumbersGet) | **GET** /countries/didgroups/{did_group_id}/provision | This API gets a list of provisioned numbers
*FaxReceivingApi* | [**statesCountryCodeGet**](docs/FaxReceivingApi.md#statesCountryCodeGet) | **GET** /states/{COUNTRY_CODE} | This API gets a list of states of a given country available in the Fax.to coverage
*FaxSendingApi* | [**faxDocumentIdCostsGet**](docs/FaxSendingApi.md#faxDocumentIdCostsGet) | **GET** /fax/{document_id}/costs | This API is for computing the cost of the fax to be sent
*FaxSendingApi* | [**faxHistoryGet**](docs/FaxSendingApi.md#faxHistoryGet) | **GET** /fax-history | This API gets the history of a fax
*FaxSendingApi* | [**faxJobIdStatusGet**](docs/FaxSendingApi.md#faxJobIdStatusGet) | **GET** /fax/{fax_job_id}/status | This API gets the status of a fax
*FaxSendingApi* | [**faxPost**](docs/FaxSendingApi.md#faxPost) | **POST** /fax | This API is for sending a new fax in any fax numbers anywhere in the world
*FaxSendingApi* | [**fileCleanGet**](docs/FaxSendingApi.md#fileCleanGet) | **GET** /file-clean | This API is used for cleaning a document
*FaxSendingApi* | [**fileGeneratePreviewGet**](docs/FaxSendingApi.md#fileGeneratePreviewGet) | **GET** /file-generate-preview | This API generates a preview of a document
*FaxSendingApi* | [**filesDocumentIDDelete**](docs/FaxSendingApi.md#filesDocumentIDDelete) | **DELETE** /files/{document_id} | This API deletes a document
*FaxSendingApi* | [**filesGet**](docs/FaxSendingApi.md#filesGet) | **GET** /files | This API gets all the files of a certain user
*UserApi* | [**balanceGet**](docs/UserApi.md#balanceGet) | **GET** /balance | This API gets the balance of a user account
*UserManagementApi* | [**subUserPost**](docs/UserManagementApi.md#subUserPost) | **POST** /subuser | This API creates a subuser
*UserManagementApi* | [**userLoginPost**](docs/UserManagementApi.md#userLoginPost) | **POST** /user/login | This API is used for logging in on an existing user account
*UserManagementApi* | [**userPost**](docs/UserManagementApi.md#userPost) | **POST** /user | This API registers a new user account


## Documentation for Models

 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20012Data](docs/InlineResponse20012Data.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20013States](docs/InlineResponse20013States.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse20014Areacodes](docs/InlineResponse20014Areacodes.md)
 - [InlineResponse20015](docs/InlineResponse20015.md)
 - [InlineResponse20015Data](docs/InlineResponse20015Data.md)
 - [InlineResponse20016](docs/InlineResponse20016.md)
 - [InlineResponse20016Data](docs/InlineResponse20016Data.md)
 - [InlineResponse20017](docs/InlineResponse20017.md)
 - [InlineResponse20017Numbers](docs/InlineResponse20017Numbers.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2003Created](docs/InlineResponse2003Created.md)
 - [InlineResponse2003History](docs/InlineResponse2003History.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2004Inbox](docs/InlineResponse2004Inbox.md)
 - [InlineResponse2004Meta](docs/InlineResponse2004Meta.md)
 - [InlineResponse2004MetaPagination](docs/InlineResponse2004MetaPagination.md)
 - [InlineResponse2004MetaPaginationLinks](docs/InlineResponse2004MetaPaginationLinks.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2008Files](docs/InlineResponse2008Files.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse400](docs/InlineResponse400.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

inquiries@fax.to

