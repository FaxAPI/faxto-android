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

import io.swagger.client.model.InlineResponse20014Areacodes;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse20014 {
  
  @SerializedName("status")
  private String status = null;
  @SerializedName("areacodes")
  private List<InlineResponse20014Areacodes> areacodes = null;

  /**
   * The status of the API request
   **/
  @ApiModelProperty(value = "The status of the API request")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Area Codes data
   **/
  @ApiModelProperty(value = "Area Codes data")
  public List<InlineResponse20014Areacodes> getAreacodes() {
    return areacodes;
  }
  public void setAreacodes(List<InlineResponse20014Areacodes> areacodes) {
    this.areacodes = areacodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return (this.status == null ? inlineResponse20014.status == null : this.status.equals(inlineResponse20014.status)) &&
        (this.areacodes == null ? inlineResponse20014.areacodes == null : this.areacodes.equals(inlineResponse20014.areacodes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.areacodes == null ? 0: this.areacodes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  areacodes: ").append(areacodes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
