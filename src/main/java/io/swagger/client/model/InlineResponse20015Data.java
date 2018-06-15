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
public class InlineResponse20015Data {
  
  @SerializedName("did_group_id")
  private Integer didGroupId = null;
  @SerializedName("area_code")
  private String areaCode = null;
  @SerializedName("city_name")
  private String cityName = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDidGroupId() {
    return didGroupId;
  }
  public void setDidGroupId(Integer didGroupId) {
    this.didGroupId = didGroupId;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCityName() {
    return cityName;
  }
  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015Data inlineResponse20015Data = (InlineResponse20015Data) o;
    return (this.didGroupId == null ? inlineResponse20015Data.didGroupId == null : this.didGroupId.equals(inlineResponse20015Data.didGroupId)) &&
        (this.areaCode == null ? inlineResponse20015Data.areaCode == null : this.areaCode.equals(inlineResponse20015Data.areaCode)) &&
        (this.cityName == null ? inlineResponse20015Data.cityName == null : this.cityName.equals(inlineResponse20015Data.cityName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.didGroupId == null ? 0: this.didGroupId.hashCode());
    result = 31 * result + (this.areaCode == null ? 0: this.areaCode.hashCode());
    result = 31 * result + (this.cityName == null ? 0: this.cityName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015Data {\n");
    
    sb.append("  didGroupId: ").append(didGroupId).append("\n");
    sb.append("  areaCode: ").append(areaCode).append("\n");
    sb.append("  cityName: ").append(cityName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}