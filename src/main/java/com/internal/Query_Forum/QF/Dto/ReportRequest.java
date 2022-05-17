/**
 * 
 */
package com.internal.Query_Forum.QF.Dto;

import java.time.Instant;

/**
 * @author Robin
 *
 */
public class ReportRequest {

	private Long id;
	private Long reportTypeId;
	private String reportType;
	private String reason;
	private Long userId;
	private String userName;
	private Long postId;
	private String post;
	private Instant createdOn;
	private Instant updatedOn;

	private String createdTimeAgo;
	private String updatedTimeAgo;
	
	private boolean success;
	private String message;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getReportTypeId() {
		return reportTypeId;
	}

	public void setReportTypeId(Long reportTypeId) {
		this.reportTypeId = reportTypeId;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Instant getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getCreatedTimeAgo() {
		return createdTimeAgo;
	}

	public void setCreatedTimeAgo(String createdTimeAgo) {
		this.createdTimeAgo = createdTimeAgo;
	}

	public String getUpdatedTimeAgo() {
		return updatedTimeAgo;
	}

	public void setUpdatedTimeAgo(String updatedTimeAgo) {
		this.updatedTimeAgo = updatedTimeAgo;
	}

	@Override
	public String toString() {
		return "ReportRequest [id=" + id + ", reportTypeId=" + reportTypeId + ", reportType=" + reportType + ", reason="
				+ reason + ", userId=" + userId + ", userName=" + userName + ", postId=" + postId + ", post=" + post
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", createdTimeAgo=" + createdTimeAgo
				+ ", updatedTimeAgo=" + updatedTimeAgo + "]";
	}

}
