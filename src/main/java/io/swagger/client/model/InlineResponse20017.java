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

import io.swagger.client.model.InlineResponse20017Numbers;
import io.swagger.client.model.InlineResponse2004Meta;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse20017 {
  
  @SerializedName("status")
  private String status = null;
  @SerializedName("numbers")
  private List<InlineResponse20017Numbers> numbers = null;
  @SerializedName("meta")
  private InlineResponse2004Meta meta = null;

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
   * Numbers data
   **/
  @ApiModelProperty(value = "Numbers data")
  public List<InlineResponse20017Numbers> getNumbers() {
    return numbers;
  }
  public void setNumbers(List<InlineResponse20017Numbers> numbers) {
    this.numbers = numbers;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2004Meta getMeta() {
    return meta;
  }
  public void setMeta(InlineResponse2004Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20017 inlineResponse20017 = (InlineResponse20017) o;
    return (this.status == null ? inlineResponse20017.status == null : this.status.equals(inlineResponse20017.status)) &&
        (this.numbers == null ? inlineResponse20017.numbers == null : this.numbers.equals(inlineResponse20017.numbers)) &&
        (this.meta == null ? inlineResponse20017.meta == null : this.meta.equals(inlineResponse20017.meta));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.numbers == null ? 0: this.numbers.hashCode());
    result = 31 * result + (this.meta == null ? 0: this.meta.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017 {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  numbers: ").append(numbers).append("\n");
    sb.append("  meta: ").append(meta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
