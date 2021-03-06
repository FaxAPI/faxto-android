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
public class InlineResponse2009 {
  
  @SerializedName("status")
  private String status = null;
  @SerializedName("user_id")
  private Integer userId = null;
  @SerializedName("created_date")
  private Date createdDate = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("filename")
  private String filename = null;
  @SerializedName("orig_filename")
  private String origFilename = null;
  @SerializedName("preview_file")
  private String previewFile = null;
  @SerializedName("preview_image")
  private String previewImage = null;
  @SerializedName("preview_in_storage")
  private Integer previewInStorage = null;
  @SerializedName("file_extension")
  private String fileExtension = null;
  @SerializedName("filename_uploaded")
  private String filenameUploaded = null;
  @SerializedName("filesize")
  private String filesize = null;
  @SerializedName("s3")
  private Integer s3 = null;
  @SerializedName("server_document_id")
  private Integer serverDocumentId = null;
  @SerializedName("team_user_id")
  private Integer teamUserId = null;
  @SerializedName("total_pages")
  private Integer totalPages = null;
  @SerializedName("updated_at")
  private Date updatedAt = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

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
  public String getOrigFilename() {
    return origFilename;
  }
  public void setOrigFilename(String origFilename) {
    this.origFilename = origFilename;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPreviewFile() {
    return previewFile;
  }
  public void setPreviewFile(String previewFile) {
    this.previewFile = previewFile;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPreviewImage() {
    return previewImage;
  }
  public void setPreviewImage(String previewImage) {
    this.previewImage = previewImage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPreviewInStorage() {
    return previewInStorage;
  }
  public void setPreviewInStorage(Integer previewInStorage) {
    this.previewInStorage = previewInStorage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFileExtension() {
    return fileExtension;
  }
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFilenameUploaded() {
    return filenameUploaded;
  }
  public void setFilenameUploaded(String filenameUploaded) {
    this.filenameUploaded = filenameUploaded;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFilesize() {
    return filesize;
  }
  public void setFilesize(String filesize) {
    this.filesize = filesize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getS3() {
    return s3;
  }
  public void setS3(Integer s3) {
    this.s3 = s3;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getServerDocumentId() {
    return serverDocumentId;
  }
  public void setServerDocumentId(Integer serverDocumentId) {
    this.serverDocumentId = serverDocumentId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTeamUserId() {
    return teamUserId;
  }
  public void setTeamUserId(Integer teamUserId) {
    this.teamUserId = teamUserId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return (this.status == null ? inlineResponse2009.status == null : this.status.equals(inlineResponse2009.status)) &&
        (this.userId == null ? inlineResponse2009.userId == null : this.userId.equals(inlineResponse2009.userId)) &&
        (this.createdDate == null ? inlineResponse2009.createdDate == null : this.createdDate.equals(inlineResponse2009.createdDate)) &&
        (this.id == null ? inlineResponse2009.id == null : this.id.equals(inlineResponse2009.id)) &&
        (this.filename == null ? inlineResponse2009.filename == null : this.filename.equals(inlineResponse2009.filename)) &&
        (this.origFilename == null ? inlineResponse2009.origFilename == null : this.origFilename.equals(inlineResponse2009.origFilename)) &&
        (this.previewFile == null ? inlineResponse2009.previewFile == null : this.previewFile.equals(inlineResponse2009.previewFile)) &&
        (this.previewImage == null ? inlineResponse2009.previewImage == null : this.previewImage.equals(inlineResponse2009.previewImage)) &&
        (this.previewInStorage == null ? inlineResponse2009.previewInStorage == null : this.previewInStorage.equals(inlineResponse2009.previewInStorage)) &&
        (this.fileExtension == null ? inlineResponse2009.fileExtension == null : this.fileExtension.equals(inlineResponse2009.fileExtension)) &&
        (this.filenameUploaded == null ? inlineResponse2009.filenameUploaded == null : this.filenameUploaded.equals(inlineResponse2009.filenameUploaded)) &&
        (this.filesize == null ? inlineResponse2009.filesize == null : this.filesize.equals(inlineResponse2009.filesize)) &&
        (this.s3 == null ? inlineResponse2009.s3 == null : this.s3.equals(inlineResponse2009.s3)) &&
        (this.serverDocumentId == null ? inlineResponse2009.serverDocumentId == null : this.serverDocumentId.equals(inlineResponse2009.serverDocumentId)) &&
        (this.teamUserId == null ? inlineResponse2009.teamUserId == null : this.teamUserId.equals(inlineResponse2009.teamUserId)) &&
        (this.totalPages == null ? inlineResponse2009.totalPages == null : this.totalPages.equals(inlineResponse2009.totalPages)) &&
        (this.updatedAt == null ? inlineResponse2009.updatedAt == null : this.updatedAt.equals(inlineResponse2009.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.createdDate == null ? 0: this.createdDate.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.filename == null ? 0: this.filename.hashCode());
    result = 31 * result + (this.origFilename == null ? 0: this.origFilename.hashCode());
    result = 31 * result + (this.previewFile == null ? 0: this.previewFile.hashCode());
    result = 31 * result + (this.previewImage == null ? 0: this.previewImage.hashCode());
    result = 31 * result + (this.previewInStorage == null ? 0: this.previewInStorage.hashCode());
    result = 31 * result + (this.fileExtension == null ? 0: this.fileExtension.hashCode());
    result = 31 * result + (this.filenameUploaded == null ? 0: this.filenameUploaded.hashCode());
    result = 31 * result + (this.filesize == null ? 0: this.filesize.hashCode());
    result = 31 * result + (this.s3 == null ? 0: this.s3.hashCode());
    result = 31 * result + (this.serverDocumentId == null ? 0: this.serverDocumentId.hashCode());
    result = 31 * result + (this.teamUserId == null ? 0: this.teamUserId.hashCode());
    result = 31 * result + (this.totalPages == null ? 0: this.totalPages.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  filename: ").append(filename).append("\n");
    sb.append("  origFilename: ").append(origFilename).append("\n");
    sb.append("  previewFile: ").append(previewFile).append("\n");
    sb.append("  previewImage: ").append(previewImage).append("\n");
    sb.append("  previewInStorage: ").append(previewInStorage).append("\n");
    sb.append("  fileExtension: ").append(fileExtension).append("\n");
    sb.append("  filenameUploaded: ").append(filenameUploaded).append("\n");
    sb.append("  filesize: ").append(filesize).append("\n");
    sb.append("  s3: ").append(s3).append("\n");
    sb.append("  serverDocumentId: ").append(serverDocumentId).append("\n");
    sb.append("  teamUserId: ").append(teamUserId).append("\n");
    sb.append("  totalPages: ").append(totalPages).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
