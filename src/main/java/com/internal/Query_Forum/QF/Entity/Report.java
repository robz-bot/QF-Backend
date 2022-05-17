/**
 * 
 */
package com.internal.Query_Forum.QF.Entity;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Robin
 *
 */
@Document
public class Report {
	@Transient
	public static final String SEQUENCE_NAME = "report";

	@Id
	private Long id;
	private Long reportTypeId;
	private String reason;
	private Long userId;
	private Long postId;
	private Instant createdOn;
	private Instant updatedOn;

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

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
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

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", reportTypeId=" + reportTypeId + ", reason=" + reason + ", userId=" + userId
				+ ", postId=" + postId + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}

}
