/**
 * 
 */
package com.internal.Query_Forum.QF.Dto;

import java.time.Instant;

/**
 * @author ROBIN RAJESH
 *
 */
public class PostRequest {
	private Long id;
	private String description;
	private Integer voteCount;
	private Long userId;
	private String userName;
	private Instant createdOn;
	private Instant updatedOn;
	private boolean isUserLiked;
	private boolean isUserDisLiked;
	private Long likedVoteCount;
	private Long disLikedVoteCount;
	private String createdTimeAgo;
	private String updatedTimeAgo;
	private int commentCount;
	private int reportCount;
	

	private boolean success;
	private String message;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the voteCount
	 */
	public Integer getVoteCount() {
		return voteCount;
	}

	/**
	 * @param voteCount the voteCount to set
	 */
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the createdOn
	 */
	public Instant getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the updatedOn
	 */
	public Instant getUpdatedOn() {
		return updatedOn;
	}

	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PostRequest [id=" + id + ", description=" + description + ", voteCount=" + voteCount + ", userId="
				+ userId + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", success=" + success
				+ ", message=" + message + "]";
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isUserLiked() {
		return isUserLiked;
	}

	public void setUserLiked(boolean isUserLiked) {
		this.isUserLiked = isUserLiked;
	}

	public boolean isUserDisLiked() {
		return isUserDisLiked;
	}

	public void setUserDisLiked(boolean isUserDisLiked) {
		this.isUserDisLiked = isUserDisLiked;
	}

	public Long getLikedVoteCount() {
		return likedVoteCount;
	}

	public void setLikedVoteCount(Long likedVoteCount) {
		this.likedVoteCount = likedVoteCount;
	}

	public Long getDisLikedVoteCount() {
		return disLikedVoteCount;
	}

	public void setDisLikedVoteCount(Long disLikedVoteCount) {
		this.disLikedVoteCount = disLikedVoteCount;
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

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public int getReportCount() {
		return reportCount;
	}

	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}

}
