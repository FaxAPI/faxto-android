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

import io.swagger.client.model.InlineResponse2003History;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse2003 {
  
  @SerializedName("status")
  private String status = null;
  @SerializedName("history")
  private List<InlineResponse2003History> history = null;

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
   * The fax jobs requested
   **/
  @ApiModelProperty(value = "The fax jobs requested")
  public List<InlineResponse2003History> getHistory() {
    return history;
  }
  public void setHistory(List<InlineResponse2003History> history) {
    this.history = history;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return (this.status == null ? inlineResponse2003.status == null : this.status.equals(inlineResponse2003.status)) &&
        (this.history == null ? inlineResponse2003.history == null : this.history.equals(inlineResponse2003.history));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.history == null ? 0: this.history.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  history: ").append(history).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
