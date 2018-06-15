/**
 * Fax.to REST API client for Android
 * This is Fax.to REST API client for Android.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: inquiries@fax.to
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse20014Areacodes {
  
  @SerializedName("country_code")
  private String countryCode = null;
  @SerializedName("state_id")
  private Integer stateId = null;
  @SerializedName("area_code")
  private String areaCode = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStateId() {
    return stateId;
  }
  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAreaCode() {
    return areaCode;
  }
  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014Areacodes inlineResponse20014Areacodes = (InlineResponse20014Areacodes) o;
    return (this.countryCode == null ? inlineResponse20014Areacodes.countryCode == null : this.countryCode.equals(inlineResponse20014Areacodes.countryCode)) &&
        (this.stateId == null ? inlineResponse20014Areacodes.stateId == null : this.stateId.equals(inlineResponse20014Areacodes.stateId)) &&
        (this.areaCode == null ? inlineResponse20014Areacodes.areaCode == null : this.areaCode.equals(inlineResponse20014Areacodes.areaCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.stateId == null ? 0: this.stateId.hashCode());
    result = 31 * result + (this.areaCode == null ? 0: this.areaCode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014Areacodes {\n");
    
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  stateId: ").append(stateId).append("\n");
    sb.append("  areaCode: ").append(areaCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
