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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse2008Files {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("filename")
  private String filename = null;
  @SerializedName("pages")
  private Integer pages = null;
  @SerializedName("size")
  private Integer size = null;
  @SerializedName("uploaded")
  private Date uploaded = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPages() {
    return pages;
  }
  public void setPages(Integer pages) {
    this.pages = pages;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getUploaded() {
    return uploaded;
  }
  public void setUploaded(Date uploaded) {
    this.uploaded = uploaded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Files inlineResponse2008Files = (InlineResponse2008Files) o;
    return (this.id == null ? inlineResponse2008Files.id == null : this.id.equals(inlineResponse2008Files.id)) &&
        (this.filename == null ? inlineResponse2008Files.filename == null : this.filename.equals(inlineResponse2008Files.filename)) &&
        (this.pages == null ? inlineResponse2008Files.pages == null : this.pages.equals(inlineResponse2008Files.pages)) &&
        (this.size == null ? inlineResponse2008Files.size == null : this.size.equals(inlineResponse2008Files.size)) &&
        (this.uploaded == null ? inlineResponse2008Files.uploaded == null : this.uploaded.equals(inlineResponse2008Files.uploaded));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.filename == null ? 0: this.filename.hashCode());
    result = 31 * result + (this.pages == null ? 0: this.pages.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    result = 31 * result + (this.uploaded == null ? 0: this.uploaded.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Files {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  filename: ").append(filename).append("\n");
    sb.append("  pages: ").append(pages).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  uploaded: ").append(uploaded).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}