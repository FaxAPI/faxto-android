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

import io.swagger.client.model.InlineResponse20013States;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse20013 {
  
  @SerializedName("status")
  private String status = null;
  @SerializedName("states")
  private List<InlineResponse20013States> states = null;

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
   * States data
   **/
  @ApiModelProperty(value = "States data")
  public List<InlineResponse20013States> getStates() {
    return states;
  }
  public void setStates(List<InlineResponse20013States> states) {
    this.states = states;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013 inlineResponse20013 = (InlineResponse20013) o;
    return (this.status == null ? inlineResponse20013.status == null : this.status.equals(inlineResponse20013.status)) &&
        (this.states == null ? inlineResponse20013.states == null : this.states.equals(inlineResponse20013.states));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.states == null ? 0: this.states.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013 {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  states: ").append(states).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
